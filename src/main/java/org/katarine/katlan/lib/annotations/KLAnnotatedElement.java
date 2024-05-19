package org.katarine.katlan.lib.annotations;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;

public interface KLAnnotatedElement extends Serializable, AnnotatedElement {
    Target.KLTarget getThisTargetType();
    KLAnnotation[] getKlAnnotations();

    @SuppressWarnings("unchecked")
    @Override
    default <T extends Annotation> T getAnnotation(Class<T> annotationClass) {
        return (T) Arrays.stream(getAnnotations()).filter(a -> a.getClass().equals(annotationClass)).findFirst().orElse(null);
    }

    @Override
    default Annotation[] getDeclaredAnnotations() {
        return getAnnotations();
    }

    @Override
    default Annotation[] getAnnotations() {
        return getKlAnnotations();
    }
}
