package org.katarine.katlan.lib.annotations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

public final class Annotations {
    private Annotations(){}

    private static final Hashtable<KLAnnotatedElement, ArrayList<KLAnnotation>> annotations = new Hashtable<>();
    private static final HashSet<KLAnnotation> registeredAnnotations = new HashSet<>();

    static void registerAnnotation(KLAnnotation annotation, KLAnnotatedElement annotatedElement) {
        if (registeredAnnotations.contains(annotation)) return;
        annotations.computeIfAbsent(annotatedElement, k -> new ArrayList<>(4));
        annotations.get(annotatedElement).add(annotation);
        registeredAnnotations.add(annotation);
    }

    static void registerAnnotation(KLAnnotation annotation) {
        registerAnnotation(annotation, annotation.annotatedObject);
    }

    public static KLAnnotation[] getAnnotations(KLAnnotatedElement annotatedElement) {
        return annotatedElement.getKlAnnotations();
    }
}
