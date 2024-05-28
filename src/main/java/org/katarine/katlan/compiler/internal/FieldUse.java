package org.katarine.katlan.compiler.internal;

import org.katarine.katlan.compiler.annotations.KLAnnotationWrapper;
import org.katarine.katlan.lib.FieldLink;
import org.katarine.katlan.lib.annotations.CallType;
import org.katarine.katlan.lib.annotations.KLAnnotatedElement;
import org.katarine.katlan.lib.annotations.KLAnnotation;
import org.katarine.katlan.lib.annotations.Target;

import java.util.Hashtable;

abstract class FieldUse implements KLAnnotatedElement {
    protected final Object caller; // getter or setter depending on situation
    protected final FieldLink fieldLink;

    protected final KLAnnotation[] annotations;

    protected final Hashtable<KLAnnotationWrapper<?>, KLAnnotation> wrappers = new Hashtable<>();

    public FieldUse(FieldLink fieldLink, Object caller, KLAnnotation[] annotations) {
        this.caller = caller;
        this.fieldLink = fieldLink;
        this.annotations = annotations;
        for (var a : annotations) {
            this.wrappers.put(new KLAnnotationWrapper<>(a), a);
        }
    }

    protected final void invokeWrappers(CallType callType) {
        for (var w : wrappers.entrySet()) {
            w.getKey().handle(w.getValue(), callType);
        }
    }

    @Override
    public Target.KLTarget getThisTargetType() {
        return Target.KLTarget.FIELD_USE;
    }

    @Override
    public KLAnnotation[] getKlAnnotations() {
        return new KLAnnotation[0];
    }
}
