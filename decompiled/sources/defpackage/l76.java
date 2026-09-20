package defpackage;

/* renamed from: l76  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l76 implements tp1 {
    public float A;
    public float B;
    public float C;
    public long D;
    public long E;
    public float F;
    public float G;
    public float H;
    public float I;
    public long J;
    public pq6 K;
    public boolean L;
    public int M;
    public long N;
    public zx3 O;
    public tp1 P;
    public ey3 Q;
    public lt0 R;
    public int S;
    public n85 T;
    public int w;
    public float x = 1.0f;
    public float y = 1.0f;
    public float z = 1.0f;

    public l76() {
        long j = gx2.a;
        this.D = j;
        this.E = j;
        this.I = 8.0f;
        this.J = ql7.b;
        this.K = gr8.h;
        this.M = 0;
        this.N = 9205357640488583168L;
        this.O = zx3.a;
        this.P = gl0.F();
        this.Q = ey3.w;
        this.S = 3;
    }

    public final void A(float f) {
        if (this.B != f) {
            this.w |= 16;
            this.B = f;
        }
    }

    public final float Y() {
        return this.P.Y();
    }

    public final void a() {
        l(1.0f);
        m(1.0f);
        c(1.0f);
        y(0.0f);
        A(0.0f);
        n(0.0f);
        long j = gx2.a;
        d(j);
        v(j);
        h(0.0f);
        j(0.0f);
        k(0.0f);
        if (this.I != 8.0f) {
            this.w |= 2048;
            this.I = 8.0f;
        }
        w(ql7.b);
        r(gr8.h);
        f(false);
        g((lt0) null);
        if (this.S != 3) {
            this.w |= 524288;
            this.S = 3;
        }
        if (this.M != 0) {
            this.w |= 32768;
            this.M = 0;
        }
        zx3 zx3 = zx3.a;
        if (!sg3.e(this.O, zx3)) {
            this.w |= 1048576;
            this.O = zx3;
        }
        this.N = 9205357640488583168L;
        this.T = null;
        this.w = 0;
    }

    public final float b() {
        return this.P.b();
    }

    public final void c(float f) {
        if (this.z != f) {
            this.w |= 4;
            this.z = f;
        }
    }

    public final void d(long j) {
        if (!jt0.c(this.D, j)) {
            this.w |= 64;
            this.D = j;
        }
    }

    public final void f(boolean z2) {
        if (this.L != z2) {
            this.w |= 16384;
            this.L = z2;
        }
    }

    public final void g(lt0 lt0) {
        if (!sg3.e(this.R, lt0)) {
            this.w |= 262144;
            this.R = lt0;
        }
    }

    public final void h(float f) {
        if (this.F != f) {
            this.w |= 256;
            this.F = f;
        }
    }

    public final void j(float f) {
        if (this.G != f) {
            this.w |= 512;
            this.G = f;
        }
    }

    public final void k(float f) {
        if (this.H != f) {
            this.w |= 1024;
            this.H = f;
        }
    }

    public final void l(float f) {
        if (this.x != f) {
            this.w |= 1;
            this.x = f;
        }
    }

    public final void m(float f) {
        if (this.y != f) {
            this.w |= 2;
            this.y = f;
        }
    }

    public final void n(float f) {
        if (this.C != f) {
            this.w |= 32;
            this.C = f;
        }
    }

    public final void r(pq6 pq6) {
        if (!sg3.e(this.K, pq6)) {
            this.w |= 8192;
            this.K = pq6;
        }
    }

    public final void v(long j) {
        if (!jt0.c(this.E, j)) {
            this.w |= 128;
            this.E = j;
        }
    }

    public final void w(long j) {
        if (!ql7.a(this.J, j)) {
            this.w |= 4096;
            this.J = j;
        }
    }

    public final void y(float f) {
        if (this.A != f) {
            this.w |= 8;
            this.A = f;
        }
    }
}
