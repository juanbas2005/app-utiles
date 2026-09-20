package defpackage;

import java.util.Objects;

/* renamed from: m36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m36 extends q93 {
    public final transient int A;
    public final transient Object[] y;
    public final transient int z;

    public m36(Object[] objArr, int i, int i2) {
        this.y = objArr;
        this.z = i;
        this.A = i2;
    }

    public final Object get(int i) {
        g75.j(i, this.A);
        Object obj = this.y[(i * 2) + this.z];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final boolean n() {
        return true;
    }

    public final int size() {
        return this.A;
    }
}
