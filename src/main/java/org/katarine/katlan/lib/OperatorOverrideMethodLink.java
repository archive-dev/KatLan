package org.katarine.katlan.lib;

import org.katarine.katlan.lib.annotations.KLAnnotation;

import java.lang.reflect.Method;

/**
 * Guarantees that {@link ClassLink#operatorOverrides} are only operator overrides.
 */
public class OperatorOverrideMethodLink extends MethodLink {
    public OperatorOverrideMethodLink(Class<?> declaringClass, String methodName, Class<?>... parameterTypes) {
        super(declaringClass, methodName, parameterTypes);
    }

    public OperatorOverrideMethodLink(Class<?> declaringClass, String methodName, KLAnnotation[] annotations, Class<?>... parameterTypes) {
        super(declaringClass, methodName, annotations, parameterTypes);
    }

    public OperatorOverrideMethodLink(Method method) {
        super(method);
    }
}
