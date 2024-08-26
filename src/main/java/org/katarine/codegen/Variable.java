package org.katarine.codegen;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Variable implements Caller {
    private final Type type;
    private final String name;

    private final CodeScope ownerScope;
    private final Method method;

    private final int index;

    public Variable(Type type, String name, CodeScope ownerScope, Method method, int index) {
        this.type = type;
        this.name = name;
        this.ownerScope = ownerScope;
        this.method = method;
        this.index = index;
    }

    /**
     * Compares the current Variable with the specified value and returns a new Variable storing the result.
     *
     * @param value The value to compare with the current Variable
     * @return A new Variable storing the result of the comparison
     */
    public Variable eq(Object value) {
        var res = method.var(Type.BOOLEAN, "eq_"+value.hashCode()+"_"+this.index);

        final Label ifEq = new Label();
        final Label endIf = new Label();
        LOAD();
        if (value instanceof Variable v) {
            v.LOAD();
        } else {
            method.LDC(value);
        }

        CMPNE(ifEq);

        method.LDC(1);

        method.GOTO(endIf);
        method.LABEL(ifEq);

        method.LDC(0);

        method.LABEL(endIf);

        res.STORE();

        return res;
    }

    /**
     * Compares the current Variable with the specified value and returns a new Variable storing the result.
     *
     * @param value The value to compare with the current Variable
     * @return A new Variable storing the result of the comparison
     */
    public Variable ne(Object value) {
        var res = method.var(Type.BOOLEAN, "ne_"+value.hashCode()+"_"+this.index);

        final Label ifEq = new Label();
        final Label endIf = new Label();
//        method.addInsn(mv -> {
        LOAD();
        if (value instanceof Variable v) {
            v.LOAD();
        } else {
            method.LDC(value);
        }

        CMPEQ(ifEq);

        method.LDC(1);

        method.GOTO(endIf);
        method.LABEL(ifEq);

        method.LDC(0);

        method.LABEL(endIf);

        res.STORE();
//        });

        return res;
    }

    public Variable set(Object value) {
        if (value instanceof Variable v) {
            v.LOAD();
            this.STORE();
        } else if (value != null) {
            method.LDC(value);
            this.STORE();
        } else {
            method.ACONST_NULL();
            this.STORE();
        }
        return this;
    }

    public Variable field(boolean isStatic, String fieldName, Type fieldType) {
        Variable var = method.var(fieldType, fieldName);

        if (isStatic) {
            method.GETSTATIC(this.type.getInternalName(), fieldName, fieldType.getDescriptor());
        } else {
            method.GETFIELD(this.type.getInternalName(), fieldName, fieldType.getDescriptor());
        }

        var.STORE();

        return var;
    }

    @Override
    public Variable invoke(Variable owner, Method method, Object[] arguments) {
        return invoke(owner, method.getReturnType(), method.getMethodType(), method.getName(), arguments);
    }

    public Variable invoke(Method method, Object[] arguments) {
        return invoke(this, method.getReturnType(), method.getMethodType(), method.getName(), arguments);
    }

    public Variable invokeVoid(MethodType methodType, String name, Object[] arguments) {
        return invoke(this, Type.VOID, methodType, name, arguments);
    }

    public Variable invoke(Type returnType, MethodType methodType, String name, Object[] arguments) {
        return invoke(this, returnType, methodType, name, arguments);
    }

    @Override
    public void invokeVoid(Variable owner, MethodType methodType, String name, Object[] arguments) {
        invoke(owner, Type.VOID, methodType, name, arguments);
    }

    @Override
    public Variable invoke(Variable owner, Type returnType, MethodType methodType, String name, Object[] arguments) {
        final ArrayList<Consumer<MethodVisitor>> instructions = new ArrayList<>();
        if (methodType != MethodType.STATIC)
            owner.LOAD();
        for (var arg : arguments) {
            instructions.addAll(Utils.handleObject(arg));
        }
        method.addInsns(instructions);

        switch (methodType) {
            case STATIC -> method.INVOKESTATIC(
                    owner.getType().getInternalName(),
                    name,
                    Utils.getMethodDescriptor(arguments, Type.VOID),
                    false
            );
            case VIRTUAL -> method.INVOKEVIRTUAL(
                    owner.getType().getInternalName(),
                    name,
                    Utils.getMethodDescriptor(arguments, Type.VOID),
                    false
            );
            case SPECIAL -> method.INVOKESPECIAL(
                    owner.getType().getInternalName(),
                    name,
                    Utils.getMethodDescriptor(arguments, Type.VOID),
                    false
            );
            case INTERFACE -> method.INVOKEINTERFACE(
                    owner.getType().getInternalName(),
                    name,
                    Utils.getMethodDescriptor(arguments, Type.VOID)
            );
            default -> throw new IllegalArgumentException();
        }


        if (returnType == Type.VOID) {
            return null;
        }

        var ret = method.var(returnType, name+"_ret"+"_"+this.index);
        ret.STORE();
        return ret;
    }

    public Variable xor(int other) {
        LOAD();
        if (!type.equals(Type.INT) || !type.equals(Type.BOOLEAN))
            method.L2I();
        method.LDC(other);
        method.IXOR();
        STORE();

        return this;
    }

    public Variable xor(long other) {
        LOAD();
        if (!type.equals(Type.LONG))
            method.I2L();
        method.LDC(other);
        method.LXOR();
        STORE();

        return this;
    }

    public Variable xor(Variable other) {
        LOAD();
        other.LOAD();
        if (!type.equals(other.type)) {
            if (!other.type.equals(type) && type.equals(Type.LONG)) {
                method.I2L();
            } else {
                method.L2I();
            }
        }

        if (type.equals(Type.LONG)) {
            method.LXOR();
        } else {
            method.IXOR();
        }
        STORE();

        return this;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public CodeScope getOwnerScope() {
        return ownerScope;
    }

    int getIndex() {
        return index;
    }

    public Method getMethod() {
        return method;
    }

    void LOAD() {
        method.addInsn(mv -> mv.visitVarInsn(getType().getLoadCode(), getIndex()));
    }

    void STORE() {
        method.addInsn(mv -> mv.visitVarInsn(getType().getStoreCode(), getIndex()));
    }

    void CMPNE(Label label) {
        if (!type.isPrimitive()) {
            method.IF_ACMPEQ(label);
            return;
        }
        switch (this.type.getDescriptor()) {
            case "Z", "B", "C", "S", "I" ->
                method.IF_ICMPEQ(label);
            case "F" -> {
                method.FCMPL();
                method.IFEQ(label);
            }
            case "D" -> {
                method.DCMPL();
                method.IFEQ(label);
            }
            case "J" -> {
                method.LCMP();
                method.IFEQ(label);
            }
            default -> throw new IllegalStateException("Unexpected value: " + this.type.getDescriptor());
        }
    }

    void CMPEQ(Label label) {
        if (!type.isPrimitive()) {
            method.IF_ACMPNE(label);
            return;
        }
        switch (this.type.getDescriptor()) {
            case "Z", "B", "C", "S", "I" -> {
                method.IF_ICMPNE(label);
            }
            case "F" -> {
                method.FCMPL();
                method.IFNE(label);
            }
            case "D" -> {
                method.DCMPL();
                method.IFNE(label);
            }
            case "J" -> {
                method.LCMP();
                method.IFNE(label);
            }
            default -> throw new IllegalStateException("Unexpected value: " + this.type.getDescriptor());
        }
    }
}
