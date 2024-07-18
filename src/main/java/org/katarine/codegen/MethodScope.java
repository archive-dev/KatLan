package org.katarine.codegen;

import org.objectweb.asm.Opcodes;

import java.util.HashMap;

public class MethodScope extends CodeScope {
    private final Method method;
    private int varCounter = 0;

    public MethodScope(Method method, CodeScope parentScope) {
        super(parentScope);
        this.method = method;
        var params = this.method.getParameters();
        initializeParams(params);
    }

    private void initializeParams(HashMap<String, Type> params) {
        if (!method.isStatic()) {
            createVariable(method.getOwner().getType(), "this");
        }
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
