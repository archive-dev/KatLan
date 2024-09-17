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

    /**
     * Retrieves a field from the current Variable based on the provided parameters.
     *
     * @param isStatic Indicates if the field is static
     * @param fieldName The name of the field to retrieve
     * @param fieldType The type of the field
     * @return The Variable representing the retrieved field
     */
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

    /**
     * Performs a logical NOT operation on the current Variable.
     * Throws an IllegalStateException if the Variable is not of primitive type or not a boolean type.
     * Uses the 'ifElse' method of the associated Method instance to set the Variable to 0 if it is true,
     * and to 1 if it is false.
     *
     * @return The current Variable instance after the logical NOT operation
     */
    public Variable not() {
        if (!type.isPrimitive()) throw new IllegalStateException();
        if (!type.equals(Type.BOOLEAN)) throw new IllegalStateException();

        method.ifElse(this,
            () -> set(0),
            () -> set(1)
        );

        return this;
    }

    public Variable or(boolean other) {
        return or(other ? 1 : 0);
    }

    public Variable or(byte other) {
        return or(((int) other));
    }

    public Variable or(short other) {
        return or(((int) other));
    }

    public Variable or(int other) {
        return handleIntMath(other, Opcodes.IOR);
    }

    public Variable or(long other) {
        return handleIntMath(other, Opcodes.LOR);
    }

    public Variable and(boolean other) {
        return and(other ? 1 : 0);
    }

    public Variable and(byte other) {
        return and(((int) other));
    }

    public Variable and(short other) {
        return and(((int) other));
    }

    public Variable and(int other) {
        return handleIntMath(other, Opcodes.IAND);
    }

    public Variable and(long other) {
        return handleIntMath(other, Opcodes.LAND);
    }

    public Variable xor(boolean other) {
        return xor(other ? 1 : 0);
    }

    public Variable xor(byte other) {
        return xor(((int) other));
    }

    public Variable xor(short other) {
        return xor(((int) other));
    }

    /**
     * Loads this
     * and given {@code Variable}s onto stack and invokes XOR instruction
     * saving the value to this {@code Variable}
     * @param other other value.
     * @return this {@code Variable}
     */
    public Variable xor(int other) {
        return handleIntMath(other, Opcodes.IXOR);
    }

    /**
     * Loads this
     * and given {@code Variable}s onto stack and invokes XOR instruction
     * saving the value to this {@code Variable}
     * @param other other value.
     * @return this {@code Variable}
     */
    public Variable xor(long other) {
        return handleIntMath(other, Opcodes.LXOR);
    }

    /**
     * Loads this
     * and given {@code Variable}s onto stack and invokes XOR instruction
     * saving the value to this {@code Variable}
     * @param other other value.
     * Must have an integer-type (
     * {@code
     * other.getType().isPrimitive() && ((Type.PrimitiveType)other.getType()).isIntType()
     * })
     * @return this {@code Variable}
     */
    public Variable xor(Variable other) {
        LOAD();
        other.LOAD();
        if (!type.equals(other.type)) {
            if (type.equals(Type.LONG)) {
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

    private Variable handleIntMath(long other, int code) {
        LOAD();
        if (((Type.PrimitiveType) type).isIntType())
            method.I2L();
        method.LDC(other);
        method.addInsn(mv -> mv.visitInsn(code));
        STORE();

        return this;
    }

    private Variable handleIntMath(int other, int code) {
        if (!type.isPrimitive()) throw new IllegalStateException();
        LOAD();
        if (!((Type.PrimitiveType) type).isIntType())
            method.I2L();
        method.LDC(other);
        method.addInsn(mv -> mv.visitInsn(code));
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

    public int getIndex() {
        return index;
    }

    public Method getMethod() {
        return method;
    }

    public void LOAD() {
        method.addInsn(mv -> mv.visitVarInsn(getType().getLoadCode(), getIndex()));
    }

    public void STORE() {
        method.addInsn(mv -> mv.visitVarInsn(getType().getStoreCode(), getIndex()));
    }

    public void CMPNE(Label label) {
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

    public void CMPEQ(Label label) {
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
