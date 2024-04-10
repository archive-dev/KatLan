package org.katarine.compiler.visitors;

import org.antlr.v4.runtime.misc.Pair;
import org.cojen.maker.ClassMaker;
import org.cojen.maker.FieldMaker;
import org.katarine.compiler.Compiler;
import org.katarine.compiler.antlr4.KatLanBaseVisitor;
import org.katarine.compiler.antlr4.KatLanParser;

import java.util.HashMap;
import java.util.HashSet;

public class KLFieldsVisitor extends KatLanBaseVisitor<HashMap<String, FieldMaker>> {
    ClassMaker cm;

    public KLFieldsVisitor(ClassMaker cm) {
        this.cm = cm;
    }

    @Override
    public HashMap<String, FieldMaker> visitClassDef(KatLanParser.ClassDefContext ctx) {
        return addFields(ctx.classBlock());
    }

    @Override
    public HashMap<String, FieldMaker> visitUnnamedClassDef(KatLanParser.UnnamedClassDefContext ctx) {
        return addFields(ctx.classBlock());
    }

    @Override
    public HashMap<String, FieldMaker> visitInterfaceDef(KatLanParser.InterfaceDefContext ctx) {
        return addFields(ctx.classBlock());
    }

    private HashMap<String, FieldMaker> addFields(KatLanParser.ClassBlockContext cb) {
        final HashMap<String, FieldMaker> map = new HashMap<>();
        var vars = cb.var();
        for (var v : vars) {
            var field = addField(v);
            field.forEach(p -> map.put(p.a, p.b));
        }
        return map;
    }


    private HashSet<Pair<String, FieldMaker>> addConst(KatLanParser.ConstDefContext cc) {
        HashSet<Pair<String, FieldMaker>> set = new HashSet<>();
        var cd0 = cc.constDef0();
        var cd1 = cc.constDef1();

        if (cd0 != null) {
            var vName = cd0.name().getText();
            FieldMaker fm = cm.addField(Compiler.imports.get(cd0.type().getText()), vName).static_().final_();
            if (cc.access().PUBLIC() != null)    fm.public_();
            if (cc.access().PRIVATE() != null)   fm.private_();
            if (cc.access().PROTECTED() != null) fm.protected_();
            set.add(new Pair<>(vName, fm));
        } else {
            var vType = Compiler.imports.get(cd1.type().getText());
            for (var n : cd1.name()) {
                FieldMaker fm = cm.addField(vType, n.getText()).static_().final_();
                if (cc.access().PUBLIC() != null)    fm.public_();
                if (cc.access().PRIVATE() != null)   fm.private_();
                if (cc.access().PROTECTED() != null) fm.protected_();
                set.add(new Pair<>(n.getText(), fm));
            }
        }
        return set;
    }

    private HashSet<Pair<String, FieldMaker>> addField(KatLanParser.VarContext vc) {
        HashSet<Pair<String, FieldMaker>> set = new HashSet<>();
        var vd = vc.varDef();
        if (vd == null) return addConst(vc.constDef());

        var vd0 = vd.varDef0();
        var vd1 = vd.varDef1();

        if (vd0 != null) {
            var vName = vd0.name().getText();
            FieldMaker fm = cm.addField(Compiler.imports.get(vd0.type().getText()), vName);
            if (vd.access().PUBLIC() != null)    fm.public_();
            if (vd.access().PRIVATE() != null)   fm.private_();
            if (vd.access().PROTECTED() != null) fm.protected_();
            if (vd.access().STATIC() != null)    fm.static_();
            if (vd.access().FINAL() != null)     fm.final_();

            set.add(new Pair<>(vName, fm));
        } else {
            var vType = Compiler.imports.get(vd1.type().getText());
            for (var n : vd1.name()) {
                FieldMaker fm = cm.addField(vType, n.getText());

                if (vd.access().PUBLIC() != null)    fm.public_();
                if (vd.access().PRIVATE() != null)   fm.private_();
                if (vd.access().PROTECTED() != null) fm.protected_();
                if (vd.access().STATIC() != null)    fm.static_();
                if (vd.access().FINAL() != null)     fm.final_();

                set.add(new Pair<>(n.getText(), fm));
            }
        }
        return set;
    }

//    @Override //TODO: make 'em methods!
//    public HashMap<String, Pair<Object, Object>> visitInterfaceDef(KatLanParser.InterfaceDefContext ctx) {
//        HashMap<String, Pair<Object, Object>> map = new HashMap<>();
//        ctx.classBlock().var().forEach(vd -> {
//            if (vd.varDef().varDef0() != null) {
//                map.put(vd.varDef().varDef0().name().getText(), new Pair<>(Compiler.imports.get(vd.varDef().varDef0().type().getText()), vd.varDef().varDef0().value().getText()));
//            } else {
//                String type = vd.varDef().varDef1().type().getText();
//                vd.varDef().varDef1().name().forEach(n -> map.put(n.getText(), new Pair<>(type, null)));
//            }
//        });
//        return map;
//    }
}
