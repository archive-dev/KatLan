package org.katarine.codegen;

import org.objectweb.asm.Opcodes;

/**
 * Provides a convenient way to use {@link String}s as types descriptors
 * and {@link Signature} objects as string signatures.
 * @see Signature
 */
@SuppressWarnings("StaticInitializerReferencesSubClass")
public sealed class Type permits Type.PrimitiveType, Type.SimpleType {
    public static final PrimitiveType INT     = new PrimitiveType(int.class);
    public static final PrimitiveType DOUBLE  = new PrimitiveType(double.class);
    public static final PrimitiveType FLOAT   = new PrimitiveType(float.class);
    public static final PrimitiveType LONG    = new PrimitiveType(long.class);
    public static final PrimitiveType SHORT   = new PrimitiveType(short.class);
    public static final PrimitiveType BYTE    = new PrimitiveType(byte.class);
    public static final PrimitiveType BOOLEAN = new PrimitiveType(boolean.class);
    public static final PrimitiveType CHAR    = new PrimitiveType(char.class);
    public static final PrimitiveType VOID    = new PrimitiveType(void.class);

    public static final Type OBJECT  = new Type(Object.class);

    /**
     * Provides a way to use type names (such as {@code org.example.Example}) to create {@link Type} objects.
     * @see Type
     */
    public static final class SimpleType extends Type {
        public SimpleType(String descriptor, String signature) {
            this(descriptor, new Signature(signature));
        }

        public SimpleType(String descriptor) {
            this(descriptor, new Signature());
        }

        public SimpleType(Class<?> clazz, String signature) {
            this(clazz.descriptorString(), signature);
        }

        public SimpleType(Class<?> clazz) {
            this(clazz.descriptorString());
        }

        public SimpleType(String descriptor, Signature signature) {
            super(TypeResolver.getTypeDescriptor(descriptor), signature);
        }
    }

    public static final class PrimitiveType extends Type {
        PrimitiveType(Class<?> clazz) {
            if (!clazz.isPrimitive()) throw new IllegalArgumentException();
            super(clazz);
        }

        @Override
        public boolean isPrimitive() {
            return true;
        }

        public static int getCastCode(PrimitiveType a, PrimitiveType b) {
            if (a.equals(INT) || a.equals(BYTE) || a.equals(BOOLEAN) || a.equals(CHAR) || a.equals(SHORT)) {
                return getIntCastCode(b);
            } else if (a.equals(LONG)) {
                return getLongCastCode(b);
            } else if (a.equals(FLOAT)) {
                return getFloatCastCode(b);
            } else if (a.equals(DOUBLE)) {
                return getDoubleCastCode(b);
            } else {
                throw new IllegalArgumentException();
            }
        }

        private static int getDoubleCastCode(PrimitiveType other) {
            if (other.equals(INT)) {
                return Opcodes.D2I;
            } else if (other.equals(LONG)) {
                return Opcodes.D2L;
            } else if (other.equals(FLOAT)) {
                return Opcodes.D2F;
            }
            throw new IllegalArgumentException();
        }

        private static int getFloatCastCode(PrimitiveType other) {
            if (other.equals(INT)) {
                return Opcodes.F2I;
            } else if (other.equals(LONG)) {
                return Opcodes.F2L;
            } else if (other.equals(DOUBLE)) {
                return Opcodes.F2D;
            }
            throw new IllegalArgumentException();
        }

        private static int getLongCastCode(PrimitiveType other) {
            if (other.equals(INT)) {
                return Opcodes.L2I;
            } else if (other.equals(FLOAT)) {
                return Opcodes.L2F;
            } else if (other.equals(DOUBLE)) {
                return Opcodes.L2D;
            }
            throw new IllegalArgumentException();
        }

        private static int getIntCastCode(PrimitiveType other) {
            if (other.equals(BYTE)) {
                return Opcodes.I2B;
            } else if (other.equals(SHORT)) {
                return Opcodes.I2S;
            } else if (other.equals(LONG)) {
                return Opcodes.I2L;
            } else if (other.equals(FLOAT)) {
                return Opcodes.I2F;
            } else if (other.equals(DOUBLE)) {
                return Opcodes.I2D;
            }
            throw new IllegalArgumentException();
        }
    }

    private final String descriptor;
    private final Signature signature;

    public Type(String descriptor, String signature) {
        this(descriptor, new Signature(signature));
    }

    public Type(String descriptor) {
        this(descriptor, new Signature());
    }


    public Type(Class<?> clazz) {
        this(clazz.descriptorString());
    }

