package org.katarine.compiler.visitors;

import org.cojen.maker.ClassMaker;
import org.cojen.maker.FieldMaker;
import org.cojen.maker.FieldMaker;
import org.katarine.compiler.Compiler;
import org.katarine.compiler.antlr4.KatLanBaseVisitor;
import org.katarine.compiler.antlr4.KatLanParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FieldGetter extends KatLanBaseVisitor<FieldMaker> {
    ClassMaker cm;
    final HashMap<String, FieldMaker> fields = new HashMap<>();

    /* TODO
    private FieldMaker getParameter(String name) {
        return fields.get(name);
    }

    @Override
    public FieldMaker visitName(KatLanParser.NameContext ctx) {
        return getFieldMaker(ctx.getText());
    }

    private FieldMaker getFieldMaker(String name) {
        return getParameter(name);
    }

    @Override
    public FieldMaker visitValue(KatLanParser.ValueContext ctx) {
        FieldMaker v = null;
        if (ctx.name() != null) {
            v = getFieldMaker(ctx.name().getText());
        } else if (ctx.bool() != null) {
            v = visitBool(ctx.bool());
        } else if (ctx.STRING_VAL() != null) {
            v = cm.var(String.class).set(ctx.STRING_VAL().getText().substring(1, ctx.STRING_VAL().getText().length() - 1));
        } else if (ctx.arrayAccess() != null) {
            v = visitArrayAccess(ctx.arrayAccess());
            // TODO:
        } else if (ctx.expression() != null) {
            v = visitExpression(ctx.expression());
        } else if (ctx.arithmeticExpression() != null) {
            v = visitArithmeticExpression(ctx.arithmeticExpression());
        } else if (ctx.anyType() != null) {
            v = visitAnyType(ctx.anyType());
        }

        return v;
    }

    @Override
    public FieldMaker visitBool(KatLanParser.BoolContext ctx) {
        return mm.var(boolean.class).set(Boolean.parseBoolean(ctx.getText()));
    }

    @Override
    public FieldMaker visitArrayAccess(KatLanParser.ArrayAccessContext ctx) {
        FieldMaker v = visitVarAccess(ctx.varAccess());
        for (var ac : ctx.arrayAccess0()) {
            v = v.aget(visitArithmeticExpression(ac.arithmeticExpression()));
        }
        return v;
    }

    public FieldMaker visitVarAccess(KatLanParser.VarAccessContext ctx, FieldMaker v) {
        if (v == null) {
            try {
                v = mm.this_().field(ctx.NAME0().getText());
            } catch (IllegalStateException ignored) {
                try {
                    v = mm.param(vars.get(ctx.NAME0().getText()));
                } catch (IllegalStateException ignored2) {
                    v = localVars.get(ctx.NAME0().getText());
                }
            }
        } else {
            v = v.field(ctx.NAME0().getText());
        }

        if (ctx.varAccess()==null)
            return v;
        else return visitVarAccess(ctx.varAccess(), v);
    }

    @Override
    public FieldMaker visitVarAccess(KatLanParser.VarAccessContext ctx) {
        return visitVarAccess(ctx, null);
    }

    @Override
    public FieldMaker visitVar(KatLanParser.VarContext ctx) {
        return super.visitVar(ctx);
    }

    @Override
    public FieldMaker visitMethodCall(KatLanParser.MethodCallContext ctx) {
        ctx.methodCall0().forEach(c -> visitMethodCall0(c));
        return super.visitMethodCall(ctx);
    }

    @Override
    public FieldMaker visitMethodCall0(KatLanParser.MethodCall0Context ctx) {
        FieldMaker c = visitVarAccess(ctx.varAccess(), null);
        if (ctx.arguments()==null) {
            return c.invoke(ctx.NAME0().getText());
        }
        return c.invoke(ctx.NAME0().getText(), (Object[]) visitArguments(ctx.arguments(), null));
    }

    public FieldMaker[] visitArguments(KatLanParser.ArgumentsContext ctx, Void dummy) {
        List<FieldMaker> vars = new ArrayList<>();

        ctx.argument().forEach(c -> vars.add(visitArgument(c)));

        return vars.toArray(FieldMaker[]::new);
    }

    @Override
    public FieldMaker visitArgument(KatLanParser.ArgumentContext ctx) {
        return visitValue(ctx.value());
    }

    @Override
    public FieldMaker visitConstructorCall(KatLanParser.ConstructorCallContext ctx) {
        if (ctx.arguments() == null) {
            return mm.new_(Compiler.imports.get(ctx.name().getText()));
        }

        return mm.new_(Compiler.imports.get(ctx.name().getText()), (Object[]) visitArguments(ctx.arguments(), null));
    }

    @Override
    public FieldMaker visitExpression(KatLanParser.ExpressionContext ctx) {
        FieldMaker v = null;
        if (ctx.logicalOr() != null) {
            v = visitLogicalOr(ctx.logicalOr());
        } else if (ctx.primaryExpresion() != null) {
            v = visitPrimaryExpresion(ctx.primaryExpresion());
        }

        return v;
    }

    @Override
    public FieldMaker visitLogicalOr(KatLanParser.LogicalOrContext ctx) {
        // todo
        // how to parse --> ctx.children.forEach(c -> visit(c));
        // yeah
        var left = visit(ctx.children.remove(0));
        if (ctx.children.isEmpty()) return left;
        var result = left.or(visit(ctx.children.remove(1)));

        return result;
    }

    @SuppressWarnings("UnnecessaryLocalFieldMaker")
    @Override
    public FieldMaker visitLogicalAnd(KatLanParser.LogicalAndContext ctx) {
        var left = visit(ctx.children.remove(0));
        if (ctx.children.isEmpty()) return left;
        var result = left.and(visit(ctx.children.remove(1)));

        return result;
    }

    @SuppressWarnings("UnnecessaryLocalFieldMaker")
    @Override
    public FieldMaker visitLogicalXor(KatLanParser.LogicalXorContext ctx) {
        var left = visit(ctx.children.remove(0));
        if (ctx.children.isEmpty()) return left;
        var right = visit(ctx.children.remove(1));

        var result = left.and(right.not()).or(right.and(left.not()));

        return result;
    }

    @Override
    public FieldMaker visitLogicalNot(KatLanParser.LogicalNotContext ctx) {
        var v = visit(ctx.primaryExpresion());
        if (ctx.NOT() != null) {
            return v.not();
        }
        return v;
    }

    @Override
    public FieldMaker visitPrimaryExpresion(KatLanParser.PrimaryExpresionContext ctx) {
        if (ctx.expression() != null) {
            return visit(ctx.expression());
        } else if (ctx.name() != null) {
            return getFieldMaker(ctx.name().getText());
        } else if (ctx.bool() != null) {
            return visitBool(ctx.bool());
        } else if (ctx.varAccess() != null) {
            return visitVarAccess(ctx.varAccess());
        } else if (ctx.methodCall() != null) {
            return visitMethodCall(ctx.methodCall());
        } else if (ctx.constructorCall() != null) {
            return visitConstructorCall(ctx.constructorCall());
        }

        return super.visitPrimaryExpresion(ctx);
    }

    @Override
    public FieldMaker visitArithmeticExpression(KatLanParser.ArithmeticExpressionContext ctx) {
        if (ctx.numberExpression() != null) {
            return visitNumberExpression(ctx.numberExpression());
        }

        return visitAddSubExpression(ctx.addSubExpression());
    }

    @Override
    public FieldMaker visitAddSubExpression(KatLanParser.AddSubExpressionContext ctx) {
        // todo
        // how to parse --> ctx.children.forEach(c -> visit(c));
        // yeah
        var left = visitModDivExpression(ctx.modDivExpression());
        if (ctx.PLUS() != null || ctx.MINUS() != null) {
            var right = visit(ctx.children.get(2));
            if (ctx.PLUS() != null) {
                return left.add(right);
            } else {
                return left.sub(right);
            }
        } else
            return left;
    }

    @Override
    public FieldMaker visitModDivExpression(KatLanParser.ModDivExpressionContext ctx) {
        var left = visitMulDivExpression(ctx.mulDivExpression());
        if (ctx.MOD() != null || ctx.DIV() != null) {
            var right = visit(ctx.children.get(2));
            if (ctx.MOD() != null) {
                return left.rem(right);
            } else {
                return left.sub(left.rem(right));
            }
        } else
            return left;
    }

    @Override
    public FieldMaker visitMulDivExpression(KatLanParser.MulDivExpressionContext ctx) {
        var left = visitPowerExpression(ctx.powerExpression());
        if (ctx.MULTIPLY() != null || ctx.DIVIDE() != null) {
            var right = visit(ctx.children.get(2));
            if (ctx.MULTIPLY() != null) {
                return left.mul(right);
            } else {
                return left.div(right);
            }
        } else
            return left;
    }

    @Override
    public FieldMaker visitPowerExpression(KatLanParser.PowerExpressionContext ctx) {
        var left = visitPowerExpression(ctx.powerExpression());
        if (ctx.POWER() != null) {
            var right = visit(ctx.children.get(2));
            if (ctx.POWER() != null) {
                return mm.invoke("java.lang.Math.pow", left.cast(double.class), right.cast(double.class));
                //note: current implementation is not tested, so it may and will not work
            } else
                return left;
        } else
            return left;
    }

    @Override
    public FieldMaker visitNumberExpression(KatLanParser.NumberExpressionContext ctx) {
        FieldMaker v = null;
        if (ctx.numeric_value() != null) {
            if (ctx.numeric_value().INT_VAL()!=null) {
                v = mm.var(int.class).set(Integer.parseInt(ctx.numeric_value().getText()));
            } else {
                var fText = ctx.numeric_value().FLOAT_VAL().getText();
                var value = ctx.numeric_value().FLOAT_VAL().getText().substring(0, fText.length() - 1);
                if (fText.contains("d"))
                    mm.var(double.class).set(Double.parseDouble(value));
                else
                    mm.var(float.class).set(Float.parseFloat(value));
            }
        } else if (ctx.arithmeticExpression() != null) {
            v = visitArithmeticExpression(ctx.arithmeticExpression());
        } else if (ctx.name() != null) {
            v = getFieldMaker(ctx.name().getText());
        } else if (ctx.methodCall() != null) {
            v = visitMethodCall(ctx.methodCall());
        } else if (ctx.incrExpression() != null) {
            v = visitIncrExpression(ctx.incrExpression());
        }

        if (ctx.MINUS() != null) {
            //noinspection DataFlowIssue
            v.neg();
        }

        return v;
    }

    @Override
    public FieldMaker visitIncrExpression(KatLanParser.IncrExpressionContext ctx) {
        FieldMaker v;
        if (ctx.varAccess() != null) {
            v = visitVarAccess(ctx.varAccess());
        } else {
            v = getParameter(ctx.name().getText());
        }

        if (ctx.PLUS() != null) {
            v.inc(1);
        } else {
            v.inc(-1);
        }

        return super.visitIncrExpression(ctx);
    }

     */
}
