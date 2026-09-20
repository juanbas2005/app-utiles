package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: a42  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a42 implements List, Serializable, RandomAccess, ar3 {
    public static final a42 w = new Object();

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        return false;
    }

    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof List) || !((List) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public final Object get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public final int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        return -1;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Iterator iterator() {
        return z32.w;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        return -1;
    }

    public final ListIterator listIterator(int i) {
        if (i == 0) {
            return z32.w;
        }
        h.l(hl6.k(i, "Index: "));
        return null;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        h.l(b81.l(i, i2, "fromIndex: ", ", toIndex: "));
        return null;
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return rc9.X0(this, objArr);
    }

    public final String toString() {
        return "[]";
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray() {
        return rc9.W0(this);
    }

    public final ListIterator listIterator() {
        return z32.w;
    }
}
