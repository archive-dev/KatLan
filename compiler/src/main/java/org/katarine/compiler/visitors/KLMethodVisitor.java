package org.katarine.compiler.visitors;

import org.antlr.v4.runtime.tree.ParseTree;
import org.cojen.maker.MethodMaker;
import org.cojen.maker.Variable;
import org.jetbrains.annotations.Nullable;
import org.katarine.compiler.Compiler;
import org.katarine.compiler.antlr4.KatLanBaseVisitor;
import org.katarine.compiler.antlr4.KatLanParser;

import java.util.*;

public class KLMethodVisitor extends KatLanBaseVisitor<Variable> {
    private MethodMaker mm;
    final HashMap<String, Integer> vars = new HashMap<>(); // <name, index>
    final HashMap<String, Variable> localVars = new HashMap<>();

    public KLMethodVisitor(MethodMaker mm, HashMap<String, Integer> vars) {
        this.mm = mm;
        this.vars.putAll(vars);
    }

    @Override
    public Variable visitLineBlock(KatLanParser.LineBlockContext ctx) {
        System.out.println("LB");
        for (ParseTree c : ctx.children) {
            visit(c);
        }
        return null;
    }

    @Override
    public Variable visitBlock(KatLanParser.BlockContext ctx) {
        System.out.println("VB");
        if (ctx.children==null) return null;
        for (var c : ctx.children) {
            if (c instanceof KatLanParser.LineBlockContext lbc)
                visitLineBlock(lbc);
        }
        return null;
    }

    @Override
    public Variable visitVarDef(KatLanParser.VarDefContext ctx) {
        var vd1 = ctx.varDef1();

        if (vd1!=null) {
            for (var vn : new VarDef1Visitor().visit(vd1)) {
                localVars.put(vn.name(), vn);
            }
            return null;
        }

        var v = new VarVisitor().visitVarDef0(ctx.varDef0());
        localVars.put(v.name(), v);

        return v;
    }

    private class VarVisitor extends KatLanBaseVisitor<Variable> {
        @Override
        public Variable visitVarDef0(KatLanParser.VarDef0Context vd0) {
            Variable v = null;
            if (vd0!=null) {
                v = mm.var(getType(vd0.type().getText())).name(vd0.name().getText());
                if (vd0.value()!=null)
                    visitValue(vd0.value(), getType(vd0.type().getText()), v);
            }

            return v;
        }

        public Variable visitValue(KatLanParser.ValueContext ctx, Object type, Variable v) {
//        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
            if (ctx.bool()!=null) {
//                System.out.println(ctx.getText());
                v.set(mm.var(boolean.class).set(Boolean.parseBoolean(ctx.bool().getText())));
            } else if (ctx.STRING_VAL()!=null) {
//                System.out.println("STRVAL");
                v.set(mm.var(String.class).set(ctx.STRING_VAL().getText().substring(1, ctx.STRING_VAL().getText().length()-1)));
            } else if (ctx.expression()!=null) {
                v.set(visitExpression(ctx.expression()));
            } else if (ctx.name()!=null) {
                try {
                    v.set(mm.this_().field(ctx.name().getText()));
                } catch (IllegalStateException ignored) {
                    try {
                        v.set(mm.param(vars.get(ctx.name().getText())));
                    } catch (IllegalStateException ignored2) {
                        v.set(localVars.get(ctx.name().getText()));
                    }
                }
            } else if (ctx.arrayAccess()!=null) {
                var aa = ctx.arrayAccess();
                v.set(visitVarAccess(aa.varAccess(), null));
                for (KatLanParser.ArrayAccess0Context i : aa.arrayAccess0()) {
                    v.set(v.aget(visitArithmeticExpression(i.arithmeticExpression())));
                }
            }


            try {
                return v;
            } finally {
//                System.out.println(ctx.getText() + " " + v.name() + " " + v.classType());
            }
        }


        public Variable visitVarAccess(KatLanParser.VarAccessContext ctx, @Nullable Variable v) {
            if (v == null) {
                try {
                    v = mm.this_().field(ctx.NAME0().getText());
                } catch (IllegalStateException ignored) {
                    v = mm.param(vars.get(ctx.NAME0().getText()));
                }
            } else {
                v = v.field(ctx.NAME0().getText());
            }

            if (ctx.varAccess()==null)
                return v;
            else return visitVarAccess(ctx.varAccess(), v);
        }
    }

    private class VarDef1Visitor extends KatLanBaseVisitor<List<Variable>> {
        @Override
        public List<Variable> visitVarDef1(KatLanParser.VarDef1Context vd1) {
            List<Variable> vars = new ArrayList<>();

            for (var n : vd1.name()) {
                vars.add(mm.var(getType(vd1.type().getText())).name(n.getText()));
            }

            return vars;
        }
    }

    @Override
    public Variable visitExpression(KatLanParser.ExpressionContext ctx) {
        var pe = ctx.primaryExpresion();
        Variable v;
        if (pe!=null) {
            v = visitPrimaryExpresion(pe);
        } else {
            v = visitLogicalOr(ctx.logicalOr());
        }

        return v;
    }

    @Override
    public Variable visitLogicalOr(KatLanParser.LogicalOrContext ctx) {
//        System.out.println(ctx.primaryExpresion());
        return super.visitLogicalOr(ctx);
    }

    @Override
    @Nullable
    public Variable visitPrimaryExpresion(KatLanParser.PrimaryExpresionContext ctx) {
        var ex = ctx.expression();
        Variable v = null;
        if (ex!=null) {
            v = visitExpression(ex);
        } else if (ctx.bool()!=null) {
            v = mm.var(boolean.class).set(Boolean.parseBoolean(ctx.bool().getText()));
        } else if (ctx.name()!=null) {
            try {
                v = mm.this_().field(ctx.name().getText());
            } catch (IllegalStateException ignored) {
                v = mm.param(vars.get(ctx.name().getText()));
            }
        } else if (ctx.varAccess()!=null) {
            v = new VarVisitor().visitVarAccess(ctx.varAccess(), null);
        } else if (ctx.methodCall()!=null) {

        }

        return v;
    }

    public Object getType(String type) {
        return Compiler.imports.get(type);
    }
}
