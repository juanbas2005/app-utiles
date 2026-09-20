package defpackage;

/* renamed from: fx4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fx4 {
    public static final fg2 a = new Object();
    public static final x17 b = kl8.M(0.9f, 700.0f, (Object) null, 4);
    public static final yy0 c = new yy0((sr2) new jk4(7));

    /* JADX WARNING: type inference failed for: r0v0, types: [fg2, java.lang.Object] */
    static {
        new j44(new jk4(8));
    }

    public static final void a(gs2 gs2, gs2 gs22, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        yt2.g0(2056950107);
        if (yt2.i(gs2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (yt2.i(gs22)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (!yt2.V(i5 & 1, z)) {
            yt2.Y();
        } else if (gs22 != null) {
            yt2.e0(-1992610745);
            mp7.l(su0.J(-427323906, new bx4(1, gs22), yt2), (ml4) null, su0.J(-1775457476, new bx4(2, gs2), yt2), yt2, 390);
            yt2.r(false);
        } else {
            yt2.e0(-1992542607);
            gs2.H(yt2, Integer.valueOf(i5 & 14));
            yt2.r(false);
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new db(gs2, gs22, i, 1);
        }
    }

    public static final void b(String str, ml4 ml4, xw4 xw4, vr vrVar, gs2 gs2, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z;
        gs2 gs22;
        vr vrVar2;
        fw0 fw02;
        sr srVar;
        boolean z2;
        vr vrVar3;
        gs2 gs23;
        vr vrVar4;
        int i3;
        int i4;
        int i5;
        int i6;
        String str2 = str;
        ml4 ml42 = ml4;
        xw4 xw42 = xw4;
        fw0 fw03 = fw0;
        yt2 yt22 = yt2;
        int i7 = i;
        v88 v88 = xw42.c;
        yt22.g0(2037891754);
        if ((i7 & 6) == 0) {
            if (yt22.g(str2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            i2 = i7;
        }
        if ((i7 & 48) == 0) {
            if (yt22.g(ml42)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i7 & 384) == 0) {
            if (yt22.g(xw42)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        int i8 = i2 | 27648;
        if ((196608 & i7) == 0) {
            if (yt22.i(fw03)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i8 |= i3;
        }
        if ((74899 & i8) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i8 & 1, z)) {
            yt22.a0();
            if ((i7 & 1) == 0 || yt22.C()) {
                fw02 = r16.b;
                srVar = wr.c;
            } else {
                yt22.Y();
                srVar = vrVar;
                fw02 = gs2;
            }
            yt22.s();
            if ((458752 & i8) == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object Q = yt22.Q();
            if (z2 || Q == ay0.a) {
                Q = new fw0(-328108779, new yg(16, new fn4(new fw0(-703201834, new yn1(1, fw03), true))), true);
                yt22.o0(Q);
            }
            gs2 gs24 = (gs2) Q;
            if (str2.equals("ShortNavigationBarCompact")) {
                yt22.e0(1471044928);
                ms6.a(ml42, xw42.a, xw42.b, (aa8) null, gs24, yt22, (i8 >> 3) & 14);
                yt22.r(false);
            } else {
                int i9 = i8;
                if (str2.equals("ShortNavigationBarMedium")) {
                    yt22.e0(1471379232);
                    ms6.a(ml4, xw42.a, xw42.b, (aa8) null, gs24, yt22, (i9 >> 3) & 14);
                    yt22.r(false);
                } else {
                    if (str2.equals("WideNavigationRailCollapsed")) {
                        yt22.e0(1471730028);
                        gs2 gs25 = gs24;
                        vrVar4 = srVar;
                        yt2 yt23 = yt2;
                        gs2 gs26 = fw02;
                        b98.a(ml4, (c98) null, (pq6) null, v88, gs26, (aa8) null, vrVar4, (la5) null, gs25, yt23, ((i9 >> 3) & 14) | (57344 & i9) | (3670016 & (i9 << 9)), 166);
                        yt22 = yt23;
                        yt22.r(false);
                        gs23 = gs26;
                    } else {
                        int i10 = i9;
                        gs2 gs27 = fw02;
                        gs2 gs28 = gs24;
                        vrVar4 = srVar;
                        if (str2.equals("WideNavigationRailExpanded")) {
                            yt22.e0(1472083552);
                            int i11 = (57344 & i10) | (14 & (i10 >> 3)) | ((i10 << 9) & 3670016);
                            ml4 ml43 = ml4;
                            yt2 yt24 = yt2;
                            b98.a(ml43, i35.p(6, 0, yt22), (pq6) null, v88, gs27, (aa8) null, vrVar4, (la5) null, gs28, yt24, i11, 164);
                            ml4 ml44 = ml43;
                            gs23 = gs27;
                            yt22 = yt24;
                            yt22.r(false);
                        } else {
                            ml4 ml45 = ml4;
                            gs23 = gs27;
                            if (str2.equals("NavigationBar")) {
                                yt22.e0(1472895938);
                                ms6.a(yu6.f(ml45, 80.0f, 0.0f, 2), xw42.d, xw42.e, (aa8) null, gs28, yt22, 0);
                                yt22.r(false);
                                vrVar3 = vrVar4;
                            } else {
                                vr vrVar5 = vrVar4;
                                gs2 gs29 = gs28;
                                if (str2.equals("NavigationRail")) {
                                    yt22.e0(1473405175);
                                    int i12 = ((i10 >> 3) & 14) | 199680;
                                    yt2 yt25 = yt2;
                                    vrVar3 = vrVar5;
                                    ww4.a(ml4, xw42.f, xw42.g, su0.J(872457991, new bx4(0, gs23), yt22), (aa8) null, su0.J(172391621, new gc5(14, (Object) vrVar5, (Object) gs29), yt22), yt25, i12, 16);
                                    yt22 = yt25;
                                    yt22.r(false);
                                } else {
                                    vrVar3 = vrVar5;
                                    if (str2.equals("NavigationDrawer")) {
                                        yt22.e0(1474264247);
                                        yt2 yt26 = yt2;
                                        pv4.e(ml4, (pq6) null, xw42.h, xw42.i, (aa8) null, su0.J(-1983694325, new d13(gs23, vrVar3, gs29, 3), yt22), yt26, ((i10 >> 3) & 14) | 1572864);
                                        yt22 = yt26;
                                        yt22.r(false);
                                    } else {
                                        yt22.e0(1474947704);
                                        yt22.r(false);
                                    }
                                }
                            }
                            gs22 = gs23;
                            vrVar2 = vrVar3;
                        }
                    }
                    vrVar3 = vrVar4;
                    gs22 = gs23;
                    vrVar2 = vrVar3;
                }
            }
            vrVar3 = srVar;
            gs23 = fw02;
            gs22 = gs23;
            vrVar2 = vrVar3;
        } else {
            yt22.Y();
            vrVar2 = vrVar;
            gs22 = gs2;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dw0(str2, ml4, xw4, vrVar2, gs22, fw0, i);
        }
    }

    public static final void c(ml4 ml4, String str, xw4 xw4, vr2 vr2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        ml4 ml42;
        ml4 ml43;
        String str2 = str;
        xw4 xw42 = xw4;
        yt2 yt22 = yt2;
        yt22.g0(1682834171);
        int i5 = i | 6;
        if (yt22.g(new lx4(str2))) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i6 = i5 | i2;
        if (yt22.g(xw42)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i7 = i6 | i3;
        vr2 vr22 = vr2;
        if (yt22.i(vr22)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i8 & 1, z)) {
            yt22.a0();
            if ((i & 1) == 0 || yt22.C()) {
                ml43 = jl4.w;
            } else {
                yt22.Y();
                ml43 = ml4;
            }
            yt22.s();
            aq4 v = u55.v(vr2, yt2);
            Object Q = yt22.Q();
            if (Q == ay0.a) {
                Q = u55.i(new vo2(v, 23));
                yt22.o0(Q);
            }
            a37 a37 = (a37) Q;
            cf4 P = gr8.P(yt22);
            if (str2.equals("NavigationBar")) {
                yt22.e0(-1839751021);
                yt2 yt23 = yt2;
                hv4.a(ml43, xw42.d, xw42.e, (aa8) null, su0.J(1321804314, new cx4(a37, P, 0), yt22), yt23, 196614);
                yt22 = yt23;
                yt22.r(false);
            } else if (str2.equals("NavigationRail")) {
                yt22.e0(-1838732051);
                ww4.a(ml43, xw42.f, xw42.g, (hs2) null, (aa8) null, su0.J(1396067268, new cx4(a37, P, 1), yt22), yt22, 196614, 24);
                yt22.r(false);
            } else if (str2.equals("NavigationDrawer")) {
                yt22.e0(-1837707222);
                pv4.e(ml43, (pq6) null, xw42.h, xw42.i, (aa8) null, su0.J(-1884440258, new cx4(a37, P, 2), yt22), yt22, 1572870);
                yt22.r(false);
            } else if (str2.equals("None")) {
                yt22.e0(-1836780322);
                yt22.r(false);
            } else {
                yt22.e0(-1836693615);
                int i9 = ((i8 >> 3) & 14) | 196656 | (i8 & 896);
                ml4 ml44 = ml43;
                b(str2, ml44, xw42, (vr) null, (gs2) null, su0.J(-69522256, new dx4(0, a37, str2), yt22), yt22, i9);
                ml43 = ml44;
                yt22.r(false);
            }
            ml42 = ml43;
        } else {
            yt22.Y();
            ml42 = ml4;
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new q60((Object) ml42, (Object) str, (Object) xw4, (ds2) vr22, i, 8);
        }
    }

    public static final void d(String str, boolean z, f5 f5Var, fw0 fw0, gs2 gs2, ml4 ml4, cf4 cf4, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        fw0 fw02;
        long j;
        long j2;
        long j3;
        long j4;
        String str2 = str;
        fw0 fw03 = fw0;
        gs2 gs22 = gs2;
        cf4 cf42 = cf4;
        yt2 yt22 = yt2;
        yt22.g0(-1803214535);
        int i11 = 16;
        if (yt22.g(str2)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i12 = i | i2;
        boolean z3 = z;
        if (yt22.h(z3)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i13 = i12 | i3;
        f5 f5Var2 = f5Var;
        if (yt22.i(f5Var2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i14 = i13 | i4;
        if (yt22.i(fw03)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i15 = i14 | i5;
        if (yt22.i(gs22)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i16 = i15 | i6;
        ml4 ml42 = ml4;
        if (yt22.g(ml42)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i17 = i16 | i7;
        if (yt22.h(true)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i18 = i17 | i8;
        if (yt22.i((Object) null)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i19 = i18 | i9;
        if (yt22.g(cf42)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        if (yt22.g((Object) null)) {
            i11 = 32;
        }
        int i20 = i11 | i10;
        if ((306783379 & i19) == 306783378 && (i20 & 19) == 18) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!yt22.V(i19 & 1, z2)) {
            fw02 = fw03;
            yt22.Y();
        } else if (str2.equals("ShortNavigationBarCompact") || str2.equals("ShortNavigationBarMedium")) {
            int i21 = i19;
            int i22 = i20;
            fw02 = fw03;
            yt22.e0(1887358182);
            boolean z4 = !str2.equals("ShortNavigationBarCompact");
            fw0 J = su0.J(-715321418, new x30(fw02, 10), yt22);
            yt22.e0(-2017306367);
            fw4 o = t75.o(((zg4) yt22.k(ch4.b)).a);
            yt22.r(false);
            int i23 = i21 >> 6;
            ms6.b(z, f5Var, J, gs2, ml4, z4 ? 1 : 0, o, yt22, (i23 & 458752) | (i23 & 14) | 384 | (i23 & 112) | (i23 & 7168) | (i23 & 57344) | ((i22 << 21) & 234881024), 0);
            yt22.r(false);
        } else if (str2.equals("WideNavigationRailCollapsed") || str2.equals("WideNavigationRailExpanded")) {
            int i24 = i19;
            int i25 = i20;
            fw02 = fw03;
            gs2 gs23 = gs22;
            yt22.e0(1888245247);
            boolean equals = str2.equals("WideNavigationRailExpanded");
            yt22.e0(-2017284159);
            fw4 a2 = x88.a(yt22);
            yt22.r(false);
            int i26 = i24 >> 6;
            int i27 = i24 >> 3;
            int i28 = (i26 & 7168) | (i26 & 14) | 384 | (i26 & 112) | (i27 & 458752) | (i27 & 3670016) | ((i25 << 24) & 1879048192);
            yt2 yt23 = yt22;
            b98.b(z, f5Var, su0.J(929903317, new x30(fw02, 11), yt22), gs23, equals, ml4, 0, a2, (la5) null, yt23, i28);
            yt22 = yt23;
            yt22.r(false);
        } else {
            if (str2.equals("NavigationBar")) {
                yt22.e0(1889277454);
                cv4 cv4 = (cv4) cf42.x;
                yt22.e0(-2017265275);
                yt22.r(false);
                yt22.e0(1889536056);
                long j5 = cv4.a;
                long j6 = cv4.b;
                long j7 = cv4.c;
                int i29 = i19;
                int i30 = i20;
                long j8 = cv4.d;
                long j9 = cv4.e;
                long j10 = cv4.f;
                long j11 = cv4.g;
                fw4 o2 = t75.o(((zg4) yt22.k(ch4.b)).a);
                if (j5 == 16) {
                    j5 = o2.a;
                }
                long j12 = j5;
                if (j6 != 16) {
                    j = j6;
                } else {
                    j = o2.b;
                }
                if (j7 == 16) {
                    j7 = o2.c;
                }
                long j13 = j7;
                if (j8 != 16) {
                    j2 = j8;
                } else {
                    j2 = o2.d;
                }
                if (j9 != 16) {
                    j3 = j9;
                } else {
                    j3 = o2.e;
                }
                if (j10 != 16) {
                    j4 = j10;
                } else {
                    j4 = o2.f;
                }
                if (j11 == 16) {
                    j11 = o2.g;
                }
                fw4 fw4 = new fw4(j12, j, j13, j2, j3, j4, j11);
                yt22.r(false);
                fw0 J2 = su0.J(-217991490, new x30(fw03, 12), yt22);
                ml4 O = x91.O(ml42, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                int i31 = i29 >> 6;
                yt2 yt24 = yt22;
                ml4 ml43 = O;
                f5 f5Var3 = f5Var2;
                gs2 gs24 = gs22;
                ms6.b(z3, f5Var3, J2, gs24, ml43, 0, fw4, yt24, (i31 & 458752) | (i31 & 14) | 384 | (i31 & 112) | (i31 & 7168) | ((i30 << 21) & 234881024), 64);
                yt22 = yt24;
                yt22.r(false);
            } else {
                int i32 = i19;
                int i33 = i20;
                if (str2.equals("NavigationRail")) {
                    yt22.e0(1890881270);
                    yt22.e0(1890929847);
                    yt22.e0(-2017212245);
                    yt22.r(false);
                    yt22.r(false);
                    int i34 = i32 >> 6;
                    int i35 = i32 >> 9;
                    int i36 = (i34 & 112) | (i34 & 14) | 384 | (i35 & 7168) | (i35 & 57344) | (i32 & 458752) | ((i33 << 21) & 234881024);
                    yt2 yt25 = yt22;
                    gs2 gs25 = gs2;
                    ww4.b(z, f5Var, su0.J(2005188384, new x30(fw03, 13), yt22), ml4, gs25, false, (rw4) cf42.y, yt25, i36, 64);
                    yt2 yt26 = yt25;
                    gs2 gs26 = gs25;
                    yt22 = yt26;
                    yt22.r(false);
                } else {
                    gs2 gs27 = gs2;
                    if (str2.equals("NavigationDrawer")) {
                        yt22.e0(1892598763);
                        yt22.e0(1892653075);
                        yt22.e0(-2017156657);
                        yt22.r(false);
                        yt22.r(false);
                        int i37 = i32 >> 3;
                        int i38 = i32 >> 9;
                        int i39 = (i37 & 896) | (i37 & 112) | 6 | (i38 & 7168) | (i32 & 57344) | (i38 & 458752) | ((i33 << 21) & 234881024);
                        fw0 fw04 = fw03;
                        pv4.d(su0.J(170493148, new sa(5, gs27), yt22), z, f5Var, ml4, fw04, (pq6) null, (ml1) cf42.z, yt22, i39);
                        fw02 = fw04;
                        yt22.r(false);
                    } else {
                        fw02 = fw03;
                        yt22.e0(1893925129);
                        yt22.r(false);
                    }
                }
            }
            fw02 = fw03;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ei0(str2, z, f5Var, fw02, gs2, ml4, cf4, i);
        }
    }

    public static final void e(vr2 vr2, ml4 ml4, String str, xw4 xw4, long j, long j2, ix4 ix4, fw0 fw0, yt2 yt2, int i) {
        int i2;
        String str2;
        boolean z;
        ix4 ix42;
        long j3;
        ix4 ix43;
        long j4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        yt2 yt22 = yt2;
        int i9 = i;
        yt22.g0(-1187504617);
        vr2 vr22 = vr2;
        if ((i9 & 6) == 0) {
            if (yt22.i(vr22)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        ml4 ml42 = ml4;
        if ((i9 & 48) == 0) {
            if (yt22.g(ml42)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i9 & 384) == 0) {
            str2 = str;
            if (yt22.g(new lx4(str2))) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        } else {
            str2 = str;
        }
        xw4 xw42 = xw4;
        if ((i9 & 3072) == 0) {
            if (yt22.g(xw42)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        long j5 = j;
        if ((i9 & 24576) == 0) {
            if (yt22.f(j5)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i9) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i9) == 0) {
            i2 |= 524288;
        }
        fw0 fw02 = fw0;
        if ((12582912 & i9) == 0) {
            if (yt22.i(fw02)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i10 = 0;
        if ((4793491 & i2) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            yt22.a0();
            if ((i9 & 1) == 0 || yt22.C()) {
                g80 g80 = zw4.a;
                long j6 = ((zg4) yt22.k(ch4.b)).a.o;
                Object[] objArr = new Object[0];
                kg5 kg5 = new kg5(12, new uz1(20), new ot4(16));
                boolean e = yt22.e(jx4.w.ordinal());
                Object Q = yt22.Q();
                if (e || Q == ay0.a) {
                    Q = new jk4(6);
                    yt22.o0(Q);
                }
                i10 = 0;
                j4 = j6;
                ix43 = (ix4) u55.t(objArr, kg5, (sr2) Q, yt22, 0);
            } else {
                yt22.Y();
                j4 = j2;
                ix43 = ix4;
            }
            yt22.s();
            ((rm1) yt22.k(c)).a(new gx4(vr22, ml42, str2, xw42, j5, j4, ix43, fw02), yt22, i10);
            j3 = j4;
            ix42 = ix43;
        } else {
            yt22.Y();
            j3 = j2;
            ix42 = ix4;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ri5(vr2, ml4, str, xw4, j, j3, ix42, fw0, i9);
        }
    }

    public static final void f(fw0 fw0, String str, ix4 ix4, gs2 gs2, ib ibVar, fw0 fw02, yt2 yt2, int i) {
        int i2;
        boolean z;
        ib ibVar2;
        gs2 gs22;
        ib ibVar3;
        gs2 gs23;
        float f;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        fw0 fw03 = fw0;
        String str2 = str;
        ix4 ix42 = ix4;
        fw0 fw04 = fw02;
        yt2 yt22 = yt2;
        int i7 = i;
        yt22.g0(-262937133);
        if ((i7 & 6) == 0) {
            if (yt22.i(fw03)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            i2 = i7;
        }
        if ((i7 & 48) == 0) {
            if (yt22.g(str2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i7 & 384) == 0) {
            if (yt22.g(ix42)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        int i8 = i2 | 27648;
        if ((196608 & i7) == 0) {
            if (yt22.i(fw04)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i8 |= i3;
        }
        if ((74899 & i8) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i8 & 1, z)) {
            yt22.a0();
            if ((i7 & 1) == 0 || yt22.C()) {
                gs23 = r16.a;
                ibVar3 = zw4.a;
            } else {
                yt22.Y();
                gs23 = gs2;
                ibVar3 = ibVar;
            }
            yt22.s();
            if (((jx4) ix42.b.getValue()) == jx4.x) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            ib ibVar4 = ibVar3;
            a37 b2 = vj.b(f, b, (String) null, yt22, 48, 28);
            if ((i8 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean g = z2 | yt22.g(b2);
            if ((57344 & i8) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = g | z3;
            Object Q = yt22.Q();
            if (z4 || Q == ay0.a) {
                Q = new ov4(str2, b2, ibVar4, 1);
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
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            ml4 w0 = rc9.w0(jl4, "navigationSuite");
            i80 i80 = xb4.y;
            int i9 = i8;
            lh4 d = mb0.d(i80, false);
            gs2 gs24 = gs23;
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, w0);
            yt22.i0();
            gs2 gs25 = gs24;
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, d);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E2);
            f21.r(i9 & 14, fw03, yt22, true);
            ml4 w02 = rc9.w0(jl4, "primaryActionContent");
            lh4 d2 = mb0.d(i80, false);
            i80 i802 = i80;
            int hashCode3 = Long.hashCode(yt22.T);
            vf5 m3 = yt22.m();
            ml4 E3 = gw8.E(yt22, w02);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, d2);
            g75.Q(ckVar2, yt22, m3);
            f21.s(hashCode3, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E3);
            gs2 gs26 = gs25;
            gs26.H(yt22, Integer.valueOf((i9 >> 9) & 14));
            yt22.r(true);
            ml4 w03 = rc9.w0(jl4, "content");
            lh4 d3 = mb0.d(i802, false);
            int hashCode4 = Long.hashCode(yt22.T);
            vf5 m4 = yt22.m();
            ml4 E4 = gw8.E(yt22, w03);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, d3);
            g75.Q(ckVar2, yt22, m4);
            f21.s(hashCode4, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E4);
            fw04 = fw02;
            fw04.H(yt22, Integer.valueOf((i9 >> 15) & 14));
            yt22.r(true);
            yt22.r(true);
            gs22 = gs26;
            ibVar2 = ibVar4;
        } else {
            yt22.Y();
            gs22 = gs2;
            ibVar2 = ibVar;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dw0((Object) fw0, (Object) str, (Object) ix4, (ds2) gs22, (Object) ibVar2, (ds2) fw04, i, 5);
        }
    }

    public static final void g(fw0 fw0, String str, ix4 ix4, fw0 fw02, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        fw0 fw03;
        ix4 ix42;
        String str2;
        fw0 fw04;
        yt2 yt22;
        yt2.g0(-67066668);
        if (yt2.g(new lx4(str))) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i4 = i2 | i;
        if (yt2.g(ix4)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i5 = i4 | i3;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i5 & 1, z)) {
            yt2.a0();
            if ((i & 1) != 0 && !yt2.C()) {
                yt2.Y();
            }
            yt2.s();
            fw0 fw05 = fw0;
            String str3 = str;
            ix4 ix43 = ix4;
            fw0 fw06 = fw02;
            yt22 = yt2;
            f(fw05, str3, ix43, (gs2) null, (ib) null, fw06, yt22, (i5 & 1022) | 196608);
            fw04 = fw05;
            str2 = str3;
            ix42 = ix43;
            fw03 = fw06;
        } else {
            yt22 = yt2;
            fw03 = fw02;
            ix42 = ix4;
            str2 = str;
            fw04 = fw0;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new q60(fw04, str2, ix42, fw03, i);
        }
    }

    public static final float h(a37 a37) {
        return ((Number) a37.getValue()).floatValue();
    }
}
