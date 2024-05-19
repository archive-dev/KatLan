package org.katarine.katlan.lib;

import java.util.HashMap;
import java.util.HashSet;

public final class Packages {
    private Packages() {}

    private static final HashMap<Package, KLPackage> packages = new HashMap<>();

    public static KLPackage getPackage(String packageName) {
        for (var p : packages.entrySet()) {
            if (p.getKey().getName().equals(packageName))
                return p.getValue();
        }
        KLPackage pk;
        packages.put(
                Packages.class.getClassLoader().getDefinedPackage(packageName),
                pk = new KLPackage(Packages.class.getClassLoader(), packageName)
        );

        return pk;
    }

    @SuppressWarnings("unchecked")
    public static HashMap<Package, KLPackage> getPackages() {
        return (HashMap<Package, KLPackage>) packages.clone();
    }

    static void registerPackage(KLPackage klPackage) {
        if (!packages.containsValue(klPackage))
            packages.put(klPackage.pkg, klPackage);
    }
}
