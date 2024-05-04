package org.katarine.katlan.lib;

import org.katarine.katlan.compiler.annotations.KLAnnotationWrapper;
import org.katarine.katlan.lib.annotations.Annotations;
import org.katarine.katlan.lib.annotations.KLAnnotatedElement;
import org.katarine.katlan.lib.annotations.KLAnnotation;
import org.katarine.katlan.lib.annotations.Target;
import org.katarine.katlan.lib.structs.ImmutableArrayList;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodLink extends Handleable implements Serializable, Accessible, KLAnnotatedElement { // @methodName(pType1, pType2...)
    public final String methodName;
    public final Class<?>[] parameterTypes;
    public final Class<?> returnType;
    public final Class<?> declaringClass;

    public final Annotation[] annotations;
    public final ImmutableArrayList<KLAnnotation> klAnnotations = new ImmutableArrayList<>();
    public final Access access;
    public final org.katarine.katlan.lib.Modifier modifier;
    public final Ownership ownership;
    private final Method method;
    private final ArrayList<KLAnnotationWrapper<?>> wrappers = new ArrayList<>();

    public MethodLink(Class<?> declaringClass, String methodName, Class<?>... parameterTypes) {
        this(declaringClass, methodName, new KLAnnotation[0], parameterTypes);
    }

    public MethodLink(Class<?> declaringClass, String methodName, KLAnnotation[] annotations, Class<?>... parameterTypes) {
        this.declaringClass = declaringClass;
        this.methodName = methodName;
        this.parameterTypes = parameterTypes;
        try {
            this.returnType = (this.method = declaringClass.getMethod(this.methodName, this.parameterTypes)).getReturnType();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        this.annotations = this.method.getAnnotations();
        this.klAnnotations.addAll(List.of(annotations));
        this.wrappers.addAll(Arrays.stream(annotations)
                .map(KLAnnotationWrapper::new)
                .toList()
        );

        try {
            if (Modifier.isStatic(this.method.getModifiers())) {
                this.ownership = Ownership.STATIC;
//                this.owner = null;
            } else {
                this.ownership = Ownership.INSTANCE;
//                if (owner == null)
//                    throw new NullPointerException("Instance is null on non-static method " + this.methodName);
//                this.owner = owner;
            }
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }

        if (Modifier.isAbstract(this.method.getModifiers())) this.modifier = org.katarine.katlan.lib.Modifier.ABSTRACT;
        else if (Modifier.isFinal(this.method.getModifiers())) this.modifier = org.katarine.katlan.lib.Modifier.FINAL;
        else this.modifier = org.katarine.katlan.lib.Modifier.NONE;

        if (Modifier.isPublic(this.method.getModifiers())) this.access = Access.PUBLIC;
        else if (Modifier.isPrivate(this.method.getModifiers())) this.access = Access.PRIVATE;
        else if (Modifier.isProtected(this.method.getModifiers())) this.access = Access.PROTECTED;
        else this.access = Access.PACKAGE_PRIVATE;

        for (int i = 0; i < wrappers.size(); i++) {
            wrappers.get(i).handle(klAnnotations.get(i), Annotations.CallType.ON_METHOD_INIT);
        }
    }

    public MethodLink(Method method) {
        this.declaringClass = method.getDeclaringClass();
        this.methodName = method.getName();
        this.parameterTypes = method.getParameterTypes();
        this.returnType = method.getReturnType();
        this.method = method;
        this.annotations = this.method.getAnnotations();

        if (Modifier.isStatic(this.method.getModifiers())) {
            this.ownership = Ownership.STATIC;
        } else {
            this.ownership = Ownership.INSTANCE;
        }

//        this.owner = null; // this happens because there is no way of getting the owner from Method only

        if (Modifier.isAbstract(this.method.getModifiers())) this.modifier = org.katarine.katlan.lib.Modifier.ABSTRACT;
        else if (Modifier.isFinal(this.method.getModifiers())) this.modifier = org.katarine.katlan.lib.Modifier.FINAL;
        else this.modifier = org.katarine.katlan.lib.Modifier.NONE;

        if (Modifier.isPublic(this.method.getModifiers())) this.access = Access.PUBLIC;
        else if (Modifier.isPrivate(this.method.getModifiers())) this.access = Access.PRIVATE;
        else if (Modifier.isProtected(this.method.getModifiers())) this.access = Access.PROTECTED;
        else this.access = Access.PACKAGE_PRIVATE;
    }

    public final Object invoke(Object caller, Object... args) throws InvocationTargetException, IllegalAccessException {
        return this.method.invoke(caller, args);
    }

    /**
     * Invokes the method with handlers. This method will first call all the pre-handlers with the provided caller and arguments.
     * Then it will invoke the method with the provided caller and arguments.
     * After the method invocation, it will call all the post-handlers with the provided caller, the return value of the method
     * (or null if an exception was thrown), and the arguments.
     *
     * @param caller The object on which the method is to be invoked.
     * @param args The arguments to pass to the method.
     * @return The return value of the method, or null if the method returns void.
     * @throws InvocationTargetException if the underlying method cannot be invoked.
     * @throws IllegalAccessException if the underlying method cannot be accessed.
     */
    public final Object invokeWithHandlers(Object caller, Object... args) throws InvocationTargetException, IllegalAccessException {
        preHandlers.forEach(h -> h.handle(caller, args));
        Object rValue = null;
        try {
            return rValue = invoke(caller, args);
        } finally {
            Object finalRValue = rValue; // hack
            postHandlers.forEach(h -> h.handle(caller, finalRValue, args));
        }
    }

    @Override
    public Access access() {
        return this.access;
    }

    @Override
    public void checkAccess(Object caller) throws IllegalAccessException {
        if (this.access != Access.PUBLIC && !this.method.canAccess(caller)) throw new IllegalAccessException("Instance can't access method " + this.methodName);
        if (this.ownership != Ownership.STATIC && caller == null) throw new IllegalAccessException("Instance is null on non-static method " + this.methodName);
    }

    @Override
    public Target.KLTarget getThisTargetType() {
        return Target.KLTarget.METHOD;
    }

    @Override
    public KLAnnotation[] getKlAnnotations() {
        return this.klAnnotations.toArray(KLAnnotation[]::new);
    }
}
