package org.katarine.compiler.visitors;

import org.antlr.v4.runtime.tree.ParseTree;
import org.cojen.maker.Label;
import org.cojen.maker.MethodMaker;
import org.cojen.maker.Variable;
import org.katarine.compiler.Compiler;
import org.katarine.compiler.antlr4.KatLanBaseVisitor;
import org.katarine.compiler.antlr4.KatLanParser;

import java.util.HashMap;
import java.util.List;

public class KLMethodVisitor extends KatLanBaseVisitor<Variable> {
    private MethodMaker mm;
    final HashMap<String, Integer> vars = new HashMap<>(); // <name, index>
    final HashMap<String, Variable> localVars = new HashMap<>();

    private final VariableGetter vg;

    public KLMethodVisitor(MethodMaker mm, HashMap<String, Integer> vars) {
        this.mm = mm;
        this.vars.putAll(vars);
        vg = new VariableGetter(mm, this.vars, this.localVars);
    }

    @Override
    public Variable visitBlock(KatLanParser.BlockContext ctx) {
        visitLines(ctx.lineBlock());
        return null;
    }

    public void visitLines(List<KatLanParser.LineBlockContext> ctx) {
        if (ctx!=null) {
            ctx.forEach(this::visitLineBlock);
        }
    }

    @Override
    public Variable visitLineBlock(KatLanParser.LineBlockContext ctx) {
        System.out.println("LB");
//        System.out.println(ctx.parent.parent.getClass());
        for (ParseTree c : ctx.children) {
            visit(c);
        }
        return null;
    }

    @Override
    public Variable visitMethodCall(KatLanParser.MethodCallContext ctx) {
        return vg.visitMethodCall(ctx);
//        return mm.var("java.lang.System").field("out").invoke("println", "hi");
    }

    @Override
    public Variable visitStatement(KatLanParser.StatementContext ctx) {
        if (ctx.returnStatement()!=null) {
            return visitReturnStatement(ctx.returnStatement());
        } else if (ctx.ifStatement()!=null) {
            return visitIfStatement(ctx.ifStatement());
        } else if (ctx.whileLoopStatement()!=null) {
            return visitWhileLoopStatement(ctx.whileLoopStatement());
        }
        return super.visitStatement(ctx);
    }

    @Override
    public Variable visitVarAssignment(KatLanParser.VarAssignmentContext ctx) {
        if (ctx.varAccess()!=null) {
            var v = vg.visitVarAccess(ctx.varAccess());

            v.set(vg.visitValue(ctx.value()));
        } else if (ctx.incrExpression()!=null) {
            var v = vg.visitIncrExpression(ctx.incrExpression());
        }

        return null;
    }

    @Override
    public Variable visitWhileLoopStatement(KatLanParser.WhileLoopStatementContext ctx) {
        Label start = mm.label();
        Label end = mm.label();


        start.here();
        Variable v = vg.visitExpression(ctx.expression());

        v.ifNe(true, end);

        if (ctx.lineBlock()!=null)
            visitLineBlock(ctx.lineBlock());
        else
            visitBlock(ctx.block());

        start.goto_();

        end.here();

        return null;
    }

    @Override
    public Variable visitIfStatement(KatLanParser.IfStatementContext ctx) {
        var ctx2 = ctx.ifStatement0(0);
        var v1 = vg.visitExpression(ctx.expression());

        if (ctx.ELSE_KEYWORD()!=null) {
            v1.ifEq(true, () -> {
            visitIfStatement0(ctx2);

            }, () -> {
                visitIfStatement0(ctx.ifStatement0(1));
            });
        } else {
            v1.ifNe(true, () -> {
                visitIfStatement0(ctx2);
            });
        }

        return null;
    }

    @Override
    public Variable visitIfStatement0(KatLanParser.IfStatement0Context ctx) {
        if (ctx.lineBlock()!=null)
            visitLineBlock(ctx.lineBlock());
        else
            visitBlock(ctx.block());

        return null;
    }

    @Override
    public Variable visitReturnStatement(KatLanParser.ReturnStatementContext ctx) {
        if (ctx.value() != null)
            mm.return_(vg.visitValue(ctx.value()));
        else mm.return_();

        return super.visitReturnStatement(ctx);
    }

    @Override
    public Variable visitVar(KatLanParser.VarContext ctx) {
        //System.out.println(ctx.getText());
        if (ctx.constDef()!=null) {
            return visitConstDef(ctx.constDef());
        } else {
            Variable v = visitVarDef(ctx.varDef());
            //System.out.println("0 " + v.classType());
            return v;
        }
    }

    @Override
    public Variable visitConstDef(KatLanParser.ConstDefContext ctx) {
        Variable v;
        if (ctx.constDef0()!=null) {
            v = visitConstDef0(ctx.constDef0());
        } else {
            v = visitConstDef1(ctx.constDef1());
        }

        return v;
    }

    @Override
    public Variable visitConstDef0(KatLanParser.ConstDef0Context ctx) {
        Variable v;
        v = mm.var(getType(ctx.type().getText())).name(ctx.name().getText());

        v.set(vg.visitValue(ctx.value()));

        try {
            return v;
        } finally {
            localVars.put(ctx.name().getText(), v);
        }
    }

    @Override
    public Variable visitConstDef1(KatLanParser.ConstDef1Context ctx) {
        return super.visitConstDef1(ctx);
    }

    @Override
    public Variable visitVarDef(KatLanParser.VarDefContext ctx) {
        Variable v;
        if (ctx.varDef0()!=null) {
            v = visitVarDef0(ctx.varDef0());
            //System.out.println("1 " + v.classType());
        } else {
            v = visitVarDef1(ctx.varDef1());
        }

        return v;
    }

    @Override
    public Variable visitVarDef0(KatLanParser.VarDef0Context ctx) {
        Variable v;
        v = mm.var(getType(ctx.type().getText())).name(ctx.name().getText());
        //System.out.println("3 " + v.classType());
        v.set(vg.visitValue(ctx.value()));
        //System.out.println("2 " + v.classType());

        try {
            return v;
        } finally {
            localVars.put(ctx.name().getText(), v);
        }
    }

    @Override
    public Variable visitVarDef1(KatLanParser.VarDef1Context ctx) {
        return super.visitVarDef1(ctx);
    }

    public Object getType(String type) {
        return Compiler.imports.get(type);
    }
}
