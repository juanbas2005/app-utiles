package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: n93  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n93 extends q93 {
    public final transient q93 y;

    public n93(q93 q93) {
        this.y = q93;
    }

    public final boolean contains(Object obj) {
        return this.y.contains(obj);
    }

    public final Object get(int i) {
        q93 q93 = this.y;
        g75.j(i, q93.size());
        return q93.get((q93.size() - 1) - i);
    }

    public final int indexOf(Object obj) {
        q93 q93 = this.y;
        int lastIndexOf = q93.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (q93.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        q93 q93 = this.y;
        int indexOf = q93.indexOf(obj);
        if (indexOf >= 0) {
            return (q93.size() - 1) - indexOf;
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final boolean n() {
        return this.y.n();
    }

    public final int size() {
        return this.y.size();
    }

    public final q93 x() {
        return this.y;
    }

    /* renamed from: y */
    public final q93 subList(int i, int i2) {
        q93 q93 = this.y;
        g75.n(i, i2, q93.size());
        return q93.subList(q93.size() - i2, q93.size() - i).x();
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
