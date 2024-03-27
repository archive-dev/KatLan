package org.katarine.compiler.visitors;

import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import org.cojen.maker.ClassMaker;
import org.cojen.maker.MethodMaker;
import org.cojen.maker.Variable;
import org.katarine.compiler.Compiler;
import org.katarine.compiler.antlr4.KatLanBaseVisitor;
import org.katarine.compiler.antlr4.KatLanParser;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class KLMethodVisitor extends KatLanBaseVisitor<ClassMaker> {
    ClassMaker cm;

    public KLMethodVisitor(ClassMaker cm) {
        this.cm = cm;
    }

    private void visitBlock(KatLanParser.BlockContext ctx, MethodMaker mm) {
        if (ctx.children == null) return;
        for (ParseTree c : ctx.children) {
            if (c instanceof KatLanParser.MethodCallContext) {
                visitMethodCall((KatLanParser.MethodCallContext) c, mm);
            }
        }
    }

    private void visitMethodCall(KatLanParser.MethodCallContext c, MethodMaker mm) {
        ArrayDeque<Pair<String, List<Object>>> methodArgs = new ArrayDeque<>();

        for (KatLanParser.MethodCall0Context m : c.methodCall0()) {
            methodArgs.addLast(new Pair<>(m.NAME().getText(), new ArrayList<>()));
        }

        Pair<String, List<Object>> firstCall = methodArgs.pop();
        Variable v = mm.invoke(firstCall.a, firstCall.b.toArray(Object[]::new));
        if (methodArgs.isEmpty()) return;
        for (Pair<String, List<Object>> p = methodArgs.pop(); p != null; p = methodArgs.pop()) {
            v = mm.invoke(p.a, p.b, v);
        }
    }

    @Override
    public ClassMaker visitUnnamedClassDef(KatLanParser.UnnamedClassDefContext ctx) {
        for (KatLanParser.MethodDefContext md : ctx.classBlock().methodDef()) {
            Object mr = Compiler.imports.get(md.type().getText());
            String name = md.NAME().getText();
            List<Object> args = new ArrayList<>();
            MethodMaker mm;
            if (md.parameters()!=null) {
                List<Class<?>> params = new ArrayList<>();
                ClassLoader cl = cm.classLoader();
                Class<?> r;

                for (KatLanParser.ParameterContext c : md.parameters().parameter()) {
                    Object o = Compiler.imports.get(c.type().getText());
                    if (o instanceof String) {
                        try {
                            params.add(cl.loadClass((String) o));
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        params.add((Class<?>) o);
                    }
                }
                if (mr instanceof String) {
                    try {
                        r = cl.loadClass((String) mr);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    r = (Class<?>) mr;
                }

                args.addAll(params);

                mm = cm.addMethod(name, MethodType.methodType(r, params)).public_();
            } else {
                mm = cm.addMethod(mr, name).public_();
            }
        }
        return cm;
    }

    @Override
    public ClassMaker visitClassDef(KatLanParser.ClassDefContext ctx) {
        for (KatLanParser.MethodDefContext md : ctx.classBlock().methodDef()) {
            Object mr = Compiler.imports.get(md.type().getText());
            String name = md.NAME().getText();
            List<Object> args = new ArrayList<>();
            MethodMaker mm;
            if (md.parameters()!=null) {
                List<Class<?>> params = new ArrayList<>();
                ClassLoader cl = cm.classLoader();
                Class<?> r;

                for (KatLanParser.ParameterContext c : md.parameters().parameter()) {
                    Object o = Compiler.imports.get(c.type().getText());
                    if (o instanceof String) {
                        try {
                            params.add(cl.loadClass((String) o));
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        params.add((Class<?>) o);
                    }
                }
                if (mr instanceof String) {
                    try {
                        r = cl.loadClass((String) mr);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    r = (Class<?>) mr;
                }

                args.addAll(params);

                mm = cm.addMethod(name, MethodType.methodType(r, params)).public_();
            } else {
                mm = cm.addMethod(mr, name).public_();
            }
            visitBlock(md.block(), mm);
        }
        return cm;
    }

    @Override
    public ClassMaker visitInterfaceDef(KatLanParser.InterfaceDefContext ctx) {
        for (KatLanParser.MethodDefContext md : ctx.classBlock().methodDef()) {
            Object mr = Compiler.imports.get(md.type().getText());
            String name = md.NAME().getText();
            List<Object> args = new ArrayList<>();
            if (md.parameters()!=null) {
                List<Class<?>> params = new ArrayList<>();
                ClassLoader cl = cm.classLoader();
                Class<?> r;

                for (KatLanParser.ParameterContext c : md.parameters().parameter()) {
                    Object o = Compiler.imports.get(c.type().getText());
                    if (o instanceof String) {
                        try {
                            params.add(cl.loadClass((String) o));
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        params.add((Class<?>) o);
                    }
                }
                if (mr instanceof String) {
                    try {
                        r = cl.loadClass((String) mr);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    r = (Class<?>) mr;
                }

                args.addAll(params);

                cm.addMethod(name, MethodType.methodType(r, params)).abstract_().public_();
            } else {
                cm.addMethod(mr, name).abstract_().public_();
            }
        }
        return cm;
    }
}
