package org.katarine.katlan.lib.annotations;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

public final class Annotations {
    private Annotations(){}

    private static final Hashtable<KLAnnotatedElement, ArrayList<Annotation>> annotations = new Hashtable<>();
    private static final HashSet<Annotation> registeredAnnotations = new HashSet<>();

    static void registerAnnotation(Annotation annotation, KLAnnotatedElement annotatedElement) {
        if (registeredAnnotations.contains(annotation)) return;
        annotations.computeIfAbsent(annotatedElement, k -> new ArrayList<>(4));
        annotations.get(annotatedElement).add(annotation);
        registeredAnnotations.add(annotation);
    }

    static void registerAnnotation(KLAnnotation annotation) {
        registerAnnotation(annotation, annotation.annotatedObject);
    }

    public static Annotation[] getAnnotations(KLAnnotatedElement annotatedElement) {
        return annotatedElement.getAnnotations();
    }
}
