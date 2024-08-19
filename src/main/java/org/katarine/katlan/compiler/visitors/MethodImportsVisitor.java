package org.katarine.katlan.compiler.visitors;

import org.katarine.codegen.Type;
import org.katarine.katlan.antlr4.KatLanBaseVisitor;
import org.katarine.katlan.antlr4.KatLanParser;

import java.util.Arrays;
import java.util.HashMap;

public class MethodImportsVisitor extends KatLanBaseVisitor<HashMap<String, String>> {
    @Override
    public HashMap<String, String> visitImportBlock(KatLanParser.ImportBlockContext ctx) {
        final HashMap<String, String> ret = new HashMap<>();
        if (ctx == null) return ret;
        if (ctx.importStatement() == null || ctx.importStatement().isEmpty())
            return ret;


        for (var statement : ctx.importMethod()) {
            ret.put(statement.AS_KEYWORD()==null ? Arrays.stream(statement.name(0).getText().split("\\."))
                            .toList()
                            .getLast() : statement.name(1).getText(),
                    getImportedMethod(statement));
        }

        return ret;
    }

    private String getImportedMethod(KatLanParser.ImportMethodContext ctx) {
        String methodName = Arrays.stream(ctx.name(0).getText().split("\\.")).toList().getLast();
        String ownerClass = ctx.name(0).getText().split(methodName)[0];
        ownerClass = ownerClass.substring(0, ownerClass.length()-1);
        return new Type.SimpleType(ownerClass).getDescriptor() + "." + methodName;
    }
}
