package defpackage;

import android.os.Trace;

/* renamed from: ih4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ih4 {
    public final uy3 a;
    public final wr0 b = new wr0(17);
    public boolean c;
    public boolean d;
    public final hv2 e = new hv2(23);
    public final eq4 f = new eq4(new uy3[16]);
    public final long g = 1;
    public final eq4 h = new eq4(new hh4[16]);
    public k31 i;

    public ih4(uy3 uy3) {
        this.a = uy3;
    }

    public static final boolean a(ih4 ih4, uy3 uy3, boolean z) {
        k31 k31;
        boolean z2;
        dh5 dh5;
        hc3 hc3;
        uy3 v;
        uy3 uy32 = ih4.a;
        boolean z3 = uy3.j0;
        yy3 yy3 = uy3.b0;
        boolean z4 = false;
        if (!z3 && k(uy3)) {
            if (uy3 == uy32) {
                k31 = ih4.i;
                k31.getClass();
            } else {
                k31 = null;
            }
            if (z) {
                if (yy3.e) {
                    z4 = c(uy3, k31);
                }
                if ((z4 || yy3.f) && sg3.e(uy3.L(), Boolean.TRUE)) {
                    uy3.M();
                }
            } else {
                if (uy3.q()) {
                    z2 = d(uy3, k31);
                } else {
                    z2 = false;
                }
                if (uy3.p() && (uy3 == uy32 || ((v = uy3.v()) != null && v.K() && yy3.p.P))) {
                    if (uy3 == uy32) {
                        if (uy3.X == sy3.y) {
                            uy3.f();
                        }
                        uy3 v2 = uy3.v();
                        if (v2 == null || (hc3 = (hc3) v2.a0.d) == null || (dh5 = hc3.L) == null) {
                            dh5 = ((je) xy3.a(uy3)).getPlacementScope();
                        }
                        dh5.k(dh5, yy3.p, 0, 0);
                    } else {
                        uy3.V();
                    }
                    hv2 hv2 = ih4.e;
                    hv2.getClass();
                    if (uy3.i0 > 0) {
                        ((eq4) hv2.y).b(uy3);
                        uy3.h0 = true;
                    }
                }
                z4 = z2;
            }
            ih4.e();
        }
        return z4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    public static boolean c(uy3 uy3, k31 k31) {
        boolean z;
        uy3 v;
        k31 k312;
        uy3 uy32 = uy3.D;
        yy3 yy3 = uy3.b0;
        if (uy32 == null) {
            return false;
        }
        if (k31 == null) {
            jd4 jd4 = yy3.q;
            if (jd4 != null) {
                k312 = jd4.J;
            } else {
                k312 = null;
            }
            if (!(k312 == null || uy32 == null)) {
                jd4.getClass();
                z = jd4.G0(k312.a);
                v = uy3.v();
                if (v.D == null) {
                }
            }
        } else if (uy32 != null) {
            jd4 jd42 = yy3.q;
            jd42.getClass();
            z = jd42.G0(k31.a);
            v = uy3.v();
            if (z && v != null) {
                if (v.D == null) {
                    uy3.Z(v, false, 3);
                    return z;
                } else if (uy3.t() == sy3.w) {
                    uy3.X(v, false, 3);
                    return z;
                } else if (uy3.t() == sy3.x) {
                    v.W(false);
                }
            }
            return z;
        }
        z = false;
        v = uy3.v();
        if (v.D == null) {
        }
    }

    public static boolean d(uy3 uy3, k31 k31) {
        boolean z;
        if (k31 != null) {
            z = uy3.R(k31);
        } else {
            z = uy3.S(uy3);
        }
        uy3 v = uy3.v();
        if (z && v != null) {
            if (uy3.s() == sy3.w) {
                uy3.Z(v, false, 3);
                return z;
            } else if (uy3.s() == sy3.x) {
                v.Y(false);
            }
        }
        return z;
    }

    public static boolean i(uy3 uy3) {
        jd4 jd4;
        vy3 vy3;
        if (!uy3.b0.e) {
            return false;
        }
        if (uy3.t() == sy3.y && ((jd4 = uy3.b0.q) == null || (vy3 = jd4.N) == null || !vy3.e())) {
            return false;
        }
        return true;
    }

    public static boolean j(uy3 uy3) {
        qy3 qy3;
        if (!uy3.q()) {
            return false;
        }
        do {
            if (uy3.s() == sy3.y && !uy3.b0.p.T.e()) {
                uy3 v = uy3.v();
                if (v != null) {
                    qy3 = v.b0.d;
                } else {
                    qy3 = null;
                }
                if (qy3 != qy3.w) {
                    return false;
                }
            }
            uy3 = uy3.v();
            if (uy3 == null) {
                return false;
            }
        } while (!uy3.K());
        return true;
    }

    public static boolean k(uy3 uy3) {
        jd4 jd4;
        vy3 vy3;
        yy3 yy3 = uy3.b0;
        if (uy3.K() || yy3.p.P || j(uy3) || sg3.e(uy3.L(), Boolean.TRUE) || i(uy3) || yy3.p.T.e() || ((jd4 = yy3.q) != null && (vy3 = jd4.N) != null && vy3.e())) {
            return true;
        }
        return false;
    }

    public final void b(boolean z) {
        hv2 hv2 = this.e;
        if (z) {
            eq4 eq4 = (eq4) hv2.y;
            uy3 uy3 = this.a;
            if (uy3.i0 > 0) {
                eq4.g();
                eq4.b(uy3);
                uy3.h0 = true;
            }
        }
        if (((eq4) hv2.y).y != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                hv2.x0();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e() {
        eq4 eq4 = this.h;
        int i2 = eq4.y;
        if (i2 != 0) {
            Object[] objArr = eq4.w;
            for (int i3 = 0; i3 < i2; i3++) {
                hh4 hh4 = (hh4) objArr[i3];
                if (hh4.a.J()) {
                    boolean z = hh4.b;
                    uy3 uy3 = hh4.a;
                    boolean z2 = hh4.c;
                    if (!z) {
                        uy3.Z(uy3, z2, 2);
                    } else {
                        uy3.X(uy3, z2, 2);
                    }
                }
            }
            eq4.g();
        }
    }

    public final void f(uy3 uy3) {
        eq4 z = uy3.z();
        Object[] objArr = z.w;
        int i2 = z.y;
        for (int i3 = 0; i3 < i2; i3++) {
            uy3 uy32 = (uy3) objArr[i3];
            if (sg3.e(uy32.L(), Boolean.TRUE) && !uy32.j0) {
                if (this.b.t(uy32)) {
                    uy32.M();
                }
                f(uy32);
            }
        }
    }

    public final void g(uy3 uy3, boolean z) {
        boolean z2;
        if (!this.c) {
            yb3.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z) {
            z2 = uy3.b0.e;
        } else {
            z2 = uy3.q();
        }
        if (z2) {
            yb3.a("node not yet measured");
        }
        h(uy3, z);
    }

    public final void h(uy3 uy3, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        jd4 jd4;
        vy3 vy3;
        eq4 z5 = uy3.z();
        Object[] objArr = z5.w;
        int i2 = z5.y;
        for (int i3 = 0; i3 < i2; i3++) {
            uy3 uy32 = (uy3) objArr[i3];
            sy3 sy3 = sy3.w;
            if ((!z && (uy32.s() == sy3 || uy32.b0.p.T.e())) || (z && (uy32.t() == sy3 || !((jd4 = uy32.b0.q) == null || (vy3 = jd4.N) == null || !vy3.e())))) {
                boolean B = we.B(uy32);
                yy3 yy3 = uy32.b0;
                if (B && !z) {
                    if (!yy3.e || !this.b.t(uy32)) {
                        g(uy32, true);
                    } else {
                        o(uy32, true);
                    }
                }
                if (z) {
                    z3 = yy3.e;
                } else {
                    z3 = uy32.q();
                }
                if (z3) {
                    o(uy32, z);
                }
                if (z) {
                    z4 = yy3.e;
                } else {
                    z4 = uy32.q();
                }
                if (!z4) {
                    h(uy32, z);
                }
            }
        }
        if (z) {
            z2 = uy3.b0.e;
        } else {
            z2 = uy3.q();
        }
        if (z2) {
            o(uy3, z);
        }
    }

    public final boolean l(sr2 sr2) {
        boolean z;
        ll4 ll4;
        boolean z2;
        boolean z3;
        uy3 uy3;
        boolean z4;
        boolean z5;
        wr0 wr0 = this.b;
        uy3 uy32 = this.a;
        if (!uy32.J()) {
            yb3.a("performMeasureAndLayout called with unattached root");
        }
        if (!uy32.K()) {
            yb3.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            yb3.a("performMeasureAndLayout called during measure layout");
        }
        int i2 = 0;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean T = wr0.T();
                ji8 ji8 = (ji8) wr0.x;
                if (T) {
                    z = false;
                    while (true) {
                        ji8 ji82 = (ji8) wr0.z;
                        ji8 ji83 = (ji8) wr0.y;
                        if (((my6) ji8.x).isEmpty()) {
                            if (((my6) ji83.x).isEmpty()) {
                                if (((my6) ji82.x).isEmpty()) {
                                    break;
                                }
                                uy3 uy33 = (uy3) ((my6) ji82.x).first();
                                ji82.C(uy33);
                                z2 = true;
                                uy3 = uy33;
                                z3 = false;
                            } else {
                                uy3 = (uy3) ((my6) ji83.x).first();
                                ji83.C(uy3);
                                if (uy3.D != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                z2 = true;
                            }
                        } else {
                            uy3 = (uy3) ((my6) ji8.x).first();
                            ji8.C(uy3);
                            if (uy3.D != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z2 = false;
                        }
                        if (z2) {
                            z4 = a(this, uy3, z3);
                        } else {
                            z4 = o(uy3, z3);
                            if (uy3.b0.f) {
                                wr0.k(uy3, bh3.x);
                            }
                            if (uy3.p()) {
                                wr0.k(uy3, bh3.z);
                            }
                        }
                        if (uy3 == uy32 && z4) {
                            z = true;
                        }
                    }
                    if (sr2 != null) {
                        sr2.b();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                this.c = false;
                this.d = false;
                throw th;
            }
        } else {
            z = false;
        }
        eq4 eq4 = this.f;
        Object[] objArr = eq4.w;
        int i3 = eq4.y;
        int i4 = 0;
        while (i4 < i3) {
            o00 o00 = ((uy3) objArr[i4]).a0;
            hc3 hc3 = (hc3) o00.d;
            boolean g2 = yz4.g(4194304);
            if (g2) {
                ll4 = hc3.r0;
            } else {
                ll4 = hc3.r0.A;
                if (ll4 == null) {
                    i4++;
                    i2 = 0;
                }
            }
            l76 l76 = xz4.m0;
            ll4 e1 = hc3.e1(g2);
            while (e1 != null && (e1.z & 4194304) != 0) {
                if ((e1.y & 4194304) != 0) {
                    ll4 ll42 = e1;
                    eq4 eq42 = null;
                    while (ll42 != null) {
                        if (ll42 instanceof by3) {
                            ((by3) ll42).l((hc3) o00.d);
                            ll42 = rc9.j(eq42);
                        } else {
                            if ((ll42.y & 4194304) != 0 && (ll42 instanceof wo1)) {
                                int i5 = i2;
                                for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                    if ((ll43.y & 4194304) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            ll42 = ll43;
                                        } else {
                                            if (eq42 == null) {
                                                eq42 = new eq4(new ll4[16]);
                                            }
                                            if (ll42 != null) {
                                                eq42.b(ll42);
                                                ll42 = null;
                                            }
                                            eq42.b(ll43);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            ll42 = rc9.j(eq42);
                        }
                        i2 = 0;
                    }
                }
                if (e1 == ll4) {
                    break;
                }
                e1 = e1.B;
                i2 = 0;
            }
            i4++;
            i2 = 0;
        }
        eq4.g();
        return z;
    }

    public final void m(uy3 uy3, long j) {
        ll4 ll4;
        if (!uy3.j0) {
            uy3 uy32 = this.a;
            if (uy3 == uy32) {
                yb3.a("measureAndLayout called on root");
            }
            if (!uy32.J()) {
                yb3.a("performMeasureAndLayout called with unattached root");
            }
            if (!uy32.K()) {
                yb3.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                yb3.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    wr0 wr0 = this.b;
                    ((ji8) wr0.x).C(uy3);
                    ((ji8) wr0.y).C(uy3);
                    ((ji8) wr0.z).C(uy3);
                    if ((c(uy3, new k31(j)) || uy3.b0.f) && sg3.e(uy3.L(), Boolean.TRUE)) {
                        uy3.M();
                    }
                    f(uy3);
                    d(uy3, new k31(j));
                    if (uy3.p() && uy3.K()) {
                        uy3.V();
                        hv2 hv2 = this.e;
                        hv2.getClass();
                        if (uy3.i0 > 0) {
                            ((eq4) hv2.y).b(uy3);
                            uy3.h0 = true;
                        }
                    }
                    e();
                    this.c = false;
                    this.d = false;
                } catch (Throwable th) {
                    this.c = false;
                    this.d = false;
                    throw th;
                }
            }
            eq4 eq4 = this.f;
            Object[] objArr = eq4.w;
            int i2 = eq4.y;
            for (int i3 = 0; i3 < i2; i3++) {
                o00 o00 = ((uy3) objArr[i3]).a0;
                hc3 hc3 = (hc3) o00.d;
                boolean g2 = yz4.g(4194304);
                if (g2) {
                    ll4 = hc3.r0;
                } else {
                    ll4 = hc3.r0.A;
                    if (ll4 == null) {
                    }
                }
                l76 l76 = xz4.m0;
                ll4 e1 = hc3.e1(g2);
                while (e1 != null && (e1.z & 4194304) != 0) {
                    if ((e1.y & 4194304) != 0) {
                        ll4 ll42 = e1;
                        eq4 eq42 = null;
                        while (ll42 != null) {
                            if (ll42 instanceof by3) {
                                ((by3) ll42).l((hc3) o00.d);
                            } else if ((ll42.y & 4194304) != 0 && (ll42 instanceof wo1)) {
                                int i4 = 0;
                                for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                    if ((ll43.y & 4194304) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            ll42 = ll43;
                                        } else {
                                            if (eq42 == null) {
                                                eq42 = new eq4(new ll4[16]);
                                            }
                                            if (ll42 != null) {
                                                eq42.b(ll42);
                                                ll42 = null;
                                            }
                                            eq42.b(ll43);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            ll42 = rc9.j(eq42);
                        }
                    }
                    if (e1 == ll4) {
                        break;
                    }
                    e1 = e1.B;
                }
            }
            eq4.g();
        }
    }

    public final void n() {
        boolean z;
        wr0 wr0 = this.b;
        if (wr0.T()) {
            uy3 uy3 = this.a;
            if (!uy3.J()) {
                yb3.a("performMeasureAndLayout called with unattached root");
            }
            if (!uy3.K()) {
                yb3.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                yb3.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (((my6) ((ji8) wr0.z).x).isEmpty() || ((my6) ((ji8) wr0.x).x).isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        if (uy3.D != null) {
                            q(uy3, true);
                        } else {
                            p(uy3);
                        }
                    }
                    q(uy3, false);
                    this.c = false;
                    this.d = false;
                } catch (Throwable th) {
                    this.c = false;
                    this.d = false;
                    throw th;
                }
            }
        }
    }

    public final boolean o(uy3 uy3, boolean z) {
        k31 k31;
        boolean z2 = false;
        if (!uy3.j0 && k(uy3)) {
            if (uy3 == this.a) {
                k31 = this.i;
                k31.getClass();
            } else {
                k31 = null;
            }
            if (z) {
                if (uy3.b0.e) {
                    z2 = c(uy3, k31);
                }
            } else if (uy3.q()) {
                z2 = d(uy3, k31);
            }
            e();
        }
        return z2;
    }

    public final void p(uy3 uy3) {
        eq4 z = uy3.z();
        Object[] objArr = z.w;
        int i2 = z.y;
        for (int i3 = 0; i3 < i2; i3++) {
            uy3 uy32 = (uy3) objArr[i3];
            if (uy32.s() == sy3.w || uy32.b0.p.T.e()) {
                if (we.B(uy32)) {
                    q(uy32, true);
                } else {
                    p(uy32);
                }
            }
        }
    }

    public final void q(uy3 uy3, boolean z) {
        k31 k31;
        if (!uy3.j0) {
            if (uy3 == this.a) {
                k31 = this.i;
                k31.getClass();
            } else {
                k31 = null;
            }
            if (z) {
                c(uy3, k31);
            } else {
                d(uy3, k31);
            }
        }
    }

    public final boolean r(uy3 uy3, boolean z) {
        int ordinal = uy3.b0.d.ordinal();
        if (!(ordinal == 0 || ordinal == 1)) {
            if (ordinal == 2 || ordinal == 3) {
                this.h.b(new hh4(uy3, false, z));
            } else if (ordinal != 4) {
                h.c();
                return false;
            } else if (!uy3.q() || z) {
                uy3.b0.p.Q = true;
                if (!uy3.j0 && (uy3.K() || j(uy3))) {
                    uy3 v = uy3.v();
                    if (v == null || !v.q()) {
                        this.b.k(uy3, bh3.y);
                    }
                    if (!this.d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void s(long j) {
        boolean z;
        bh3 bh3;
        k31 k31 = this.i;
        if (k31 == null) {
            z = false;
        } else {
            z = k31.b(k31.a, j);
        }
        if (!z) {
            if (this.c) {
                yb3.a("updateRootConstraints called while measuring");
            }
            this.i = new k31(j);
            uy3 uy3 = this.a;
            boolean J = uy3.J();
            yy3 yy3 = uy3.b0;
            if (J) {
                uy3 uy32 = uy3.D;
                if (uy32 != null) {
                    yy3.e = true;
                }
                yy3.p.Q = true;
                if (uy32 != null) {
                    bh3 = bh3.w;
                } else {
                    bh3 = bh3.y;
                }
                this.b.k(uy3, bh3);
            }
        }
    }
}
