package org.katarine.codegen;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class CodeScope {
    protected final CodeScope parentScope;
    protected final ArrayList<CodeScope> childScopes = new ArrayList<>();
    protected final HashMap<Object, Variable> variables = new HashMap<>();

    public CodeScope() {
        this(null);
    }

    public CodeScope(CodeScope parentScope) {
        this.parentScope = parentScope;
    }
}
