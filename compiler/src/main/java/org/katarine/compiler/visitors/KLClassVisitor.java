package org.katarine.compiler.visitors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.katarine.compiler.antlr4.KatLanBaseVisitor;
import org.katarine.compiler.antlr4.KatLanParser;

public class KLClassVisitor extends KatLanBaseVisitor<ParserRuleContext> {
    @Override
    public ParserRuleContext visitClass(KatLanParser.ClassContext ctx) {
        if (ctx.classDef() != null) {
            return ctx.classDef();
        }
        else if (ctx.unnamedClassDef() != null) {
            return ctx.unnamedClassDef();
        } else {
            return ctx.interfaceDef();
        }
    }
}
