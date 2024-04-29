package org.katarine.katlan.compiler.visitors;

import org.katarine.katlan.compiler.Compiler;
import org.katarine.katlan.compiler.antlr4.KatLanBaseVisitor;
import org.katarine.katlan.compiler.antlr4.KatLanParser;
import org.antlr.v4.runtime.misc.Pair;
import org.cojen.maker.ClassMaker;
import org.cojen.maker.FieldMaker;

import java.util.HashMap;
import java.util.HashSet;

public class KLFieldsVisitor extends KatLanBaseVisitor<HashMap<String, FieldMaker>> {
    Compiler compiler;
    ClassMaker cm;

    public KLFieldsVisitor(ClassMaker cm, Compiler compiler) {
        this.cm = cm;
        this.compiler = compiler;
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
        HashMap<String, FieldMaker> map = new HashMap<>();
        for (var v : ctx.classBlock().var()) {
            if (v.varDef() != null) {
                if (v.varDef().varDef0() != null) {
                    cm.addMethod(compiler.imports.get(v.varDef().varDef0().type().getText()),
                            v.varDef().varDef0().name().getText()).abstract_();
                } else {
                    for (var n : v.varDef().varDef1().subVD1()) {
                        cm.addMethod(compiler.imports.get(v.varDef().varDef1().type().getText()), n.name().getText()).abstract_();
                    }
                }
            } else {
                if (v.constDef().constDef0() != null) {
                    cm.addMethod(compiler.imports.get(v.constDef().constDef0().type().getText()),
                            v.constDef().constDef0().name().getText()).abstract_();
                } else {
                    for (var n : v.constDef().constDef1().name()) {
                        cm.addMethod(compiler.imports.get(v.constDef().constDef1().type().getText()), n.getText()).abstract_();
                    }
                }
            }
        }
        return map;
    }

    private HashMap<String, FieldMaker> addFields(KatLanParser.ClassBlockContext cb) {
        final HashMap<String, FieldMaker> map = new HashMap<>();

        if (cb==null) return map;
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
            FieldMaker fm = cm.addField(compiler.imports.get(cd0.type().getText()), vName).static_().final_();
            if (cc.access().PUBLIC() != null)    fm.public_();
            if (cc.access().PRIVATE() != null)   fm.private_();
            if (cc.access().PROTECTED() != null) fm.protected_();
            set.add(new Pair<>(vName, fm));
        } else {
            var vType = compiler.imports.get(cd1.type().getText());
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
            FieldMaker fm = cm.addField(compiler.imports.get(vd0.type().getText()), vName);
            if (vd.access().PUBLIC() != null)    fm.public_();
            if (vd.access().PRIVATE() != null)   fm.private_();
            if (vd.access().PROTECTED() != null) fm.protected_();
            if (vd.access().STATIC() != null)    fm.static_();
            if (vd.access().FINAL() != null)     fm.final_();

            if (vd0.value()!=null) {
                System.out.println("sorry! no init");
            }

            set.add(new Pair<>(vName, fm));
        } else {
            var vType = compiler.imports.get(vd1.type().getText());
            for (var n : vd1.subVD1()) {
                FieldMaker fm = cm.addField(vType, n.name().getText());
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
}
