package org.katarine.katlan.compiler.annotations;

import org.katarine.katlan.lib.MethodLink;
import org.katarine.katlan.lib.annotations.Annotations;
import org.katarine.katlan.lib.annotations.KLAnnotation;
import org.katarine.katlan.lib.annotations.Target;

import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;

public class KLAnnotationWrapper<T extends KLAnnotation> {
    public final Class<T> annotationClass;
    public final T annotation;
    public final Hashtable<Annotations.CallType, MethodLink> methods = new Hashtable<>();

    @SuppressWarnings("unchecked")
    public KLAnnotationWrapper(T annotationInstance) {
        this.annotation = annotationInstance;
        this.annotationClass = (Class<T>) this.annotation.getClass();
        if (!KLAnnotation.class.isAssignableFrom(annotationClass))
            throw new RuntimeException(new IllegalStateException("Annotation " + annotationClass.getName() + " must extend " + KLAnnotation.class.getName()));

        if (!annotationClass.isAnnotationPresent(Target.class))
            throw new RuntimeException(
                new IllegalStateException("Annotation " + annotationClass.getName() + " must be annotated with @Target")
            );

        for (var m : annotationClass.getMethods()) {
            if (m.isAnnotationPresent(Annotations.OnClassInit.class))
                methods.put(Annotations.CallType.ON_CLASS_INIT, new MethodLink(m));

            if (m.isAnnotationPresent(Annotations.OnFieldGet.class))
                methods.put(Annotations.CallType.ON_FIELD_GET, new MethodLink(m));

            if (m.isAnnotationPresent(Annotations.BeforeFieldGet.class))
                methods.put(Annotations.CallType.PRE_FIELD_GET, new MethodLink(m));

            if (m.isAnnotationPresent(Annotations.AfterFieldGet.class))
                methods.put(Annotations.CallType.POST_FIELD_GET, new MethodLink(m));

            if (m.isAnnotationPresent(Annotations.OnFieldSet.class))
                methods.put(Annotations.CallType.ON_FIELD_SET, new MethodLink(m));

            if (m.isAnnotationPresent(Annotations.BeforeFieldSet.class))
                methods.put(Annotations.CallType.PRE_FIELD_SET, new MethodLink(m));

            if (m.isAnnotationPresent(Annotations.AfterFieldSet.class))
                methods.put(Annotations.CallType.POST_FIELD_SET, new MethodLink(m));

            if (m.isAnnotationPresent(Annotations.BeforeMethodCall.class))
                methods.put(Annotations.CallType.PRE_METHOD_CALL, new MethodLink(m));

            if (m.isAnnotationPresent(Annotations.AfterMethodCall.class))
                methods.put(Annotations.CallType.POST_METHOD_CALL, new MethodLink(m));

            if (m.isAnnotationPresent(Annotations.OnMethodInit.class))
                methods.put(Annotations.CallType.ON_METHOD_INIT, new MethodLink(m));
        }
    }

    public static <T extends KLAnnotation> KLAnnotationWrapper<T> of(T annotationClass) {
        return new KLAnnotationWrapper<T>(annotationClass);
    }

    public void handleT(T annotation, Annotations.CallType callType) {
        try {
            methods.get(callType).invoke(annotation);
        }catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }  catch (NullPointerException ignored) {}
    }

    public void handle(KLAnnotation annotation, Annotations.CallType callType) {
        try {
            methods.get(callType).invoke(annotation);
        }catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }  catch (NullPointerException ignored) {}
    }
}
