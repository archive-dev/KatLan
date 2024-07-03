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

    /**
     *
     * @param type Fully qualified type name (i.e. org.example.Example[])
     * @return Type descriptor string
     */
    public static String getTypeDescriptor(String type) {
        int arrayDimensions = StringUtils.count(type, "]");
        type = replaceChars(type);

        if (primitiveDescriptors.get(type) != null) {
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

        if (primitiveDescriptors.get(type) != null) {
            type = primitiveDescriptors.get(type);
        } else if (arrayDimensions > 0) {
            type = "L" + type;
        }

        for (int i = 0; i < arrayDimensions; i++) {
            type = "[" + type;
        }
        return type;
    }

    private static String replaceChars(String str) {
        str = str.replaceAll("\\.", "/");
        str = str.replaceAll("\\[", "");
        str = str.replaceAll("]", "");
        return str.replaceAll(" ", "");
    }
}
