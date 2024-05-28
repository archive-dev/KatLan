package org.katarine.katlan.compiler.internal;

import org.katarine.katlan.lib.FieldLink;
import org.katarine.katlan.lib.annotations.CallType;
import org.katarine.katlan.lib.annotations.KLAnnotation;

public final class FieldGet extends FieldUse {
    public FieldGet(FieldLink fieldLink, Object caller, KLAnnotation[] annotations) {
        super(fieldLink, caller, annotations);
    }

    public Object get() {
        invokeWrappers(CallType.PRE_FIELD_SET);
        invokeWrappers(CallType.ON_FIELD_SET);
        try {
            return this.fieldLink.get(this.caller);
        } finally {
            invokeWrappers(CallType.POST_FIELD_SET);
        }
    }
}
