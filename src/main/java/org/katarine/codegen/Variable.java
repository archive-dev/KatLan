package org.katarine.codegen;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Variable implements Caller { // todo: all ways to call method or do smth else should refer to this class or it's inheritors
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
    
    public Variable eq(Object value) {
        var res = method.var(Type.BOOLEAN, "eq_"+value.hashCode()+"_"+this.index);

        Consumer<MethodVisitor> compare = mv -> {
            mv.visitVarInsn(getType().getLoadCode(), this.index);
            if (value instanceof Variable v) {
                mv.visitVarInsn(v.getType().getLoadCode(), v.index);
            } else {
                mv.visitLdcInsn(value);
            }
            mv.visitJumpInsn(Opcodes.IFEQ);
        };

        return res;
    }

    public Variable set(Object value) {
        Consumer<MethodVisitor> setter;
        if (value instanceof Variable v) {
            setter = (mv) -> {
                mv.visitVarInsn(v.type.getLoadCode(), v.index);
                mv.visitVarInsn(this.type.getStoreCode(), index);
            };
        } else {
            setter = (mv) -> {
                mv.visitLdcInsn(value);
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
            getter = (mv) -> {
                mv.visitFieldInsn(Opcodes.GETSTATIC, this.type.getInternalName(), fieldName, fieldType.getDescriptor());
            };
        } else {
            getter = (mv) -> {
                mv.visitFieldInsn(Opcodes.GETFIELD, this.type.getInternalName(), fieldName, fieldType.getDescriptor());
            };
        }
        method.addInsn(getter);

        method.addInsn(mv -> mv.visitVarInsn(var.type.getStoreCode(), var.index));

        return var;
    }

    public void invokeVoid(MethodType methodType, String name, Object[] arguments) {
        invoke(Type.VOID, methodType, name, arguments);
    }

    @Override
    public Variable invoke(Type returnType, MethodType methodType, String name, Object[] arguments) {
        final ArrayList<Consumer<MethodVisitor>> instructions = new ArrayList<>();
        if (methodType != MethodType.STATIC)
            instructions.add(mv -> {
                mv.visitVarInsn(this.type.getLoadCode(), this.index);
            });
        for (var arg : arguments) {
            instructions.addAll(Utils.handleObject(arg));
        }

        switch (methodType) {
            case STATIC -> {
                instructions.add(mv -> {
                    mv.visitMethodInsn(
                            Opcodes.INVOKESTATIC,
                            this.type.getInternalName(),
                            name,
                            Utils.getMethodDescriptor(arguments, Type.VOID),
                            false
                    );
                });
            }
            case VIRTUAL -> {
                instructions.add(mv -> {
                    mv.visitMethodInsn(
                            Opcodes.INVOKEVIRTUAL,
                            this.type.getInternalName(),
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
                            this.type.getInternalName(),
                            name,
                            Utils.getMethodDescriptor(arguments, Type.VOID),
                            false
                    );
                });
            }
            case INTERFACE -> {
                instructions.add(mv -> {
                    mv.visitMethodInsn(
                            Opcodes.INVOKEINTERFACE,
                            this.type.getInternalName(),
                            name,
                            Utils.getMethodDescriptor(arguments, Type.VOID),
                            false
                    );
                });
            }
        }

        method.addInsns(instructions);

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
}
