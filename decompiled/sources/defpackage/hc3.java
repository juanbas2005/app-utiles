package defpackage;

/* renamed from: hc3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hc3 extends xz4 {
    public static final kb9 t0;
    public final ib7 r0;
    public gc3 s0;

    static {
        kb9 b = dh4.b();
        int i = jt0.h;
        b.k(jt0.d);
        b.q(1.0f);
        b.r(1);
        t0 = b;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, ib7] */
    /* JADX WARNING: type inference failed for: r3v4, types: [fd4] */
    /* JADX WARNING: Multi-variable type inference failed */
    public hc3(uy3 uy3) {
        super(uy3);
        gc3 gc3;
        ? ll4 = new ll4();
        ll4.z = 0;
        this.r0 = ll4;
        ll4.D = this;
        if (uy3.D != null) {
            gc3 = new fd4(this);
        } else {
            gc3 = null;
        }
        this.s0 = gc3;
    }

    public final int W(int i) {
        hv2 u = this.O.u();
        lh4 O0 = u.O0();
        uy3 uy3 = (uy3) u.y;
        return O0.e((xz4) uy3.a0.e, uy3.m(), i);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [gc3, fd4] */
    public final void X0() {
        if (this.s0 == null) {
            this.s0 = new fd4(this);
        }
    }

    public final fd4 a1() {
        return this.s0;
    }

    public final int c(int i) {
        hv2 u = this.O.u();
        lh4 O0 = u.O0();
        uy3 uy3 = (uy3) u.y;
        return O0.d((xz4) uy3.a0.e, uy3.m(), i);
    }

    public final ll4 c1() {
        return this.r0;
    }

    public final void h0(long j, float f, vr2 vr2) {
        s1(j, f, vr2);
        if (!this.J) {
            this.O.b0.p.x0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    public final void i1(vz4 vz4, long j, f03 f03, int i, boolean z) {
        boolean z2;
        int i2;
        uy3 uy3 = this.O;
        boolean z3 = false;
        if (vz4.g(uy3)) {
            if (D1(j)) {
                i2 = i;
                z2 = z;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(U0(j, b1())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
            }
            z3 = true;
            if (!z3) {
                int i3 = f03.y;
                eq4 y = uy3.y();
                Object[] objArr = y.w;
                int i4 = y.y - 1;
                while (i4 >= 0) {
                    uy3 uy32 = (uy3) objArr[i4];
                    if (uy32.K()) {
                        vz4.e(uy32, j, f03, i2, z2);
                        long f = f03.f();
                        if (hj8.v(f) < 0.0f && hj8.C(f) && !hj8.B(f) && !vz4.f(f03, uy32)) {
                            break;
                        }
                    }
                    i4--;
                    i2 = i;
                }
                f03.y = i3;
                return;
            }
            return;
        }
        i2 = i;
        z2 = z;
        if (!z3) {
        }
    }

    public final int l(int i) {
        hv2 u = this.O.u();
        lh4 O0 = u.O0();
        uy3 uy3 = (uy3) u.y;
        return O0.c((xz4) uy3.a0.e, uy3.m(), i);
    }

    public final int p0(kb kbVar) {
        gc3 gc3 = this.s0;
        if (gc3 != null) {
            return gc3.p0(kbVar);
        }
        kh4 kh4 = this.O.b0.p;
        vy3 vy3 = kh4.T;
        if (!kh4.I) {
            if (kh4.B.d == qy3.w) {
                vy3.f = true;
                if (vy3.b) {
                    kh4.R = true;
                    kh4.S = true;
                }
            } else {
                vy3.g = true;
            }
        }
        hc3 f = kh4.f();
        boolean z = f.K;
        f.K = true;
        kh4.J();
        f.K = z;
        Integer num = (Integer) vy3.i.get(kbVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public final void r1(qk0 qk0, cx2 cx2) {
        uy3 uy3 = this.O;
        p95 a = xy3.a(uy3);
        eq4 y = uy3.y();
        Object[] objArr = y.w;
        int i = y.y;
        for (int i2 = 0; i2 < i; i2++) {
            uy3 uy32 = (uy3) objArr[i2];
            if (uy32.K()) {
                uy32.i(qk0, cx2);
            }
        }
        if (((je) a).getShowLayoutBounds()) {
            long j = this.y;
            qk0.a(0.5f, 0.5f, ((float) ((int) (j >> 32))) - 0.5f, ((float) ((int) (j & 4294967295L))) - 0.5f, t0);
        }
    }

    public final int v(int i) {
        hv2 u = this.O.u();
        lh4 O0 = u.O0();
        uy3 uy3 = (uy3) u.y;
        return O0.a((xz4) uy3.a0.e, uy3.m(), i);
    }

    public final eh5 y(long j) {
        m0(j);
        uy3 uy3 = this.O;
        eq4 z = uy3.z();
        Object[] objArr = z.w;
        int i = z.y;
        for (int i2 = 0; i2 < i; i2++) {
            ((uy3) objArr[i2]).b0.p.H = sy3.y;
        }
        v1(uy3.R.b(this, uy3.m(), j));
        m1();
        return this;
    }
}
