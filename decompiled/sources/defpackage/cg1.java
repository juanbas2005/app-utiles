package defpackage;

import cu.lestebang.utiletecsa.R;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: cg1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class cg1 {
    public static final pa5 a = x91.g(24.0f, 10.0f, 24.0f, 0.0f, 8);
    public static final float b = 16.0f;

    public static final void a(Long l, vr2 vr2, vh0 vh0, re3 re3, rg1 rg1, kg1 kg1, ig1 ig1, ok2 ok2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        vf1 vf1;
        vh0 vh02 = vh0;
        yt2 yt22 = yt2;
        yt22.g0(-432341251);
        Long l2 = l;
        if (yt22.g(l2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        vr2 vr22 = vr2;
        if (yt22.i(vr22)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (yt22.i(vh02)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i12 = i11 | i4;
        re3 re32 = re3;
        if (yt22.i(re32)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        rg1 rg12 = rg1;
        if (yt22.g(rg12)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        kg1 kg12 = kg1;
        if (yt22.g(kg12)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i15 = i14 | i7;
        ig1 ig12 = ig1;
        if (yt22.g(ig12)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i16 = i15 | i8;
        if (yt22.g(ok2)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i17 = i16 | i9;
        if ((4793491 & i17) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i17 & 1, z)) {
            boolean g = yt22.g(vh02.a);
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (g || Q == d63) {
                Q = vh02.c(vh02.a);
                yt22.o0(Q);
            }
            vf1 vf12 = (vf1) Q;
            String i18 = h75.i(R.string.m3c_date_input_invalid_for_pattern, yt22);
            String i19 = h75.i(R.string.m3c_date_input_invalid_year_range, yt22);
            String i20 = h75.i(R.string.m3c_date_input_invalid_not_allowed, yt22);
            boolean g2 = yt22.g(vf12);
            if ((i17 & 57344) != 16384) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z3 = g2 | z2;
            Object Q2 = yt22.Q();
            if (z3 || Q2 == d63) {
                vf1 = vf12;
                dg1 dg1 = new dg1(re32, kg12, vf1, rg12, i18, i19, i20);
                yt22.o0(dg1);
                Q2 = dg1;
            } else {
                vf1 = vf12;
            }
            dg1 dg12 = (dg1) Q2;
            String upperCase = vf1.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String i21 = h75.i(R.string.m3c_date_input_label, yt22);
            ml4 J = x91.J(yu6.a, a);
            dg12.getClass();
            Locale locale = vh02.a;
            int i22 = i17 << 3;
            int i23 = (i17 >> 18) & 126;
            ml4 ml4 = J;
            ig1 ig13 = ig12;
            b(ml4, l2, vr22, vh02, su0.J(-752164549, new wf1(i21, upperCase, 0), yt22), su0.J(-1179434278, new q20(upperCase, 3), yt22), dg12, vf1, locale, ig13, ok2, yt22, (i22 & 112) | 1794054 | (i22 & 896) | (i22 & 7168), i23);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new xf1(l, vr2, vh0, re3, rg1, kg1, ig1, ok2, i);
        }
    }

    public static final void b(ml4 ml4, Long l, vr2 vr2, vh0 vh0, fw0 fw0, fw0 fw02, dg1 dg1, vf1 vf1, Locale locale, ig1 ig1, ok2 ok2, yt2 yt2, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        ig1 ig12;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        int i6;
        sr2 sr2;
        int i7;
        int i8;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        aq4 aq4;
        vf1 vf12;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Long l2 = l;
        vh0 vh02 = vh0;
        vf1 vf13 = vf1;
        ig1 ig13 = ig1;
        ok2 ok22 = ok2;
        yt2 yt22 = yt2;
        int i19 = i;
        yt22.g0(1456309913);
        int i20 = 2;
        ml4 ml42 = ml4;
        if ((i19 & 6) == 0) {
            if (yt22.g(ml42)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i3 = i18 | i19;
        } else {
            i3 = i19;
        }
        int i21 = 16;
        if ((i19 & 48) == 0) {
            if (yt22.g(l2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i3 |= i17;
        }
        if ((i19 & 384) == 0) {
            if (yt22.i(vr2)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i3 |= i16;
        } else {
            vr2 vr22 = vr2;
        }
        if ((i19 & 3072) == 0) {
            if (yt22.i(vh02)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i3 |= i15;
        }
        if ((i19 & 24576) == 0) {
            if (yt22.i(fw0)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i3 |= i14;
        } else {
            fw0 fw03 = fw0;
        }
        fw0 fw04 = fw02;
        if ((i19 & 196608) == 0) {
            if (yt22.i(fw04)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i3 |= i13;
        }
        if ((i19 & 1572864) == 0) {
            if (yt22.e(0)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i3 |= i12;
        }
        dg1 dg12 = dg1;
        if ((i19 & 12582912) == 0) {
            if (yt22.g(dg12)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        if ((i19 & 100663296) == 0) {
            if (yt22.g(vf13)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i3 |= i10;
        }
        Locale locale2 = locale;
        if ((i19 & 805306368) == 0) {
            if (yt22.g(locale2)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i3 |= i9;
        }
        if ((i2 & 6) == 0) {
            if (yt22.g(ig13)) {
                i20 = 4;
            }
            i4 = i2 | i20;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (yt22.g(ok22)) {
                i21 = 32;
            }
            i4 |= i21;
        }
        int i22 = i4;
        if ((306783379 & i3) == 306783378 && (i22 & 19) == 18) {
            z = false;
        } else {
            z = true;
        }
        if (yt22.V(i3 & 1, z)) {
            Object[] objArr = new Object[0];
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = new nf1(1);
                yt22.o0(Q);
            }
            yt2 yt23 = yt22;
            aq4 aq42 = (aq4) u55.u(Arrays.copyOf(objArr, 0), new kg5(12, new uz1(29), new ot4(29)), (sr2) Q, yt22, 3456, 0);
            Object[] objArr2 = {(hf7) aq42.getValue()};
            boolean g = yt23.g(aq42);
            int i23 = 29360128 & i3;
            if (i23 == 8388608) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean i24 = g | z2 | yt23.i(vh02);
            int i25 = 234881024 & i3;
            if (i25 == 67108864) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z20 = i24 | z3;
            int i26 = 1879048192 & i3;
            if (i26 == 536870912) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z21 = z4 | z20;
            int i27 = 3670016 & i3;
            boolean z22 = z21;
            if (i27 == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z23 = z22 | z5;
            Object Q2 = yt23.Q();
            if (z23 || Q2 == d63) {
                i6 = i26;
                i5 = i27;
                i8 = i23;
                i7 = i25;
                aq4 aq43 = aq42;
                vh0 vh03 = vh02;
                sr2 = new yf1(dg1, vh03, vf1, locale, aq43, 0);
                vh02 = vh03;
                aq42 = aq43;
                yt23.o0(sr2);
            } else {
                sr2 = Q2;
                i5 = i27;
                i8 = i23;
                i7 = i25;
                i6 = i26;
            }
            aq4 aq44 = (aq4) u55.s(objArr2, sr2, yt23, 0);
            boolean I0 = d57.I0((CharSequence) aq44.getValue());
            float f = b;
            if (!I0) {
                if (16.0f >= 0.0f) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (4.0f >= 0.0f) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z24 = z6 & z7;
                if (16.0f >= 0.0f) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z25 = z8 & z24;
                if (0.0f >= 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z25 || !z9) {
                    wb3.a("Padding must be non-negative");
                }
                f -= 0.0f + 4.0f;
            }
            float f2 = f;
            hf7 hf7 = (hf7) aq42.getValue();
            if (i7 == 67108864) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean g2 = yt23.g(aq42) | z10 | yt23.g(aq44);
            if ((i3 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean i28 = g2 | z11 | yt23.i(vh02);
            if (i6 == 536870912) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z26 = i28 | z12;
            if (i8 == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z27 = z13 | z26;
            if (i5 == 1048576) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z28 = z27 | z14;
            Object Q3 = yt23.Q();
            if (z28 || Q3 == d63) {
                aq4 aq45 = aq42;
                aq4 aq46 = aq44;
                z15 = false;
                aq4 aq47 = aq45;
                vh0 vh04 = vh02;
                vf1 vf14 = vf1;
                zf1 zf1 = new zf1(vf14, aq46, vr2, vh04, locale, dg1, aq47);
                vf12 = vf14;
                vh02 = vh04;
                aq4 = aq46;
                aq42 = aq47;
                yt23.o0(zf1);
                Q3 = zf1;
            } else {
                z15 = false;
                vf12 = vf1;
                aq4 = aq44;
            }
            vr2 vr23 = (vr2) Q3;
            d63 d632 = d63;
            yt2 yt24 = yt2;
            ml4 O = x91.O(ml4, 0.0f, 0.0f, 0.0f, f2, 7);
            boolean g3 = yt24.g(aq4);
            Object Q4 = yt24.Q();
            if (g3 || Q4 == d632) {
                Q4 = new xi(aq4, 5);
                yt24.o0(Q4);
            }
            ml4 a2 = ck6.a(O, z15, (vr2) Q4);
            ml4 ml43 = jl4.w;
            if (ok22 != null) {
                ml43 = uq3.s(ml43, ok22);
            }
            ig12 = ig1;
            yt2 yt25 = yt24;
            hf7 hf72 = hf7;
            z85.a(hf72, vr23, a2.d(ml43), false, (tg7) null, fw0, fw02, su0.J(-357881838, new ns4(aq4, 1), yt24), !d57.I0((CharSequence) aq4.getValue()), new cj1(vf12), new bt3(3, 7, 113), (zs3) null, true, 0, 0, (pq6) null, ig12.y, yt25, (i3 << 6) & 33030144);
            yt22 = yt25;
            if ((i22 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            Object Q5 = yt22.Q();
            if (z16 || Q5 == d632) {
                Q5 = new ot(ok22, (f61) null, 5);
                yt22.o0(Q5);
            }
            t49.h((gs2) Q5, yt22, vs7.a);
            if ((i3 & 112) == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean i29 = yt22.i(vh02) | z17;
            if (i7 == 67108864) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z29 = i29 | z18;
            if (i6 == 536870912) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean g4 = z29 | z19 | yt22.g(aq42);
            Object Q6 = yt22.Q();
            if (g4 || Q6 == d632) {
                Long l3 = l;
                bc0 bc0 = new bc0(l3, vh02, vf1, locale, aq42, (f61) null);
                l2 = l3;
                yt22.o0(bc0);
                Q6 = bc0;
            } else {
                l2 = l;
            }
            t49.h((gs2) Q6, yt22, l2);
        } else {
            ig12 = ig13;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ag1(ml4, l2, vr2, vh0, fw0, fw02, dg1, vf1, locale, ig12, ok22, i, i2);
        }
    }
}
