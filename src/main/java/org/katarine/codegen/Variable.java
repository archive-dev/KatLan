package org.katarine.codegen;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Variable { // todo: all ways to call method or do smth else should refer to this class or it's inheritors
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
        final ArrayList<Consumer<MethodVisitor>> instructions = new ArrayList<>();
        instructions.add(mv -> {
            mv.visitVarInsn(this.type.getLoadCode(), this.index);
        });
        for (var arg : arguments) {
            instructions.addAll(handleObject(arg));
        }

        switch (methodType) {
            case STATIC -> {

            }
            case VIRTUAL -> {
                instructions.add(mv -> {
                    mv.visitMethodInsn(
                            Opcodes.INVOKEVIRTUAL,
                            this.type.getInternalName(),
                            name,
                            getMethodDescriptor(arguments, new Type(void.class)),
                            false
                    );
                });
            }
        }

        method.addInsns(instructions);
    }

    private String getMethodDescriptor(Object[] args, Type returnType) {
        String ret = "(";
        for (var arg : args) {
            ret += getObjectDescriptor(arg);
        }
        ret += ")";
        ret+=returnType.getDescriptor();
        return ret;
    }

    private String getObjectDescriptor(Object obj) {
        if (obj instanceof Variable v) {
            return v.type.getDescriptor();
        }
        return TypeResolver.getTypeDescriptor(obj.getClass());
    }

    private List<Consumer<MethodVisitor>> handleObject(Object obj) {
        final List<Consumer<MethodVisitor>> ret = new ArrayList<>();
        switch (obj) {
            case null -> ret.add(mv -> mv.visitInsn(Opcodes.ACONST_NULL));
            case Variable v -> ret.add(mv -> mv.visitVarInsn(v.type.getLoadCode(), v.index));
            case Integer i when i >= -1 && i <= 5 -> ret.add(mv -> mv.visitInsn(iConstOpcode(i)));
            case Float f when f >= 0 && f <= 2 -> ret.add(mv -> mv.visitInsn(fConstOpcode(f)));
            case Long l when l >= 0 && l <= 1 -> ret.add(mv -> mv.visitInsn(lConstOpcode(l)));
            case Double d when d >= 0 && d <= 1 -> ret.add(mv -> mv.visitInsn(dConstOpcode(d)));
            default -> ret.add(mv -> mv.visitLdcInsn(obj));
        }
        return ret;
    }

    private int iConstOpcode(int i) {
        return switch (i) {
            case -1 -> Opcodes.ICONST_M1;
            case 0 -> Opcodes.ICONST_0;
            case 1 -> Opcodes.ICONST_1;
            case 2 -> Opcodes.ICONST_2;
            case 3 -> Opcodes.ICONST_3;
            case 4 -> Opcodes.ICONST_4;
            case 5 -> Opcodes.ICONST_5;
            default -> throw new IndexOutOfBoundsException();
        };
    }

    private int fConstOpcode(float f) {
        if (f == 0f) {
            return Opcodes.FCONST_0;
        } else if (f == 1f) {
            return Opcodes.FCONST_1;
        } else if (f == 2f) {
            return Opcodes.FCONST_2;
        }
        throw new IndexOutOfBoundsException();
    }

    private int lConstOpcode(long l) {
        if (l == 0L) {
            return Opcodes.LCONST_0;
        } else if (l == 1L) {
            return Opcodes.LCONST_1;
        }
        throw new IndexOutOfBoundsException();
    }

    private int dConstOpcode(double d) {
        if (d == 0d) {
            return Opcodes.DCONST_0;
        } else if (d == 1d) {
            return Opcodes.DCONST_1;
        }
        throw new IndexOutOfBoundsException();
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
}
