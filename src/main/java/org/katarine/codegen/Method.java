package org.katarine.codegen;

import org.katarine.katlan.lib.struct.Pair;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@SuppressWarnings({"unchecked", "unused", "UnusedReturnValue"})
public class Method implements Member, Accessible, Caller {
    private final ClassGenerator owner;
    private final String name;
    private final List<Type> parameterTypes = new ArrayList<>();
    private final List<String> parameterNames = new ArrayList<>();
    private final Type returnType;
    private final Signature signature;

    private int modifiers = Opcodes.ACC_PUBLIC;
    private final Supplier<MethodVisitor> mvProvider;

    private final Label startLabel = new Label();
    private final Label endLabel = new Label();

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
        if (isStatic()) throw new IllegalStateException();
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

    public Variable param(int i) {
        return mainScope.get().variables.get(i);
    }

    public Variable param(String name) {
        return mainScope.get().variables.get(name);
    }

    public void return_() {
        addInsn(mv -> mv.visitInsn(Opcodes.RETURN));
    }

    public void return_(Object value) {
        if (value instanceof Variable v) {
            addInsn(mv ->mv.visitVarInsn(v.getType().getLoadCode(), v.getIndex()));
        } else {
            addInsn(mv ->mv.visitLdcInsn(value));
        }
        addInsn(mv -> mv.visitInsn(this.getReturnType().getReturnCode()));
    }

    private Method ifNeElse(Pair<Variable, Variable> values, Runnable if_, Runnable else_) {
        var a = values.getA();
        var b = values.getB();

        Label _else = new Label();
        Label endIf = new Label();

        addInsn(mv -> mv.visitVarInsn(values.getA().getType().getLoadCode(), values.getA().getIndex()));
        addInsn(mv -> mv.visitVarInsn(b.getType().getLoadCode(), b.getIndex()));
        if (a.getType().isPrimitive() && b.getType().isPrimitive() && a.getType() != b.getType()) {
            addInsn(mv -> mv.visitInsn(Type.PrimitiveType.getCastCode(
                    (Type.PrimitiveType) b.getType(),
                    ((Type.PrimitiveType) a.getType())
            )));
        }

        int[] cmpSeq = a.getType().getCmpEqCodes();
        if (cmpSeq.length == 1) addInsn(mv -> mv.visitJumpInsn(cmpSeq[0], endIf));
        else if (cmpSeq.length == 2) {
            addInsn(mv -> mv.visitInsn(cmpSeq[0]));
            addInsn(mv -> mv.visitJumpInsn(cmpSeq[1], endIf));
        }
        if_.run();
        addInsn(mv -> mv.visitJumpInsn(Opcodes.GOTO, endIf));
        addInsn(mv -> mv.visitLabel(_else));
        else_.run();
        addInsn(mv -> mv.visitLabel(endIf));


        return this;
    }

    private Method ifEqElse(Pair<Variable, Variable> values, Runnable if_, Runnable else_) {
        var a = values.getA();
        var b = values.getB();

        Label _else = new Label();
        Label endIf = new Label();

        addInsn(mv -> mv.visitVarInsn(values.getA().getType().getLoadCode(), values.getA().getIndex()));
        addInsn(mv -> mv.visitVarInsn(b.getType().getLoadCode(), b.getIndex()));
        if (a.getType().isPrimitive() && b.getType().isPrimitive() && a.getType() != b.getType()) {
            addInsn(mv -> mv.visitInsn(Type.PrimitiveType.getCastCode(
                    (Type.PrimitiveType) b.getType(),
                    ((Type.PrimitiveType) a.getType())
            )));
        }

        int[] cmpSeq = a.getType().getCmpNeCodes();
        if (cmpSeq.length == 1) addInsn(mv -> mv.visitJumpInsn(cmpSeq[0], endIf));
        else if (cmpSeq.length == 2) {
            addInsn(mv -> mv.visitInsn(cmpSeq[0]));
            addInsn(mv -> mv.visitJumpInsn(cmpSeq[1], endIf));
        }
        if_.run();
        addInsn(mv -> mv.visitJumpInsn(Opcodes.GOTO, endIf));
        addInsn(mv -> mv.visitLabel(_else));
        else_.run();
        addInsn(mv -> mv.visitLabel(endIf));


        return this;
    }

