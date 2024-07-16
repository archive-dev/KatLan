package org.katarine.codegen;

import org.katarine.katlan.lib.struct.Pair;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

@SuppressWarnings("unchecked")
public class Method implements Member, Accessible {
    private final ClassGenerator owner;

    private final String name;
    private final ArrayList<Type> parameterTypes = new ArrayList<>();
    private final ArrayList<String> parameterNames = new ArrayList<>();
    private final Type returnType;
    private final Signature signature;

    private int modifiers = Opcodes.ACC_PUBLIC;

    private final Supplier<MethodVisitor> mvProvider;

    private final ArrayList<Consumer<MethodVisitor>> opQueue = new ArrayList<>();

    private final MethodScope mainScope = new MethodScope(this);

    public Method(ClassGenerator owner, String name, String signature, Type returnType, Type... parameterTypes) {
        this(owner, name, new Signature(signature), returnType, parameterTypes);
    }


    public Method(ClassGenerator owner, String name, String signature, Type returnType, Pair<String, Type>[] parameters) {
        this(owner, name, new Signature(signature), returnType, parameters);
    }

    public Method(ClassGenerator owner, String name, Signature signature, Type returnType, Pair<String, Type>[] parameters) {
        this.owner = owner;
        this.name = name;
        this.parameterNames.addAll(Arrays.stream(parameters).map(Pair::getA).toList());
        this.parameterTypes.addAll(Arrays.stream(parameters).map(Pair::getB).toList());
        this.returnType = returnType;
        this.signature = signature;

        mvProvider = () -> owner.getClassWriter().visitMethod(modifiers, name, getDescriptor(), signature.getSignature(), null);
    }

    @SuppressWarnings("unchecked")
    public Method(ClassGenerator owner, String name, Signature signature, Type returnType, Type... parameterTypes) {
        final ArrayList<Pair<String, Type>> parameters = new ArrayList<>();
        for (int i = 0; i < parameterTypes.length; i++) {
            parameters.add(new Pair<>("var%d".formatted(i), parameterTypes[i]));
        }

        this(owner, name, signature, returnType, parameters.toArray(Pair[]::new));
        // this is why I updated to java 22 :D
    }

    public void addInsn(Consumer<MethodVisitor> insnCode) {
        this.opQueue.add(insnCode);
    }

    public Variable var(Type type, String name) {
        return mainScope.createVariable(type, name);
    }

    public String getDescriptor() {
        String ret = "(";
        ret += String.join("", parameterTypes.stream().map(Type::getDescriptor).toList()) + ")";
        ret += returnType.getDescriptor();
        return ret;
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

    @SuppressWarnings("unchecked")
    public ArrayList<Type> getParameterTypes() {
        return (ArrayList<Type>) parameterTypes.clone();
    }


    private HashMap<String, Type> cachedParameters;
    public HashMap<String, Type> getParameters() {
        if (cachedParameters==null)
            cachedParameters = new HashMap<>();

        if (cachedParameters.size()!=parameterTypes.size()) {
            for (int i = 0; i < parameterTypes.size(); i++) {
                cachedParameters.put(parameterNames.get(i), parameterTypes.get(i));
            }
        }

        return cachedParameters;
    }

    @Override
    public final void end() {
        MethodVisitor mv = mvProvider.get();

        opQueue.addLast((visitor) -> visitor.visitMaxs(0, 0));
        opQueue.forEach((op) -> op.accept(mv));
    }

    @Override
    public boolean isStatic() {
        return isStatic;
    }

    @Override
    public boolean isFinal() {
        return isFinal;
    }

    @Override
    public boolean isPublic() {
        return isPublic;
    }

    @Override
    public boolean isPrivate() {
        return isPrivate;
    }

    @Override
    public boolean isProtected() {
        return isProtected;
    }

    @Override
    public boolean isAbstract() {
        return isAbstract;
    }

    private boolean isStatic = false;
    @Override
    public <T extends Accessible> T static_() {
        this.modifiers |= Opcodes.ACC_STATIC;
        isStatic = true;
        return (T) this;
    }

    private boolean isFinal = false;
    @Override
    public <T extends Accessible> T final_() {
        this.modifiers |= Opcodes.ACC_FINAL;
        isFinal = true;
        return (T) this;
    }

    private boolean isPublic = false;
    @Override
    public <T extends Accessible> T public_() {
        this.modifiers |= Opcodes.ACC_PUBLIC;
        isPublic = true;
        return (T) this;
    }

    private boolean isPrivate = false;
    @Override
    public <T extends Accessible> T private_() {
        this.modifiers |= Opcodes.ACC_PRIVATE;
        isPrivate = true;
        return (T) this;
    }

    private boolean isProtected = false;
    @Override
    public <T extends Accessible> T protected_() {
        this.modifiers |= Opcodes.ACC_PROTECTED;
        isProtected = true;
        return (T) this;
    }

    private boolean isAbstract = false;
    @Override
    public <T extends Accessible> T abstract_() {
        this.modifiers |= Opcodes.ACC_ABSTRACT;
        isAbstract = true;
        return (T) this;
    }
}
