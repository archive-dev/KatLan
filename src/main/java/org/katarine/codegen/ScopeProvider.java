package org.katarine.codegen;

@FunctionalInterface
public interface ScopeProvider {
    <T extends MethodScope, M extends Method> T get(M method);
}
