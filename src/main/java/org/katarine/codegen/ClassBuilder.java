package org.katarine.codegen;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.util.ArrayList;

public class ClassBuilder extends AbstractBytecodeBuilder<ClassVisitor> {
    private int version = Opcodes.V17;
    private int access = Opcodes.ACC_PUBLIC;
    private String pkg = "";
    private String name;
    private String signature;
    private String superName = TypeResolver.getInternalTypeName(Object.class);
    private final ArrayList<String> interfaces = new ArrayList<>();

    public ClassBuilder() {
        super(new ClassWriter(0));
    }

    // version
    public final ClassBuilder setVersion(int version) {
        this.version = version;
        return this;
    }

    // access
    public final ClassBuilder setAccess(int access) {
        this.access = access;
        return this;
    }

    public final ClassBuilder addModifier(int access) {
        this.access |= access;
        return this;
    }

    // pkg
    public final ClassBuilder setPackageName(String packageName) {
        this.pkg = packageName;
        return this;
    }

    // name
    private boolean isNameSet = false;
    public final ClassBuilder setName(String name) {
        this.name = TypeResolver.getInternalTypeName(this.pkg+name);
        this.isNameSet = true;
        return this;
    }

    // signature
    public final ClassBuilder setSignature(String signature) {
        this.signature = signature;
        return this;
    }

    // superName
    public final ClassBuilder extend(String superName) {
        this.superName = superName;
        return this;
    }

    public final ClassBuilder extend(Class<?> superClass) {
        this.superName = TypeResolver.getInternalTypeName(superClass);
        return this;
    }

    public final ClassBuilder extendsSimple(String simpleSuperName) {
        this.superName = TypeResolver.getInternalTypeName(simpleSuperName);
        return this;
    }

    // interfaces
    public final ClassBuilder implement(String interfaceName) {
        this.interfaces.add(interfaceName);
        return this;
    }

    public final ClassBuilder implementSimple(String simpleInterfaceName) {
        this.interfaces.add(TypeResolver.getInternalTypeName(simpleInterfaceName));
        return this;
    }

    public final ClassBuilder implement(Class<?> interfaceClass) {
        this.interfaces.add(TypeResolver.getInternalTypeName(interfaceClass));
        return this;
    }

    private boolean isVisitCalled = false;
    public final MethodBuilder addMethod() {
        checkVisit();
        return addMethodImpl();
    }

    public final FieldBuilder addField() {
        checkVisit();
        return addFieldImpl();
    }

    protected MethodBuilder addMethodImpl() {
        return null;
    }

    protected FieldBuilder addFieldImpl() {
        return FieldBuilder.from(visitor);
    }

    private void checkVisit() {
        if (isVisitCalled) return;
        if (!isNameSet) throw new IllegalStateException();
        visitor.visit(version, access, name, signature, superName, interfaces.toArray(String[]::new));
        /* this thing must be in KatLan implementation of codegen.
        var klclass = visitor.visitField(
                Opcodes.ACC_PUBLIC | Opcodes.ACC_FINAL | Opcodes.ACC_STATIC,
                "klclass",
                TypeResolver.getTypeDescriptor(ClassLink.class),
                null,
                null
        );
        klclass.visitEnd();

        var clinit = visitor.visitMethod(Opcodes.ACC_STATIC, "<clinit>", "<clinit>()V", null, null);
        */
        isVisitCalled = true;
    }

    @Override
    public ClassVisitor build() {
        return super.build();
    }

    public int version() {
        return version;
    }

    public int access() {
        return access;
    }

    public String name() {
        return name;
    }

    public String signature() {
        return signature;
    }

    public String superName() {
        return superName;
    }

    @SuppressWarnings("unchecked")
    public ArrayList<String> interfaces() {
        return (ArrayList<String>) interfaces.clone();
    }
}
