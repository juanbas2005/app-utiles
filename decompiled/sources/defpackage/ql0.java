package defpackage;

/* renamed from: ql0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ql0 {
    public final float a;
    public final float b;
    public final float c;

    public ql0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d5  */
    public final a37 a(boolean z, ap4 ap4, yt2 yt2, int i) {
        boolean z2;
        Object Q;
        uj ujVar;
        boolean z3;
        boolean i2;
        Object Q2;
        uj ujVar2;
        a37 a37;
        ap4 ap42 = ap4;
        yt2 yt22 = yt2;
        int i3 = i;
        yt22.e0(-1763481333);
        float f = this.a;
        d63 d63 = ay0.a;
        if (ap42 == null) {
            yt22.e0(167726411);
            Object Q3 = yt22.Q();
            if (Q3 == d63) {
                Q3 = u55.p(new lx1(f));
                yt22.o0(Q3);
            }
            a37 = (aq4) Q3;
            yt22.r(false);
        } else {
            yt22.e0(167799447);
            yt22.r(false);
            Object Q4 = yt22.Q();
            if (Q4 == d63) {
                Q4 = new yx6();
                yt22.o0(Q4);
            }
            yx6 yx6 = (yx6) Q4;
            boolean z4 = true;
            if ((((i3 & 112) ^ 48) <= 32 || !yt22.g(ap42)) && (i3 & 48) != 32) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object Q5 = yt22.Q();
            if (z2 || Q5 == d63) {
                Q5 = new ae0(ap42, yx6, (f61) null, 1);
                yt22.o0(Q5);
            }
            t49.h((gs2) Q5, yt22, ap42);
            df3 df3 = (df3) dt0.H0(yx6);
            if (z && !(df3 instanceof eo5)) {
                if (df3 instanceof r23) {
                    f = this.b;
                } else if (!(df3 instanceof dk2)) {
                    if (df3 instanceof vy1) {
                        f = this.c;
                    }
                }
                Q = yt22.Q();
                if (Q == d63) {
                    Q = new uj(new lx1(f), we.x, (Object) null, 12);
                    yt22.o0(Q);
                }
                ujVar = (uj) Q;
                lx1 lx1 = new lx1(f);
                boolean i4 = yt22.i(ujVar) | yt22.d(f);
                if ((((i3 & 14) ^ 6) <= 4 || !yt22.h(z)) && (i3 & 6) != 4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                boolean z5 = i4 | z3;
                if ((((i3 & 896) ^ 384) <= 256 || !yt22.g(this)) && (i3 & 384) != 256) {
                    z4 = false;
                }
                i2 = z5 | z4 | yt22.i(df3);
                Q2 = yt22.Q();
                if (!i2 || Q2 == d63) {
                    ujVar2 = ujVar;
                    be0 be0 = new be0(ujVar2, f, z, this, df3, (f61) null, 1);
                    yt22.o0(be0);
                    Q2 = be0;
                } else {
                    ujVar2 = ujVar;
                }
                t49.h((gs2) Q2, yt22, lx1);
                a37 = ujVar2.c;
            }
            f = 0.0f;
            Q = yt22.Q();
            if (Q == d63) {
            }
            ujVar = (uj) Q;
            lx1 lx12 = new lx1(f);
            boolean i42 = yt22.i(ujVar) | yt22.d(f);
            if ((((i3 & 14) ^ 6) <= 4 || !yt22.h(z)) && (i3 & 6) != 4) {
            }
            boolean z52 = i42 | z3;
            z4 = false;
            i2 = z52 | z4 | yt22.i(df3);
            Q2 = yt22.Q();
            if (!i2) {
            }
            ujVar2 = ujVar;
            be0 be02 = new be0(ujVar2, f, z, this, df3, (f61) null, 1);
            yt22.o0(be02);
            Q2 = be02;
            t49.h((gs2) Q2, yt22, lx12);
            a37 = ujVar2.c;
        }
        yt22.r(false);
        return a37;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ql0)) {
            return false;
        }
        ql0 ql0 = (ql0) obj;
        if (lx1.b(this.a, ql0.a) && lx1.b(0.0f, 0.0f) && lx1.b(0.0f, 0.0f) && lx1.b(this.b, ql0.b) && lx1.b(0.0f, 0.0f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + f21.d(this.b, f21.d(0.0f, f21.d(0.0f, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
