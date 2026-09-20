package defpackage;

/* renamed from: xs  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xs extends ll4 implements my3 {
    public float K;
    public boolean L;

    public final long V0(boolean z, long j) {
        int round;
        int g = k31.g(j);
        if (g == Integer.MAX_VALUE || (round = Math.round(((float) g) * this.K)) <= 0) {
            return 0;
        }
        if (!z || uq3.B(round, g, j)) {
            return (((long) round) << 32) | (((long) g) & 4294967295L);
        }
        return 0;
    }

    public final long W0(boolean z, long j) {
        int round;
        int h = k31.h(j);
        if (h == Integer.MAX_VALUE || (round = Math.round(((float) h) / this.K)) <= 0) {
            return 0;
        }
        if (!z || uq3.B(h, round, j)) {
            return (((long) h) << 32) | (((long) round) & 4294967295L);
        }
        return 0;
    }

    public final long X0(boolean z, long j) {
        int i = k31.i(j);
        int round = Math.round(((float) i) * this.K);
        if (round <= 0) {
            return 0;
        }
        if (!z || uq3.B(round, i, j)) {
            return (((long) round) << 32) | (((long) i) & 4294967295L);
        }
        return 0;
    }

    public final long Y0(boolean z, long j) {
        int j2 = k31.j(j);
        int round = Math.round(((float) j2) / this.K);
        if (round <= 0) {
            return 0;
        }
        if (!z || uq3.B(j2, round, j)) {
            return (((long) j2) << 32) | (((long) round) & 4294967295L);
        }
        return 0;
    }

    public final int Z(dd4 dd4, gh4 gh4, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(((float) i) / this.K);
        }
        return gh4.c(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        if (defpackage.we3.a(r5, 0) == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bc, code lost:
        if (defpackage.we3.a(r5, 0) == false) goto L_0x00c0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c6  */
    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        long j2;
        boolean z;
        boolean z2 = true;
        if (!this.L) {
            j2 = W0(true, j);
            if (we3.a(j2, 0)) {
                j2 = V0(true, j);
                if (we3.a(j2, 0)) {
                    j2 = Y0(true, j);
                    if (we3.a(j2, 0)) {
                        j2 = X0(true, j);
                        if (we3.a(j2, 0)) {
                            j2 = W0(false, j);
                            if (we3.a(j2, 0)) {
                                j2 = V0(false, j);
                                if (we3.a(j2, 0)) {
                                    j2 = Y0(false, j);
                                    if (we3.a(j2, 0)) {
                                        j2 = X0(false, j);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!we3.a(j2, 0)) {
                int i = (int) (j2 >> 32);
                int i2 = (int) (4294967295L & j2);
                if (i >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (i2 < 0) {
                    z2 = false;
                }
                if (!z || !z2) {
                    ac3.a("width and height must be >= 0");
                }
                j = m31.h(i, i, i2, i2);
            }
            eh5 y = gh4.y(j);
            return oh4.d0(y.w, y.x, b42.w, new ws(y, 0));
        }
        j2 = V0(true, j);
        if (we3.a(j2, 0)) {
            j2 = W0(true, j);
            if (we3.a(j2, 0)) {
                j2 = X0(true, j);
                if (we3.a(j2, 0)) {
                    j2 = Y0(true, j);
                    if (we3.a(j2, 0)) {
                        j2 = V0(false, j);
                        if (we3.a(j2, 0)) {
                            j2 = W0(false, j);
                            if (we3.a(j2, 0)) {
                                j2 = X0(false, j);
                                if (we3.a(j2, 0)) {
                                    j2 = Y0(false, j);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!we3.a(j2, 0)) {
        }
        eh5 y2 = gh4.y(j);
        return oh4.d0(y2.w, y2.x, b42.w, new ws(y2, 0));
        j2 = 0;
        if (!we3.a(j2, 0)) {
        }
        eh5 y22 = gh4.y(j);
        return oh4.d0(y22.w, y22.x, b42.w, new ws(y22, 0));
    }

    public final int f(dd4 dd4, gh4 gh4, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(((float) i) * this.K);
        }
        return gh4.v(i);
    }

    public final int i0(dd4 dd4, gh4 gh4, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(((float) i) / this.K);
        }
        return gh4.W(i);
    }

    public final int s0(dd4 dd4, gh4 gh4, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(((float) i) * this.K);
        }
        return gh4.l(i);
    }
}
