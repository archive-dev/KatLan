package org.katarine.codegen;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Opcodes;

public class FieldBuilder extends AbstractBytecodeBuilder<FieldVisitor> {
    protected ClassVisitor cv;

    private int access = Opcodes.ACC_PRIVATE; // private by default
    private String name;
    private String descriptor;
    private String signature = "";

    protected FieldBuilder(ClassVisitor cv) {
        super(null);
        this.cv = cv;
    }

    public static FieldBuilder from(ClassVisitor cv) {
        return new FieldBuilder(cv);
    }

    public final FieldBuilder setAccess(int access) {
        this.access = access;
        return this;
    }

    public final FieldBuilder addModifier(int modifier) {
        this.access |= modifier;
        return this;
    }

    public final FieldBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public final FieldBuilder setDescriptor(String descriptor) {
        this.descriptor = descriptor;
        return this;
    }

    public final FieldBuilder setDescriptor(Class<?> type) {
        this.descriptor = TypeResolver.getTypeDescriptor(type);
        return this;
    }

    public final FieldBuilder setDescriptorSimple(String simpleDescriptor) {
        this.descriptor = TypeResolver.getTypeDescriptor(simpleDescriptor);
        return this;
    }

    public final FieldBuilder setSignature(String signature) {
        this.signature = signature;
        return this;
    }

    @Override
    public FieldVisitor build() {
        return cv.visitField(access, name, descriptor, signature, null);
    }

    public final int getAccess() {
        return access;
    }

    public final String getName() {
        return name;
    }

    public final String getDescriptor() {
        return descriptor;
    }

    public final String getSignature() {
        return signature;
    }
}
