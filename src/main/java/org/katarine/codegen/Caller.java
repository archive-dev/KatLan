package org.katarine.codegen;

public interface Caller {
    void invokeVoid(MethodType type, String name, Object[] arguments);
    Variable invoke(Type returnType, MethodType type, String name, Object[] arguments);
    default Variable invoke(Method method, Object[] arguments) {
        return invoke(method.getReturnType(), method.getMethodType(), method.getName(), arguments);

}
