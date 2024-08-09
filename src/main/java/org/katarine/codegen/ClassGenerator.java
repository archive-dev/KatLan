package org.katarine.codegen;

import org.katarine.katlan.lib.struct.Pair;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class ClassGenerator implements Accessible {
    private final String name;
    private final Type type;
    private final Type superType;
    private final ArrayList<Type> interfaces = new ArrayList<>();

    private final ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
    private int modifiers = 0;

    private boolean isInterface = false;

    public ClassGenerator(String name, Type superType) {
        this.name = name;
        this.type = new Type.SimpleType(name);
        this.superType = superType;
    }

    public boolean isInterface() {
        return isInterface;
    }

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

    private boolean isFinished = false;
    public final void finish() {
        if (isFinished) throw new IllegalStateException();
        cw.visit(Opcodes.V17,
                modifiers,
                TypeResolver.getInternalTypeName(name),
                type.getSignature().getSignature(),
                superType.getInternalName(),
                interfaces.stream()
                        .map(Type::getInternalName)
                        .toArray(String[]::new)
        );
        members.forEach(Member::end);
        isFinished = true;
    }

    public final byte[] toBytes() {
        if (!isFinished)
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

    public <T extends Accessible> T interface_() {
        this.modifiers |= Opcodes.ACC_INTERFACE;
        isInterface = true;
        return (T) this;
    }

    public final Type getType() {
        return type;
    }

    public final Type getSuperType() {
        return superType;
    }

    public final ArrayList<Type> getInterfaces() {
        return (ArrayList<Type>) interfaces.clone();
    }

    public String getName() {
        return name;
    }
}
