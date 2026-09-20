package defpackage;

/* renamed from: h51  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h51 extends ll4 implements gz1, my3 {
    public vb5 K;
    public jb L;
    public j51 M;
    public float N;

    public final boolean K0() {
        return false;
    }

    public final long V0(long j) {
        if (wu6.e(j)) {
            return 0;
        }
        long i = this.K.i();
        if (i != 9205357640488583168L) {
            float d = wu6.d(i);
            if (Float.isInfinite(d) || Float.isNaN(d)) {
                d = wu6.d(j);
            }
            float b = wu6.b(i);
            if (Float.isInfinite(b) || Float.isNaN(b)) {
                b = wu6.b(j);
            }
            long a = fb5.a(d, b);
            long c = this.M.c(a, j);
            int i2 = yf6.a;
            float intBitsToFloat = Float.intBitsToFloat((int) (c >> 32));
            if (!Float.isInfinite(intBitsToFloat) && !Float.isNaN(intBitsToFloat)) {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & c));
                if (!Float.isInfinite(intBitsToFloat2) && !Float.isNaN(intBitsToFloat2)) {
                    return ya5.w(a, c);
                }
            }
        }
        return j;
    }

    public final long W0(long j) {
        boolean z;
        float f;
        float f2;
        int i;
        boolean f3 = k31.f(j);
        boolean e = k31.e(j);
        if (!f3 || !e) {
            if (!k31.d(j) || !k31.c(j)) {
                z = false;
            } else {
                z = true;
            }
            long i2 = this.K.i();
            if (i2 != 9205357640488583168L) {
                long j2 = j;
                if (!z || (!f3 && !e)) {
                    float d = wu6.d(i2);
                    float b = wu6.b(i2);
                    if (Float.isInfinite(d) || Float.isNaN(d)) {
                        f2 = (float) k31.j(j2);
                    } else {
                        qx5 qx5 = k18.b;
                        f2 = z65.o(d, (float) k31.j(j2), (float) k31.h(j2));
                    }
                    if (Float.isInfinite(b) || Float.isNaN(b)) {
                        i = k31.i(j2);
                    } else {
                        qx5 qx52 = k18.b;
                        f = z65.o(b, (float) k31.i(j2), (float) k31.g(j2));
                        long V0 = V0(fb5.a(f2, f));
                        return k31.a(j2, m31.g(j2, dh4.C(wu6.d(V0))), 0, m31.f(j2, dh4.C(wu6.b(V0))), 0, 10);
                    }
                } else {
                    f2 = (float) k31.h(j2);
                    i = k31.g(j2);
                }
                f = (float) i;
                long V02 = V0(fb5.a(f2, f));
                return k31.a(j2, m31.g(j2, dh4.C(wu6.d(V02))), 0, m31.f(j2, dh4.C(wu6.b(V02))), 0, 10);
            } else if (z) {
                return k31.a(j, k31.h(j), 0, k31.g(j), 0, 10);
            }
        }
        return j;
    }

    public final int Z(dd4 dd4, gh4 gh4, int i) {
        if (this.K.i() == 9205357640488583168L) {
            return gh4.c(i);
        }
        int c = gh4.c(k31.h(W0(m31.b(0, i, 0, 0, 13))));
        return Math.max(dh4.C(wu6.b(V0(fb5.a((float) i, (float) c)))), c);
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        eh5 y = gh4.y(W0(j));
        return oh4.d0(y.w, y.x, b42.w, new ws(y, 3));
    }

    public final int f(dd4 dd4, gh4 gh4, int i) {
        if (this.K.i() == 9205357640488583168L) {
            return gh4.v(i);
        }
        int v = gh4.v(k31.g(W0(m31.b(0, 0, 0, i, 7))));
        return Math.max(dh4.C(wu6.d(V0(fb5.a((float) v, (float) i)))), v);
    }

    public final int i0(dd4 dd4, gh4 gh4, int i) {
        if (this.K.i() == 9205357640488583168L) {
            return gh4.W(i);
        }
        int W = gh4.W(k31.h(W0(m31.b(0, i, 0, 0, 13))));
        return Math.max(dh4.C(wu6.b(V0(fb5.a((float) i, (float) W)))), W);
    }

    public final void p0(wy3 wy3) {
        wy3 wy32 = wy3;
        tk0 tk0 = wy32.w;
        long V0 = V0(tk0.e());
        jb jbVar = this.L;
        qx5 qx5 = k18.b;
        long C = (((long) dh4.C(wu6.d(V0))) << 32) | (((long) dh4.C(wu6.b(V0))) & 4294967295L);
        long e = tk0.e();
        long a = jbVar.a(C, (((long) dh4.C(wu6.d(e))) << 32) | (((long) dh4.C(wu6.b(e))) & 4294967295L), wy32.getLayoutDirection());
        float f = (float) ((int) (a >> 32));
        float f2 = (float) ((int) (a & 4294967295L));
        ((ji8) tk0.x.x).F(f, f2);
        this.K.g(wy32, V0, this.N, (lt0) null);
        ((ji8) tk0.x.x).F(-f, -f2);
        wy3.a();
    }

    public final int s0(dd4 dd4, gh4 gh4, int i) {
        if (this.K.i() == 9205357640488583168L) {
            return gh4.l(i);
        }
        int l = gh4.l(k31.g(W0(m31.b(0, 0, 0, i, 7))));
        return Math.max(dh4.C(wu6.d(V0(fb5.a((float) l, (float) i)))), l);
    }
}
