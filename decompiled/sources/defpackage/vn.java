package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* renamed from: vn  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vn {
    public static final float a = 4.0f;
    public static final float b = (16.0f - 4.0f);

    static {
        new rc1(0.8f, 0.0f, 0.8f, 0.15f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void a(fw0 fw0, ml4 ml4, fw0 fw02, hs2 hs2, float f, aa8 aa8, fk7 fk7, la5 la5, yt2 yt2, int i, int i2) {
        int i3;
        ml4 ml42;
        int i4;
        fw0 fw03;
        int i5;
        boolean z;
        pa5 pa5;
        aa8 aa82;
        float f2;
        hs2 hs22;
        ml4 ml43;
        yx5 v;
        float f3;
        e64 e64;
        int i6;
        ml4 ml44;
        float f4;
        ml4 ml45;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        yt2 yt22 = yt2;
        int i12 = i;
        yt22.g0(-1109867978);
        fw0 fw04 = fw0;
        if ((i12 & 6) == 0) {
            if (yt22.i(fw04)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i12;
        } else {
            i3 = i12;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i12 & 48) == 0) {
            ml42 = ml4;
            if (yt22.g(ml42)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
            fw0 fw05 = fw02;
            if ((i12 & 384) == 0) {
                if (yt22.i(fw05)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i3 |= i9;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i12 & 3072) == 0) {
                fw03 = hs2;
                if (yt22.i(fw03)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
                int i14 = i3 | 24576;
                if ((196608 & i12) == 0) {
                    i14 = 90112 | i3;
                }
                fk7 fk72 = fk7;
                if ((1572864 & i12) == 0) {
                    if (yt22.g(fk72)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i14 |= i7;
                }
                i5 = 113246208 | i14;
                if ((38347923 & i5) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt22.V(i5 & 1, z)) {
                    yt22.a0();
                    if ((i12 & 1) == 0 || yt22.C()) {
                        if (i13 != 0) {
                            ml45 = jl4.w;
                        } else {
                            ml45 = ml42;
                        }
                        if (i4 != 0) {
                            fw03 = we.f;
                        }
                        float f5 = gk7.b;
                        ml4 ml46 = ml45;
                        i6 = i5 & -458753;
                        ml44 = ml46;
                        f3 = f5;
                        e64 = gk7.b(yt22);
                        pa5 = gk7.a;
                    } else {
                        yt22.Y();
                        f3 = f;
                        e64 = aa8;
                        pa5 = la5;
                        i6 = i5 & -458753;
                        ml44 = ml42;
                    }
                    yt22.s();
                    int i15 = i6;
                    tg7 a2 = dr7.a(rj1.a, yt22);
                    tg7 tg7 = tg7.d;
                    int i16 = i15;
                    g80 g80 = xb4.L;
                    if (lx1.b(f3, Float.NaN) || lx1.b(f3, Float.POSITIVE_INFINITY)) {
                        f4 = gk7.b;
                    } else {
                        f4 = f3;
                    }
                    int i17 = i16 << 3;
                    int i18 = i16 << 12;
                    b(ml44, fw04, a2, tg7, g80, fw05, fw03, f4, pa5, e64, fk72, yt22, ((i16 >> 3) & 14) | 224256 | (i17 & 112) | (i18 & 3670016) | (i18 & 29360128) | (i17 & 1879048192), (i16 >> 15) & 1022);
                    ml43 = ml44;
                    hs22 = fw03;
                    aa82 = e64;
                    f2 = f3;
                } else {
                    yt2.Y();
                    f2 = f;
                    pa5 = la5;
                    ml43 = ml42;
                    hs22 = fw03;
                    aa82 = aa8;
                }
                v = yt2.v();
                if (v != null) {
                    v.d = new nn(fw0, ml43, fw02, hs22, f2, aa82, fk7, pa5, i12, i2, 1);
                    return;
                }
                return;
            }
            fw03 = hs2;
            int i142 = i3 | 24576;
            if ((196608 & i12) == 0) {
            }
            fk7 fk722 = fk7;
            if ((1572864 & i12) == 0) {
            }
            i5 = 113246208 | i142;
            if ((38347923 & i5) != 38347922) {
            }
            if (yt22.V(i5 & 1, z)) {
            }
            v = yt2.v();
            if (v != null) {
            }
        }
        ml42 = ml4;
        fw0 fw052 = fw02;
        if ((i12 & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        fw03 = hs2;
        int i1422 = i3 | 24576;
        if ((196608 & i12) == 0) {
        }
        fk7 fk7222 = fk7;
        if ((1572864 & i12) == 0) {
        }
        i5 = 113246208 | i1422;
        if ((38347923 & i5) != 38347922) {
        }
        if (yt22.V(i5 & 1, z)) {
        }
        v = yt2.v();
        if (v != null) {
        }
    }

    public static final void b(ml4 ml4, fw0 fw0, tg7 tg7, tg7 tg72, g80 g80, fw0 fw02, hs2 hs2, float f, la5 la5, aa8 aa8, fk7 fk7, yt2 yt2, int i, int i2) {
        int i3;
        fw0 fw03;
        tg7 tg73;
        int i4;
        boolean z;
        yt2 yt22;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ml4 ml42 = ml4;
        hs2 hs22 = hs2;
        aa8 aa82 = aa8;
        fk7 fk72 = fk7;
        yt2 yt23 = yt2;
        int i18 = i;
        int i19 = i2;
        yt23.g0(703932376);
        if ((i18 & 6) == 0) {
            if (yt23.g(ml42)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i3 = i17 | i18;
        } else {
            i3 = i18;
        }
        if ((i18 & 48) == 0) {
            fw03 = fw0;
            if (yt23.i(fw03)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i3 |= i16;
        } else {
            fw03 = fw0;
        }
        if ((i18 & 384) == 0) {
            if (yt23.g(tg7)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i3 |= i15;
        } else {
            tg7 tg74 = tg7;
        }
        if ((i18 & 3072) == 0) {
            if (yt23.i((Object) null)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i3 |= i14;
        }
        if ((i18 & 24576) == 0) {
            tg73 = tg72;
            if (yt23.g(tg73)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i3 |= i13;
        } else {
            tg73 = tg72;
        }
        g80 g802 = g80;
        if ((i18 & 196608) == 0) {
            if (yt23.g(g802)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i3 |= i12;
        }
        fw0 fw04 = fw02;
        if ((i18 & 1572864) == 0) {
            if (yt23.i(fw04)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        if ((i18 & 12582912) == 0) {
            if (yt23.i(hs22)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i3 |= i10;
        }
        float f2 = f;
        if ((i18 & 100663296) == 0) {
            if (yt23.d(f2)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i3 |= i9;
        }
        la5 la52 = la5;
        if ((i18 & 805306368) == 0) {
            if (yt23.g(la52)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i3 |= i8;
        }
        if ((i19 & 6) == 0) {
            if (yt23.g(aa82)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i4 = i19 | i7;
        } else {
            i4 = i19;
        }
        if ((i19 & 48) == 0) {
            if (yt23.g(fk72)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i19 & 384) == 0) {
            if (yt23.g((Object) null)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i4 |= i5;
        }
        int i20 = i4;
        if ((306783379 & i3) == 306783378 && (i20 & 147) == 146) {
            z = false;
        } else {
            z = true;
        }
        if (!yt23.V(i3 & 1, z)) {
            yt22 = yt23;
            yt22.Y();
        } else if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
            h.q("The expandedHeight is expected to be specified and finite");
            return;
        } else {
            if ((i20 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i21 = i20 & 896;
            if (i21 == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            Object Q = yt23.Q();
            Object obj = ay0.a;
            if (z5 || Q == obj) {
                Q = u55.i(new k3(4, fk72));
                yt23.o0(Q);
            }
            long j = ((jt0) ((a37) Q).getValue()).a;
            yt2 yt24 = yt23;
            long j2 = j;
            Object obj2 = obj;
            a37 a2 = ru6.a(j2, hj8.H(vm4.y, yt23), (String) null, yt24, 0, 12);
            yt2 yt25 = yt24;
            fw0 J = su0.J(1222546095, new on(hs22, 0), yt25);
            yt25.e0(-1473335574);
            yt25.r(false);
            jl4 jl4 = jl4.w;
            ml4 d = ml42.d(jl4);
            boolean g = yt25.g(a2);
            Object Q2 = yt25.Q();
            if (g || Q2 == obj2) {
                Q2 = new pn(0, a2);
                yt25.o0(Q2);
            }
            ml4 x = pv8.x(d, (vr2) Q2);
            Object Q3 = yt25.Q();
            if (Q3 == obj2) {
                Q3 = new j5(9);
                yt25.o0(Q3);
            }
            ml4 a3 = ck6.a(x, false, (vr2) Q3);
            Object Q4 = yt25.Q();
            if (Q4 == obj2) {
                Q4 = un.b;
                yt25.o0(Q4);
            }
            ml4 a4 = d97.a(a3, vs7.a, (PointerInputEventHandler) Q4);
            lh4 d2 = mb0.d(xb4.y, false);
            int hashCode = Long.hashCode(yt25.T);
            vf5 m = yt25.m();
            ml4 E = gw8.E(yt25, a4);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt25.i0();
            int i22 = hashCode;
            if (yt25.S) {
                yt25.l(vy0);
            } else {
                yt25.r0();
            }
            g75.Q(tx0.f, yt25, d2);
            g75.Q(tx0.e, yt25, m);
            g75.Q(tx0.g, yt25, Integer.valueOf(i22));
            g75.O(yt25, tx0.h);
            g75.Q(tx0.d, yt25, E);
            ml4 g2 = we.g(x91.T(jl4, aa82));
            if (i21 == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object Q5 = yt25.Q();
            if (z4 || Q5 == obj2) {
                Q5 = new qn(0);
                yt25.o0(Q5);
            }
            long j3 = fk72.c;
            nh2 nh2 = (nh2) Q5;
            long j4 = fk72.d;
            long j5 = fk72.e;
            long j6 = fk72.f;
            Object Q6 = yt25.Q();
            if (Q6 == obj2) {
                Q6 = new o(4);
                yt25.o0(Q6);
            }
            int i23 = i3 >> 3;
            long j7 = j6;
            tg7 tg75 = tg73;
            g80 g803 = g802;
            fw0 fw05 = fw03;
            yt2 yt26 = yt25;
            nh2 nh22 = nh2;
            d(g2, nh22, j3, j4, j7, j5, fw05, tg7, tg75, (sr2) Q6, g803, fw02, J, f, la5, yt26, (i3 << 15) & 2146959360, ((i3 >> 9) & 896) | 1600566 | (458752 & i23) | (29360128 & i23) | (i23 & 234881024));
            yt22 = yt26;
            yt22.r(true);
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new rn(ml4, fw0, tg7, tg72, g80, fw02, hs22, f, la5, aa82, fk72, i, i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void c(fw0 fw0, ml4 ml4, fw0 fw02, hs2 hs2, float f, aa8 aa8, fk7 fk7, la5 la5, yt2 yt2, int i, int i2) {
        int i3;
        ml4 ml42;
        int i4;
        fw0 fw03;
        fk7 fk72;
        int i5;
        boolean z;
        la5 la52;
        fk7 fk73;
        aa8 aa82;
        float f2;
        hs2 hs22;
        ml4 ml43;
        yx5 v;
        float f3;
        fk7 fk74;
        e64 e64;
        int i6;
        ml4 ml44;
        float f4;
        ml4 ml45;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        yt2 yt22 = yt2;
        int i13 = i;
        yt22.g0(660588393);
        fw0 fw04 = fw0;
        if ((i13 & 6) == 0) {
            if (yt22.i(fw04)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i3 = i12 | i13;
        } else {
            i3 = i13;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i13 & 48) == 0) {
            ml42 = ml4;
            if (yt22.g(ml42)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i3 |= i11;
            fw0 fw05 = fw02;
            if ((i13 & 384) == 0) {
                if (yt22.i(fw05)) {
                    i10 = 256;
                } else {
                    i10 = 128;
                }
                i3 |= i10;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i13 & 3072) == 0) {
                fw03 = hs2;
                if (yt22.i(fw03)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i3 |= i9;
                int i15 = i3 | 24576;
                if ((196608 & i13) == 0) {
                    i15 = 90112 | i3;
                }
                if ((1572864 & i13) == 0) {
                    if ((i2 & 64) == 0) {
                        fk72 = fk7;
                        if (yt22.g(fk72)) {
                            i8 = 1048576;
                            i15 |= i8;
                        }
                    } else {
                        fk72 = fk7;
                    }
                    i8 = 524288;
                    i15 |= i8;
                } else {
                    fk72 = fk7;
                }
                i5 = i15 | 113246208;
                if ((38347923 & i5) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt22.V(i5 & 1, z)) {
                    yt22.a0();
                    if ((i13 & 1) == 0 || yt22.C()) {
                        if (i14 != 0) {
                            ml45 = jl4.w;
                        } else {
                            ml45 = ml42;
                        }
                        if (i4 != 0) {
                            fw03 = we.e;
                        }
                        float f5 = gk7.b;
                        e64 b2 = gk7.b(yt22);
                        int i16 = i5 & -458753;
                        if ((i2 & 64) != 0) {
                            fk72 = gk7.a(((zg4) yt22.k(ch4.b)).a);
                            i7 = i5 & -4128769;
                        } else {
                            i7 = i16;
                        }
                        la52 = gk7.a;
                        fk74 = fk72;
                        ml44 = ml45;
                        f3 = f5;
                        e64 = b2;
                        i6 = i7;
                    } else {
                        yt22.Y();
                        i6 = i5 & -458753;
                        if ((i2 & 64) != 0) {
                            i6 = i5 & -4128769;
                        }
                        f3 = f;
                        e64 = aa8;
                        la52 = la5;
                        fk74 = fk72;
                        ml44 = ml42;
                    }
                    yt22.s();
                    int i17 = i6;
                    tg7 a2 = dr7.a(rj1.a, yt22);
                    tg7 tg7 = tg7.d;
                    g80 g80 = xb4.K;
                    if (lx1.b(f3, Float.NaN) || lx1.b(f3, Float.POSITIVE_INFINITY)) {
                        f4 = gk7.b;
                    } else {
                        f4 = f3;
                    }
                    int i18 = i17 << 3;
                    int i19 = i17 << 12;
                    b(ml44, fw04, a2, tg7, g80, fw05, fw03, f4, la52, e64, fk74, yt22, ((i17 >> 3) & 14) | 224256 | (i18 & 112) | (i19 & 3670016) | (i19 & 29360128) | (i18 & 1879048192), (i17 >> 15) & 1022);
                    ml43 = ml44;
                    hs22 = fw03;
                    aa82 = e64;
                    fk73 = fk74;
                    f2 = f3;
                } else {
                    yt2.Y();
                    f2 = f;
                    la52 = la5;
                    fk73 = fk72;
                    ml43 = ml42;
                    hs22 = fw03;
                    aa82 = aa8;
                }
                v = yt2.v();
                if (v != null) {
                    v.d = new nn(fw0, ml43, fw02, hs22, f2, aa82, fk73, la52, i13, i2, 0);
                    return;
                }
                return;
            }
            fw03 = hs2;
            int i152 = i3 | 24576;
            if ((196608 & i13) == 0) {
            }
            if ((1572864 & i13) == 0) {
            }
            i5 = i152 | 113246208;
            if ((38347923 & i5) != 38347922) {
            }
            if (yt22.V(i5 & 1, z)) {
            }
            v = yt2.v();
            if (v != null) {
            }
        }
        ml42 = ml4;
        fw0 fw052 = fw02;
        if ((i13 & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        fw03 = hs2;
        int i1522 = i3 | 24576;
        if ((196608 & i13) == 0) {
        }
        if ((1572864 & i13) == 0) {
        }
        i5 = i1522 | 113246208;
        if ((38347923 & i5) != 38347922) {
        }
        if (yt22.V(i5 & 1, z)) {
        }
        v = yt2.v();
        if (v != null) {
        }
    }

    public static final void d(ml4 ml4, nh2 nh2, long j, long j2, long j3, long j4, fw0 fw0, tg7 tg7, tg7 tg72, sr2 sr2, g80 g80, fw0 fw02, fw0 fw03, float f, la5 la5, yt2 yt2, int i, int i2) {
        int i3;
        int i4;
        g80 g802;
        fw0 fw04;
        boolean z;
        ml4 ml42 = ml4;
        nh2 nh22 = nh2;
        long j5 = j;
        long j6 = j4;
        fw0 fw05 = fw02;
        fw0 fw06 = fw03;
        float f2 = f;
        la5 la52 = la5;
        yt2 yt22 = yt2;
        int i5 = i;
        int i6 = i2;
        yt22.g0(239553141);
        if ((i5 & 6) == 0) {
            i3 = i5 | (yt22.g(ml42) ? 4 : 2);
        } else {
            i3 = i5;
        }
        int i7 = 16;
        if ((i5 & 48) == 0) {
            i3 |= (i5 & 64) == 0 ? yt22.g(nh22) : yt22.i(nh22) ? 32 : 16;
        }
        int i8 = 128;
        if ((i5 & 384) == 0) {
            i3 |= yt22.f(j5) ? 256 : 128;
        }
        int i9 = 1024;
        long j7 = j2;
        if ((i5 & 3072) == 0) {
            i3 |= yt22.f(j7) ? 2048 : 1024;
        }
        long j8 = j3;
        if ((i5 & 24576) == 0) {
            i3 |= yt22.f(j8) ? 16384 : 8192;
        }
        int i10 = 65536;
        if ((i5 & 196608) == 0) {
            i3 |= yt22.f(j6) ? 131072 : 65536;
        }
        int i11 = 524288;
        fw0 fw07 = fw0;
        if ((i5 & 1572864) == 0) {
            i3 |= yt22.i(fw07) ? 1048576 : 524288;
        }
        int i12 = i5 & 12582912;
        int i13 = 4194304;
        tg7 tg73 = tg7;
        if (i12 == 0) {
            i3 |= yt22.g(tg73) ? 8388608 : 4194304;
        }
        int i14 = 33554432;
        if ((i & 100663296) == 0) {
            i3 |= yt22.i((Object) null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= yt22.g(tg72) ? 536870912 : 268435456;
        } else {
            tg7 tg74 = tg72;
        }
        sr2 sr22 = sr2;
        if ((i6 & 6) == 0) {
            i4 = i6 | (yt22.i(sr22) ? 4 : 2);
        } else {
            i4 = i6;
        }
        if ((i6 & 48) == 0) {
            if (yt22.g(wr.e)) {
                i7 = 32;
            }
            i4 |= i7;
        }
        if ((i6 & 384) == 0) {
            g802 = g80;
            if (yt22.g(g802)) {
                i8 = 256;
            }
            i4 |= i8;
        } else {
            g802 = g80;
        }
        if ((i6 & 3072) == 0) {
            if (yt22.e(0)) {
                i9 = 2048;
            }
            i4 |= i9;
        }
        if ((i6 & 24576) == 0) {
            i4 |= yt22.h(false) ? 16384 : 8192;
        }
        if ((i6 & 196608) == 0) {
            if (yt22.i(fw05)) {
                i10 = 131072;
            }
            i4 |= i10;
        }
        if ((i6 & 1572864) == 0) {
            if (yt22.i(fw06)) {
                i11 = 1048576;
            }
            i4 |= i11;
        }
        if ((i6 & 12582912) == 0) {
            if (yt22.d(f2)) {
                i13 = 8388608;
            }
            i4 |= i13;
        }
        if ((i6 & 100663296) == 0) {
            if (yt22.g(la52)) {
                i14 = 67108864;
            }
            i4 |= i14;
        }
        int i15 = i4;
        if (yt22.V(i3 & 1, ((i3 & 306783379) == 306783378 && (38347923 & i15) == 38347922) ? false : true)) {
            boolean z2 = ((i15 & 112) == 32) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && yt22.g(nh22))) | ((i15 & 896) == 256) | ((i15 & 7168) == 2048) | ((29360128 & i15) == 8388608);
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (z2 || Q == d63) {
                Q = new jk7(nh22, g802, f2, la52);
                yt22.o0(Q);
            }
            jk7 jk7 = (jk7) Q;
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, ml42);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            int i16 = hashCode;
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, jk7);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(i16);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            int i17 = i15;
            jl4 jl4 = jl4.w;
            ml4 w0 = rc9.w0(jl4, "navigationIcon");
            float f3 = a;
            ml4 O = x91.O(w0, f3, 0.0f, 0.0f, 0.0f, 14);
            float f4 = f3;
            i80 i80 = xb4.y;
            d63 d632 = d63;
            lh4 d = mb0.d(i80, false);
            i80 i802 = i80;
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, O);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, d);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E2);
            yy0 yy0 = j41.a;
            t49.c(b81.g(j5, yy0), fw05, yt22, ((i17 >> 12) & 112) | 8);
            yt22.r(true);
            yt22.e0(408520308);
            float f5 = f3;
            ml4 M = x91.M(rc9.w0(jl4, "title"), f5, 0.0f, 2);
            yt22.e0(-402451802);
            yt22.r(false);
            ml4 d2 = M.d(jl4);
            boolean z3 = (i17 & 14) == 4;
            Object Q2 = yt22.Q();
            if (z3 || Q2 == d632) {
                z = false;
                Q2 = new sn(0, sr2);
                yt22.o0(Q2);
            } else {
                sr2 sr23 = sr2;
                z = false;
            }
            ml4 X = mp7.X(d2, (vr2) Q2);
            i80 i803 = i802;
            lh4 d3 = mb0.d(i803, z);
            float f6 = f5;
            int hashCode3 = Long.hashCode(yt22.T);
            vf5 m3 = yt22.m();
            ml4 E3 = gw8.E(yt22, X);
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
            a35.a(j2, tg7, fw0, yt22, ((i3 >> 9) & 14) | ((i3 >> 18) & 112) | ((i3 >> 12) & 896));
            yt22.r(true);
            yt22.r(false);
            ml4 O2 = x91.O(rc9.w0(jl4, "actionIcons"), 0.0f, 0.0f, f6, 0.0f, 11);
            lh4 d4 = mb0.d(i803, false);
            int hashCode4 = Long.hashCode(yt22.T);
            vf5 m4 = yt22.m();
            ml4 E4 = gw8.E(yt22, O2);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, d4);
            g75.Q(ckVar2, yt22, m4);
            f21.s(hashCode4, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E4);
            j6 = j4;
            fw04 = fw03;
            t49.c(yy0.a(new jt0(j6)), fw04, yt22, 8 | ((i17 >> 15) & 112));
            yt22.r(true);
            yt22.r(true);
        } else {
            fw04 = fw03;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new tn(ml4, nh2, j, j2, j3, j6, fw0, tg7, tg72, sr2, g80, fw02, fw04, f, la5, i, i2);
        }
    }
}
