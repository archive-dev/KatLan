package org.katarine.katlan.lib;

import org.katarine.katlan.lib.annotations.KLAnnotation;

import java.lang.reflect.Method;
import java.util.*;

public final class Methods {
    private Methods(){}

    record MethodSignature(
            Class<?> declarer,
            String methodName,
            Class<?>[] parameterTypes,
            KLAnnotation... annotations
    ) {
        public static MethodSignature of(Method method) {
            return new MethodSignature(method.getDeclaringClass(), method.getName(), method.getParameterTypes());
        }

        public static MethodSignature of(MethodReference methodReference) {
            return new MethodSignature(methodReference.getDeclaringClass(),
                    methodReference.getName(),
                    methodReference.getParameterTypes(),
                    methodReference.getKlAnnotations());
        }
    }

    private static final HashSet<MethodSignature> cachedSignatures = new HashSet<>();

    private static final HashMap<MethodSignature, MethodReference> cachedMethods = new HashMap<>();

    public static MethodReference getMethod(Class<?> declarer,
                                       String methodName,
                                       Class<?>[] parameterTypes,
                                       KLAnnotation... annotations) {
        Optional<MethodSignature> signature = getSignatureFromCache(declarer, methodName, parameterTypes, annotations);
        boolean isCacheHit = signature.isPresent();

        var correctSignature = signature.orElse(new MethodSignature(declarer, methodName, parameterTypes, annotations));

        if (isCacheHit) return cachedMethods.get(correctSignature);
        cachedSignatures.add(correctSignature);
        return getMethod(correctSignature);
    }

    private static Optional<MethodSignature> getSignatureFromCache(
            Class<?> declarer,
            String methodName,
            Class<?>[] parameterTypes,
            KLAnnotation... annotations
    ) {
        Collection<MethodSignature> signatures = cachedSignatures;
        MethodSignature correctSignature = findSignature(signatures, declarer, methodName, parameterTypes, annotations);
        if (correctSignature == null) {
            signatures = cachedMethods.keySet();
            correctSignature = findSignature(signatures, declarer, methodName, parameterTypes, annotations);
        }
        return Optional.ofNullable(correctSignature);
    }

    private static MethodSignature findSignature(Collection<MethodSignature> signatures, Class<?> declarer, String methodName, Class<?>[] parameterTypes, KLAnnotation... annotations) {
        for (var signature : signatures) {
            if (signature.methodName().equals(methodName) && Arrays.equals(signature.parameterTypes(), parameterTypes) &&
                    Arrays.equals(signature.annotations(), annotations) && declarer.equals(signature.declarer())) {
                return signature;
            }
        }
        return null;
    }

    private static MethodReference getMethod(MethodSignature methodSignature) {
        return cachedMethods.computeIfAbsent(methodSignature, k -> MethodReference.of(methodSignature));
    }

    @SuppressWarnings("unchecked")
    static HashMap<MethodSignature, MethodReference> getCachedMethods() {
        return (HashMap<MethodSignature, MethodReference>) cachedMethods.clone();
    }
}
