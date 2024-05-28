package org.katarine.katlan.lib.annotations;

@Target({Target.KLTarget.CONSTRUCTOR, Target.KLTarget.METHOD})
public class Override extends KLAnnotation {
    public Override(KLAnnotatedElement annotatedObject) {
        super(annotatedObject);
    }
}
