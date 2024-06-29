package org.katarine.katlan.lib;

import org.katarine.katlan.lib.annotations.KLAnnotatedElement;
import org.katarine.katlan.lib.annotations.KLAnnotation;
import org.katarine.katlan.lib.annotations.Target;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Objects;

public class ClassLink implements Serializable, KLAnnotatedElement { // @ClassName
    private final Class<?> jClass;
    private final ClassType classType;
    private final boolean isFinal;
    private final boolean isAnnotation;
    private final String name;
    private final Method[] methods;
    private final Field[] fields;
    private MethodLink[] methodLinks;
    private FieldLink[] fieldLinks;
    private OperatorOverrideMethodLink[] operatorOverrides;
    private KLAnnotation[] klAnnotations;
    private final ClassLink superClass;
    private final KLPackage pkg;

    public static ClassLink of(Class<?> jClass) {
        ClassLink cl = Classes.getClassLink(jClass);
        if (cl == null) cl = new ClassLink(jClass);
        return cl;
    }

    public ClassLink(Class<?> jClass, MethodLink[] methodLinks, FieldLink[] fieldLinks, KLAnnotation[] klAnnotations) {
        Classes.registerClass(this);
        this.jClass = jClass;
        this.isAnnotation = KLAnnotation.class.isAssignableFrom(this.jClass);
        this.name = this.jClass.getSimpleName();
        this.methods = this.jClass.getDeclaredMethods();
        this.fields = this.jClass.getDeclaredFields();
        this.superClass = Classes.getClassLink(this.jClass.getSuperclass());

        this.methodLinks = methodLinks;
        this.fieldLinks = fieldLinks;

        this.klAnnotations = klAnnotations;
        if (Modifier.isAbstract(this.jClass.getModifiers())) this.classType = ClassType.ABSTRACT;
        else if (Modifier.isInterface(this.jClass.getModifiers())) this.classType = ClassType.INTERFACE;
        else this.classType = ClassType.CLASS;

        this.isFinal = Modifier.isFinal(this.jClass.getModifiers());
        this.pkg = Packages.getPackage(this.jClass.getPackageName());
    }

    public ClassLink(Class<?> jClass, KLAnnotation[] klAnnotations) {
        this(
                jClass,
                Arrays.stream(jClass.getDeclaredMethods()).map(MethodLink::new).toArray(MethodLink[]::new),
                Arrays.stream(jClass.getDeclaredFields()).map(FieldLink::new).toArray(FieldLink[]::new),
                klAnnotations
        );
    }

    public ClassLink(Class<?> jClass) {
        this(jClass, new KLAnnotation[0]);
    }

    public final Method getMethod(String name, Class<?> returnType, Class<?>... argTypes) throws NoSuchMethodException {
        Method m = getMethod(name, argTypes);
        if (!m.getReturnType().equals(returnType))
            throw new NoSuchMethodException("No such method: " + name + " " + Arrays.toString(argTypes));
        return m;
    }

    public final MethodLink getMethodLink(String name, Class<?> returnType, Class<?>... argTypes) throws NoSuchMethodException {
        MethodLink ml = getMethodLink(name, argTypes);
        if (!ml.getReturnType().equals(returnType))
            throw new NoSuchMethodException("No such method: " + name + " " + Arrays.toString(argTypes));
        return ml;
    }

    public final MethodLink getMethodLink(String name, Class<?>... argTypes) {
        for (var m : methodLinks) {
            if (Objects.equals(name, m.getName()) && Arrays.equals(m.getParameterTypes(), argTypes))
                return m;
        }
        throw new RuntimeException(new NoSuchMethodException("No such method: " + name + " " + Arrays.toString(argTypes)));
    }

    public final Method getMethod(String name, Class<?>... argTypes) throws NoSuchMethodException {
        for (var m : methods) {
            if (Objects.equals(name, m.getName()) && Arrays.equals(m.getParameterTypes(), argTypes))
                return m;
        }
        throw new NoSuchMethodException("No such method: " + name + " " + Arrays.toString(argTypes));
    }

    public final Field getField(String name) throws NoSuchFieldException {
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
        return Arrays.copyOf(klAnnotations, klAnnotations.length);
    }

    public final Class<?> jClass() {
        return jClass;
    }

    public final ClassType getClassType() {
        return classType;
    }

    public final boolean isFinal() {
        return isFinal;
    }

    public final boolean isAnnotation() {
        return isAnnotation;
    }

    public final String getName() {
        return name;
    }

    public final Method[] getMethods() {
        return methods;
    }

    public final Field[] getFields() {
        return fields;
    }

    public final MethodLink[] getMethodLinks() {
        return methodLinks;
    }

    public final OperatorOverrideMethodLink[] getOperatorOverrides() {
        return operatorOverrides;
    }

    public final ClassLink getSuperClass() {
        return superClass;
    }

    public final KLPackage getPkg() {
        return pkg;
    }
}
