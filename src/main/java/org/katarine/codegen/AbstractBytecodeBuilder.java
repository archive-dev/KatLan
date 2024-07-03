package org.katarine.codegen;

public abstract class AbstractBytecodeBuilder<T> {
    protected T visitor;

    protected AbstractBytecodeBuilder(T visitor) {
        this.visitor = visitor;
    }

    public T build() {
        return visitor;
    }
}
