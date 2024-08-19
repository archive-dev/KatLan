package org.katarine.katlan.compiler.visitors;

import org.katarine.codegen.Type;
import org.katarine.katlan.antlr4.KatLanBaseVisitor;
import org.katarine.katlan.antlr4.KatLanParser;

import java.util.Arrays;
import java.util.HashMap;

public class TypeImportsVisitor extends KatLanBaseVisitor<HashMap<String, Type>> {
    @Override
    public HashMap<String, Type> visitImportBlock(KatLanParser.ImportBlockContext ctx) {
        final HashMap<String, Type> ret = new HashMap<>();
        if (ctx == null) return ret;
        if (ctx.importStatement() == null || ctx.importStatement().isEmpty())
            return ret;


        for (var statement : ctx.importStatement()) {
            ret.put(statement.AS_KEYWORD()==null ? Arrays.stream(statement.name(0).getText().split("\\."))
                            .toList()
                            .getLast() : statement.name(1).getText(),
                    getImportedType(statement));
        }

        return ret;
    }

    private Type getImportedType(KatLanParser.ImportStatementContext ctx) {
        return new Type.SimpleType(ctx.name(0).getText());
    }
}
