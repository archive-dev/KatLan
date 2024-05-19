package org.katarine.katlan.lib.annotations;

import org.cojen.maker.ClassMaker;
import org.cojen.maker.MethodMaker;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;

public abstract class KLAnnotation implements Serializable, Annotation {
    public final KLAnnotatedElement annotatedObject;

    public KLAnnotation(KLAnnotatedElement annotatedObject) {
        this.annotatedObject = annotatedObject;
        Annotations.registerAnnotation(this);
    }

    public static Class<? extends KLAnnotation> from(Class<? extends Annotation> annotation) {
        ClassMaker cm = ClassMaker.beginExternal("KL" + annotation.getSimpleName());
        cm.extend(KLAnnotation.class);

        ArrayList<Class<?>> params = new ArrayList<>();
        params.add(Object.class);

        for (var f : annotation.getDeclaredMethods()) {
            cm.addField(f.getReturnType(), f.getName());
            params.add(f.getReturnType());
        }

        MethodMaker mm = cm.addConstructor(params.toArray());
        mm.invokeSuperConstructor(mm.param(0));
        int i = 1;
        for (var f : annotation.getDeclaredMethods()) {
            mm.this_().field(f.getName()).set(mm.param(i));
            i++;
        }

        @SuppressWarnings("unchecked")
        Class<? extends KLAnnotation> ret = (Class<? extends KLAnnotation>) cm.finish();
        return ret;
    }

    @Override
    public final Class<? extends Annotation> annotationType() {
        return this.getClass();
    }
}
