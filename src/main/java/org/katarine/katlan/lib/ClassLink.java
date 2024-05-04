package org.katarine.katlan.lib;

import org.katarine.katlan.compiler.internal.Packages;
import org.katarine.katlan.lib.annotations.KLAnnotatedElement;
import org.katarine.katlan.lib.annotations.KLAnnotation;
import org.katarine.katlan.lib.annotations.Target;
import org.katarine.katlan.lib.structs.ImmutableArrayList;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ClassLink implements Serializable, KLAnnotatedElement { // @ClassName
    private final Class<?> type;
    public final ClassType classType;
    public final boolean isFinal;
    public final String name;
    private final Method[] methods;
    public final ImmutableArrayList<MethodLink> methodLinks = new ImmutableArrayList<>();
    public final Field[] fields;
    public final Class<?> superClass;
    public final ImmutableArrayList<KLAnnotation> klAnnotations = new ImmutableArrayList<>();
    public final KLPackage pkg;

    public ClassLink(Class<?> type, KLAnnotation[] klAnnotations) {
        this.type = type;
        this.name = this.type.getSimpleName();
        this.methods = this.type.getDeclaredMethods();
        this.fields = this.type.getDeclaredFields();
        this.superClass = this.type.getSuperclass();

        List<MethodLink> mls = new ArrayList<>(Arrays.stream(methods).map(MethodLink::new).toList());
        this.methodLinks.addAll(mls);

        this.klAnnotations.addAll(List.of(klAnnotations));
        if (Modifier.isAbstract(this.type.getModifiers())) this.classType = ClassType.ABSTRACT;
        else if (Modifier.isInterface(this.type.getModifiers())) this.classType = ClassType.INTERFACE;
        else this.classType = ClassType.CLASS;

        this.isFinal = Modifier.isFinal(this.type.getModifiers());
        this.pkg = Packages.getPackage(this.type.getPackageName());
    }

    public ClassLink(Class<?> type) {
        this(type, new KLAnnotation[0]);
    }

    public final Method getMethod(String name, Class<?> returnType, Class<?>... argTypes) throws NoSuchMethodException {
        Method m = getMethod(name, argTypes);
        if (!m.getReturnType().equals(returnType))
            throw new NoSuchMethodException("No such method: " + name + " " + Arrays.toString(argTypes));
        return m;
    }

    public final MethodLink getMethodLink(String name, Class<?> returnType, Class<?>... argTypes) throws NoSuchMethodException {
        MethodLink ml = getMethodLink(name, argTypes);
        if (!ml.returnType.equals(returnType))
            throw new NoSuchMethodException("No such method: " + name + " " + Arrays.toString(argTypes));
        return ml;
    }

    public final MethodLink getMethodLink(String name, Class<?>... argTypes) {
        this.methodLinks.makeImmutable();
        this.klAnnotations.makeImmutable();

        for (var m : methodLinks) {
            if (Objects.equals(name, m.methodName) && Arrays.equals(m.parameterTypes, argTypes))
                return m;
        }
        throw new RuntimeException(new NoSuchMethodException("No such method: " + name + " " + Arrays.toString(argTypes)));
    }

    public final Method getMethod(String name, Class<?>... argTypes) throws NoSuchMethodException {
        this.methodLinks.makeImmutable();
        this.klAnnotations.makeImmutable();

        for (var m : methods) {
            if (Objects.equals(name, m.getName()) && Arrays.equals(m.getParameterTypes(), argTypes))
                return m;
        }
        throw new NoSuchMethodException("No such method: " + name + " " + Arrays.toString(argTypes));
    }

    public final Field getField(String name) throws NoSuchFieldException {
        this.methodLinks.makeImmutable();
        this.klAnnotations.makeImmutable();

        for (var f : fields) {
            if (Objects.equals(name, f.getName()))
                return f;
        }
        throw new NoSuchFieldException("No such field: " + name);
    }

    @Override
    public Target.KLTarget getThisTargetType() {
        return Target.KLTarget.CLASS;
    }

    @Override
    public KLAnnotation[] getKlAnnotations() {
        return this.klAnnotations.toArray(KLAnnotation[]::new);
    }
}
