package org.katarine.katlan.lib;

import org.katarine.katlan.compiler.annotations.KLAnnotationWrapper;
import org.katarine.katlan.lib.annotations.*;
import org.katarine.katlan.lib.annotations.Package;

import java.io.Serializable;
import java.lang.Override;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodLink extends Handleable implements Serializable, Accessible, KLAnnotatedElement { // @methodName(pType1, pType2...)
    private final String methodName;
    private final Class<?>[] parameterTypes;
    private final Class<?> returnType;
    private final Class<?> declaringClass;
    private final ClassLink declaringKLClass;
    private final KLPackage declaringPackage;

    private final Annotation[] annotations;
    private final Access access;
    private final org.katarine.katlan.lib.Modifier modifier;
    private final Operator.Operators operator;
    private final Ownership ownership;
    private final Method method;
    private final ArrayList<KLAnnotationWrapper<?>> wrappers = new ArrayList<>();

    private KLAnnotation[] klAnnotations;

    static MethodLink of(Methods.MethodSignature signature) {
        return Methods.getCachedMethods().computeIfAbsent(signature, v -> new MethodLink(signature));
    }

    MethodLink(Class<?> declaringClass, String methodName, Class<?>... parameterTypes) {
        this(declaringClass, methodName, new KLAnnotation[0], parameterTypes);
    }

    MethodLink(Class<?> declaringClass, String methodName, KLAnnotation[] annotations, Class<?>... parameterTypes) {
        this.declaringClass = declaringClass;
        this.methodName = methodName;
        this.parameterTypes = parameterTypes;
        try {
            this.returnType = (this.method = declaringClass.getMethod(this.methodName, this.parameterTypes)).getReturnType();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        this.annotations = this.method.getAnnotations();
        this.klAnnotations = annotations;
        this.wrappers.addAll(Arrays.stream(annotations)
                .map(KLAnnotationWrapper::new)
                .toList()
        );

        try {
            if (Modifier.isStatic(this.method.getModifiers())) {
                this.ownership = Ownership.STATIC;
            } else {
                this.ownership = Ownership.INSTANCE;
            }
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }

        Operator op = null;

        if (Modifier.isAbstract(this.method.getModifiers())) this.modifier = org.katarine.katlan.lib.Modifier.ABSTRACT;
        else if (Modifier.isFinal(this.method.getModifiers())) this.modifier = org.katarine.katlan.lib.Modifier.FINAL;
        else if (this.method.isAnnotationPresent(BeforeMethodCall.class)) this.modifier = MethodModifier.PRE;
        else if (this.method.isAnnotationPresent(AfterMethodCall.class)) this.modifier = MethodModifier.POST;
        else if (this.method.isAnnotationPresent(Package.class)) this.modifier = MethodModifier.PACKAGE;
        else if ((op = this.method.getAnnotation(Operator.class)) != null) this.modifier = MethodModifier.OPERATOR;
        else this.modifier = org.katarine.katlan.lib.Modifier.NONE;

        if (this.modifier == MethodModifier.OPERATOR) {
            this.operator = op.value();
        } else {
            this.operator = null;
        }

        if (this.modifier!=MethodModifier.PACKAGE) {
            this.declaringKLClass = ClassLink.of(declaringClass);
            this.declaringPackage = null;
        } else {
            this.declaringKLClass = null;
            this.declaringPackage = Packages.getPackage(this.declaringClass.getPackageName());
        }

        if (Modifier.isPublic(this.method.getModifiers())) this.access = Access.PUBLIC;
        else if (Modifier.isPrivate(this.method.getModifiers())) this.access = Access.PRIVATE;
        else if (Modifier.isProtected(this.method.getModifiers())) this.access = Access.PROTECTED;
        else this.access = Access.PACKAGE_PRIVATE;

        for (int i = 0; i < wrappers.size(); i++) {
            wrappers.get(i).handle(klAnnotations[i], CallType.ON_METHOD_INIT);
        }

        if (declaringPackage != null) {
            declaringPackage.registerMethod(this);
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

        Operator op = null;

        if (Modifier.isAbstract(this.method.getModifiers())) this.modifier = org.katarine.katlan.lib.Modifier.ABSTRACT;
        else if (Modifier.isFinal(this.method.getModifiers())) this.modifier = org.katarine.katlan.lib.Modifier.FINAL;
        else if (this.method.isAnnotationPresent(BeforeMethodCall.class)) this.modifier = MethodModifier.PRE;
        else if (this.method.isAnnotationPresent(AfterMethodCall.class)) this.modifier = MethodModifier.POST;
        else if (this.method.isAnnotationPresent(Package.class)) this.modifier = MethodModifier.PACKAGE;
        else if ((op = this.method.getAnnotation(Operator.class)) != null) this.modifier = MethodModifier.OPERATOR;
        else this.modifier = org.katarine.katlan.lib.Modifier.NONE;

        if (this.modifier == MethodModifier.OPERATOR) {
            this.operator = op.value();
        } else {
            this.operator = null;
        }

        if (this.modifier!=MethodModifier.PACKAGE) {
            this.declaringKLClass = Classes.getClassLink(declaringClass);
            this.declaringPackage = null;
        } else {
            this.declaringKLClass = null;
            this.declaringPackage = Packages.getPackage(this.declaringClass.getPackageName());
        }

        if (Modifier.isPublic(this.method.getModifiers())) this.access = Access.PUBLIC;
        else if (Modifier.isPrivate(this.method.getModifiers())) this.access = Access.PRIVATE;
        else if (Modifier.isProtected(this.method.getModifiers())) this.access = Access.PROTECTED;
        else this.access = Access.PACKAGE_PRIVATE;

        if (declaringPackage !=null)
            declaringPackage.registerMethod(this);
    }

    private MethodLink(Methods.MethodSignature signature) {
        this(signature.declarer(), signature.methodName(), signature.annotations(), signature.parameterTypes());
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
        return Arrays.copyOf(klAnnotations, klAnnotations.length);
    }

    public final String getName() {
        return methodName;
    }

    public final Class<?>[] getParameterTypes() {
        return parameterTypes;
    }

    public final Class<?> getReturnType() {
        return returnType;
    }

    public final Class<?> getDeclaringClass() {
        return declaringClass;
    }

    public final ClassLink getDeclaringKLClass() {
        return declaringKLClass;
    }

    public final KLPackage getDeclaringPackage() {
        return declaringPackage;
    }

    public final Access getAccess() {
        return access;
    }

    public final org.katarine.katlan.lib.Modifier getModifier() {
        return modifier;
    }

    public final Operator.Operators getOperator() {
        return operator;
    }

    public final Ownership getOwnership() {
        return ownership;
    }

    public final Method getMethod() {
        return method;
    }
}