    public Type(Class<?> clazz, String signature) {
        this(clazz.descriptorString(), signature);
    }

    public Type(String descriptor, Signature signature) {
        if (TypeResolver.isPrimitive(descriptor))
            throw new IllegalArgumentException("For primitive types use defined constants or use PrimitiveType class");
        this.descriptor = descriptor;
        this.signature = signature;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public String getInternalName() {
        return TypeResolver.descriptorToInternal(getDescriptor());
    }

    public Signature getSignature() {
        return signature;
    }

    public int getStoreCode() {
        if (!TypeResolver.isPrimitive(this.getDescriptor())) {
            if (!TypeResolver.isArray(this.getDescriptor()))
                return Opcodes.ASTORE;
            return switch (this.getDescriptor().replaceAll("\\[", "")) {
                case "Z", "I" -> Opcodes.IASTORE;
                case "F" -> Opcodes.FASTORE;
                case "D" -> Opcodes.DASTORE;
                case "J" -> Opcodes.LASTORE;
                case "C" -> Opcodes.CASTORE;
                case "S" -> Opcodes.SASTORE;
                case "B" -> Opcodes.BASTORE;
                default -> Opcodes.AASTORE;
            };
        }
        return switch (this.getDescriptor()) {
            case "Z", "B", "C", "S", "I" -> Opcodes.ISTORE;
            case "F" -> Opcodes.FSTORE;
            case "D" -> Opcodes.DSTORE;
            case "J" -> Opcodes.LSTORE;
            default -> throw new IllegalStateException("Unexpected value: " + this.getDescriptor());
        };
    }

    public int getLoadCode() {
        if (!TypeResolver.isPrimitive(this.getDescriptor())) {
            if (!TypeResolver.isArray(this.getDescriptor()))
                return Opcodes.ALOAD;
            return switch (this.getDescriptor().replaceAll("\\[", "")) {
                case "Z", "I" -> Opcodes.IASTORE;
                case "F" -> Opcodes.FASTORE;
                case "D" -> Opcodes.DASTORE;
                case "J" -> Opcodes.LASTORE;
                case "C" -> Opcodes.CASTORE;
                case "S" -> Opcodes.SASTORE;
                case "B" -> Opcodes.BASTORE;
                default -> Opcodes.AALOAD;
            };
        }
        return switch (this.getDescriptor()) {
            case "Z", "B", "C", "S", "I" -> Opcodes.ILOAD;
            case "F" -> Opcodes.FLOAD;
            case "D" -> Opcodes.DLOAD;
            case "J" -> Opcodes.LLOAD;
            default -> throw new IllegalStateException("Unexpected value: " + this.getDescriptor());
        };
    }

    public int getReturnCode() {
        if (!TypeResolver.isPrimitive(this.getDescriptor())) {
            return Opcodes.ARETURN;
        }
        return switch (this.getDescriptor()) {
            case "Z", "B", "C", "S", "I" -> Opcodes.IRETURN;
            case "F" -> Opcodes.FRETURN;
            case "D" -> Opcodes.DRETURN;
            case "J" -> Opcodes.LRETURN;
            default -> throw new IllegalStateException("Unexpected value: " + this.getDescriptor());
        };
    }

    public int[] getCmpEqCodes() {
        if (!isPrimitive())
            return new int[]{Opcodes.IF_ACMPEQ};
        return switch (this.getDescriptor()) {
            case "Z", "B", "C", "S", "I" -> new int[]{Opcodes.IF_ICMPEQ};
            case "F" -> new int[]{Opcodes.FCMPL, Opcodes.IFEQ};
            case "D" -> new int[]{Opcodes.DCMPL, Opcodes.IFEQ};
            case "J" -> new int[]{Opcodes.LCMP, Opcodes.IFEQ};
            default -> throw new IllegalStateException("Unexpected value: " + this.getDescriptor());
        };
    }

    public int[] getCmpNeCodes() {
        if (!isPrimitive())
            return new int[]{Opcodes.IF_ACMPNE};
        return switch (this.getDescriptor()) {
            case "Z", "B", "C", "S", "I" -> new int[]{Opcodes.IF_ICMPNE};
            case "F" -> new int[]{Opcodes.FCMPL, Opcodes.IFNE};
            case "D" -> new int[]{Opcodes.DCMPL, Opcodes.IFNE};
            case "J" -> new int[]{Opcodes.LCMP, Opcodes.IFNE};
            default -> throw new IllegalStateException("Unexpected value: " + this.getDescriptor());
        };
    }

    public boolean isPrimitive() {
        return TypeResolver.isPrimitive(this.getDescriptor());
    }
}
