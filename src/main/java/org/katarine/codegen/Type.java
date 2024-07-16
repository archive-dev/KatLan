package org.katarine.codegen;

import org.objectweb.asm.Opcodes;

/**
 * Provides a convenient way to use {@link String}s as types descriptors
 * and {@link Signature} objects as string signatures.
 * @see Signature
 */
public sealed class Type permits Type.PrimitiveType, Type.SimpleType {
    public static final PrimitiveType INT     = new PrimitiveType(int.class);
    public static final PrimitiveType DOUBLE  = new PrimitiveType(double.class);
    public static final PrimitiveType FLOAT   = new PrimitiveType(float.class);
    public static final PrimitiveType LONG    = new PrimitiveType(long.class);
    public static final PrimitiveType SHORT   = new PrimitiveType(short.class);
    public static final PrimitiveType BYTE    = new PrimitiveType(byte.class);
    public static final PrimitiveType BOOLEAN = new PrimitiveType(boolean.class);
    public static final PrimitiveType CHAR    = new PrimitiveType(char.class);

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

    private static final class PrimitiveType extends Type {
        public PrimitiveType(Class<?> clazz) {
            super(clazz);
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
        this.descriptor = descriptor;
        this.signature = signature;
    }

    public String getDescriptor() {
        return descriptor;
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
}
