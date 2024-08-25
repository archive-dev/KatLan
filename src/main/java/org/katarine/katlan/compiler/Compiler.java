package org.katarine.katlan.compiler;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.katarine.codegen.Method;
import org.katarine.codegen.Type;
import org.katarine.katlan.antlr4.KatLanLexer;
import org.katarine.katlan.antlr4.KatLanParser;
import org.katarine.katlan.compiler.visitors.MethodImportsVisitor;
import org.katarine.katlan.compiler.visitors.TypeImportsVisitor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Compiler {
    public final HashMap<String, Type> typeImports = new HashMap<>();
    public final HashMap<String, String> methodImports = new HashMap<>();
    {
        typeImports.put("obj",    Type.OBJECT);
        typeImports.put("str",    Type.STRING);
        typeImports.put("int",    Type.INT);
        typeImports.put("long",   Type.LONG);
        typeImports.put("bool",   Type.BOOLEAN);
        typeImports.put("char",   Type.CHAR);
        typeImports.put("byte",   Type.BYTE);
        typeImports.put("float",  Type.FLOAT);
        typeImports.put("double", Type.DOUBLE);
        typeImports.put("short",  Type.SHORT);
        typeImports.put("null",   Type.VOID);
        typeImports.put("void",   Type.VOID);

        methodImports.put("println", "System.out.println");
    }
    public final List<Method> methods = new ArrayList<>();

    public void compile(String fileName) throws IOException {
        CharStream cs = CharStreams.fromFileName(fileName);
        KatLanLexer klx = new KatLanLexer(cs);
        CommonTokenStream cts = new CommonTokenStream(klx);
        KatLanParser klp = new KatLanParser(cts);

        var ctx = klp.class_();

        typeImports.putAll(new TypeImportsVisitor().visitImportBlock(ctx.importBlock()));
        methodImports.putAll(new MethodImportsVisitor().visitImportBlock(ctx.importBlock()));


    }

    public final Type getImportedType(String typeAlias) {
        if (typeImports.containsKey(typeAlias)) return typeImports.get(typeAlias);
        return new Type.SimpleType(typeAlias);
    }

    public static void main(String[] args) throws IOException {
        new Compiler().compile(args[0]);
    }
}
