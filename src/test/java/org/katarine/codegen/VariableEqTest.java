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

    private void genDebugClassFile(ClassGenerator cg) throws IOException {
        byte[] bytes = cg.toBytes();

        var p = Paths.get(cg.getName() + ".class");
        if (!Files.exists(p))
            p = Files.createFile(p);
        Files.write(p, bytes);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testEqualsInt() throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        var cg = initClass("Test");

        Method main = cg.addMethod("test", "", Type.BOOLEAN, new Pair[]{
                new Pair<>("a", Type.INT),
                new Pair<>("b", Type.INT)}).public_().static_();
        main.return_(main.param("a").eq(main.param("b")));

        genDebugClassFile(cg);

        var cl = new ClassLoader0().defineClass("Test", cg.toBytes());

        assertFalse((Boolean) cl.getMethod("test", int.class, int.class).invoke(null, 1, 2));
        assertTrue((Boolean) cl.getMethod("test", int.class, int.class).invoke(null, 1, 1));
    }

    @Test
    public void testEqualsObj() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException {
        var cg = initClass("Test_1");

        Method main = cg.addMethod("test", "", Type.BOOLEAN, new Pair[]{
                new Pair<>("a", Type.OBJECT),
                new Pair<>("b", Type.OBJECT)}).public_().static_();
        main.ifEq(main.param("a"), main.param("b"),
                () -> {
                    main.return_(true);
        });
        main.return_(false);

        genDebugClassFile(cg);

        var cl = new ClassLoader0().defineClass("Test_1", cg.toBytes());

        // this is intended behaviour of JVM
        assertFalse((Boolean) cl.getMethod("test", Object.class, Object.class).invoke(null, 5.0f, 5.0f));
        
        assertTrue((Boolean) cl.getMethod("test", Object.class, Object.class).invoke(null, "String!", "String!"));
    }

    @Test
    public void testEqualsFloat() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException {
        var cg = initClass("Test_Float");

        Method main = cg.addMethod("test", "", Type.BOOLEAN, new Pair[]{
                new Pair<>("a", Type.FLOAT),
                new Pair<>("b", Type.FLOAT)}).public_().static_();
        main.ifEq(main.param("a"), main.param("b"),
                () -> {
                    main.return_(true);
                });
        main.return_(false);

        genDebugClassFile(cg);

        var cl = new ClassLoader0().defineClass("Test_Float", cg.toBytes());

        assertFalse((Boolean) cl.getMethod("test", float.class, float.class).invoke(null, 5.0f, 5.1f));
        assertTrue((Boolean) cl.getMethod("test", float.class, float.class).invoke(null, 1f, 1f));
    }
}
