package org.katarine.katlan.lib.annotations;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;

public interface KLAnnotatedElement extends Serializable {
    Target.KLTarget getThisTargetType();
    KLAnnotation[] getKlAnnotations();
}
