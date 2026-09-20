package defpackage;

/* renamed from: s41  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s41 extends ll4 implements ry0, sh4 {
    public z75 K;
    public final zh6 L;
    public boolean M;
    public fc0 N;
    public final oh6 O;
    public final f96 P = new f96(8);
    public boolean Q;
    public long R = -1;
    public boolean S;

    public s41(z75 z75, zh6 zh6, boolean z, fc0 fc0, oh6 oh6) {
        this.K = z75;
        this.L = zh6;
        this.M = z;
        this.N = fc0;
        this.O = oh6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: ly5} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final float V0(s41 s41, fc0 fc0, long j) {
        float f;
        ly5 ly5;
        int i;
        s41 s412 = s41;
        fc0 fc02 = fc0;
        long j2 = s412.R;
        eq4 eq4 = (eq4) s412.P.x;
        int i2 = eq4.y - 1;
        Object[] objArr = eq4.w;
        ly5 ly52 = null;
        if (i2 < objArr.length) {
            ly5 = null;
            while (true) {
                if (i2 < 0) {
                    f = 0.0f;
                    break;
                }
                ly5 ly53 = (ly5) ((q41) objArr[i2]).a.b();
                if (ly53 != null) {
                    long c = ly53.c();
                    long O2 = pv8.O(s412.W0());
                    f = 0.0f;
                    int ordinal = s412.K.ordinal();
                    if (ordinal == 0) {
                        i = Float.compare(Float.intBitsToFloat((int) (c & 4294967295L)), Float.intBitsToFloat((int) (O2 & 4294967295L)));
                    } else if (ordinal == 1) {
                        i = Float.compare(Float.intBitsToFloat((int) (c >> 32)), Float.intBitsToFloat((int) (O2 >> 32)));
                    } else {
                        h.c();
                        return 0.0f;
                    }
                    if (i <= 0) {
                        ly5 = ly53;
                    } else if (ly5 == null) {
                        ly5 = ly53;
                    }
                }
                i2--;
            }
        } else {
            f = 0.0f;
            ly5 = null;
        }
        if (ly5 == null) {
            if (s412.Q) {
                ly52 = s412.O.b();
            }
            if (ly52 == null) {
                return f;
            }
            ly5 = ly52;
        }
        long O3 = pv8.O(j2);
        int ordinal2 = s412.K.ordinal();
        if (ordinal2 == 0) {
            float f2 = ly5.b;
            return fc02.a(f2 - ((float) ((int) (j & 4294967295L))), ly5.d - f2, Float.intBitsToFloat((int) (O3 & 4294967295L)));
        } else if (ordinal2 == 1) {
            float f3 = ly5.a;
            return fc02.a(f3 - ((float) ((int) (j >> 32))), ly5.c - f3, Float.intBitsToFloat((int) (O3 >> 32)));
        } else {
            h.c();
            return f;
        }
    }

    public static boolean X0(s41 s41, ly5 ly5, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = s41.W0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long Z0 = s41.Z0(ly5, j3, j2);
        if (Math.abs(Float.intBitsToFloat((int) (Z0 >> 32))) > 0.5f || Math.abs(Float.intBitsToFloat((int) (Z0 & 4294967295L))) > 0.5f) {
            return false;
        }
        return true;
    }

    public final boolean K0() {
        return false;
    }

    public final long W0() {
        long j = this.R;
        if (we3.a(j, -1)) {
            return 0;
        }
        return j;
    }

    public final void Y0(long j) {
        fc0 fc0 = this.N;
        if (fc0 == null) {
            fc0 = (fc0) h49.w(this, hc0.a);
        }
        fc0 fc02 = fc0;
        if (this.S) {
            bc3.c("launchAnimation called when previous animation was running");
        }
        fc0 fc03 = this.N;
        if (fc03 == null) {
            fc03 = (fc0) h49.w(this, hc0.a);
        }
        fc03.getClass();
        fc0.a.getClass();
        fu7 fu7 = new fu7(ec0.b);
        ar7.H(J0(), (e81) null, r81.z, new w40(this, fu7, fc02, j, (f61) null), 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: fc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: fc0} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final long Z0(ly5 ly5, long j, long j2) {
        long O2 = pv8.O(j);
        int ordinal = this.K.ordinal();
        if (ordinal == 0) {
            fc0 fc0 = this.N;
            if (fc0 == null) {
                fc0 = h49.w(this, hc0.a);
            }
            float f = ly5.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fc0.a(f - ((float) ((int) (j2 & 4294967295L))), ly5.d - f, Float.intBitsToFloat((int) (O2 & 4294967295L))))) & 4294967295L);
        } else if (ordinal == 1) {
            fc0 fc02 = this.N;
            if (fc02 == null) {
                fc02 = h49.w(this, hc0.a);
            }
            float f2 = ly5.a;
            return (((long) Float.floatToRawIntBits(fc02.a(f2 - ((float) ((int) (j2 >> 32))), ly5.c - f2, Float.intBitsToFloat((int) (O2 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        } else {
            h.c();
            return 0;
        }
    }

    public final void a(long j) {
        int i;
        long j2;
        long W0 = W0();
        this.R = j;
        int ordinal = this.K.ordinal();
        if (ordinal == 0) {
            i = sg3.k((int) (j & 4294967295L), (int) (W0 & 4294967295L));
        } else if (ordinal == 1) {
            i = sg3.k((int) (j >> 32), (int) (W0 >> 32));
        } else {
            h.c();
            return;
        }
        if (i < 0) {
            if (this.M) {
                j2 = 0;
            } else if (this.K == z75.w) {
                j2 = ((long) (((int) (W0 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L;
            } else {
                j2 = ((long) (((int) (W0 >> 32)) - ((int) (j >> 32)))) << 32;
            }
            long j3 = j2;
            ly5 ly5 = (ly5) this.O.b();
            if (ly5 != null && !this.S && !this.Q) {
                if (X0(this, ly5, W0, 0, 2)) {
                    long j4 = j3;
                    if (!X0(this, ly5, 0, j4, 1)) {
                        this.Q = true;
                        Y0(j4);
                    }
                }
            }
        }
    }
}
