package defpackage;

/* renamed from: nz2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nz2 extends ll4 implements ry0, my3, h35 {
    public tg7 K;
    public int L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public tg7 Q;
    public wq7 R;

    public final boolean K0() {
        return false;
    }

    public final void N0() {
        int i;
        int i2;
        dl2 dl2 = (dl2) h49.w(this, xy0.k);
        this.Q = aa5.k(this.K, rc9.O0(this).U);
        ea7 ea7 = X0().a.f;
        am2 am2 = X0().a.c;
        if (am2 == null) {
            am2 = am2.y;
        }
        yl2 yl2 = X0().a.d;
        if (yl2 != null) {
            i = yl2.a;
        } else {
            i = 0;
        }
        zl2 zl2 = X0().a.e;
        if (zl2 != null) {
            i2 = zl2.a;
        } else {
            i2 = 65535;
        }
        this.R = ((el2) dl2).b(ea7, am2, i, i2);
        i35.o(this, new mz2(this, 0));
        this.N = true;
    }

    public final void O0() {
        this.Q = null;
        this.R = null;
        this.N = false;
    }

    public final void R() {
        this.Q = aa5.k(this.K, rc9.O0(this).U);
        this.N = true;
        su0.B(this);
    }

    public final void V0(oh4 oh4, tg7 tg7, dl2 dl2) {
        zf7 zf7 = zd7.b(tg7, oh4, dl2, 3).d;
        float h = zf7.h(0);
        float h2 = zf7.h(1);
        float h3 = zf7.h(2);
        this.O = rd3.k(h, h2, h3, this.L, 1);
        this.P = rd3.k(h, h2, h3, this.M, Integer.MAX_VALUE);
    }

    public final void W0(dd4 dd4) {
        int i = 0;
        if (this.N) {
            V0(dd4, X0(), (dl2) h49.w(this, xy0.k));
            this.N = false;
        }
        int i2 = this.O;
        if (i2 >= 0) {
            i = i2;
        }
        this.O = i;
        int i3 = this.P;
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        this.P = i3;
    }

    public final tg7 X0() {
        tg7 tg7 = this.Q;
        if (tg7 != null) {
            return tg7;
        }
        throw f21.p("Resolved style is not set.");
    }

    public final int Z(dd4 dd4, gh4 gh4, int i) {
        W0(dd4);
        int i2 = this.O;
        int i3 = this.P;
        if (i2 == i3) {
            return i3;
        }
        int c = gh4.c(i);
        int i4 = this.O;
        int i5 = this.P;
        if (c < i4) {
            c = i4;
        }
        if (c > i5) {
            return i5;
        }
        return c;
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        int i;
        int g;
        if (this.N) {
            V0(oh4, X0(), (dl2) h49.w(this, xy0.k));
            this.N = false;
        }
        int i2 = this.O;
        if (i2 != -1) {
            i = z65.p(i2, k31.i(j), k31.g(j));
        } else {
            i = k31.i(j);
        }
        int i3 = i;
        int i4 = this.P;
        if (i4 != -1) {
            g = z65.p(i4, k31.i(j), k31.g(j));
        } else {
            g = k31.g(j);
        }
        eh5 y = gh4.y(k31.a(j, 0, 0, i3, g, 3));
        return oh4.d0(y.w, y.x, b42.w, new ws(y, 7));
    }

    public final void d() {
        this.N = true;
        su0.B(this);
    }

    public final int i0(dd4 dd4, gh4 gh4, int i) {
        W0(dd4);
        int i2 = this.O;
        if (i2 == this.P) {
            return i2;
        }
        int W = gh4.W(i);
        int i3 = this.O;
        int i4 = this.P;
        if (W < i3) {
            W = i3;
        }
        if (W > i4) {
            return i4;
        }
        return W;
    }

    public final void m0() {
        if (this.R != null) {
            i35.o(this, new mz2(this, 1));
        }
        this.N = true;
        su0.B(this);
    }
}
