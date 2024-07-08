package org.katarine.katlan.compiler.internal;

import org.katarine.katlan.lib.FieldReference;
import org.katarine.katlan.lib.annotations.CallType;
import org.katarine.katlan.lib.annotations.KLAnnotation;

public final class FieldSet extends FieldUse {
    public FieldSet(FieldReference fieldReference, Object caller, KLAnnotation[] annotations) {
        super(fieldReference, caller, annotations);
    }

    public void set(Object value) {
        invokeWrappers(CallType.PRE_FIELD_SET);
        invokeWrappers(CallType.ON_FIELD_SET);
        this.fieldReference.set(this.caller, value);
        invokeWrappers(CallType.POST_FIELD_SET);
    }
}
