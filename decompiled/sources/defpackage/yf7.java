package defpackage;

import java.util.Map;

/* renamed from: yf7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class yf7 {
    public static final yy0 a = new yy0((sr2) new pp5(25));

    public static final void a(tg7 tg7, gs2 gs2, yt2 yt2, int i) {
        int i2;
        boolean z;
        int i3;
        yt2.g0(15327438);
        if (yt2.g(tg7)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if ((i & 48) == 0) {
            if (yt2.i(gs2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i4 |= i3;
        }
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i4 & 1, z)) {
            yy0 yy0 = a;
            t49.c(yy0.a(((tg7) yt2.k(yy0)).d(tg7)), gs2, yt2, (i4 & 112) | 8);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new dj7((Object) tg7, (Object) gs2, i, 21);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0125  */
    public static final void b(String str, ml4 ml4, long j, long j2, am2 am2, ea7 ea7, long j3, rd7 rd7, hc7 hc7, long j4, int i, boolean z, int i2, int i3, tg7 tg7, yt2 yt2, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        long j5;
        int i10;
        int i11;
        am2 am22;
        int i12;
        ea7 ea72;
        int i13;
        int i14;
        rd7 rd72;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        tg7 tg72;
        int i23;
        int i24;
        boolean z2;
        int i25;
        long j6;
        hc7 hc72;
        rd7 rd73;
        long j7;
        ea7 ea73;
        am2 am23;
        long j8;
        long j9;
        ml4 ml42;
        yx5 v;
        long j10;
        long j11;
        tg7 tg73;
        hc7 hc73;
        long j12;
        int i26;
        int i27;
        ml4 ml43;
        int i28;
        ml4 ml44;
        long j13;
        yt2 yt22 = yt2;
        int i29 = i4;
        int i30 = i5;
        int i31 = i6;
        yt22.g0(1809465675);
        if ((i29 & 6) == 0) {
            i7 = (yt22.g(str) ? 4 : 2) | i29;
        } else {
            String str2 = str;
            i7 = i29;
        }
        int i32 = i31 & 2;
        if (i32 != 0) {
            i7 |= 48;
        } else if ((i29 & 48) == 0) {
            i7 |= yt22.g(ml4) ? 32 : 16;
            i8 = i31 & 4;
            if (i8 == 0) {
                i7 |= 384;
                long j14 = j;
            } else {
                long j15 = j;
                if ((i29 & 384) == 0) {
                    i7 |= yt22.f(j15) ? 256 : 128;
                }
            }
            int i33 = i7 | 3072;
            i9 = i31 & 16;
            int i34 = 8192;
            if (i9 == 0) {
                i33 = i7 | 27648;
                j5 = j2;
            } else {
                j5 = j2;
                if ((i29 & 24576) == 0) {
                    i33 |= yt22.f(j5) ? 16384 : 8192;
                }
            }
            i10 = i33 | 196608;
            i11 = i31 & 64;
            if (i11 == 0) {
                i10 = i33 | 1769472;
            } else if ((1572864 & i29) == 0) {
                am22 = am2;
                i10 |= yt22.g(am22) ? 1048576 : 524288;
                i12 = i31 & 128;
                int i35 = 4194304;
                if (i12 != 0) {
                    i10 |= 12582912;
                    ea72 = ea7;
                } else {
                    ea72 = ea7;
                    if ((i29 & 12582912) == 0) {
                        i10 |= yt22.g(ea72) ? 8388608 : 4194304;
                    }
                }
                i13 = i31 & 256;
                if (i13 != 0) {
                    i10 |= 100663296;
                    long j16 = j3;
                } else {
                    long j17 = j3;
                    if ((i29 & 100663296) == 0) {
                        i10 |= yt22.f(j17) ? 67108864 : 33554432;
                    }
                }
                i14 = i31 & 512;
                if (i14 != 0) {
                    i10 |= 805306368;
                    rd72 = rd7;
                } else {
                    rd72 = rd7;
                    if ((i29 & 805306368) == 0) {
                        i10 |= yt22.g(rd72) ? 536870912 : 268435456;
                    }
                }
                i15 = i31 & 1024;
                if (i15 != 0) {
                    i17 = i30 | 6;
                    i16 = i15;
                    hc7 hc74 = hc7;
                } else {
                    i16 = i15;
                    i17 = i30 | (yt22.g(hc7) ? 4 : 2);
                }
                i18 = i31 & 2048;
                if (i18 != 0) {
                    i17 |= 48;
                    long j18 = j4;
                } else {
                    long j19 = j4;
                    if ((i30 & 48) == 0) {
                        i17 |= yt22.f(j19) ? 32 : 16;
                    }
                }
                int i36 = i18;
                int i37 = i17;
                i19 = i31 & 4096;
                if (i19 != 0) {
                    i37 |= 384;
                } else if ((i30 & 384) == 0) {
                    i20 = i;
                    i37 |= yt22.e(i20) ? 256 : 128;
                    int i38 = i19;
                    int i39 = i37 | 3072;
                    i21 = i31 & 16384;
                    if (i21 == 0) {
                        i39 = i37 | 27648;
                    } else if ((i30 & 24576) == 0) {
                        if (yt22.e(i2)) {
                            i34 = 16384;
                        }
                        i39 |= i34;
                        i22 = i39 | 1769472;
                        if ((i30 & 12582912) == 0) {
                            tg7 tg74 = tg7;
                            if ((i31 & 131072) == 0 && yt22.g(tg74)) {
                                i35 = 8388608;
                            }
                            i22 |= i35;
                        } else {
                            tg7 tg75 = tg7;
                        }
                        int i40 = 0;
                        boolean z3 = true;
                        if (yt22.V(i10 & 1, (i10 & 306783379) == 306783378 || (i22 & 4793491) == 4793490)) {
                            yt22.a0();
                            if ((i4 & 1) == 0 || yt22.C()) {
                                ml43 = i32 != 0 ? jl4.w : ml4;
                                j11 = i8 != 0 ? jt0.g : j;
                                if (i9 != 0) {
                                    j5 = wg7.c;
                                }
                                hc73 = null;
                                if (i11 != 0) {
                                    am22 = null;
                                }
                                if (i12 != 0) {
                                    ea72 = null;
                                }
                                j10 = i13 != 0 ? wg7.c : j3;
                                if (i14 != 0) {
                                    rd72 = null;
                                }
                                if (i16 == 0) {
                                    hc73 = hc7;
                                }
                                j12 = i36 != 0 ? wg7.c : j4;
                                if (i38 != 0) {
                                    i20 = 1;
                                }
                                i26 = i21 != 0 ? Integer.MAX_VALUE : i2;
                                if ((i6 & 131072) != 0) {
                                    tg73 = (tg7) yt22.k(a);
                                    i22 &= -29360129;
                                } else {
                                    tg73 = tg7;
                                }
                                i27 = 1;
                            } else {
                                yt22.Y();
                                if ((i6 & 131072) != 0) {
                                    i22 &= -29360129;
                                }
                                ml43 = ml4;
                                j11 = j;
                                j10 = j3;
                                hc73 = hc7;
                                j12 = j4;
                                z3 = z;
                                i26 = i2;
                                i27 = i3;
                                tg73 = tg7;
                            }
                            yt22.s();
                            yt22.e0(-565217490);
                            if (j11 != 16) {
                                ml44 = ml43;
                                i28 = i27;
                                j13 = j11;
                            } else {
                                yt22.e0(-565216717);
                                j13 = tg73.b();
                                if (j13 != 16) {
                                    ml44 = ml43;
                                    i28 = i27;
                                } else {
                                    ml44 = ml43;
                                    i28 = i27;
                                    j13 = ((jt0) yt22.k(j41.a)).a;
                                }
                                yt22.r(false);
                            }
                            yt22.r(false);
                            if (hc73 != null) {
                                i40 = hc73.a;
                            }
                            tg7 e = tg7.e(tg73, j13, j5, am22, ea72, j10, rd72, i40, j12, 16609104);
                            int i41 = i22 << 6;
                            ml4 ml45 = ml44;
                            int i42 = i28;
                            t49.b(str, ml45, e, i20, z3, i26, i42, yt22, (i10 & 126) | 3072 | (57344 & i41) | 196608 | (i41 & 3670016) | 12582912 | ((i10 << 18) & 1879048192), 256);
                            i23 = i42;
                            ml42 = ml45;
                            i24 = i26;
                            tg72 = tg73;
                            z2 = z3;
                            j9 = j11;
                            hc72 = hc73;
                            ea73 = ea72;
                            j6 = j12;
                            am23 = am22;
                            rd7 rd74 = rd72;
                            i25 = i20;
                            j8 = j5;
                            rd73 = rd74;
                            j7 = j10;
                        } else {
                            yt2.Y();
                            rd7 rd75 = rd72;
                            i25 = i20;
                            j8 = j5;
                            rd73 = rd75;
                            ml42 = ml4;
                            j9 = j;
                            hc72 = hc7;
                            z2 = z;
                            i24 = i2;
                            i23 = i3;
                            tg72 = tg7;
                            am23 = am22;
                            ea73 = ea72;
                            j7 = j3;
                            j6 = j4;
                        }
                        v = yt2.v();
                        if (v != null) {
                            v.d = new xf7(str, ml42, j9, j8, am23, ea73, j7, rd73, hc72, j6, i25, z2, i24, i23, tg72, i4, i5, i6);
                            return;
                        }
                        return;
                    }
                    int i43 = i2;
                    i22 = i39 | 1769472;
                    if ((i30 & 12582912) == 0) {
                    }
                    int i402 = 0;
                    boolean z32 = true;
                    if (yt22.V(i10 & 1, (i10 & 306783379) == 306783378 || (i22 & 4793491) == 4793490)) {
                    }
                    v = yt2.v();
                    if (v != null) {
                    }
                }
                i20 = i;
                int i382 = i19;
                int i392 = i37 | 3072;
                i21 = i31 & 16384;
                if (i21 == 0) {
                }
                int i432 = i2;
                i22 = i392 | 1769472;
                if ((i30 & 12582912) == 0) {
                }
                int i4022 = 0;
                boolean z322 = true;
                if (yt22.V(i10 & 1, (i10 & 306783379) == 306783378 || (i22 & 4793491) == 4793490)) {
                }
                v = yt2.v();
                if (v != null) {
                }
            }
            am22 = am2;
            i12 = i31 & 128;
            int i352 = 4194304;
            if (i12 != 0) {
            }
            i13 = i31 & 256;
            if (i13 != 0) {
            }
            i14 = i31 & 512;
            if (i14 != 0) {
            }
            i15 = i31 & 1024;
            if (i15 != 0) {
            }
            i18 = i31 & 2048;
            if (i18 != 0) {
            }
            int i362 = i18;
            int i372 = i17;
            i19 = i31 & 4096;
            if (i19 != 0) {
            }
            i20 = i;
            int i3822 = i19;
            int i3922 = i372 | 3072;
            i21 = i31 & 16384;
            if (i21 == 0) {
            }
            int i4322 = i2;
            i22 = i3922 | 1769472;
            if ((i30 & 12582912) == 0) {
            }
            int i40222 = 0;
            boolean z3222 = true;
            if (yt22.V(i10 & 1, (i10 & 306783379) == 306783378 || (i22 & 4793491) == 4793490)) {
            }
            v = yt2.v();
            if (v != null) {
            }
        }
        ml4 ml46 = ml4;
        i8 = i31 & 4;
        if (i8 == 0) {
        }
        int i332 = i7 | 3072;
        i9 = i31 & 16;
        int i342 = 8192;
        if (i9 == 0) {
        }
        i10 = i332 | 196608;
        i11 = i31 & 64;
        if (i11 == 0) {
        }
        am22 = am2;
        i12 = i31 & 128;
        int i3522 = 4194304;
        if (i12 != 0) {
        }
        i13 = i31 & 256;
        if (i13 != 0) {
        }
        i14 = i31 & 512;
        if (i14 != 0) {
        }
        i15 = i31 & 1024;
        if (i15 != 0) {
        }
        i18 = i31 & 2048;
        if (i18 != 0) {
        }
        int i3622 = i18;
        int i3722 = i17;
        i19 = i31 & 4096;
        if (i19 != 0) {
        }
        i20 = i;
        int i38222 = i19;
        int i39222 = i3722 | 3072;
        i21 = i31 & 16384;
        if (i21 == 0) {
        }
        int i43222 = i2;
        i22 = i39222 | 1769472;
        if ((i30 & 12582912) == 0) {
        }
        int i402222 = 0;
        boolean z32222 = true;
        if (yt22.V(i10 & 1, (i10 & 306783379) == 306783378 || (i22 & 4793491) == 4793490)) {
        }
        v = yt2.v();
        if (v != null) {
        }
    }

    public static final void c(vl vlVar, ml4 ml4, long j, long j2, long j3, long j4, int i, boolean z, int i2, int i3, Map map, vr2 vr2, tg7 tg7, yt2 yt2, int i4, int i5, int i6) {
        ml4 ml42;
        int i7;
        long j5;
        int i8;
        long j6;
        int i9;
        long j7;
        tg7 tg72;
        vr2 vr22;
        Map map2;
        int i10;
        int i11;
        boolean z2;
        int i12;
        long j8;
        long j9;
        long j10;
        long j11;
        ml4 ml43;
        tg7 tg73;
        vr2 vr23;
        b42 b42;
        int i13;
        int i14;
        boolean z3;
        int i15;
        long j12;
        long j13;
        long j14;
        boolean z4;
        vl vlVar2 = vlVar;
        yt2 yt22 = yt2;
        int i16 = i4;
        int i17 = i6;
        yt22.g0(292247417);
        int i18 = (yt22.g(vlVar2) ? 4 : 2) | i16;
        int i19 = i17 & 2;
        if (i19 != 0) {
            i7 = i18 | 48;
            ml42 = ml4;
        } else {
            ml42 = ml4;
            i7 = i18 | (yt22.g(ml42) ? 32 : 16);
        }
        int i20 = i17 & 4;
        if (i20 != 0) {
            i8 = i7 | 384;
            j5 = j;
        } else {
            j5 = j;
            i8 = i7 | (yt22.f(j5) ? 256 : 128);
        }
        int i21 = i8 | 3072;
        int i22 = i17 & 16;
        if (i22 != 0) {
            i21 = i8 | 27648;
            j6 = j2;
        } else {
            j6 = j2;
            if ((i16 & 24576) == 0) {
                i21 |= yt22.f(j6) ? 16384 : 8192;
            }
        }
        int i23 = i21 | 920322048;
        int i24 = i5 | 6;
        int i25 = i17 & 2048;
        if (i25 != 0) {
            i24 = 54;
            i9 = i19;
            j7 = j4;
        } else {
            i9 = i19;
            j7 = j4;
            if ((i5 & 48) == 0) {
                i24 |= yt22.f(j7) ? 32 : 16;
            }
        }
        int i26 = i25;
        boolean z5 = true;
        if (yt22.V(i23 & 1, ((i23 & 306783379) == 306783378 && (38347923 & ((i24 | 14380416) | (((i17 & 262144) != 0 || !yt22.g(tg7)) ? 33554432 : 67108864))) == 38347922) ? false : true)) {
            yt22.a0();
            int i27 = i4 & 1;
            d63 d63 = ay0.a;
            if (i27 == 0 || yt22.C()) {
                ml43 = i9 != 0 ? jl4.w : ml42;
                if (i20 != 0) {
                    j5 = jt0.g;
                }
                if (i22 != 0) {
                    j6 = wg7.c;
                }
                j12 = wg7.c;
                if (i26 != 0) {
                    j7 = j12;
                }
                Object Q = yt22.Q();
                if (Q == d63) {
                    Q = new ha7(11);
                    yt22.o0(Q);
                }
                vr2 vr24 = (vr2) Q;
                int i28 = i6 & 262144;
                i14 = Integer.MAX_VALUE;
                b42 b422 = b42.w;
                if (i28 != 0) {
                    vr23 = vr24;
                    tg73 = (tg7) yt22.k(a);
                } else {
                    tg73 = tg7;
                    vr23 = vr24;
                }
                b42 = b422;
                i15 = 1;
                z3 = true;
                i13 = 1;
            } else {
                yt22.Y();
                i15 = i;
                z3 = z;
                i14 = i2;
                i13 = i3;
                b42 = map;
                vr23 = vr2;
                tg73 = tg7;
                ml43 = ml42;
                j12 = j3;
            }
            yt22.s();
            yt22.e0(1676919260);
            if (j5 != 16) {
                j13 = j7;
                j14 = j5;
                z4 = false;
            } else {
                yt22.e0(1676920033);
                j14 = tg73.b();
                if (j14 != 16) {
                    j13 = j7;
                } else {
                    j13 = j7;
                    j14 = ((jt0) yt22.k(j41.a)).a;
                }
                z4 = false;
                yt22.r(false);
            }
            yt22.r(z4);
            long j15 = ((zg4) yt22.k(ch4.b)).a.a;
            boolean f = yt22.f(j15);
            Object Q2 = yt22.Q();
            if (f || Q2 == d63) {
                Q2 = new gg7(new yy6(j15, 0, (am2) null, (yl2) null, (zl2) null, (ea7) null, (String) null, 0, (h60) null, (lf7) null, (ya4) null, 0, rd7.c, (lq6) null, 61438), (yy6) null, (yy6) null, (yy6) null);
                yt22.o0(Q2);
            }
            gg7 gg7 = (gg7) Q2;
            if ((i23 & 14) != 4) {
                z5 = false;
            }
            boolean g = z5 | yt22.g(gg7);
            Object Q3 = yt22.Q();
            if (g || Q3 == d63) {
                Q3 = vlVar2.b(new ay5(24, (Object) gg7));
                yt22.o0(Q3);
            }
            tg7 tg74 = tg73;
            int i29 = i15;
            boolean z6 = z3;
            int i30 = i13;
            Map map3 = b42;
            vr2 vr25 = vr23;
            t49.a((vl) Q3, ml43, tg7.e(tg74, j14, j6, (am2) null, (ea7) null, j12, (rd7) null, 0, j13, 16609104), vr25, i29, z6, i14, i30, map3, yt22, (i23 & 112) | 115043328, 6);
            j10 = j6;
            j9 = j12;
            i11 = i14;
            map2 = map3;
            j8 = j13;
            tg72 = tg74;
            vr22 = vr25;
            i10 = i30;
            j11 = j5;
            i12 = i29;
            z2 = z6;
        } else {
            yt2.Y();
            i11 = i2;
            i10 = i3;
            map2 = map;
            vr22 = vr2;
            tg72 = tg7;
            ml43 = ml42;
            j11 = j5;
            i12 = i;
            z2 = z;
            j8 = j7;
            j10 = j6;
            j9 = j3;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new wf7(vlVar2, ml43, j11, j10, j9, j8, i12, z2, i11, i10, map2, vr22, tg72, i4, i5, i6);
        }
    }
}
