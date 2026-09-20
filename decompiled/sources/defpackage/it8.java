package defpackage;

import java.util.Objects;

/* renamed from: it8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class it8 extends hs8 {
    public final transient Object[] B;
    public final transient int C;
    public final transient int D;

    public it8(Object[] objArr, int i, int i2) {
        super(1);
        this.B = objArr;
        this.C = i;
        this.D = i2;
    }

    public final Object get(int i) {
        l55.B(i, this.D);
        Object obj = this.B[i + i + this.C];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.D;
    }
}
