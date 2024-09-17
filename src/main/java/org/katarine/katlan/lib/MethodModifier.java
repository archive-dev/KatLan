package org.katarine.katlan.lib;

public final class MethodModifier extends Modifier {
    public static final MethodModifier PRE = new MethodModifier();
    public static final MethodModifier POST = new MethodModifier();
    public static final MethodModifier OPERATOR = new MethodModifier();
    public static final MethodModifier PACKAGE = new MethodModifier();
    public static final MethodModifier OVERRIDE = new MethodModifier();

    private MethodModifier() {}
}
