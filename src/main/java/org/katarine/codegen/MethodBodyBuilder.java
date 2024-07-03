package org.katarine.codegen;

import org.objectweb.asm.MethodVisitor;

public class MethodBodyBuilder extends AbstractBytecodeBuilder<MethodVisitor> {
    protected MethodBodyBuilder(MethodVisitor visitor) {
        super(visitor);
    }

    public static MethodBodyBuilder from(MethodVisitor mv) {
        return new MethodBodyBuilder(mv);
    }
}
