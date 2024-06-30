package org.katarine.katlan.compiler.codegen;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class ClassBuilder {
    private final ClassWriter cw;

    public static ClassBuilder from(String className) {
        var cb = new ClassBuilder();
        cb.cw.visit(
                Opcodes.V17,
                Opcodes.ACC_PUBLIC,
                className,
                null,
                Type.getInternalName(Object.class),
                null
        );
        return cb;
    }

    /**
     *
     * @param cw ClassWriter, on which method {@code visit} was called.
     * @return ClassBuilder
     */
    public static ClassBuilder from(ClassWriter cw) {
        return new ClassBuilder(cw);
    }

    private ClassBuilder() {
        this.cw = new ClassWriter(0);
    }
    private ClassBuilder(ClassWriter cw) {
        this.cw = cw;
    }


    public FieldBuilder addField(int access, Class<?> type, String name, String signature) {
        return FieldBuilder.from(cw.visitField(access, name, Type.getDescriptor(type), signature, null));
    }

    public FieldBuilder addField() {
        return FieldBuilder.from(this.cw);
    }
}
