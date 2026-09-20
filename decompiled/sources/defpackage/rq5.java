package defpackage;

/* renamed from: rq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rq5 {
    public static final rc1 a = ym4.b;

    public static final void a(ml4 ml4, long j, float f, long j2, int i, float f2, yt2 yt2, int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        float f3;
        int i6;
        long j3;
        float f4;
        long j4;
        float f5;
        int i7;
        long j5;
        float f6;
        int i8;
        boolean z2;
        long j6;
        long j7;
        float f7;
        int i9;
        ml4 ml42 = ml4;
        yt2 yt22 = yt2;
        yt22.g0(333154241);
        if ((i2 & 6) == 0) {
            if (yt22.g(ml42)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i2 | i9;
        } else {
            i4 = i2;
        }
        long j8 = j;
        if ((i3 & 2) != 0 || !yt22.f(j8)) {
            i5 = 16;
        } else {
            i5 = 32;
        }
        int i10 = i4 | i5 | 222592;
        if ((74899 & i10) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i10 & 1, z)) {
            yt22.a0();
            if ((i2 & 1) == 0 || yt22.C()) {
                if ((i3 & 2) != 0) {
                    j8 = st0.e(ag8.j, yt22);
                    i10 &= -113;
                }
                j5 = jt0.f;
                i8 = i10 & -7169;
                f6 = 4.0f;
                f5 = 4.0f;
                i7 = 1;
            } else {
                yt22.Y();
                if ((i3 & 2) != 0) {
                    i10 &= -113;
                }
                i8 = i10 & -7169;
                f6 = f;
                j5 = j2;
                i7 = i;
                f5 = f2;
            }
            yt22.s();
            l57 l57 = new l57(((tp1) yt22.k(xy0.h)).e0(f6), 0.0f, i7, 0, 26);
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = new lb3();
                yt22.o0(Q);
            }
            lb3 lb3 = (lb3) Q;
            lb3.a(0, yt22);
            jb3 g = rg3.g(lb3, 0.0f, 1080.0f, kl8.z(kl8.O(6000, 2, j12.c), 6), yt22);
            ot4 ot4 = new ot4(26);
            ft3 ft3 = new ft3();
            ot4.y(ft3);
            jb3 g2 = rg3.g(lb3, 0.0f, 360.0f, kl8.z(new gt3(ft3), 6), yt22);
            ft3 ft32 = new ft3();
            int i11 = i8;
            ft32.a = 6000;
            float f8 = f6;
            ft32.a(Float.valueOf(0.87f), 3000).b = a;
            ft32.a(Float.valueOf(0.1f), 6000);
            jb3 g3 = rg3.g(lb3, 0.1f, 0.87f, kl8.z(new gt3(ft32), 6), yt22);
            ml4 l = yu6.l(ck6.a(ml42, true, new ot4(27)), 40.0f);
            boolean g4 = yt22.g(g3) | yt22.g(g) | yt22.g(g2) | yt22.f(j5) | yt22.i(l57);
            if ((((i11 & 112) ^ 48) <= 32 || !yt22.f(j8)) && (i11 & 48) != 32) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z3 = g4 | z2;
            Object Q2 = yt22.Q();
            if (z3 || Q2 == d63) {
                j6 = j8;
                j7 = j5;
                f7 = f8;
                nq5 nq5 = new nq5(g3, i7, f5, f7, g, g2, j7, l57, j6);
                yt22.o0(nq5);
                Q2 = nq5;
            } else {
                j6 = j8;
                j7 = j5;
                f7 = f8;
            }
            tf4.c(l, (vr2) Q2, yt22, 0);
            i6 = i7;
            f3 = f5;
            f4 = f7;
            j3 = j7;
            j4 = j6;
        } else {
            yt22.Y();
            f4 = f;
            f3 = f2;
            j4 = j8;
            j3 = j2;
            i6 = i;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new oq5(ml42, j4, f4, j3, i6, f3, i2, i3);
        }
    }

    public static final void b(sr2 sr2, ml4 ml4, long j, long j2, int i, float f, vr2 vr2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        vr2 vr22;
        float f2;
        int i6;
        int i7;
        vr2 vr23;
        float f3;
        int i8;
        boolean z2;
        int i9;
        boolean z3;
        sr2 sr22 = sr2;
        ml4 ml42 = ml4;
        long j3 = j;
        yt2 yt22 = yt2;
        yt22.g0(-339970038);
        if (yt22.i(sr22)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (yt22.g(ml42)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (yt22.f(j3)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5 | 745472;
        boolean z4 = true;
        if ((599187 & i12) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i12 & 1, z)) {
            yt22.a0();
            int i13 = i2 & 1;
            Object obj = ay0.a;
            if (i13 == 0 || yt22.C()) {
                if ((((i12 & 896) ^ 384) <= 256 || !yt22.f(j3)) && (i12 & 384) != 256) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                Object Q = yt22.Q();
                if (z3 || Q == obj) {
                    Q = new hf(j3, 5);
                    yt22.o0(Q);
                }
                i7 = i12 & -3670017;
                vr23 = (vr2) Q;
                f3 = 4.0f;
                i8 = 1;
            } else {
                yt22.Y();
                f3 = f;
                vr23 = vr2;
                i7 = i12 & -3670017;
                i8 = i;
            }
            yt22.s();
            if ((i7 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object Q2 = yt22.Q();
            if (z2 || Q2 == obj) {
                Q2 = new gi0(8, sr22);
                yt22.o0(Q2);
            }
            sr2 sr23 = (sr2) Q2;
            ml4 d = ml42.d(l5.a);
            boolean g = yt22.g(sr23);
            Object Q3 = yt22.Q();
            if (g || Q3 == obj) {
                Q3 = new sn(3, sr23);
                yt22.o0(Q3);
            }
            ml4 m = yu6.m(ck6.a(d, true, (vr2) Q3), 240.0f, 4.0f);
            boolean g2 = yt22.g(sr23);
            if ((((i7 & 896) ^ 384) <= 256 || !yt22.f(j3)) && (i7 & 384) != 256) {
                z4 = false;
            }
            boolean g3 = g2 | z4 | yt22.g(vr23);
            Object Q4 = yt22.Q();
            if (g3 || Q4 == obj) {
                i9 = i8;
                pq5 pq5 = new pq5(i9, f3, sr23, j2, j3, vr23);
                yt22.o0(pq5);
                Q4 = pq5;
            } else {
                i9 = i8;
            }
            tf4.c(m, (vr2) Q4, yt22, 0);
            i6 = i9;
            f2 = f3;
            vr22 = vr23;
        } else {
            yt22.Y();
            i6 = i;
            f2 = f;
            vr22 = vr2;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new qq5(sr22, ml42, j, j2, i6, f2, vr22, i2);
        }
    }

    public static final void c(hz1 hz1, float f, float f2, long j, l57 l57) {
        float f3 = l57.a / 2.0f;
        float intBitsToFloat = Float.intBitsToFloat((int) (hz1.e() >> 32)) - (2.0f * f3);
        long j2 = j;
        hz1.i(j2, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L), l57);
    }

    public static final void d(hz1 hz1, float f, float f2, long j, float f3, int i) {
        boolean z;
        float f4;
        float f5;
        float intBitsToFloat = Float.intBitsToFloat((int) (hz1.e() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (hz1.e() & 4294967295L));
        float f6 = intBitsToFloat2 / 2.0f;
        if (hz1.getLayoutDirection() == ey3.w) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = f;
        } else {
            f4 = 1.0f - f2;
        }
        float f7 = f4 * intBitsToFloat;
        if (z) {
            f5 = f2;
        } else {
            f5 = 1.0f - f;
        }
        float f8 = f5 * intBitsToFloat;
        if (i != 0 && intBitsToFloat2 <= intBitsToFloat) {
            float f9 = f3 / 2.0f;
            float f10 = intBitsToFloat - f9;
            if (f7 < f9) {
                f7 = f9;
            }
            if (f7 > f10) {
                f7 = f10;
            }
            if (f8 < f9) {
                f8 = f9;
            }
            if (f8 <= f10) {
                f10 = f8;
            }
            if (Math.abs(f2 - f) > 0.0f) {
                long floatToRawIntBits = (long) Float.floatToRawIntBits(f7);
                hz1.q0(hz1, j, (floatToRawIntBits << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), f3, i, 480);
                return;
            }
            return;
        }
        hz1.q0(hz1, j, (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), f3, 0, 496);
    }
}
