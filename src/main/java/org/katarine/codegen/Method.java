package org.katarine.codegen;

import org.katarine.katlan.lib.struct.Pair;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@SuppressWarnings("unchecked")
public class Method implements Member, Accessible, Caller {
    private final ClassGenerator owner;
    private final String name;
    private final List<Type> parameterTypes = new ArrayList<>();
    private final List<String> parameterNames = new ArrayList<>();
    private final Type returnType;
    private final Signature signature;

    private int modifiers = Opcodes.ACC_PUBLIC;
    private final Supplier<MethodVisitor> mvProvider;

    // lazy initialization because of methodscope constructor
    private MethodScope ms;
    private final Supplier<MethodScope> mainScope = new Supplier<>() {
        @Override
        public MethodScope get() {
            if (ms!=null) return ms;
            return ms = new MethodScope(Method.this);
        }
    };
    private final ArrayList<Consumer<MethodVisitor>> opQueue = new ArrayList<>();

    private boolean isStatic = false;
    private boolean isFinal = false;
    private boolean isPublic = false;
    private boolean isPrivate = false;
    private boolean isProtected = false;
    private boolean isAbstract = false;

    public MethodType getMethodType() {
        if (isStatic()) return MethodType.STATIC;
        if (isPrivate()) return MethodType.SPECIAL;
        if (owner.isInterface()) return MethodType.INTERFACE;
        return MethodType.VIRTUAL;
    }

    private HashMap<String, Type> cachedParameters;

    public Method(ClassGenerator owner, String name, Signature signature, Type returnType, Pair<String, Type>[] parameters) {
        this.owner = owner;
        this.name = name;
        this.parameterNames.addAll(Arrays.stream(parameters).map(Pair::getA).toList());
        this.parameterTypes.addAll(Arrays.stream(parameters).map(Pair::getB).toList());
        this.returnType = returnType;
        this.signature = signature;
        this.mvProvider = () -> owner.getClassWriter().visitMethod(modifiers, name, getDescriptor(), signature.getSignature(), null);
    }

    public Method(ClassGenerator owner, String name, Signature signature, Type returnType, Type... parameterTypes) {
        this(owner, name, signature, returnType, createParameterPairs(parameterTypes));
    }

    public Method(ClassGenerator owner, String name, String signature, Type returnType, Pair<String, Type>[] parameters) {
        this(owner, name, new Signature(signature), returnType, parameters);
    }

    public Method(ClassGenerator owner, String name, String signature, Type returnType, Type... parameterTypes) {
        this(owner, name, new Signature(signature), returnType, createParameterPairs(parameterTypes));
    }

    private static Pair<String, Type>[] createParameterPairs(Type... parameterTypes) {
        Pair<String, Type>[] parameters = new Pair[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            parameters[i] = new Pair<>("var" + i, parameterTypes[i]);
        }
        return parameters;
    }

    void addInsn(Consumer<MethodVisitor> insn) {
        this.opQueue.add(insn);
    }

    void addInsns(List<Consumer<MethodVisitor>> insns) {
        this.opQueue.addAll(insns);
    }

    public Variable var(Type type, String name) {
        return mainScope.get().createVariable(type, name);
    }

    private Variable this_ = null;
    public Variable this_() {
        if (this_ != null) return this_;
        this_ = new Variable(owner.getType(), "this", mainScope.get(), this, 0);
        return this_;
    }

    private Variable super_ = null;
    public Variable super_() {
        if (super_ != null) return super_;
        super_ = new Variable(owner.getSuperType(), "super", mainScope.get(), this, 0);
        return super_;
    }

    public void return_() {
        opQueue.add(mv -> mv.visitInsn(Opcodes.RETURN));
    }

    public String getDescriptor() {
        String paramDescriptors = parameterTypes.stream().map(Type::getDescriptor).collect(Collectors.joining());
        return "(" + paramDescriptors + ")" + returnType.getDescriptor();
    }

