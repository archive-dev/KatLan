package org.katarine.katlan.compiler.annotations;

import org.katarine.katlan.lib.MethodLink;
import org.katarine.katlan.lib.annotations.*;

import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;

public class KLAnnotationWrapper<T extends KLAnnotation> {
    public final Class<T> annotationClass;
    public final T annotation;
    public final Hashtable<CallType, MethodLink> methods = new Hashtable<>();

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
            if (m.isAnnotationPresent(OnClassInit.class))
                methods.put(CallType.ON_CLASS_INIT, new MethodLink(m));

            if (m.isAnnotationPresent(OnFieldGet.class))
                methods.put(CallType.ON_FIELD_GET, new MethodLink(m));

            if (m.isAnnotationPresent(BeforeFieldGet.class))
                methods.put(CallType.PRE_FIELD_GET, new MethodLink(m));

            if (m.isAnnotationPresent(AfterFieldGet.class))
                methods.put(CallType.POST_FIELD_GET, new MethodLink(m));

            if (m.isAnnotationPresent(OnFieldSet.class))
                methods.put(CallType.ON_FIELD_SET, new MethodLink(m));

            if (m.isAnnotationPresent(BeforeFieldSet.class))
                methods.put(CallType.PRE_FIELD_SET, new MethodLink(m));

            if (m.isAnnotationPresent(AfterFieldSet.class))
                methods.put(CallType.POST_FIELD_SET, new MethodLink(m));

            if (m.isAnnotationPresent(BeforeMethodCall.class))
                methods.put(CallType.PRE_METHOD_CALL, new MethodLink(m));

            if (m.isAnnotationPresent(AfterMethodCall.class))
                methods.put(CallType.POST_METHOD_CALL, new MethodLink(m));

            if (m.isAnnotationPresent(OnMethodInit.class))
                methods.put(CallType.ON_METHOD_INIT, new MethodLink(m));
        }
    }

    public static <T extends KLAnnotation> KLAnnotationWrapper<T> of(T annotationClass) {
        return new KLAnnotationWrapper<T>(annotationClass);
    }

    public void handleT(T annotation, CallType callType) {
        try {
            methods.get(callType).invoke(annotation);
        }catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }  catch (NullPointerException ignored) {}
    }

    public void handle(KLAnnotation annotation, CallType callType) {
        try {
            methods.get(callType).invoke(annotation);
        }catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }  catch (NullPointerException ignored) {}
    }
}
