package org.katarine.codegen;

import java.util.HashMap;

public class MethodScope extends CodeScope {
    public static class ArgVariable extends Variable {
        public ArgVariable(Type type, String name, CodeScope ownerScope) {
            super(type, name, ownerScope);
        }
    }

    private final Method method;
    private final HashMap<Object, Variable> variables = new HashMap<>();

    public MethodScope(Method method, CodeScope parentScope) {
        super(parentScope);
        this.method = method;
        var params = this.method.getParameters();
        for (var v : params.entrySet()) {
            this.variables.put(v.getKey(), new ArgVariable(v.getValue(), v.getKey(), this));
        }
    }

    public MethodScope(Method method) {
        this(method, null);
    }
}
