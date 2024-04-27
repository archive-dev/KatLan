package org.katarine.katlan.lib.structs;

import java.util.ArrayList;
import java.util.Collection;

public class ImmutableArrayList<E> extends ArrayList<E> {
    private boolean immutable = false;
    

    @Override
    public E set(int index, E element) {
        if (immutable) throw new IllegalStateException("List is immutable, cannot change it's contents");
        return super.set(index, element);
    }

    @Override
    public boolean add(E t) {
        if (immutable) throw new IllegalStateException("List is immutable, cannot change it's contents");
        return super.add(t);
    }

    @Override
    public void add(int index, E element) {
        if (immutable) throw new IllegalStateException("List is immutable, cannot change it's contents");
        super.add(index, element);
    }


    @Override
    public E remove(int index) {
        if (immutable) throw new IllegalStateException("List is immutable, cannot change it's contents");
        return super.remove(index);
    }

    @Override
    public boolean remove(Object o) {
        if (immutable) throw new IllegalStateException("List is immutable, cannot change it's contents");
        return super.remove(o);
    }

    @Override
    public void clear() {
        if (immutable) throw new IllegalStateException("List is immutable, cannot change it's contents");
        super.clear();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        if (immutable) throw new IllegalStateException("List is immutable, cannot change it's contents");
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        if (immutable) throw new IllegalStateException("List is immutable, cannot change it's contents");
        return super.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        if (immutable) throw new IllegalStateException("List is immutable, cannot change it's contents");
        return super.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        if (immutable) throw new IllegalStateException("List is immutable, cannot change it's contents");
        return super.retainAll(c);
    }

    public final ImmutableArrayList<E> makeImmutable() {
        immutable = true;
        return this;
    }
}
