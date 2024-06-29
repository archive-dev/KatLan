package org.katarine.katlan.lib;

import java.util.HashMap;
import java.util.Objects;

public final class Classes {
    private Classes(){}

    private static final HashMap<Class<?>, ClassLink> classes = new HashMap<>();

    static void registerClass(ClassLink cl) {
        classes.put(cl.jClass(), cl);
    }

    public static ClassLink getClassLink(Class<?> clazz) {
        return classes.get(clazz);
    }

    /**
     * Retrieves the {@link ClassLink} object for the specified class name.
     *
     * @param className the name of the class
     * @return the {@link ClassLink} object for the specified class name
     * @throws ClassNotFoundException if the class is not found
     */
    public static ClassLink getClassLink(String className) throws ClassNotFoundException {
        try {
            return classes.values().stream().filter(c -> Objects.equals(c.getName(), className)).findFirst().orElseGet(null);
        } catch (NullPointerException e) {
            throw new ClassNotFoundException("Class not found: " + className);
        }
    }
}
