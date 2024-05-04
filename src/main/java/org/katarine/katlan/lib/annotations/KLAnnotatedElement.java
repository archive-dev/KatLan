package org.katarine.katlan.lib.annotations;

import java.io.Serializable;

public interface KLAnnotatedElement extends Serializable {
    Target.KLTarget getThisTargetType();
    KLAnnotation[] getKlAnnotations();
}