    public ClassGenerator getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public Signature getSignature() {
        return signature;
    }

    public List<Type> getParameterTypes() {
        return new ArrayList<>(parameterTypes);
    }

    public HashMap<String, Type> getParameters() {
        if (cachedParameters == null || cachedParameters.size() != parameterTypes.size()) {
            cachedParameters = new HashMap<>();
            for (int i = 0; i < parameterTypes.size(); i++) {
                cachedParameters.put(parameterNames.get(i), parameterTypes.get(i));
            }
        }
        return cachedParameters;
    }

    @Override
    public void end() {
        MethodVisitor mv = mvProvider.get();
        opQueue.addLast(visitor -> visitor.visitMaxs(0, 0));
        opQueue.forEach(op -> op.accept(mv));
    }

    @Override
    public boolean isStatic() { return isStatic; }
    @Override
    public boolean isFinal() { return isFinal; }
    @Override
    public boolean isPublic() { return isPublic; }
    @Override
    public boolean isPrivate() { return isPrivate; }
    @Override
    public boolean isProtected() { return isProtected; }
    @Override
    public boolean isAbstract() { return isAbstract; }

    @Override
    public <T extends Accessible> T static_() {
        this.modifiers |= Opcodes.ACC_STATIC;
        this.isStatic = true;
        return (T) this;
    }

    @Override
    public <T extends Accessible> T final_() {
        this.modifiers |= Opcodes.ACC_FINAL;
        this.isFinal = true;
        return (T) this;
    }

    @Override
    public <T extends Accessible> T public_() {
        this.modifiers |= Opcodes.ACC_PUBLIC;
        this.isPublic = true;
        return (T) this;
    }

    @Override
    public <T extends Accessible> T private_() {
        this.modifiers |= Opcodes.ACC_PRIVATE;
        this.isPrivate = true;
        return (T) this;
    }

    @Override
    public <T extends Accessible> T protected_() {
        this.modifiers |= Opcodes.ACC_PROTECTED;
        this.isProtected = true;
        return (T) this;
    }

    @Override
    public <T extends Accessible> T abstract_() {
        this.modifiers |= Opcodes.ACC_ABSTRACT;
        this.isAbstract = true;
        return (T) this;
    }

    @Override
    public void invokeVoid(MethodType type, String name, Object[] arguments) {
        invoke(Type.VOID, type, name, arguments);
    }

    @Override
    public Variable invoke(Type returnType, MethodType methodType, String name, Object[] arguments) {
        final ArrayList<Consumer<MethodVisitor>> instructions = new ArrayList<>();
        if (methodType != MethodType.STATIC)
            instructions.add(mv -> {
                mv.visitVarInsn(Opcodes.ALOAD, 0);
            });
        for (var arg : arguments) {
            instructions.addAll(Utils.handleObject(arg));
        }

        switch (methodType) {
            case STATIC -> {

            }
            case VIRTUAL -> {
                instructions.add(mv -> {
                    mv.visitMethodInsn(
                            Opcodes.INVOKEVIRTUAL,
                            this.getOwner().getType().getInternalName(),
                            name,
                            Utils.getMethodDescriptor(arguments, Type.VOID),
                            false
                    );
                });
            }
            case SPECIAL -> {
                instructions.add(mv -> {
                    mv.visitMethodInsn(
                            Opcodes.INVOKESPECIAL,
                            this.getOwner().getType().getInternalName(),
                            name,
                            Utils.getMethodDescriptor(arguments, Type.VOID),
                            false
                    );
                });
            }
        }

        addInsns(instructions);

        if (returnType == Type.VOID) {
            return null;
        }

        var ret = var(returnType, name+"_ret"+"_"+0);
        addInsn(mv -> mv.visitVarInsn(ret.getType().getStoreCode(), ret.getIndex()));
        return ret;
    }

    public Type getReturnType() {
        return returnType;
    }
}