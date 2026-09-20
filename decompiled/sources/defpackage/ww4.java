package defpackage;

import java.util.WeakHashMap;

/* renamed from: ww4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ww4 {
    public static final float a = pd8.n;
    public static final float b = 56.0f;
    public static final float c = 4.0f;
    public static final float d;
    public static final float e;
    public static final float f;

    static {
        float f2 = ar7.v0;
        float f3 = (56.0f - f2) / 2.0f;
        d = f3;
        e = (32.0f - f2) / 2.0f;
        f = f3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void a(ml4 ml4, long j, long j2, hs2 hs2, aa8 aa8, fw0 fw0, yt2 yt2, int i, int i2) {
        int i3;
        hs2 hs22;
        boolean z;
        aa8 aa82;
        hs2 hs23;
        yx5 v;
        aa8 aa83;
        hs2 hs24;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i10 = i;
        yt22.g0(331386280);
        ml4 ml42 = ml4;
        if ((i10 & 6) == 0) {
            if (yt22.g(ml42)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i10;
        } else {
            i3 = i10;
        }
        long j3 = j;
        if ((i10 & 48) == 0) {
            if (yt22.f(j3)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        long j4 = j2;
        if ((i10 & 384) == 0) {
            if (yt22.f(j4)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i10 & 3072) == 0) {
            hs22 = hs2;
            if (yt22.i(hs22)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
            if ((i10 & 24576) == 0) {
                i3 |= 8192;
            }
            if ((196608 & i10) == 0) {
                if (yt22.i(fw02)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((74899 & i3) == 74898) {
                z = true;
            } else {
                z = false;
            }
            if (!yt22.V(i3 & 1, z)) {
                yt22.a0();
                if ((i10 & 1) == 0 || yt22.C()) {
                    if (i11 != 0) {
                        hs24 = null;
                    } else {
                        hs24 = hs22;
                    }
                    WeakHashMap weakHashMap = ib8.w;
                    aa83 = new e64(new ss7(n63.h(yt22).g, n63.h(yt22).b), 48 | 9);
                    i4 = i3 & -57345;
                } else {
                    yt22.Y();
                    i4 = i3 & -57345;
                    aa83 = aa8;
                    hs24 = hs22;
                }
                yt22.s();
                int i12 = i4 << 3;
                s87.a(ml42, (pq6) null, j3, j4, 0.0f, 0.0f, su0.J(-812545661, new y30((Object) aa83, (Object) hs24, (Object) fw02, 1), yt22), yt22, 12582912 | (i4 & 14) | (i12 & 896) | (i12 & 7168), 114);
                hs23 = hs24;
                aa82 = aa83;
            } else {
                yt2.Y();
                aa82 = aa8;
                hs23 = hs22;
            }
            v = yt2.v();
            if (v == null) {
                v.d = new tw4(ml4, j, j2, hs23, aa82, fw02, i10, i2);
                return;
            }
            return;
        }
        hs22 = hs2;
        if ((i10 & 24576) == 0) {
        }
        if ((196608 & i10) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        if (!yt22.V(i3 & 1, z)) {
        }
        v = yt2.v();
        if (v == null) {
        }
    }

    public static final void b(boolean z, f5 f5Var, fw0 fw0, ml4 ml4, gs2 gs2, boolean z2, rw4 rw4, yt2 yt2, int i, int i2) {
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        rw4 rw42;
        yt2 yt22;
        boolean z5;
        fw0 fw02;
        float f2;
        float f3;
        pq6 pq6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z6 = z;
        gs2 gs22 = gs2;
        rw4 rw43 = rw4;
        yt2 yt23 = yt2;
        int i13 = i;
        yt23.g0(-1620317701);
        if ((i13 & 6) == 0) {
            if (yt23.h(z6)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i3 = i12 | i13;
        } else {
            i3 = i13;
        }
        f5 f5Var2 = f5Var;
        if ((i13 & 48) == 0) {
            if (yt23.i(f5Var2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i3 |= i11;
        }
        ml4 ml42 = ml4;
        if ((i13 & 3072) == 0) {
            if (yt23.g(ml42)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i3 |= i10;
        }
        if ((i13 & 24576) == 0) {
            if (yt23.h(true)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        }
        if (yt23.i(gs22)) {
            i4 = 131072;
        } else {
            i4 = 65536;
        }
        int i14 = i3 | i4;
        int i15 = i2 & 64;
        if (i15 != 0) {
            i5 = i14 | 1572864;
            z3 = z2;
        } else {
            z3 = z2;
            if (yt23.h(z3)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i5 = i14 | i8;
        }
        if (yt23.g(rw43)) {
            i6 = 8388608;
        } else {
            i6 = 4194304;
        }
        int i16 = i5 | i6;
        if ((100663296 & i13) == 0) {
            if (yt23.g((Object) null)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i16 |= i7;
        }
        int i17 = i16;
        if ((i17 & 38347923) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (yt23.V(i17 & 1, z4)) {
            yt23.a0();
            if ((i13 & 1) != 0 && !yt23.C()) {
                yt23.Y();
            } else if (i15 != 0) {
                z3 = true;
            }
            boolean z7 = z3;
            yt23.s();
            yt23.e0(253276704);
            Object Q = yt23.Q();
            Object obj = ay0.a;
            if (Q == obj) {
                Q = b81.e(yt23);
            }
            ap4 ap4 = (ap4) Q;
            yt23.r(false);
            vm4 vm4 = vm4.y;
            je2 H = hj8.H(vm4, yt23);
            Object obj2 = obj;
            boolean z8 = z6;
            rw4 rw44 = rw43;
            Object obj3 = obj2;
            vm4 vm42 = vm4;
            boolean z9 = z7;
            fw0 J = su0.J(206057749, new ra7(rw44, z8, H, gs22, z7, fw0), yt23);
            if (gs2 == null) {
                yt23.e0(254203944);
                yt23.r(false);
                fw02 = null;
            } else {
                yt23.e0(254203945);
                fw0 J2 = su0.J(-2056532825, new ai0((Object) rw4, z, (Object) H, (Object) gs2, 10), yt23);
                yt23.r(false);
                fw02 = J2;
            }
            rw42 = rw4;
            ap4 ap42 = ap4;
            ap4 ap43 = ap42;
            ml4 q = yu6.q(yu6.b(su0.L(ml42, z, ap42, (oa3) null, true, new s86(4), f5Var2), 0.0f, b, 1), a, 0.0f, 2);
            lh4 d2 = mb0.d(xb4.C, true);
            int hashCode = Long.hashCode(yt23.T);
            vf5 m = yt23.m();
            ml4 E = gw8.E(yt23, q);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt23.i0();
            if (yt23.S) {
                yt23.l(vy0);
            } else {
                yt23.r0();
            }
            g75.Q(tx0.f, yt23, d2);
            g75.Q(tx0.e, yt23, m);
            g75.Q(tx0.g, yt23, Integer.valueOf(hashCode));
            g75.O(yt23, tx0.h);
            g75.Q(tx0.d, yt23, E);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            yt2 yt24 = yt23;
            a37 b2 = vj.b(f2, hj8.H(vm42, yt23), (String) null, yt24, 0, 28);
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            a37 b3 = vj.b(f3, hj8.H(vm4.x, yt24), (String) null, yt24, 0, 28);
            tp1 tp1 = (tp1) yt24.k(xy0.h);
            boolean g = yt24.g(tp1);
            Object Q2 = yt24.Q();
            if (g || Q2 == obj3) {
                Q2 = new lc(tp1, 1);
                yt24.o0(Q2);
            }
            sr2 sr2 = (sr2) Q2;
            boolean g2 = yt24.g(ap43) | yt24.g(sr2);
            Object Q3 = yt24.Q();
            if (g2 || Q3 == obj3) {
                Q3 = new rf4(sr2, ap43);
                yt24.o0(Q3);
            }
            rf4 rf4 = (rf4) Q3;
            if (gs2 != null) {
                yt24.e0(-1825536046);
                pq6 = hr6.a(ar7.s0, yt24);
                yt24.r(false);
            } else {
                yt24.e0(-1825440690);
                pq6 = hr6.a(vq6.y, yt24);
                yt24.r(false);
            }
            fw0 J3 = su0.J(455696046, new p13(29, (Object) pq6, (Object) rf4), yt24);
            fw0 J4 = su0.J(2137606782, new ou4((Object) b2, (Object) rw42, (Object) pq6, 2), yt24);
            boolean g3 = yt24.g(b2);
            Object Q4 = yt24.Q();
            if (g3 || Q4 == obj3) {
                Q4 = new mu4(6, b2);
                yt24.o0(Q4);
            }
            sr2 sr22 = (sr2) Q4;
            boolean g4 = yt24.g(b3);
            Object Q5 = yt24.Q();
            if (g4 || Q5 == obj3) {
                Q5 = new mu4(7, b3);
                yt24.o0(Q5);
            }
            yt22 = yt24;
            c(J3, J4, J, fw02, z9, sr22, (sr2) Q5, yt22, (57344 & (i17 >> 6)) | 438);
            yt22.r(true);
            z5 = z9;
        } else {
            rw42 = rw43;
            yt22 = yt23;
            yt22.Y();
            z5 = z3;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new uw4(z, f5Var, fw0, ml4, gs2, z5, rw42, i13, i2);
        }
    }

    public static final void c(fw0 fw0, fw0 fw02, fw0 fw03, gs2 gs2, boolean z, sr2 sr2, sr2 sr22, yt2 yt2, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        fw0 fw04 = fw0;
        fw0 fw05 = fw02;
        fw0 fw06 = fw03;
        gs2 gs22 = gs2;
        boolean z10 = z;
        sr2 sr23 = sr2;
        sr2 sr24 = sr22;
        yt2 yt22 = yt2;
        int i10 = i;
        yt22.g0(-759267492);
        if ((i10 & 6) == 0) {
            if (yt22.i(fw04)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i10;
        } else {
            i2 = i10;
        }
        if ((i10 & 48) == 0) {
            if (yt22.i(fw05)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i10 & 384) == 0) {
            if (yt22.i(fw06)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i10 & 3072) == 0) {
            if (yt22.i(gs22)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i10 & 24576) == 0) {
            if (yt22.h(z10)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i10) == 0) {
            if (yt22.i(sr23)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i10) == 0) {
            if (yt22.i(sr24)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i2 & 1, z2)) {
            nw0 nw0 = new nw0(4);
            jl4 jl4 = jl4.w;
            ml4 D = we.D(jl4, nw0);
            if ((3670016 & i2) == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i2 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = z5 | z4;
            int i11 = 57344 & i2;
            if (i11 == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z12 = z11 | z6;
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (z12 || Q == d63) {
                Q = new vw4(sr24, gs22, z10);
                yt22.o0(Q);
            }
            lh4 lh4 = (lh4) Q;
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, D);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            int i12 = hashCode;
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, lh4);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(i12);
            int i13 = i2;
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            fw04.H(yt22, Integer.valueOf(i13 & 14));
            fw05.H(yt22, Integer.valueOf((i13 >> 3) & 14));
            ml4 w0 = rc9.w0(jl4, "icon");
            i80 i80 = xb4.y;
            lh4 d2 = mb0.d(i80, false);
            i80 i802 = i80;
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, w0);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, d2);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E2);
            f21.r((i13 >> 6) & 14, fw06, yt22, true);
            if (gs2 != null) {
                yt22.e0(773116085);
                ml4 w02 = rc9.w0(jl4, "label");
                if (i11 == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((i13 & 458752) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z13 = z8 | z9;
                Object Q2 = yt22.Q();
                if (z13 || Q2 == d63) {
                    z3 = z;
                    sr23 = sr2;
                    Q2 = new j30(z3, sr23);
                    yt22.o0(Q2);
                } else {
                    z3 = z;
                    sr23 = sr2;
                }
                ml4 X = mp7.X(w02, (vr2) Q2);
                lh4 d3 = mb0.d(i802, false);
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
                gs22 = gs2;
                z7 = true;
                pb4.q((i13 >> 9) & 14, gs22, yt22, true, false);
            } else {
                gs22 = gs2;
                z3 = z;
                sr23 = sr2;
                z7 = true;
                yt22.e0(773387087);
                yt22.r(false);
            }
            yt22.r(z7);
        } else {
            z3 = z10;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new sl0(fw0, fw02, fw06, gs22, z3, sr23, sr22, i);
        }
    }
}