    private Method ifEq(Pair<Variable, Variable> values, Runnable if_) {
        var a = values.getA();
        var b = values.getB();

        Label endIf = new Label();

        a.LOAD();
        b.LOAD();
        if (a.getType().isPrimitive() && b.getType().isPrimitive() && a.getType() != b.getType()) {
            addInsn(mv -> mv.visitInsn(Type.PrimitiveType.getCastCode(
                    (Type.PrimitiveType) b.getType(),
                    ((Type.PrimitiveType) a.getType())
            )));
        }

        int[] cmpSeq = a.getType().getCmpNeCodes();
        if (cmpSeq.length == 1) addInsn(mv -> mv.visitJumpInsn(cmpSeq[0], endIf));
        else if (cmpSeq.length == 2) {
            addInsn(mv -> mv.visitInsn(cmpSeq[0]));
            addInsn(mv -> mv.visitJumpInsn(cmpSeq[1], endIf));
        }
        if_.run();
        addInsn(mv -> mv.visitLabel(endIf));

        return this;
    }

    private Method ifNe(Pair<Variable, Variable> values, Runnable if_) {
        var a = values.getA();
        var b = values.getB();

        Label endIf = new Label();

        a.LOAD();
        b.LOAD();
        if (a.getType().isPrimitive() && b.getType().isPrimitive() && a.getType() != b.getType()) {
            addInsn(mv -> mv.visitInsn(Type.PrimitiveType.getCastCode(
                    (Type.PrimitiveType) b.getType(),
                    ((Type.PrimitiveType) a.getType())
            )));
        }

        int[] cmpSeq = a.getType().getCmpEqCodes();
        if (cmpSeq.length == 1) addInsn(mv -> mv.visitJumpInsn(cmpSeq[0], endIf));
        else if (cmpSeq.length == 2) {
            addInsn(mv -> mv.visitInsn(cmpSeq[0]));
            addInsn(mv -> mv.visitJumpInsn(cmpSeq[1], endIf));
        }
        if_.run();
        addInsn(mv -> mv.visitLabel(endIf));

        return this;
    }

    public Method ifEq(Variable a, Variable b, Runnable if_) {
        return ifEq(new Pair<>(a, b), if_);
    }

    public Method ifEqElse(Variable a, Variable b, Runnable if_, Runnable else_) {
        return ifEqElse(new Pair<>(a, b), if_, else_);
    }

    public Method ifFalse(Variable v, Runnable if_) {
        Label ifEnd = new Label();

        v.LOAD();
        IFEQ(ifEnd);
        if_.run();

        addInsn(mv -> mv.visitLabel(ifEnd));

        return this;
    }

    public Method ifTrue(Variable v, Runnable if_) {
        Label ifEnd = new Label();

        v.LOAD();
        IFNE(ifEnd);
        if_.run();

        addInsn(mv -> mv.visitLabel(ifEnd));

        return this;
    }

    /**
     * Executes a conditional statement based on the value of the provided Variable.
     * If the Variable is false (0), the 'if_' code block is executed; otherwise, the 'else_' code block is executed.
     *
     * @param v The Variable to evaluate for the conditional statement
     * @param if_ The code block to execute if the Variable is false (0)
     * @param else_ The code block to execute if the Variable is true (non-zero)
     * @return The current Method instance
     */
    public Method ifElse(Variable v, Runnable if_, Runnable else_) {
        Label _else = new Label();
        Label ifEnd = new Label();

        addInsn(mv -> {
            mv.visitVarInsn(v.getType().getLoadCode(), v.getIndex());
            mv.visitJumpInsn(Opcodes.IFEQ, _else);
        });
        if_.run();
        addInsn(mv -> {
            mv.visitJumpInsn(Opcodes.GOTO, ifEnd);
            mv.visitLabel(_else);
        });
        else_.run();
        addInsn(mv -> mv.visitLabel(ifEnd));

        return this;
    }

    public Variable xor(Variable left, Variable right) {
        return intMath(left, right, Opcodes.IXOR, Opcodes.LXOR);
    }

    public Variable and(Variable left, Variable right) {
        return intMath(left, right, Opcodes.IAND, Opcodes.LAND);
    }

