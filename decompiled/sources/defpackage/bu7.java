package defpackage;

/* renamed from: bu7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bu7 extends ll4 implements my3 {
    public float K;
    public float L;

    public final int Z(dd4 dd4, gh4 gh4, int i) {
        int i2;
        int c = gh4.c(i);
        if (!Float.isNaN(this.L)) {
            i2 = dd4.r0(this.L);
        } else {
            i2 = 0;
        }
        if (c < i2) {
            return i2;
        }
        return c;
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        int i;
        int i2;
        int i3 = 0;
        if (Float.isNaN(this.K) || k31.j(j) != 0) {
            i = k31.j(j);
        } else {
            int r0 = oh4.r0(this.K);
            i = k31.h(j);
            if (r0 < 0) {
                r0 = 0;
            }
            if (r0 <= i) {
                i = r0;
            }
        }
        int h = k31.h(j);
        if (Float.isNaN(this.L) || k31.i(j) != 0) {
            i2 = k31.i(j);
        } else {
            int r02 = oh4.r0(this.L);
            i2 = k31.g(j);
            if (r02 >= 0) {
                i3 = r02;
            }
            if (i3 <= i2) {
                i2 = i3;
            }
        }
        eh5 y = gh4.y(m31.a(i, h, i2, k31.g(j)));
        return oh4.d0(y.w, y.x, b42.w, new ws(y, 16));
    }

    public final int f(dd4 dd4, gh4 gh4, int i) {
        int i2;
        int v = gh4.v(i);
        if (!Float.isNaN(this.K)) {
            i2 = dd4.r0(this.K);
        } else {
            i2 = 0;
        }
        if (v < i2) {
            return i2;
        }
        return v;
    }

    public final int i0(dd4 dd4, gh4 gh4, int i) {
        int i2;
        int W = gh4.W(i);
        if (!Float.isNaN(this.L)) {
            i2 = dd4.r0(this.L);
        } else {
            i2 = 0;
        }
        if (W < i2) {
            return i2;
        }
        return W;
    }

    public final int s0(dd4 dd4, gh4 gh4, int i) {
        int i2;
        int l = gh4.l(i);
        if (!Float.isNaN(this.K)) {
            i2 = dd4.r0(this.K);
        } else {
            i2 = 0;
        }
        if (l < i2) {
            return i2;
        }
        return l;
    }
}
