package org.katarine.katlan.compiler.internal;

import org.katarine.katlan.lib.FieldReference;
import org.katarine.katlan.lib.annotations.CallType;
import org.katarine.katlan.lib.annotations.KLAnnotation;

public final class FieldGet extends FieldUse {
    public FieldGet(FieldReference fieldReference, Object caller, KLAnnotation[] annotations) {
        super(fieldReference, caller, annotations);
    }

    public Object get() {
        invokeWrappers(CallType.PRE_FIELD_SET);
        invokeWrappers(CallType.ON_FIELD_SET);
        try {
            return this.fieldReference.get(this.caller);
        } finally {
            invokeWrappers(CallType.POST_FIELD_SET);
        }
    }
}
