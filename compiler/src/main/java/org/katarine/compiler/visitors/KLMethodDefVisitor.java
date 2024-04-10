package org.katarine.compiler.visitors;

import org.antlr.v4.runtime.misc.Pair;
import org.cojen.maker.ClassMaker;
import org.cojen.maker.MethodMaker;
import org.katarine.compiler.Compiler;
import org.katarine.compiler.antlr4.KatLanBaseVisitor;
import org.katarine.compiler.antlr4.KatLanParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class KLMethodDefVisitor extends KatLanBaseVisitor<Void> {
    ClassMaker cm;

    public KLMethodDefVisitor(ClassMaker cm) {
        this.cm = cm;
    }

    @Override
    public Void visitClassBlock(KatLanParser.ClassBlockContext ctx) {
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

            map.put(cm.addMethod(retType, method.name().getText(), pTypes.toArray(Object[]::new)), new Pair<>(vars, method.block()));
        }

        for (var mm : map.entrySet()) {
            new KLMethodVisitor(mm.getKey(), mm.getValue().a).visit(mm.getValue().b);
        }
        return null;
    }

    private Object getType(String type) {
        Object typeO = Compiler.imports.get(type);
        if (typeO == null) {
            throw new NullPointerException("Unknown type: " + type);
        }
        return typeO;
    }

    @Override
    public Void visitUnnamedClassDef(KatLanParser.UnnamedClassDefContext ctx) {
        return visitClassBlock(ctx.classBlock());
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
