package defpackage;

/* renamed from: t60  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class t60 {
    public static final /* synthetic */ int a = 0;

    static {
        pv8.c(40.0f, 40.0f);
    }

    public static final void a(hf7 hf7, vr2 vr2, ml4 ml4, boolean z, tg7 tg7, bt3 bt3, zs3 zs3, boolean z2, int i, int i2, m78 m78, vr2 vr22, ap4 ap4, ky6 ky6, fw0 fw0, yt2 yt2, int i3) {
        vr2 vr23;
        vr2 vr24;
        hf7 hf72 = hf7;
        vr2 vr25 = vr2;
        bt3 bt32 = bt3;
        boolean z3 = z2;
        yt2 yt22 = yt2;
        yt22.g0(-971111025);
        boolean z4 = z;
        int i4 = 8192;
        tg7 tg72 = tg7;
        int i5 = i3 | (yt22.g(hf72) ? 4 : 2) | (yt22.i(vr25) ? 32 : 16) | (yt22.g(ml4) ? 256 : 128) | (yt22.h(z4) ? 2048 : 1024) | (yt22.h(false) ? 16384 : 8192) | (yt22.g(tg72) ? 131072 : 65536) | (yt22.g(bt32) ? 1048576 : 524288) | (yt22.g(zs3) ? 8388608 : 4194304) | (yt22.h(z3) ? 67108864 : 33554432) | (yt22.e(i) ? 536870912 : 268435456);
        int i6 = i2;
        ap4 ap42 = ap4;
        int i7 = 196608 | (yt22.e(i6) ? 4 : 2) | (yt22.g(m78) ? 32 : 16) | 384 | (yt22.g(ap42) ? 2048 : 1024);
        if (yt22.g(ky6)) {
            i4 = 16384;
        }
        int i8 = i7 | i4;
        boolean z5 = true;
        if (yt22.V(i5 & 1, ((i5 & 306783379) == 306783378 && (74899 & i8) == 74898) ? false : true)) {
            yt22.a0();
            int i9 = i3 & 1;
            d63 d63 = ay0.a;
            if (i9 == 0 || yt22.C()) {
                Object Q = yt22.Q();
                if (Q == d63) {
                    Q = new j5(14);
                    yt22.o0(Q);
                }
                vr24 = (vr2) Q;
            } else {
                yt22.Y();
                vr24 = vr22;
            }
            yt22.s();
            int i10 = i8;
            c93 b = bt32.b(z3);
            int i11 = i10;
            boolean z6 = !z3;
            int i12 = z3 ? 1 : i6;
            int i13 = z3 ? 1 : i;
            boolean z7 = (i5 & 14) == 4;
            if ((i5 & 112) != 32) {
                z5 = false;
            }
            Object Q2 = yt22.Q();
            if ((z7 || z5) || Q2 == d63) {
                Q2 = new m0(9, hf72, vr25);
                yt22.o0(Q2);
            }
            int i14 = i11 << 9;
            int i15 = ((i5 >> 15) & 896) | (i5 & 7168) | (i5 & 57344) | 196608;
            vr2 vr26 = vr24;
            pv8.a(hf72, (vr2) Q2, ml4, tg72, m78, vr26, ap42, ky6, z6, i13, i12, b, zs3, z4, false, fw0, yt22, ((i5 >> 6) & 7168) | (i5 & 910) | (i14 & 57344) | 196608 | (i14 & 3670016) | (i14 & 29360128), i15);
            vr23 = vr26;
        } else {
            yt2.Y();
            vr23 = vr22;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new s60(hf7, vr2, ml4, z, tg7, bt3, zs3, z2, i, i2, m78, vr23, ap4, ky6, fw0, i3);
        }
    }

    public static final void b(String str, vr2 vr2, ml4 ml4, boolean z, boolean z2, tg7 tg7, bt3 bt3, zs3 zs3, boolean z3, int i, int i2, m78 m78, vr2 vr22, ap4 ap4, ky6 ky6, fw0 fw0, yt2 yt2, int i3) {
        vr2 vr23;
        vr2 vr24;
        vr2 vr25;
        String str2 = str;
        vr2 vr26 = vr2;
        bt3 bt32 = bt3;
        boolean z4 = z3;
        yt2 yt22 = yt2;
        yt22.g0(2026950908);
        int i4 = 8192;
        tg7 tg72 = tg7;
        int i5 = i3 | (yt22.g(str2) ? 4 : 2) | (yt22.i(vr26) ? 32 : 16) | (yt22.g(ml4) ? 256 : 128) | (yt22.h(z) ? 2048 : 1024) | (yt22.h(z2) ? 16384 : 8192) | (yt22.g(tg72) ? 131072 : 65536) | (yt22.g(bt32) ? 1048576 : 524288) | (yt22.g(zs3) ? 8388608 : 4194304) | (yt22.h(z4) ? 67108864 : 33554432) | (yt22.e(i) ? 536870912 : 268435456);
        m78 m782 = m78;
        int i6 = 196608 | (yt22.e(i2) ? 4 : 2) | (yt22.g(m782) ? 32 : 16) | 384 | (yt22.g(ap4) ? 2048 : 1024);
        if (yt22.g(ky6)) {
            i4 = 16384;
        }
        int i7 = i6 | i4;
        boolean z5 = false;
        if (yt22.V(i5 & 1, ((i5 & 306783379) == 306783378 && (74899 & i7) == 74898) ? false : true)) {
            yt22.a0();
            int i8 = i3 & 1;
            d63 d63 = ay0.a;
            if (i8 == 0 || yt22.C()) {
                Object Q = yt22.Q();
                if (Q == d63) {
                    Q = new j5(14);
                    yt22.o0(Q);
                }
                vr24 = (vr2) Q;
            } else {
                yt22.Y();
                vr24 = vr22;
            }
            yt22.s();
            Object Q2 = yt22.Q();
            if (Q2 == d63) {
                vr25 = vr24;
                Q2 = u55.p(new hf7(6, 0, str2));
                yt22.o0(Q2);
            } else {
                vr25 = vr24;
            }
            aq4 aq4 = (aq4) Q2;
            hf7 hf7 = (hf7) aq4.getValue();
            hf7 hf72 = new hf7(new vl(str2), hf7.b, hf7.c);
            boolean g = yt22.g(hf72);
            Object Q3 = yt22.Q();
            if (g || Q3 == d63) {
                Q3 = new f5(7, hf72, aq4);
                yt22.o0(Q3);
            }
            t49.l((sr2) Q3, yt22);
            boolean z6 = (i5 & 14) == 4;
            Object Q4 = yt22.Q();
            if (z6 || Q4 == d63) {
                Q4 = u55.p(str2);
                yt22.o0(Q4);
            }
            aq4 aq42 = (aq4) Q4;
            c93 b = bt32.b(z4);
            boolean z7 = !z4;
            int i9 = z4 ? 1 : i2;
            int i10 = z4 ? 1 : i;
            boolean g2 = yt22.g(aq42);
            if ((i5 & 112) == 32) {
                z5 = true;
            }
            boolean z8 = g2 | z5;
            Object Q5 = yt22.Q();
            if (z8 || Q5 == d63) {
                Q5 = new g5(vr26, aq4, aq42);
                yt22.o0(Q5);
            }
            int i11 = i7 << 9;
            m78 m783 = m782;
            tg7 tg73 = tg72;
            vr2 vr27 = vr25;
            pv8.a(hf72, (vr2) Q5, ml4, tg73, m783, vr27, ap4, ky6, z7, i10, i9, b, zs3, z, z2, fw0, yt22, (i5 & 896) | ((i5 >> 6) & 7168) | (i11 & 57344) | 196608 | (3670016 & i11) | (i11 & 29360128), (i5 & 57344) | ((i5 >> 15) & 896) | (i5 & 7168) | 196608);
            vr23 = vr27;
        } else {
            yt2.Y();
            vr23 = vr22;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new r60(str2, vr26, ml4, z, z2, tg7, bt32, zs3, z4, i, i2, m78, vr23, ap4, ky6, fw0, i3);
        }
    }
}
