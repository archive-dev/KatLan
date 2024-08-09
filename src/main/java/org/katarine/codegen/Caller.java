package org.katarine.codegen;

public interface Caller {
    void invokeVoid(Variable owner, MethodType type, String name, Object[] arguments);
    Variable invoke(Variable owner, Type returnType, MethodType type, String name, Object[] arguments);
    Variable invoke(Variable owner, Method method, Object[] arguments);
}
