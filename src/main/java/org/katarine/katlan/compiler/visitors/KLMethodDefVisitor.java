package org.katarine.katlan.compiler.visitors;

import org.cojen.maker.ClassMaker;
import org.cojen.maker.MethodMaker;
import org.cojen.maker.Variable;
import org.katarine.katlan.compiler.Compiler;
import org.katarine.katlan.antlr4.KatLanBaseVisitor;
import org.katarine.katlan.antlr4.KatLanParser;
import org.katarine.katlan.lib.ClassLink;
import org.katarine.katlan.lib.MethodLink;
import org.katarine.katlan.lib.annotations.AfterMethodCall;
import org.katarine.katlan.lib.annotations.BeforeMethodCall;
import org.katarine.katlan.lib.annotations.KLAnnotation;
import org.katarine.katlan.lib.annotations.Package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KLMethodDefVisitor extends KatLanBaseVisitor<Void> {
    private ClassMaker cm;
    private Compiler compiler;
    private boolean isNamespace = false;

    public KLMethodDefVisitor(ClassMaker cm, Compiler compiler) {
        this.cm = cm;
        this.compiler = compiler;
    }

    private void processMethods(List<KatLanParser.MethodDefContext> methods, MethodMaker methodDefs, Variable klClass) {
        for (var method : methods) {
            processMethod(method, methodDefs, klClass);
        }
    }

    private int counter = 0;

    private void processMethod(KatLanParser.MethodDefContext method, MethodMaker clinit, Variable klClass) {
        List<Object> pTypes = extractParameterTypes(method, clinit);
        MethodMaker mm = addMethodWithModifiers(method, pTypes);
        if (isNamespace) mm.addAnnotation(Package.class, true);
        if (method.methodModifier().PRE_MOD()!=null) mm.addAnnotation(BeforeMethodCall.class, true);
        if (method.methodModifier().POST_MOD()!=null) mm.addAnnotation(AfterMethodCall.class, true);

        Variable annotationsArray =
                clinit.var(KLAnnotation[].class).set(
                        clinit.new_(
                                KLAnnotation[].class,
                                method.annotationCall()!=null ? method.annotationCall().size() : 0
                        )
                );
        Variable methodLink = createMethodLink(method, clinit, mm, annotationsArray, pTypes);
        handleAnnotationCalls(method, clinit, methodLink, annotationsArray);
        if (!isNamespace) {
            compiler.getClinitVars().get("methodLinks").aset(counter++, methodLink);
        } else {
            mm.static_();
        }
        new KLMethodVisitor(mm, this.compiler, new HashMap<>()).visit(method.block()==null ? method.lineBlock() : method.block());
    }

    private List<Object> extractParameterTypes(KatLanParser.MethodDefContext method, MethodMaker methodDef) {
        List<Object> pTypes = new ArrayList<>();
        if (method.parameters() != null) {
            for (var p : method.parameters().parameter()) {
                Object type = getType(p.type().getText());
                pTypes.add(methodDef.var(type).classType());
            }
        }
        return pTypes;
    }

    private MethodMaker addMethodWithModifiers(KatLanParser.MethodDefContext method, List<Object> pTypes) {
        MethodMaker mm = cm.addMethod(getType(method.type().getText()), method.name().getText(), pTypes.toArray());
        if (method.annotationCall()!=null) {
        }

        setAccessModifiers(mm, method.access());
        return mm;
    }

    private void setAccessModifiers(MethodMaker mm, KatLanParser.AccessContext access) {
        if (access.PUBLIC() != null) mm.public_();
        if (access.PRIVATE() != null) mm.private_();
        if (access.PROTECTED() != null) mm.protected_();
        if (access.STATIC() != null) mm.static_();
        if (access.FINAL() != null) mm.final_();
    }

//    private void handleMethodAnnotations(
//        KatLanParser.MethodDefContext method,
//        MethodMaker clinit,
//        MethodMaker mm,
//        Variable klClass,
//        List<Object> pTypes
//    ) {
//        Variable methodLink = createMethodLink(method, clinit, mm, pTypes);
//        Variable annotationCalls = handleAnnotationCalls(method, clinit, methodLink);
//        klClass.field("methodLinks").invoke("add", methodLink);
//    }

    private Variable createMethodLink(
            KatLanParser.MethodDefContext method,
            MethodMaker clinit,
            MethodMaker mm,
            Variable annotations,
            List<Object> pTypes
    ) {
        List<Object> params = new ArrayList<>();
        params.add(clinit.class_());
        params.add(mm.name());
        params.add(annotations);
        params.addAll(pTypes);

        Variable methodLink = clinit.new_(MethodLink.class, params.toArray(Object[]::new));
        return methodLink;
    }

    private Variable handleAnnotationCalls(
            KatLanParser.MethodDefContext method,
            MethodMaker methodDefs,
            Variable methodLink,
            Variable annotationArray
    ) {
        List<KatLanParser.AnnotationCallContext> call = method.annotationCall();
        for (int i = 0; i < call.size(); i++) {
            KatLanParser.AnnotationCallContext annotationCall = call.get(i);
            Variable annotation = new VariableGetter(methodDefs, this.compiler, new HashMap<>(), new HashMap<>()).visitAnnotationCall(annotationCall, methodLink);
            annotationArray.aset(i, annotation);
        }
        return methodLink;
    }

    @Override
    public Void visitClassBlock(KatLanParser.ClassBlockContext ctx) {
        var clinit = compiler.getClinitVars().get("methodLinks").methodMaker();
        var klClass = clinit.var(cm).field("klclass");
        processMethods(ctx.methodDef(), clinit, klClass);

        return null;
    }

    @Override
    public Void visitAnnotationClassBlock(KatLanParser.AnnotationClassBlockContext ctx) {
        var clinit = compiler.getClinitVars().get("methodLinks").methodMaker();
        var klClass = clinit.var(ClassLink.class).set(clinit.new_(ClassLink.class, clinit.class_()));
        processMethods(ctx.methodDef(), clinit, klClass);

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
            throw new NullPointerException("Unknown jClass: " + type);
        }
        if (typeO instanceof Class<?> tc) {
            typeO = tc.getTypeName();
        }

        typeO = typeO+sb.toString();

        return typeO;
    }

    @Override
    public Void visitUnnamedClassDef(KatLanParser.UnnamedClassDefContext ctx) {
        if (ctx.classBlock() != null)
            visitClassBlock(ctx.classBlock());
        if (ctx.packageBlock()!=null && !ctx.packageBlock().isEmpty()) {
            var nsVisitor = new KLMethodDefVisitor(cm, compiler);
            var nsFieldsVisitor = new KLFieldsVisitor(cm, compiler);
            nsVisitor.isNamespace = true;
            for (var nsblock : ctx.packageBlock()) {
                for (var md : nsblock.methodDef()) {
                    var mdClinit = compiler.getClinitVars().get("methodLinks").methodMaker();
                    nsVisitor.processMethod(md, mdClinit, mdClinit.field("klclass"));
                }
            }
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

    @Override
    public Void visitAnnotationDef(KatLanParser.AnnotationDefContext ctx) {
        return visitAnnotationClassBlock(ctx.annotationClassBlock());
    }
}
