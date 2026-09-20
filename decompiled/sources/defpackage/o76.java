package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: o76  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o76 extends l2 {
    public final ArrayList w;

    public o76(ArrayList arrayList) {
        this.w = arrayList;
    }

    public final void add(int i, Object obj) {
        this.w.add(dt0.n0(i, this), obj);
    }

    public final void clear() {
        this.w.clear();
    }

    public final int f() {
        return this.w.size();
    }

    public final Object g(int i) {
        return this.w.remove(dt0.m0(i, this));
    }

    public final Object get(int i) {
        return this.w.get(dt0.m0(i, this));
    }

    public final Iterator iterator() {
        return new n76(this, 0);
    }

    public final ListIterator listIterator() {
        return new n76(this, 0);
    }

    public final Object set(int i, Object obj) {
        return this.w.set(dt0.m0(i, this), obj);
    }

    public final ListIterator listIterator(int i) {
        return new n76(this, i);
    }
}
