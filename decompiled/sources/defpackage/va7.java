package defpackage;

/* renamed from: va7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class va7 {
    public static final float a = jo5.c;
    public static final float b = 72.0f;
    public static final float c = 16.0f;
    public static final float d = 14.0f;
    public static final float e = 6.0f;
    public static final long f = ya5.k(20);

    static {
        rt0 rt0 = jo5.a;
    }

    public static final void a(boolean z, sr2 sr2, ml4 ml4, boolean z2, long j, long j2, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        yt2 yt22 = yt2;
        int i11 = i;
        yt22.g0(-1573136853);
        boolean z4 = z;
        if ((i11 & 6) == 0) {
            if (yt22.h(z4)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i11;
        } else {
            i2 = i11;
        }
        sr2 sr22 = sr2;
        if ((i11 & 48) == 0) {
            if (yt22.i(sr22)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        ml4 ml42 = ml4;
        if ((i11 & 384) == 0) {
            if (yt22.g(ml42)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        boolean z5 = z2;
        if ((i11 & 3072) == 0) {
            if (yt22.h(z5)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        long j3 = j;
        if ((i11 & 24576) == 0) {
            if (yt22.f(j3)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        long j4 = j2;
        if ((196608 & i11) == 0) {
            if (yt22.f(j4)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((1572864 & i11) == 0) {
            if (yt22.g((Object) null)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        fw0 fw02 = fw0;
        if ((12582912 & i11) == 0) {
            if (yt22.i(fw02)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        if ((4793491 & i2) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i2 & 1, z3)) {
            yt22.a0();
            if ((i11 & 1) != 0 && !yt22.C()) {
                yt22.Y();
            }
            yt22.s();
            int i12 = i2 >> 12;
            int i13 = (i2 << 6) & 896;
            long j5 = j4;
            int i14 = i13 | (i12 & 112) | (i12 & 14) | 3072;
            long j6 = j;
            d(j6, j5, z, su0.J(1128552423, new ra7(ml42, z4, d86.a(true, 0.0f, j3, (pq6) null, 250), z5, sr22, fw02), yt22), yt22, i14);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new sa7(z, sr2, ml4, z2, j, j2, fw0, i11);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void b(boolean z, sr2 sr2, ml4 ml4, boolean z2, gs2 gs2, gs2 gs22, long j, long j2, yt2 yt2, int i, int i2) {
        int i3;
        int i4;
        ml4 ml42;
        int i5;
        gs2 gs23;
        int i6;
        gs2 gs24;
        int i7;
        boolean z3;
        long j3;
        long j4;
        gs2 gs25;
        gs2 gs26;
        boolean z4;
        ml4 ml43;
        yx5 v;
        ml4 ml44;
        gs2 gs27;
        ml4 ml45;
        int i8;
        long j5;
        long j6;
        boolean z5;
        int i9;
        int i10;
        int i11;
        yt2 yt22 = yt2;
        int i12 = i;
        yt22.g0(1015017965);
        boolean z6 = z;
        if (yt22.h(z6)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i13 = i3 | i12;
        if (yt22.i(sr2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i14 = i13 | i4;
        int i15 = i2 & 4;
        if (i15 != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            ml42 = ml4;
            if (yt22.g(ml42)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i14 |= i11;
            int i16 = i14 | 3072;
            i5 = i2 & 16;
            if (i5 == 0) {
                i16 = i14 | 27648;
            } else if ((i12 & 24576) == 0) {
                gs23 = gs2;
                if (yt22.i(gs23)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i16 |= i10;
                i6 = i2 & 32;
                if (i6 != 0) {
                    i16 |= 196608;
                } else if ((196608 & i12) == 0) {
                    gs24 = gs22;
                    if (yt22.i(gs24)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i16 |= i9;
                    i7 = i16 | 105381888;
                    if ((38347923 & i7) == 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!yt22.V(i7 & 1, z3)) {
                        yt22.a0();
                        fw0 fw0 = null;
                        if ((i12 & 1) == 0 || yt22.C()) {
                            if (i15 != 0) {
                                ml44 = jl4.w;
                            } else {
                                ml44 = ml42;
                            }
                            if (i5 != 0) {
                                gs23 = null;
                            }
                            if (i6 != 0) {
                                gs24 = null;
                            }
                            gs27 = gs23;
                            ml45 = ml44;
                            i8 = i7 & -33030145;
                            j5 = ((jt0) yt22.k(j41.a)).a;
                            j6 = j5;
                            z5 = true;
                        } else {
                            yt22.Y();
                            int i17 = i7 & -33030145;
                            z5 = z2;
                            j6 = j2;
                            gs27 = gs23;
                            i8 = i17;
                            ml45 = ml42;
                            j5 = j;
                        }
                        gs2 gs28 = gs24;
                        yt22.s();
                        if (gs27 == null) {
                            yt22.e0(1830887765);
                            yt22.r(false);
                        } else {
                            yt22.e0(1830887766);
                            fw0 = su0.J(-1745256900, new sa(6, gs27), yt22);
                            yt22.r(false);
                        }
                        a(z6, sr2, we.D(ml45, new nw0(4)), z5, j5, j6, su0.J(-906085472, new gc5(24, (Object) fw0, (Object) gs28), yt22), yt22, 1575936 | (i8 & 112) | (i8 & 14) | 12582912);
                        j3 = j6;
                        gs25 = gs28;
                        j4 = j5;
                        gs26 = gs27;
                        z4 = z5;
                        ml43 = ml45;
                    } else {
                        yt2.Y();
                        z4 = z2;
                        j4 = j;
                        ml43 = ml42;
                        gs25 = gs24;
                        j3 = j2;
                        gs26 = gs23;
                    }
                    v = yt2.v();
                    if (v == null) {
                        v.d = new qa7(z, sr2, ml43, z4, gs26, gs25, j4, j3, i12, i2);
                        return;
                    }
                    return;
                }
                gs24 = gs22;
                i7 = i16 | 105381888;
                if ((38347923 & i7) == 38347922) {
                }
                if (!yt22.V(i7 & 1, z3)) {
                }
                v = yt2.v();
                if (v == null) {
                }
            }
            gs23 = gs2;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            gs24 = gs22;
            i7 = i16 | 105381888;
            if ((38347923 & i7) == 38347922) {
            }
            if (!yt22.V(i7 & 1, z3)) {
            }
            v = yt2.v();
            if (v == null) {
            }
        }
        ml42 = ml4;
        int i162 = i14 | 3072;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        gs23 = gs2;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        gs24 = gs22;
        i7 = i162 | 105381888;
        if ((38347923 & i7) == 38347922) {
        }
        if (!yt22.V(i7 & 1, z3)) {
        }
        v = yt2.v();
        if (v == null) {
        }
    }

    public static final void c(gs2 gs2, gs2 gs22, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        ce ceVar;
        boolean z5;
        gs2 gs23 = gs2;
        gs2 gs24 = gs22;
        yt2 yt22 = yt2;
        i80 i80 = xb4.y;
        yt22.g0(-1349901398);
        if (yt22.i(gs23)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (yt22.i(gs24)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i6 & 1, z)) {
            int i7 = i6 & 14;
            if (i7 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i6 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = z2 | z3;
            Object Q = yt22.Q();
            if (z6 || Q == ay0.a) {
                Q = new sh(2, gs23, gs24);
                yt22.o0(Q);
            }
            lh4 lh4 = (lh4) Q;
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            jl4 jl4 = jl4.w;
            ml4 E = gw8.E(yt22, jl4);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, lh4);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar2 = tx0.h;
            g75.O(yt22, ceVar2);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            if (gs23 != null) {
                yt22.e0(870361332);
                i4 = i6;
                ml4 M = x91.M(rc9.w0(jl4, "text"), c, 0.0f, 2);
                lh4 d2 = mb0.d(i80, false);
                ce ceVar3 = ceVar2;
                int hashCode2 = Long.hashCode(yt22.T);
                vf5 m2 = yt22.m();
                ml4 E2 = gw8.E(yt22, M);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(ckVar, yt22, d2);
                g75.Q(ckVar2, yt22, m2);
                ceVar = ceVar3;
                f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
                g75.Q(ckVar4, yt22, E2);
                z4 = false;
                pb4.q(i7, gs23, yt22, true, false);
            } else {
                i4 = i6;
                ceVar = ceVar2;
                z4 = false;
                yt22.e0(870466081);
                yt22.r(false);
            }
            if (gs24 != null) {
                yt22.e0(870494880);
                ml4 w0 = rc9.w0(jl4, "icon");
                lh4 d3 = mb0.d(i80, z4);
                int hashCode3 = Long.hashCode(yt22.T);
                vf5 m3 = yt22.m();
                ml4 E3 = gw8.E(yt22, w0);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(ckVar, yt22, d3);
                g75.Q(ckVar2, yt22, m3);
                f21.s(hashCode3, yt22, ckVar3, yt22, ceVar);
                g75.Q(ckVar4, yt22, E3);
                z5 = true;
                pb4.q((i4 >> 3) & 14, gs24, yt22, true, false);
            } else {
                z5 = true;
                yt22.e0(870557345);
                yt22.r(z4);
            }
            yt22.r(z5);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new db(gs23, gs24, i, 2);
        }
    }

    /* JADX INFO: finally extract failed */
    public static final void d(long j, long j2, boolean z, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z2;
        boolean z3;
        long j3;
        Object obj;
        boolean z4;
        int i3;
        long j4;
        long j5;
        boolean z5;
        je2 je2;
        vr2 vr2;
        int i4;
        int i5;
        int i6;
        int i7;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i8 = i;
        yt22.g0(-833145221);
        long j6 = j;
        if ((i8 & 6) == 0) {
            if (yt22.f(j6)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i8;
        } else {
            i2 = i8;
        }
        long j7 = j2;
        if ((i8 & 48) == 0) {
            if (yt22.f(j7)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i8 & 384) == 0) {
            z2 = z;
            if (yt22.h(z2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        } else {
            z2 = z;
        }
        if ((i8 & 3072) == 0) {
            if (yt22.i(fw02)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i2 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i2 & 1, z3)) {
            int i9 = i2 >> 6;
            mm7 d1 = rc9.d1(Boolean.valueOf(z2), (String) null, yt22, i9 & 14, 2);
            in8 in8 = d1.a;
            boolean booleanValue = ((Boolean) d1.d.getValue()).booleanValue();
            yt22.e0(-1069234984);
            if (booleanValue) {
                j3 = j6;
            } else {
                j3 = j7;
            }
            yt22.r(false);
            tt0 f2 = jt0.f(j3);
            boolean g = yt22.g(f2);
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (g || Q == d63) {
                lo7 lo7 = new lo7(ce.M, new pb(7, f2));
                yt22.o0(lo7);
                Q = lo7;
            }
            lo7 lo72 = (lo7) Q;
            if (!d1.h()) {
                yt22.e0(1666573488);
                boolean g2 = yt22.g(d1);
                obj = yt22.Q();
                if (g2 || obj == d63) {
                    ix6 h = j45.h();
                    if (h != null) {
                        vr2 = h.e();
                    } else {
                        vr2 = null;
                    }
                    ix6 j8 = j45.j(h);
                    try {
                        Object H0 = in8.H0();
                        j45.m(h, j8, vr2);
                        yt22.o0(H0);
                        obj = H0;
                    } catch (Throwable th) {
                        j45.m(h, j8, vr2);
                        throw th;
                    }
                }
                yt22.r(false);
                z4 = false;
            } else {
                z4 = false;
                yt22.e0(1666827533);
                yt22.r(false);
                obj = in8.H0();
            }
            boolean booleanValue2 = ((Boolean) obj).booleanValue();
            yt22.e0(-1069234984);
            if (booleanValue2) {
                i3 = i9;
                j4 = j6;
            } else {
                i3 = i9;
                j4 = j7;
            }
            yt22.r(z4);
            jt0 jt0 = new jt0(j4);
            boolean g3 = yt22.g(d1);
            Object Q2 = yt22.Q();
            if (g3 || Q2 == d63) {
                Q2 = u55.i(new wo0(d1, 8));
                yt22.o0(Q2);
            }
            boolean booleanValue3 = ((Boolean) ((a37) Q2).getValue()).booleanValue();
            yt22.e0(-1069234984);
            if (booleanValue3) {
                j5 = j6;
            } else {
                j5 = j7;
            }
            yt22.r(false);
            jt0 jt02 = new jt0(j5);
            boolean g4 = yt22.g(d1);
            Object Q3 = yt22.Q();
            if (g4 || Q3 == d63) {
                Q3 = u55.i(new wo0(d1, 9));
                yt22.o0(Q3);
            }
            yt22.e0(1058649156);
            if (((gm7) ((a37) Q3).getValue()).c(Boolean.FALSE, Boolean.TRUE)) {
                yt22.e0(272207019);
                je2 = hj8.H(vm4.y, yt22);
                z5 = false;
                yt22.r(false);
            } else {
                z5 = false;
                yt22.e0(272326989);
                je2 = hj8.H(vm4.z, yt22);
                yt22.r(false);
            }
            yt22.r(z5);
            t49.c(b81.g(((jt0) rc9.F(d1, jt0, jt02, je2, lo72, yt22, 0).F.getValue()).a, j41.a), fw02, yt22, 8 | (i3 & 112));
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ta7(j6, j7, z2, fw02, i);
        }
    }
}
