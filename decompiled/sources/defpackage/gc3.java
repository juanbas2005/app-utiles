package defpackage;

/* renamed from: gc3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gc3 extends fd4 {
    public final void S0() {
        jd4 jd4 = this.O.O.b0.q;
        jd4.getClass();
        jd4.B0();
    }

    public final int W(int i) {
        hv2 u = this.O.O.u();
        lh4 O0 = u.O0();
        uy3 uy3 = (uy3) u.y;
        return O0.e((xz4) uy3.a0.e, uy3.l(), i);
    }

    public final int c(int i) {
        hv2 u = this.O.O.u();
        lh4 O0 = u.O0();
        uy3 uy3 = (uy3) u.y;
        return O0.d((xz4) uy3.a0.e, uy3.l(), i);
    }

    public final int l(int i) {
        hv2 u = this.O.O.u();
        lh4 O0 = u.O0();
        uy3 uy3 = (uy3) u.y;
        return O0.c((xz4) uy3.a0.e, uy3.l(), i);
    }

    public final int p0(kb kbVar) {
        Boolean bool;
        int i;
        boolean z;
        jd4 jd4 = this.O.O.b0.q;
        jd4.getClass();
        vy3 vy3 = jd4.N;
        if (!jd4.G) {
            yy3 yy3 = jd4.B;
            if (yy3.d == qy3.x) {
                vy3.f = true;
                if (vy3.b) {
                    yy3.f = true;
                    yy3.g = true;
                }
            } else {
                vy3.g = true;
            }
        }
        gc3 gc3 = jd4.f().s0;
        if (gc3 != null) {
            bool = Boolean.valueOf(gc3.K);
        } else {
            bool = null;
        }
        gc3 gc32 = jd4.f().s0;
        if (gc32 != null) {
            gc32.K = true;
        }
        jd4.J();
        gc3 gc33 = jd4.f().s0;
        if (gc33 != null) {
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            gc33.K = z;
        }
        Integer num = (Integer) vy3.i.get(kbVar);
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MIN_VALUE;
        }
        this.T.g(i, kbVar);
        return i;
    }

    public final int v(int i) {
        hv2 u = this.O.O.u();
        lh4 O0 = u.O0();
        uy3 uy3 = (uy3) u.y;
        return O0.a((xz4) uy3.a0.e, uy3.l(), i);
    }

    public final eh5 y(long j) {
        m0(j);
        xz4 xz4 = this.O;
        eq4 z = xz4.O.z();
        Object[] objArr = z.w;
        int i = z.y;
        for (int i2 = 0; i2 < i; i2++) {
            jd4 jd4 = ((uy3) objArr[i2]).b0.q;
            jd4.getClass();
            jd4.F = sy3.y;
        }
        uy3 uy3 = xz4.O;
        fd4.R0(this, uy3.R.b(this, uy3.l(), j));
        return this;
    }
}
