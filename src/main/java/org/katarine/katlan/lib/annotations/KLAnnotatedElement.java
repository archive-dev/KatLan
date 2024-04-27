package org.katarine.katlan.lib.annotations;

public interface KLAnnotatedElement {
    Target.KLTarget getThisTargetType();
    KLAnnotation[] getKlAnnotations();
}
