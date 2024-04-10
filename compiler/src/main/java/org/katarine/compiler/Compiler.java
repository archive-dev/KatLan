package org.katarine.compiler;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Pair;
import org.cojen.maker.ClassMaker;
import org.cojen.maker.FieldMaker;
import org.katarine.compiler.antlr4.KatLanLexer;
import org.katarine.compiler.antlr4.KatLanParser;
import org.katarine.compiler.visitors.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Compiler {
    public static final HashMap<String, Object> imports = new HashMap<>();
    static {
        imports.put("obj",    Object.class);
        imports.put("str",    String.class);
        imports.put("float",  float.class);
        imports.put("int",    int.class);
        imports.put("void",   void.class);
        imports.put("null",   void.class);
        imports.put("bool",   boolean.class);
        imports.put("byte",   byte.class);
        imports.put("char",   char.class);
        imports.put("short",  short.class);
        imports.put("long",   long.class);
        imports.put("double", double.class);
    }

    public static final HashMap<String, FieldMaker> fields = new HashMap<>();
    public static String package_;

    public static void main(String[] args) throws IOException {
        CharStream cs;

        cs = CharStreams.fromFileName(args[0]);
        KatLanLexer klx = new KatLanLexer(cs);
        CommonTokenStream cts = new CommonTokenStream(klx);
        KatLanParser klp = new KatLanParser(cts);

        KatLanParser.ClassContext cc = klp.class_();
        var ibc = cc.importBlock();
        var pc = cc.package_();
        package_ = new KLPackageVisitor().visit(pc);
        imports.putAll(new KLImportVisitor().visit(ibc));
        ParserRuleContext r = new KLClassVisitor().visitClass(cc);
        String className = args[0].substring(0, args[0].lastIndexOf('.'));
        ClassMaker cm;

        if (r instanceof KatLanParser.ClassDefContext) {
            System.out.println("compiling class");
            className = ((KatLanParser.ClassDefContext) r).name(0).getText();
            cm = ClassMaker.beginExternal(className).extend(Object.class).public_();
            imports.put(cm.name(), cm);
            cm.addConstructor().public_();
            fields.putAll( new KLFieldsVisitor(cm).visitClassDef((KatLanParser.ClassDefContext) r));
            if (((KatLanParser.ClassDefContext) r).ABSTRACT_KEYWORD() != null) cm.abstract_();

            new KLMethodDefVisitor(cm).visitClassDef((KatLanParser.ClassDefContext) r);
        } else if (r instanceof KatLanParser.UnnamedClassDefContext) {
            System.out.println("compiling unnamed class");
            cm = ClassMaker.beginExternal(className).public_();
            imports.put(cm.name(), cm);
            cm.addConstructor();
            fields.putAll( new KLFieldsVisitor(cm).visitUnnamedClassDef((KatLanParser.UnnamedClassDefContext) r));

            new KLMethodDefVisitor(cm).visitUnnamedClassDef((KatLanParser.UnnamedClassDefContext) r);
        } else {
            System.out.println("compiling interface");
            className = ((KatLanParser.InterfaceDefContext) r).name(0).getText();
            cm = ClassMaker.beginExternal(className).public_().interface_();
            imports.put(cm.name(), cm);
            fields.putAll(new KLFieldsVisitor(cm).visitInterfaceDef((KatLanParser.InterfaceDefContext) r));
            cm.interface_();
            new KLMethodDefVisitor(cm).visitInterfaceDef((KatLanParser.InterfaceDefContext) r);
        }

        File output = new File(cm.name() + ".class");
        try (FileOutputStream fos = new FileOutputStream(output)) {
            cm.finishTo(fos);
        }

//        ClassMaker cm = ClassMaker.beginExternal().public_();
//        MethodMaker mm = cm.addMethod(null, "main", String[].class);

//        mm = mm.public_().static_();
    }
}
