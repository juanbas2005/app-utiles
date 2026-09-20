package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: dg6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dg6 implements Set, ar3 {
    public final up4 w;

    public dg6(up4 up4) {
        this.w = up4;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        return this.w.c(obj);
    }

    public final boolean containsAll(Collection collection) {
        Iterable<Object> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object c : iterable) {
            if (!this.w.c(c)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.w.g();
    }

    public final Iterator iterator() {
        return t75.y(new o52(this, (f61) null, 2));
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.w.d;
    }

    public final Object[] toArray() {
        return rc9.W0(this);
    }

    public final Object[] toArray(Object[] objArr) {
        return rc9.X0(this, objArr);
    }
}
