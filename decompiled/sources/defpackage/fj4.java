package defpackage;

/* renamed from: fj4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fj4 {
    public static final float a = 8.0f;
    public static final float b = 112.0f;
    public static final float c = 280.0f;

    static {
        x91.e(2, 4.0f);
        x91.d(4.0f, 2.0f);
        ((Boolean) rm5.a.getValue()).getClass();
    }

    /* JADX INFO: finally extract failed */
    public static final void a(ml4 ml4, dq4 dq4, sr2 sr2, gh6 gh6, pq6 pq6, long j, float f, fw0 fw0, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        je2 je2;
        in8 in8;
        Object obj;
        float f2;
        float f3;
        boolean z2;
        Object obj2;
        float f4;
        boolean z3;
        int i12;
        vr2 vr2;
        ml4 ml42 = ml4;
        dq4 dq42 = dq4;
        gh6 gh62 = gh6;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        yt22.g0(-1278879194);
        if (yt22.g(ml42)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i13 = i | i2;
        if (yt22.g(dq42)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i14 = i13 | i3;
        if (yt22.i(sr2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i15 = i14 | i4;
        if (yt22.g(gh62)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i16 = i15 | i5;
        if (yt22.g(pq6)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i17 = i16 | i6;
        if (yt22.f(j)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i18 = i17 | i7;
        if (yt22.d(0.0f)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i19 = i18 | i8;
        if (yt22.d(f)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i20 = i19 | i9;
        if (yt22.g((Object) null)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i21 = i20 | i10;
        if (yt22.i(fw02)) {
            i11 = 536870912;
        } else {
            i11 = 268435456;
        }
        int i22 = i21 | i11;
        boolean z4 = true;
        if ((i22 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i22 & 1, z)) {
            mm7 K0 = rc9.K0(dq42, "DropDownMenu", yt22, (((i22 >> 3) & 14) | 48) & 126);
            je2 H = hj8.H(vm4.x, yt22);
            je2 H2 = hj8.H(vm4.z, yt22);
            je2 je22 = H;
            lo7 lo7 = we.v;
            boolean h = K0.h();
            in8 in82 = K0.a;
            d63 d63 = ay0.a;
            if (!h) {
                yt22.e0(1666573488);
                boolean g = yt22.g(K0);
                obj = yt22.Q();
                if (g || obj == d63) {
                    ix6 h2 = j45.h();
                    if (h2 != null) {
                        in8 = in82;
                        vr2 = h2.e();
                    } else {
                        in8 = in82;
                        vr2 = null;
                    }
                    ix6 j2 = j45.j(h2);
                    je2 = H2;
                    try {
                        Object H0 = in8.H0();
                        j45.m(h2, j2, vr2);
                        yt22.o0(H0);
                        obj = H0;
                    } catch (Throwable th) {
                        j45.m(h2, j2, vr2);
                        throw th;
                    }
                } else {
                    in8 = in82;
                    je2 = H2;
                }
                yt22.r(false);
            } else {
                in8 = in82;
                je2 = H2;
                yt22.e0(1666827533);
                yt22.r(false);
                obj = in8.H0();
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            yt22.e0(-904349302);
            if (booleanValue) {
                f2 = 1.0f;
            } else {
                f2 = 0.8f;
            }
            yt22.r(false);
            Float valueOf = Float.valueOf(f2);
            boolean g2 = yt22.g(K0);
            Object Q = yt22.Q();
            if (g2 || Q == d63) {
                Q = u55.i(new wo0(K0, 4));
                yt22.o0(Q);
            }
            boolean booleanValue2 = ((Boolean) ((a37) Q).getValue()).booleanValue();
            yt22.e0(-904349302);
            if (booleanValue2) {
                f3 = 1.0f;
            } else {
                f3 = 0.8f;
            }
            yt22.r(false);
            Float valueOf2 = Float.valueOf(f3);
            boolean g3 = yt22.g(K0);
            Object Q2 = yt22.Q();
            if (g3 || Q2 == d63) {
                Q2 = u55.i(new wo0(K0, 5));
                yt22.o0(Q2);
            }
            gm7 gm7 = (gm7) ((a37) Q2).getValue();
            yt22.e0(-257488561);
            yt22.r(false);
            vr2 vr22 = null;
            mm7 mm7 = K0;
            im7 F = rc9.F(mm7, valueOf, valueOf2, je22, lo7, yt22, 0);
            if (!mm7.h()) {
                yt22.e0(1666573488);
                boolean g4 = yt22.g(mm7);
                obj2 = yt22.Q();
                if (g4 || obj2 == d63) {
                    ix6 h3 = j45.h();
                    if (h3 != null) {
                        vr22 = h3.e();
                    }
                    ix6 j3 = j45.j(h3);
                    try {
                        Object H02 = in8.H0();
                        j45.m(h3, j3, vr22);
                        yt22.o0(H02);
                        obj2 = H02;
                    } catch (Throwable th2) {
                        j45.m(h3, j3, vr22);
                        throw th2;
                    }
                }
                z2 = false;
                yt22.r(false);
            } else {
                z2 = false;
                yt22.e0(1666827533);
                yt22.r(false);
                obj2 = in8.H0();
            }
            boolean booleanValue3 = ((Boolean) obj2).booleanValue();
            yt22.e0(2062693622);
            float f5 = 0.0f;
            if (booleanValue3) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            yt22.r(z2);
            Float valueOf3 = Float.valueOf(f4);
            boolean g5 = yt22.g(mm7);
            Object Q3 = yt22.Q();
            if (g5 || Q3 == d63) {
                Q3 = u55.i(new wo0(mm7, 6));
                yt22.o0(Q3);
            }
            boolean booleanValue4 = ((Boolean) ((a37) Q3).getValue()).booleanValue();
            yt22.e0(2062693622);
            if (booleanValue4) {
                f5 = 1.0f;
            }
            yt22.r(false);
            Float valueOf4 = Float.valueOf(f5);
            boolean g6 = yt22.g(mm7);
            Object Q4 = yt22.Q();
            if (g6 || Q4 == d63) {
                Q4 = u55.i(new wo0(mm7, 7));
                yt22.o0(Q4);
            }
            gm7 gm72 = (gm7) ((a37) Q4).getValue();
            yt22.e0(-1585412933);
            yt22.r(false);
            im7 F2 = rc9.F(mm7, valueOf3, valueOf4, je2, lo7, yt22, 0);
            boolean booleanValue5 = ((Boolean) yt22.k(kd3.a)).booleanValue();
            boolean h4 = yt22.h(booleanValue5) | yt22.g(F);
            if ((i22 & 112) != 32) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean g7 = h4 | z3 | yt22.g(F2);
            if ((i22 & 896) != 256) {
                z4 = false;
            }
            boolean z5 = g7 | z4;
            Object Q5 = yt22.Q();
            if (z5 || Q5 == d63) {
                boolean z6 = booleanValue5;
                i12 = i22;
                dj4 dj4 = new dj4(z6, dq4, sr2, F, F2);
                yt22.o0(dj4);
                Q5 = dj4;
            } else {
                i12 = i22;
            }
            ml4 X = mp7.X(jl4.w, (vr2) Q5);
            int i23 = i12 >> 9;
            int i24 = i12 >> 6;
            ml4 ml43 = X;
            float f6 = f;
            s87.a(ml43, pq6, j, 0, 0.0f, f6, su0.J(-816027071, new y30((Object) ml42, (Object) gh62, (Object) fw02, 25), yt22), yt2, (i23 & 896) | (i23 & 112) | 12582912 | (57344 & i24) | (458752 & i24) | (i24 & 3670016), 8);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ej4(ml42, dq4, sr2, gh6, pq6, j, f, fw02, i);
        }
    }

    public static final void b(fw0 fw0, sr2 sr2, ml4 ml4, boolean z, wi4 wi4, la5 la5, yt2 yt2, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        fw0 fw02 = fw0;
        boolean z3 = z;
        wi4 wi42 = wi4;
        la5 la52 = la5;
        yt2 yt22 = yt2;
        int i12 = i;
        yt22.g0(-1325192924);
        if ((i12 & 6) == 0) {
            if (yt22.i(fw02)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i12;
        } else {
            i2 = i12;
        }
        sr2 sr22 = sr2;
        if ((i12 & 48) == 0) {
            if (yt22.i(sr22)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i12 & 384) == 0) {
            if (yt22.g(ml4)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        } else {
            ml4 ml42 = ml4;
        }
        if ((i12 & 3072) == 0) {
            if (yt22.i((Object) null)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i12 & 24576) == 0) {
            if (yt22.i((Object) null)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i12) == 0) {
            if (yt22.h(z3)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i12) == 0) {
            if (yt22.g(wi42)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i12) == 0) {
            if (yt22.g(la52)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i12) == 0) {
            if (yt22.g((Object) null)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        if ((38347923 & i2) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i2 & 1, z2)) {
            boolean z4 = z3;
            z3 = z4;
            ml4 J = x91.J(yu6.o(h49.t(ml4, (ap4) null, d86.a(true, 0.0f, 0, (pq6) null, 254), z4, (s86) null, sr22, 24).d(yu6.a), b, 48.0f, c, 0.0f, 8), la52);
            ea6 a2 = ca6.a(wr.a, xb4.I, yt22, 48);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, J);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a2);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            yf7.a(((zg4) yt22.k(ch4.b)).b.m, su0.J(865999929, new j92(wi42, z3, fw02), yt22), yt22, 48);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new e70(fw02, sr2, ml4, z3, wi4, la52, i12);
        }
    }
}
