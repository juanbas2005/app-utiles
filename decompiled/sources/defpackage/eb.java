package defpackage;

/* renamed from: eb  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class eb {
    public static final pa5 a = x91.g(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final pa5 b = x91.g(0.0f, 0.0f, 0.0f, 16.0f, 7);

    public static final void a(fw0 fw0, ml4 ml4, gs2 gs2, gs2 gs22, gs2 gs23, pq6 pq6, long j, long j2, long j3, long j4, long j5, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char c;
        char c2;
        boolean z;
        jl4 jl4;
        yt2 yt22 = yt2;
        yt22.g0(1378716401);
        int i10 = i | 48;
        gs2 gs24 = gs2;
        if (yt22.i(gs24)) {
            i2 = 256;
        } else {
            i2 = 128;
        }
        int i11 = i10 | i2;
        gs2 gs25 = gs22;
        if (yt22.i(gs25)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i12 = i11 | i3;
        if (yt22.i(gs23)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i13 = i12 | i4;
        pq6 pq62 = pq6;
        if (yt22.g(pq62)) {
            i5 = 131072;
        } else {
            i5 = 65536;
        }
        int i14 = i13 | i5;
        long j6 = j;
        if (yt22.f(j6)) {
            i6 = 1048576;
        } else {
            i6 = 524288;
        }
        int i15 = i14 | i6;
        if (yt22.d(0.0f)) {
            i7 = 8388608;
        } else {
            i7 = 4194304;
        }
        int i16 = i15 | i7;
        if (yt22.f(j2)) {
            i8 = 67108864;
        } else {
            i8 = 33554432;
        }
        int i17 = i16 | i8;
        long j7 = j3;
        if (yt22.f(j7)) {
            i9 = 536870912;
        } else {
            i9 = 268435456;
        }
        int i18 = i17 | i9;
        if (yt22.f(j4)) {
            c = 4;
        } else {
            c = 2;
        }
        long j8 = j5;
        if (yt22.f(j8)) {
            c2 = ' ';
        } else {
            c2 = 16;
        }
        char c3 = c2 | c;
        if ((306783379 & i18) == 306783378 && (c3 & 19) == 18) {
            z = false;
        } else {
            z = true;
        }
        if (yt22.V(i18 & 1, z)) {
            long j9 = j4;
            gs2 gs26 = gs24;
            gs2 gs27 = gs25;
            long j10 = j8;
            fw0 J = su0.J(-652798794, new ab(gs26, gs27, gs23, j7, j9, j10, j2, fw0), yt22);
            int i19 = i18 >> 12;
            int i20 = (i19 & 896) | (i19 & 112) | 12582918 | ((i18 >> 9) & 57344);
            jl4 jl42 = jl4.w;
            s87.a(jl42, pq62, j6, 0, 0.0f, 0.0f, J, yt22, i20, 104);
            jl4 = jl42;
        } else {
            yt2.Y();
            jl4 = ml4;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new bb(fw0, jl4, gs2, gs22, gs23, pq6, j, j2, j3, j4, j5, i);
        }
    }

    public static final void b(float f, float f2, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z;
        ey3 ey3;
        yt2.g0(-917637668);
        if (yt2.d(f2)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i2 | i;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            t37 t37 = xy0.n;
            ey3 ey32 = (ey3) yt2.k(t37);
            int ordinal = ey32.ordinal();
            if (ordinal == 0) {
                ey3 = ey3.x;
            } else if (ordinal == 1) {
                ey3 = ey3.w;
            } else {
                h.c();
                return;
            }
            t49.c(t37.a(ey3), su0.J(-1986402020, new ta(f, f2, ey32, fw0), yt2), yt2, 56);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ua(f, f2, fw0, i);
        }
    }

    public static final void c(sr2 sr2, fw0 fw0, ml4 ml4, gs2 gs2, gs2 gs22, gs2 gs23, gs2 gs24, pq6 pq6, long j, long j2, long j3, long j4, wu1 wu1, yt2 yt2, int i, int i2) {
        int i3;
        fw0 fw02;
        gs2 gs25;
        int i4;
        yt2 yt22 = yt2;
        int i5 = i;
        int i6 = i2;
        yt22.g0(-867616355);
        if ((i5 & 6) == 0) {
            i3 = (yt22.i(sr2) ? 4 : 2) | i5;
        } else {
            sr2 sr22 = sr2;
            i3 = i5;
        }
        if ((i5 & 48) == 0) {
            fw02 = fw0;
            i3 |= yt22.i(fw02) ? 32 : 16;
        } else {
            fw02 = fw0;
        }
        if ((i5 & 384) == 0) {
            i3 |= yt22.g(ml4) ? 256 : 128;
        } else {
            ml4 ml42 = ml4;
        }
        if ((i5 & 3072) == 0) {
            gs25 = gs2;
            i3 |= yt22.i(gs25) ? 2048 : 1024;
        } else {
            gs25 = gs2;
        }
        if ((i5 & 24576) == 0) {
            i3 |= yt22.i(gs22) ? 16384 : 8192;
        } else {
            gs2 gs26 = gs22;
        }
        gs2 gs27 = gs23;
        if ((i5 & 196608) == 0) {
            i3 |= yt22.i(gs27) ? 131072 : 65536;
        }
        gs2 gs28 = gs24;
        if ((i5 & 1572864) == 0) {
            i3 |= yt22.i(gs28) ? 1048576 : 524288;
        }
        pq6 pq62 = pq6;
        if ((i5 & 12582912) == 0) {
            i3 |= yt22.g(pq62) ? 8388608 : 4194304;
        }
        long j5 = j;
        if ((i5 & 100663296) == 0) {
            i3 |= yt22.f(j5) ? 67108864 : 33554432;
        }
        long j6 = j2;
        if ((i5 & 805306368) == 0) {
            i3 |= yt22.f(j6) ? 536870912 : 268435456;
        }
        long j7 = j3;
        if ((i6 & 6) == 0) {
            i4 = i6 | (yt22.f(j7) ? 4 : 2);
        } else {
            i4 = i6;
        }
        long j8 = j4;
        if ((i6 & 48) == 0) {
            i4 |= yt22.f(j8) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i4 |= yt22.d(0.0f) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i4 |= yt22.g(wu1) ? 2048 : 1024;
        } else {
            wu1 wu12 = wu1;
        }
        int i7 = i4;
        if (yt22.V(i3 & 1, ((i3 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            d(sr2, ml4, wu1, su0.J(527420759, new va(gs22, gs23, gs28, pq62, j5, j6, j3, j4, fw02, gs25), yt22), yt22, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i7 >> 3) & 896), 0);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new wa(sr2, fw0, ml4, gs2, gs22, gs23, gs24, pq6, j, j2, j3, j4, wu1, i5, i6, 0);
        }
    }

    public static final void d(sr2 sr2, ml4 ml4, wu1 wu1, fw0 fw0, yt2 yt2, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        yt2.g0(24925658);
        if ((i & 6) == 0) {
            if (yt2.i(sr2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (yt2.g(ml4)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            if (yt2.g(wu1)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            if (yt2.i(fw0)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            if (i8 != 0) {
                ml4 = jl4.w;
            }
            h03.c(sr2, wu1, su0.J(784693091, new ya(ml4, fw0), yt2), yt2, ((i3 >> 3) & 112) | (i3 & 14) | 384);
        } else {
            yt2.Y();
        }
        ml4 ml42 = ml4;
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new za(sr2, ml42, wu1, fw0, i, i2);
        }
    }
}
