package org.katarine.compiler.visitors;

import org.katarine.compiler.antlr4.KatLanBaseVisitor;
import org.katarine.compiler.antlr4.KatLanParser;

public class KLPackageVisitor extends KatLanBaseVisitor<String> {
    @Override
    public String visitPackage(KatLanParser.PackageContext ctx) {
        return ctx.NAME().getText();
    }
}
