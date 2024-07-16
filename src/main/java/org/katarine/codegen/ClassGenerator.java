package org.katarine.codegen;

import org.katarine.katlan.lib.struct.Pair;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.util.ArrayList;

public class ClassGenerator implements Accessible {
    private final ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
    private int modifiers = 0;

    public static class ClassScope extends CodeScope {
        private final ClassGenerator clazz;

        public ClassScope(ClassGenerator clazz) {
            this.clazz = clazz;
        }

        public ClassGenerator getClazz() {
            return clazz;
        }
    }

    private final ClassScope scope = new ClassScope(this);

    private final ArrayList<Member> members = new ArrayList<>();

    protected final void addMember(Member member) {
        this.members.add(member);
    }

    public Method addMethod(String name, String signature, Type returnType, Type[] parameterTypes) {
        var m = new Method(this, name, signature, returnType, parameterTypes);
        addMember(m);
        return m;
    }

    public Method addMethod(String name, Signature signature, Type returnType, Type[] parameterTypes) {
        var m = new Method(this, name, signature, returnType, parameterTypes);
        addMember(m);
        return m;
    }

    public Method addMethod(String name, String signature, Type returnType, Pair<String, Type>[] parameters) {
        var m = new Method(this, name, signature, returnType, parameters);
        addMember(m);
        return m;
    }

    public Method addMethod(String name, Signature signature, Type returnType, Pair<String, Type>[] parameters) {
        var m = new Method(this, name, signature, returnType, parameters);
        addMember(m);
        return m;
    }


    public Field addField(Type type, String name) {
        var f = new Field(type, name, this.scope);
        addMember(f);
        return f;
    }

    public final void finish() {
        members.forEach(Member::end);
    }

    public final byte[] toBytes() {
        finish();
        return cw.toByteArray();
    }

    public final ClassWriter getClassWriter() {
        return this.cw;
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
