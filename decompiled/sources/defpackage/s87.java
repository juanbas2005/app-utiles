package defpackage;

/* renamed from: s87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class s87 {
    public static final yy0 a = new yy0((sr2) new pp5(22));

    public static final void a(ml4 ml4, pq6 pq6, long j, long j2, float f, float f2, fw0 fw0, yt2 yt2, int i, int i2) {
        long j3;
        float f3;
        float f4;
        yt2 yt22 = yt2;
        if ((i2 & 1) != 0) {
            ml4 = jl4.w;
        }
        ml4 ml42 = ml4;
        if ((i2 & 2) != 0) {
            pq6 = gr8.h;
        }
        pq6 pq62 = pq6;
        if ((i2 & 4) != 0) {
            j = ((zg4) yt22.k(ch4.b)).a.p;
        }
        long j4 = j;
        if ((i2 & 8) != 0) {
            j3 = st0.b(j4, yt22);
        } else {
            j3 = j2;
        }
        if ((i2 & 16) != 0) {
            f3 = 0.0f;
        } else {
            f3 = f;
        }
        if ((i2 & 32) != 0) {
            f4 = 0.0f;
        } else {
            f4 = f2;
        }
        yy0 yy0 = a;
        float f5 = ((lx1) yt22.k(yy0)).w + f3;
        t49.d(new ju5[]{b81.g(j3, j41.a), yy0.a(new lx1(f5))}, su0.J(421772006, new p87(ml42, pq62, j4, f5, (ua0) null, f4, fw0), yt22), yt22, 56);
    }

    public static final void b(boolean z, sr2 sr2, ml4 ml4, boolean z2, pq6 pq6, long j, long j2, float f, ua0 ua0, ap4 ap4, fw0 fw0, yt2 yt2, int i, int i2) {
        boolean z3;
        long j3;
        float f2;
        ua0 ua02;
        yt2 yt22 = yt2;
        int i3 = i2;
        if ((i3 & 8) != 0) {
            z3 = true;
        } else {
            z3 = z2;
        }
        long j4 = j;
        if ((i3 & 64) != 0) {
            j3 = st0.b(j4, yt22);
        } else {
            j3 = j2;
        }
        if ((i3 & 256) != 0) {
            f2 = 0.0f;
        } else {
            f2 = f;
        }
        ap4 ap42 = null;
        if ((i3 & 512) != 0) {
            ua02 = null;
        } else {
            ua02 = ua0;
        }
        if ((i3 & 1024) == 0) {
            ap42 = ap4;
        }
        if (ap42 == null) {
            yt22.e0(1528105640);
            Object Q = yt22.Q();
            if (Q == ay0.a) {
                Q = b81.e(yt22);
            }
            ap42 = (ap4) Q;
        } else {
            yt22.e0(-227801585);
        }
        yt22.r(false);
        yy0 yy0 = a;
        float f3 = ((lx1) yt22.k(yy0)).w + 0.0f;
        t49.d(new ju5[]{b81.g(j3, j41.a), yy0.a(new lx1(f3))}, su0.J(1508735219, new q87(ml4, ap42, pq6, j4, f3, ua02, z, z3, sr2, f2, fw0), yt22), yt22, 56);
    }

    public static final void c(sr2 sr2, ml4 ml4, boolean z, pq6 pq6, long j, long j2, float f, float f2, ua0 ua0, ap4 ap4, fw0 fw0, yt2 yt2, int i, int i2) {
        boolean z2;
        float f3;
        ua0 ua02;
        ap4 ap42;
        yt2 yt22 = yt2;
        int i3 = i2;
        if ((i3 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i3 & 64) != 0) {
            f3 = 0.0f;
        } else {
            f3 = f;
        }
        if ((i3 & 256) != 0) {
            ua02 = null;
        } else {
            ua02 = ua0;
        }
        if (ap4 == null) {
            yt22.e0(-1701074900);
            Object Q = yt22.Q();
            if (Q == ay0.a) {
                Q = b81.e(yt22);
            }
            yt22.r(false);
            ap42 = (ap4) Q;
        } else {
            yt22.e0(2023335947);
            yt22.r(false);
            ap42 = ap4;
        }
        yy0 yy0 = a;
        float f4 = ((lx1) yt22.k(yy0)).w + f3;
        t49.d(new ju5[]{b81.g(j2, j41.a), yy0.a(new lx1(f4))}, su0.J(849208527, new r87(ml4, ap42, pq6, j, f4, ua02, z2, sr2, f2, fw0), yt22), yt22, 56);
    }

    public static final ml4 d(ml4 ml4, pq6 pq6, long j, ua0 ua0, float f) {
        ml4 ml42;
        pq6 pq62;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        ml4 ml43 = jl4.w;
        if (i > 0) {
            pq62 = pq6;
            ml42 = mp7.Y(ml43, 0.0f, 0.0f, 0.0f, f, 0.0f, pq62, false, 1042399);
        } else {
            pq62 = pq6;
            ml42 = ml43;
        }
        ml4 d = ml4.d(ml42);
        if (ua0 != null) {
            ml43 = new ta0(ua0.a, ua0.b, pq62);
        }
        return we.f(b96.h(d.d(ml43), j, pq62), pq62);
    }

    public static final long e(long j, float f, yt2 yt2) {
        qt0 qt0 = ((zg4) yt2.k(ch4.b)).a;
        boolean booleanValue = ((Boolean) yt2.k(st0.a)).booleanValue();
        if (!jt0.c(j, qt0.p) || !booleanValue) {
            return j;
        }
        return st0.g(qt0, f);
    }
}
