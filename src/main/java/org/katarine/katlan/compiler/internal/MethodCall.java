package org.katarine.katlan.compiler.internal;

import org.katarine.katlan.compiler.annotations.KLAnnotationWrapper;
import org.katarine.katlan.lib.MethodReference;
import org.katarine.katlan.lib.annotations.*;

import java.lang.Override;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Hashtable;

public final class MethodCall implements KLAnnotatedElement {
    public final Object caller;
    public final Object[] args;

    public final MethodReference ml;
    private final KLAnnotation[] annotations;

    private final Hashtable<KLAnnotationWrapper<?>, KLAnnotation> wrappers;

    public MethodCall(MethodReference ml, Object caller, Object[] args, KLAnnotation... annotations) {
        this.ml = ml;
        this.caller = caller;
        this.args = args;
        this.annotations = annotations;
        this.wrappers = new Hashtable<>();
        for (var annotation : annotations) {
            wrappers.put(new KLAnnotationWrapper<>(annotation), annotation);
        }
    }

    @SuppressWarnings({"unchecked", "UnusedReturnValue"})
    public <T> T call() {
        for (var wrapper : wrappers.entrySet()) {
            wrapper.getKey().handle(wrapper.getValue(), CallType.PRE_METHOD_CALL);
        }
        try {
            return (T) ml.invoke(caller, args);
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        } finally {
            for (var wrapper : wrappers.entrySet()) {
                wrapper.getKey().handle(wrapper.getValue(), CallType.POST_METHOD_CALL);
            }
        }
    }

    @Override
    public Target.KLTarget getThisTargetType() {
        return Target.KLTarget.METHOD_CALL;
    }

    @Override
    public KLAnnotation[] getKlAnnotations() {
        return Arrays.copyOf(annotations, annotations.length);
    }
}
