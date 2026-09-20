package defpackage;

/* renamed from: jd4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jd4 extends eh5 implements gh4, qb, rm4 {
    public final yy3 B;
    public boolean C;
    public int D = Integer.MAX_VALUE;
    public int E = Integer.MAX_VALUE;
    public sy3 F = sy3.y;
    public boolean G;
    public boolean H;
    public boolean I;
    public k31 J;
    public long K = 0;
    public vr2 L;
    public hd4 M = hd4.y;
    public final vy3 N = new vy3(this, 1);
    public final eq4 O = new eq4(new jd4[16]);
    public boolean P = true;
    public boolean Q;
    public final id4 R = new id4(this, 0);
    public boolean S = true;
    public Object T;
    public long U;
    public final id4 V;
    public final id4 W;
    public boolean X;

    public jd4(yy3 yy3) {
        this.B = yy3;
        this.T = yy3.p.N;
        this.U = m31.b(0, 0, 0, 0, 15);
        this.V = new id4(this, 2);
        this.W = new id4(this, 1);
    }

    public final Object B() {
        return this.T;
    }

    public final void B0() {
        qy3 qy3;
        this.X = true;
        yy3 yy3 = this.B;
        uy3 v = yy3.a.v();
        hd4 hd4 = this.M;
        if ((hd4 != hd4.w && !yy3.c) || (hd4 != hd4.x && yy3.c)) {
            s0();
            if (this.C && v != null) {
                v.W(false);
            }
        }
        if (v != null) {
            yy3 yy32 = v.b0;
            if (!this.C && ((qy3 = yy32.d) == qy3.y || qy3 == qy3.z)) {
                if (this.E != Integer.MAX_VALUE) {
                    yb3.b("Place was called on a node which was placed already");
                }
                int i = yy32.h;
                this.E = i;
                yy32.h = i + 1;
            }
        } else {
            this.E = 0;
        }
        J();
    }

    public final void D0(long j, vr2 vr2) {
        qy3 qy3;
        yy3 yy3 = this.B;
        uy3 uy3 = yy3.a;
        uy3 uy32 = yy3.a;
        try {
            uy3 v = uy3.v();
            if (v != null) {
                qy3 = v.b0.d;
            } else {
                qy3 = null;
            }
            qy3 qy32 = qy3.z;
            if (qy3 == qy32) {
                yy3.c = false;
            }
            if (uy32.j0) {
                yb3.a("place is called on a deactivated node");
            }
            yy3.d = qy32;
            boolean z = true;
            this.H = true;
            this.X = false;
            if (!oe3.a(j, this.K)) {
                if (yy3.n || yy3.m) {
                    yy3.f = true;
                }
                u0();
            }
            p95 a = xy3.a(uy32);
            this.K = j;
            if (!yy3.f) {
                if (this.M == hd4.y) {
                    z = false;
                }
                if (z) {
                    fd4 a1 = yy3.a().a1();
                    a1.getClass();
                    a1.T0(oe3.c(j, a1.A));
                    B0();
                    this.L = vr2;
                    yy3.d = qy3.A;
                }
            }
            yy3.h(false);
            this.N.g = false;
            r95 snapshotObserver = ((je) a).getSnapshotObserver();
            snapshotObserver.a.e(uy32, snapshotObserver.g, this.W);
            this.L = vr2;
            yy3.d = qy3.A;
        } catch (Throwable th) {
            uy3.c0(th);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f A[Catch:{ all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064 A[Catch:{ all -> 0x0010 }, LOOP:0: B:29:0x0062->B:30:0x0064, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a A[Catch:{ all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007d A[Catch:{ all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e A[Catch:{ all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008f A[Catch:{ all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba A[RETURN] */
    public final boolean G0(long j) {
        boolean z;
        int i;
        int i2;
        long j2;
        fd4 a1;
        boolean z2;
        yy3 yy3 = this.B;
        uy3 uy3 = yy3.a;
        uy3 uy32 = yy3.a;
        try {
            if (uy3.j0) {
                yb3.a("measure is called on a deactivated node");
            }
            uy3 v = uy32.v();
            if (!uy32.Z) {
                if (v == null || !v.Z) {
                    z = false;
                    uy32.Z = z;
                    if (!uy32.b0.e) {
                        k31 k31 = this.J;
                        if (k31 == null) {
                            z2 = false;
                        } else {
                            z2 = k31.b(k31.a, j);
                        }
                        if (z2) {
                            p95 p95 = uy32.J;
                            if (p95 != null) {
                                ((je) p95).f(uy32, true);
                            }
                            uy32.b0();
                            return false;
                        }
                    }
                    this.J = new k31(j);
                    m0(j);
                    this.N.f = false;
                    eq4 z3 = uy32.z();
                    Object[] objArr = z3.w;
                    i = z3.y;
                    for (i2 = 0; i2 < i; i2++) {
                        jd4 jd4 = ((uy3) objArr[i2]).b0.q;
                        jd4.getClass();
                        jd4.N.c = false;
                    }
                    if (!this.I) {
                        j2 = this.y;
                    } else {
                        j2 = -9223372034707292160L;
                    }
                    this.I = true;
                    a1 = yy3.a().a1();
                    if (a1 != null) {
                        yb3.b("Lookahead result from lookaheadRemeasure cannot be null");
                    }
                    yy3.c(j);
                    i0((((long) a1.w) << 32) | (((long) a1.x) & 4294967295L));
                    if (((int) (j2 >> 32)) == a1.w && ((int) (j2 & 4294967295L)) == a1.x) {
                        return false;
                    }
                    return true;
                }
            }
            z = true;
            uy32.Z = z;
            if (!uy32.b0.e) {
            }
            this.J = new k31(j);
            m0(j);
            this.N.f = false;
            eq4 z32 = uy32.z();
            Object[] objArr2 = z32.w;
            i = z32.y;
            while (i2 < i) {
            }
            if (!this.I) {
            }
            this.I = true;
            a1 = yy3.a().a1();
            if (a1 != null) {
            }
            yy3.c(j);
            i0((((long) a1.w) << 32) | (((long) a1.x) & 4294967295L));
            if (((int) (j2 >> 32)) == a1.w || ((int) (j2 & 4294967295L)) == a1.x) {
            }
        } catch (Throwable th) {
            uy3.c0(th);
            throw null;
        }
    }

    public final void H(pb pbVar) {
        eq4 z = this.B.a.z();
        Object[] objArr = z.w;
        int i = z.y;
        for (int i2 = 0; i2 < i; i2++) {
            jd4 jd4 = ((uy3) objArr[i2]).b0.q;
            jd4.getClass();
            pbVar.y(jd4);
        }
    }

    public final void I(boolean z) {
        Boolean bool;
        fd4 a1;
        yy3 yy3 = this.B;
        fd4 a12 = yy3.a().a1();
        if (a12 != null) {
            bool = Boolean.valueOf(a12.H);
        } else {
            bool = null;
        }
        if (!Boolean.valueOf(z).equals(bool) && (a1 = yy3.a().a1()) != null) {
            a1.H = z;
        }
    }

    public final void J() {
        k31 k31;
        this.Q = true;
        vy3 vy3 = this.N;
        vy3.h();
        yy3 yy3 = this.B;
        boolean z = yy3.f;
        uy3 uy3 = yy3.a;
        if (z) {
            eq4 z2 = uy3.z();
            Object[] objArr = z2.w;
            int i = z2.y;
            for (int i2 = 0; i2 < i; i2++) {
                uy3 uy32 = (uy3) objArr[i2];
                yy3 yy32 = uy32.b0;
                if (yy32.e && uy32.t() == sy3.w) {
                    jd4 jd4 = yy32.q;
                    jd4.getClass();
                    jd4 jd42 = yy32.q;
                    if (jd42 != null) {
                        k31 = jd42.J;
                    } else {
                        k31 = null;
                    }
                    k31.getClass();
                    if (jd4.G0(k31.a)) {
                        uy3.X(uy3, false, 7);
                    }
                }
            }
        }
        gc3 gc3 = f().s0;
        gc3.getClass();
        if (yy3.g || (!this.G && !gc3.K && yy3.f)) {
            yy3.f = false;
            qy3 qy3 = yy3.d;
            yy3.d = qy3.z;
            yy3.i(false);
            r95 snapshotObserver = ((je) xy3.a(uy3)).getSnapshotObserver();
            snapshotObserver.a.e(uy3, snapshotObserver.h, this.R);
            yy3.d = qy3;
            if (yy3.m && gc3.K) {
                requestLayout();
            }
            yy3.g = false;
        }
        if (vy3.d) {
            vy3.e = true;
        }
        if (vy3.b && vy3.e()) {
            vy3.g();
        }
        this.Q = false;
    }

    public final void V() {
        uy3.X(this.B.a, false, 7);
    }

    public final int W(int i) {
        x0();
        fd4 a1 = this.B.a().a1();
        a1.getClass();
        return a1.W(i);
    }

    public final int X(kb kbVar) {
        qy3 qy3;
        yy3 yy3 = this.B;
        uy3 v = yy3.a.v();
        qy3 qy32 = null;
        if (v != null) {
            qy3 = v.b0.d;
        } else {
            qy3 = null;
        }
        qy3 qy33 = qy3.x;
        vy3 vy3 = this.N;
        if (qy3 == qy33) {
            vy3.c = true;
        } else {
            uy3 v2 = yy3.a.v();
            if (v2 != null) {
                qy32 = v2.b0.d;
            }
            if (qy32 == qy3.z) {
                vy3.d = true;
            }
        }
        this.G = true;
        fd4 a1 = yy3.a().a1();
        a1.getClass();
        int X2 = a1.X(kbVar);
        this.G = false;
        return X2;
    }

    public final int Z() {
        fd4 a1 = this.B.a().a1();
        a1.getClass();
        return a1.Z();
    }

    public final vy3 a() {
        return this.N;
    }

    public final int b0() {
        fd4 a1 = this.B.a().a1();
        a1.getClass();
        return a1.b0();
    }

    public final int c(int i) {
        x0();
        fd4 a1 = this.B.a().a1();
        a1.getClass();
        return a1.c(i);
    }

    public final hc3 f() {
        return (hc3) this.B.a.a0.d;
    }

    public final qb g() {
        yy3 yy3;
        uy3 v = this.B.a.v();
        if (v == null || (yy3 = v.b0) == null) {
            return null;
        }
        return yy3.q;
    }

    public final void h0(long j, float f, vr2 vr2) {
        D0(j, vr2);
    }

    public final int l(int i) {
        x0();
        fd4 a1 = this.B.a().a1();
        a1.getClass();
        return a1.l(i);
    }

    public final int m() {
        return this.E;
    }

    public final boolean n0() {
        yy3 yy3 = this.B;
        if (we.B(yy3.a) || yy3.c) {
            return true;
        }
        return false;
    }

    public final void p0(boolean z) {
        if (z && n0()) {
            return;
        }
        if (z || n0()) {
            this.M = hd4.y;
            eq4 z2 = this.B.a.z();
            Object[] objArr = z2.w;
            int i = z2.y;
            for (int i2 = 0; i2 < i; i2++) {
                jd4 jd4 = ((uy3) objArr[i2]).b0.q;
                jd4.getClass();
                jd4.p0(true);
            }
        }
    }

    public final void requestLayout() {
        this.B.a.W(false);
    }

    public final void s0() {
        hd4 hd4 = this.M;
        yy3 yy3 = this.B;
        boolean z = yy3.c;
        uy3 uy3 = yy3.a;
        hd4 hd42 = hd4.w;
        if (z) {
            this.M = hd4.x;
        } else {
            this.M = hd42;
        }
        if (hd4 != hd42 && yy3.e) {
            uy3.X(uy3, true, 6);
        }
        eq4 z2 = uy3.z();
        Object[] objArr = z2.w;
        int i = z2.y;
        int i2 = 0;
        while (i2 < i) {
            uy3 uy32 = (uy3) objArr[i2];
            jd4 jd4 = uy32.b0.q;
            if (jd4 != null) {
                if (jd4.E != Integer.MAX_VALUE) {
                    jd4.s0();
                    uy3.a0(uy32);
                }
                i2++;
            } else {
                h.q("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
        }
    }

    public final void u0() {
        yy3 yy3 = this.B;
        if (yy3.o > 0) {
            eq4 z = yy3.a.z();
            Object[] objArr = z.w;
            int i = z.y;
            for (int i2 = 0; i2 < i; i2++) {
                uy3 uy3 = (uy3) objArr[i2];
                yy3 yy32 = uy3.b0;
                if ((yy32.m || yy32.n) && !yy32.f) {
                    uy3.W(false);
                }
                jd4 jd4 = yy32.q;
                if (jd4 != null) {
                    jd4.u0();
                }
            }
        }
    }

    public final int v(int i) {
        x0();
        fd4 a1 = this.B.a().a1();
        a1.getClass();
        return a1.v(i);
    }

    public final void x0() {
        sy3 sy3;
        yy3 yy3 = this.B;
        uy3.X(yy3.a, false, 7);
        uy3 uy3 = yy3.a;
        uy3 v = uy3.v();
        if (v != null && uy3.X == sy3.y) {
            int ordinal = v.b0.d.ordinal();
            if (ordinal == 0) {
                sy3 = sy3.w;
            } else if (ordinal != 2) {
                sy3 = v.X;
            } else {
                sy3 = sy3.x;
            }
            uy3.X = sy3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r1 == defpackage.qy3.z) goto L_0x0027;
     */
    public final eh5 y(long j) {
        qy3 qy3;
        sy3 sy3;
        qy3 qy32;
        yy3 yy3 = this.B;
        uy3 uy3 = yy3.a;
        uy3 uy32 = yy3.a;
        uy3 v = uy3.v();
        if (v != null) {
            qy3 = v.b0.d;
        } else {
            qy3 = null;
        }
        if (qy3 != qy3.x) {
            uy3 v2 = uy32.v();
            if (v2 != null) {
                qy32 = v2.b0.d;
            } else {
                qy32 = null;
            }
        }
        yy3.b = false;
        uy3 v3 = uy32.v();
        sy3 sy32 = sy3.y;
        if (v3 != null) {
            yy3 yy32 = v3.b0;
            if (this.F != sy32 && !uy32.Z) {
                yb3.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = yy32.d.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                sy3 = sy3.w;
            } else if (ordinal == 2 || ordinal == 3) {
                sy3 = sy3.x;
            } else {
                rf2.y("Measurable could be only measured from the parent's measure or layout block. Parents state is ", yy32.d);
                return null;
            }
            this.F = sy3;
        } else {
            this.F = sy32;
        }
        if (uy32.X == sy32) {
            uy32.e();
        }
        G0(j);
        return this;
    }
}
