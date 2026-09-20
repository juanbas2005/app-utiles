package defpackage;

import java.util.WeakHashMap;

/* renamed from: b98  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class b98 {
    public static final float a;
    public static final float b = 20.0f;
    public static final float c = pd8.l;
    public static final float d = ar7.u0;
    public static final float e = pd8.j;
    public static final float f = hj8.h;
    public static final float g = hj8.g;
    public static final float h = ar7.t0;
    public static final float i;
    public static final float j;
    public static final float k;

    static {
        float f2 = ar7.v0;
        float f3 = (56.0f - f2) / 2.0f;
        a = f3;
        i = (32.0f - f2) / 2.0f;
        j = f3;
        k = f3;
    }

    public static final void a(ml4 ml4, c98 c98, pq6 pq6, v88 v88, gs2 gs2, aa8 aa8, vr vrVar, la5 la5, gs2 gs22, yt2 yt2, int i2, int i3) {
        int i4;
        ml4 ml42;
        boolean z;
        la5 la52;
        aa8 aa82;
        pq6 pq62;
        c98 c982;
        int i5;
        la5 la53;
        e64 e64;
        d98 d98;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        c98 c983 = c98;
        yt2 yt22 = yt2;
        int i12 = i2;
        yt22.g0(-477658179);
        if ((i12 & 6) == 0) {
            ml42 = ml4;
            if (yt22.g(ml42)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i4 = i11 | i12;
        } else {
            ml42 = ml4;
            i4 = i12;
        }
        if ((i12 & 48) == 0) {
            if ((i3 & 2) == 0) {
                if ((i12 & 64) == 0) {
                    z2 = yt22.g(c983);
                } else {
                    z2 = yt22.i(c983);
                }
                if (z2) {
                    i10 = 32;
                    i4 |= i10;
                }
            }
            i10 = 16;
            i4 |= i10;
        }
        if ((i12 & 384) == 0) {
            i4 |= 128;
        }
        v88 v882 = v88;
        if ((i12 & 3072) == 0) {
            if (yt22.g(v882)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i4 |= i9;
        }
        gs2 gs23 = gs2;
        if ((i12 & 24576) == 0) {
            if (yt22.i(gs23)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i4 |= i8;
        }
        if ((196608 & i12) == 0) {
            i4 |= 65536;
        }
        vr vrVar2 = vrVar;
        if ((1572864 & i12) == 0) {
            if (yt22.g(vrVar2)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i4 |= i7;
        }
        int i13 = i4 | 12582912;
        gs2 gs24 = gs22;
        if ((100663296 & i12) == 0) {
            if (yt22.i(gs24)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i13 |= i6;
        }
        boolean z3 = false;
        if ((38347923 & i13) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i13 & 1, z)) {
            yt22.a0();
            if ((i12 & 1) == 0 || yt22.C()) {
                if ((i3 & 2) != 0) {
                    c983 = i35.p(0, 1, yt22);
                    i13 &= -113;
                }
                pa5 pa5 = w88.a;
                pq62 = hr6.a(pd8.i, yt22);
                WeakHashMap weakHashMap = ib8.w;
                e64 e642 = new e64(new ss7(n63.h(yt22).g, n63.h(yt22).b), 48 | 9);
                i5 = i13 & -459649;
                la53 = w88.a;
                e64 = e642;
            } else {
                yt22.Y();
                if ((i3 & 2) != 0) {
                    i13 &= -113;
                }
                i5 = i13 & -459649;
                pq62 = pq6;
                e64 = aa8;
                la53 = la5;
            }
            c98 c984 = c983;
            yt22.s();
            int i14 = (((Number) c984.a.e.getValue()).floatValue() > 1.0f ? 1 : (((Number) c984.a.e.getValue()).floatValue() == 1.0f ? 0 : -1));
            d98 d982 = d98.x;
            if (i14 == 0) {
                d98 = d982;
            } else {
                d98 = d98.w;
            }
            if (d98 == d982) {
                z3 = true;
            }
            int i15 = i5 << 3;
            c(ml42, z3, v882, pq62, gs2, e64, vrVar2, la53, gs24, yt22, (i5 & 14) | 48 | (i5 & 7168) | (458752 & i15) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192));
            aa82 = e64;
            la52 = la53;
            c982 = c984;
        } else {
            yt2.Y();
            pq62 = pq6;
            aa82 = aa8;
            la52 = la5;
            c982 = c983;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ut4(ml4, c982, pq62, v88, gs2, aa82, vrVar, la52, gs22, i12, i3);
        }
    }

    /* JADX WARNING: type inference failed for: r29v0, types: [int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static final void b(boolean z, f5 f5Var, fw0 fw0, gs2 gs2, boolean z2, ml4 ml4, int r29, fw4 fw4, la5 la5, yt2 yt2, int i2) {
        int i3;
        gs2 gs22;
        boolean z3;
        la5 la52;
        boolean z4;
        boolean z5;
        la5 la53;
        int i4;
        boolean z6;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z7 = z2;
        yt2 yt22 = yt2;
        int i14 = i2;
        yt22.g0(1807770593);
        boolean z8 = z;
        if ((i14 & 6) == 0) {
            if (yt22.h(z8)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i3 = i13 | i14;
        } else {
            i3 = i14;
        }
        f5 f5Var2 = f5Var;
        if ((i14 & 48) == 0) {
            if (yt22.i(f5Var2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i3 |= i12;
        }
        fw0 fw02 = fw0;
        if ((i14 & 384) == 0) {
            if (yt22.i(fw02)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i3 |= i11;
        }
        if ((i14 & 3072) == 0) {
            gs22 = gs2;
            if (yt22.i(gs22)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i3 |= i10;
        } else {
            gs22 = gs2;
        }
        if ((i14 & 24576) == 0) {
            if (yt22.h(z7)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        }
        if ((196608 & i14) == 0) {
            if (yt22.g(ml4)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        } else {
            ml4 ml42 = ml4;
        }
        if ((1572864 & i14) == 0) {
            if (yt22.h(true)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        if ((12582912 & i14) == 0) {
            i3 |= 4194304;
        }
        fw4 fw42 = fw4;
        if ((100663296 & i14) == 0) {
            if (yt22.g(fw42)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i3 |= i6;
        }
        if ((805306368 & i14) == 0) {
            if (yt22.g((Object) null)) {
                i5 = 536870912;
            } else {
                i5 = 268435456;
            }
            i3 |= i5;
        }
        if ((306783379 & i3) == 306783378) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (yt22.V(i3 & 1, z3)) {
            yt22.a0();
            int i15 = i14 & 1;
            Object obj = ay0.a;
            if (i15 == 0 || yt22.C()) {
                i4 = i3 & -29360129;
                int i16 = ((i4 >> 12) & 14) | 3072;
                pa5 pa5 = x88.a;
                pa5 pa52 = x88.b;
                boolean g2 = yt22.g(pa5) | yt22.g(pa52);
                if ((((i16 & 14) ^ 6) <= 4 || !yt22.h(z7)) && (i16 & 6) != 4) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                boolean z9 = g2 | z6;
                Object Q = yt22.Q();
                if (z9 || Q == obj) {
                    Q = new a12(pa5, pa52, z7);
                    yt22.o0(Q);
                }
                la53 = (a12) Q;
                z5 = z7;
            } else {
                yt22.Y();
                i4 = i3 & -29360129;
                z5 = r29;
                la53 = la5;
            }
            yt22.s();
            yt22.e0(699505146);
            Object Q2 = yt22.Q();
            if (Q2 == obj) {
                Q2 = b81.e(yt22);
            }
            yt22.r(false);
            pq6 a2 = hr6.a(ar7.s0, yt22);
            tg7 a3 = dr7.a(gr8.g, yt22);
            int i17 = i4 >> 6;
            gs2 gs23 = gs22;
            ap4 ap4 = (ap4) Q2;
            tg7 tg7 = a3;
            la5 la54 = la53;
            int i18 = z5 ? 1 : 0;
            hj8.b(z8, f5Var2, fw02, a2, tg7, dr7.a(kl8.m, yt22), la54, a, b, fw42, ml4, gs23, i18, ap4, yt2, (i4 & 14) | 905994240 | (i4 & 112) | (i4 & 896), ((i4 >> 18) & 896) | 54 | (i17 & 7168) | (i17 & 57344) | ((i4 << 6) & 458752));
            la52 = la54;
            z4 = z5;
        } else {
            yt2.Y();
            z4 = r29;
            la52 = la5;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new t03(z, f5Var, fw0, gs2, z7, ml4, z4 ? 1 : 0, fw4, la52, i14);
        }
    }

    public static final void c(ml4 ml4, boolean z, v88 v88, pq6 pq6, gs2 gs2, aa8 aa8, vr vrVar, la5 la5, gs2 gs22, yt2 yt2, int i2) {
        int i3;
        gs2 gs23;
        aa8 aa82;
        la5 la52;
        gs2 gs24;
        boolean z2;
        float f2;
        float f3;
        a37 a37;
        float f4;
        a37 a372;
        float f5;
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
        boolean z3 = z;
        v88 v882 = v88;
        yt2 yt22 = yt2;
        int i14 = i2;
        yt22.g0(-1072361515);
        if ((i14 & 6) == 0) {
            if (yt22.g(ml4)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i3 = i13 | i14;
        } else {
            ml4 ml42 = ml4;
            i3 = i14;
        }
        if ((i14 & 48) == 0) {
            if (yt22.h(false)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i3 |= i12;
        }
        if ((i14 & 384) == 0) {
            if (yt22.h(z3)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i3 |= i11;
        }
        if ((i14 & 3072) == 0) {
            if (yt22.g(v882)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i3 |= i10;
        }
        if ((i14 & 24576) == 0) {
            if (yt22.g(pq6)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        } else {
            pq6 pq62 = pq6;
        }
        if ((196608 & i14) == 0) {
            gs23 = gs2;
            if (yt22.i(gs23)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        } else {
            gs23 = gs2;
        }
        if ((1572864 & i14) == 0) {
            aa82 = aa8;
            if (yt22.g(aa82)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        } else {
            aa82 = aa8;
        }
        vr vrVar2 = vrVar;
        if ((i14 & 12582912) == 0) {
            if (yt22.g(vrVar2)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i3 |= i6;
        }
        if ((100663296 & i14) == 0) {
            la52 = la5;
            if (yt22.g(la52)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i3 |= i5;
        } else {
            la52 = la5;
        }
        if ((805306368 & i14) == 0) {
            gs24 = gs22;
            if (yt22.i(gs24)) {
                i4 = 536870912;
            } else {
                i4 = 268435456;
            }
            i3 |= i4;
        } else {
            gs24 = gs22;
        }
        int i15 = i3;
        if ((i15 & 306783379) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i15 & 1, z2)) {
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = new bd5(0);
                yt22.o0(Q);
            }
            bd5 bd5 = (bd5) Q;
            Object Q2 = yt22.Q();
            if (Q2 == d63) {
                Q2 = new bd5(0);
                yt22.o0(Q2);
            }
            bd5 bd52 = (bd5) Q2;
            t37 t37 = hf3.c;
            if (lx1.b(((lx1) yt22.k(t37)).w, Float.NaN)) {
                yt22.e0(-754580399);
                yt22.r(false);
                f2 = 0.0f;
            } else {
                yt22.e0(-754545431);
                float f6 = ((lx1) yt22.k(t37)).w;
                yt22.r(false);
                f2 = f6;
            }
            je2 H = hj8.H(vm4.w, yt22);
            hj8.H(vm4.x, yt22);
            float f7 = e;
            if (!z3) {
                f3 = f7;
            } else {
                f3 = f;
            }
            a37 a2 = vj.a(f3, H, yt22);
            if (z3) {
                f7 = g;
            }
            a37 a3 = vj.a(f7, H, yt22);
            if (!z3) {
                a37 = a2;
                f4 = pd8.k;
            } else {
                a37 = a2;
                f4 = 0.0f;
            }
            a37 a4 = vj.a(f4, H, yt22);
            if (!z3) {
                a372 = a4;
                f5 = h;
            } else {
                a372 = a4;
                f5 = f2;
            }
            a37 a5 = vj.a(f5, H, yt22);
            long j2 = v882.a;
            long j3 = j2;
            long j4 = v882.b;
            s87.a(ml4, pq6, j3, j4, 0.0f, 0.0f, su0.J(512862384, new y88(aa82, la52, gs23, z3, f2, a37, a5, a3, bd52, bd5, vrVar2, a372, gs24), yt22), yt22, (i15 & 14) | 12582912 | ((i15 >> 9) & 112), 112);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new z88(ml4, z, v882, pq6, gs2, aa8, vrVar, la5, gs22, i2);
        }
    }
}
