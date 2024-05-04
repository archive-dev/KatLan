package org.katarine.katlan.lib;

import java.io.Serializable;
import java.util.ArrayList;

public class KLPackage implements Serializable {
    public final Package pkg;

    private final ArrayList<ClassLink> classes = new ArrayList<>();

    public KLPackage(Package pkg) {
        this.pkg = pkg;
    }

    public KLPackage(ClassLoader loader, String packageName) {
        this(loader.getDefinedPackage(packageName));
    }
}
