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
        method.addInsn(mv -> {
            mv.visitVarInsn(getType().getLoadCode(), this.index);
            if (value instanceof Variable v) {
                mv.visitVarInsn(v.getType().getLoadCode(), v.index);
            } else {
                mv.visitLdcInsn(value);
            }

            mv.visitJumpInsn(Opcodes.IF_ICMPNE, ifEq);

            mv.visitLdcInsn(1);

            mv.visitJumpInsn(Opcodes.GOTO, endIf);
            mv.visitLabel(ifEq);

            mv.visitLdcInsn(0);

            mv.visitLabel(endIf);

            mv.visitVarInsn(Type.BOOLEAN.getStoreCode(), res.getIndex());
        });

        return res;
    }

    public Variable set(Object value) {
        Consumer<MethodVisitor> setter;
        if (value instanceof Variable v) {
            setter = (mv) -> {
                mv.visitVarInsn(v.type.getLoadCode(), v.index);
                mv.visitVarInsn(this.type.getStoreCode(), index);
            };
        } else if (value != null) {
            setter = (mv) -> {
                mv.visitLdcInsn(value);
                mv.visitVarInsn(this.type.getStoreCode(), index);
            };
        } else {
            setter = mv -> {
                mv.visitInsn(Opcodes.ACONST_NULL);
                mv.visitVarInsn(this.type.getStoreCode(), index);
            };
        }
        method.addInsn(setter);
        return this;
    }

    public Variable field(boolean isStatic, String fieldName, Type fieldType) {
        Variable var = method.var(fieldType, fieldName);

        Consumer<MethodVisitor> getter;
        if (isStatic) {
            getter = (mv) -> mv.visitFieldInsn(Opcodes.GETSTATIC, this.type.getInternalName(), fieldName, fieldType.getDescriptor());
        } else {
            getter = (mv) -> mv.visitFieldInsn(Opcodes.GETFIELD, this.type.getInternalName(), fieldName, fieldType.getDescriptor());
        }
        method.addInsn(getter);

        method.addInsn(mv -> mv.visitVarInsn(var.type.getStoreCode(), var.index));

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
            method.ALOAD(owner.getIndex());
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
        method.addInsn(mv -> mv.visitVarInsn(ret.type.getStoreCode(), ret.index));
        return ret;
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
