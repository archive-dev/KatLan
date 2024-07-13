package org.katarine.katlan.lib;

import java.io.*;
import java.util.HashSet;

public class KLPackage implements Serializable {
    public final Package pkg;

    private final HashSet<ClassReference> classes = new HashSet<>();
    private final HashSet<MethodReference> methods = new HashSet<>();
    private final HashSet<FieldReference> fields = new HashSet<>();

    public static KLPackage of(Package pkg) {
        KLPackage p;
        if (Packages.getPackages().containsKey(pkg)) {
            return p = Packages.getPackages().get(pkg);
        }
        p = new KLPackage(pkg);
        Packages.registerPackage(p);
        return p;
    }

    KLPackage(Package pkg) {
        this.pkg = pkg;
        ClassLoader cl = this.getClass().getClassLoader();
        try (InputStream is = cl.getResourceAsStream(this.pkg.getName())) {
            assert is != null;
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            classes.addAll(br.lines().filter(l -> l.endsWith(".class"))
                    .map(l -> {
                        try {
                            return Class.forName(this.pkg.getName() + "."
                                    + l.substring(0, l.lastIndexOf('.')));
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .map(ClassReference::new)
                    .toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    KLPackage(ClassLoader loader, String packageName) {
        this(loader.getDefinedPackage(packageName));
    }

    @SuppressWarnings("unchecked")
    public HashSet<ClassReference> getClasses() {
        return (HashSet<ClassReference>) classes.clone();
    }

    @SuppressWarnings("unchecked")
    public HashSet<MethodReference> getMethods() {
        return (HashSet<MethodReference>) methods.clone();
    }

    @SuppressWarnings("unchecked")
    public HashSet<FieldReference> getFields() {
        return (HashSet<FieldReference>) fields.clone();
    }

    void registerClass(ClassReference clazz) {
        this.classes.add(clazz);
    }

    void registerMethod(MethodReference method) {
        this.methods.add(method);
    }

    void registerField(FieldReference field) {
        this.fields.add(field);
    }
}
