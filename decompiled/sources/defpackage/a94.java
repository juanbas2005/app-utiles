package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: a94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class a94 extends AbstractList {
    public final List w;

    public a94(List list) {
        list.getClass();
        this.w = list;
    }

    public final void add(int i, Object obj) {
        this.w.add(d(i), obj);
    }

    public final void clear() {
        this.w.clear();
    }

    public final int d(int i) {
        int size = this.w.size();
        g75.m(i, size);
        return size - i;
    }

    public final Object get(int i) {
        List list = this.w;
        int size = list.size();
        g75.j(i, size);
        return list.get((size - 1) - i);
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        return new z84(this, this.w.listIterator(d(i)));
    }

    public final Object remove(int i) {
        List list = this.w;
        int size = list.size();
        g75.j(i, size);
        return list.remove((size - 1) - i);
    }

    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    public final Object set(int i, Object obj) {
        List list = this.w;
        int size = list.size();
        g75.j(i, size);
        return list.set((size - 1) - i, obj);
    }

    public final int size() {
        return this.w.size();
    }

    public final List subList(int i, int i2) {
        List list = this.w;
        g75.n(i, i2, list.size());
        return fd1.Z(list.subList(d(i2), d(i)));
    }
}
