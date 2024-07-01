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

        public static MethodSignature of(MethodLink methodLink) {
            return new MethodSignature(methodLink.getDeclaringClass(),
                    methodLink.getName(),
                    methodLink.getParameterTypes(),
                    methodLink.getKlAnnotations());
        }
    }

    private static final HashSet<MethodSignature> cachedSignatures = new HashSet<>();

    private static final HashMap<MethodSignature, MethodLink> cachedMethods = new HashMap<>();

    public static MethodLink getMethod(Class<?> declarer,
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

    private static MethodLink getMethod(MethodSignature methodSignature) {
        return cachedMethods.computeIfAbsent(methodSignature, k -> MethodLink.of(methodSignature));
    }

    @SuppressWarnings("unchecked")
    static HashMap<MethodSignature, MethodLink> getCachedMethods() {
        return (HashMap<MethodSignature, MethodLink>) cachedMethods.clone();
    }
}
