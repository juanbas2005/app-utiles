package defpackage;

import java.util.Objects;

/* renamed from: i36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i36 extends q93 {
    public static final i36 A = new i36(0, new Object[0]);
    public final transient Object[] y;
    public final transient int z;

    public i36(int i, Object[] objArr) {
        this.y = objArr;
        this.z = i;
    }

    public final int f(Object[] objArr) {
        Object[] objArr2 = this.y;
        int i = this.z;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    public final Object[] g() {
        return this.y;
    }

    public final Object get(int i) {
        g75.j(i, this.z);
        Object obj = this.y[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int k() {
        return this.z;
    }

    public final int l() {
        return 0;
    }

    public final boolean n() {
        return false;
    }

    public final int size() {
        return this.z;
    }
}
