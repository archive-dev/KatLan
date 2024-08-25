package org.katarine.katlan.compiler.visitors;

import org.katarine.codegen.ClassGenerator;
import org.katarine.codegen.Method;
import org.katarine.codegen.Signature;
import org.katarine.codegen.Type;
import org.katarine.katlan.antlr4.KatLanBaseVisitor;
import org.katarine.katlan.antlr4.KatLanParser;
import org.katarine.katlan.compiler.Compiler;
import org.katarine.katlan.lib.struct.Pair;

import java.util.ArrayList;
import java.util.List;

public class MethodDefVisitor extends KatLanBaseVisitor<List<Method>> {
    public MethodDefVisitor(Compiler compiler, ClassGenerator cg) {
        super(compiler, cg);
    }

    @Override
    public List<Method> visitClassBlock(KatLanParser.ClassBlockContext ctx) {
        ArrayList<Method> ret = new ArrayList<>();

        for (var m : ctx.methodDef()) {
            ret.add(resolveMethod(m));
        }

        this.compiler.methods.addAll(ret);

        return ret;
    }

    @SuppressWarnings("unchecked")
    private Method resolveMethod(KatLanParser.MethodDefContext ctx) {
        String name = ctx.name().getText();
        Type returnType = compiler.getImportedType(ctx.type().getText());
//        ArrayList<String> generics = new ArrayList<>();
//        String signature = "do me";
        Signature signature = new Signature(); // TODO: generics

        ArrayList<Pair<String, Type>> params = new ArrayList<>();

        for (var param : ctx.parameters().parameter()) {
            params.add(new Pair<>(param.name().getText(), compiler.getImportedType(param.type().getText())));
        }

        var ret = this.cg.addMethod(name, signature, returnType, params.toArray(Pair[]::new));

        if (ctx.access().PUBLIC() != null)                   ret.public_();
        if (ctx.access().PRIVATE() != null)                  ret.public_();
        if (ctx.access().PROTECTED() != null)                ret.public_();
        if (ctx.access().STATIC() != null)                   ret.static_();
        if (ctx.access().FINAL() != null)                    ret.static_();

        if (ctx.methodModifier().ABSTRACT_KEYWORD() != null) ret.abstract_();

        return ret;
    }
}
