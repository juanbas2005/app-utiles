package defpackage;

import java.util.WeakHashMap;

/* renamed from: ms6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ms6 {
    public static final float a = r16.h;

    public static final void a(ml4 ml4, long j, long j2, aa8 aa8, gs2 gs2, yt2 yt2, int i) {
        int i2;
        boolean z;
        aa8 aa82;
        aa8 aa83;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        gs2 gs22 = gs2;
        yt2 yt22 = yt2;
        int i8 = i;
        yt22.g0(552087412);
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
        if ((i8 & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i8 & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i8) == 0) {
            if (yt22.i(gs22)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((74899 & i2) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            yt22.a0();
            if ((i8 & 1) == 0 || yt22.C()) {
                WeakHashMap weakHashMap = ib8.w;
                aa83 = new e64(new ss7(n63.h(yt22).g, n63.h(yt22).b), h75.g | 32);
                i3 = i2 & -64513;
            } else {
                yt22.Y();
                i3 = i2 & -64513;
                aa83 = aa8;
            }
            yt22.s();
            int i9 = i3 << 3;
            s87.a(ml42, (pq6) null, j3, j4, 0.0f, 0.0f, su0.J(-2024666481, new dx4(14, aa83, gs22), yt22), yt22, (i3 & 14) | 12582912 | (i9 & 896) | (i9 & 7168), 114);
            aa82 = aa83;
        } else {
            yt2.Y();
            aa82 = aa8;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new l94(ml4, j, j2, aa82, gs22, i8, 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0161  */
    public static final void b(boolean z, f5 f5Var, fw0 fw0, gs2 gs2, ml4 ml4, int i, fw4 fw4, yt2 yt2, int i2, int i3) {
        int i4;
        f5 f5Var2;
        int i5;
        fw4 fw42;
        boolean z2;
        yx5 v;
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        yt2 yt22 = yt2;
        int i15 = i2;
        yt22.g0(-1164996656);
        if ((i15 & 6) == 0) {
            if (yt22.h(z)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i4 = i14 | i15;
        } else {
            boolean z3 = z;
            i4 = i15;
        }
        if ((i15 & 48) == 0) {
            f5Var2 = f5Var;
            if (yt22.i(f5Var2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i4 |= i13;
        } else {
            f5Var2 = f5Var;
        }
        if ((i15 & 384) == 0) {
            if (yt22.i(fw0)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i4 |= i12;
        } else {
            fw0 fw02 = fw0;
        }
        gs2 gs22 = gs2;
        if ((i15 & 3072) == 0) {
            if (yt22.i(gs22)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i4 |= i11;
        }
        ml4 ml42 = ml4;
        if ((i15 & 24576) == 0) {
            if (yt22.g(ml42)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i4 |= i10;
        }
        boolean z4 = true;
        if ((196608 & i15) == 0) {
            if (yt22.h(true)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i4 |= i9;
        }
        int i16 = i3 & 64;
        if (i16 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i15) == 0) {
            i5 = i;
            if (yt22.e(i5)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i4 |= i8;
            if ((12582912 & i15) != 0) {
                fw42 = fw4;
                if (yt22.g(fw42)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i4 |= i7;
            } else {
                fw42 = fw4;
            }
            if ((100663296 & i15) == 0) {
                if (yt22.g((Object) null)) {
                    i6 = 67108864;
                } else {
                    i6 = 33554432;
                }
                i4 |= i6;
            }
            if ((38347923 & i4) == 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!yt22.V(i4 & 1, z2)) {
                yt22.a0();
                if ((i15 & 1) != 0 && !yt22.C()) {
                    yt22.Y();
                } else if (i16 != 0) {
                    i5 = 0;
                }
                int i17 = i5;
                yt22.s();
                yt22.e0(1215846219);
                Object Q = yt22.Q();
                if (Q == ay0.a) {
                    Q = b81.e(yt22);
                }
                ap4 ap4 = (ap4) Q;
                yt22.r(false);
                if (i17 != 0) {
                    z4 = false;
                }
                if (z4) {
                    f = 4.0f;
                } else {
                    f = 8.0f;
                }
                int i18 = (i4 & 14) | 906166272 | (i4 & 112) | (i4 & 896);
                int i19 = i4 >> 6;
                int i20 = i4;
                int i21 = (i19 & 7168) | (i19 & 896) | ((i4 >> 18) & 112) | 6 | ((i20 << 3) & 57344) | (458752 & (i20 >> 3));
                hj8.j(z, f5Var2, fw0, dr7.a(r16.n, yt22), hr6.a(r16.i, yt22), f, a, fw42, ml42, gs22, i17, ap4, yt22, i18, i21);
                i5 = i17;
            } else {
                yt2.Y();
            }
            v = yt2.v();
            if (v == null) {
                v.d = new ls6(z, f5Var, fw0, gs2, ml4, i5, fw4, i15, i3);
                return;
            }
            return;
        }
        i5 = i;
        if ((12582912 & i15) != 0) {
        }
        if ((100663296 & i15) == 0) {
        }
        if ((38347923 & i4) == 38347922) {
        }
        if (!yt22.V(i4 & 1, z2)) {
        }
        v = yt2.v();
        if (v == null) {
        }
    }
}
