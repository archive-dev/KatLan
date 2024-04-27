package org.katarine.katlan.compiler.visitors;

import org.antlr.v4.runtime.misc.Pair;
import org.cojen.maker.ClassMaker;
import org.cojen.maker.MethodMaker;
import org.cojen.maker.Variable;
import org.katarine.katlan.compiler.Compiler;
import org.katarine.katlan.compiler.antlr4.KatLanBaseVisitor;
import org.katarine.katlan.compiler.antlr4.KatLanParser;
import org.katarine.katlan.lib.ClassLink;
import org.katarine.katlan.lib.MethodLink;
import org.katarine.katlan.lib.annotations.KLAnnotation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KLMethodDefVisitor extends KatLanBaseVisitor<Void> {
    ClassMaker cm;
    Compiler compiler;

    public KLMethodDefVisitor(ClassMaker cm, Compiler compiler) {
        this.cm = cm;
        this.compiler = compiler;
    }

    @Override
    public Void visitClassBlock(KatLanParser.ClassBlockContext ctx) {
        if (ctx==null) return null;
        var methods = ctx.methodDef();
        HashMap<MethodMaker, Pair<HashMap<String, Integer>, KatLanParser.BlockContext>> map = new HashMap<>();

        HashMap<MethodLink, List<KLAnnotation>> methodLinks = new HashMap<>();
        // TODO: add annotations

        cm.addField(ClassLink.class, "klclass").public_().static_().final_();

        MethodMaker methodDefs = cm.addClinit();
        Variable klClass = methodDefs.field("klclass").set(methodDefs.new_(ClassLink.class, methodDefs.class_()));

        for (var method : methods) {
            HashMap<String, Integer> vars = new HashMap<>();

            Object retType = getType(method.type().getText());

            List<Object> pTypes = new ArrayList<>();
            Variable pTypesArrV = methodDefs.new_(Class[].class, 1);

            int i = 0;
            if (method.parameters() != null) {
                for (var p : method.parameters().parameter()) {
                    Object type = getType(p.type().getText());
                    pTypes.add(type);
                    vars.put(p.name().getText(), i);
                    pTypesArrV.aset(i, methodDefs.var(type).classType());
                    i++;
                }
            }

            MethodMaker mm = cm.addMethod(retType, method.name().getText(), pTypes.toArray(Object[]::new));

            if (method.access().PUBLIC() != null)    mm.public_();
            if (method.access().PRIVATE() != null)   mm.private_();
            if (method.access().PROTECTED() != null) mm.protected_();
            if (method.access().STATIC() != null)    mm.static_();
            if (method.access().FINAL() != null)     mm.final_();

            Variable cl = methodDefs.var(Class.class).set(methodDefs.class_());
            System.out.println(cl.classType() + " " + method.name().getText() + " " + pTypesArrV.classType());

            Variable ml = methodDefs.new_(MethodLink.class, cl, method.name().getText(), pTypesArrV);
            Variable annotationCalls = new VariableGetter(methodDefs, this.compiler, new HashMap<>(), new HashMap<>()).visitAnnotationCalls(method.annotationCall(), ml);
            List<KatLanParser.AnnotationCallContext> annotationCall = method.annotationCall();
            for (int j = 0; j < annotationCall.size(); j++) {
                ml.field("klAnnotations").invoke("add", annotationCalls.aget(j));
            }
            ml.field("klAnnotations").invoke("makeImmutable");
            klClass.field("methodLinks").invoke("add", ml);

            map.put(mm, new Pair<>(vars, method.block()));
        }


        for (var constructor : ctx.constructorDef()) {
            HashMap<String, Integer> vars = new HashMap<>();
            List<Object> pTypes = new ArrayList<>();

            int i = 0;
            if (constructor.parameters() != null) {
                for (var p : constructor.parameters().parameter()) {
                    Object type = getType(p.type().getText());
                    pTypes.add(type);
                    vars.put(p.name().getText(), i);
                    i++;
                }
            }

            MethodMaker mm = cm.addConstructor(pTypes.toArray(Object[]::new));

            if (constructor.access().PUBLIC() != null)    mm.public_();
            if (constructor.access().PRIVATE() != null)   mm.private_();
            if (constructor.access().PROTECTED() != null) mm.protected_();
            if (constructor.access().STATIC() != null)    mm.static_();
            if (constructor.access().FINAL() != null)     mm.final_();

            mm.invokeThisConstructor();
            map.put(mm, new Pair<>(vars, constructor.block()));
        }


        for (var mm : map.entrySet()) {
            var methodVisitor = new KLMethodVisitor(mm.getKey(), this.compiler, mm.getValue().a); // xd renaming
            try {
                methodVisitor.localVars.put("this", mm.getKey().this_());
            } catch (IllegalStateException ignored) {} // this is thrown when the method is static, so no problems
            methodVisitor.visitLines(mm.getValue().b.lineBlock());
        }


        return null;
    }

    private Object getType(String type) {
        String t = type;
        if (type.contains("[]")) {
            t = type.replaceAll("\\[]", "");
        }

        Object typeO = compiler.imports.get(t);

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
            new KLMethodVisitor(mm, this.compiler, vars).visitBlock(ctx.block());
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
