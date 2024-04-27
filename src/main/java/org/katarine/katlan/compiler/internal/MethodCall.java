package org.katarine.katlan.compiler.internal;

import org.katarine.katlan.compiler.annotations.KLAnnotationWrapper;
import org.katarine.katlan.lib.MethodLink;
import org.katarine.katlan.lib.annotations.Annotations;
import org.katarine.katlan.lib.annotations.KLAnnotatedElement;
import org.katarine.katlan.lib.annotations.KLAnnotation;
import org.katarine.katlan.lib.annotations.Target;
import org.katarine.katlan.lib.structs.ImmutableArrayList;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

public class MethodCall implements KLAnnotatedElement {
    public final Object caller;
    public final Object[] args;

    public final ImmutableList<KLAnnotation> annotations = new ImmutableList<>();
    public final MethodLink ml;

    private final Hashtable<KLAnnotationWrapper<?>, KLAnnotation> wrappers;

    public class ImmutableList<E extends KLAnnotation> extends ImmutableArrayList<E> {
        @Override
        public boolean add(E t) {
            wrappers.put(new KLAnnotationWrapper<>(t), t);
            return super.add(t);
        }

        @Override
        public void add(int index, E element) {
            wrappers.put(new KLAnnotationWrapper<>(element), element);
            super.add(index, element);
        }

        @Override
        public boolean addAll(Collection<? extends E> c) {
            for (var annotation : c) {
                wrappers.put(new KLAnnotationWrapper<>(annotation), annotation);
            }
            return super.addAll(c);
        }

        @Override
        public boolean addAll(int index, Collection<? extends E> c) {
            for (var annotation : c) {
                wrappers.put(new KLAnnotationWrapper<>(annotation), annotation);
            }
            return super.addAll(index, c);
        }
    }

    public MethodCall(MethodLink ml, Object caller, Object[] args, KLAnnotation... annotations) {
        this.ml = ml;
        this.caller = caller;
        this.args = args;
        this.annotations.addAll(List.of(annotations));
        this.wrappers = new Hashtable<>();
        for (var annotation : annotations) {
            wrappers.put(new KLAnnotationWrapper<>(annotation), annotation);
        }
    }

    @SuppressWarnings("unchecked")
    public <T> T call() {
        for (var wrapper : wrappers.entrySet()) {
            wrapper.getKey().handle(wrapper.getValue(), Annotations.CallType.PRE_METHOD_CALL);
        }
        try {
            return (T) ml.invoke(caller, args);
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        } finally {
            for (var wrapper : wrappers.entrySet()) {
                wrapper.getKey().handle(wrapper.getValue(), Annotations.CallType.POST_METHOD_CALL);
            }
        }
    }

    @Override
    public Target.KLTarget getThisTargetType() {
        return Target.KLTarget.METHOD_CALL;
    }

    @Override
    public KLAnnotation[] getKlAnnotations() {
        return this.annotations.toArray(KLAnnotation[]::new);
    }
}
