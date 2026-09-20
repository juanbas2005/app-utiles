package defpackage;

import java.util.List;

/* renamed from: kh4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kh4 extends eh5 implements gh4, qb, rm4 {
    public final yy3 B;
    public boolean C;
    public int D = Integer.MAX_VALUE;
    public int E = Integer.MAX_VALUE;
    public boolean F;
    public boolean G;
    public sy3 H = sy3.y;
    public boolean I;
    public long J = 0;
    public vr2 K;
    public float L;
    public boolean M = true;
    public Object N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final vy3 T = new vy3(this, 0);
    public final eq4 U = new eq4(new kh4[16]);
    public boolean V = true;
    public boolean W;
    public long X = m31.b(0, 0, 0, 0, 15);
    public final jh4 Y = new jh4(this, 1);
    public final jh4 Z = new jh4(this, 0);
    public float a0;
    public boolean b0;
    public vr2 c0;
    public long d0 = 0;
    public float e0;
    public final jh4 f0 = new jh4(this, 2);
    public boolean g0;

    public kh4(yy3 yy3) {
        this.B = yy3;
    }

    public final Object B() {
        return this.N;
    }

    public final void B0(long j, float f, vr2 vr2) {
        yy3 yy3 = this.B;
        uy3 uy3 = yy3.a;
        uy3 uy32 = yy3.a;
        if (uy3.j0) {
            yb3.a("place is called on a deactivated node");
        }
        yy3.d = qy3.y;
        this.J = j;
        this.L = f;
        this.K = vr2;
        this.b0 = false;
        p95 a = xy3.a(uy32);
        if (this.R || !this.O) {
            this.T.g = false;
            yy3.f(false);
            this.c0 = vr2;
            this.d0 = j;
            this.e0 = f;
            r95 snapshotObserver = ((je) a).getSnapshotObserver();
            snapshotObserver.a.e(uy32, snapshotObserver.f, this.f0);
        } else {
            xz4 a2 = yy3.a();
            a2.s1(oe3.c(j, a2.A), f, vr2);
            x0();
        }
        yy3.d = qy3.A;
        if (yy3.a().K && (yy3.k || yy3.j)) {
            requestLayout();
        }
        this.G = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[Catch:{ all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[Catch:{ all -> 0x0010 }, LOOP:0: B:23:0x0052->B:24:0x0054, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074 A[Catch:{ all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075 A[Catch:{ all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099 A[Catch:{ all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bf A[Catch:{ all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c0 A[Catch:{ all -> 0x0010 }] */
    public final boolean D0(long j) {
        boolean z;
        int i;
        int i2;
        qy3 qy3;
        qy3 qy32;
        qy3 qy33;
        yy3 yy3 = this.B;
        uy3 uy3 = yy3.a;
        uy3 uy32 = yy3.a;
        try {
            if (uy3.j0) {
                yb3.a("measure is called on a deactivated node");
            }
            p95 a = xy3.a(uy32);
            uy3 v = uy32.v();
            boolean z2 = true;
            if (!uy32.Z) {
                if (v == null || !v.Z) {
                    z = false;
                    uy32.Z = z;
                    if (!uy32.q()) {
                        if (k31.b(this.z, j)) {
                            ((je) a).f(uy32, false);
                            uy32.b0();
                            return false;
                        }
                    }
                    this.T.f = false;
                    eq4 z3 = uy32.z();
                    Object[] objArr = z3.w;
                    i = z3.y;
                    for (i2 = 0; i2 < i; i2++) {
                        ((uy3) objArr[i2]).b0.p.T.c = false;
                    }
                    this.F = true;
                    long j2 = yy3.a().y;
                    m0(j);
                    qy3 = yy3.d;
                    qy32 = qy3.A;
                    if (qy3 == qy32) {
                        yb3.b("layout state is not idle before measure starts");
                    }
                    this.X = j;
                    qy33 = qy3.w;
                    yy3.d = qy33;
                    this.Q = false;
                    r95 snapshotObserver = ((je) xy3.a(uy32)).getSnapshotObserver();
                    snapshotObserver.a.e(uy32, snapshotObserver.c, this.Y);
                    if (yy3.d == qy33) {
                        this.R = true;
                        this.S = true;
                        yy3.d = qy32;
                    }
                    if (we3.a(yy3.a().y, j2) && yy3.a().w == this.w) {
                        if (yy3.a().x != this.x) {
                            z2 = false;
                        }
                    }
                    i0((((long) yy3.a().x) & 4294967295L) | (((long) yy3.a().w) << 32));
                    return z2;
                }
            }
            z = true;
            uy32.Z = z;
            if (!uy32.q()) {
            }
            this.T.f = false;
            eq4 z32 = uy32.z();
            Object[] objArr2 = z32.w;
            i = z32.y;
            while (i2 < i) {
            }
            this.F = true;
            long j22 = yy3.a().y;
            m0(j);
            qy3 = yy3.d;
            qy32 = qy3.A;
            if (qy3 == qy32) {
            }
            this.X = j;
            qy33 = qy3.w;
            yy3.d = qy33;
            this.Q = false;
            r95 snapshotObserver2 = ((je) xy3.a(uy32)).getSnapshotObserver();
            snapshotObserver2.a.e(uy32, snapshotObserver2.c, this.Y);
            if (yy3.d == qy33) {
            }
            if (yy3.a().x != this.x) {
            }
            i0((((long) yy3.a().x) & 4294967295L) | (((long) yy3.a().w) << 32));
            return z2;
        } catch (Throwable th) {
            uy3.c0(th);
            throw null;
        }
    }

    public final void G0() {
        yy3 yy3 = this.B;
        uy3 uy3 = yy3.a;
        uy3 uy32 = yy3.a;
        if (uy3.K() && yy3.l > 0) {
            yy3 yy32 = uy32.b0;
            if ((yy32.j || yy32.k) && !yy32.p.R) {
                uy32.Y(false);
            }
            eq4 z = uy32.z();
            Object[] objArr = z.w;
            int i = z.y;
            for (int i2 = 0; i2 < i; i2++) {
                ((uy3) objArr[i2]).b0.p.G0();
            }
        }
    }

    public final void H(pb pbVar) {
        eq4 z = this.B.a.z();
        Object[] objArr = z.w;
        int i = z.y;
        for (int i2 = 0; i2 < i; i2++) {
            pbVar.y(((uy3) objArr[i2]).b0.p);
        }
    }

    public final void I(boolean z) {
        yy3 yy3 = this.B;
        if (z != yy3.a().H) {
            yy3.a().H = z;
            this.g0 = true;
        }
    }

    public final void J() {
        this.W = true;
        vy3 vy3 = this.T;
        vy3.h();
        boolean z = this.R;
        yy3 yy3 = this.B;
        if (z) {
            eq4 z2 = yy3.a.z();
            Object[] objArr = z2.w;
            int i = z2.y;
            for (int i2 = 0; i2 < i; i2++) {
                uy3 uy3 = (uy3) objArr[i2];
                if (uy3.q() && uy3.s() == sy3.w && uy3.S(uy3)) {
                    uy3.Z(yy3.a, false, 7);
                }
            }
        }
        if (this.S || (!this.I && !f().K && this.R)) {
            this.R = false;
            qy3 qy3 = yy3.d;
            yy3.d = qy3.y;
            yy3.g(false);
            uy3 uy32 = yy3.a;
            r95 snapshotObserver = ((je) xy3.a(uy32)).getSnapshotObserver();
            snapshotObserver.a.e(uy32, snapshotObserver.e, this.Z);
            yy3.d = qy3;
            this.S = false;
        }
        if (vy3.d) {
            vy3.e = true;
        }
        if (vy3.b && vy3.e()) {
            vy3.g();
        }
        this.W = false;
    }

    public final void V() {
        uy3.Z(this.B.a, false, 7);
    }

    public final int W(int i) {
        yy3 yy3 = this.B;
        if (we.B(yy3.a)) {
            jd4 jd4 = yy3.q;
            jd4.getClass();
            return jd4.W(i);
        }
        u0();
        return yy3.a().W(i);
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
        qy3 qy33 = qy3.w;
        vy3 vy3 = this.T;
        if (qy3 == qy33) {
            vy3.c = true;
        } else {
            uy3 v2 = yy3.a.v();
            if (v2 != null) {
                qy32 = v2.b0.d;
            }
            if (qy32 == qy3.y) {
                vy3.d = true;
            }
        }
        this.I = true;
        int X2 = yy3.a().X(kbVar);
        this.I = false;
        return X2;
    }

    public final int Z() {
        return this.B.a().Z();
    }

    public final vy3 a() {
        return this.T;
    }

    public final int b0() {
        return this.B.a().b0();
    }

    public final int c(int i) {
        yy3 yy3 = this.B;
        if (we.B(yy3.a)) {
            jd4 jd4 = yy3.q;
            jd4.getClass();
            return jd4.c(i);
        }
        u0();
        return yy3.a().c(i);
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
        return yy3.p;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0032 A[Catch:{ all -> 0x001b }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070 A[Catch:{ all -> 0x001b }] */
    public final void h0(long j, float f, vr2 vr2) {
        jd4 jd4;
        uy3 v;
        yy3 yy3 = this.B;
        uy3 uy3 = yy3.a;
        uy3 uy32 = yy3.a;
        try {
            this.P = true;
            if (oe3.a(j, this.J) && vr2 == this.K) {
                if (this.g0) {
                }
                jd4 = yy3.q;
                if (jd4 != null) {
                    yy3 yy32 = jd4.B;
                    if (jd4.M == hd4.y) {
                        if (!we.B(yy32.a)) {
                            yy32.c = true;
                        }
                    }
                }
                jd4 jd42 = yy3.q;
                if (jd42 != null && jd42.n0()) {
                    xz4 xz4 = yy3.a().Q;
                    if (xz4 == null || (r3 = xz4.L) == null) {
                        dh5 dh5 = ((je) xy3.a(uy32)).getPlacementScope();
                    }
                    jd4 jd43 = yy3.q;
                    jd43.getClass();
                    v = uy32.v();
                    if (v != null) {
                        v.b0.h = 0;
                    }
                    jd43.E = Integer.MAX_VALUE;
                    dh5.g(jd43, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
                }
                jd4 jd44 = yy3.q;
                if (jd44 != null && !jd44.H) {
                    yb3.b("Error: Placement happened before lookahead.");
                }
                B0(j, f, vr2);
            }
            if (yy3.k || yy3.j || this.g0) {
                this.R = true;
                this.g0 = false;
            }
            jd4 = yy3.q;
            if (jd4 != null) {
            }
            jd4 jd422 = yy3.q;
            xz4 xz42 = yy3.a().Q;
            dh5 dh52 = ((je) xy3.a(uy32)).getPlacementScope();
            jd4 jd432 = yy3.q;
            jd432.getClass();
            v = uy32.v();
            if (v != null) {
            }
            jd432.E = Integer.MAX_VALUE;
            dh52.g(jd432, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            jd4 jd442 = yy3.q;
            yb3.b("Error: Placement happened before lookahead.");
            B0(j, f, vr2);
        } catch (Throwable th) {
            uy3.c0(th);
            throw null;
        }
    }

    public final int l(int i) {
        yy3 yy3 = this.B;
        if (we.B(yy3.a)) {
            jd4 jd4 = yy3.q;
            jd4.getClass();
            return jd4.l(i);
        }
        u0();
        return yy3.a().l(i);
    }

    public final int m() {
        return this.E;
    }

    public final List n0() {
        yy3 yy3 = this.B;
        yy3.a.j0();
        boolean z = this.V;
        eq4 eq4 = this.U;
        if (!z) {
            return eq4.f();
        }
        uy3 uy3 = yy3.a;
        eq4 z2 = uy3.z();
        Object[] objArr = z2.w;
        int i = z2.y;
        for (int i2 = 0; i2 < i; i2++) {
            uy3 uy32 = (uy3) objArr[i2];
            if (eq4.y <= i2) {
                eq4.b(uy32.b0.p);
            } else {
                kh4 kh4 = uy32.b0.p;
                Object[] objArr2 = eq4.w;
                Object obj = objArr2[i2];
                objArr2[i2] = kh4;
            }
        }
        eq4.m(((eq4) ((jp4) uy3.n()).x).y, eq4.y);
        this.V = false;
        return eq4.f();
    }

    public final void p0() {
        boolean z = this.O;
        this.O = true;
        yy3 yy3 = this.B;
        uy3 uy3 = yy3.a;
        o00 o00 = uy3.a0;
        if (!z) {
            ((hc3) o00.d).n1();
            ((je) xy3.a(uy3)).getRectManager().h(yy3.a);
            if (uy3.q()) {
                uy3.Z(uy3, true, 6);
            } else if (uy3.b0.e) {
                uy3.X(uy3, true, 6);
            }
        }
        xz4 xz4 = (xz4) o00.e;
        xz4 xz42 = ((hc3) o00.d).P;
        while (!sg3.e(xz4, xz42) && xz4 != null) {
            if (xz4.k0) {
                xz4.j1();
            }
            xz4 = xz4.P;
        }
        eq4 z2 = uy3.z();
        Object[] objArr = z2.w;
        int i = z2.y;
        for (int i2 = 0; i2 < i; i2++) {
            uy3 uy32 = (uy3) objArr[i2];
            if (uy32.w() != Integer.MAX_VALUE) {
                uy32.b0.p.p0();
                uy3.a0(uy32);
            }
        }
    }

    public final void requestLayout() {
        this.B.a.Y(false);
    }

    public final void s0() {
        if (this.O) {
            this.O = false;
            yy3 yy3 = this.B;
            uy3 uy3 = yy3.a;
            uy3 uy32 = yy3.a;
            ((je) xy3.a(uy3)).getRectManager().i(uy32);
            o00 o00 = uy32.a0;
            xz4 xz4 = (xz4) o00.e;
            xz4 xz42 = ((hc3) o00.d).P;
            while (!sg3.e(xz4, xz42) && xz4 != null) {
                xz4.p1();
                xz4.u1();
                xz4 = xz4.P;
            }
            eq4 z = uy32.z();
            Object[] objArr = z.w;
            int i = z.y;
            for (int i2 = 0; i2 < i; i2++) {
                ((uy3) objArr[i2]).b0.p.s0();
            }
        }
    }

    public final void u0() {
        sy3 sy3;
        yy3 yy3 = this.B;
        uy3.Z(yy3.a, false, 7);
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

    public final int v(int i) {
        yy3 yy3 = this.B;
        if (we.B(yy3.a)) {
            jd4 jd4 = yy3.q;
            jd4.getClass();
            return jd4.v(i);
        }
        u0();
        return yy3.a().v(i);
    }

    public final void x0() {
        this.b0 = true;
        yy3 yy3 = this.B;
        uy3 v = yy3.a.v();
        float f = f().a0;
        uy3 uy3 = yy3.a;
        o00 o00 = uy3.a0;
        xz4 xz4 = (xz4) o00.e;
        hc3 hc3 = (hc3) o00.d;
        while (xz4 != hc3) {
            xz4.getClass();
            oy3 oy3 = (oy3) xz4;
            f += oy3.a0;
            xz4 = oy3.P;
        }
        if (f != this.a0) {
            this.a0 = f;
            if (v != null) {
                v.Q();
            }
            if (v != null) {
                v.D();
            }
        }
        if (!f().K) {
            boolean z = this.O;
            if (!z || this.T.d()) {
                p0();
            }
            if (!z) {
                if (v != null) {
                    v.D();
                }
                if (this.C && v != null) {
                    v.Y(false);
                }
            } else {
                ((hc3) uy3.a0.d).n1();
            }
        }
        if (v != null) {
            yy3 yy32 = v.b0;
            if (!this.C && yy32.d == qy3.y) {
                if (this.E != Integer.MAX_VALUE) {
                    yb3.b("Place was called on a node which was placed already");
                }
                int i = yy32.i;
                this.E = i;
                yy32.i = i + 1;
            }
        } else {
            this.E = 0;
        }
        J();
    }

    public final eh5 y(long j) {
        sy3 sy3;
        yy3 yy3 = this.B;
        uy3 uy3 = yy3.a;
        uy3 uy32 = yy3.a;
        sy3 sy32 = uy3.X;
        sy3 sy33 = sy3.y;
        if (sy32 == sy33) {
            uy3.e();
        }
        if (we.B(uy32)) {
            jd4 jd4 = yy3.q;
            jd4.getClass();
            jd4.F = sy33;
            jd4.y(j);
        }
        uy3 v = uy32.v();
        if (v != null) {
            yy3 yy32 = v.b0;
            if (this.H != sy33 && !uy32.Z) {
                yb3.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = yy32.d.ordinal();
            if (ordinal == 0) {
                sy3 = sy3.w;
            } else if (ordinal == 2) {
                sy3 = sy3.x;
            } else {
                rf2.y("Measurable could be only measured from the parent's measure or layout block. Parents state is ", yy32.d);
                return null;
            }
            this.H = sy3;
        } else {
            this.H = sy33;
        }
        D0(j);
        return this;
    }
}
