package org.katarine.compiler.visitors;

import org.cojen.maker.MethodMaker;
import org.cojen.maker.Variable;
import org.katarine.compiler.Compiler;
import org.katarine.compiler.antlr4.KatLanBaseVisitor;
import org.katarine.compiler.antlr4.KatLanParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VariableGetter extends KatLanBaseVisitor<Variable> {
    MethodMaker mm;
    final HashMap<String, Integer> vars;

    public VariableGetter(MethodMaker mm, HashMap<String, Integer> vars, HashMap<String, Variable> localVars) {
        this.mm = mm;
        this.vars = vars;
        this.localVars = localVars;
    }

    final HashMap<String, Variable> localVars;
    public Variable getParameter(String name) {
        if (vars.get(name) == null) return null;
        return mm.param(vars.get(name));
    }

//    @Override
//    public Variable visitName(KatLanParser.NameContext ctx) {
//        return getVariable(ctx.getText());
//    }

    private Variable getVariable(String name) {
        Variable v;
        v = getParameter(name);

        if (v == null) {
            v = localVars.get(name);
        }

        if (v == null) {
            try {
                v = mm.var(Compiler.imports.get(name));
            } catch (NullPointerException ignored) {
                v = null;
            }
        }

        if (v == null) {
            v = mm.field(name);
        }

        if (v==null) throw new IllegalStateException("Variable " + name + " is not defined");

        return v;
    }

    @Override
    public Variable visitValue(KatLanParser.ValueContext ctx) {
        Variable v = null;
        if (ctx.name() != null) {
            v = getVariable(ctx.name().getText());
        } else if (ctx.bool() != null) {
            v = visitBool(ctx.bool());
        } else if (ctx.STRING_VAL() != null) {
            v = mm.var(String.class).set(ctx.STRING_VAL().getText().substring(1, ctx.STRING_VAL().getText().length() - 1));
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
    public Variable visitBool(KatLanParser.BoolContext ctx) {
        return mm.var(boolean.class).set(Boolean.parseBoolean(ctx.getText()));
    }

    @Override
    public Variable visitArrayAccess(KatLanParser.ArrayAccessContext ctx) {
        Variable v = visitVarAccess(ctx.varAccess());
        for (var ac : ctx.arrayAccess0()) {
            v = v.aget(visitArithmeticExpression(ac.arithmeticExpression()));
        }
        return v;
    }

    public Variable visitVarAccess(String access, Variable v) {
        String[] accesses = access.split("\\.");

        for (var a : accesses) {
            if (v == null) {
                v = getVariable(a);
            } else {
                try {
                    v.field(a);
                    System.out.println(a);
                } catch (IllegalStateException ignored) {
                    return v;
                }
                v = v.field(a);
            }
        }

        return v;
    }

    public Variable visitVarAccess(KatLanParser.VarAccessContext ctx, Variable v) {
        if (v == null) {
            v = getVariable(ctx.NAME0().getText());
        } else {
            v = v.field(ctx.NAME0().getText());
        }

        if (ctx.varAccess()==null)
            return v;
        else return visitVarAccess(ctx.varAccess(), v);
    }

    @Override
    public Variable visitVarAccess(KatLanParser.VarAccessContext ctx) {
        return visitVarAccess(ctx, null);
    }

//    @Override
//    public Variable visitVar(KatLanParser.VarContext ctx) {
//        return super.visitVar(ctx);
//    }

    public Variable visitMethodCall(KatLanParser.MethodCallContext ctx) {
        Variable v = null;
        for (var mc : ctx.methodCall0()) {
            v = visitMethodCall0(mc, v);
        }
        return v;
    }

    public Variable visitMethodCall0(KatLanParser.MethodCall0Context ctx, Variable v) {
        Object[] args = new Object[]{};

        if (ctx.arguments() != null) {
            args = visitArguments(ctx.arguments(), null);
        }

        String methodName = ctx.NAME0().getText();

        String importedName = (String) Compiler.imports.get(methodName);
        System.out.println(importedName);
        if (importedName != null) {
            methodName = importedName.split("\\.")[importedName.split("\\.").length - 1];

            Variable c = visitVarAccess(importedName, v);
            System.out.println(c.classType());
            return c.invoke(methodName, args);
        }


        if (ctx.varAccess() != null) {
            Variable c = visitVarAccess(ctx.varAccess(), v);
            return c.invoke(methodName, args);
        }

        return mm.invoke(methodName, args);
    }

    public Variable[] visitArguments(KatLanParser.ArgumentsContext ctx, Void dummy) {
        List<Variable> vars = new ArrayList<>();

        ctx.argument().forEach(c -> vars.add(visitArgument(c)));

        return vars.toArray(Variable[]::new);
    }

    @Override
    public Variable visitArgument(KatLanParser.ArgumentContext ctx) {
        return visitValue(ctx.value());
    }

    @Override
    public Variable visitConstructorCall(KatLanParser.ConstructorCallContext ctx) {
        if (ctx.arguments() == null) {
            return mm.new_(Compiler.imports.get(ctx.name().getText()));
        }

        return mm.new_(Compiler.imports.get(ctx.name().getText()), (Object[]) visitArguments(ctx.arguments(), null));
    }

    @Override
    public Variable visitExpression(KatLanParser.ExpressionContext ctx) {
        Variable v = null;
        if (ctx.logicalOr() != null) {
            v = visitLogicalOr(ctx.logicalOr());
        } else if (ctx.primaryExpresion() != null) {
            v = visitPrimaryExpresion(ctx.primaryExpresion());
        } else if (ctx.arithCondExpression() != null) {
            v = visitArithCondExpression(ctx.arithCondExpression());
        }

        return v;
    }

    @Override
    public Variable visitLogicalOr(KatLanParser.LogicalOrContext ctx) {
        // todo
        // how to parse --> ctx.children.forEach(c -> visit(c));
        // yeah
        var left = visit(ctx.children.remove(0));
        if (ctx.children.isEmpty()) return left;
        var result = left.or(visit(ctx.children.remove(1)));

        return result;
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    @Override
    public Variable visitLogicalAnd(KatLanParser.LogicalAndContext ctx) {
        var left = visit(ctx.children.remove(0));
        if (ctx.children.isEmpty()) return left;
        var result = left.and(visit(ctx.children.remove(1)));

        return result;
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    @Override
    public Variable visitLogicalXor(KatLanParser.LogicalXorContext ctx) {
        var left = visit(ctx.children.remove(0));
        if (ctx.children.isEmpty()) return left;
        var right = visit(ctx.children.remove(1));

        var result = left.and(right.not()).or(right.and(left.not()));

        return result;
    }

    @Override
    public Variable visitLogicalNot(KatLanParser.LogicalNotContext ctx) {
        var v = visit(ctx.primaryExpresion());
        if (ctx.NOT() != null) {
            return v.not();
        }
        return v;
    }

    @Override
    public Variable visitPrimaryExpresion(KatLanParser.PrimaryExpresionContext ctx) {
        if (ctx.expression() != null) {
            return visit(ctx.expression());
        } else if (ctx.name() != null) {
            return getVariable(ctx.name().getText());
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
    public Variable visitArithmeticExpression(KatLanParser.ArithmeticExpressionContext ctx) {
        if (ctx.numberExpression() != null) {
            return visitNumberExpression(ctx.numberExpression());
        }

        return visitAddSubExpression(ctx.addSubExpression());
    }

    @Override
    public Variable visitAddSubExpression(KatLanParser.AddSubExpressionContext ctx) {
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
    public Variable visitModDivExpression(KatLanParser.ModDivExpressionContext ctx) {
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
    public Variable visitMulDivExpression(KatLanParser.MulDivExpressionContext ctx) {
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
    public Variable visitPowerExpression(KatLanParser.PowerExpressionContext ctx) {
        var left = visitNumberExpression(ctx.numberExpression(0));
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
    public Variable visitNumberExpression(KatLanParser.NumberExpressionContext ctx) {
        Variable v = null;
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
            v = getVariable(ctx.name().getText());
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
    public Variable visitIncrExpression(KatLanParser.IncrExpressionContext ctx) {
        Variable v;
        if (ctx.varAccess() != null) {
            v = visitVarAccess(ctx.varAccess());
        } else {
            v = getVariable(ctx.name().getText());
        }

        if (ctx.PLUS() != null) {
            v.inc(1);
        } else {
            v.inc(-1);
        }

        return super.visitIncrExpression(ctx);
    }

    @Override
    public Variable visitArithCondExpression(KatLanParser.ArithCondExpressionContext ctx) {
        var left = visitArithmeticExpression(ctx.arithmeticExpression(0));
        var right = visitArithmeticExpression(ctx.arithmeticExpression(1));

        if (ctx.BT() != null) {
            return left.gt(right);
        } else if (ctx.LT() != null) {
            return left.lt(right);
        } else if (ctx.BE() != null) {
            return left.ge(right);
        } else if (ctx.LE() != null) {
            return left.le(right);
        } else if (ctx.EQ() != null) {
            return left.eq(right);
        } else if (ctx.NE() != null) {
            return left.ne(right);
        }

        return super.visitArithCondExpression(ctx);
    }
}
