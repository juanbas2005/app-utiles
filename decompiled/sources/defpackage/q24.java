package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: q24  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q24 implements List, ar3 {
    public final yx6 w = new yx6();

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
        if (!(obj instanceof o24)) {
            return false;
        }
        return this.w.contains((o24) obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.w.containsAll(collection);
    }

    public final Object get(int i) {
        return (o24) this.w.get(i);
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof o24)) {
            return -1;
        }
        return this.w.indexOf((o24) obj);
    }

    public final boolean isEmpty() {
        return this.w.isEmpty();
    }

    public final Iterator iterator() {
        return this.w.listIterator();
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof o24)) {
            return -1;
        }
        return this.w.lastIndexOf((o24) obj);
    }

    public final ListIterator listIterator(int i) {
        yx6 yx6 = this.w;
        yx6.getClass();
        return new d03(yx6, i);
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
        return this.w.size();
    }

    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List subList(int i, int i2) {
        return this.w.subList(i, i2);
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
        return this.w.listIterator();
    }
}
