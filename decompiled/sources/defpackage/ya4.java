package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* renamed from: ya4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ya4 implements Collection, ar3 {
    public static final ya4 y = new ya4(a42.w);
    public final List w;
    public final int x;

    public ya4(List list) {
        this.w = list;
        this.x = list.size();
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof xa4)) {
            return false;
        }
        return this.w.contains((xa4) obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.w.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya4)) {
            return false;
        }
        if (!this.w.equals(((ya4) obj).w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final boolean isEmpty() {
        return this.w.isEmpty();
    }

    public final Iterator iterator() {
        return this.w.iterator();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.x;
    }

    public final Object[] toArray() {
        return rc9.W0(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.w + ")";
    }

    public final Object[] toArray(Object[] objArr) {
        return rc9.X0(this, objArr);
    }
}
