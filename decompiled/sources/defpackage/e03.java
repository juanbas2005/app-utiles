package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: e03  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e03 implements List, ar3 {
    public final int w;
    public final int x;
    public final /* synthetic */ f03 y;

    public e03(f03 f03, int i, int i2) {
        this.y = f03;
        this.w = i;
        this.x = i2;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if ((obj instanceof ll4) && indexOf((ll4) obj) != -1) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((ll4) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        Object f = this.y.w.f(i + this.w);
        f.getClass();
        return (ll4) f;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof ll4)) {
            return -1;
        }
        ll4 ll4 = (ll4) obj;
        int i = this.w;
        int i2 = this.x;
        if (i > i2) {
            return -1;
        }
        int i3 = i;
        while (!sg3.e(this.y.w.f(i3), ll4)) {
            if (i3 == i2) {
                return -1;
            }
            i3++;
        }
        return i3 - i;
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        int i = this.w;
        return new d03(this.y, i, i, this.x);
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof ll4)) {
            return -1;
        }
        ll4 ll4 = (ll4) obj;
        int i = this.x;
        int i2 = this.w;
        if (i2 > i) {
            return -1;
        }
        while (!sg3.e(this.y.w.f(i), ll4)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    public final ListIterator listIterator(int i) {
        int i2 = this.w;
        int i3 = this.x;
        return new d03(this.y, i + i2, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.x - this.w;
    }

    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List subList(int i, int i2) {
        int i3 = this.w;
        return new e03(this.y, i + i3, i3 + i2);
    }

    public final Object[] toArray() {
        return rc9.W0(this);
    }

    public final Object[] toArray(Object[] objArr) {
        return rc9.X0(this, objArr);
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

    public final ListIterator listIterator() {
        int i = this.w;
        return new d03(this.y, i, i, this.x);
    }
}
