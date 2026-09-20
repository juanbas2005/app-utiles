package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: sn6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sn6 extends m2 implements Serializable {
    public static final sn6 x = new sn6(ze4.J);
    public final ze4 w;

    public sn6() {
        this.w = new ze4();
    }

    public final boolean add(Object obj) {
        if (this.w.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.w.c();
        return super.addAll(collection);
    }

    public final void clear() {
        this.w.clear();
    }

    public final boolean contains(Object obj) {
        return this.w.containsKey(obj);
    }

    public final int f() {
        return this.w.E;
    }

    public final boolean isEmpty() {
        return this.w.isEmpty();
    }

    public final Iterator iterator() {
        ze4 ze4 = this.w;
        ze4.getClass();
        return new we4(ze4, 1);
    }

    public final boolean remove(Object obj) {
        ze4 ze4 = this.w;
        ze4.c();
        int h = ze4.h(obj);
        if (h < 0) {
            return false;
        }
        ze4.n(h);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.w.c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.w.c();
        return super.retainAll(collection);
    }

    public sn6(ze4 ze4) {
        ze4.getClass();
        this.w = ze4;
    }
}
