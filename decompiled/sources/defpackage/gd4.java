package defpackage;

/* renamed from: gd4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gd4 implements dy3 {
    public final fd4 w;

    public gd4(fd4 fd4) {
        this.w = fd4;
    }

    public final long A(long j) {
        return l35.e(this.w.O.A(j), a());
    }

    public final dy3 D() {
        fd4 a1;
        if (!n()) {
            yb3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        xz4 xz4 = ((xz4) this.w.O.O.a0.e).Q;
        if (xz4 == null || (a1 = xz4.a1()) == null) {
            return null;
        }
        return a1.R;
    }

    public final long M(dy3 dy3, long j) {
        return O(dy3, j);
    }

    public final long N(long j) {
        return l35.e(this.w.O.N(j), a());
    }

    public final long O(dy3 dy3, long j) {
        boolean z = dy3 instanceof gd4;
        fd4 fd4 = this.w;
        if (z) {
            fd4 fd42 = ((gd4) dy3).w;
            xz4 xz4 = fd42.O;
            xz4.l1();
            fd4 a1 = fd4.O.Y0(xz4).a1();
            if (a1 != null) {
                long b = oe3.b(oe3.c(fd42.U0(a1, false), gr8.V(j)), fd4.U0(a1, false));
                return (((long) Float.floatToRawIntBits((float) ((int) (b >> 32)))) << 32) | (((long) Float.floatToRawIntBits((float) ((int) (b & 4294967295L)))) & 4294967295L);
            }
            fd4 D = b96.D(fd42);
            long c = oe3.c(oe3.c(fd42.U0(D, false), D.P), gr8.V(j));
            fd4 D2 = b96.D(fd4);
            long b2 = oe3.b(c, oe3.c(fd4.U0(D2, false), D2.P));
            long floatToRawIntBits = ((long) Float.floatToRawIntBits((float) ((int) (b2 & 4294967295L)))) & 4294967295L;
            xz4 xz42 = D2.O.Q;
            xz42.getClass();
            xz4 xz43 = D.O.Q;
            xz43.getClass();
            return xz42.O(xz43, floatToRawIntBits | (((long) Float.floatToRawIntBits((float) ((int) (b2 >> 32)))) << 32));
        }
        fd4 D3 = b96.D(fd4);
        xz4 xz44 = D3.O;
        long O = O(D3.R, j);
        long j2 = D3.P;
        long floatToRawIntBits2 = (long) Float.floatToRawIntBits((float) ((int) (j2 >> 32)));
        long d = l35.d(O, (4294967295L & ((long) Float.floatToRawIntBits((float) ((int) (j2 & 4294967295L))))) | (floatToRawIntBits2 << 32));
        if (!xz44.c1().J) {
            yb3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        xz44.l1();
        xz4 xz45 = xz44.Q;
        if (xz45 != null) {
            xz44 = xz45;
        }
        return l35.e(d, xz44.O(dy3, 0));
    }

    public final ly5 Q(dy3 dy3, boolean z) {
        return this.w.O.Q(dy3, z);
    }

    public final long R(long j) {
        return this.w.O.R(l35.e(j, a()));
    }

    public final long a() {
        fd4 fd4 = this.w;
        fd4 D = b96.D(fd4);
        return l35.d(O(D.R, 0), fd4.O.O(D.O, 0));
    }

    public final long d(long j) {
        return this.w.O.d(l35.e(j, a()));
    }

    public final void h(float[] fArr) {
        this.w.O.h(fArr);
    }

    public final void j(dy3 dy3, float[] fArr) {
        this.w.O.j(dy3, fArr);
    }

    public final long k() {
        fd4 fd4 = this.w;
        return (((long) fd4.w) << 32) | (((long) fd4.x) & 4294967295L);
    }

    public final boolean n() {
        return this.w.O.c1().J;
    }

    public final long w(long j) {
        return this.w.O.w(l35.e(j, a()));
    }
}
