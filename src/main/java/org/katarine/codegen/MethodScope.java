package org.katarine.codegen;

import java.util.HashMap;

public class MethodScope extends CodeScope {
    public static class ArgVariable extends Variable {
        public ArgVariable(Type type, String name, CodeScope ownerScope, Method method, int index) {
            super(type, name, ownerScope, method, index);
        }
    }

    private final Method method;
    private final HashMap<Object, Variable> variables = new HashMap<>();
    private int varCounter = 0;

    public MethodScope(Method method, CodeScope parentScope) {
        super(parentScope);
        this.method = method;
        var params = this.method.getParameters();
        for (var v : params.entrySet()) {
            createVariable(v.getValue(), v.getKey());
        }
    }

    public Variable createVariable(Type type, String name) {
        return createVariable(type, name, name);
    }

    private Variable createVariable(Type type, String name, Object key) {
        var var = new Variable(type, name, this, this.method, varCounter++);
        this.variables.put(key, var);
        return var;
    }

    public MethodScope(Method method) {
        this(method, null);
    }
}
