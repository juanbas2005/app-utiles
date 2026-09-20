package defpackage;

/* renamed from: wy3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wy3 implements hz1 {
    public final tk0 w = new tk0();
    public gz1 x;

    public final long A0(long j) {
        return this.w.A0(j);
    }

    public final void C(long j, long j2, long j3, float f, int i) {
        this.w.C(j, j2, j3, f, i);
    }

    public final float C0(long j) {
        return this.w.C0(j);
    }

    public final void E0(long j, long j2, long j3, float f, int i) {
        this.w.E0(j, j2, j3, f, i);
    }

    public final void H0(kc0 kc0, long j, long j2, float f, iz1 iz1, lt0 lt0, int i) {
        this.w.H0(kc0, j, j2, f, iz1, lt0, i);
    }

    public final void I0(l97 l97, float f, long j, long j2, float f2, l57 l57) {
        this.w.I0(l97, f, j, j2, f2, l57);
    }

    public final void K(long j, float f, long j2, iz1 iz1) {
        this.w.K(j, f, j2, iz1);
    }

    public final long L(float f) {
        return this.w.L(f);
    }

    public final float P(int i) {
        return this.w.P(i);
    }

    public final float S(float f) {
        return f / this.w.b();
    }

    public final float Y() {
        return this.w.Y();
    }

    public final void a() {
        tk0 tk0 = this.w;
        qk0 D = tk0.x.D();
        gz1 gz1 = this.x;
        if (gz1 != null) {
            ll4 ll4 = (ll4) gz1;
            wo1 wo1 = ll4.w.B;
            if (wo1 != null && (wo1.z & 4) != 0) {
                while (true) {
                    if (wo1 == null) {
                        break;
                    }
                    int i = wo1.y;
                    if ((i & 2) != 0) {
                        break;
                    } else if ((i & 4) != 0) {
                        break;
                    } else {
                        wo1 = wo1.B;
                    }
                }
            }
            wo1 = null;
            if (wo1 != null) {
                eq4 eq4 = null;
                while (wo1 != null) {
                    if (wo1 instanceof gz1) {
                        gz1 gz12 = (gz1) wo1;
                        xz4 M0 = rc9.M0(gz12, 4);
                        long O = pv8.O(M0.y);
                        uy3 uy3 = M0.O;
                        uy3.getClass();
                        ((je) xy3.a(uy3)).getSharedDrawScope().c(D, O, M0, gz12, (cx2) tk0.x.y);
                    } else if ((wo1.y & 4) != 0 && (wo1 instanceof wo1)) {
                        int i2 = 0;
                        for (ll4 ll42 = wo1.L; ll42 != null; ll42 = ll42.B) {
                            if ((ll42.y & 4) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    wo1 = ll42;
                                } else {
                                    if (eq4 == null) {
                                        eq4 = new eq4(new ll4[16]);
                                    }
                                    if (wo1 != null) {
                                        eq4.b(wo1);
                                        wo1 = null;
                                    }
                                    eq4.b(ll42);
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                    wo1 = rc9.j(eq4);
                }
                return;
            }
            xz4 M02 = rc9.M0(gz1, 4);
            if (M02.c1() == ll4.w) {
                M02 = M02.P;
                M02.getClass();
            }
            M02.r1(D, (cx2) tk0.x.y);
            return;
        }
        throw b81.t("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
    }

    public final float b() {
        return this.w.b();
    }

    /* JADX INFO: finally extract failed */
    public final void c(qk0 qk0, long j, xz4 xz4, gz1 gz1, cx2 cx2) {
        gz1 gz12 = this.x;
        this.x = gz1;
        ey3 ey3 = xz4.O.U;
        tk0 tk0 = this.w;
        tp1 H = tk0.x.H();
        wr0 wr0 = tk0.x;
        ey3 J = wr0.J();
        qk0 D = wr0.D();
        long L = wr0.L();
        cx2 cx22 = (cx2) wr0.y;
        wr0.c0(xz4);
        wr0.d0(ey3);
        wr0.b0(qk0);
        wr0.e0(j);
        wr0.y = cx2;
        qk0.h();
        try {
            gz1.p0(this);
            qk0.p();
            wr0.c0(H);
            wr0.d0(J);
            wr0.b0(D);
            wr0.e0(L);
            wr0.y = cx22;
            this.x = gz12;
        } catch (Throwable th) {
            qk0.p();
            wr0.c0(H);
            wr0.d0(J);
            wr0.b0(D);
            wr0.e0(L);
            wr0.y = cx22;
            throw th;
        }
    }

    public final void c0(long j, long j2, long j3, long j4, iz1 iz1) {
        this.w.c0(j, j2, j3, j4, iz1);
    }

    public final long e() {
        return this.w.e();
    }

    public final float e0(float f) {
        return this.w.b() * f;
    }

    public final ey3 getLayoutDirection() {
        return this.w.w.b;
    }

    public final void i(long j, float f, float f2, long j2, long j3, l57 l57) {
        this.w.i(j, f, f2, j2, j3, l57);
    }

    public final wr0 j0() {
        return this.w.x;
    }

    public final int l0(long j) {
        return this.w.l0(j);
    }

    public final long o(float f) {
        return this.w.o(f);
    }

    public final void o0(cx2 cx2, long j, vr2 vr2) {
        cx2 cx22 = cx2;
        long j2 = j;
        cx22.e(this, getLayoutDirection(), j2, new zj(this, this.x, vr2, 3));
    }

    public final long p(long j) {
        return this.w.p(j);
    }

    public final int r0(float f) {
        return this.w.r0(f);
    }

    public final void s(eh ehVar, kc0 kc0, float f, iz1 iz1, lt0 lt0, int i) {
        this.w.s(ehVar, kc0, f, iz1, lt0, i);
    }

    public final void t0(hg hgVar, long j, long j2, long j3, float f, lt0 lt0, int i) {
        this.w.t0(hgVar, j, j2, j3, f, lt0, i);
    }

    public final long v0() {
        return this.w.v0();
    }

    public final void w0(eh ehVar, long j, iz1 iz1) {
        this.w.w0(ehVar, j, iz1);
    }

    public final float z(long j) {
        return this.w.z(j);
    }

    public final void z0(kc0 kc0, long j, long j2, long j3, float f, iz1 iz1, lt0 lt0, int i) {
        this.w.z0(kc0, j, j2, j3, f, iz1, lt0, i);
    }
}
