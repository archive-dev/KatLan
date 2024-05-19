package org.katarine.katlan.lib.annotations;

public enum CallType {
    PRE_METHOD_CALL, POST_METHOD_CALL, ON_METHOD_INIT,
    ON_FIELD_GET, ON_FIELD_SET,
    PRE_FIELD_GET, PRE_FIELD_SET, POST_FIELD_GET, POST_FIELD_SET,
    ON_CLASS_INIT;
}
