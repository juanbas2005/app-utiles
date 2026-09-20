package defpackage;

import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;

/* renamed from: k75  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class k75 implements f58 {
    public static x83 a;
    public static x83 b;
    public static final /* synthetic */ int c = 0;
    public static x83 d;
    public static x83 e;
    public static x83 f;

    public static final void a(yt2 yt2, ml4 ml4) {
        pf pfVar = pf.l;
        int hashCode = Long.hashCode(yt2.T);
        ml4 E = gw8.E(yt2, ml4);
        vf5 m = yt2.m();
        ux0.d.getClass();
        vy0 vy0 = tx0.b;
        yt2.i0();
        if (yt2.S) {
            yt2.l(vy0);
        } else {
            yt2.r0();
        }
        g75.Q(tx0.f, yt2, pfVar);
        g75.Q(tx0.e, yt2, m);
        g75.O(yt2, tx0.h);
        g75.Q(tx0.d, yt2, E);
        g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
        yt2.r(true);
    }

    public static final void b(st stVar, ml4 ml4, vr2 vr2, vr2 vr22, jb jbVar, j51 j51, fw0 fw0, yt2 yt2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        fw0 fw02;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        st stVar2 = stVar;
        ml4 ml42 = ml4;
        jb jbVar2 = jbVar;
        j51 j512 = j51;
        fw0 fw03 = fw0;
        yt2 yt22 = yt2;
        int i14 = i;
        yt22.g0(-605638725);
        int i15 = 2;
        if (yt22.g(stVar2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i16 = i3 | i14;
        if ((i14 & 896) == 0) {
            if (yt22.g(ml42)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i16 |= i13;
        }
        vr2 vr23 = vr2;
        if ((i14 & 7168) == 0) {
            if (yt22.i(vr23)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i16 |= i12;
        }
        vr2 vr24 = vr22;
        if (yt22.i(vr24)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i17 = i16 | i4;
        if ((458752 & i14) == 0) {
            if (yt22.g(jbVar2)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i17 |= i11;
        }
        if ((3670016 & i14) == 0) {
            if (yt22.g(j512)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i17 |= i10;
        }
        if ((29360128 & i14) == 0) {
            if (yt22.d(1.0f)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i17 |= i9;
        }
        if ((234881024 & i14) == 0) {
            if (yt22.g((Object) null)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i17 |= i8;
        }
        if ((1879048192 & i14) == 0) {
            if (yt22.e(1)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i17 |= i7;
        }
        if ((i2 & 14) == 0) {
            if (yt22.h(true)) {
                i15 = 4;
            }
            i5 = i2 | i15;
        } else {
            i5 = i2;
        }
        if ((i2 & 112) == 0) {
            if (yt22.i(fw03)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i5 |= i6;
        }
        if ((1533916891 & i17) == 306783378 && (i5 & 91) == 18 && yt22.F()) {
            yt22.Y();
        } else {
            s83 b2 = k18.b(stVar2.a, j512, yt22);
            int i18 = i17 >> 6;
            int i19 = i17 >> 12;
            j51 j513 = j512;
            qt z2 = dh4.z(b2, stVar2.c, vr23, vr24, j513, yt22, 64);
            s83 s83 = b2;
            j51 j514 = j513;
            av6 av6 = s83.w;
            boolean z3 = av6 instanceof o31;
            d63 d63 = ay0.a;
            if (!z3) {
                yt22.f0(-2080018031);
                yt22.f0(733328855);
                int i20 = (((((i18 & 14) | 384) | (i19 & 112)) >> 3) & 14) | 48;
                tp4 tp4 = mb0.a;
                sg3.e(jbVar2, xb4.y);
                yt22.e0(244380021);
                if ((((i20 & 14) ^ 6) <= 4 || !yt22.g(jbVar2)) && (i20 & 6) != 4) {
                    z = false;
                } else {
                    z = true;
                }
                Object Q = yt22.Q();
                if (z || Q == d63) {
                    Q = new ob0(jbVar2, true);
                    yt22.o0(Q);
                }
                ob0 ob0 = (ob0) Q;
                yt22.r(false);
                yt22.f0(-1323940314);
                int hashCode = Long.hashCode(yt22.T);
                vf5 m = yt22.m();
                ux0.d.getClass();
                vy0 vy0 = tx0.b;
                fw0 fw04 = new fw0(-511438721, new yj(1, ml42), true);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(tx0.f, yt22, ob0);
                g75.Q(tx0.e, yt22, m);
                ck ckVar = tx0.g;
                if (yt22.S || !sg3.e(yt22.Q(), Integer.valueOf(hashCode))) {
                    yt22.o0(Integer.valueOf(hashCode));
                    yt22.b(ckVar, Integer.valueOf(hashCode));
                }
                fw04.u(new cv6(yt22), yt22, 0);
                yt22.f0(2058660585);
                fw03.u(new tx5(qb0.a, z2, jbVar2, j514), yt22, Integer.valueOf(i5 & 112));
                yt22.r(false);
                yt22.r(true);
                yt22.r(false);
                yt22.r(false);
                yt22.r(false);
            } else {
                yt22.f0(-2079329304);
                k67 k67 = new k67(av6, fw03, z2, jbVar2, j514);
                yt22.c0(Integer.rotateLeft(-888190719, 1), su0.c);
                Object Q2 = yt22.Q();
                if (Q2 == d63) {
                    fw02 = new fw0(-888190719, k67, true);
                    yt22.o0(fw02);
                } else {
                    Q2.getClass();
                    fw02 = (fw0) Q2;
                    fw02.p(k67);
                }
                fw0 fw05 = fw02;
                yt22.r(false);
                dh4.a(ml42, jbVar, true, fw05, yt22, (i18 & 14) | 3456 | (i19 & 112));
                yt22.r(false);
            }
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new et(stVar2, ml4, vr2, vr22, jbVar, j51, fw0, i, i2);
        }
    }

    public static final void c(tx5 tx5, ml4 ml4, vb5 vb5, jb jbVar, j51 j51, float f2, boolean z, yt2 yt2, int i) {
        int i2;
        boolean z2;
        float f3;
        j51 j512;
        jb jbVar2;
        vb5 vb52;
        ml4 ml42;
        boolean z3;
        float f4;
        ml4 ml43;
        vb5 vb53;
        ml4 ml44;
        int i3;
        tx5 tx52 = tx5;
        yt2 yt22 = yt2;
        int i4 = i;
        yt22.g0(880638523);
        if ((i4 & 14) == 0) {
            if (yt22.g(tx52)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i4;
        } else {
            i2 = i4;
        }
        int i5 = i2 | 176;
        if ((i4 & 7168) == 0) {
            i5 = i2 | 1200;
        }
        if ((57344 & i4) == 0) {
            i5 |= 8192;
        }
        if ((458752 & i4) == 0) {
            i5 |= 65536;
        }
        if ((3670016 & i4) == 0) {
            i5 |= 524288;
        }
        if ((29360128 & i4) == 0) {
            i5 |= 4194304;
        }
        if ((234881024 & i4) == 0) {
            i5 |= 33554432;
        }
        if ((191739611 & i5) != 38347922 || !yt22.F()) {
            yt22.a0();
            if ((i4 & 1) == 0 || yt22.C()) {
                vb53 = tx52.b;
                tx52.getClass();
                jbVar2 = tx52.c;
                j512 = tx52.d;
                tx52.getClass();
                tx52.getClass();
                tx52.getClass();
                ml43 = jl4.w;
                f4 = 1.0f;
                z3 = true;
            } else {
                yt22.Y();
                ml43 = ml4;
                vb53 = vb5;
                jbVar2 = jbVar;
                j512 = j51;
                f4 = f2;
                z3 = z;
            }
            yt22.s();
            qx5 qx5 = k18.b;
            if (z3) {
                ml44 = we.g(ml43);
            } else {
                ml44 = ml43;
            }
            ml4 d2 = ml44.d(new g51(vb53, jbVar2, j512, f4));
            pf pfVar = pf.m;
            yt22.f0(544976794);
            int hashCode = Long.hashCode(yt22.T);
            ml4 E = gw8.E(yt22, d2);
            vf5 m = yt22.m();
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.f0(1405779621);
            yt22.i0();
            if (yt22.S) {
                yt22.l(new gt(1, vy0));
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, pfVar);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.d, yt22, E);
            ck ckVar = tx0.g;
            if (yt22.S || !sg3.e(yt22.Q(), Integer.valueOf(hashCode))) {
                yt22.o0(Integer.valueOf(hashCode));
                yt22.b(ckVar, Integer.valueOf(hashCode));
            }
            yt22.r(true);
            yt22.r(false);
            yt22.r(false);
            vb52 = vb53;
            ml42 = ml43;
            f3 = f4;
            z2 = z3;
        } else {
            yt22.Y();
            ml42 = ml4;
            vb52 = vb5;
            jbVar2 = jbVar;
            j512 = j51;
            f3 = f2;
            z2 = z;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new j67(tx52, ml42, vb52, jbVar2, j512, f3, z2, i4);
        }
    }

    public static final Object[] d(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[(objArr.length + 2)];
        qs.N0(0, i, 6, objArr, objArr2);
        qs.K0(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] e(int i, Object[] objArr) {
        Object[] objArr2 = new Object[(objArr.length - 2)];
        qs.N0(0, i, 6, objArr, objArr2);
        qs.K0(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] f(int i, Object[] objArr) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        qs.N0(0, i, 6, objArr, objArr2);
        qs.K0(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static void g(String str, boolean z) {
        if (!z) {
            h.q(str);
        }
    }

    public static void h(int i) {
        if (i < 0) {
            ku4.v();
        }
    }

    public static void i(String str, Object obj) {
        if (obj == null) {
            ku4.j(str);
        }
    }

    public static final x83 j() {
        x83 x83 = e;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("AutoMirrored.Rounded.Send", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, true, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 f2 = pb4.f(3.4f, 20.4f, 17.45f, -7.48f);
        f2.e(0.81f, -0.35f, 0.81f, -1.49f, 0.0f, -1.84f);
        f2.h(3.4f, 3.6f);
        f2.e(-0.66f, -0.29f, -1.39f, 0.2f, -1.39f, 0.91f);
        f2.h(2.0f, 9.12f);
        f2.e(0.0f, 0.5f, 0.37f, 0.93f, 0.87f, 0.99f);
        f2.h(17.0f, 12.0f);
        f2.h(2.87f, 13.88f);
        f2.e(-0.5f, 0.07f, -0.87f, 0.5f, -0.87f, 1.0f);
        f2.i(0.01f, 4.61f);
        f2.e(0.0f, 0.71f, 0.73f, 1.2f, 1.39f, 0.91f);
        f2.c();
        w83.a(w83, f2.a, ky6, 14336);
        x83 b2 = w83.b();
        e = b2;
        return b2;
    }

    public static final int k(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static d37 l() {
        return UssdAutoUpdaterService.T;
    }

    public static final boolean m(ze7 ze7, boolean z) {
        dy3 c2;
        u44 u44 = ze7.d;
        if (u44 == null || (c2 = u44.c()) == null) {
            return false;
        }
        ly5 y = u55.y(c2);
        long l = ze7.l(z);
        float f2 = y.a;
        float f3 = y.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (l >> 32));
        if (f2 > intBitsToFloat || intBitsToFloat > f3) {
            return false;
        }
        float f4 = y.b;
        float f5 = y.d;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (l & 4294967295L));
        if (f4 > intBitsToFloat2 || intBitsToFloat2 > f5) {
            return false;
        }
        return true;
    }

    public static int n(int i) {
        int[] iArr = {1, 2, 3};
        int i2 = 0;
        while (i2 < 3) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            } else if (i4 == i) {
                return i3;
            } else {
                i2++;
            }
        }
        return 1;
    }

    public static final void o(bs8 bs8, String str, sr2 sr2, vr2 vr2, boolean z, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        bs8 bs82 = bs8;
        String str2 = str;
        sr2 sr22 = sr2;
        boolean z3 = z;
        yt2 yt22 = yt2;
        sr22.getClass();
        vr2.getClass();
        yt22.g0(1046837766);
        if (true != yt22.i(bs82)) {
            i2 = 2;
        } else {
            i2 = 4;
        }
        int i6 = i | i2;
        if (true != yt22.g(str2)) {
            i3 = 16;
        } else {
            i3 = 32;
        }
        int i7 = i6 | i3;
        if (true != yt22.i(sr22)) {
            i4 = 128;
        } else {
            i4 = 256;
        }
        int i8 = i7 | i4;
        if (true != yt22.h(z3)) {
            i5 = 8192;
        } else {
            i5 = 16384;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i9 & 1, z2)) {
            yt22.a0();
            if ((i & 1) != 0 && !yt22.C()) {
                yt22.Y();
            }
            yt22.s();
            aa5.c((ml4) null, su0.J(911352778, new qq1(6, (Object) str2, (Object) sr22), yt22), (gs2) null, (gs2) null, (gs2) null, 0, 0, 0, (aa8) null, su0.J(-1349056427, new oa9(vr2, u55.f(bs82.d, yt22), z3), yt22), yt22, 805306416, 509);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ab9(bs82, str2, sr22, vr2, z3, i);
        }
    }
}
