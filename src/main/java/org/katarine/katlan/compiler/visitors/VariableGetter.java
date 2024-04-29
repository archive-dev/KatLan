package org.katarine.katlan.compiler.visitors;

import org.cojen.maker.Label;
import org.katarine.katlan.compiler.antlr4.KatLanBaseVisitor;
import org.cojen.maker.MethodMaker;
import org.cojen.maker.Variable;
import org.katarine.katlan.compiler.Compiler;
import org.katarine.katlan.compiler.antlr4.KatLanParser;
import org.katarine.katlan.compiler.internal.MethodCall;
import org.katarine.katlan.lib.ClassLink;
import org.katarine.katlan.lib.MethodLink;
import org.katarine.katlan.lib.annotations.KLAnnotation;

import java.util.*;

public class VariableGetter extends KatLanBaseVisitor<Variable> {
    MethodMaker mm;
    final HashMap<String, Integer> vars;
    Compiler compiler;

    public VariableGetter(MethodMaker mm, Compiler compiler, HashMap<String, Integer> vars, HashMap<String, Variable> localVars) {
        this.mm = mm;
        this.compiler = compiler;
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

    public Variable getVariable(String name) {
        Variable v;
        v = getParameter(name);

        if (v == null) {
            v = localVars.get(name);
        }

        if (v == null) {
            try {
                v = mm.var(compiler.imports.get(name));
            } catch (NullPointerException ignored) {}
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
//                    System.out.println(a);
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

    public Variable visitAnnotationCall(KatLanParser.AnnotationCallContext ctx, Variable annotated) {
        ArrayList<Object> args = new ArrayList<>();
        args.add(annotated);
        if (ctx.arguments()!=null)
            args.addAll(List.of(visitArguments(ctx.arguments(), null)));

        return mm.new_(compiler.imports.get(ctx.name().getText()), args.toArray(Object[]::new));
    }

    public Variable visitAnnotationCalls(List<KatLanParser.AnnotationCallContext> ctx, Variable annotated) {
        Variable annArr = mm.var(KLAnnotation[].class).set(mm.new_(KLAnnotation[].class, ctx.size()));
        for (int i = 0; i < ctx.size(); i++) {
            var c = ctx.get(i);
            annArr.aset(i, visitAnnotationCall(c, annotated));
        }
        return annArr;
    }

    public Variable visitMethodCall0(KatLanParser.MethodCall0Context ctx, Variable v) {
        // TODO OPTIMIZE
        Variable[] args = new Variable[]{};

        if (ctx.arguments() != null) {
            args = visitArguments(ctx.arguments(), null);
        }

        String methodName = ctx.NAME0().getText();

        String importedName = (String) compiler.imports.get(methodName);
//        System.out.println(importedName);
        Variable owner = null;
        if (importedName != null) {
            methodName = importedName.split("\\.")[importedName.split("\\.").length - 1];

            owner = visitVarAccess(importedName, v);
//            System.out.println(c.classType());
        }

        if (ctx.varAccess() != null) {
            owner = visitVarAccess(ctx.varAccess(), v);
        }

        Variable argTypes = mm.var(Class[].class).set(mm.new_(Class[].class, args.length));
        Variable argsV = mm.var(Object[].class).set(mm.new_(Object[].class, args.length));
        for (int i = 0; i < args.length; i++) {
            var a = args[i];
            argTypes.aset(i, a.classType());
            argsV.aset(i, a);
        }

//        new MethodLink(owner.classType(), owner, methodName, Arrays.stream(args).map(Object::getClass).toArray(Class[]::new));
        Variable methodLink = mm.var(MethodLink.class);
        Label l = mm.label();
        Label l2 = mm.label();
        owner.invoke("getClass").invoke("equals", mm.class_()).ifNe(true, l);
        methodLink.set(mm.field("klclass").invoke("getMethodLink", methodName, argTypes));
        mm.goto_(l2);
        l.here();
        methodLink.set(mm.new_(ClassLink.class, owner.invoke("getClass")).invoke("getMethodLink", methodName, argTypes));
        l2.here();

        List<KatLanParser.AnnotationCallContext> annotationCall = ctx.annotationCall();

        Variable methodCall = mm.new_(MethodCall.class, methodLink, owner, argsV);
        Variable annotationsArr = visitAnnotationCalls(annotationCall, methodCall);
        methodCall.field("annotations").invoke("addAll", mm.var(List.class).invoke("of", annotationsArr));

        return methodCall.invoke("call");
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
            return mm.new_(compiler.imports.get(ctx.name().getText()));
        }

        return mm.new_(compiler.imports.get(ctx.name().getText()), (Object[]) visitArguments(ctx.arguments(), null));
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

        return left.or(visit(ctx.children.remove(1)));
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
