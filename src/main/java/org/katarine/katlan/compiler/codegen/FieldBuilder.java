package org.katarine.katlan.compiler.codegen;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Type;

public class FieldBuilder extends VisitorBuilder<FieldVisitor> {
    private final ClassWriter cw;
    private int access;
    private String typeDescriptor;
    private String name;
    private String signature;
    private Object value;

    private FieldVisitor fv;
    private FieldBuilder(FieldVisitor fv) {
        this.cw = null;
        this.fv = fv;
    }
    private FieldBuilder(ClassWriter cw) {
        this.cw = cw;
    }

    public static FieldBuilder from(FieldVisitor fv) {
        return new FieldBuilder(fv);
    }

    public static FieldBuilder from(ClassWriter cw) {
        return new FieldBuilder(cw);
    }

    public static FieldBuilder from(ClassWriter cw, int access, Class<?> type, String name, String signature) {
        var ret = new FieldBuilder(cw);
        ret.access = access;
        ret.typeDescriptor = Type.getDescriptor(type);
        ret.name = name;
        ret.signature = signature;
        return ret;
    }

    public ClassWriter cw() {
        return cw;
    }

    public int access() {
        return access;
    }

    public FieldBuilder setAccess(int access) {
        this.access = access;
        return this;
    }

    public String typeDescriptor() {
        return typeDescriptor;
    }

    public FieldBuilder setTypeDescriptor(String typeDescriptor) {
        this.typeDescriptor = typeDescriptor;
        return this;
    }

    public String name() {
        return name;
    }

    public FieldBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String signature() {
        return signature;
    }

    public FieldBuilder setSignature(String signature) {
        this.signature = signature;
        return this;
    }

    public Object value() {
        return value;
    }

    public FieldBuilder setValue(Object value) {
        this.value = value;
        return this;
    }

    public FieldVisitor fv() {
        return fv;
    }

    public FieldBuilder setFv(FieldVisitor fv) {
        this.fv = fv;
        return this;
    }

    @Override
    public FieldVisitor build() {
        if (cw == null)
            return fv;
        return cw.visitField(access, name, typeDescriptor, signature, value);
    }
}
