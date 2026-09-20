package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: uy3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uy3 implements jx0, q95, ux0 {
    public static final e96 k0 = new e96("Undefined intrinsics block and it is required", 1);
    public static final py3 l0 = new Object();
    public static final wh m0 = new wh(7);
    public boolean A;
    public boolean B;
    public int C;
    public uy3 D;
    public int E;
    public final hv2 F;
    public eq4 G;
    public boolean H;
    public uy3 I;
    public p95 J;
    public int K;
    public boolean L;
    public boolean M;
    public ak6 N;
    public boolean O;
    public final eq4 P;
    public boolean Q;
    public lh4 R;
    public hv2 S;
    public tp1 T;
    public ey3 U;
    public g58 V;
    public ty0 W;
    public sy3 X;
    public sy3 Y;
    public boolean Z;
    public final o00 a0;
    public final yy3 b0;
    public iz3 c0;
    public xz4 d0;
    public boolean e0;
    public ml4 f0;
    public ml4 g0;
    public boolean h0;
    public int i0;
    public boolean j0;
    public final boolean w;
    public int x;
    public boolean y;
    public long z;

    public uy3(boolean z2, int i) {
        this.w = z2;
        this.x = i;
        this.z = 9223372034707292159L;
        this.A = true;
        this.B = true;
        this.C = -4;
        this.F = new hv2(17, (Object) new eq4(new uy3[16]), (Object) new kh(8, this));
        this.P = new eq4(new uy3[16]);
        this.Q = true;
        this.R = k0;
        this.T = xy3.a;
        this.U = ey3.w;
        this.V = l0;
        ty0.e.getClass();
        this.W = sy0.b;
        sy3 sy3 = sy3.y;
        this.X = sy3;
        this.Y = sy3;
        this.a0 = new o00(this);
        this.b0 = new yy3(this);
        this.e0 = true;
        this.f0 = jl4.w;
    }

    public static boolean S(uy3 uy3) {
        k31 k31;
        kh4 kh4 = uy3.b0.p;
        if (kh4.F) {
            k31 = new k31(kh4.z);
        } else {
            k31 = null;
        }
        return uy3.R(k31);
    }

    public static void X(uy3 uy3, boolean z2, int i) {
        boolean z3;
        uy3 v;
        boolean z4 = false;
        if ((i & 1) != 0) {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z4 = true;
        }
        if (uy3.D == null) {
            yb3.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        p95 p95 = uy3.J;
        if (p95 != null && !uy3.L && !uy3.w) {
            ((je) p95).w(uy3, true, z2, z3);
            if (z4) {
                jd4 jd4 = uy3.b0.q;
                jd4.getClass();
                yy3 yy3 = jd4.B;
                uy3 v2 = yy3.a.v();
                sy3 sy3 = yy3.a.X;
                if (v2 != null && sy3 != sy3.y) {
                    while (v2.X == sy3 && (v = v2.v()) != null) {
                        v2 = v;
                    }
                    int ordinal = sy3.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            h.s("Intrinsics isn't used by the parent");
                        } else if (v2.D != null) {
                            v2.W(z2);
                        } else {
                            v2.Y(z2);
                        }
                    } else if (v2.D != null) {
                        X(v2, z2, 6);
                    } else {
                        Z(v2, z2, 6);
                    }
                }
            }
        }
    }

    public static void Z(uy3 uy3, boolean z2, int i) {
        boolean z3;
        boolean z4;
        p95 p95;
        uy3 v;
        if ((i & 1) != 0) {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!uy3.L && !uy3.w && (p95 = uy3.J) != null) {
            ((je) p95).w(uy3, false, z2, z3);
            if (z4) {
                yy3 yy3 = uy3.b0.p.B;
                uy3 v2 = yy3.a.v();
                sy3 sy3 = yy3.a.X;
                if (v2 != null && sy3 != sy3.y) {
                    while (v2.X == sy3 && (v = v2.v()) != null) {
                        v2 = v;
                    }
                    int ordinal = sy3.ordinal();
                    if (ordinal == 0) {
                        Z(v2, z2, 6);
                    } else if (ordinal == 1) {
                        v2.Y(z2);
                    } else {
                        h.s("Intrinsics isn't used by the parent");
                    }
                }
            }
        }
    }

    public static void a0(uy3 uy3) {
        int i = ty3.a[uy3.b0.d.ordinal()];
        yy3 yy3 = uy3.b0;
        if (i != 1) {
            rf2.y("Unexpected state ", yy3.d);
        } else if (yy3.e) {
            X(uy3, true, 6);
        } else {
            if (yy3.f) {
                uy3.W(true);
            }
            if (uy3.q()) {
                Z(uy3, true, 6);
            } else if (uy3.p()) {
                uy3.Y(true);
            }
        }
    }

    private final String j(uy3 uy3) {
        String str;
        String g = g(0);
        uy3 uy32 = uy3.I;
        if (uy32 != null) {
            str = uy32.g(0);
        } else {
            str = null;
        }
        return "Cannot insert " + uy3 + " because it already has a parent or an owner. This tree: " + g + " Other tree: " + str;
    }

    public final void A(long j, f03 f03, int i, boolean z2) {
        o00 o00 = this.a0;
        l76 l76 = xz4.m0;
        ((xz4) o00.e).h1(xz4.p0, ((xz4) o00.e).Z0(j), f03, i, z2);
    }

    public final void B(int i, uy3 uy3) {
        if (!(uy3.I == null || uy3.J == null)) {
            yb3.b(j(uy3));
        }
        uy3.I = this;
        hv2 hv2 = this.F;
        ((eq4) hv2.y).a(i, uy3);
        ((kh) hv2.x).b();
        Q();
        if (uy3.w) {
            this.E++;
        }
        I();
        p95 p95 = this.J;
        if (p95 != null) {
            uy3.d(p95);
        }
        if (uy3.b0.l > 0) {
            yy3 yy3 = this.b0;
            yy3.d(yy3.l + 1);
        }
        if (uy3.i0 > 0) {
            e0(this.i0 + 1);
        }
    }

    public final void C(boolean z2) {
        if (z2) {
            uy3 v = v();
            if (v != null) {
                v.D();
            } else {
                p95 p95 = this.J;
                if (p95 != null) {
                    ((je) p95).invalidate();
                }
            }
        }
        ll4 ll4 = (ll4) this.a0.g;
        if ((ll4.z & 2) != 0) {
            while (ll4 != null) {
                if ((ll4.y & 2) != 0) {
                    ll4 ll42 = ll4;
                    eq4 eq4 = null;
                    while (ll42 != null) {
                        if (ll42 instanceof my3) {
                            o95 o95 = rc9.M0((my3) ll42, 2).l0;
                            if (o95 != null) {
                                ((fx2) o95).c();
                            }
                        } else if ((ll42.y & 2) != 0 && (ll42 instanceof wo1)) {
                            int i = 0;
                            for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                if ((ll43.y & 2) != 0) {
                                    i++;
                                    if (i == 1) {
                                        ll42 = ll43;
                                    } else {
                                        if (eq4 == null) {
                                            eq4 = new eq4(new ll4[16]);
                                        }
                                        if (ll42 != null) {
                                            eq4.b(ll42);
                                            ll42 = null;
                                        }
                                        eq4.b(ll43);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        ll42 = rc9.j(eq4);
                    }
                }
                if ((ll4.z & 2) == 0) {
                    break;
                }
                ll4 = ll4.B;
            }
        }
        eq4 z3 = z();
        Object[] objArr = z3.w;
        int i2 = z3.y;
        for (int i3 = 0; i3 < i2; i3++) {
            ((uy3) objArr[i3]).C(false);
        }
    }

    public final void D() {
        o95 o95;
        if (this.e0) {
            o00 o00 = this.a0;
            xz4 xz4 = (hc3) o00.d;
            xz4 xz42 = ((xz4) o00.e).Q;
            this.d0 = null;
            while (true) {
                if (sg3.e(xz4, xz42)) {
                    break;
                }
                if (xz4 != null) {
                    o95 = xz4.l0;
                } else {
                    o95 = null;
                }
                if (o95 != null) {
                    this.d0 = xz4;
                    break;
                } else if (xz4 != null) {
                    xz4 = xz4.Q;
                } else {
                    xz4 = null;
                }
            }
            this.e0 = false;
        }
        xz4 xz43 = this.d0;
        if (xz43 != null && xz43.l0 == null) {
            throw b81.t("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        } else if (xz43 != null) {
            xz43.j1();
        } else {
            uy3 v = v();
            if (v != null) {
                v.D();
                return;
            }
            p95 p95 = this.J;
            if (p95 != null) {
                ((je) p95).invalidate();
            }
        }
    }

    public final void E() {
        o00 o00 = this.a0;
        xz4 xz4 = (xz4) o00.e;
        hc3 hc3 = (hc3) o00.d;
        while (xz4 != hc3) {
            xz4.getClass();
            oy3 oy3 = (oy3) xz4;
            o95 o95 = oy3.l0;
            if (o95 != null) {
                ((fx2) o95).c();
            }
            xz4 = oy3.P;
        }
        o95 o952 = ((hc3) o00.d).l0;
        if (o952 != null) {
            ((fx2) o952).c();
        }
    }

    public final void F() {
        Z(this, false, 7);
        eq4 z2 = z();
        Object[] objArr = z2.w;
        int i = z2.y;
        for (int i2 = 0; i2 < i; i2++) {
            ((uy3) objArr[i2]).F();
        }
    }

    public final void G() {
        if (this.w) {
            uy3 v = v();
            if (v != null) {
                v.G();
            }
        } else if (this.D != null) {
            X(this, false, 7);
        } else {
            Z(this, false, 7);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, h06] */
    public final void H() {
        if (!this.O) {
            if (((tz4) this.a0.c).B == null && this.g0 == null) {
                ak6 ak6 = this.N;
                this.O = true;
                ? obj = new Object();
                obj.w = new ak6();
                r95 snapshotObserver = ((je) xy3.a(this)).getSnapshotObserver();
                ae aeVar = new ae(6, this, obj);
                snapshotObserver.a.e(this, snapshotObserver.d, aeVar);
                this.O = false;
                this.N = (ak6) obj.w;
                this.M = false;
                je jeVar = (je) xy3.a(this);
                jeVar.getSemanticsOwner().b(this, ak6);
                jeVar.y();
                return;
            }
            this.M = true;
        }
    }

    public final void I() {
        uy3 uy3;
        if (this.E > 0) {
            this.H = true;
        }
        if (this.w && (uy3 = this.I) != null) {
            uy3.I();
        }
    }

    public final boolean J() {
        if (this.J != null) {
            return true;
        }
        return false;
    }

    public final boolean K() {
        return this.b0.p.O;
    }

    public final Boolean L() {
        boolean z2;
        jd4 jd4 = this.b0.q;
        if (jd4 == null) {
            return null;
        }
        if (jd4.M != hd4.y) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public final void M() {
        uy3 v;
        if (this.X == sy3.y) {
            f();
        }
        jd4 jd4 = this.b0.q;
        jd4.getClass();
        boolean z2 = true;
        try {
            jd4.C = true;
            if (!jd4.H) {
                yb3.b("replace() called on item that was not placed");
            }
            jd4.X = false;
            if (jd4.M == hd4.y) {
                z2 = false;
            }
            jd4.D0(jd4.K, jd4.L);
            if (z2 && !jd4.X && (v = jd4.B.a.v()) != null) {
                v.W(false);
            }
            jd4.C = false;
        } catch (Throwable th) {
            jd4.C = false;
            throw th;
        }
    }

    public final void N(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i != i2) {
            for (int i6 = 0; i6 < i3; i6++) {
                if (i > i2) {
                    i4 = i + i6;
                } else {
                    i4 = i;
                }
                if (i > i2) {
                    i5 = i2 + i6;
                } else {
                    i5 = (i2 + i3) - 2;
                }
                hv2 hv2 = this.F;
                kh khVar = (kh) hv2.x;
                Object l = ((eq4) hv2.y).l(i4);
                khVar.b();
                ((eq4) hv2.y).a(i5, (uy3) l);
                khVar.b();
            }
            Q();
            I();
            G();
        }
    }

    public final void O(uy3 uy3) {
        if (uy3.b0.l > 0) {
            yy3 yy3 = this.b0;
            yy3.d(yy3.l - 1);
        }
        if (this.J != null) {
            uy3.h();
        }
        uy3.I = null;
        if (uy3.i0 > 0) {
            e0(this.i0 - 1);
        }
        ((xz4) uy3.a0.e).Q = null;
        if (uy3.w) {
            this.E--;
            eq4 eq4 = (eq4) uy3.F.y;
            Object[] objArr = eq4.w;
            int i = eq4.y;
            for (int i2 = 0; i2 < i; i2++) {
                ((xz4) ((uy3) objArr[i2]).a0.e).Q = null;
            }
        }
        I();
        Q();
    }

    public final void P(xz4 xz4) {
        ny5 ny5;
        boolean z2;
        p95 p95 = this.J;
        if (p95 != null) {
            ny5 = ((je) p95).getRectManager();
        } else {
            ny5 = null;
        }
        yy3 yy3 = this.b0;
        if (yy3.d != qy3.A || q() || p()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(this.C == -4 || ny5 == null)) {
            if (xz4 == ((xz4) this.a0.e)) {
                this.B = true;
                if (!z2) {
                    ny5.h(this);
                }
            } else {
                this.A = true;
                eq4 z3 = z();
                Object[] objArr = z3.w;
                int i = z3.y;
                for (int i2 = 0; i2 < i; i2++) {
                    uy3 uy3 = (uy3) objArr[i2];
                    uy3.B = true;
                    if (!z2) {
                        ny5.h(uy3);
                    }
                }
                if (this.C != -4) {
                    ny5.f = true;
                    int e = ny5.e(this);
                    long[] jArr = (long[]) ny5.c.c;
                    int i3 = e + 2;
                    long j = jArr[i3];
                    jArr[i3] = j | (((j >> 63) & 1) << 60);
                }
                ny5.k();
            }
        }
        yy3.p.G0();
    }

    public final void Q() {
        if (this.w) {
            uy3 v = v();
            if (v != null) {
                v.Q();
                return;
            }
            return;
        }
        this.Q = true;
    }

    public final boolean R(k31 k31) {
        if (k31 == null) {
            return false;
        }
        if (this.X == sy3.y) {
            e();
        }
        return this.b0.p.D0(k31.a);
    }

    public final void T() {
        hv2 hv2 = this.F;
        int i = ((eq4) hv2.y).y;
        while (true) {
            i--;
            eq4 eq4 = (eq4) hv2.y;
            if (-1 < i) {
                O((uy3) eq4.w[i]);
            } else {
                eq4.g();
                ((kh) hv2.x).b();
                return;
            }
        }
    }

    public final void U(int i, int i2) {
        if (i2 < 0) {
            yb3.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i <= i3) {
            while (true) {
                hv2 hv2 = this.F;
                O((uy3) ((eq4) hv2.y).w[i3]);
                Object l = ((eq4) hv2.y).l(i3);
                ((kh) hv2.x).b();
                uy3 uy3 = (uy3) l;
                if (i3 != i) {
                    i3--;
                } else {
                    return;
                }
            }
        }
    }

    public final void V() {
        uy3 v;
        if (this.X == sy3.y) {
            f();
        }
        kh4 kh4 = this.b0.p;
        yy3 yy3 = kh4.B;
        try {
            kh4.C = true;
            if (!kh4.G) {
                yb3.b("replace called on unplaced item");
            }
            boolean z2 = kh4.O;
            kh4.B0(kh4.J, kh4.L, kh4.K);
            if (z2 && !kh4.b0 && (v = yy3.a.v()) != null) {
                v.Y(false);
            }
            kh4.C = false;
        } catch (Throwable th) {
            kh4.C = false;
            throw th;
        }
    }

    public final void W(boolean z2) {
        p95 p95;
        if (!this.w && (p95 = this.J) != null) {
            ((je) p95).x(this, true, z2);
        }
    }

    public final void Y(boolean z2) {
        p95 p95;
        if (!this.w && (p95 = this.J) != null) {
            ((je) p95).x(this, false, z2);
        }
    }

    public final void a() {
        iz3 iz3 = this.c0;
        if (iz3 != null) {
            iz3.a();
        }
        o00 o00 = this.a0;
        xz4 xz4 = (xz4) o00.e;
        xz4 xz42 = ((hc3) o00.d).P;
        while (!sg3.e(xz4, xz42) && xz4 != null) {
            xz4.o1();
            xz4 = xz4.P;
        }
    }

    public final void b() {
        md autofillManager;
        iz3 iz3 = this.c0;
        if (iz3 != null) {
            iz3.i(true);
        }
        this.j0 = true;
        ll4 ll4 = (ib7) this.a0.f;
        for (ll4 ll42 = ll4; ll42 != null; ll42 = ll42.A) {
            if (ll42.J) {
                ll42.Q0();
            }
        }
        for (ll4 ll43 = ll4; ll43 != null; ll43 = ll43.A) {
            if (ll43.J) {
                ll43.S0();
            }
        }
        while (ll4 != null) {
            if (ll4.J) {
                ll4.M0();
            }
            ll4 = ll4.A;
        }
        if (J()) {
            this.N = null;
            this.M = false;
        }
        p95 p95 = this.J;
        if (p95 != null) {
            je jeVar = (je) p95;
            if (je.d() && (autofillManager = jeVar.getAutofillManager()) != null && autofillManager.D.f(this.x)) {
                autofillManager.w.B(autofillManager.y, this.x, false);
            }
        }
    }

    public final void b0() {
        eq4 z2 = z();
        Object[] objArr = z2.w;
        int i = z2.y;
        for (int i2 = 0; i2 < i; i2++) {
            uy3 uy3 = (uy3) objArr[i2];
            sy3 sy3 = uy3.Y;
            uy3.X = sy3;
            if (sy3 != sy3.y) {
                uy3.b0();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: ll4} */
    /* JADX WARNING: type inference failed for: r7v1, types: [xz4, ll4] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01a3  */
    public final void c(ml4 ml4) {
        int i;
        ? r7;
        boolean z2;
        ll4 ll4;
        eq4 eq4;
        eq4 eq42;
        o00 o00;
        ll4 ll42;
        boolean f;
        boolean z3;
        hc3 hc3;
        o00 o002;
        boolean z4;
        boolean z5;
        pb pbVar;
        ml4 ml42 = ml4;
        o00 o003 = this.a0;
        boolean f2 = o003.f(16);
        ll4 ll43 = (ib7) o003.f;
        boolean f3 = o003.f(1024);
        this.f0 = ml42;
        hc3 hc32 = (hc3) o003.d;
        uy3 uy3 = (uy3) o003.b;
        ll4 ll44 = (ll4) o003.g;
        ll4 ll45 = (tz4) o003.c;
        if (ll44 == ll45) {
            yb3.b("padChain called on already padded chain");
        }
        ll4 ll46 = (ll4) o003.g;
        ll46.A = ll45;
        ll45.B = ll46;
        eq4 eq43 = (eq4) o003.h;
        if (eq43 != null) {
            i = eq43.y;
        } else {
            i = 0;
        }
        eq4 eq44 = (eq4) o003.i;
        if (eq44 == null) {
            eq44 = new eq4(new kl4[16]);
        }
        eq4 eq45 = (eq4) o003.j;
        eq45.b(ml42);
        pb pbVar2 = null;
        while (true) {
            int i2 = eq45.y;
            if (i2 == 0) {
                break;
            }
            ml4 ml43 = (ml4) eq45.l(i2 - 1);
            if (ml43 instanceof mu0) {
                mu0 mu0 = (mu0) ml43;
                eq45.b(mu0.x);
                eq45.b(mu0.w);
            } else if (ml43 instanceof kl4) {
                eq44.b(ml43);
            } else {
                if (pbVar2 == null) {
                    pbVar = new pb(17, eq44);
                    pbVar2 = pbVar;
                } else {
                    pbVar = pbVar2;
                }
                ml43.b(pbVar);
            }
        }
        int i3 = eq44.y;
        if (i3 == i) {
            ll4 ll47 = ll45.B;
            o00 o004 = o003;
            int i4 = 0;
            while (true) {
                if (ll47 == null || i4 >= i) {
                    o002 = o004;
                } else if (eq43 != null) {
                    kl4 kl4 = (kl4) eq43.w[i4];
                    kl4 kl42 = (kl4) eq44.w[i4];
                    if (sg3.e(kl4, kl42)) {
                        o002 = o004;
                        z5 = true;
                    } else {
                        o002 = o004;
                        if (kl4.getClass() == kl42.getClass()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    }
                    if (!z5) {
                        ll47 = ll47.A;
                        break;
                    }
                    if (z5) {
                        o00.j(kl4, kl42, ll47);
                    }
                    ll47 = ll47.B;
                    i4++;
                    o004 = o002;
                } else {
                    throw b81.t("expected prior modifier list to be non-empty");
                }
            }
            o002 = o004;
            if (i4 >= i) {
                o003 = o002;
                r7 = 0;
                o00 = o003;
                eq42 = eq43;
                ll4 = ll45;
                eq4 = eq44;
                z2 = false;
                r7 = r7;
                o00.h = eq4;
                if (eq42 == null) {
                    eq42.g();
                } else {
                    eq42 = r7;
                }
                o00.i = eq42;
                ll42 = ll4.B;
                if (ll42 != null) {
                    ll43 = ll42;
                }
                ll43.A = r7;
                ll4.B = r7;
                ll4.z = -1;
                ll4.D = r7;
                if (ll43 == ll4) {
                    yb3.b("trimChain did not update the head");
                }
                o00.g = ll43;
                if (z2) {
                    o00.i();
                }
                f = o00.f(16);
                boolean f4 = o00.f(1024);
                this.b0.j();
                if (this.D == null && o00.f(512)) {
                    f0(this);
                }
                if (f2 == f || f3 != f4) {
                    ny5 rectManager = ((je) xy3.a(this)).getRectManager();
                    rectManager.getClass();
                    if (J() && this.C != -4) {
                        ig igVar = rectManager.c;
                        int e = rectManager.e(this);
                        long[] jArr = (long[]) igVar.c;
                        int i5 = e + 2;
                        jArr[i5] = (jArr[i5] & -6917529027641081857L) | ((f4 ? 1 : 0) * 2305843009213693952L) | ((f ? 1 : 0) * 4611686018427387904L);
                        return;
                    }
                    return;
                }
                return;
            } else if (eq43 == null) {
                throw b81.t("expected prior modifier list to be non-empty");
            } else if (ll47 != null) {
                if (uy3.g0 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                eq42 = eq43;
                eq4 = eq44;
                r7 = 0;
                ll4 ll48 = ll47;
                o00 = o002;
                o00.h(i4, eq42, eq4, ll48, !z4);
                eq4 eq46 = eq42;
                ll4 = ll45;
            } else {
                throw b81.t("structuralUpdate requires a non-null tail");
            }
        } else {
            r7 = 0;
            ml4 ml44 = uy3.g0;
            if (ml44 != null && i == 0) {
                ll4 ll49 = ll45;
                for (int i6 = 0; i6 < eq44.y; i6++) {
                    ll49 = o00.d((kl4) eq44.w[i6], ll49);
                }
                ll4 ll410 = ll43.A;
                int i7 = 0;
                while (ll410 != null && ll410 != ll45) {
                    i7 |= ll410.y;
                    ll410.z = i7;
                    ll410 = ll410.A;
                }
                o00 = o003;
                eq42 = eq43;
                ll4 = ll45;
                eq4 = eq44;
            } else if (i3 != 0) {
                if (eq43 == null) {
                    eq43 = new eq4(new kl4[16]);
                }
                eq42 = eq43;
                if (ml44 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                o00 = o003;
                ll4 = ll45;
                eq4 = eq44;
                o00.h(0, eq42, eq4, ll4, !z3);
                z2 = true;
                o00.h = eq4;
                if (eq42 == null) {
                }
                o00.i = eq42;
                ll42 = ll4.B;
                if (ll42 != null) {
                }
                ll43.A = r7;
                ll4.B = r7;
                ll4.z = -1;
                ll4.D = r7;
                if (ll43 == ll4) {
                }
                o00.g = ll43;
                if (z2) {
                }
                f = o00.f(16);
                boolean f42 = o00.f(1024);
                this.b0.j();
                f0(this);
                if (f2 == f) {
                }
                ny5 rectManager2 = ((je) xy3.a(this)).getRectManager();
                rectManager2.getClass();
                if (J() || this.C != -4) {
                }
            } else if (eq43 != null) {
                ll4 ll411 = ll45.B;
                int i8 = 0;
                while (ll411 != null && i8 < eq43.y) {
                    ll411 = o00.e(ll411).B;
                    i8++;
                }
                uy3 v = uy3.v();
                if (v != null) {
                    hc3 = (hc3) v.a0.d;
                } else {
                    hc3 = null;
                }
                hc32.Q = hc3;
                o003.e = hc32;
                o00 = o003;
                eq42 = eq43;
                ll4 = ll45;
                eq4 = eq44;
                z2 = false;
                r7 = r7;
                o00.h = eq4;
                if (eq42 == null) {
                }
                o00.i = eq42;
                ll42 = ll4.B;
                if (ll42 != null) {
                }
                ll43.A = r7;
                ll4.B = r7;
                ll4.z = -1;
                ll4.D = r7;
                if (ll43 == ll4) {
                }
                o00.g = ll43;
                if (z2) {
                }
                f = o00.f(16);
                boolean f422 = o00.f(1024);
                this.b0.j();
                f0(this);
                if (f2 == f) {
                }
                ny5 rectManager22 = ((je) xy3.a(this)).getRectManager();
                rectManager22.getClass();
                if (J() || this.C != -4) {
                }
            } else {
                throw b81.t("expected prior modifier list to be non-empty");
            }
        }
        z2 = true;
        r7 = r7;
        o00.h = eq4;
        if (eq42 == null) {
        }
        o00.i = eq42;
        ll42 = ll4.B;
        if (ll42 != null) {
        }
        ll43.A = r7;
        ll4.B = r7;
        ll4.z = -1;
        ll4.D = r7;
        if (ll43 == ll4) {
        }
        o00.g = ll43;
        if (z2) {
        }
        f = o00.f(16);
        boolean f4222 = o00.f(1024);
        this.b0.j();
        f0(this);
        if (f2 == f) {
        }
        ny5 rectManager222 = ((je) xy3.a(this)).getRectManager();
        rectManager222.getClass();
        if (J() || this.C != -4) {
        }
    }

    public final void c0(Throwable th) {
        ty0 ty0 = this.W;
        t37 t37 = oy0.a;
        vf5 vf5 = (vf5) ty0;
        vf5.getClass();
        ny0 ny0 = (ny0) rc9.G0(vf5, t37);
        if (ny0 != null) {
            tf4.S(th, new f5(13, ny0, this));
        }
        throw th;
    }

    public final void d(p95 p95) {
        hc3 hc3;
        int i;
        uy3 uy3;
        md autofillManager;
        ak6 x2;
        p95 p952;
        String str;
        if (this.J != null) {
            yb3.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        uy3 uy32 = this.I;
        if (uy32 != null && !sg3.e(uy32.J, p95)) {
            uy3 v = v();
            if (v != null) {
                p952 = v.J;
            } else {
                p952 = null;
            }
            String g = g(0);
            uy3 uy33 = this.I;
            if (uy33 != null) {
                str = uy33.g(0);
            } else {
                str = null;
            }
            yb3.b("Attaching to a different owner(" + p95 + ") than the parent's owner(" + p952 + "). This tree: " + g + " Parent tree: " + str);
        }
        uy3 v2 = v();
        yy3 yy3 = this.b0;
        if (v2 == null) {
            yy3.p.O = true;
            ((je) p95).getRectManager().h(this);
            jd4 jd4 = yy3.q;
            if (jd4 != null) {
                jd4.M = hd4.w;
            }
        }
        o00 o00 = this.a0;
        xz4 xz4 = (xz4) o00.e;
        if (v2 != null) {
            hc3 = (hc3) v2.a0.d;
        } else {
            hc3 = null;
        }
        xz4.Q = hc3;
        this.J = p95;
        if (v2 != null) {
            i = v2.K;
        } else {
            i = -1;
        }
        this.K = i + 1;
        ml4 ml4 = this.g0;
        if (ml4 != null) {
            c(ml4);
        }
        this.g0 = null;
        ((je) p95).getLayoutNodes().i(this.x, this);
        uy3 uy34 = this.I;
        if (uy34 == null || (uy3 = uy34.D) == null) {
            uy3 = this.D;
        }
        f0(uy3);
        if (this.D == null && o00.f(512)) {
            f0(this);
        }
        if (!this.j0) {
            for (ll4 ll4 = (ll4) o00.g; ll4 != null; ll4 = ll4.B) {
                ll4.L0();
            }
        }
        eq4 eq4 = (eq4) this.F.y;
        Object[] objArr = eq4.w;
        int i2 = eq4.y;
        for (int i3 = 0; i3 < i2; i3++) {
            ((uy3) objArr[i3]).d(p95);
        }
        if (!this.j0) {
            o00.g();
        }
        G();
        if (v2 != null) {
            v2.G();
        }
        yy3.j();
        if (!this.j0 && o00.f(8)) {
            H();
        }
        je jeVar = (je) p95;
        if (je.d() && (autofillManager = jeVar.getAutofillManager()) != null && (x2 = x()) != null && x2.w.b(jk6.r)) {
            autofillManager.D.a(this.x);
            autofillManager.w.B(autofillManager.y, this.x, true);
        }
    }

    public final void d0(tp1 tp1) {
        if (!sg3.e(this.T, tp1)) {
            this.T = tp1;
            G();
            uy3 v = v();
            if (v != null) {
                v.D();
            } else {
                p95 p95 = this.J;
                if (p95 != null) {
                    ((je) p95).invalidate();
                }
            }
            E();
            for (ll4 ll4 = (ll4) this.a0.g; ll4 != null; ll4 = ll4.B) {
                ll4.d();
            }
        }
    }

    public final void e() {
        this.Y = this.X;
        sy3 sy3 = sy3.y;
        this.X = sy3;
        eq4 z2 = z();
        Object[] objArr = z2.w;
        int i = z2.y;
        for (int i2 = 0; i2 < i; i2++) {
            uy3 uy3 = (uy3) objArr[i2];
            if (uy3.X != sy3) {
                uy3.e();
            }
        }
    }

    public final void e0(int i) {
        uy3 v;
        uy3 v2;
        int i2 = this.i0;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (v2 = v()) != null) {
                v2.e0(v2.i0 + 1);
            }
            if (i == 0 && this.i0 > 0 && (v = v()) != null) {
                v.e0(v.i0 - 1);
            }
            this.i0 = i;
        }
    }

    public final void f() {
        this.Y = this.X;
        this.X = sy3.y;
        eq4 z2 = z();
        Object[] objArr = z2.w;
        int i = z2.y;
        for (int i2 = 0; i2 < i; i2++) {
            uy3 uy3 = (uy3) objArr[i2];
            if (uy3.X == sy3.x) {
                uy3.f();
            }
        }
    }

    public final void f0(uy3 uy3) {
        if (!sg3.e(uy3, this.D)) {
            this.D = uy3;
            yy3 yy3 = this.b0;
            if (uy3 != null) {
                if (yy3.q == null) {
                    yy3.q = new jd4(yy3);
                }
                o00 o00 = this.a0;
                xz4 xz4 = (xz4) o00.e;
                xz4 xz42 = ((hc3) o00.d).P;
                while (!sg3.e(xz4, xz42) && xz4 != null) {
                    xz4.X0();
                    xz4 = xz4.P;
                }
            } else {
                yy3.q = null;
                yy3.f = false;
                yy3.e = false;
            }
            G();
        }
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append(10);
        eq4 z2 = z();
        Object[] objArr = z2.w;
        int i3 = z2.y;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((uy3) objArr[i4]).g(i + 1));
        }
        String sb2 = sb.toString();
        if (i == 0) {
            return sb2.substring(0, sb2.length() - 1);
        }
        return sb2;
    }

    public final void g0(lh4 lh4) {
        if (!sg3.e(this.R, lh4)) {
            this.R = lh4;
            hv2 hv2 = this.S;
            if (hv2 != null) {
                ((ed5) hv2.x).setValue(lh4);
            }
            G();
        }
    }

    public final void h() {
        md autofillManager;
        vy3 vy3;
        p95 p95 = this.J;
        String str = null;
        if (p95 == null) {
            uy3 v = v();
            if (v != null) {
                str = v.g(0);
            }
            yb3.c("Cannot detach node that is already detached!  Tree: " + str);
            ta1.e();
            return;
        }
        uy3 v2 = v();
        yy3 yy3 = this.b0;
        if (v2 != null) {
            v2.D();
            v2.G();
            kh4 kh4 = yy3.p;
            sy3 sy3 = sy3.y;
            kh4.H = sy3;
            jd4 jd4 = yy3.q;
            if (jd4 != null) {
                jd4.F = sy3;
            }
        }
        vy3 vy32 = yy3.p.T;
        vy32.b = true;
        vy32.c = false;
        vy32.e = false;
        vy32.d = false;
        vy32.f = false;
        vy32.g = false;
        vy32.h = null;
        jd4 jd42 = yy3.q;
        if (!(jd42 == null || (vy3 = jd42.N) == null)) {
            vy3.b = true;
            vy3.c = false;
            vy3.e = false;
            vy3.d = false;
            vy3.f = false;
            vy3.g = false;
            vy3.h = null;
        }
        o00 o00 = this.a0;
        xz4 xz4 = (xz4) o00.e;
        ll4 ll4 = (ib7) o00.f;
        xz4 xz42 = ((hc3) o00.d).P;
        while (!sg3.e(xz4, xz42) && xz4 != null) {
            xz4.u1();
            if (xz4.O.K()) {
                xz4.p1();
            }
            xz4 = xz4.P;
        }
        for (ll4 ll42 = ll4; ll42 != null; ll42 = ll42.A) {
            if (ll42.J) {
                ll42.S0();
            }
        }
        this.L = true;
        eq4 eq4 = (eq4) this.F.y;
        Object[] objArr = eq4.w;
        int i = eq4.y;
        for (int i2 = 0; i2 < i; i2++) {
            ((uy3) objArr[i2]).h();
        }
        this.L = false;
        while (ll4 != null) {
            if (ll4.J) {
                ll4.M0();
            }
            ll4 = ll4.A;
        }
        je jeVar = (je) p95;
        jeVar.getLayoutNodes().g(this.x);
        ih4 ih4 = jeVar.m0;
        wr0 wr0 = ih4.b;
        ((ji8) wr0.x).C(this);
        ((ji8) wr0.y).C(this);
        ((ji8) wr0.z).C(this);
        ((eq4) ih4.e.y).k(this);
        jeVar.h0 = true;
        if (je.d() && (autofillManager = jeVar.getAutofillManager()) != null && autofillManager.D.f(this.x)) {
            autofillManager.w.B(autofillManager.y, this.x, false);
        }
        jeVar.getRectManager().i(this);
        this.J = null;
        f0((uy3) null);
        this.K = 0;
        kh4 kh42 = yy3.p;
        kh42.E = Integer.MAX_VALUE;
        kh42.D = Integer.MAX_VALUE;
        kh42.O = false;
        jd4 jd43 = yy3.q;
        if (jd43 != null) {
            jd43.E = Integer.MAX_VALUE;
            jd43.D = Integer.MAX_VALUE;
            jd43.M = hd4.y;
        }
        if (o00.f(8)) {
            ak6 ak6 = this.N;
            this.N = null;
            this.M = false;
            jeVar.getSemanticsOwner().b(this, ak6);
            jeVar.y();
        }
    }

    public final void h0(ml4 ml4) {
        if (this.w && this.f0 != jl4.w) {
            yb3.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.j0) {
            yb3.a("modifier is updated when deactivated");
        }
        if (J()) {
            c(ml4);
            if (this.M) {
                H();
                return;
            }
            return;
        }
        this.g0 = ml4;
    }

    public final void i(qk0 qk0, cx2 cx2) {
        try {
            ((xz4) this.a0.e).V0(qk0, cx2);
        } catch (Throwable th) {
            c0(th);
            throw null;
        }
    }

    public final void i0(g58 g58) {
        if (!sg3.e(this.V, g58)) {
            this.V = g58;
            ll4 ll4 = (ll4) this.a0.g;
            if ((ll4.z & 16) != 0) {
                while (ll4 != null) {
                    if ((ll4.y & 16) != 0) {
                        ll4 ll42 = ll4;
                        eq4 eq4 = null;
                        while (ll42 != null) {
                            if (ll42 instanceof tk5) {
                                ((tk5) ll42).B0();
                            } else if ((ll42.y & 16) != 0 && (ll42 instanceof wo1)) {
                                int i = 0;
                                for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                    if ((ll43.y & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            ll42 = ll43;
                                        } else {
                                            if (eq4 == null) {
                                                eq4 = new eq4(new ll4[16]);
                                            }
                                            if (ll42 != null) {
                                                eq4.b(ll42);
                                                ll42 = null;
                                            }
                                            eq4.b(ll43);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            ll42 = rc9.j(eq4);
                        }
                    }
                    if ((ll4.z & 16) != 0) {
                        ll4 = ll4.B;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void j0() {
        if (this.E > 0 && this.H) {
            this.H = false;
            eq4 eq4 = this.G;
            if (eq4 == null) {
                eq4 = new eq4(new uy3[16]);
                this.G = eq4;
            }
            eq4.g();
            eq4 eq42 = (eq4) this.F.y;
            Object[] objArr = eq42.w;
            int i = eq42.y;
            for (int i2 = 0; i2 < i; i2++) {
                uy3 uy3 = (uy3) objArr[i2];
                if (uy3.w) {
                    eq4.c(eq4.y, uy3.z());
                } else {
                    eq4.b(uy3);
                }
            }
            yy3 yy3 = this.b0;
            yy3.p.V = true;
            jd4 jd4 = yy3.q;
            if (jd4 != null) {
                jd4.P = true;
            }
        }
    }

    public final void k() {
        k31 k31;
        if (this.D != null) {
            X(this, false, 5);
        } else {
            Z(this, false, 5);
        }
        kh4 kh4 = this.b0.p;
        if (kh4.F) {
            k31 = new k31(kh4.z);
        } else {
            k31 = null;
        }
        p95 p95 = this.J;
        if (k31 != null) {
            if (p95 != null) {
                ((je) p95).s(this, k31.a);
            }
        } else if (p95 != null) {
            ((je) p95).r(true);
        }
    }

    public final List l() {
        jd4 jd4 = this.b0.q;
        jd4.getClass();
        eq4 eq4 = jd4.O;
        yy3 yy3 = jd4.B;
        yy3.a.n();
        if (!jd4.P) {
            return eq4.f();
        }
        uy3 uy3 = yy3.a;
        eq4 z2 = uy3.z();
        Object[] objArr = z2.w;
        int i = z2.y;
        for (int i2 = 0; i2 < i; i2++) {
            uy3 uy32 = (uy3) objArr[i2];
            if (eq4.y <= i2) {
                jd4 jd42 = uy32.b0.q;
                jd42.getClass();
                eq4.b(jd42);
            } else {
                jd4 jd43 = uy32.b0.q;
                jd43.getClass();
                Object[] objArr2 = eq4.w;
                Object obj = objArr2[i2];
                objArr2[i2] = jd43;
            }
        }
        eq4.m(((eq4) ((jp4) uy3.n()).x).y, eq4.y);
        jd4.P = false;
        return eq4.f();
    }

    public final List m() {
        return this.b0.p.n0();
    }

    public final List n() {
        return z().f();
    }

    public final List o() {
        return ((eq4) this.F.y).f();
    }

    public final boolean p() {
        return this.b0.p.R;
    }

    public final boolean q() {
        return this.b0.p.Q;
    }

    public final boolean r() {
        return J();
    }

    public final sy3 s() {
        return this.b0.p.H;
    }

    public final sy3 t() {
        sy3 sy3;
        jd4 jd4 = this.b0.q;
        if (jd4 == null || (sy3 = jd4.F) == null) {
            return sy3.y;
        }
        return sy3;
    }

    public final String toString() {
        String F2 = hj8.F(this);
        int i = ((eq4) ((jp4) n()).x).y;
        lh4 lh4 = this.R;
        boolean z2 = this.j0;
        boolean K2 = K();
        return F2 + " children: " + i + " measurePolicy: " + lh4 + " deactivated: " + z2 + " isVirtual: " + this.w + " isPlaced: " + K2;
    }

    public final hv2 u() {
        hv2 hv2 = this.S;
        if (hv2 != null) {
            return hv2;
        }
        hv2 hv22 = new hv2(this, this.R);
        this.S = hv22;
        return hv22;
    }

    public final uy3 v() {
        uy3 uy3 = this.I;
        while (uy3 != null && uy3.w) {
            uy3 = uy3.I;
        }
        return uy3;
    }

    public final int w() {
        return this.b0.p.E;
    }

    public final ak6 x() {
        if (!J() || this.j0 || !this.a0.f(8)) {
            return null;
        }
        return this.N;
    }

    public final eq4 y() {
        boolean z2 = this.Q;
        eq4 eq4 = this.P;
        if (z2) {
            eq4.g();
            eq4.c(eq4.y, z());
            Arrays.sort(eq4.w, 0, eq4.y, m0);
            this.Q = false;
        }
        return eq4;
    }

    public final eq4 z() {
        j0();
        if (this.E == 0) {
            return (eq4) this.F.y;
        }
        eq4 eq4 = this.G;
        eq4.getClass();
        return eq4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public uy3(int i) {
        this((i & 1) == 0, ck6.a.addAndGet(1));
    }
}
