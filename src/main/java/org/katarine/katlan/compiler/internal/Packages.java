package org.katarine.katlan.compiler.internal;

import org.katarine.katlan.lib.KLPackage;

import java.util.HashSet;

public final class Packages {
    public static final HashSet<KLPackage> packages = new HashSet<>();

    public static KLPackage getPackage(String packageName) {
        for (var p : packages) {
            if (p.pkg.getName().equals(packageName))
                return p;
        }
        return new KLPackage(ClassLoader.getSystemClassLoader(), packageName);
    }
}
