package org.katarine.katlan.compiler;

import org.katarine.codegen.ClassGenerator;
import org.katarine.codegen.TypeResolver;
import org.katarine.katlan.lib.ClassReference;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Compiler {
    public static void main(String[] args) throws IOException {
        testClassCreationASM();
    }

    public static void testClassCreationCG() {
        var cg = new ClassGenerator();
    }

    public static void testClassCreationASM() throws IOException {
        var visitor = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
        int version = Opcodes.V17;
        int access = Opcodes.ACC_PUBLIC;
        String name = TypeResolver.getInternalTypeName("Example");
        String signature = null;
        String superName = TypeResolver.getInternalTypeName(Object.class);
        ArrayList<String> interfaces = new ArrayList<>();

        visitor.visit(version, access, name, signature, superName, interfaces.toArray(String[]::new));
        var klclass = visitor.visitField(
                Opcodes.ACC_PUBLIC | Opcodes.ACC_FINAL | Opcodes.ACC_STATIC,
                "klclass",
                TypeResolver.getTypeDescriptor(ClassReference.class),
                null,
                null
        );
        klclass.visitEnd();

        var con = visitor.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        con.visitVarInsn(Opcodes.ALOAD, 0);
        con.visitMethodInsn(Opcodes.INVOKESPECIAL, TypeResolver.getInternalTypeName(Object.class), "<init>", "()V", false);
        con.visitInsn(Opcodes.RETURN);
        con.visitMaxs(0, 0);
        con.visitEnd();

        var clinit = visitor.visitMethod(Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC, "<clinit>", "()V", null, null);
        clinit.visitInsn(Opcodes.ACONST_NULL);
        clinit.visitFieldInsn(Opcodes.PUTSTATIC, name, "klclass", TypeResolver.getTypeDescriptor(ClassReference.class));
        clinit.visitInsn(Opcodes.RETURN);
        clinit.visitMaxs(0, 0);
        clinit.visitEnd();

        var main = visitor.visitMethod(
                Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC,
                "main",
                "([Ljava/lang/String;)V",
                null,
                null
        );
        main.visitFieldInsn(Opcodes.GETSTATIC, TypeResolver.getInternalTypeName(System.class), "out", TypeResolver.getTypeDescriptor(PrintStream.class));
        main.visitLdcInsn("Hello world!");
        main.visitMethodInsn(Opcodes.INVOKEVIRTUAL, TypeResolver.getInternalTypeName(PrintStream.class), "println",
                "(Ljava/lang/String;)V", false);
        main.visitInsn(Opcodes.RETURN);
        main.visitMaxs(0, 0);
        main.visitEnd();

        byte[] bytes = visitor.toByteArray();
        var p = Paths.get("Example.class");
        if (!Files.exists(p))
            p = Files.createFile(p);
        Files.write(p, bytes);
    }
}
