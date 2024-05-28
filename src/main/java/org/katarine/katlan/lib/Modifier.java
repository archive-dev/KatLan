package org.katarine.katlan.lib;

import java.io.Serializable;

public class Modifier implements Serializable {
    public static final Modifier NONE = new Modifier();
    public static final Modifier FINAL = new Modifier();
    public static final Modifier ABSTRACT = new Modifier();

    public Modifier() {}
}
