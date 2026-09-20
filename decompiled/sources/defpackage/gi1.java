package defpackage;

import android.view.KeyEvent;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: gi1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class gi1 {
    public static final pa5 a = x91.g(0.0f, 0.0f, 12.0f, 12.0f, 3);
    public static final pa5 b = x91.g(24.0f, 16.0f, 12.0f, 0.0f, 8);
    public static final pa5 c = x91.g(24.0f, 0.0f, 12.0f, 12.0f, 2);
    public static final float d = 16.0f;

    public static final void a(ml4 ml4, gs2 gs2, gs2 gs22, gs2 gs23, ig1 ig1, tg7 tg7, float f, fw0 fw0, yt2 yt2, int i) {
        int i2;
        gs2 gs24;
        gs2 gs25;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ig1 ig12 = ig1;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i11 = i;
        yt22.g0(-121497197);
        ml4 ml42 = ml4;
        if ((i11 & 6) == 0) {
            if (yt22.g(ml42)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i11;
        } else {
            i2 = i11;
        }
        gs2 gs26 = gs2;
        if ((i11 & 48) == 0) {
            if (yt22.i(gs26)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i11 & 384) == 0) {
            gs24 = gs22;
            if (yt22.i(gs24)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        } else {
            gs24 = gs22;
        }
        if ((i11 & 3072) == 0) {
            gs25 = gs23;
            if (yt22.i(gs25)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        } else {
            gs25 = gs23;
        }
        if ((i11 & 24576) == 0) {
            if (yt22.g(ig12)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        tg7 tg72 = tg7;
        if ((196608 & i11) == 0) {
            if (yt22.g(tg72)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((1572864 & i11) == 0) {
            if (yt22.d(f)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        } else {
            float f2 = f;
        }
        int i12 = i2 | 113246208;
        if ((805306368 & i11) == 0) {
            if (yt22.i(fw02)) {
                i3 = 536870912;
            } else {
                i3 = 268435456;
            }
            i12 |= i3;
        }
        int i13 = i12;
        if ((i13 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i13 & 1, z)) {
            ml4 o = yu6.o(ml42, h03.u, 0.0f, 0.0f, 0.0f, 14);
            Object Q = yt22.Q();
            if (Q == ay0.a) {
                Q = new f81(7);
                yt22.o0(Q);
            }
            ml4 h = b96.h(ck6.a(o, false, (vr2) Q), ig12.a, gr8.h);
            au0 a2 = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, h);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a2);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            ik2 ik2 = (ik2) yt22.k(xy0.i);
            d(gs2, ig12.b, ig12.c, f, su0.J(500940066, new tg1((Object) gs24, (Object) gs25, (Object) gs26, (Object) ig12, (Object) tg7, 0), yt22), yt22, (i13 & 112) | 196614 | (57344 & (i13 >> 6)));
            yt22.e0(-1081306235);
            yt22.r(false);
            fw02.H(yt22, Integer.valueOf((i13 >> 27) & 14));
            yt22.e0(-1081126683);
            yt22.r(false);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ug1(ml4, gs2, gs22, gs23, ig1, tg7, f, fw02, i);
        }
    }

    public static final void b(hi1 hi1, ml4 ml4, rg1 rg1, ig1 ig1, gs2 gs2, gs2 gs22, boolean z, ok2 ok2, yt2 yt2, int i) {
        int i2;
        boolean z2;
        ok2 ok22;
        boolean z3;
        gs2 gs23;
        gs2 gs24;
        ig1 ig12;
        rg1 rg12;
        ml4 ml42;
        ok2 ok23;
        boolean z4;
        fw0 fw0;
        fw0 fw02;
        ig1 ig13;
        rg1 rg13;
        jl4 jl4;
        fw0 fw03;
        hi1 hi12 = hi1;
        yt2 yt22 = yt2;
        yt22.g0(1105472031);
        if (yt22.g(hi12)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2 | 14378160;
        if ((4793491 & i3) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i3 & 1, z2)) {
            yt22.a0();
            int i4 = i & 1;
            d63 d63 = ay0.a;
            if (i4 == 0 || yt22.C()) {
                Object Q = yt22.Q();
                if (Q == d63) {
                    lg1 lg1 = lg1.a;
                    Q = new rg1();
                    yt22.o0(Q);
                }
                rg1 rg14 = (rg1) Q;
                lg1 lg12 = lg1.a;
                ig1 c2 = lg1.c(yt22);
                fw0 J = su0.J(1655706771, new sg1(hi12, c2, 0), yt22);
                fw0 J2 = su0.J(1439279037, new y30((Object) hi12, (Object) rg14, (Object) c2, 12), yt22);
                Object Q2 = yt22.Q();
                if (Q2 == d63) {
                    Q2 = new ok2();
                    yt22.o0(Q2);
                }
                ok23 = (ok2) Q2;
                fw0 = J2;
                fw02 = J;
                ig13 = c2;
                rg13 = rg14;
                jl4 = jl4.w;
                z4 = true;
            } else {
                yt22.Y();
                jl4 = ml4;
                rg13 = rg1;
                ig13 = ig1;
                fw02 = gs2;
                fw0 = gs22;
                z4 = z;
                ok23 = ok2;
            }
            yt22.s();
            boolean g = yt22.g(hi12.b);
            Object Q3 = yt22.Q();
            if (g || Q3 == d63) {
                Q3 = hi12.c;
                yt22.o0(Q3);
            }
            vh0 vh0 = (vh0) Q3;
            if (z4) {
                yt22.e0(-690563017);
                fw03 = su0.J(-1483431603, new sg1(hi12, ig13, 1), yt22);
                yt22.r(false);
            } else {
                yt22.e0(-690175393);
                yt22.r(false);
                fw03 = null;
            }
            tg7 a2 = dr7.a(h03.H, yt22);
            ig12 = ig13;
            float f = h03.F;
            rg1 rg15 = rg13;
            ok2 ok24 = ok23;
            fw0 fw04 = fw03;
            gs2 gs25 = fw0;
            gs2 gs26 = fw02;
            fw0 J3 = su0.J(1171988524, new tg1((Object) hi12, (Object) vh0, (Object) rg15, (Object) ig12, (Object) ok24, 2), yt22);
            gs2 gs27 = gs26;
            a(jl4, gs27, gs25, fw04, ig12, a2, f, J3, yt22, 806879670);
            gs24 = gs27;
            gs23 = gs25;
            z3 = z4;
            rg12 = rg15;
            ok22 = ok24;
            ml42 = jl4;
        } else {
            yt2.Y();
            ml42 = ml4;
            rg12 = rg1;
            ig12 = ig1;
            gs24 = gs2;
            gs23 = gs22;
            z3 = z;
            ok22 = ok2;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new oh1(hi1, ml42, rg12, ig12, gs24, gs23, z3, ok22, i);
        }
    }

    public static final void c(Long l, long j, vr2 vr2, vr2 vr22, vh0 vh0, re3 re3, rg1 rg1, kg1 kg1, ig1 ig1, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        o81 o81;
        boolean z2;
        vy0 vy0;
        long j2 = j;
        vh0 vh02 = vh0;
        re3 re32 = re3;
        rg1 rg12 = rg1;
        ig1 ig12 = ig1;
        yt2 yt22 = yt2;
        yt22.g0(-434467002);
        if (yt22.g(l)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i11 = i | i2;
        if (yt22.f(j2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i12 = i11 | i3;
        if (yt22.i(vr2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i13 = i12 | i4;
        if (yt22.i(vr22)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i14 = i13 | i5;
        if (yt22.i(vh02)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i15 = i14 | i6;
        if (yt22.i(re32)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i16 = i15 | i7;
        if (yt22.g(rg12)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i17 = i16 | i8;
        if (yt22.g(kg1)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i18 = i17 | i9;
        if (yt22.g(ig12)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i19 = i18 | i10;
        if ((38347923 & i19) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i19 & 1, z)) {
            yh0 f = vh02.f(j2);
            int i20 = (((f.a - re32.w) * 12) + f.b) - 1;
            if (i20 < 0) {
                i20 = 0;
            }
            s34 a2 = t34.a(i20, 2, yt22);
            Integer valueOf = Integer.valueOf(i20);
            boolean g = yt22.g(a2) | yt22.e(i20);
            Object Q = yt22.Q();
            Object obj = ay0.a;
            if (g || Q == obj) {
                Q = new bi1(a2, i20, (f61) null, 0);
                yt22.o0(Q);
            }
            t49.h((gs2) Q, yt22, valueOf);
            Object Q2 = yt22.Q();
            if (Q2 == obj) {
                Q2 = t49.D(yt22);
                yt22.o0(Q2);
            }
            o81 o812 = (o81) Q2;
            Object[] objArr = new Object[0];
            Object Q3 = yt22.Q();
            if (Q3 == obj) {
                Q3 = new nf1(2);
                yt22.o0(Q3);
            }
            aq4 aq4 = (aq4) u55.s(objArr, (sr2) Q3, yt22, 48);
            ik2 ik2 = (ik2) yt22.k(xy0.i);
            Object Q4 = yt22.Q();
            if (Q4 == obj) {
                ok2 ok2 = ok2.b;
                Q4 = nk2.a;
                yt22.o0(Q4);
            }
            ((nk2) Q4).getClass();
            ok2 ok22 = new ok2();
            ok2 ok23 = new ok2();
            ok2 ok24 = new ok2();
            ok2 ok25 = new ok2();
            int i21 = i19;
            g80 g80 = xb4.K;
            sr srVar = wr.c;
            yh0 yh0 = f;
            au0 a3 = zt0.a(srVar, g80, yt22, 0);
            sr srVar2 = srVar;
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            g80 g802 = g80;
            jl4 jl4 = jl4.w;
            int i22 = hashCode;
            ml4 E = gw8.E(yt22, jl4);
            ux0.d.getClass();
            ik2 ik22 = ik2;
            vy0 vy02 = tx0.b;
            yt22.i0();
            ok2 ok26 = ok24;
            if (yt22.S) {
                yt22.l(vy02);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, a3);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf2 = Integer.valueOf(i22);
            vy0 vy03 = vy02;
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf2);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = ckVar3;
            ck ckVar5 = tx0.d;
            g75.Q(ckVar5, yt22, E);
            ck ckVar6 = ckVar5;
            ce ceVar2 = ceVar;
            ml4 M = x91.M(jl4, 12.0f, 0.0f, 2);
            boolean c2 = a2.c();
            boolean b2 = a2.b();
            boolean booleanValue = ((Boolean) aq4.getValue()).booleanValue();
            Locale locale = vh02.a;
            rg12.getClass();
            boolean z3 = c2;
            boolean z4 = b2;
            String s = rg3.s(j2, "yMMMM", locale, rg12.a);
            if (s == null) {
                s = "-";
            }
            ml4 s2 = uq3.s(jl4, ok22);
            boolean i23 = yt22.i(o812) | yt22.g(a2);
            Object Q5 = yt22.Q();
            if (i23 || Q5 == obj) {
                Q5 = new bh1(o812, a2, 0);
                yt22.o0(Q5);
            }
            sr2 sr2 = (sr2) Q5;
            boolean i24 = yt22.i(o812) | yt22.g(a2);
            Object Q6 = yt22.Q();
            if (i24 || Q6 == obj) {
                Q6 = new bh1(o812, a2, 1);
                yt22.o0(Q6);
            }
            sr2 sr22 = (sr2) Q6;
            boolean g2 = yt22.g(aq4);
            Object Q7 = yt22.Q();
            if (g2 || Q7 == obj) {
                Q7 = new wi(aq4, 20);
                yt22.o0(Q7);
            }
            ok2 ok27 = ok26;
            sr2 sr23 = sr2;
            ik2 ik23 = ik22;
            boolean g3 = yt22.g(ok27) | yt22.i(ik23);
            sr2 sr24 = (sr2) Q7;
            Object Q8 = yt22.Q();
            if (g3 || Q8 == obj) {
                o81 = o812;
                z2 = false;
                Q8 = new ch1(ok27, ik23, 0);
                yt22.o0(Q8);
            } else {
                o81 = o812;
                z2 = false;
            }
            yh0 yh02 = yh0;
            sr2 sr25 = (sr2) Q8;
            ck ckVar7 = ckVar2;
            boolean z5 = booleanValue;
            yh0 yh03 = yh02;
            ik2 ik24 = ik23;
            ck ckVar8 = ckVar;
            sr srVar3 = srVar2;
            ig1 ig13 = ig1;
            String str = s;
            ok2 ok28 = ok22;
            sr2 sr26 = sr24;
            ok2 ok29 = ok27;
            boolean z6 = z4;
            aq4 aq42 = aq4;
            boolean z7 = z2;
            ce ceVar3 = ceVar2;
            yt2 yt23 = yt22;
            ml4 ml4 = s2;
            boolean z8 = z3;
            s34 s34 = a2;
            j(M, z8, z6, z5, str, ml4, sr23, sr22, sr26, sr25, ok23, ig13, yt23, 6, (i21 >> 21) & 112);
            ig1 ig14 = ig13;
            yt2 yt24 = yt23;
            lh4 d2 = mb0.d(xb4.y, z7);
            int hashCode2 = Long.hashCode(yt24.T);
            vf5 m2 = yt24.m();
            ml4 E2 = gw8.E(yt24, jl4);
            yt24.i0();
            if (yt24.S) {
                vy0 = vy03;
                yt24.l(vy0);
            } else {
                vy0 = vy03;
                yt24.r0();
            }
            g75.Q(ckVar8, yt24, d2);
            g75.Q(ckVar7, yt24, m2);
            ck ckVar9 = ckVar4;
            f21.s(hashCode2, yt24, ckVar9, yt24, ceVar3);
            ck ckVar10 = ckVar6;
            g75.Q(ckVar10, yt24, E2);
            ml4 M2 = x91.M(jl4, 12.0f, 0.0f, 2);
            au0 a4 = zt0.a(srVar3, g802, yt24, z7 ? 1 : 0);
            Object obj2 = obj;
            int hashCode3 = Long.hashCode(yt24.T);
            vf5 m3 = yt24.m();
            ml4 E3 = gw8.E(yt24, M2);
            yt24.i0();
            jl4 jl42 = jl4;
            if (yt24.S) {
                yt24.l(vy0);
            } else {
                yt24.r0();
            }
            g75.Q(ckVar8, yt24, a4);
            g75.Q(ckVar7, yt24, m3);
            f21.s(hashCode3, yt24, ckVar9, yt24, ceVar3);
            g75.Q(ckVar10, yt24, E3);
            l(ig14, vh02, yt24, ((i21 >> 24) & 14) | ((i21 >> 9) & 112));
            boolean g4 = yt24.g(ok28);
            Object Q9 = yt24.Q();
            if (g4 || Q9 == obj2) {
                Q9 = new dh1(ok28, 0);
                yt24.o0(Q9);
            }
            int i25 = i21;
            ik2 ik25 = ik24;
            s34 s342 = s34;
            vr2 vr23 = vr22;
            g(s342, l, vr2, vr23, vh02, re3, rg1, kg1, ig14, (sr2) Q9, ik25, yt24, ((i21 << 3) & 112) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25) | (i25 & 234881024));
            s34 s343 = s342;
            yt2 yt25 = yt24;
            yt25.r(true);
            vm4 vm4 = vm4.y;
            je2 H = hj8.H(vm4, yt25);
            je2 H2 = hj8.H(vm4.z, yt25);
            je2 H3 = hj8.H(vm4, yt25);
            boolean booleanValue2 = ((Boolean) aq42.getValue()).booleanValue();
            ml4 g5 = we.g(jl42);
            n52 a5 = i52.d(H3, 14).a(new n52(new nm7(new gb2(0.6f, H), (dv6) null, (cn0) null, (xf6) null, (LinkedHashMap) null, 126)));
            x82 a6 = i52.i(H3, 14).a(i52.f(H2, 2));
            yh0 yh04 = yh03;
            aq4 aq43 = aq42;
            o81 o813 = o81;
            yt2 yt26 = yt25;
            ie1.c(booleanValue2, g5, a5, a6, (String) null, su0.J(1193716082, new eh1(j, aq43, o813, s343, re3, yh04, kg1, vh0, ig1, ok29, ok23, ok25, ik25), yt25), yt26, 196656, 16);
            yt22 = yt26;
            yt22.r(true);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new fh1(l, j, vr2, vr22, vh0, re3, rg1, kg1, ig1, i);
        }
    }

    public static final void d(gs2 gs2, long j, long j2, float f, fw0 fw0, yt2 yt2, int i) {
        int i2;
        long j3;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        gs2 gs22 = gs2;
        long j4 = j2;
        float f2 = f;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i9 = i;
        yt22.g0(2020490761);
        int i10 = i9 & 6;
        ml4 ml4 = jl4.w;
        if (i10 == 0) {
            if (yt22.g(ml4)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        if ((i9 & 48) == 0) {
            if (yt22.i(gs22)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i9 & 384) == 0) {
            j3 = j;
            if (yt22.f(j3)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        } else {
            j3 = j;
        }
        if ((i9 & 3072) == 0) {
            if (yt22.f(j4)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i9 & 24576) == 0) {
            if (yt22.d(f2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i9) == 0) {
            if (yt22.i(fw02)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((74899 & i2) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            if (gs22 != null) {
                ml4 = yu6.b(ml4, 0.0f, f2, 1);
            }
            ml4 d2 = yu6.a.d(ml4);
            au0 a2 = zt0.a(wr.g, xb4.K, yt22, 6);
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
            g75.Q(tx0.f, yt22, a2);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            if (gs22 != null) {
                yt22.e0(396894187);
                a35.a(j3, dr7.a(h03.J, yt22), su0.J(1344395458, new sa(2, gs22), yt22), yt22, ((i2 >> 6) & 14) | 384);
                yt22.r(false);
            } else {
                yt22.e0(397163267);
                yt22.r(false);
            }
            t49.c(b81.g(j4, j41.a), fw02, yt22, ((i2 >> 12) & 112) | 8);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new vg1(gs22, j, j4, f2, fw02, i);
        }
    }

    public static final void e(String str, ml4 ml4, boolean z, sr2 sr2, boolean z2, boolean z3, boolean z4, String str2, ig1 ig1, yt2 yt2, int i) {
        int i2;
        String str3;
        boolean z5;
        boolean z6;
        long j;
        a37 a37;
        int i3;
        ua0 ua0;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ml4 ml42 = ml4;
        boolean z7 = z;
        boolean z8 = z2;
        boolean z9 = z3;
        boolean z10 = z4;
        String str4 = str2;
        ig1 ig12 = ig1;
        yt2 yt22 = yt2;
        int i14 = i;
        yt22.g0(-945355136);
        if ((i14 & 6) == 0) {
            str3 = str;
            if (yt22.g(str3)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i2 = i13 | i14;
        } else {
            str3 = str;
            i2 = i14;
        }
        if ((i14 & 48) == 0) {
            if (yt22.g(ml42)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i2 |= i12;
        }
        if ((i14 & 384) == 0) {
            if (yt22.h(z7)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i2 |= i11;
        }
        if ((i14 & 3072) == 0) {
            if (yt22.i(sr2)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i2 |= i10;
        } else {
            sr2 sr22 = sr2;
        }
        if ((i14 & 24576) == 0) {
            if (yt22.h(z8)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i2 |= i9;
        }
        if ((196608 & i14) == 0) {
            if (yt22.h(z9)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i2 |= i8;
        }
        if ((1572864 & i14) == 0) {
            if (yt22.h(z10)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i2 |= i7;
        }
        if ((12582912 & i14) == 0) {
            if (yt22.h(false)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i2 |= i6;
        }
        if ((100663296 & i14) == 0) {
            if (yt22.g(str4)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i2 |= i5;
        }
        if ((805306368 & i14) == 0) {
            if (yt22.g(ig12)) {
                i4 = 536870912;
            } else {
                i4 = 268435456;
            }
            i2 |= i4;
        }
        if ((306783379 & i2) != 306783378) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (yt22.V(i2 & 1, z5)) {
            if ((234881024 & i2) == 67108864) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object Q = yt22.Q();
            if (z6 || Q == ay0.a) {
                Q = new cb(str4, 6);
                yt22.o0(Q);
            }
            ml4 a2 = ck6.a(ml42, true, (vr2) Q);
            pq6 a3 = hr6.a(h03.w, yt22);
            int i15 = i2 >> 6;
            if (!z7) {
                ig12.getClass();
                j = jt0.f;
            } else if (z9) {
                j = ig12.r;
            } else {
                j = ig12.s;
            }
            if (z8) {
                yt22.e0(-1319881536);
                i3 = i15;
                a37 = ru6.a(j, hj8.H(vm4.y, yt22), (String) null, yt22, 0, 12);
                yt22.r(false);
            } else {
                i3 = i15;
                yt22.e0(-1319654864);
                a37 = u55.v(new jt0(j), yt22);
                yt22.r(false);
            }
            long j2 = ((jt0) a37.getValue()).a;
            if (!z10 || z7) {
                ua0 = null;
            } else {
                ua0 = uq3.a(h03.C, ig12.u);
            }
            ua0 ua02 = ua0;
            fw0 J = su0.J(1126347158, new wh1(str3, ig12, z10, z, z9), yt22);
            s87.b(z, sr2, a2, z3, a3, j2, 0, 0.0f, ua02, (ap4) null, J, yt2, i3 & 7294, 1472);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new xh1(str, ml42, z, sr2, z2, z3, z4, str2, ig1, i);
        }
    }

    public static final void f(ml4 ml4, int i, vr2 vr2, ig1 ig1, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        yt2.g0(-1461252485);
        if (yt2.e(i)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i3 | i2;
        if (yt2.i(vr2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if (yt2.g(ig1)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i7 | i5;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i8 & 1, z)) {
            t49.c(b81.g(ig1.c, j41.a), su0.J(-1734512197, new vk0(i, vr2, ml4), yt2), yt2, 56);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new bi(ml4, i, vr2, ig1, i2, 6);
        }
    }

    public static final void g(s34 s34, Long l, vr2 vr2, vr2 vr22, vh0 vh0, re3 re3, rg1 rg1, kg1 kg1, ig1 ig1, sr2 sr2, ik2 ik2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        char c2;
        boolean z;
        yh0 yh0;
        boolean z2;
        gs2 gs2;
        int i11;
        s34 s342 = s34;
        vh0 vh02 = vh0;
        re3 re32 = re3;
        yt2 yt22 = yt2;
        yt22.g0(-1038629066);
        if (yt22.g(s342)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i12 = i | i2;
        Long l2 = l;
        if ((i & 48) == 0) {
            if (yt22.g(l2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i12 |= i11;
        }
        vr2 vr23 = vr2;
        if (yt22.i(vr23)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i13 = i12 | i3;
        if (yt22.i(vr22)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i14 = i13 | i4;
        if (yt22.i(vh02)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i15 = i14 | i5;
        if (yt22.i(re32)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i16 = i15 | i6;
        rg1 rg12 = rg1;
        if (yt22.g(rg12)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i17 = i16 | i7;
        kg1 kg12 = kg1;
        if (yt22.g(kg12)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i18 = i17 | i8;
        ig1 ig12 = ig1;
        if (yt22.g(ig12)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i19 = i18 | i9;
        sr2 sr22 = sr2;
        if (yt22.i(sr22)) {
            i10 = 536870912;
        } else {
            i10 = 268435456;
        }
        int i20 = i19 | i10;
        ik2 ik22 = ik2;
        if (yt22.i(ik22)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        boolean z3 = false;
        if ((i20 & 306783379) == 306783378 && (c2 & 3) == 2) {
            z = false;
        } else {
            z = true;
        }
        if (yt22.V(i20 & 1, z)) {
            th0 h = vh02.h();
            boolean g = yt22.g(re32);
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (g || Q == d63) {
                yh0 = vh02.e(re32.w, 1);
                yt22.o0(yh0);
            } else {
                yh0 = Q;
            }
            tg7 a2 = dr7.a(h03.y, yt22);
            sr2 sr23 = sr22;
            re3 re33 = re32;
            ig1 ig13 = ig12;
            sr2 sr24 = sr23;
            d63 d632 = d63;
            vh0 vh03 = vh02;
            int i21 = i20;
            lh1 lh1 = new lh1(h, vh03, yh0, ig13, kg12, rg12, ik22, sr24, vr23, re33, s34, l2);
            vh0 vh04 = vh03;
            re3 re34 = re33;
            yf7.a(a2, su0.J(-1911156825, lh1, yt22), yt22, 48);
            if ((i21 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i21 & 7168) == 2048) {
                z3 = true;
            }
            boolean i22 = z2 | z3 | yt22.i(vh04) | yt22.i(re34);
            Object Q2 = yt22.Q();
            if (i22 || Q2 == d632) {
                s342 = s34;
                gs2 = new ng(s342, vr22, vh04, re34, (f61) null, 6);
                yt22.o0(gs2);
            } else {
                gs2 = Q2;
                s342 = s34;
            }
            t49.h(gs2, yt22, s342);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new mh1(s342, l, vr2, vr22, vh0, re3, rg1, kg1, ig1, sr2, ik2, i);
        }
    }

    public static final void h(sr2 sr2, x83 x83, String str, ml4 ml4, boolean z, yt2 yt2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        ml4 ml42;
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        boolean z4;
        ml4 ml43;
        jl4 jl4;
        int i8;
        int i9;
        yt2 yt22 = yt2;
        yt22.g0(-368059805);
        if (yt22.i(sr2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i | i3;
        if (yt22.g(x83)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (yt22.g(str)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        int i13 = i2 & 8;
        if (i13 != 0) {
            i6 = i12 | 3072;
            ml42 = ml4;
        } else {
            ml42 = ml4;
            if (yt22.g(ml42)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i6 = i12 | i9;
        }
        int i14 = i2 & 16;
        if (i14 != 0) {
            i7 = i6 | 24576;
            z2 = z;
        } else {
            z2 = z;
            if (yt22.h(z2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i7 = i6 | i8;
        }
        if ((i7 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i7 & 1, z3)) {
            if (i13 != 0) {
                jl4 = jl4.w;
            } else {
                jl4 = ml42;
            }
            if (i14 != 0) {
                z2 = true;
            }
            boolean z5 = z2;
            ak7.c(wj7.a(yt22), su0.J(-456272562, new gh1(str, 0), yt22), ak7.d(yt22), (ml4) null, false, su0.J(-1124908186, new hh1(sr2, jl4, z5, x83, str), yt22), yt22, 100663344);
            ml43 = jl4;
            z4 = z5;
        } else {
            yt2.Y();
            ml43 = ml42;
            z4 = z2;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ih1(sr2, x83, str, ml43, z4, i, i2);
        }
    }

    public static final void i(yh0 yh0, vr2 vr2, long j, Long l, rg1 rg1, kg1 kg1, ig1 ig1, Locale locale, s34 s34, ik2 ik2, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char c2;
        boolean z;
        vr2 vr22;
        yt2 yt22;
        boolean z2;
        Object obj;
        int i10;
        int i11;
        int i12;
        int i13;
        yt2 yt23;
        boolean z3;
        o81 o81;
        boolean z4;
        boolean z5;
        int i14;
        String str;
        boolean z6;
        boolean z7;
        boolean z8;
        jl4 jl4;
        ml4 ml4;
        o81 o812;
        Object obj2;
        boolean z9;
        yh0 yh02 = yh0;
        vr2 vr23 = vr2;
        long j2 = j;
        Long l2 = l;
        rg1 rg12 = rg1;
        Locale locale2 = locale;
        s34 s342 = s34;
        ik2 ik22 = ik2;
        yt2 yt24 = yt2;
        yt24.g0(1724672983);
        if (yt24.g(yh02)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i15 = i | i2;
        char c3 = 16;
        if (yt24.i(vr23)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i16 = i15 | i3;
        char c4 = 128;
        if (yt24.f(j2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i17 = i16 | i4;
        if (yt24.g(l2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i18 = i17 | i5;
        if (yt24.g(rg12)) {
            i6 = 1048576;
        } else {
            i6 = 524288;
        }
        int i19 = i18 | i6;
        if (yt24.g(kg1)) {
            i7 = 8388608;
        } else {
            i7 = 4194304;
        }
        int i20 = i19 | i7;
        if (yt24.g(ig1)) {
            i8 = 67108864;
        } else {
            i8 = 33554432;
        }
        int i21 = i20 | i8;
        if (yt24.g(locale2)) {
            i9 = 536870912;
        } else {
            i9 = 268435456;
        }
        int i22 = i21 | i9;
        if (yt24.g(s342)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if (yt24.i(ik22)) {
            c3 = ' ';
        }
        char c5 = c2 | c3;
        sr2 sr22 = sr2;
        if (yt24.i(sr22)) {
            c4 = 256;
        }
        char c6 = c5 | c4;
        if ((i22 & 306783379) == 306783378 && (c6 & 147) == 146) {
            z = false;
        } else {
            z = true;
        }
        if (yt24.V(i22 & 1, z)) {
            yt24.e0(-960202325);
            yt24.r(false);
            Object Q = yt24.Q();
            Object obj3 = ay0.a;
            if (Q == obj3) {
                Q = t49.D(yt24);
                yt24.o0(Q);
            }
            o81 o813 = (o81) Q;
            if (yt24.k(xy0.n) == ey3.x) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i23 = yh02.d;
            int i24 = yh02.c;
            kg1.getClass();
            int i25 = i24 + i23;
            int i26 = i25 - 1;
            int i27 = i22;
            jl4 jl42 = jl4.w;
            ml4 d2 = yu6.g(jl42, 288.0f).d(jl42);
            g80 g80 = xb4.K;
            d63 d63 = wr.f;
            jl4 jl43 = jl42;
            au0 a2 = zt0.a(d63, g80, yt24, 6);
            int hashCode = Long.hashCode(yt24.T);
            vf5 m = yt24.m();
            ml4 E = gw8.E(yt24, d2);
            ux0.d.getClass();
            int i28 = hashCode;
            vy0 vy0 = tx0.b;
            yt24.i0();
            if (yt24.S) {
                yt24.l(vy0);
            } else {
                yt24.r0();
            }
            g75.Q(tx0.f, yt24, a2);
            g75.Q(tx0.e, yt24, m);
            g75.Q(tx0.g, yt24, Integer.valueOf(i28));
            g75.O(yt24, tx0.h);
            g75.Q(tx0.d, yt24, E);
            yt24.e0(-1663449878);
            int i29 = 0;
            int i30 = 0;
            while (i30 < 6) {
                sd2 sd2 = yu6.a;
                ea6 a3 = ca6.a(d63, xb4.I, yt24, 54);
                int i31 = i29;
                int i32 = i30;
                int hashCode2 = Long.hashCode(yt24.T);
                vf5 m2 = yt24.m();
                ml4 E2 = gw8.E(yt24, sd2);
                ux0.d.getClass();
                d63 d632 = d63;
                vy0 vy02 = tx0.b;
                yt24.i0();
                int i33 = hashCode2;
                if (yt24.S) {
                    yt24.l(vy02);
                } else {
                    yt24.r0();
                }
                g75.Q(tx0.f, yt24, a3);
                g75.Q(tx0.e, yt24, m2);
                g75.Q(tx0.g, yt24, Integer.valueOf(i33));
                g75.O(yt24, tx0.h);
                g75.Q(tx0.d, yt24, E2);
                yt24.e0(-1092569031);
                i29 = i31;
                int i34 = 0;
                while (i34 < 7) {
                    if (i29 < i23 || i29 >= i25) {
                        i13 = i34;
                        i11 = i23;
                        i12 = i25;
                        i10 = i26;
                        obj = obj3;
                        z3 = z2;
                        vr2 vr24 = vr2;
                        yt23 = yt24;
                        o81 = o813;
                        yt23.e0(490256726);
                        ml4 o = yu6.o(jl43, h03.x, h03.v, 0.0f, 0.0f, 12);
                        t37 t37 = hf3.c;
                        k75.a(yt23, yu6.m(o, ((lx1) yt23.k(t37)).w, ((lx1) yt23.k(t37)).w));
                        yt23.r(false);
                    } else {
                        yt24.e0(491361535);
                        int i35 = i29 - i23;
                        i13 = i34;
                        long j3 = (((long) i35) * 86400000) + yh02.e;
                        if (j3 == j) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (l != null && j3 == l.longValue()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        yt24.e0(492321698);
                        yt24.r(false);
                        StringBuilder sb = new StringBuilder();
                        i12 = i25;
                        yt24.e0(974818987);
                        yt24.r(false);
                        if (z4) {
                            yt24.e0(974842237);
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(h75.i(R.string.m3c_date_picker_today_description, yt24));
                            yt24.r(false);
                            i14 = i35;
                        } else {
                            i14 = i35;
                            yt24.e0(975009451);
                            yt24.r(false);
                        }
                        if (sb.length() == 0) {
                            str = null;
                        } else {
                            str = sb.toString();
                        }
                        Locale locale3 = locale;
                        boolean z10 = z5;
                        String a4 = rg12.a(Long.valueOf(j3), locale3, true);
                        if (a4 == null) {
                            a4 = "";
                        }
                        String str2 = a4;
                        boolean f = yt24.f(j3);
                        String str3 = ", ";
                        if ((i27 & 29360128) == 8388608) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        boolean z11 = z6 | f;
                        Object Q2 = yt24.Q();
                        if (z11 || Q2 == obj3) {
                            Q2 = Boolean.TRUE;
                            yt24.o0(Q2);
                        }
                        boolean booleanValue = ((Boolean) Q2).booleanValue();
                        String a5 = uh0.a(i14 + 1, locale3);
                        if (i29 == i23) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (i29 == i26) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (ik2 == null) {
                            s34 s343 = s34;
                            ik2 ik23 = ik2;
                            i11 = i23;
                            obj2 = obj3;
                            o812 = o813;
                            ml4 = jl43;
                            jl4 = ml4;
                        } else if (z7) {
                            i11 = i23;
                            obj2 = obj3;
                            sr2 sr23 = sr22;
                            s34 s344 = s34;
                            ik2 ik24 = ik2;
                            di1 di1 = new di1(sr23, s344, z2, ik24, o813);
                            ik2 ik25 = ik24;
                            di1 di12 = di1;
                            s34 s345 = s344;
                            o812 = o813;
                            jl4 = jl43;
                            ml4 = t49.U(jl4, di12);
                        } else {
                            s34 s346 = s34;
                            ik2 ik26 = ik2;
                            i11 = i23;
                            obj2 = obj3;
                            o812 = o813;
                            jl4 = jl43;
                            if (z8) {
                                ml4 = t49.U(jl4, new ei1(ik26, s346, z2, o812));
                            } else {
                                ml4 = t49.U(jl4, new pg1(1, ik26, z2));
                            }
                        }
                        i10 = i26;
                        if ((i27 & 112) == 32) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        boolean f2 = z9 | yt24.f(j3);
                        Object Q3 = yt24.Q();
                        if (f2 || Q3 == obj2) {
                            obj = obj2;
                            Q3 = new yi(1, j3, vr2);
                            yt24.o0(Q3);
                        } else {
                            vr2 vr25 = vr2;
                            obj = obj2;
                        }
                        sr2 sr24 = (sr2) Q3;
                        if (str != null) {
                            str2 = pb4.l(str, str3, str2);
                        }
                        ml4 ml42 = ml4;
                        boolean z12 = z10;
                        boolean z13 = z10;
                        yt2 yt25 = yt24;
                        o81 = o812;
                        boolean z14 = z13;
                        z3 = z2;
                        jl43 = jl4;
                        e(a5, ml42, z14, sr24, z12, booleanValue, z4, str2, ig1, yt25, (i27 << 3) & 1879048192);
                        yt23 = yt25;
                        yt23.r(false);
                    }
                    i29++;
                    rg12 = rg1;
                    sr22 = sr2;
                    o813 = o81;
                    z2 = z3;
                    yt24 = yt23;
                    i34 = i13 + 1;
                    i25 = i12;
                    i23 = i11;
                    i26 = i10;
                    obj3 = obj;
                    yh02 = yh0;
                }
                yt2 yt26 = yt24;
                int i36 = i23;
                int i37 = i26;
                Object obj4 = obj3;
                boolean z15 = z2;
                o81 o814 = o813;
                vr2 vr26 = vr2;
                yt26.r(false);
                yt26.r(true);
                i30 = i32 + 1;
                rg12 = rg1;
                sr22 = sr2;
                yt24 = yt26;
                d63 = d632;
                i25 = i25;
                i23 = i36;
                yh02 = yh0;
            }
            vr22 = vr2;
            yt22 = yt24;
            yt22.r(false);
            yt22.r(true);
        } else {
            vr22 = vr23;
            yt22 = yt24;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new uh1(yh0, vr22, j, l, rg1, kg1, ig1, locale, s34, ik2, sr2, i);
        }
    }

    public static final void j(ml4 ml4, boolean z, boolean z2, boolean z3, String str, ml4 ml42, sr2 sr2, sr2 sr22, sr2 sr23, sr2 sr24, ok2 ok2, ig1 ig1, yt2 yt2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        tr trVar;
        boolean z5;
        boolean z6;
        int i13;
        int i14;
        boolean z7 = z3;
        String str2 = str;
        sr2 sr25 = sr24;
        ok2 ok22 = ok2;
        ig1 ig12 = ig1;
        yt2 yt22 = yt2;
        yt22.g0(942117263);
        if (yt22.h(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i15 = i | i3;
        boolean z8 = z2;
        if (yt22.h(z8)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i16 = i15 | i4;
        if (yt22.h(z7)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i17 = i16 | i5;
        if (yt22.g(str2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i18 = i17 | i6;
        ml4 ml43 = ml42;
        if (yt22.g(ml43)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i19 = i18 | i7;
        if (yt22.i(sr2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i20 = i19 | i8;
        sr2 sr26 = sr22;
        if (yt22.i(sr26)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i21 = i20 | i9;
        if (yt22.i(sr23)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i22 = i21 | i10;
        if (yt22.i(sr25)) {
            i11 = 536870912;
        } else {
            i11 = 268435456;
        }
        int i23 = i22 | i11;
        if ((i2 & 6) == 0) {
            if (yt22.g(ok22)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i2 | i14;
        } else {
            i12 = i2;
        }
        if ((i2 & 48) == 0) {
            if (yt22.g(ig12)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i23 & 306783379) == 306783378 && (i12 & 19) == 18) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (yt22.V(i23 & 1, z4)) {
            ml4 g = yu6.g(ml4.d(yu6.a), 56.0f);
            if (z7) {
                trVar = wr.a;
            } else {
                trVar = wr.g;
            }
            ea6 a2 = ca6.a(trVar, xb4.I, yt22, 48);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, g);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            int i24 = hashCode;
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a2);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(i24));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            ml4 s = uq3.s(jl4.w, ok22);
            if ((i23 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((1879048192 & i23) == 536870912) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z9 = z5 | z6;
            Object Q = yt22.Q();
            if (z9 || Q == ay0.a) {
                Q = new pg1(2, sr25, z7);
                yt22.o0(Q);
            }
            int i25 = ((i23 >> 24) & 14) | 3072 | ((i23 >> 6) & 112);
            o(sr23, z7, t49.U(s, (vr2) Q), su0.J(921071711, new p13(10, (Object) str2, (Object) ig12), yt22), yt22, i25);
            if (!z3) {
                yt22.e0(-1241751848);
                t49.c(b81.g(ig12.f, j41.a), su0.J(591596400, new jh1(sr26, z8, sr2, ml43, z), yt22), yt22, 56);
                yt22.r(false);
            } else {
                yt22.e0(-1240891753);
                yt22.r(false);
            }
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new kh1(ml4, z, z2, z3, str2, ml42, sr2, sr22, sr23, sr25, ok22, ig12, i, i2);
        }
    }

    public static final void k(Long l, long j, int i, vr2 vr2, vr2 vr22, vh0 vh0, re3 re3, rg1 rg1, kg1 kg1, ig1 ig1, ok2 ok2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        int i13 = i;
        yt2 yt22 = yt2;
        yt22.g0(-2053685029);
        Long l2 = l;
        char c2 = 4;
        if (yt22.g(l2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i14 = i2 | i3;
        if (yt22.f(j)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i15 = i14 | i4;
        if (yt22.e(i13)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i16 = i15 | i5;
        if (yt22.i(vr2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i17 = i16 | i6;
        if (yt22.i(vr22)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i18 = i17 | i7;
        if (yt22.i(vh0)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i19 = i18 | i8;
        re3 re32 = re3;
        if (yt22.i(re32)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i20 = i19 | i9;
        rg1 rg12 = rg1;
        if (yt22.g(rg12)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i21 = i20 | i10;
        kg1 kg12 = kg1;
        if (yt22.g(kg12)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i22 = i21 | i11;
        if (yt22.g(ig1)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i23 = i22 | i12;
        ok2 ok22 = ok2;
        if (!yt22.g(ok22)) {
            c2 = 2;
        }
        int i24 = i23;
        char c3 = c2;
        if ((i23 & 306783379) == 306783378 && (c3 & 3) == 2) {
            z = false;
        } else {
            z = true;
        }
        if (yt22.V(i24 & 1, z)) {
            int i25 = -((tp1) yt22.k(xy0.h)).r0(48.0f);
            je2 H = hj8.H(vm4.y, yt22);
            je2 H2 = hj8.H(vm4.z, yt22);
            vm4 vm4 = vm4.w;
            je2 H3 = hj8.H(vm4, yt22);
            je2 H4 = hj8.H(vm4, yt22);
            cw1 cw1 = new cw1(i13);
            Object Q = yt22.Q();
            cw1 cw12 = cw1;
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = new f81(3);
                yt22.o0(Q);
            }
            ml4 a2 = ck6.a(jl4.w, false, (vr2) Q);
            boolean i26 = yt22.i(H3) | yt22.i(H) | yt22.i(H2) | yt22.e(i25) | yt22.i(H4);
            Object Q2 = yt22.Q();
            if (i26 || Q2 == d63) {
                Q2 = new wg1(i25, 0, (Object) H3, (Object) H, (Object) H2, (Object) H4);
                yt22.o0(Q2);
            }
            ok2 ok23 = ok22;
            ml4 ml4 = a2;
            cw1 cw13 = cw12;
            fd1.b(cw13, ml4, (vr2) Q2, (jb) null, "DatePickerDisplayModeAnimation", (vr2) null, su0.J(1838500091, new xg1(l2, j, vr2, vr22, vh0, re32, rg12, kg12, ig1, ok23), yt22), yt22, ((i24 >> 6) & 14) | 1597440);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new yg1(l, j, i, vr2, vr22, vh0, re3, rg1, kg1, ig1, ok2, i2);
        }
    }

    public static final void l(ig1 ig1, vh0 vh0, yt2 yt2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        ig1 ig12 = ig1;
        vh0 vh02 = vh0;
        yt2 yt22 = yt2;
        yt22.g0(-1849465391);
        if ((i & 6) == 0) {
            if (yt22.g(ig12)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt22.i(vh02)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i5 = 18;
        boolean z2 = false;
        boolean z3 = true;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            int d2 = vh02.d();
            List i6 = vh02.i();
            ArrayList arrayList = new ArrayList();
            int i7 = d2 - 1;
            int size = i6.size();
            for (int i8 = i7; i8 < size; i8++) {
                arrayList.add(i6.get(i8));
            }
            for (int i9 = 0; i9 < i7; i9++) {
                arrayList.add(i6.get(i9));
            }
            tg7 a2 = dr7.a(h03.O, yt22);
            jl4 jl4 = jl4.w;
            ml4 d3 = yu6.b(jl4, 0.0f, 48.0f, 1).d(yu6.a);
            ea6 a3 = ca6.a(wr.f, xb4.I, yt22, 54);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, d3);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a3);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            yt22.e0(24563235);
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                yb5 yb5 = (yb5) arrayList.get(i10);
                boolean g = yt22.g(yb5);
                Object Q = yt22.Q();
                if (g || Q == ay0.a) {
                    Q = new gg0(i5, (Object) yb5);
                    yt22.o0(Q);
                }
                AtomicInteger atomicInteger = ck6.a;
                ml4 o = yu6.o(new zq0((vr2) Q), h03.x, h03.v, 0.0f, 0.0f, 12);
                t37 t37 = hf3.c;
                ml4 m2 = yu6.m(o, ((lx1) yt22.k(t37)).w, ((lx1) yt22.k(t37)).w);
                lh4 d4 = mb0.d(xb4.C, z2);
                int hashCode2 = Long.hashCode(yt22.T);
                vf5 m3 = yt22.m();
                ml4 E2 = gw8.E(yt22, m2);
                ux0.d.getClass();
                vy0 vy02 = tx0.b;
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy02);
                } else {
                    yt22.r0();
                }
                g75.Q(tx0.f, yt22, d4);
                g75.Q(tx0.e, yt22, m3);
                g75.Q(tx0.g, yt22, Integer.valueOf(hashCode2));
                g75.O(yt22, tx0.h);
                g75.Q(tx0.d, yt22, E2);
                boolean z4 = z2;
                boolean z5 = z3;
                yt2 yt23 = yt2;
                yf7.b((String) yb5.x, yu6.s(jl4, (i80) null, 3), ig12.d, 0, (am2) null, (ea7) null, 0, (rd7) null, new hc7(3), 0, 0, false, 0, 0, a2, yt23, 48, 0, 130040);
                yt22 = yt23;
                yt22.r(z5);
                i10++;
                z2 = false;
                z3 = z5;
                jl4 = jl4;
                i5 = 18;
                size2 = size2;
                arrayList = arrayList;
                ig12 = ig1;
            }
            yt22.r(z2);
            yt22.r(z3);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dj7((Object) ig1, (Object) vh02, i, 6);
        }
    }

    public static final void m(String str, ml4 ml4, boolean z, boolean z2, sr2 sr2, String str2, ig1 ig1, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        boolean z4;
        boolean z5;
        int i10;
        boolean z6;
        long j;
        ua0 ua0;
        String str3 = str;
        ml4 ml42 = ml4;
        boolean z7 = z;
        boolean z8 = z2;
        String str4 = str2;
        ig1 ig12 = ig1;
        yt2 yt22 = yt2;
        yt22.g0(-1153850597);
        if (yt22.g(str3)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i11 = i | i2;
        if (yt22.g(ml42)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i12 = i11 | i3;
        if (yt22.h(z7)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i13 = i12 | i4;
        if (yt22.h(z8)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i14 = i13 | i5;
        sr2 sr22 = sr2;
        if (yt22.i(sr22)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i15 = i14 | i6;
        if (yt22.h(true)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i16 = i15 | i7;
        if (yt22.g(str4)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i17 = i16 | i8;
        if (yt22.g(ig12)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i18 = i17 | i9;
        if ((4793491 & i18) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i18 & 1, z3)) {
            if ((i18 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i18 & 896) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = z4 | z5;
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (z9 || Q == d63) {
                if (!z8 || z7) {
                    i10 = i18;
                    ua0 = null;
                } else {
                    i10 = i18;
                    ua0 = uq3.a(h03.C, ig12.u);
                }
                Q = ua0;
                yt22.o0(Q);
            } else {
                i10 = i18;
            }
            ua0 ua02 = (ua0) Q;
            if ((i10 & 3670016) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object Q2 = yt22.Q();
            if (z6 || Q2 == d63) {
                Q2 = new cb(str4, 7);
                yt22.o0(Q2);
            }
            ml4 a2 = ck6.a(ml42, true, (vr2) Q2);
            pq6 a3 = hr6.a(h03.U, yt22);
            int i19 = i10 >> 6;
            int i20 = i19 & 14;
            if (z7) {
                j = ig12.l;
            } else {
                ig12.getClass();
                j = jt0.f;
            }
            ua0 ua03 = ua02;
            pq6 pq6 = a3;
            s87.b(z7, sr22, a2, true, pq6, ((jt0) ru6.a(j, hj8.H(vm4.y, yt22), (String) null, yt22, 0, 12).getValue()).a, 0, 0.0f, ua03, (ap4) null, su0.J(-564400443, new ai1(str3, ig12, z8, z7), yt22), yt2, (i19 & 7168) | i20 | ((i10 >> 9) & 112), 1472);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ro2(str3, ml4, z, z2, sr2, str2, ig1, i);
        }
    }

    public static final void n(ml4 ml4, long j, vr2 vr2, kg1 kg1, vh0 vh0, re3 re3, ig1 ig1, ok2 ok2, sr2 sr2, sr2 sr22, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        boolean z2;
        ok2 ok22 = ok2;
        yt2 yt22 = yt2;
        yt22.g0(-724154510);
        long j2 = j;
        if (yt22.f(j2)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i11 = i | i2;
        vr2 vr22 = vr2;
        if (yt22.i(vr22)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i12 = i11 | i3;
        kg1 kg12 = kg1;
        if (yt22.g(kg12)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i13 = i12 | i4;
        vh0 vh02 = vh0;
        if (yt22.i(vh02)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i14 = i13 | i5;
        re3 re32 = re3;
        if (yt22.i(re32)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i15 = i14 | i6;
        ig1 ig12 = ig1;
        if (yt22.g(ig12)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i16 = i15 | i7;
        if (yt22.g(ok22)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i17 = i16 | i8;
        sr2 sr23 = sr2;
        if (yt22.i(sr23)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i18 = i17 | i9;
        sr2 sr24 = sr22;
        if (yt22.i(sr24)) {
            i10 = 536870912;
        } else {
            i10 = 268435456;
        }
        int i19 = i18 | i10;
        if ((306783379 & i19) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i19 & 1, z)) {
            sr2 sr25 = sr23;
            vr2 vr23 = vr22;
            yf7.a(dr7.a(h03.R, yt22), su0.J(1910384865, new qh1(vh02, j2, re32, ml4, ig12, sr25, sr24, ok22, vr23, kg12), yt22), yt22, 48);
            if ((29360128 & i19) == 8388608) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object Q = yt22.Q();
            if (z2 || Q == ay0.a) {
                Q = new f70(ok22, (f61) null, 3);
                yt22.o0(Q);
            }
            t49.h((gs2) Q, yt22, ok22);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new qh1(ml4, j, vr2, kg1, vh0, re3, ig1, ok22, sr2, sr22, i);
        }
    }

    public static final void o(sr2 sr2, boolean z, ml4 ml4, fw0 fw0, yt2 yt2, int i) {
        int i2;
        ml4 ml42;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3 = z;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i7 = i;
        yt22.g0(-709923073);
        if ((i7 & 6) == 0) {
            if (yt22.i(sr2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            i2 = i7;
        }
        if ((i7 & 48) == 0) {
            if (yt22.h(z3)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i7 & 384) == 0) {
            ml42 = ml4;
            if (yt22.g(ml42)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        } else {
            ml42 = ml4;
        }
        if ((i7 & 3072) == 0) {
            if (yt22.i(fw02)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i2 & 1, z2)) {
            o96 o96 = q96.a;
            pa5 pa5 = yd0.a;
            gw8.e(sr2, ml42, false, o96, yd0.g(((jt0) yt22.k(j41.a)).a, yt22), (la5) null, su0.J(1899489890, new ji(1, fw02, z3), yt22), yt22, (i2 & 14) | 807075840 | ((i2 >> 3) & 112), 388);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new rb0(sr2, z3, ml4, fw02, i);
        }
    }

    public static final boolean p(KeyEvent keyEvent) {
        if (rd3.A(keyEvent) != 2) {
            return false;
        }
        long f = uq3.f(keyEvent.getKeyCode());
        int i = os3.O;
        if (os3.a(f, os3.f) || os3.a(uq3.f(keyEvent.getKeyCode()), os3.H)) {
            return true;
        }
        return false;
    }

    public static final boolean q(KeyEvent keyEvent) {
        if (rd3.A(keyEvent) != 2) {
            return false;
        }
        long f = uq3.f(keyEvent.getKeyCode());
        int i = os3.O;
        if (os3.a(f, os3.g) || os3.a(uq3.f(keyEvent.getKeyCode()), os3.I)) {
            return true;
        }
        return false;
    }
}
