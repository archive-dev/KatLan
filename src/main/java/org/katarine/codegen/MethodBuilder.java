package org.katarine.codegen;

import org.objectweb.asm.ClassVisitor;

import java.util.ArrayList;

public class MethodBuilder extends AbstractBytecodeBuilder<MethodBodyBuilder> {
    protected ClassVisitor cv;

    private int access;
    private String name;
    private final ArrayList<String> parameterTypes = new ArrayList<>();
    private String returnType;
    private String descriptor;
    private String signature;
    private final ArrayList<String> exceptions = new ArrayList<>();

    protected MethodBuilder(ClassVisitor cv) {
        super(null);
        this.cv = cv;
    }

    public static MethodBuilder from(ClassVisitor cv) {
        return new MethodBuilder(cv);
    }

    public final MethodBuilder setAccess(int access) {
        this.access = access;
        return this;
    }

    public final MethodBuilder addAccessModifier(int modifier) {
        this.access |= modifier;
        return this;
    }

    public final MethodBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public final MethodBuilder addParameter(Class<?> type) {
        this.parameterTypes.add(TypeResolver.getTypeDescriptor(type));
        updateDescriptor();
        return this;
    }

    public final MethodBuilder addParameter(String type) {
        this.parameterTypes.add(type);
        updateDescriptor();
        return this;
    }

    public final MethodBuilder addParameterSimple(String simpleType) {
        this.parameterTypes.add(TypeResolver.getTypeDescriptor(simpleType));
        updateDescriptor();
        return this;
    }

    public final MethodBuilder setReturnType(Class<?> type) {
        this.returnType = TypeResolver.getTypeDescriptor(type);
        updateDescriptor();
        return this;
    }

    public final MethodBuilder setReturnTypeSimple(String simpleType) {
        this.returnType = TypeResolver.getTypeDescriptor(simpleType);
        updateDescriptor();
        return this;
    }

    public final MethodBuilder setReturnType(String type) {
        this.returnType = type;
        updateDescriptor();
        return this;
    }

    public final MethodBuilder setSignature(String signature) {
        this.signature = signature;
        return this;
    }

    public final MethodBuilder addException(String type) {
        this.exceptions.add(type);
        return this;
    }

    public final MethodBuilder addExceptionSimple(String simpleType) {
        this.exceptions.add(TypeResolver.getTypeDescriptor(simpleType));
        return this;
    }

    public final MethodBuilder addException(Class<? extends Throwable> type) {
        this.exceptions.add(TypeResolver.getTypeDescriptor(type));
        return this;
    }

    private void updateDescriptor() {
        this.descriptor = "(";
        for (var type : parameterTypes) {
            descriptor += type;
        }
        descriptor += ")";
        descriptor += returnType;
    }

    @Override
    public MethodBodyBuilder build() {
        return this.visitor = MethodBodyBuilder.from(cv.visitMethod(
                access,
                name,
                descriptor,
                signature,
                exceptions.toArray(String[]::new)
        ));
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

    @SuppressWarnings("unchecked")
    public final ArrayList<String> getExceptions() {
        return (ArrayList<String>) exceptions.clone();
    }
}
