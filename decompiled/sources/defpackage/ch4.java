package defpackage;

/* renamed from: ch4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ch4 {
    public static final t37 a = new hu5(new q83(28));
    public static final t37 b = new hu5(new q83(29));

    public static final void a(qt0 qt0, br7 br7, fw0 fw0, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        yt2 yt22;
        fw0 fw02;
        qt0 qt02;
        br7 br72;
        yt2.g0(1317329884);
        if (yt2.g(qt0)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i | 432;
        if (yt2.g(br7)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i6 = i5 | i3;
        if (yt2.i(fw0)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i7 = i6 | i4;
        if ((i7 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i7 & 1, z)) {
            t37 t37 = a;
            if (((Boolean) yt2.k(t37)).booleanValue()) {
                yt2.e0(1458663246);
                t37 t372 = b;
                if (qt0 == null) {
                    yt2.e0(-1061323065);
                    qt0 qt03 = ((zg4) yt2.k(t372)).a;
                    yt2.r(false);
                    qt02 = qt03;
                } else {
                    yt2.e0(-1061323964);
                    yt2.r(false);
                    qt02 = qt0;
                }
                yt2.e0(-1061320824);
                um4 um4 = ((zg4) yt2.k(t372)).d;
                yt2.r(false);
                if (br7 == null) {
                    yt2.e0(-1061318682);
                    br7 br73 = ((zg4) yt2.k(t372)).b;
                    yt2.r(false);
                    br72 = br73;
                } else {
                    yt2.e0(-1061319550);
                    yt2.r(false);
                    br72 = br7;
                }
                yt2.e0(-1061316862);
                gr6 gr6 = ((zg4) yt2.k(t372)).c;
                yt2.r(false);
                fw02 = fw0;
                yt22 = yt2;
                b(qt02, um4, gr6, br72, fw02, yt22, i7 & 57344);
                yt22.r(false);
            } else {
                fw02 = fw0;
                yt22 = yt2;
                yt22.e0(1458990389);
                t49.c(t37.a(Boolean.TRUE), su0.J(1535649272, new bh4(qt0, br7, fw02), yt22), yt22, 56);
                yt22.r(false);
            }
        } else {
            fw02 = fw0;
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new bh4(qt0, br7, fw02, i);
        }
    }

    public static final void b(qt0 qt0, um4 um4, gr6 gr6, br7 br7, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        qt0 qt02 = qt0;
        um4 um42 = um4;
        gr6 gr62 = gr6;
        br7 br72 = br7;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i8 = i;
        yt22.g0(904511636);
        if ((i8 & 6) == 0) {
            if (yt22.g(qt02)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i8;
        } else {
            i2 = i8;
        }
        if ((i8 & 48) == 0) {
            if (yt22.g(um42)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i8 & 384) == 0) {
            if (yt22.g(gr62)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i8 & 3072) == 0) {
            if (yt22.g(br72)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i8 & 24576) == 0) {
            if (yt22.i(fw02)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            yt22.a0();
            if ((i8 & 1) != 0 && !yt22.C()) {
                yt22.Y();
            }
            yt22.s();
            zg4 zg4 = new zg4(qt02, br72, gr62, um42);
            o86 a2 = d86.a(false, 0.0f, 0, (pq6) null, 255);
            long j = qt02.a;
            boolean f = yt22.f(j);
            Object Q = yt22.Q();
            if (f || Q == ay0.a) {
                Q = new ng7(j, jt0.b(0.4f, j));
                yt22.o0(Q);
            }
            t49.d(new ju5[]{b.a(zg4), la3.a.a(a2), og7.a.a((ng7) Q)}, su0.J(-1750539308, new ah4(br72, fw02, 0), yt22), yt22, 56);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ft(qt02, um42, gr62, br72, fw02, i8, 3);
        }
    }

    public static final void c(qt0 qt0, gr6 gr6, br7 br7, fw0 fw0, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        fw0 fw02;
        br7 br72;
        gr6 gr62;
        yt2 yt22;
        qt0 qt02;
        yt2.g0(-449719819);
        if (yt2.g(qt0)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i | 16;
        if (yt2.g(br7)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i5 | i3;
        if (yt2.i(fw0)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i7 & 1, z)) {
            yt2.a0();
            int i8 = i & 1;
            t37 t37 = b;
            if (i8 == 0 || yt2.C()) {
                gr6 = ((zg4) yt2.k(t37)).c;
            } else {
                yt2.Y();
            }
            int i9 = i7 & -113;
            gr6 gr63 = gr6;
            yt2.s();
            int i10 = i9 & 14;
            int i11 = i9 << 3;
            qt02 = qt0;
            br7 br73 = br7;
            fw0 fw03 = fw0;
            yt22 = yt2;
            b(qt02, ((zg4) yt2.k(t37)).d, gr63, br73, fw03, yt22, i10 | (i11 & 7168) | (i11 & 57344));
            br72 = br73;
            fw02 = fw03;
            gr62 = gr63;
        } else {
            qt02 = qt0;
            yt22 = yt2;
            fw02 = fw0;
            br72 = br7;
            yt22.Y();
            gr62 = gr6;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new q60(qt02, gr62, br72, fw02, i);
        }
    }
}
