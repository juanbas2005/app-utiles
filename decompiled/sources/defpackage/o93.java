package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: o93  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o93 extends q93 {
    public final /* synthetic */ q93 A;
    public final transient int y;
    public final transient int z;

    public o93(q93 q93, int i, int i2) {
        this.A = q93;
        this.y = i;
        this.z = i2;
    }

    public final Object[] g() {
        return this.A.g();
    }

    public final Object get(int i) {
        g75.j(i, this.z);
        return this.A.get(i + this.y);
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int k() {
        return this.A.l() + this.y + this.z;
    }

    public final int l() {
        return this.A.l() + this.y;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final boolean n() {
        return true;
    }

    public final int size() {
        return this.z;
    }

    /* renamed from: y */
    public final q93 subList(int i, int i2) {
        g75.n(i, i2, this.z);
        int i3 = this.y;
        return this.A.subList(i + i3, i2 + i3);
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
