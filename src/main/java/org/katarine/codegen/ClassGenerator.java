package org.katarine.codegen;

import org.katarine.katlan.lib.struct.Pair;
import org.objectweb.asm.ClassWriter;

import java.util.ArrayList;

public class ClassGenerator {
    private final ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);

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

    public Method addMethod(String name, String signature, Type returnType, Type... parameterTypes) {
        var m = new Method(this, name, signature, returnType, parameterTypes);
        addMember(m);
        return m;
    }

    public Method addMethod(String name, Signature signature, Type returnType, Type... parameterTypes) {
        var m = new Method(this, name, signature, returnType, parameterTypes);
        addMember(m);
        return m;
    }

    public Method addMethod(String name, String signature, Type returnType, Pair<String, Type>... parameters) {
        var m = new Method(this, name, signature, returnType, parameters);
        addMember(m);
        return m;
    }

    public Method addMethod(String name, Signature signature, Type returnType, Pair<String, Type>... parameters) {
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
}
