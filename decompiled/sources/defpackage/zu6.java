package defpackage;

/* renamed from: zu6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zu6 extends ll4 implements my3 {
    public float K;
    public float L;
    public float M;
    public float N;
    public boolean O;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (r4 != Integer.MAX_VALUE) goto L_0x0042;
     */
    public final long V0(oh4 oh4) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (!Float.isNaN(this.M)) {
            i = oh4.r0(this.M);
            if (i < 0) {
                i = 0;
            }
        } else {
            i = Integer.MAX_VALUE;
        }
        if (!Float.isNaN(this.N)) {
            i2 = oh4.r0(this.N);
            if (i2 < 0) {
                i2 = 0;
            }
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (!Float.isNaN(this.K)) {
            i3 = oh4.r0(this.K);
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > i) {
                i3 = i;
            }
        }
        i3 = 0;
        if (!Float.isNaN(this.L)) {
            int r0 = oh4.r0(this.L);
            if (r0 < 0) {
                r0 = 0;
            }
            if (r0 > i2) {
                r0 = i2;
            }
            if (r0 != Integer.MAX_VALUE) {
                i4 = r0;
            }
        }
        return m31.a(i3, i, i4, i2);
    }

    public final int Z(dd4 dd4, gh4 gh4, int i) {
        long V0 = V0(dd4);
        if (k31.e(V0)) {
            return k31.g(V0);
        }
        if (!this.O) {
            i = m31.g(V0, i);
        }
        return m31.f(V0, gh4.c(i));
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        long V0 = V0(oh4);
        if (this.O) {
            j2 = m31.e(j, V0);
        } else {
            if (!Float.isNaN(this.K)) {
                i = k31.j(V0);
            } else {
                i = k31.j(j);
                int h = k31.h(V0);
                if (i > h) {
                    i = h;
                }
            }
            if (!Float.isNaN(this.M)) {
                i2 = k31.h(V0);
            } else {
                i2 = k31.h(j);
                int j3 = k31.j(V0);
                if (i2 < j3) {
                    i2 = j3;
                }
            }
            if (!Float.isNaN(this.L)) {
                i3 = k31.i(V0);
            } else {
                i3 = k31.i(j);
                int g = k31.g(V0);
                if (i3 > g) {
                    i3 = g;
                }
            }
            if (!Float.isNaN(this.N)) {
                i4 = k31.g(V0);
            } else {
                i4 = k31.g(j);
                int i5 = k31.i(V0);
                if (i4 < i5) {
                    i4 = i5;
                }
            }
            j2 = m31.a(i, i2, i3, i4);
        }
        eh5 y = gh4.y(j2);
        return oh4.d0(y.w, y.x, b42.w, new ws(y, 11));
    }

    public final int f(dd4 dd4, gh4 gh4, int i) {
        long V0 = V0(dd4);
        if (k31.f(V0)) {
            return k31.h(V0);
        }
        if (!this.O) {
            i = m31.f(V0, i);
        }
        return m31.g(V0, gh4.v(i));
    }

    public final int i0(dd4 dd4, gh4 gh4, int i) {
        long V0 = V0(dd4);
        if (k31.e(V0)) {
            return k31.g(V0);
        }
        if (!this.O) {
            i = m31.g(V0, i);
        }
        return m31.f(V0, gh4.W(i));
    }

    public final int s0(dd4 dd4, gh4 gh4, int i) {
        long V0 = V0(dd4);
        if (k31.f(V0)) {
            return k31.h(V0);
        }
        if (!this.O) {
            i = m31.f(V0, i);
        }
        return m31.g(V0, gh4.l(i));
    }
}
