package org.katarine.katlan.lib.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@java.lang.annotation.Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Operator {
    enum Operators {
        PLUS,
        MINUS,
        DIVIDE,
        MULTIPLY,
        DIV,
        MOD
    }

    Operators value();
}
