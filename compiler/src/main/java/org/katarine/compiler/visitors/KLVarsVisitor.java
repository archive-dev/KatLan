package org.katarine.compiler.visitors;

import org.antlr.v4.runtime.misc.Pair;
import org.katarine.compiler.Compiler;
import org.katarine.compiler.antlr4.KatLanBaseVisitor;
import org.katarine.compiler.antlr4.KatLanParser;

import java.util.HashMap;

public class KLVarsVisitor extends KatLanBaseVisitor<HashMap<String, Pair<Object, Object>>> {
    @Override
    public HashMap<String, Pair<Object, Object>> visitClassDef(KatLanParser.ClassDefContext ctx) {
        HashMap<String, Pair<Object, Object>> map = new HashMap<>();
        ctx.classBlock().var().forEach(v -> {
            if (v.varDef().varDef0() != null) {
                Object val;
                if (v.varDef().varDef0().value() != null)
                    map.put(v.varDef().varDef0().NAME().getText(), new Pair<>(Compiler.imports.get(v.varDef().varDef0().type().getText()), v.varDef().varDef0().value().getText()));
                else
                    map.put(v.varDef().varDef0().NAME().getText(), new Pair<>(Compiler.imports.get(v.varDef().varDef0().type().getText()), null));
            } else {
                String type = v.varDef().varDef1().type().getText();
                v.varDef().varDef1().NAME().forEach(n -> map.put(n.getText(), new Pair<>(type, null)));
            }
        });
        return map;
    }

    @Override
    public HashMap<String, Pair<Object, Object>> visitUnnamedClassDef(KatLanParser.UnnamedClassDefContext ctx) {
        HashMap<String, Pair<Object, Object>> map = new HashMap<>();
        ctx.classBlock().var().forEach(vd -> {
            if (vd.varDef().varDef0() != null) {
                map.put(vd.varDef().varDef0().NAME().getText(), new Pair<>(Compiler.imports.get(vd.varDef().varDef0().type().getText()), vd.varDef().varDef0().value().getText()));
            } else {
                String type = vd.varDef().varDef1().type().getText();
                vd.varDef().varDef1().NAME().forEach(n -> map.put(n.getText(), new Pair<>(type, null)));
            }
        });
        return map;
    }

    @Override //TODO: make 'em methods!
    public HashMap<String, Pair<Object, Object>> visitInterfaceDef(KatLanParser.InterfaceDefContext ctx) {
        HashMap<String, Pair<Object, Object>> map = new HashMap<>();
        ctx.classBlock().var().forEach(vd -> {
            if (vd.varDef().varDef0() != null) {
                map.put(vd.varDef().varDef0().NAME().getText(), new Pair<>(Compiler.imports.get(vd.varDef().varDef0().type().getText()), vd.varDef().varDef0().value().getText()));
            } else {
                String type = vd.varDef().varDef1().type().getText();
                vd.varDef().varDef1().NAME().forEach(n -> map.put(n.getText(), new Pair<>(type, null)));
            }
        });
        return map;
    }
}
