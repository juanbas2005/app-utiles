package defpackage;

import java.util.RandomAccess;

/* renamed from: u75  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u75 extends h2 implements RandomAccess {
    public final dg0[] w;
    public final int[] x;

    public u75(dg0[] dg0Arr, int[] iArr) {
        this.w = dg0Arr;
        this.x = iArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof dg0)) {
            return false;
        }
        return super.contains((dg0) obj);
    }

    public final int f() {
        return this.w.length;
    }

    public final Object get(int i) {
        return this.w[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof dg0)) {
            return -1;
        }
        return super.indexOf((dg0) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof dg0)) {
            return -1;
        }
        return super.lastIndexOf((dg0) obj);
    }
}
