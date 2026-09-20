package defpackage;

/* renamed from: qg1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class qg1 {
    public static final pa5 a = x91.g(0.0f, 0.0f, 6.0f, 8.0f, 3);
    public static final float b = 8.0f;
    public static final float c = 8.0f;

    public static final void a(sr2 sr2, fw0 fw0, ml4 ml4, gs2 gs2, pq6 pq6, ig1 ig1, wu1 wu1, fw0 fw02, yt2 yt2, int i) {
        int i2;
        sr2 sr22;
        boolean z;
        wu1 wu12;
        ig1 ig12;
        pq6 pq62;
        ml4 ml42;
        ig1 ig13;
        pq6 pq63;
        jl4 jl4;
        wu1 wu13;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        yt2 yt22 = yt2;
        int i8 = i;
        yt22.g0(219718641);
        if ((i8 & 6) == 0) {
            sr22 = sr2;
            if (yt22.i(sr22)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i8;
        } else {
            sr22 = sr2;
            i2 = i8;
        }
        fw0 fw03 = fw0;
        if ((i8 & 48) == 0) {
            if (yt22.i(fw03)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        int i9 = i2 | 384;
        gs2 gs22 = gs2;
        if ((i8 & 3072) == 0) {
            if (yt22.i(gs22)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i9 |= i5;
        }
        if ((i8 & 24576) == 0) {
            i9 |= 8192;
        }
        int i10 = 196608 | i9;
        if ((1572864 & i8) == 0) {
            i10 = 720896 | i9;
        }
        int i11 = 12582912 | i10;
        fw0 fw04 = fw02;
        if ((100663296 & i8) == 0) {
            if (yt22.i(fw04)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i11 |= i4;
        }
        if ((38347923 & i11) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i11 & 1, z)) {
            yt22.a0();
            if ((i8 & 1) == 0 || yt22.C()) {
                lg1 lg1 = lg1.a;
                pq6 a2 = hr6.a(h03.t, yt22);
                lg1 lg12 = lg1.a;
                ig1 c2 = lg1.c(yt22);
                i3 = i11 & -3727361;
                pq63 = a2;
                wu13 = new wu1(3);
                ig13 = c2;
                jl4 = jl4.w;
            } else {
                yt22.Y();
                i3 = i11 & -3727361;
                jl4 = ml4;
                pq63 = pq6;
                ig13 = ig1;
                wu13 = wu1;
            }
            yt22.s();
            int i12 = i3;
            eb.d(sr22, yu6.r(jl4), wu13, su0.J(1108953335, new tg1(pq63, ig13, fw04, gs22, fw03), yt22), yt22, ((i12 >> 15) & 896) | (i12 & 14) | 3072, 0);
            ml42 = jl4;
            pq62 = pq63;
            ig12 = ig13;
            wu12 = wu13;
        } else {
            yt2.Y();
            ml42 = ml4;
            pq62 = pq6;
            ig12 = ig1;
            wu12 = wu1;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new mg1(sr2, fw0, ml42, gs2, pq62, ig12, wu12, fw02, i8);
        }
    }
}
