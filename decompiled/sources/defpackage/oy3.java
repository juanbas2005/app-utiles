package defpackage;

/* renamed from: oy3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oy3 extends xz4 {
    public static final kb9 t0;
    public my3 r0;
    public ny3 s0;

    static {
        kb9 b = dh4.b();
        int i = jt0.h;
        b.k(jt0.e);
        b.q(1.0f);
        b.r(1);
        t0 = b;
    }

    public oy3(uy3 uy3, my3 my3) {
        super(uy3);
        ny3 ny3;
        this.r0 = my3;
        if (uy3.D != null) {
            ny3 = new ny3(this);
        } else {
            ny3 = null;
        }
        this.s0 = ny3;
        if ((((ll4) my3).w.y & 512) != 0) {
            ku4.a();
            throw null;
        }
    }

    public final void E1(my3 my3) {
        if (my3.equals(this.r0) || (((ll4) my3).w.y & 512) == 0) {
            this.r0 = my3;
        } else {
            ku4.a();
        }
    }

    public final int W(int i) {
        my3 my3 = this.r0;
        xz4 xz4 = this.P;
        xz4.getClass();
        return my3.i0(this, xz4, i);
    }

    public final void X0() {
        if (this.s0 == null) {
            this.s0 = new ny3(this);
        }
    }

    public final fd4 a1() {
        return this.s0;
    }

    public final int c(int i) {
        my3 my3 = this.r0;
        xz4 xz4 = this.P;
        xz4.getClass();
        return my3.Z(this, xz4, i);
    }

    public final ll4 c1() {
        return ((ll4) this.r0).w;
    }

    public final void h0(long j, float f, vr2 vr2) {
        s1(j, f, vr2);
        if (!this.J) {
            n1();
            xz4 xz4 = this.P;
            xz4.getClass();
            boolean z = xz4.K;
            xz4.K = this.K;
            J0().b();
            xz4.K = z;
        }
    }

    public final int l(int i) {
        my3 my3 = this.r0;
        xz4 xz4 = this.P;
        xz4.getClass();
        return my3.s0(this, xz4, i);
    }

    public final int p0(kb kbVar) {
        ny3 ny3 = this.s0;
        if (ny3 == null) {
            return rc9.i(this, kbVar);
        }
        hp4 hp4 = ny3.T;
        int d = hp4.d(kbVar);
        if (d >= 0) {
            return hp4.c[d];
        }
        return Integer.MIN_VALUE;
    }

    public final void r1(qk0 qk0, cx2 cx2) {
        xz4 xz4;
        xz4 xz42 = this.P;
        xz42.getClass();
        xz42.V0(qk0, cx2);
        if (((je) xy3.a(this.O)).getShowLayoutBounds() && (xz4 = this.P) != null) {
            if (!we3.a(this.y, xz4.y) || !oe3.a(xz4.Z, 0)) {
                long j = this.y;
                qk0.a(0.5f, 0.5f, ((float) ((int) (j >> 32))) - 0.5f, ((float) ((int) (j & 4294967295L))) - 0.5f, t0);
            }
        }
    }

    public final int v(int i) {
        my3 my3 = this.r0;
        xz4 xz4 = this.P;
        xz4.getClass();
        return my3.f(this, xz4, i);
    }

    public final eh5 y(long j) {
        m0(j);
        my3 my3 = this.r0;
        xz4 xz4 = this.P;
        xz4.getClass();
        v1(my3.c(this, xz4, j));
        m1();
        return this;
    }
}
