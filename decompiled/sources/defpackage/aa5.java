package defpackage;

import android.view.View;
import android.view.ViewParent;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: aa5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class aa5 {
    public static final /* synthetic */ int a = 0;
    public static x83 b;
    public static final /* synthetic */ int c = 0;
    public static x83 d;
    public static final /* synthetic */ int e = 0;
    public static x83 f;

    public static final void a(ml4 ml4, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z;
        fw0 fw02;
        ml4 ml42;
        int i3;
        int i4;
        yt2.g0(790527681);
        if ((i & 6) == 0) {
            if (yt2.g(ml4)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt2.i(fw0)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            Object Q = yt2.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                ed5 ed5 = new ed5((Object) null, d63.G);
                yt2.o0(ed5);
                Q = ed5;
            }
            aq4 aq4 = (aq4) Q;
            Object Q2 = yt2.Q();
            if (Q2 == d63) {
                Q2 = new vo2(aq4, 24);
                yt2.o0(Q2);
            }
            sr2 sr2 = (sr2) Q2;
            tl5 tl5 = zn1.a;
            p60 p = h49.p(ed1.F, yt2, 6);
            ml42 = ml4;
            fw02 = fw0;
            t49.d(new ju5[]{kd7.b.a(mp7.i0(sr2, yt2, 2)), kd7.a.a(p)}, su0.J(1070596993, new tg1((Object) ml42, (Object) aq4, (Object) fw02, (Object) p, (Object) sr2, 6), yt2), yt2, 56);
        } else {
            ml42 = ml4;
            fw02 = fw0;
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new vi(ml42, fw02, i, 5);
        }
    }

    public static final void b(ml4 ml4, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        yt2.g0(155925518);
        if ((i & 6) == 0) {
            if (yt2.g(ml4)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt2.i(fw0)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            if (yt2.k(kd7.a) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (yt2.k(kd7.b) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && z3) {
                yt2.e0(-1977187922);
                lh4 d2 = mb0.d(xb4.y, true);
                int hashCode = Long.hashCode(yt2.T);
                vf5 m = yt2.m();
                ml4 E = gw8.E(yt2, ml4);
                ux0.d.getClass();
                vy0 vy0 = tx0.b;
                yt2.i0();
                if (yt2.S) {
                    yt2.l(vy0);
                } else {
                    yt2.r0();
                }
                g75.Q(tx0.f, yt2, d2);
                g75.Q(tx0.e, yt2, m);
                g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
                g75.O(yt2, tx0.h);
                g75.Q(tx0.d, yt2, E);
                fw0.H(yt2, Integer.valueOf((i2 >> 3) & 14));
                yt2.r(true);
                yt2.r(false);
            } else if (z2) {
                yt2.e0(-1976997706);
                mp7.F(ml4, fw0, yt2, i2 & 126);
                yt2.r(false);
            } else if (z3) {
                yt2.e0(-1976846922);
                zn1.d(ml4, fw0, yt2, i2 & 126);
                yt2.r(false);
            } else {
                yt2.e0(-1976716505);
                a(ml4, fw0, yt2, i2 & 126);
                yt2.r(false);
            }
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new vi(ml4, fw0, i, 4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010c  */
    public static final void c(ml4 ml4, gs2 gs2, gs2 gs22, gs2 gs23, gs2 gs24, int i, long j, long j2, aa8 aa8, fw0 fw0, yt2 yt2, int i2, int i3) {
        int i4;
        jl4 jl4;
        fw0 fw02;
        int i5;
        gs2 gs25;
        int i6;
        gs2 gs26;
        int i7;
        long j3;
        int i8;
        ss7 ss7;
        boolean z;
        int i9;
        ml4 ml42;
        gs2 gs27;
        gs2 gs28;
        gs2 gs29;
        long j4;
        gs2 gs210;
        long j5;
        yx5 v;
        int i10;
        ml4 ml43;
        long j6;
        long j7;
        gs2 gs211;
        gs2 gs212;
        gs2 gs213;
        boolean z2;
        Object Q;
        Object Q2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        yt2 yt22 = yt2;
        int i19 = i2;
        int i20 = i3;
        yt22.g0(-1211482744);
        int i21 = i20 & 1;
        if (i21 != 0) {
            i4 = i19 | 6;
            jl4 = ml4;
        } else if ((i19 & 6) == 0) {
            jl4 = ml4;
            if (yt22.g(jl4)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i4 = i18 | i19;
        } else {
            jl4 = ml4;
            i4 = i19;
        }
        int i22 = i20 & 2;
        if (i22 != 0) {
            i4 |= 48;
        } else if ((i19 & 48) == 0) {
            fw02 = gs2;
            if (yt22.i(fw02)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i4 |= i17;
            int i23 = i4 | 384;
            i5 = i20 & 8;
            if (i5 == 0) {
                i23 = i4 | 3456;
            } else if ((i19 & 3072) == 0) {
                gs25 = gs23;
                if (yt22.i(gs25)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i23 |= i16;
                i6 = i20 & 16;
                if (i6 != 0) {
                    i23 |= 24576;
                } else if ((i19 & 24576) == 0) {
                    gs26 = gs24;
                    if (yt22.i(gs26)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i23 |= i15;
                    i7 = i23 | 196608;
                    if ((1572864 & i19) != 0) {
                        if ((i20 & 64) == 0) {
                            j3 = j;
                            if (yt22.f(j3)) {
                                i14 = 1048576;
                                i7 |= i14;
                            }
                        } else {
                            j3 = j;
                        }
                        i14 = 524288;
                        i7 |= i14;
                    } else {
                        j3 = j;
                    }
                    if ((i19 & 12582912) != 0) {
                        i8 = i21;
                        if ((i20 & 128) != 0) {
                            long j8 = j2;
                        } else if (yt22.f(j2)) {
                            i13 = 8388608;
                            i7 |= i13;
                        }
                        i13 = 4194304;
                        i7 |= i13;
                    } else {
                        i8 = i21;
                        long j9 = j2;
                    }
                    if ((i19 & 100663296) != 0) {
                        if ((i20 & 256) == 0) {
                            ss7 = aa8;
                            if (yt22.g(ss7)) {
                                i12 = 67108864;
                                i7 |= i12;
                            }
                        } else {
                            ss7 = aa8;
                        }
                        i12 = 33554432;
                        i7 |= i12;
                    } else {
                        ss7 = aa8;
                    }
                    fw0 fw03 = fw0;
                    if ((i19 & 805306368) == 0) {
                        if (yt22.i(fw03)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i7 |= i11;
                    }
                    boolean z3 = false;
                    if ((306783379 & i7) == 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!yt22.V(i7 & 1, z)) {
                        yt22.a0();
                        if ((i19 & 1) == 0 || yt22.C()) {
                            if (i8 != 0) {
                                jl4 = jl4.w;
                            }
                            if (i22 != 0) {
                                fw02 = kl8.d;
                            }
                            gs212 = kl8.e;
                            if (i5 != 0) {
                                gs25 = kl8.f;
                            }
                            if (i6 != 0) {
                                gs211 = kl8.g;
                            } else {
                                gs211 = gs26;
                            }
                            if ((i20 & 64) != 0) {
                                j7 = ((zg4) yt22.k(ch4.b)).a.n;
                                i7 &= -3670017;
                            } else {
                                j7 = j3;
                            }
                            if ((i20 & 128) != 0) {
                                j6 = st0.b(j7, yt22);
                                i7 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i20 & 256) != 0) {
                                WeakHashMap weakHashMap = ib8.w;
                                i7 &= -234881025;
                                ss7 = new ss7(n63.h(yt22).g, n63.h(yt22).b);
                            }
                            ml43 = jl4;
                            i10 = 2;
                        } else {
                            yt22.Y();
                            if ((i20 & 64) != 0) {
                                i7 &= -3670017;
                            }
                            if ((i20 & 128) != 0) {
                                i7 &= -29360129;
                            }
                            if ((i20 & 256) != 0) {
                                i7 &= -234881025;
                            }
                            gs212 = gs22;
                            i10 = i;
                            gs211 = gs26;
                            j7 = j3;
                            j6 = j2;
                            ml43 = jl4;
                        }
                        yt22.s();
                        int i24 = (234881024 & i7) ^ 100663296;
                        if (i24 <= 67108864 || !yt22.g(ss7)) {
                            gs213 = gs212;
                            if ((i7 & 100663296) != 67108864) {
                                z2 = false;
                                Q = yt22.Q();
                                boolean z4 = z2;
                                d63 d63 = ay0.a;
                                if (z4 || Q == d63) {
                                    Q = new gq4(ss7);
                                    yt22.o0(Q);
                                }
                                gq4 gq4 = (gq4) Q;
                                boolean g = yt22.g(gq4);
                                gs2 gs214 = gs25;
                                if ((i24 > 67108864 && yt22.g(ss7)) || (i7 & 100663296) == 67108864) {
                                    z3 = true;
                                }
                                boolean z5 = g | z3;
                                Q2 = yt22.Q();
                                if (z5 || Q2 == d63) {
                                    Q2 = new w34(22, gq4, ss7);
                                    yt22.o0(Q2);
                                }
                                gs2 gs215 = gs211;
                                gs2 gs216 = fw02;
                                int i25 = i10;
                                int i26 = i7 >> 12;
                                long j10 = j6;
                                int i27 = (i26 & 7168) | (i26 & 896) | 12582912;
                                long j11 = j7;
                                s87.a(x91.I(ml43, (vr2) Q2), (pq6) null, j11, j10, 0.0f, 0.0f, su0.J(848889571, new dw0(i25, gs216, fw0, gs214, gs215, gq4, gs213), yt22), yt22, i27, 114);
                                j4 = j11;
                                j5 = j10;
                                ml42 = ml43;
                                gs28 = gs216;
                                gs210 = gs213;
                                gs27 = gs214;
                                gs29 = gs215;
                                i9 = i25;
                            }
                        } else {
                            gs213 = gs212;
                        }
                        z2 = true;
                        Q = yt22.Q();
                        boolean z42 = z2;
                        d63 d632 = ay0.a;
                        Q = new gq4(ss7);
                        yt22.o0(Q);
                        gq4 gq42 = (gq4) Q;
                        boolean g2 = yt22.g(gq42);
                        gs2 gs2142 = gs25;
                        z3 = true;
                        boolean z52 = g2 | z3;
                        Q2 = yt22.Q();
                        Q2 = new w34(22, gq42, ss7);
                        yt22.o0(Q2);
                        gs2 gs2152 = gs211;
                        gs2 gs2162 = fw02;
                        int i252 = i10;
                        int i262 = i7 >> 12;
                        long j102 = j6;
                        int i272 = (i262 & 7168) | (i262 & 896) | 12582912;
                        long j112 = j7;
                        s87.a(x91.I(ml43, (vr2) Q2), (pq6) null, j112, j102, 0.0f, 0.0f, su0.J(848889571, new dw0(i252, gs2162, fw0, gs2142, gs2152, gq42, gs213), yt22), yt22, i272, 114);
                        j4 = j112;
                        j5 = j102;
                        ml42 = ml43;
                        gs28 = gs2162;
                        gs210 = gs213;
                        gs27 = gs2142;
                        gs29 = gs2152;
                        i9 = i252;
                    } else {
                        yt2.Y();
                        i9 = i;
                        ml42 = jl4;
                        gs27 = gs25;
                        gs28 = fw02;
                        gs29 = gs26;
                        j4 = j3;
                        gs210 = gs22;
                        j5 = j2;
                    }
                    aa8 aa82 = ss7;
                    v = yt2.v();
                    if (v == null) {
                        v.d = new sf6(ml42, gs28, gs210, gs27, gs29, i9, j4, j5, aa82, fw0, i19, i20);
                        return;
                    }
                    return;
                }
                gs26 = gs24;
                i7 = i23 | 196608;
                if ((1572864 & i19) != 0) {
                }
                if ((i19 & 12582912) != 0) {
                }
                if ((i19 & 100663296) != 0) {
                }
                fw0 fw032 = fw0;
                if ((i19 & 805306368) == 0) {
                }
                boolean z32 = false;
                if ((306783379 & i7) == 306783378) {
                }
                if (!yt22.V(i7 & 1, z)) {
                }
                aa8 aa822 = ss7;
                v = yt2.v();
                if (v == null) {
                }
            }
            gs25 = gs23;
            i6 = i20 & 16;
            if (i6 != 0) {
            }
            gs26 = gs24;
            i7 = i23 | 196608;
            if ((1572864 & i19) != 0) {
            }
            if ((i19 & 12582912) != 0) {
            }
            if ((i19 & 100663296) != 0) {
            }
            fw0 fw0322 = fw0;
            if ((i19 & 805306368) == 0) {
            }
            boolean z322 = false;
            if ((306783379 & i7) == 306783378) {
            }
            if (!yt22.V(i7 & 1, z)) {
            }
            aa8 aa8222 = ss7;
            v = yt2.v();
            if (v == null) {
            }
        }
        fw02 = gs2;
        int i232 = i4 | 384;
        i5 = i20 & 8;
        if (i5 == 0) {
        }
        gs25 = gs23;
        i6 = i20 & 16;
        if (i6 != 0) {
        }
        gs26 = gs24;
        i7 = i232 | 196608;
        if ((1572864 & i19) != 0) {
        }
        if ((i19 & 12582912) != 0) {
        }
        if ((i19 & 100663296) != 0) {
        }
        fw0 fw03222 = fw0;
        if ((i19 & 805306368) == 0) {
        }
        boolean z3222 = false;
        if ((306783379 & i7) == 306783378) {
        }
        if (!yt22.V(i7 & 1, z)) {
        }
        aa8 aa82222 = ss7;
        v = yt2.v();
        if (v == null) {
        }
    }

    public static final void d(int i, gs2 gs2, fw0 fw0, gs2 gs22, gs2 gs23, aa8 aa8, gs2 gs24, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i10;
        yt2 yt22 = yt2;
        yt22.g0(-280287501);
        int i11 = i;
        if (yt22.e(i11)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i12 = i2 | i3;
        gs2 gs25 = gs2;
        if (yt22.i(gs25)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i13 = i12 | i4;
        fw0 fw02 = fw0;
        if (yt22.i(fw02)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i14 = i13 | i5;
        gs2 gs26 = gs22;
        if (yt22.i(gs26)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i15 = i14 | i6;
        gs2 gs27 = gs23;
        if (yt22.i(gs27)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i16 = i15 | i7;
        aa8 aa82 = aa8;
        if (yt22.g(aa82)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i17 = i16 | i8;
        gs2 gs28 = gs24;
        if (yt22.i(gs28)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i18 = i17 | i9;
        if ((599187 & i18) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i18 & 1, z)) {
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = new uf6();
                yt22.o0(Q);
            }
            uf6 uf6 = (uf6) Q;
            if ((i18 & 458752) == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i18 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z9 = z2 | z3;
            if ((i18 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z10 = z9 | z4;
            if ((57344 & i18) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = z10 | z5;
            if ((i18 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z12 = z11 | z6;
            if ((3670016 & i18) == 1048576) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z13 = z12 | z7;
            if ((i18 & 896) == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z14 = z8 | z13;
            Object Q2 = yt22.Q();
            if (z14 || Q2 == d63) {
                i10 = 0;
                Q2 = new iu1(aa82, gs25, gs26, gs27, i11, gs28, uf6, fw02);
                yt22.o0(Q2);
            } else {
                i10 = 0;
            }
            m67.a((ml4) null, (gs2) Q2, yt22, i10, 1);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dw0(i, gs2, fw0, gs22, gs23, aa8, gs24, i2);
        }
    }

    public static final ll6 e(ll6 ll6, z53 z53) {
        ll6.getClass();
        z53.getClass();
        if (sg3.e(ll6.u(), pl6.l)) {
            rg3.u(ll6);
            return ll6;
        } else if (ll6.j()) {
            return e(ll6.h(0), z53);
        } else {
            return ll6;
        }
    }

    public static vp7 f(List list, vp7 vp7, es3 es3, ClassLoader classLoader) {
        es3 es32;
        list.getClass();
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        Iterator it = list.iterator();
        while (true) {
            p16 p16 = null;
            if (!it.hasNext()) {
                break;
            }
            wu3 wu3 = (wu3) it.next();
            if (es3 instanceof p16) {
                p16 = (p16) es3;
            }
            if (p16 == null || (es32 = r16.j0(p16)) == null) {
                es32 = es3;
            }
            String str = wu3.b;
            ks3 N = pd8.N(wu3.d);
            su.z.C(su.a[52], wu3);
            arrayList.add(new ds3(es32, str, N));
        }
        ss h1 = dt0.h1(list);
        int F = tf4.F(et0.e0(h1, 10));
        if (F < 16) {
            F = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F);
        Iterator it2 = h1.iterator();
        while (true) {
            f02 f02 = (f02) it2;
            if (!f02.x.hasNext()) {
                break;
            }
            ka3 ka3 = (ka3) f02.next();
            linkedHashMap.put(Integer.valueOf(((wu3) ka3.b).c), arrayList.get(ka3.a));
        }
        vp7 vp72 = new vp7(arrayList, linkedHashMap, vp7);
        Iterator it3 = arrayList.iterator();
        int i = 0;
        while (it3.hasNext()) {
            int i2 = i + 1;
            ds3 ds3 = (ds3) it3.next();
            ArrayList arrayList2 = ((wu3) list.get(i)).e;
            ArrayList arrayList3 = new ArrayList(et0.e0(arrayList2, 10));
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                arrayList3.add(pd8.M((uu3) it4.next(), classLoader, vp72, (sr2) null, 8));
            }
            List D = arrayList3.isEmpty() ? sg3.D(k27.b) : arrayList3;
            ds3.getClass();
            ds3.B = D;
            i = i2;
        }
        return vp72;
    }

    public static final a68 g(View view) {
        a68 a68;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            if (tag instanceof a68) {
                a68 = (a68) tag;
            } else {
                a68 = null;
            }
            if (a68 != null) {
                return a68;
            }
            ViewParent k = z85.k(view);
            if (k instanceof View) {
                view = (View) k;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final x83 h() {
        x83 x83 = f;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.SwapVert", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(16.0f, 17.01f);
        be5.m(11.0f);
        be5.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        be5.l(-1.0f, 0.45f, -1.0f, 1.0f);
        be5.n(6.01f);
        be5.g(-1.79f);
        be5.e(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        be5.i(2.79f, 2.78f);
        be5.e(0.2f, 0.19f, 0.51f, 0.19f, 0.71f, 0.0f);
        be5.i(2.79f, -2.78f);
        be5.e(0.32f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
        be5.f(16.0f);
        be5.c();
        be5.j(8.65f, 3.35f);
        be5.h(5.86f, 6.14f);
        be5.e(-0.32f, 0.31f, -0.1f, 0.85f, 0.35f, 0.85f);
        be5.f(8.0f);
        be5.m(13.0f);
        be5.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        be5.l(1.0f, -0.45f, 1.0f, -1.0f);
        be5.m(6.99f);
        be5.g(1.79f);
        be5.e(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        be5.h(9.35f, 3.35f);
        be5.e(-0.19f, -0.19f, -0.51f, -0.19f, -0.7f, 0.0f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        f = b2;
        return b2;
    }

    public static long i() {
        return m(uq3.d(4279381056L), uq3.d(4293127927L));
    }

    public static final boolean j(ba5 ba5, up2 up2) {
        ba5.getClass();
        up2.getClass();
        return ba5.a(up2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0119  */
    public static final tg7 k(tg7 tg7, ey3 ey3) {
        int i;
        int i2;
        float f2;
        long j;
        mf7 mf7;
        int i3;
        int i4;
        jg7 jg7;
        tg7 tg72 = tg7;
        yy6 yy6 = tg72.a;
        kf7 kf7 = zy6.d;
        kf7 kf72 = yy6.a;
        if (kf72.equals(jf7.a)) {
            kf72 = zy6.d;
        }
        kf7 kf73 = kf72;
        long j2 = yy6.b;
        xg7[] xg7Arr = wg7.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = zy6.a;
        }
        long j3 = j2;
        am2 am2 = yy6.c;
        if (am2 == null) {
            am2 = am2.y;
        }
        am2 am22 = am2;
        yl2 yl2 = yy6.d;
        if (yl2 != null) {
            i = yl2.a;
        } else {
            i = 0;
        }
        yl2 yl22 = new yl2(i);
        zl2 zl2 = yy6.e;
        if (zl2 != null) {
            i2 = zl2.a;
        } else {
            i2 = 65535;
        }
        zl2 zl22 = new zl2(i2);
        ea7 ea7 = yy6.f;
        if (ea7 == null) {
            ea7 = ea7.a;
        }
        ea7 ea72 = ea7;
        String str = yy6.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = yy6.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = zy6.b;
        }
        long j5 = j4;
        h60 h60 = yy6.i;
        float f3 = 0.0f;
        if (h60 != null) {
            f2 = h60.a;
        } else {
            f2 = 0.0f;
        }
        if (!Float.isNaN(f2)) {
            f3 = f2;
        }
        h60 h602 = new h60(f3);
        lf7 lf7 = yy6.j;
        if (lf7 == null) {
            lf7 = lf7.c;
        }
        lf7 lf72 = lf7;
        ya4 ya4 = yy6.k;
        if (ya4 == null) {
            ya4 ya42 = ya4.y;
            ya4 = kj5.a.G();
        }
        ya4 ya43 = ya4;
        long j6 = yy6.l;
        if (j6 == 16) {
            j6 = zy6.c;
        }
        long j7 = j6;
        rd7 rd7 = yy6.m;
        if (rd7 == null) {
            rd7 = rd7.b;
        }
        rd7 rd72 = rd7;
        lq6 lq6 = yy6.n;
        if (lq6 == null) {
            lq6 = lq6.d;
        }
        lq6 lq62 = lq6;
        yj5 yj5 = yy6.o;
        iz1 iz1 = yy6.p;
        if (iz1 == null) {
            iz1 = rd2.a;
        }
        yy6 yy62 = new yy6(kf73, j3, am22, yl22, zl22, ea72, str2, j5, h602, lf72, ya43, j7, rd72, lq62, yj5, iz1);
        nc5 nc5 = tg72.b;
        int i5 = oc5.b;
        int i6 = nc5.a;
        int i7 = 5;
        if (i6 == 0) {
            i6 = 5;
        }
        int i8 = nc5.b;
        if (i8 == 3) {
            int ordinal = ey3.ordinal();
            if (ordinal == 0) {
                i7 = 4;
            } else if (ordinal != 1) {
                h.c();
                return null;
            }
        } else {
            if (i8 == 0) {
                int ordinal2 = ey3.ordinal();
                if (ordinal2 == 0) {
                    i8 = 1;
                } else if (ordinal2 == 1) {
                    i7 = 2;
                } else {
                    h.c();
                    return null;
                }
            }
            j = nc5.c;
            if ((j & 1095216660480L) == 0) {
                j = oc5.a;
            }
            mf7 = nc5.d;
            if (mf7 == null) {
                mf7 = mf7.c;
            }
            qj5 qj5 = nc5.e;
            m64 m64 = nc5.f;
            i3 = nc5.g;
            if (i3 == 0) {
                i3 = g64.b;
            }
            i4 = nc5.h;
            if (i4 == 0) {
                i4 = 1;
            }
            jg7 = nc5.i;
            if (jg7 == null) {
                jg7 = jg7.c;
            }
            return new tg7(yy62, new nc5(i6, i8, j, mf7, qj5, m64, i3, i4, jg7), tg72.c);
        }
        i8 = i7;
        j = nc5.c;
        if ((j & 1095216660480L) == 0) {
        }
        mf7 = nc5.d;
        if (mf7 == null) {
        }
        qj5 qj52 = nc5.e;
        m64 m642 = nc5.f;
        i3 = nc5.g;
        if (i3 == 0) {
        }
        i4 = nc5.h;
        if (i4 == 0) {
        }
        jg7 = nc5.i;
        if (jg7 == null) {
        }
        return new tg7(yy62, new nc5(i6, i8, j, mf7, qj52, m642, i3, i4, jg7), tg72.c);
    }

    public static final ef8 l(pl3 pl3, ll6 ll6) {
        pl3.getClass();
        ll6.getClass();
        n85 u = ll6.u();
        if (u instanceof yk5) {
            return ef8.POLY_OBJ;
        }
        boolean e2 = sg3.e(u, n57.m);
        ef8 ef8 = ef8.LIST;
        if (e2) {
            return ef8;
        }
        if (!sg3.e(u, n57.n)) {
            return ef8.OBJ;
        }
        ll6 e3 = e(ll6.h(0), pl3.b);
        n85 u2 = e3.u();
        if ((u2 instanceof no5) || sg3.e(u2, ql6.l)) {
            return ef8.MAP;
        }
        if (pl3.a.d) {
            return ef8;
        }
        throw ar7.c(e3);
    }

    public static long m(long j, long j2) {
        if (d18.a()) {
            return za5.k(j2);
        }
        if (d18.b()) {
            return j2;
        }
        return j;
    }

    public static byte[] n(byte[]... bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= r3) {
                break;
            }
            i2 += bArr[i].length;
            i++;
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length);
            i3 += length;
        }
        return bArr2;
    }
}
