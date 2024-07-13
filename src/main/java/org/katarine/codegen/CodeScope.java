package org.katarine.codegen;

import java.util.ArrayList;

public abstract class CodeScope {
    protected final CodeScope parentScope;
    protected final ArrayList<CodeScope> childScopes = new ArrayList<>();

    public CodeScope() {
        this(null);
    }

    public CodeScope(CodeScope parentScope) {
        this.parentScope = parentScope;
    }
}
