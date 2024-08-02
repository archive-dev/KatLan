package org.katarine.codegen;

import org.junit.jupiter.api.Test;
import org.katarine.katlan.lib.struct.Pair;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class VariableEqTest {
    static class ClassLoader0 extends ClassLoader {
        public Class<?> defineClass(String name, byte[] clazz) {
            return defineClass(name, clazz, 0, clazz.length);
        }
    }

    private ClassGenerator initClass(String name) {
        ClassGenerator cg = new ClassGenerator(name, Type.OBJECT).public_();

        var constructor = cg.addMethod("<init>", "", Type.VOID, new Type[0]);
        constructor.super_().invoke(Type.VOID, MethodType.SPECIAL, "<init>", new Object[0]);
        constructor.return_();

        return cg;
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testEquals() throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        var cg = initClass("Test");

        Method main = cg.addMethod("test", "", Type.BOOLEAN, new Pair[]{
                new Pair<>("a", Type.INT),
                new Pair<>("b", Type.INT)}).public_().static_();
        main.return_(main.param("a").eq(main.param("b")));

        byte[] bytes;
        var cl = new ClassLoader0().defineClass("Test", bytes = cg.toBytes());

        var p = Paths.get("Test.class");
        if (!Files.exists(p))
            p = Files.createFile(p);
        Files.write(p, bytes);

        assertFalse((Boolean) cl.getMethod("test", int.class, int.class).invoke(null, 1, 2));
        assertTrue((Boolean) cl.getMethod("test", int.class, int.class).invoke(null, 1, 1));
    }
}
