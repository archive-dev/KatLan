package org.katarine.katlan.compiler.visitors;

import org.cojen.maker.ClassMaker;
import org.katarine.katlan.compiler.antlr4.KatLanBaseVisitor;
import org.katarine.katlan.compiler.antlr4.KatLanParser;

import java.util.HashMap;

public class KLImportVisitor extends KatLanBaseVisitor<HashMap<String, Object>> {
    private ClassMaker cm;

    public KLImportVisitor(ClassMaker cm) {
        this.cm = cm;
    }

    @Override
    public HashMap<String, Object> visitImportBlock(KatLanParser.ImportBlockContext ctx) {
        HashMap<String, Object> map = new HashMap<>();

        ctx.importStatement().forEach(is -> {
            if (is.AS_KEYWORD()!=null) {
                map.put(is.name(1).getText(), is.name(0).getText());
            } else {
                map.put(is.name(0).getText().substring(is.name(0).getText().lastIndexOf('.')+1), is.name(0).getText());
            }
        });
        return map;
    }
}
