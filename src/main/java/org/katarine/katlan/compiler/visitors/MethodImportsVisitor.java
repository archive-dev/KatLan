package org.katarine.katlan.compiler.visitors;

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


        for (var statement : ctx.importStatic()) {
            ret.put(statement.AS_KEYWORD()==null ? Arrays.stream(statement.name(0).getText().split("\\."))
                            .toList()
                            .getLast() : statement.name(1).getText(),
                    statement.name(0).getText());
        }

        return ret;
    }
}
