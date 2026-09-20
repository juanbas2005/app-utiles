package defpackage;

/* renamed from: cc1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cc1 extends ie1 {
    public final ob i0;

    public cc1(ob obVar) {
        this.i0 = obVar;
    }

    public final int o(int i, int i2, ey3 ey3, eh5 eh5, int i3) {
        int X = eh5.X(this.i0.a);
        if (X == Integer.MIN_VALUE) {
            return 0;
        }
        int i4 = i3 - X;
        if (ey3 == ey3.x) {
            return (i - i2) - i4;
        }
        return i4;
    }

    public final Integer u(eh5 eh5) {
        return Integer.valueOf(eh5.X(this.i0.a));
    }
}
