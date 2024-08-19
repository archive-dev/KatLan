package org.katarine.katlan.compiler;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.katarine.codegen.*;
import org.katarine.katlan.antlr4.KatLanLexer;
import org.katarine.katlan.antlr4.KatLanParser;
import org.katarine.katlan.compiler.visitors.MethodImportsVisitor;
import org.katarine.katlan.compiler.visitors.TypeImportsVisitor;
import org.katarine.katlan.lib.ClassReference;
import org.katarine.katlan.lib.struct.Pair;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Compiler {
    public static void main(String[] args) throws IOException {
//        testClassCreationASM();
//        testClassCreationCG();
        CharStream cs = CharStreams.fromFileName(args[0]);
        KatLanLexer klx = new KatLanLexer(cs);
        CommonTokenStream cts = new CommonTokenStream(klx);
        KatLanParser klp = new KatLanParser(cts);

//        klp.class_();
        System.out.println(new MethodImportsVisitor().visitImportBlock(klp.class_().importBlock()));
        System.out.println(new TypeImportsVisitor().visitImportBlock(klp.class_().importBlock()));
    }

    public static void testClassCreationCG() throws IOException {
        var cg = new ClassGenerator("Example", new Type(Object.class));

        var empty = new Type[0];

        var constructor = cg.addMethod("<init>", new Signature(), Type.VOID, empty);
        constructor.super_().invokeVoid(MethodType.SPECIAL, "<init>", new Object[0]);
        constructor.return_();

        Method main = cg.addMethod("main", new Signature(), new Type(void.class),
                new Pair[]{new Pair("a", new Type(String.class)), new Pair("b", new Type(String.class))}).static_();
        var leps = main.var(new Type(String.class), "leps");
//        var out = ;
        main.ifEqElse(main.param("a"), main.param("b"),
                () -> leps.set("true"),
                () -> leps.set("false"));
        main.var(new Type(System.class), "out")
                .field(true, "out", new Type(PrintStream.class))
                .invokeVoid(MethodType.VIRTUAL, "println", new Object[]{leps});
        main.return_();
        byte[] bytes = cg.toBytes();

        var p = Paths.get("Example.class");
        if (!Files.exists(p))
            p = Files.createFile(p);
        Files.write(p, bytes);
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
