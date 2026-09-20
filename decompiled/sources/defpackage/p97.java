package defpackage;

/* renamed from: p97  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class p97 {
    public static final float a;
    public static final float b = r16.Q;
    public static final float c = r16.N;
    public static final float d;
    public static final float e;
    public static final hx6 f = new hx6(0);

    static {
        float f2 = r16.G;
        a = f2;
        float f3 = r16.K;
        d = f3;
        e = (f3 - f2) / 2.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void a(boolean z, vr2 vr2, ml4 ml4, boolean z2, n97 n97, yt2 yt2, int i, int i2) {
        int i3;
        boolean z3;
        n97 n972;
        int i4;
        boolean z4;
        boolean z5;
        ml4 ml42;
        yx5 v;
        ml4 ml43;
        int i5;
        n97 n973;
        n97 n974;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z6 = z;
        vr2 vr22 = vr2;
        yt2 yt22 = yt2;
        int i11 = i;
        yt22.g0(-263339167);
        if ((i11 & 6) == 0) {
            if (yt22.h(z6)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i11;
        } else {
            i3 = i11;
        }
        if ((i11 & 48) == 0) {
            if (yt22.i(vr22)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        int i12 = i3 | 3456;
        int i13 = i2 & 16;
        if (i13 != 0) {
            i12 = i3 | 28032;
        } else if ((i11 & 24576) == 0) {
            z3 = z2;
            if (yt22.h(z3)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i12 |= i8;
            if ((196608 & i11) != 0) {
                if ((i2 & 32) == 0) {
                    n972 = n97;
                    if (yt22.g(n972)) {
                        i7 = 131072;
                        i12 |= i7;
                    }
                } else {
                    n972 = n97;
                }
                i7 = 65536;
                i12 |= i7;
            } else {
                n972 = n97;
            }
            i4 = i12 | 1572864;
            boolean z7 = true;
            if ((599187 & i4) == 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!yt22.V(i4 & 1, z4)) {
                yt22.a0();
                int i14 = i11 & 1;
                ml4 ml44 = jl4.w;
                if (i14 == 0 || yt22.C()) {
                    if (i13 == 0) {
                        z7 = z3;
                    }
                    if ((i2 & 32) != 0) {
                        qt0 qt0 = ((zg4) yt22.k(ch4.b)).a;
                        n974 = qt0.n0;
                        long j = qt0.p;
                        if (n974 == null) {
                            long d2 = st0.d(qt0, r16.F);
                            long d3 = st0.d(qt0, r16.I);
                            long j2 = jt0.f;
                            long d4 = st0.d(qt0, r16.H);
                            long d5 = st0.d(qt0, r16.P);
                            long d6 = st0.d(qt0, r16.S);
                            long d7 = st0.d(qt0, r16.O);
                            long d8 = st0.d(qt0, r16.R);
                            long n = uq3.n(jt0.b(r16.s, st0.d(qt0, r16.r)), j);
                            long d9 = st0.d(qt0, r16.v);
                            float f2 = r16.w;
                            i6 = -458753;
                            n974 = new n97(d2, d3, j2, d4, d5, d6, d7, d8, n, uq3.n(jt0.b(f2, d9), j), j2, uq3.n(jt0.b(r16.u, st0.d(qt0, r16.t)), j), uq3.n(jt0.b(r16.y, st0.d(qt0, r16.x)), j), uq3.n(jt0.b(f2, st0.d(qt0, r16.B)), j), uq3.n(jt0.b(f2, st0.d(qt0, r16.C)), j), uq3.n(jt0.b(r16.A, st0.d(qt0, r16.z)), j));
                            qt0.n0 = n974;
                        } else {
                            i6 = -458753;
                        }
                        i4 &= i6;
                    } else {
                        n974 = n972;
                    }
                    n97 n975 = n974;
                    i5 = i4;
                    n973 = n975;
                    z3 = z7;
                    ml43 = ml44;
                } else {
                    yt22.Y();
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                    }
                    ml43 = ml4;
                    i5 = i4;
                    n973 = n972;
                }
                yt22.s();
                yt22.e0(1768510810);
                Object Q = yt22.Q();
                if (Q == ay0.a) {
                    Q = b81.e(yt22);
                }
                ap4 ap4 = (ap4) Q;
                yt22.r(false);
                if (vr22 != null) {
                    h23 h23 = hf3.a;
                    ml44 = h49.S(z6, ap4, z3, new s86(2), vr22);
                }
                ml4 i15 = yu6.i(yu6.s(ml43.d(ml44), xb4.C, 2), c, d);
                int i16 = i5 << 3;
                int i17 = i5 >> 6;
                ml4 ml45 = i15;
                boolean z8 = z3;
                b(ml45, z6, z8, n973, ap4, hr6.a(r16.D, yt22), yt22, (i17 & 7168) | (i16 & 112) | (i17 & 896) | (i16 & 57344));
                z5 = z8;
                n972 = n973;
                ml42 = ml43;
            } else {
                yt2.Y();
                ml42 = ml4;
                z5 = z3;
            }
            v = yt2.v();
            if (v == null) {
                v.d = new uo0(z, vr2, ml42, z5, n972, i11, i2, 2);
                return;
            }
            return;
        }
        z3 = z2;
        if ((196608 & i11) != 0) {
        }
        i4 = i12 | 1572864;
        boolean z72 = true;
        if ((599187 & i4) == 599186) {
        }
        if (!yt22.V(i4 & 1, z4)) {
        }
        v = yt2.v();
        if (v == null) {
        }
    }

    public static final void b(ml4 ml4, boolean z, boolean z2, n97 n97, ef3 ef3, pq6 pq6, yt2 yt2, int i) {
        int i2;
        boolean z3;
        long j;
        long j2;
        long j3;
        long j4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        ml4 ml42 = ml4;
        boolean z4 = z;
        boolean z5 = z2;
        n97 n972 = n97;
        ef3 ef32 = ef3;
        pq6 pq62 = pq6;
        yt2 yt22 = yt2;
        int i10 = i;
        yt22.g0(-670917213);
        if ((i10 & 6) == 0) {
            if (yt22.g(ml42)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i10;
        } else {
            i2 = i10;
        }
        if ((i10 & 48) == 0) {
            if (yt22.h(z4)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i10 & 384) == 0) {
            if (yt22.h(z5)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i10 & 3072) == 0) {
            if (yt22.g(n972)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i10 & 24576) == 0) {
            if (yt22.i((Object) null)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i10) == 0) {
            if (yt22.g(ef32)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i10) == 0) {
            if (yt22.g(pq62)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i2 & 1, z3)) {
            if (z5) {
                if (z4) {
                    j = n972.b;
                } else {
                    j = n972.f;
                }
            } else if (z4) {
                j = n972.j;
            } else {
                j = n972.n;
            }
            if (z5) {
                if (z4) {
                    j2 = n972.a;
                } else {
                    j2 = n972.e;
                }
            } else if (z4) {
                j2 = n972.i;
            } else {
                j2 = n972.m;
            }
            pq6 a2 = hr6.a(r16.M, yt22);
            yy0 yy0 = d86.a;
            p86 p86 = ((q86) yt22.k(yy0)).a;
            float f2 = r16.L;
            if (z5) {
                j3 = j2;
                if (z4) {
                    j4 = n972.c;
                } else {
                    j4 = n972.g;
                }
            } else {
                j3 = j2;
                if (z4) {
                    j4 = n972.k;
                } else {
                    j4 = n972.o;
                }
            }
            ml4 h = b96.h(ml42.d(new ta0(f2, new ky6(j4), a2)), j, a2);
            jl4 jl4 = jl4.w;
            ml4 d2 = h.d(jl4);
            lh4 d3 = mb0.d(xb4.y, false);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, d2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, d3);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            ml4 d4 = qb0.a.a(jl4, xb4.B).d(new vh7(ef32, z4, hj8.H(vm4.x, yt22)));
            float f3 = r16.J / 2.0f;
            p86 p862 = ((q86) yt22.k(yy0)).a;
            ml4 h2 = b96.h(la3.a(d4, ef32, d86.a(false, f3, 0, (pq6) null, 220)), j3, pq62);
            lh4 d5 = mb0.d(xb4.C, false);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, h2);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, d5);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E2);
            yt22.e0(1236071411);
            yt22.r(false);
            yt22.r(true);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new o97(ml4, z4, z2, n97, ef3, pq62, i10);
        }
    }
}
