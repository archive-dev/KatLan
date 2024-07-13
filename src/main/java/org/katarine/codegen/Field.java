package org.katarine.codegen;

import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Opcodes;

import java.util.function.Supplier;

public class Field extends Variable implements Member {
    private int modifiers = Opcodes.ACC_PRIVATE;

    public Field(Type type, String name, ClassGenerator.ClassScope ownerScope) {
        super(type, name, ownerScope);
    }

    private final Supplier<FieldVisitor> fvSupplier = () -> getOwner().getClassWriter().visitField(
            modifiers,
            getName(),
            getType().getDescriptor(),
            getType().getSignature().getSignature(),
            null);

    @Override
    public ClassGenerator getOwner() {
        return ((ClassGenerator.ClassScope) getOwnerScope()).getClazz();
    }

    @Override
    public void end() {
        fvSupplier.get();
    }
}
