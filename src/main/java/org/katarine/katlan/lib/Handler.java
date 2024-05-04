package org.katarine.katlan.lib;

import java.io.Serializable;

public interface Handler extends Serializable {
    default void handle(Object caller, Object returned, Object... args) {}
    default void handle(Object caller, Object... args) {}
    default void handle(Object caller, Object returned) {}
    default void handle(Object caller) {}
}
