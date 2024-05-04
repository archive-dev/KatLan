package org.katarine.katlan.lib.annotations;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@java.lang.annotation.Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Target {
    KLTarget[] value();


    enum KLTarget implements Serializable {
        CLASS(ElementType.TYPE),
        METHOD(ElementType.METHOD),
        FIELD(ElementType.FIELD),
        PARAMETER(ElementType.PARAMETER),
        CONSTRUCTOR(ElementType.CONSTRUCTOR),
        LOCAL_VARIABLE(ElementType.LOCAL_VARIABLE),
        ANNOTATION(ElementType.ANNOTATION_TYPE),
        METHOD_CALL(null),
        PACKAGE(ElementType.PACKAGE),
        TYPE_PARAMETER(ElementType.TYPE_PARAMETER),
        TYPE_USE(ElementType.TYPE_USE),
        MODULE(ElementType.MODULE),
        RECORD_COMPONENT(ElementType.RECORD_COMPONENT);

        public final ElementType el;

        KLTarget(ElementType el) {
            this.el = el;
        }
    }
}
