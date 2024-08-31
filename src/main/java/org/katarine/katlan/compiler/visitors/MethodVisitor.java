package org.katarine.katlan.compiler.visitors;

import org.katarine.codegen.ClassGenerator;
import org.katarine.codegen.Method;
import org.katarine.codegen.Type;
import org.katarine.codegen.Variable;
import org.katarine.katlan.antlr4.KatLanBaseVisitor;
import org.katarine.katlan.antlr4.KatLanParser;
import org.katarine.katlan.compiler.Compiler;
import org.katarine.katlan.lib.struct.Either;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MethodVisitor extends KatLanBaseVisitor<Either<Variable, List<Variable>>> {
    private final HashMap<String, Variable> vars = new HashMap<>();

    private final Method method;

    public MethodVisitor(Compiler compiler, ClassGenerator cg, Method method) {
        super(compiler, cg);
        this.method = method;
    }

    private Variable createVariable(Type type, String name) {
        var ret = vars.put(name, method.var(type, name));
        return ret;
    }

    @Override
    public Either<Variable, List<Variable>> visitVar(KatLanParser.VarContext ctx) {
        if (ctx.varDef() != null) return visitVarDef(ctx.varDef());

        return visitConstDef(ctx.constDef());
    }

    @Override
    public Either<Variable, List<Variable>> visitVarDef(KatLanParser.VarDefContext ctx) {
        if (ctx.varDef0() != null) return visitVarDef0(ctx.varDef0());
        return visitVarDef1(ctx.varDef1());
    }

    @Override
    public Either<Variable, List<Variable>> visitVarDef0(KatLanParser.VarDef0Context ctx) {
        var ret = createVariable(compiler.getImportedType(ctx.type().getText()), ctx.name().getText());

        return new Either.Left<>(ret);
    }

    @Override
    public Either<Variable, List<Variable>> visitVarDef1(KatLanParser.VarDef1Context ctx) {
        List<Variable> ret = new ArrayList<>();

        Type type = compiler.getImportedType(ctx.type().getText());
        for (var v : ctx.subVD1()) {
            ret.add(createVariable(type, v.name().getText()));
        }

        return new Either.Right<>(ret);
    }

    @Override
    public Either<Variable, List<Variable>> visitLogicalOr(KatLanParser.LogicalOrContext ctx) {
        Variable left;
        int prExI, lAndI = prExI = 0;
        if (ctx.primaryExpresion() == null) {
            left = visitLogicalAnd(ctx.logicalAnd(0)).left();
            lAndI++;
        } else {
            left = visitPrimaryExpresion(ctx.primaryExpresion(0)).left();
            prExI++;
        }
        if (ctx.OR() == null) {
            return new Either.Left<>(left);
        }

        Variable right;
        if (ctx.logicalOr() != null) {
            right = visitLogicalOr(ctx.logicalOr()).left();
        } else if (ctx.logicalAnd().size() > lAndI) {
            right = visitLogicalAnd(ctx.logicalAnd(lAndI)).left();
        } else {
            right = visitPrimaryExpresion(ctx.primaryExpresion(prExI)).left();
        }

        return new Either.Left<>(method.and(left, right));
    }

    @Override
    public Either<Variable, List<Variable>> visitLogicalAnd(KatLanParser.LogicalAndContext ctx) {
        Variable left;
        int prExI, lXorI = prExI = 0;
        if (ctx.primaryExpresion() == null) {
            left = visitLogicalXor(ctx.logicalXor(0)).left();
            lXorI++;
        } else {
            left = visitPrimaryExpresion(ctx.primaryExpresion(0)).left();
            prExI++;
        }
        if (ctx.AND() == null) {
            return new Either.Left<>(left);
        }

        Variable right;
        if (ctx.logicalAnd() != null) {
            right = visitLogicalAnd(ctx.logicalAnd()).left();
        } else if (ctx.logicalXor().size() > lXorI) {
            right = visitLogicalXor(ctx.logicalXor(lXorI)).left();
        } else {
            right = visitPrimaryExpresion(ctx.primaryExpresion(prExI)).left();
        }

        return new Either.Left<>(method.and(left, right));
    }

    @Override
    public Either<Variable, List<Variable>> visitLogicalXor(KatLanParser.LogicalXorContext ctx) {
        Variable left;
        int prExI, lNotI = prExI = 0;
        if (ctx.primaryExpresion() == null) {
            left = visitLogicalNot(ctx.logicalNot(0)).left();
            lNotI++;
        } else {
            left = visitPrimaryExpresion(ctx.primaryExpresion(0)).left();
            prExI++;
        }
        if (ctx.XOR() == null) {
            return new Either.Left<>(left);
        }

        Variable right;
        if (ctx.logicalXor() != null) {
            right = visitLogicalXor(ctx.logicalXor()).left();
        } else if (ctx.logicalNot().size() > lNotI) {
            right = visitLogicalNot(ctx.logicalNot(lNotI)).left();
        } else {
            right = visitPrimaryExpresion(ctx.primaryExpresion(prExI)).left();
        }

        return new Either.Left<>(method.xor(left, right));
    }

    @Override
    public Either<Variable, List<Variable>> visitLogicalNot(KatLanParser.LogicalNotContext ctx) {
        var v = visitPrimaryExpresion(ctx.primaryExpresion()).left();

        v.not(); // заебись апи

        return new Either.Left<>(v);
    }
}
