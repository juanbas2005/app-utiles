package defpackage;

import java.util.WeakHashMap;

/* renamed from: hv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class hv4 {
    public static final float a = r16.m;
    public static final float b = 8.0f;
    public static final float c = 4.0f;
    public static final float d = 16.0f;
    public static final float e = 4.0f;
    public static final float f = 12.0f;
    public static final float g = 44.0f;

    static {
        int i = r16.c0;
    }

    public static final void a(ml4 ml4, long j, long j2, aa8 aa8, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z;
        aa8 aa82;
        aa8 aa83;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i8 = i;
        yt22.g0(1054099326);
        ml4 ml42 = ml4;
        if ((i8 & 6) == 0) {
            if (yt22.g(ml42)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i8;
        } else {
            i2 = i8;
        }
        long j3 = j;
        if ((i8 & 48) == 0) {
            if (yt22.f(j3)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        long j4 = j2;
        if ((i8 & 384) == 0) {
            if (yt22.f(j4)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        int i9 = i2 | 3072;
        if ((i8 & 24576) == 0) {
            i9 = i2 | 11264;
        }
        if ((196608 & i8) == 0) {
            if (yt22.i(fw02)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i9 |= i4;
        }
        if ((74899 & i9) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i9 & 1, z)) {
            yt22.a0();
            if ((i8 & 1) == 0 || yt22.C()) {
                WeakHashMap weakHashMap = ib8.w;
                aa83 = new e64(new ss7(n63.h(yt22).g, n63.h(yt22).b), h75.g | 32);
                i3 = i9 & -57345;
            } else {
                yt22.Y();
                i3 = i9 & -57345;
                aa83 = aa8;
            }
            yt22.s();
            int i10 = i3 << 3;
            s87.a(ml42, (pq6) null, j3, j4, 0.0f, 0.0f, su0.J(1225259907, new p13(1, (Object) aa83, (Object) fw02), yt22), yt22, (i3 & 14) | 12582912 | (i10 & 896) | (i10 & 7168) | (i10 & 57344), 98);
            aa82 = aa83;
        } else {
            yt2.Y();
            aa82 = aa8;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new l94(ml4, j, j2, aa82, fw02, i8, 1);
        }
    }

    public static final void b(fa6 fa6, boolean z, f5 f5Var, fw0 fw0, ml4 ml4, gs2 gs2, cv4 cv4, yt2 yt2, int i) {
        int i2;
        boolean z2;
        cv4 cv42;
        yt2 yt22;
        fw0 fw02;
        float f2;
        float f3;
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
        fa6 fa62 = fa6;
        boolean z3 = z;
        gs2 gs22 = gs2;
        cv4 cv43 = cv4;
        yt2 yt23 = yt2;
        int i13 = i;
        yt23.g0(974293026);
        if ((i13 & 6) == 0) {
            if (yt23.g(fa62)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i13;
        } else {
            i2 = i13;
        }
        if ((i13 & 48) == 0) {
            if (yt23.h(z3)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        f5 f5Var2 = f5Var;
        if ((i13 & 384) == 0) {
            if (yt23.i(f5Var2)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i2 |= i10;
        }
        fw0 fw03 = fw0;
        if ((i13 & 3072) == 0) {
            if (yt23.i(fw03)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        ml4 ml42 = ml4;
        if ((i13 & 24576) == 0) {
            if (yt23.g(ml42)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i13) == 0) {
            if (yt23.h(true)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i2 |= i7;
        }
        if ((1572864 & i13) == 0) {
            if (yt23.i(gs22)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((12582912 & i13) == 0) {
            if (yt23.h(true)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((100663296 & i13) == 0) {
            if (yt23.g(cv43)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        }
        if ((805306368 & i13) == 0) {
            if (yt23.g((Object) null)) {
                i3 = 536870912;
            } else {
                i3 = 268435456;
            }
            i2 |= i3;
        }
        int i14 = i2;
        if ((306783379 & i14) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt23.V(i14 & 1, z2)) {
            yt23.a0();
            if ((i13 & 1) != 0 && !yt23.C()) {
                yt23.Y();
            }
            yt23.s();
            yt23.e0(-224975399);
            Object Q = yt23.Q();
            Object obj = ay0.a;
            if (Q == obj) {
                Q = b81.e(yt23);
            }
            ap4 ap4 = (ap4) Q;
            yt23.r(false);
            vm4 vm4 = vm4.y;
            Object obj2 = obj;
            je2 H = hj8.H(vm4, yt23);
            Object obj3 = obj2;
            vm4 vm42 = vm4;
            fw0 J = su0.J(-876637252, new hh1(cv43, z3, H, gs22, fw03), yt23);
            if (gs2 == null) {
                yt23.e0(-224048562);
                yt23.r(false);
                fw02 = null;
            } else {
                yt23.e0(-224048561);
                fw0 J2 = su0.J(802208206, new ai0((Object) cv4, z, (Object) H, (Object) gs2, 5), yt23);
                yt23.r(false);
                fw02 = J2;
            }
            Object Q2 = yt23.Q();
            if (Q2 == obj3) {
                Q2 = new bd5(0);
                yt23.o0(Q2);
            }
            ml4 ml43 = ml42;
            bd5 bd5 = (bd5) Q2;
            f5 f5Var3 = f5Var2;
            ap4 ap42 = ap4;
            cv42 = cv4;
            ml4 L = su0.L(ml43, z, ap42, (oa3) null, true, new s86(4), f5Var3);
            ap4 ap43 = ap42;
            ml4 b2 = fa62.b(yu6.b(L, 0.0f, a, 1), 1.0f, true);
            Object Q3 = yt23.Q();
            if (Q3 == obj3) {
                Q3 = new fv4(bd5, 0);
                yt23.o0(Q3);
            }
            ml4 W = t49.W(b2, (vr2) Q3);
            lh4 d2 = mb0.d(xb4.C, true);
            int hashCode = Long.hashCode(yt23.T);
            vf5 m = yt23.m();
            ml4 E = gw8.E(yt23, W);
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
            a37 b3 = vj.b(f2, hj8.H(vm42, yt23), (String) null, yt24, 0, 28);
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            a37 b4 = vj.b(f3, hj8.H(vm4.x, yt24), (String) null, yt24, 0, 28);
            tp1 tp1 = (tp1) yt24.k(xy0.h);
            boolean g2 = yt24.g(tp1);
            Object Q4 = yt24.Q();
            if (g2 || Q4 == obj3) {
                Q4 = new gv4(tp1, bd5, 0);
                yt24.o0(Q4);
            }
            sr2 sr2 = (sr2) Q4;
            boolean g3 = yt24.g(ap43) | yt24.g(sr2);
            Object Q5 = yt24.Q();
            if (g3 || Q5 == obj3) {
                Q5 = new rf4(sr2, ap43);
                yt24.o0(Q5);
            }
            fw0 J3 = su0.J(-2082182507, new yg(22, (rf4) Q5), yt24);
            fw0 J4 = su0.J(-799524251, new p13(28, (Object) b3, (Object) cv42), yt24);
            boolean g4 = yt24.g(b3);
            Object Q6 = yt24.Q();
            if (g4 || Q6 == obj3) {
                Q6 = new mu4(2, b3);
                yt24.o0(Q6);
            }
            sr2 sr22 = (sr2) Q6;
            boolean g5 = yt24.g(b4);
            Object Q7 = yt24.Q();
            if (g5 || Q7 == obj3) {
                Q7 = new mu4(1, b4);
                yt24.o0(Q7);
            }
            yt2 yt25 = yt24;
            c(J3, J4, J, fw02, sr22, (sr2) Q7, yt25, ((i14 >> 9) & 57344) | 438);
            yt22 = yt25;
            yt22.r(true);
        } else {
            yt22 = yt23;
            cv42 = cv43;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new sl0(fa62, z, f5Var, fw0, ml4, gs2, cv42, i13, 2);
        }
    }

    public static final void c(fw0 fw0, fw0 fw02, fw0 fw03, gs2 gs2, sr2 sr2, sr2 sr22, yt2 yt2, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
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
        sr2 sr23 = sr2;
        sr2 sr24 = sr22;
        yt2 yt22 = yt2;
        int i10 = i;
        yt22.g0(-1019541078);
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
            if (yt22.h(true)) {
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
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            nw0 nw0 = new nw0(4);
            jl4 jl4 = jl4.w;
            ml4 D = we.D(jl4, nw0);
            if ((3670016 & i2) == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i2 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z8 = z3 | z2;
            int i11 = 57344 & i2;
            if (i11 == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z9 = z8 | z4;
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (z9 || Q == d63) {
                Q = new sh(1, sr24, gs22);
                yt22.o0(Q);
            }
            lh4 lh4 = (lh4) Q;
            d63 d632 = d63;
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, D);
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
            fw04.H(yt22, Integer.valueOf(i2 & 14));
            fw05.H(yt22, Integer.valueOf((i2 >> 3) & 14));
            ml4 w0 = rc9.w0(jl4, "icon");
            i80 i80 = xb4.y;
            int i12 = i2;
            lh4 d2 = mb0.d(i80, false);
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
            fw06 = fw03;
            f21.r((i12 >> 6) & 14, fw06, yt22, true);
            if (gs2 != null) {
                yt22.e0(-660471321);
                ml4 w02 = rc9.w0(jl4, "label");
                if (i11 == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i12 & 458752) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z10 = z6 | z7;
                Object Q2 = yt22.Q();
                if (z10 || Q2 == d632) {
                    Q2 = new ot4(sr23);
                    yt22.o0(Q2);
                }
                ml4 X = mp7.X(w02, (vr2) Q2);
                lh4 d3 = mb0.d(i80, false);
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
                z5 = true;
                pb4.q((i12 >> 9) & 14, gs22, yt22, true, false);
            } else {
                gs22 = gs2;
                z5 = true;
                yt22.e0(-660200319);
                yt22.r(false);
            }
            yt22.r(z5);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dw0((Object) fw0, (Object) fw02, (Object) fw06, (ds2) gs22, (Object) sr23, (ds2) sr22, i, 3);
        }
    }
}
