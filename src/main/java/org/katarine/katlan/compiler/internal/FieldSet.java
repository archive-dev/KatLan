package org.katarine.katlan.compiler.internal;

import org.katarine.katlan.lib.FieldLink;
import org.katarine.katlan.lib.annotations.CallType;
import org.katarine.katlan.lib.annotations.KLAnnotation;

public final class FieldSet extends FieldUse {
    public FieldSet(FieldLink fieldLink, Object caller, KLAnnotation[] annotations) {
        super(fieldLink, caller, annotations);
    }

    public void set(Object value) {
        invokeWrappers(CallType.PRE_FIELD_SET);
        invokeWrappers(CallType.ON_FIELD_SET);
        this.fieldLink.set(this.caller, value);
        invokeWrappers(CallType.POST_FIELD_SET);
    }
}
