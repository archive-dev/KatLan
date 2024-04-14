package org.katarine.compiler.visitors;

import org.antlr.v4.runtime.misc.Pair;
import org.cojen.maker.ClassMaker;
import org.cojen.maker.MethodMaker;
import org.katarine.compiler.Compiler;
import org.katarine.compiler.antlr4.KatLanBaseVisitor;
import org.katarine.compiler.antlr4.KatLanParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KLMethodDefVisitor extends KatLanBaseVisitor<Void> {
    ClassMaker cm;

    public KLMethodDefVisitor(ClassMaker cm) {
        this.cm = cm;
    }

    @Override
    public Void visitClassBlock(KatLanParser.ClassBlockContext ctx) {
        if (ctx==null) return null;
        var methods = ctx.methodDef();
        HashMap<MethodMaker, Pair<HashMap<String, Integer>, KatLanParser.BlockContext>> map = new HashMap<>();
        for (var method : methods) {
            HashMap<String, Integer> vars = new HashMap<>();

            Object retType = getType(method.type().getText());

            List<Object> pTypes = new ArrayList<>();

            int i = 0;
            if (method.parameters() != null) {
                for (var p : method.parameters().parameter()) {
                    Object type = getType(p.type().getText());
                    pTypes.add(type);
                    vars.put(p.name().getText(), i);
                    i++;
                }
            }

            MethodMaker mm = cm.addMethod(retType, method.name().getText(), pTypes.toArray(Object[]::new));

            if (method.access().PUBLIC() != null)    mm.public_();
            if (method.access().PRIVATE() != null)   mm.private_();
            if (method.access().PROTECTED() != null) mm.protected_();
            if (method.access().STATIC() != null)    mm.static_();
            if (method.access().FINAL() != null)     mm.final_();

            map.put(mm, new Pair<>(vars, method.block()));
        }

        for (var mm : map.entrySet()) {
            new KLMethodVisitor(mm.getKey(), mm.getValue().a).visitLines(mm.getValue().b.lineBlock());
        }
        return null;
    }

    private Object getType(String type) {
        String t = type;
        if (type.contains("[]")) {
            t = type.replaceAll("\\[]", "");
        }

        Object typeO = Compiler.imports.get(t);

        StringBuilder sb = new StringBuilder();
        while (type.contains("[]")) {
            sb.append("[]");
            type = type.replace("[]", "");
        }

        if (typeO == null) {
            throw new NullPointerException("Unknown type: " + type);
        }
        if (typeO instanceof Class<?> tc) {
            typeO = tc.getTypeName();
        }

        typeO = typeO+sb.toString();

        return typeO;
    }

    @Override
    public Void visitUnnamedClassDef(KatLanParser.UnnamedClassDefContext ctx) {
        visitClassBlock(ctx.classBlock());
        if (ctx.block() != null) {
            MethodMaker mm = cm.addMethod(null, "main", String[].class).public_().static_();
            HashMap<String, Integer> vars = new HashMap<>();
            vars.put("args", 0);
            new KLMethodVisitor(mm, vars).visitBlock(ctx.block());
        }
        return null;
    }

    @Override
    public Void visitClassDef(KatLanParser.ClassDefContext ctx) {
        return visitClassBlock(ctx.classBlock());
    }

    @Override
    public Void visitInterfaceDef(KatLanParser.InterfaceDefContext ctx) {
        return visitClassBlock(ctx.classBlock());
    }
}
