package org.katarine.katlan.lib;

import org.katarine.katlan.lib.annotations.KLAnnotation;

import java.lang.reflect.Method;

/**
 * Guarantees that {@link ClassReference#operatorOverrides} are only operator overrides.
 */
@SuppressWarnings("JavadocReference")
public class OperatorOverrideMethodReference extends MethodReference {
    public OperatorOverrideMethodReference(Class<?> declaringClass, String methodName, Class<?>... parameterTypes) {
        super(declaringClass, methodName, parameterTypes);
    }

    public OperatorOverrideMethodReference(Class<?> declaringClass, String methodName, KLAnnotation[] annotations, Class<?>... parameterTypes) {
        super(declaringClass, methodName, annotations, parameterTypes);
    }

    public OperatorOverrideMethodReference(Method method) {
        super(method);
    }
}
