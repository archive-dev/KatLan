package org.katarine.katlan.lib;

public interface Handler {
    default void handle(Object caller, Object returned, Object... args) {}
    default void handle(Object caller, Object... args) {}
    default void handle(Object caller, Object returned) {}
    default void handle(Object caller) {}
}
