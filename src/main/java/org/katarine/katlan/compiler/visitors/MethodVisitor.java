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
import java.util.List;

public class MethodVisitor extends KatLanBaseVisitor<Either<Variable, List<Variable>>> {
    private final Method method;
    
    public MethodVisitor(Compiler compiler, ClassGenerator cg, Method method) {
        super(compiler, cg);
        this.method = method;
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
        var ret = method.var(compiler.getImportedType(ctx.type().getText()), ctx.name().getText());

        return new Either.Left<>(ret);
    }

    @Override
    public Either<Variable, List<Variable>> visitVarDef1(KatLanParser.VarDef1Context ctx) {
        List<Variable> ret = new ArrayList<>();

        Type type = compiler.getImportedType(ctx.type().getText());
        for (var v : ctx.subVD1()) {
            ret.add(method.var(type, v.name().getText()));
        }

        return new Either.Right<>(ret);
    }
}