    public Variable or(Variable left, Variable right) {
        return intMath(left, right, Opcodes.IOR, Opcodes.LOR);
    }

    private Variable intMath(Variable left, Variable right, int iCode, int lCode) {
        Type leftType, rightType;
        if (!(leftType = left.getType()).isPrimitive() | !(rightType = right.getType()).isPrimitive())
            throw new IllegalStateException();

        if (!((Type.PrimitiveType) leftType).isIntType() || !((Type.PrimitiveType) rightType).isIntType())
            throw new IllegalStateException();

        Type returnVarType;
        int compare = ((Type.PrimitiveType) leftType).compareTo((Type.PrimitiveType) rightType);
        if (compare < 0)
            returnVarType = rightType;
        else returnVarType = leftType;

        left.LOAD();
        if (returnVarType!=leftType) {
            if (returnVarType.equals(Type.LONG))
                I2L();
            else {
                L2I();
            }
        }
        right.LOAD();
        if (returnVarType!=rightType) {
            if (returnVarType.equals(Type.LONG))
                I2L();
            else {
                L2I();
            }
        }
        if (returnVarType.equals(Type.LONG))
            addInsn(mv -> mv.visitInsn(lCode));
        else addInsn(mv -> mv.visitInsn(iCode));
        var ret = var(returnVarType, "XOR_result_"+left.hashCode()+right.hashCode());
        ret.STORE();

        return ret;
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

        opQueue.addFirst(visitor -> visitor.visitLabel(startLabel));
        opQueue.addLast(visitor -> visitor.visitLabel(endLabel));
        opQueue.addLast(visitor -> visitor.visitMaxs(0, 0));

        opQueue.forEach(op -> op.accept(mv));
    }


    final Label getStartLabel() {
        return startLabel;
    }

