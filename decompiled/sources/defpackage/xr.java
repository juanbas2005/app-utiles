package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: xr  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xr implements Collection, ar3 {
    public final Object[] w;
    public final boolean x;

    public xr(Object[] objArr, boolean z) {
        this.w = objArr;
        this.x = z;
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
        return qs.F0(obj, this.w);
    }

    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object F0 : iterable) {
            if (!qs.F0(F0, this.w)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        if (this.w.length == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new e2(this.w);
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
        return this.w.length;
    }

    public final Object[] toArray() {
        Object[] objArr = this.w;
        Class<Object[]> cls = Object[].class;
        if (this.x && objArr.getClass().equals(cls)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, cls);
        copyOf.getClass();
        return copyOf;
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return rc9.X0(this, objArr);
    }
}
