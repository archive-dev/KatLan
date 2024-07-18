package org.katarine.codegen;

import org.katarine.katlan.lib.StringUtils;
import org.objectweb.asm.Type;

import java.util.HashMap;
import java.util.Map;

public final class TypeResolver {
    private TypeResolver() {}

    private static final Map<String, String> primitiveDescriptors = new HashMap<>(
            Map.of(
                    "void", "V",
                    "boolean", "Z",
                    "byte", "B",
                    "char", "C",
                    "short", "S",
                    "int", "I",
                    "long", "J",
                    "float", "F"
            )
    );

    public static String getTypeDescriptor(Class<?> clazz) {
        return Type.getDescriptor(clazz);
    }

    public static boolean isPrimitive(String descriptor) {
        return primitiveDescriptors.containsKey(descriptor) || primitiveDescriptors.containsValue(descriptor);
    }

    public static boolean isArray(String descriptor) {
        return StringUtils.count(descriptor, "[") > 0;
    }

    /**
     *
     * @param type Fully qualified type name (i.e., org.example.Example[])
     * @return Type descriptor string
     */
    public static String getTypeDescriptor(String type) {
        int arrayDimensions = StringUtils.count(type, "]");
        type = replaceChars(type);

        if (isPrimitive(type)) {
            type = primitiveDescriptors.get(type);
        } else {
            type = "L" + type + ";";
        }
        for (int i = 0; i < arrayDimensions; i++) {
            type = "[" + type;
        }
        return type;
    }

    public static String getInternalTypeName(Class<?> clazz) {
        return Type.getInternalName(clazz);
    }

    public static String getInternalTypeName(String type) {
        int arrayDimensions = StringUtils.count(type, "]");
        type = replaceChars(type);

        if (isPrimitive(type)) {
            type = primitiveDescriptors.get(type);
        } else if (arrayDimensions > 0) {
            type = "L" + type;
        }

        for (int i = 0; i < arrayDimensions; i++) {
            type = "[" + type;
        }
        return type;
    }

    public static String descriptorToInternal(String descriptor) {
        if (descriptor.contains("[")) return descriptor;
        String internal = descriptor.replaceAll("\\[", "");
        if (internal.length()==1) return internal;
        internal = internal.substring(1, internal.length()-1);
        return internal;
    }

    private static String replaceChars(String str) {
        str = str.replaceAll("\\.", "/");
        str = str.replaceAll("\\[", "");
        str = str.replaceAll("]", "");
        return str.replaceAll(" ", "");
    }
}