    final Label getEndLabel() {
        return endLabel;
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
    public Variable invoke(Variable owner, Method method, Object[] arguments) {
        return invoke(owner, method.getReturnType(), method.getMethodType(), method.getName(), arguments);
    }

    @Override
    public void invokeVoid(Variable owner, MethodType type, String name, Object[] arguments) {
        invoke(owner, Type.VOID, type, name, arguments);
    }

    @Override
    public Variable invoke(Variable owner, Type returnType, MethodType methodType, String name, Object[] arguments) {
        final ArrayList<Consumer<MethodVisitor>> instructions = new ArrayList<>();
        if (methodType != MethodType.STATIC)
            instructions.add(mv -> ALOAD(owner.getIndex()));
        for (var arg : arguments) {
            instructions.addAll(Utils.handleObject(arg));
        }

        switch (methodType) {
            case STATIC -> INVOKESTATIC(this.getOwner().getType().getInternalName(),
                        name,
                        Utils.getMethodDescriptor(arguments, Type.VOID),
                        false);
            case VIRTUAL -> INVOKEVIRTUAL(this.getOwner().getType().getInternalName(),
                    name,
                    Utils.getMethodDescriptor(arguments, Type.VOID),
                    false);
            case SPECIAL -> INVOKESPECIAL(this.getOwner().getType().getInternalName(),
                    name,
                    Utils.getMethodDescriptor(arguments, Type.VOID),
                    false);
            case INTERFACE -> INVOKEINTERFACE(
                    this.getOwner().getType().getInternalName(),
                    name,
                    Utils.getMethodDescriptor(arguments, Type.VOID)
            );
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

    public Method ICONST(int value) {
        switch (value) {
            case -1: addInsn(mv -> mv.visitInsn(Opcodes.ICONST_M1)); break;
            case 0: addInsn(mv -> mv.visitInsn(Opcodes.ICONST_0)); break;
            case 1: addInsn(mv -> mv.visitInsn(Opcodes.ICONST_1)); break;
            case 2: addInsn(mv -> mv.visitInsn(Opcodes.ICONST_2)); break;
            case 3: addInsn(mv -> mv.visitInsn(Opcodes.ICONST_3)); break;
            case 4: addInsn(mv -> mv.visitInsn(Opcodes.ICONST_4)); break;
            case 5: addInsn(mv -> mv.visitInsn(Opcodes.ICONST_5)); break;
            default:
                if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
                    addInsn(mv -> mv.visitIntInsn(Opcodes.BIPUSH, value));
                } else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
                    addInsn(mv -> mv.visitIntInsn(Opcodes.SIPUSH, value));
                } else {
                    addInsn(mv -> mv.visitLdcInsn(value));
                }
                break;
        }
        return this;
    }

    public Method LCONST(long value) {
        if (value == 0L) {
            addInsn(mv -> mv.visitInsn(Opcodes.LCONST_0));
        } else if (value == 1L) {
            addInsn(mv -> mv.visitInsn(Opcodes.LCONST_1));
        } else {
            addInsn(mv -> mv.visitLdcInsn(value));
        }
        return this;
    }

    public Method FCONST(float value) {
        if (value == 0.0f) {
            addInsn(mv -> mv.visitInsn(Opcodes.FCONST_0));
        } else if (value == 1.0f) {
            addInsn(mv -> mv.visitInsn(Opcodes.FCONST_1));
        } else if (value == 2.0f) {
            addInsn(mv -> mv.visitInsn(Opcodes.FCONST_2));
        } else {
            addInsn(mv -> mv.visitLdcInsn(value));
        }
        return this;
    }

    public Method DCONST(double value) {
        if (value == 0.0) {
            addInsn(mv -> mv.visitInsn(Opcodes.DCONST_0));
        } else if (value == 1.0) {
            addInsn(mv -> mv.visitInsn(Opcodes.DCONST_1));
        } else {
            addInsn(mv -> mv.visitLdcInsn(value));
        }
        return this;
    }

    public Method BIPUSH(int value) {
        addInsn(mv -> mv.visitIntInsn(Opcodes.BIPUSH, value));
        return this;
    }

    public Method SIPUSH(int value) {
        addInsn(mv -> mv.visitIntInsn(Opcodes.SIPUSH, value));
        return this;
    }

    public Method LDC(Object value) {
        addInsn(mv -> mv.visitLdcInsn(value));
        return this;
    }

    // Арифметические операции
    public Method IADD() {
        addInsn(mv -> mv.visitInsn(Opcodes.IADD));
        return this;
    }

    public Method LADD() {
        addInsn(mv -> mv.visitInsn(Opcodes.LADD));
        return this;
    }

    public Method FADD() {
        addInsn(mv -> mv.visitInsn(Opcodes.FADD));
        return this;
    }

    public Method DADD() {
        addInsn(mv -> mv.visitInsn(Opcodes.DADD));
        return this;
    }

    public Method ISUB() {
        addInsn(mv -> mv.visitInsn(Opcodes.ISUB));
        return this;
    }

    public Method LSUB() {
        addInsn(mv -> mv.visitInsn(Opcodes.LSUB));
        return this;
    }

    public Method FSUB() {
        addInsn(mv -> mv.visitInsn(Opcodes.FSUB));
        return this;
    }

    public Method DSUB() {
        addInsn(mv -> mv.visitInsn(Opcodes.DSUB));
        return this;
    }

    public Method IMUL() {
        addInsn(mv -> mv.visitInsn(Opcodes.IMUL));
        return this;
    }

    public Method LMUL() {
        addInsn(mv -> mv.visitInsn(Opcodes.LMUL));
        return this;
    }

    public Method FMUL() {
        addInsn(mv -> mv.visitInsn(Opcodes.FMUL));
        return this;
    }

    public Method DMUL() {
        addInsn(mv -> mv.visitInsn(Opcodes.DMUL));
        return this;
    }

    public Method IDIV() {
        addInsn(mv -> mv.visitInsn(Opcodes.IDIV));
        return this;
    }

    public Method LDIV() {
        addInsn(mv -> mv.visitInsn(Opcodes.LDIV));
        return this;
    }

    public Method FDIV() {
        addInsn(mv -> mv.visitInsn(Opcodes.FDIV));
        return this;
    }

    public Method DDIV() {
        addInsn(mv -> mv.visitInsn(Opcodes.DDIV));
        return this;
    }

    public Method IREM() {
        addInsn(mv -> mv.visitInsn(Opcodes.IREM));
        return this;
    }

    public Method LREM() {
        addInsn(mv -> mv.visitInsn(Opcodes.LREM));
        return this;
    }

    public Method FREM() {
        addInsn(mv -> mv.visitInsn(Opcodes.FREM));
        return this;
    }

    public Method DREM() {
        addInsn(mv -> mv.visitInsn(Opcodes.DREM));
        return this;
    }

    public Method INEG() {
        addInsn(mv -> mv.visitInsn(Opcodes.INEG));
        return this;
    }

    public Method LNEG() {
        addInsn(mv -> mv.visitInsn(Opcodes.LNEG));
        return this;
    }

    public Method FNEG() {
        addInsn(mv -> mv.visitInsn(Opcodes.FNEG));
        return this;
    }

    public Method DNEG() {
        addInsn(mv -> mv.visitInsn(Opcodes.DNEG));
        return this;
    }

    public Method ISHL() {
        addInsn(mv -> mv.visitInsn(Opcodes.ISHL));
        return this;
    }

    public Method LSHL() {
        addInsn(mv -> mv.visitInsn(Opcodes.LSHL));
        return this;
    }

    public Method ISHR() {
        addInsn(mv -> mv.visitInsn(Opcodes.ISHR));
        return this;
    }

    public Method LSHR() {
        addInsn(mv -> mv.visitInsn(Opcodes.LSHR));
        return this;
    }

    public Method IUSHR() {
        addInsn(mv -> mv.visitInsn(Opcodes.IUSHR));
        return this;
    }

    public Method LUSHR() {
        addInsn(mv -> mv.visitInsn(Opcodes.LUSHR));
        return this;
    }

    public Method IAND() {
        addInsn(mv -> mv.visitInsn(Opcodes.IAND));
        return this;
    }

    public Method LAND() {
        addInsn(mv -> mv.visitInsn(Opcodes.LAND));
        return this;
    }

    public Method IOR() {
        addInsn(mv -> mv.visitInsn(Opcodes.IOR));
        return this;
    }

    public Method LOR() {
        addInsn(mv -> mv.visitInsn(Opcodes.LOR));
        return this;
    }

    public Method IXOR() {
        addInsn(mv -> mv.visitInsn(Opcodes.IXOR));
        return this;
    }

    public Method LXOR() {
        addInsn(mv -> mv.visitInsn(Opcodes.LXOR));
        return this;
    }

    public Method IINC(int var, int increment) {
        addInsn(mv -> mv.visitIincInsn(var, increment));
        return this;
    }

    // Прочие инструкции
    public Method NOP() {
        addInsn(mv -> mv.visitInsn(Opcodes.NOP));
        return this;
    }

    public Method ACONST_NULL() {
        addInsn(mv -> mv.visitInsn(Opcodes.ACONST_NULL));
        return this;
    }

    public Method POP() {
        addInsn(mv -> mv.visitInsn(Opcodes.POP));
        return this;
    }

    public Method POP2() {
        addInsn(mv -> mv.visitInsn(Opcodes.POP2));
        return this;
    }

    public Method DUP() {
        addInsn(mv -> mv.visitInsn(Opcodes.DUP));
        return this;
    }

    public Method DUP_X1() {
        addInsn(mv -> mv.visitInsn(Opcodes.DUP_X1));
        return this;
    }

    public Method DUP_X2() {
        addInsn(mv -> mv.visitInsn(Opcodes.DUP_X2));
        return this;
    }

    public Method DUP2() {
        addInsn(mv -> mv.visitInsn(Opcodes.DUP2));
        return this;
    }

    public Method DUP2_X1() {
        addInsn(mv -> mv.visitInsn(Opcodes.DUP2_X1));
        return this;
    }

    public Method DUP2_X2() {
        addInsn(mv -> mv.visitInsn(Opcodes.DUP2_X2));
        return this;
    }

    public Method SWAP() {
        addInsn(mv -> mv.visitInsn(Opcodes.SWAP));
        return this;
    }

    public Method I2L() {
        addInsn(mv -> mv.visitInsn(Opcodes.I2L));
        return this;
    }

    public Method I2F() {
        addInsn(mv -> mv.visitInsn(Opcodes.I2F));
        return this;
    }

    public Method I2D() {
        addInsn(mv -> mv.visitInsn(Opcodes.I2D));
        return this;
    }

    public Method L2I() {
        addInsn(mv -> mv.visitInsn(Opcodes.L2I));
        return this;
    }

    public Method L2F() {
        addInsn(mv -> mv.visitInsn(Opcodes.L2F));
        return this;
    }

    public Method L2D() {
        addInsn(mv -> mv.visitInsn(Opcodes.L2D));
        return this;
    }

    public Method F2I() {
        addInsn(mv -> mv.visitInsn(Opcodes.F2I));
        return this;
    }

    public Method F2L() {
        addInsn(mv -> mv.visitInsn(Opcodes.F2L));
        return this;
    }

    public Method F2D() {
        addInsn(mv -> mv.visitInsn(Opcodes.F2D));
        return this;
    }

    public Method D2I() {
        addInsn(mv -> mv.visitInsn(Opcodes.D2I));
        return this;
    }

    public Method D2L() {
        addInsn(mv -> mv.visitInsn(Opcodes.D2L));
        return this;
    }

    public Method D2F() {
        addInsn(mv -> mv.visitInsn(Opcodes.D2F));
        return this;
    }

    public Method I2B() {
        addInsn(mv -> mv.visitInsn(Opcodes.I2B));
        return this;
    }

    public Method I2C() {
        addInsn(mv -> mv.visitInsn(Opcodes.I2C));
        return this;
    }

    public Method I2S() {
        addInsn(mv -> mv.visitInsn(Opcodes.I2S));
        return this;
    }

    // Методы управления потоком
    public Method IFEQ(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IFEQ, label));
        return this;
    }

    public Method IFNE(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IFNE, label));
        return this;
    }

    public Method IFLT(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IFLT, label));
        return this;
    }

    public Method IFGE(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IFGE, label));
        return this;
    }

    public Method IFGT(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IFGT, label));
        return this;
    }

    public Method IFLE(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IFLE, label));
        return this;
    }

    public Method IF_ICMPEQ(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IF_ICMPEQ, label));
        return this;
    }

    public Method IF_ICMPNE(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IF_ICMPNE, label));
        return this;
    }

    public Method IF_ICMPLT(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IF_ICMPLT, label));
        return this;
    }

    public Method IF_ICMPGE(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IF_ICMPGE, label));
        return this;
    }

    public Method IF_ICMPGT(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IF_ICMPGT, label));
        return this;
    }

    public Method IF_ICMPLE(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IF_ICMPLE, label));
        return this;
    }

    public Method IF_ACMPEQ(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IF_ACMPEQ, label));
        return this;
    }

    public Method IF_ACMPNE(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IF_ACMPNE, label));
        return this;
    }

    public Method FCMPL() {
        addInsn(mv -> mv.visitInsn(Opcodes.FCMPL));
        return this;
    }

    public Method FCMPG() {
        addInsn(mv -> mv.visitInsn(Opcodes.FCMPG));
        return this;
    }

    public Method DCMPL() {
        addInsn(mv -> mv.visitInsn(Opcodes.DCMPL));
        return this;
    }

    public Method DCMPG() {
        addInsn(mv -> mv.visitInsn(Opcodes.DCMPG));
        return this;
    }
    
    public Method LCMP() {
        addInsn(mv -> mv.visitInsn(Opcodes.LCMP));
        return this;
    }

    public Method GOTO(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.GOTO, label));
        return this;
    }

    public Method JSR(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.JSR, label));
        return this;
    }

    public Method RET(int var) {
        addInsn(mv -> mv.visitVarInsn(Opcodes.RET, var));
        return this;
    }

    public Method TABLESWITCH(int min, int max, Label dflt, Label... labels) {
        addInsn(mv -> mv.visitTableSwitchInsn(min, max, dflt, labels));
        return this;
    }

    public Method LOOKUPSWITCH(Label dflt, int[] keys, Label[] labels) {
        addInsn(mv -> mv.visitLookupSwitchInsn(dflt, keys, labels));
        return this;
    }

    public Method IRETURN() {
        addInsn(mv -> mv.visitInsn(Opcodes.IRETURN));
        return this;
    }

    public Method LRETURN() {
        addInsn(mv -> mv.visitInsn(Opcodes.LRETURN));
        return this;
    }

    public Method FRETURN() {
        addInsn(mv -> mv.visitInsn(Opcodes.FRETURN));
        return this;
    }

    public Method DRETURN() {
        addInsn(mv -> mv.visitInsn(Opcodes.DRETURN));
        return this;
    }

    public Method ARETURN() {
        addInsn(mv -> mv.visitInsn(Opcodes.ARETURN));
        return this;
    }

    public Method RETURN() {
        addInsn(mv -> mv.visitInsn(Opcodes.RETURN));
        return this;
    }

    public Method GETSTATIC(String owner, String name, String descriptor) {
        addInsn(mv -> mv.visitFieldInsn(Opcodes.GETSTATIC, owner, name, descriptor));
        return this;
    }

    public Method PUTSTATIC(String owner, String name, String descriptor) {
        addInsn(mv -> mv.visitFieldInsn(Opcodes.PUTSTATIC, owner, name, descriptor));
        return this;
    }

    public Method GETFIELD(String owner, String name, String descriptor) {
        addInsn(mv -> mv.visitFieldInsn(Opcodes.GETFIELD, owner, name, descriptor));
        return this;
    }

    public Method PUTFIELD(String owner, String name, String descriptor) {
        addInsn(mv -> mv.visitFieldInsn(Opcodes.PUTFIELD, owner, name, descriptor));
        return this;
    }

    public Method INVOKEVIRTUAL(String owner, String name, String descriptor, boolean isInterface) {
        addInsn(mv -> mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, owner, name, descriptor, isInterface));
        return this;
    }

    public Method INVOKESPECIAL(String owner, String name, String descriptor, boolean isInterface) {
        addInsn(mv -> mv.visitMethodInsn(Opcodes.INVOKESPECIAL, owner, name, descriptor, isInterface));
        return this;
    }

    public Method INVOKESTATIC(String owner, String name, String descriptor, boolean isInterface) {
        addInsn(mv -> mv.visitMethodInsn(Opcodes.INVOKESTATIC, owner, name, descriptor, isInterface));
        return this;
    }

    public Method INVOKEINTERFACE(String owner, String name, String descriptor) {
        addInsn(mv -> mv.visitMethodInsn(Opcodes.INVOKEINTERFACE, owner, name, descriptor, true));
        return this;
    }

    public Method INVOKEDYNAMIC(String name, String descriptor, Handle bootstrapMethodHandle, Object... bootstrapMethodArguments) {
        addInsn(mv -> mv.visitInvokeDynamicInsn(name, descriptor, bootstrapMethodHandle, bootstrapMethodArguments));
        return this;
    }

    public Method NEW(String type) {
        addInsn(mv -> mv.visitTypeInsn(Opcodes.NEW, type));
        return this;
    }

    public Method NEWARRAY(int arrayType) {
        addInsn(mv -> mv.visitIntInsn(Opcodes.NEWARRAY, arrayType));
        return this;
    }

    public Method ANEWARRAY(String descriptor) {
        addInsn(mv -> mv.visitTypeInsn(Opcodes.ANEWARRAY, descriptor));
        return this;
    }

    public Method ARRAYLENGTH() {
        addInsn(mv -> mv.visitInsn(Opcodes.ARRAYLENGTH));
        return this;
    }

    public Method ATHROW() {
        addInsn(mv -> mv.visitInsn(Opcodes.ATHROW));
        return this;
    }

    public Method CHECKCAST(String descriptor) {
        addInsn(mv -> mv.visitTypeInsn(Opcodes.CHECKCAST, descriptor));
        return this;
    }

    public Method INSTANCEOF(String descriptor) {
        addInsn(mv -> mv.visitTypeInsn(Opcodes.INSTANCEOF, descriptor));
        return this;
    }

    public Method MONITORENTER() {
        addInsn(mv -> mv.visitInsn(Opcodes.MONITORENTER));
        return this;
    }

    public Method MONITOREXIT() {
        addInsn(mv -> mv.visitInsn(Opcodes.MONITOREXIT));
        return this;
    }

    public Method MULTIANEWARRAY(String descriptor, int numDimensions) {
        addInsn(mv -> mv.visitMultiANewArrayInsn(descriptor, numDimensions));
        return this;
    }

    public Method IFNULL(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IFNULL, label));
        return this;
    }

    public Method IFNONNULL(Label label) {
        addInsn(mv -> mv.visitJumpInsn(Opcodes.IFNONNULL, label));
        return this;
    }

    // Типы переменных и массивов
    public Method ILOAD(int var) {
        addInsn(mv -> mv.visitVarInsn(Opcodes.ILOAD, var));
        return this;
    }

    public Method LLOAD(int var) {
        addInsn(mv -> mv.visitVarInsn(Opcodes.LLOAD, var));
        return this;
    }

    public Method FLOAD(int var) {
        addInsn(mv -> mv.visitVarInsn(Opcodes.FLOAD, var));
        return this;
    }

    public Method DLOAD(int var) {
        addInsn(mv -> mv.visitVarInsn(Opcodes.DLOAD, var));
        return this;
    }

    public Method ALOAD(int var) {
        addInsn(mv -> mv.visitVarInsn(Opcodes.ALOAD, var));
        return this;
    }

    public Method ISTORE(int var) {
        addInsn(mv -> mv.visitVarInsn(Opcodes.ISTORE, var));
        return this;
    }

    public Method LSTORE(int var) {
        addInsn(mv -> mv.visitVarInsn(Opcodes.LSTORE, var));
        return this;
    }

    public Method FSTORE(int var) {
        addInsn(mv -> mv.visitVarInsn(Opcodes.FSTORE, var));
        return this;
    }

    public Method DSTORE(int var) {
        addInsn(mv -> mv.visitVarInsn(Opcodes.DSTORE, var));
        return this;
    }

    public Method ASTORE(int var) {
        addInsn(mv -> mv.visitVarInsn(Opcodes.ASTORE, var));
        return this;
    }

    // Работа с массивами
    public Method IALOAD() {
        addInsn(mv -> mv.visitInsn(Opcodes.IALOAD));
        return this;
    }

    public Method LALOAD() {
        addInsn(mv -> mv.visitInsn(Opcodes.LALOAD));
        return this;
    }

    public Method FALOAD() {
        addInsn(mv -> mv.visitInsn(Opcodes.FALOAD));
        return this;
    }

    public Method DALOAD() {
        addInsn(mv -> mv.visitInsn(Opcodes.DALOAD));
        return this;
    }

    public Method AALOAD() {
        addInsn(mv -> mv.visitInsn(Opcodes.AALOAD));
        return this;
    }

    public Method BALOAD() {
        addInsn(mv -> mv.visitInsn(Opcodes.BALOAD));
        return this;
    }

    public Method CALOAD() {
        addInsn(mv -> mv.visitInsn(Opcodes.CALOAD));
        return this;
    }

    public Method SALOAD() {
        addInsn(mv -> mv.visitInsn(Opcodes.SALOAD));
        return this;
    }

    public Method IASTORE() {
        addInsn(mv -> mv.visitInsn(Opcodes.IASTORE));
        return this;
    }

    public Method LASTORE() {
        addInsn(mv -> mv.visitInsn(Opcodes.LASTORE));
        return this;
    }

    public Method FASTORE() {
        addInsn(mv -> mv.visitInsn(Opcodes.FASTORE));
        return this;
    }

    public Method DASTORE() {
        addInsn(mv -> mv.visitInsn(Opcodes.DASTORE));
        return this;
    }

    public Method AASTORE() {
        addInsn(mv -> mv.visitInsn(Opcodes.AASTORE));
        return this;
    }

    public Method BASTORE() {
        addInsn(mv -> mv.visitInsn(Opcodes.BASTORE));
        return this;
    }

    public Method CASTORE() {
        addInsn(mv -> mv.visitInsn(Opcodes.CASTORE));
        return this;
    }

    public Method SASTORE() {
        addInsn(mv -> mv.visitInsn(Opcodes.SASTORE));
        return this;
    }

    // Метки и исключения
    public Method LABEL(Label label) {
        addInsn(mv -> mv.visitLabel(label));
        return this;
    }

    public Method TRY_CATCH(Label start, Label end, Label handler, String type) {
        addInsn(mv -> mv.visitTryCatchBlock(start, end, handler, type));
        return this;
    }

    public Method LINE(int line, Label start) {
        addInsn(mv -> mv.visitLineNumber(line, start));
        return this;
    }

    public Method SWITCH(int[] keys, Label[] labels, Label defaultLabel) {
        addInsn(mv -> mv.visitLookupSwitchInsn(defaultLabel, keys, labels));
        return this;
    }
}