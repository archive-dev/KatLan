package org.katarine.katlan.lib;

public class MethodModifier extends Modifier {
    public static final MethodModifier PRE = new MethodModifier();
    public static final MethodModifier POST = new MethodModifier();
    public static final MethodModifier OPERATOR = new MethodModifier();
    public static final MethodModifier PACKAGE = new MethodModifier();

    protected MethodModifier() {}
}
