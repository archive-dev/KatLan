package org.katarine.codegen;

import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Opcodes;

import java.util.function.Supplier;

@SuppressWarnings("unchecked")
public class Field extends Variable implements Member, Accessible {
    private int modifiers = Opcodes.ACC_PRIVATE;

    public Field(Type type, String name, ClassGenerator.ClassScope ownerScope) {
        super(type, name, ownerScope, null, 0);
    }

    private final Supplier<FieldVisitor> fvSupplier = () -> getOwner().getClassWriter().visitField(
            modifiers,
            getName(),
            getType().getDescriptor(),
            getType().getSignature().getSignature(),
            null);

    public Field addModifier(int mod) {
        this.modifiers |= mod;
        return this;
    }

    @Override
    public ClassGenerator getOwner() {
        return ((ClassGenerator.ClassScope) getOwnerScope()).getClazz();
    }

    @Override
    public void end() {
        fvSupplier.get();
    }

    @Override
    public boolean isStatic() {
        return isStatic;
    }

    @Override
    public boolean isFinal() {
        return isFinal;
    }

    @Override
    public boolean isPublic() {
        return isPublic;
    }

    @Override
    public boolean isPrivate() {
        return isPrivate;
    }

    @Override
    public boolean isProtected() {
        return isProtected;
    }

    @Override
    public boolean isAbstract() {
        return isAbstract;
    }

    private boolean isStatic = false;
    @Override
    public <T extends Accessible> T static_() {
        this.modifiers |= Opcodes.ACC_STATIC;
        isStatic = true;
        return (T) this;
    }

    private boolean isFinal = false;
    @Override
    public <T extends Accessible> T final_() {
        this.modifiers |= Opcodes.ACC_FINAL;
        isFinal = true;
        return (T) this;
    }

    private boolean isPublic = false;
    @Override
    public <T extends Accessible> T public_() {
        this.modifiers |= Opcodes.ACC_PUBLIC;
        isPublic = true;
        return (T) this;
    }

    private boolean isPrivate = false;
    @Override
    public <T extends Accessible> T private_() {
        this.modifiers |= Opcodes.ACC_PRIVATE;
        isPrivate = true;
        return (T) this;
    }

    private boolean isProtected = false;
    @Override
    public <T extends Accessible> T protected_() {
        this.modifiers |= Opcodes.ACC_PROTECTED;
        isProtected = true;
        return (T) this;
    }

    private boolean isAbstract = false;
    @Override
    public <T extends Accessible> T abstract_() {
        this.modifiers |= Opcodes.ACC_ABSTRACT;
        isAbstract = true;
        return (T) this;
    }
}
