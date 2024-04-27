package org.katarine.katlan.compiler.visitors;

import org.katarine.katlan.compiler.antlr4.KatLanBaseVisitor;
import org.katarine.katlan.compiler.antlr4.KatLanParser;

public class KLPackageVisitor extends KatLanBaseVisitor<String> {
    @Override
    public String visitPackage(KatLanParser.PackageContext ctx) {
        return ctx.name().getText();
    }
}
