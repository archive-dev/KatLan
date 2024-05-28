package org.katarine.katlan.lib.annotations;

import org.cojen.maker.ClassMaker;
import org.cojen.maker.MethodMaker;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;

public abstract class KLAnnotation implements Serializable {
    public final KLAnnotatedElement annotatedObject;

    public KLAnnotation(KLAnnotatedElement annotatedObject) {
        this.annotatedObject = annotatedObject;
        Annotations.registerAnnotation(this);
    }

    /**
     * Creates a java annotation class from klAnnotation class
     * @param klAnnotation KLAnnotation class to generate from
     * @return Java annotation Class.
     */
    @SuppressWarnings("unchecked")
    public static Class<? extends Annotation> getJavaAnnotationFromKLAnnotation(Class<? extends KLAnnotation> klAnnotation) {
        ClassMaker cm = ClassMaker.beginExplicit(klAnnotation.getSimpleName()+"J", klAnnotation.getClassLoader(), null);
        cm.annotation();
//        ClassLink klClass = klAnnotation.getDeclaredField("klclass").get(null);
//        klClass.get

        for (var f : klAnnotation.getDeclaredFields()) {
            if (!f.getType().isPrimitive() || !f.getType().equals(String.class)) continue;

            cm.addMethod(f.getType(), f.getName());
        }

        cm.addAnnotation(Target.class, true).put("value", ElementType.TYPE);


        return (Class<? extends Annotation>) cm.finish();
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
}
