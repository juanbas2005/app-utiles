package defpackage;

import cu.lestebang.utiletecsa.R;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: lg1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lg1 {
    public static final lg1 a = new Object();
    public static final re3 b = new pe3(1900, 2100, 1);
    public static final kg1 c = new Object();

    public static ig1 c(yt2 yt2) {
        yt2 yt22 = yt2;
        qt0 qt0 = ((zg4) yt22.k(ch4.b)).a;
        ig1 ig1 = qt0.d0;
        if (ig1 == null) {
            yt22.e0(642416503);
            long d = st0.d(qt0, h03.r);
            long d2 = st0.d(qt0, h03.I);
            long d3 = st0.d(qt0, h03.G);
            long d4 = st0.d(qt0, h03.N);
            long d5 = st0.d(qt0, h03.M);
            long j = qt0.s;
            rt0 rt0 = h03.V;
            long d6 = st0.d(qt0, rt0);
            long j2 = j;
            long b2 = jt0.b(0.38f, st0.d(qt0, rt0));
            rt0 rt02 = h03.D;
            long d7 = st0.d(qt0, rt02);
            rt0 rt03 = h03.T;
            long d8 = st0.d(qt0, rt03);
            long j3 = d;
            long b3 = jt0.b(0.38f, st0.d(qt0, rt03));
            rt0 rt04 = h03.S;
            long d9 = st0.d(qt0, rt04);
            long j4 = b3;
            long b4 = jt0.b(0.38f, st0.d(qt0, rt04));
            rt0 rt05 = h03.E;
            long d10 = st0.d(qt0, rt05);
            long j5 = b4;
            long b5 = jt0.b(0.38f, st0.d(qt0, rt05));
            rt0 rt06 = h03.A;
            long d11 = st0.d(qt0, rt06);
            long j6 = b5;
            long b6 = jt0.b(0.38f, st0.d(qt0, rt06));
            rt0 rt07 = h03.z;
            long d12 = st0.d(qt0, rt07);
            long j7 = b6;
            long b7 = jt0.b(0.38f, st0.d(qt0, rt07));
            long j8 = j3;
            long j9 = j4;
            long j10 = j5;
            long j11 = j6;
            long j12 = j7;
            long j13 = b7;
            ig1 ig12 = new ig1(j8, d2, d3, d4, d5, j2, d6, b2, d7, d8, j9, d9, j10, d10, j11, d11, j12, d12, j13, st0.d(qt0, rt02), st0.d(qt0, h03.B), st0.d(qt0, h03.K), st0.d(qt0, h03.L), st0.d(qt0, gr8.e), pe2.v(qt0, yt22));
            qt0.d0 = ig12;
            yt22.r(false);
            return ig12;
        }
        yt22.e0(642290457);
        yt22.r(false);
        return ig1;
    }

    public final void a(Long l, int i, rg1 rg1, ml4 ml4, long j, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        Long l2 = l;
        int i7 = i;
        rg1 rg12 = rg1;
        yt2 yt22 = yt2;
        yt22.g0(1913724796);
        if (yt22.g(l2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (yt22.e(i7)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (yt22.g(rg12)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i9 | i5;
        long j2 = j;
        if (yt22.f(j2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((74899 & i11) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i11 & 1, z)) {
            yt22.a0();
            if ((i2 & 1) != 0 && !yt22.C()) {
                yt22.Y();
            }
            yt22.s();
            Locale locale = ((xa4) yt22.k(xy0.p)).a;
            String a2 = rg12.a(l2, locale, false);
            String a3 = rg12.a(l2, locale, true);
            String str = "";
            if (a3 == null) {
                yt22.e0(380170059);
                if (i7 == 0) {
                    yt22.e0(843549359);
                    a3 = h75.i(R.string.m3c_date_picker_no_selection_description, yt22);
                    yt22.r(false);
                } else if (i7 == 1) {
                    yt22.e0(843552330);
                    a3 = h75.i(R.string.m3c_date_input_no_input_description, yt22);
                    yt22.r(false);
                } else {
                    yt22.e0(380391490);
                    yt22.r(false);
                    a3 = str;
                }
                yt22.r(false);
            } else {
                yt22.e0(843541746);
                yt22.r(false);
            }
            if (a2 == null) {
                yt22.e0(380491715);
                if (i7 == 0) {
                    yt22.e0(843559745);
                    a2 = h75.i(R.string.m3c_date_picker_headline, yt22);
                    yt22.r(false);
                } else if (i7 == 1) {
                    yt22.e0(843562272);
                    a2 = h75.i(R.string.m3c_date_input_headline, yt22);
                    yt22.r(false);
                } else {
                    yt22.e0(380690082);
                    yt22.r(false);
                    a2 = str;
                }
                yt22.r(false);
            } else {
                yt22.e0(843556896);
                yt22.r(false);
            }
            if (i7 == 0) {
                yt22.e0(843569932);
                str = h75.i(R.string.m3c_date_picker_headline_description, yt22);
                yt22.r(false);
            } else if (i7 == 1) {
                yt22.e0(843572811);
                str = h75.i(R.string.m3c_date_input_headline_description, yt22);
                yt22.r(false);
            } else {
                yt22.e0(381027362);
                yt22.r(false);
            }
            String format = String.format(str, Arrays.copyOf(new Object[]{a3}, 1));
            boolean g = yt22.g(format);
            Object Q = yt22.Q();
            if (g || Q == ay0.a) {
                Q = new cb(format, 3);
                yt22.o0(Q);
            }
            yf7.b(a2, ck6.a(ml4, false, (vr2) Q), j2, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 1, 0, (tg7) null, yt22, (i11 >> 6) & 896, 24576, 245752);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ii0(this, l2, i7, rg12, ml4, j, i2);
        }
    }

    public final void b(int i, ml4 ml4, long j, yt2 yt2, int i2) {
        int i3;
        int i4;
        boolean z;
        yt2 yt22;
        int i5 = i;
        yt2 yt23 = yt2;
        yt23.g0(-390880814);
        if (yt23.e(i5)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        long j2 = j;
        if (yt23.f(j2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (yt23.V(i7 & 1, z)) {
            yt23.a0();
            if ((i2 & 1) != 0 && !yt23.C()) {
                yt23.Y();
            }
            yt23.s();
            if (i5 == 0) {
                yt23.e0(-1974299676);
                yt2 yt24 = yt23;
                yf7.b(h75.i(R.string.m3c_date_picker_title, yt23), ml4, j2, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, i7 & 1008, 0, 262136);
                yt22 = yt24;
                yt22.r(false);
            } else {
                yt22 = yt23;
                if (i5 == 1) {
                    yt22.e0(-1974292381);
                    yt2 yt25 = yt22;
                    yf7.b(h75.i(R.string.m3c_date_input_title, yt22), ml4, j, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt25, i7 & 1008, 0, 262136);
                    yt22 = yt25;
                    yt22.r(false);
                } else {
                    yt22.e0(-1073341648);
                    yt22.r(false);
                }
            }
        } else {
            yt22 = yt23;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new jg1(this, i5, ml4, j, i2);
        }
    }
}
