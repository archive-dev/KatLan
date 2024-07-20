package org.katarine.codegen;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Utils {
    public static String getMethodDescriptor(Object[] args, Type returnType) {
        String ret = "(";
        for (var arg : args) {
            ret += getObjectDescriptor(arg);
        }
        ret += ")";
        ret+=returnType.getDescriptor();
        return ret;
    }

    public static String getObjectDescriptor(Object obj) {
        if (obj instanceof Variable v) {
            return v.getType().getDescriptor();
        }
        return TypeResolver.getTypeDescriptor(obj.getClass());
    }

    public static List<Consumer<MethodVisitor>> handleObject(Object obj) {
        final List<Consumer<MethodVisitor>> ret = new ArrayList<>();
        switch (obj) {
            case null -> ret.add(mv -> mv.visitInsn(Opcodes.ACONST_NULL));
            case Variable v -> ret.add(mv -> mv.visitVarInsn(v.getType().getLoadCode(), v.getIndex()));
            case Integer i when i >= -1 && i <= 5 -> ret.add(mv -> mv.visitInsn(iConstOpcode(i)));
            case Float f when f >= 0 && f <= 2 -> ret.add(mv -> mv.visitInsn(fConstOpcode(f)));
            case Long l when l >= 0 && l <= 1 -> ret.add(mv -> mv.visitInsn(lConstOpcode(l)));
            case Double d when d >= 0 && d <= 1 -> ret.add(mv -> mv.visitInsn(dConstOpcode(d)));
            default -> ret.add(mv -> mv.visitLdcInsn(obj));
        }
        return ret;
    }

    public static int iConstOpcode(int i) {
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

    public static int fConstOpcode(float f) {
        if (f == 0f) {
            return Opcodes.FCONST_0;
        } else if (f == 1f) {
            return Opcodes.FCONST_1;
        } else if (f == 2f) {
            return Opcodes.FCONST_2;
        }
        throw new IndexOutOfBoundsException();
    }

    public static int lConstOpcode(long l) {
        if (l == 0L) {
            return Opcodes.LCONST_0;
        } else if (l == 1L) {
            return Opcodes.LCONST_1;
        }
        throw new IndexOutOfBoundsException();
    }

    public static int dConstOpcode(double d) {
        if (d == 0d) {
            return Opcodes.DCONST_0;
        } else if (d == 1d) {
            return Opcodes.DCONST_1;
        }
        throw new IndexOutOfBoundsException();
    }
}
