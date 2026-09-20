package defpackage;

/* renamed from: v57  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v57 extends ll4 implements my3 {
    public y57 K;

    public final boolean K0() {
        return false;
    }

    public final void N0() {
        ln7 g = h75.g(this, "StyleOuterNode");
        g.getClass();
        y57 y57 = (y57) g;
        y57.M = this;
        this.K = y57;
        y57.b1(true);
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        float f;
        float f2;
        float f3;
        float f4;
        y57 y57 = this.K;
        y57.getClass();
        z57 a1 = y57.a1(y57, 1);
        float f5 = 0.0f;
        if (a1.v((byte) 8)) {
            f = a1.k;
        } else {
            f = 0.0f;
        }
        if (a1.v((byte) 0)) {
            f2 = a1.c;
        } else {
            f2 = 0.0f;
        }
        float f6 = f2 + f;
        if (a1.v((byte) 1)) {
            f3 = a1.d;
        } else {
            f3 = 0.0f;
        }
        float f7 = f3 + f;
        if (a1.v((byte) 2)) {
            f4 = a1.e;
        } else {
            f4 = 0.0f;
        }
        float f8 = f4 + f;
        if (a1.v((byte) 3)) {
            f5 = a1.f;
        }
        int round = Math.round(f7 + f6);
        int round2 = Math.round(f5 + f + f8);
        eh5 y = gh4.y(m31.i(-round, -round2, j));
        return oh4.d0(m31.g(j, y.w + round), m31.f(j, y.x + round2), b42.w, new u57(y, f6, f8));
    }
}
