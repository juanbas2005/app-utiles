package defpackage;

/* renamed from: ak7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ak7 {
    public static final pa5 a = new pa5(8.0f, 4.0f, 8.0f, 4.0f);

    public static final void a(dk7 dk7, ml4 ml4, float f, pq6 pq6, long j, long j2, fw0 fw0, yt2 yt2, int i) {
        int i2;
        long j3;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        dk7 dk72 = dk7;
        float f2 = f;
        long j4 = j;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i13 = i;
        yt22.g0(-343758958);
        if ((i13 & 6) == 0) {
            if ((i13 & 8) == 0) {
                z2 = yt22.g(dk72);
            } else {
                z2 = yt22.i(dk72);
            }
            if (z2) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i13;
        } else {
            i2 = i13;
        }
        ml4 ml42 = ml4;
        if ((i13 & 48) == 0) {
            if (yt22.g(ml42)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i13 & 384) == 0) {
            if (yt22.g((Object) null)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i2 |= i10;
        }
        if ((i13 & 3072) == 0) {
            if (yt22.d(f2)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        pq6 pq62 = pq6;
        if ((i13 & 24576) == 0) {
            if (yt22.g(pq62)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i13) == 0) {
            if (yt22.f(j4)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i2 |= i7;
        }
        if ((1572864 & i13) == 0) {
            j3 = j2;
            if (yt22.f(j3)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        } else {
            j3 = j2;
        }
        if ((i13 & 12582912) == 0) {
            if (yt22.d(0.0f)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((100663296 & i13) == 0) {
            if (yt22.d(0.0f)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        }
        if ((805306368 & i13) == 0) {
            if (yt22.i(fw02)) {
                i3 = 536870912;
            } else {
                i3 = 268435456;
            }
            i2 |= i3;
        }
        if ((306783379 & i2) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            yt22.a0();
            if ((i13 & 1) != 0 && !yt22.C()) {
                yt22.Y();
            }
            yt22.s();
            yt22.e0(-1719803223);
            yt22.r(false);
            int i14 = i2 >> 9;
            s87.a(ml42, pq62, j3, 0, 0.0f, 0.0f, su0.J(-1573998995, new xj7(f2, j4, fw02), yt22), yt22, 12582912 | ((i2 >> 12) & 896) | (57344 & i14) | (i14 & 458752), 72);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new yj7(dk72, ml4, f2, pq6, j4, j2, fw02, i13);
        }
    }

    public static final void b(dk7 dk7, String str, ml4 ml4, float f, pq6 pq6, long j, long j2, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z;
        long j3;
        long j4;
        pq6 pq62;
        float f2;
        ml4 ml42;
        long j5;
        jl4 jl4;
        boolean z2;
        pq6 pq63;
        long j6;
        float f3;
        int i3;
        int i4;
        boolean z3;
        int i5;
        dk7 dk72 = dk7;
        String str2 = str;
        yt2 yt22 = yt2;
        yt22.g0(1931523930);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                z3 = yt22.g(dk72);
            } else {
                z3 = yt22.i(dk72);
            }
            if (z3) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i | i5;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt22.g(str2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        int i6 = i2 | 28032;
        if ((i & 196608) == 0) {
            i6 = 93568 | i2;
        }
        if ((i & 1572864) == 0) {
            i6 |= 524288;
        }
        if ((i & 12582912) == 0) {
            i6 |= 4194304;
        }
        int i7 = 905969664 | i6;
        if ((306783379 & i7) == 306783378) {
            z = false;
        } else {
            z = true;
        }
        if (yt22.V(i7 & 1, z)) {
            yt22.a0();
            int i8 = i & 1;
            jl4 jl42 = jl4.w;
            if (i8 == 0 || yt22.C()) {
                f3 = wj7.a;
                pq63 = hr6.a(ie1.T, yt22);
                long e = st0.e(ie1.U, yt22);
                i3 = i7 & -33488897;
                z2 = true;
                j6 = st0.e(ie1.S, yt22);
                j5 = e;
                jl4 = jl42;
            } else {
                yt22.Y();
                i3 = i7 & -33488897;
                jl4 = ml4;
                f3 = f;
                pq63 = pq6;
                j5 = j;
                z2 = true;
                j6 = j2;
            }
            yt22.s();
            if ((i3 & 112) != 32) {
                z2 = false;
            }
            Object Q = yt22.Q();
            if (z2 || Q == ay0.a) {
                Q = new cb(str2, 25);
                yt22.o0(Q);
            }
            int i9 = i3 & 14;
            int i10 = i3 >> 3;
            int i11 = (i10 & 234881024) | i9 | (i10 & 896) | (i10 & 7168) | (29360128 & i10) | 805306368;
            ml4 d = ck6.a(jl42, false, (vr2) Q).d(jl4);
            pq6 pq64 = pq63;
            long j7 = j5;
            a(dk72, d, f3, pq64, j7, j6, fw0, yt22, i11);
            j3 = j6;
            j4 = j7;
            f2 = f3;
            pq62 = pq64;
            ml42 = jl4;
        } else {
            yt2.Y();
            ml42 = ml4;
            f2 = f;
            pq62 = pq6;
            j4 = j;
            j3 = j2;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new zj7(dk7, str2, ml42, f2, pq62, j4, j3, fw0, i);
        }
    }

    /* JADX INFO: finally extract failed */
    public static final void c(sl5 sl5, fw0 fw0, ek7 ek7, ml4 ml4, boolean z, fw0 fw02, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        jl4 jl4;
        Object obj;
        float f;
        float f2;
        Object obj2;
        float f3;
        float f4;
        vr2 vr2;
        vr2 vr22;
        ek7 ek72 = ek7;
        yt2 yt22 = yt2;
        yt22.g0(-293753984);
        sl5 sl52 = sl5;
        if (yt22.g(sl52)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (yt22.g(ek72)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i5 = i4 | i3 | 14380032;
        if ((38347923 & i5) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i5 & 1, z2)) {
            mm7 K0 = rc9.K0(ek72.b, "tooltip transition", yt22, 48);
            Object Q = yt22.Q();
            Object obj3 = ay0.a;
            if (Q == obj3) {
                Q = u55.p((Object) null);
                yt22.o0(Q);
            }
            aq4 aq4 = (aq4) Q;
            Object Q2 = yt22.Q();
            if (Q2 == obj3) {
                new x26(aq4, 7);
                Q2 = new Object();
                yt22.o0(Q2);
            }
            dk7 dk7 = (dk7) Q2;
            fw0 J = su0.J(-23901870, new dx4(21, aq4, fw02), yt22);
            Object Q3 = yt22.Q();
            if (Q3 == obj3) {
                Q3 = u55.p((Object) null);
                yt22.o0(Q3);
            }
            aq4 aq42 = (aq4) Q3;
            Object Q4 = yt22.Q();
            if (Q4 == obj3) {
                Q4 = u55.i(new cq5(aq4, aq42, 1));
                yt22.o0(Q4);
            }
            a37 a37 = (a37) Q4;
            je2 H = hj8.H(vm4.x, yt22);
            je2 H2 = hj8.H(vm4.z, yt22);
            lo7 lo7 = we.v;
            boolean h = K0.h();
            in8 in8 = K0.a;
            if (!h) {
                yt22.e0(1666573488);
                boolean g = yt22.g(K0);
                obj = yt22.Q();
                if (g || obj == obj3) {
                    ix6 h2 = j45.h();
                    if (h2 != null) {
                        vr22 = h2.e();
                    } else {
                        vr22 = null;
                    }
                    ix6 j = j45.j(h2);
                    try {
                        Object H0 = in8.H0();
                        j45.m(h2, j, vr22);
                        yt22.o0(H0);
                        obj = H0;
                    } catch (Throwable th) {
                        j45.m(h2, j, vr22);
                        throw th;
                    }
                }
                yt22.r(false);
            } else {
                yt22.e0(1666827533);
                yt22.r(false);
                obj = in8.H0();
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            yt22.e0(838300572);
            if (booleanValue) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            yt22.r(false);
            Float valueOf = Float.valueOf(f);
            boolean g2 = yt22.g(K0);
            Object Q5 = yt22.Q();
            if (g2 || Q5 == obj3) {
                Q5 = u55.i(new wo0(K0, 18));
                yt22.o0(Q5);
            }
            boolean booleanValue2 = ((Boolean) ((a37) Q5).getValue()).booleanValue();
            yt22.e0(838300572);
            if (booleanValue2) {
                f2 = 1.0f;
            } else {
                f2 = 0.8f;
            }
            yt22.r(false);
            Float valueOf2 = Float.valueOf(f2);
            boolean g3 = yt22.g(K0);
            Object Q6 = yt22.Q();
            if (g3 || Q6 == obj3) {
                Q6 = u55.i(new wo0(K0, 19));
                yt22.o0(Q6);
            }
            gm7 gm7 = (gm7) ((a37) Q6).getValue();
            yt22.e0(-1664496585);
            yt22.r(false);
            je2 je2 = H2;
            aq4 aq43 = aq42;
            Float f5 = valueOf2;
            je2 je22 = je2;
            im7 F = rc9.F(K0, valueOf, f5, H, lo7, yt22, 196608);
            if (!K0.h()) {
                yt22.e0(1666573488);
                boolean g4 = yt22.g(K0);
                obj2 = yt22.Q();
                if (g4 || obj2 == obj3) {
                    ix6 h3 = j45.h();
                    if (h3 != null) {
                        vr2 = h3.e();
                    } else {
                        vr2 = null;
                    }
                    ix6 j2 = j45.j(h3);
                    try {
                        Object H02 = in8.H0();
                        j45.m(h3, j2, vr2);
                        yt22.o0(H02);
                        obj2 = H02;
                    } catch (Throwable th2) {
                        j45.m(h3, j2, vr2);
                        throw th2;
                    }
                }
                yt22.r(false);
            } else {
                yt22.e0(1666827533);
                yt22.r(false);
                obj2 = in8.H0();
            }
            boolean booleanValue3 = ((Boolean) obj2).booleanValue();
            yt22.e0(-1903393104);
            if (booleanValue3) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            yt22.r(false);
            Float valueOf3 = Float.valueOf(f3);
            boolean g5 = yt22.g(K0);
            Object Q7 = yt22.Q();
            if (g5 || Q7 == obj3) {
                Q7 = u55.i(new wo0(K0, 20));
                yt22.o0(Q7);
            }
            boolean booleanValue4 = ((Boolean) ((a37) Q7).getValue()).booleanValue();
            yt22.e0(-1903393104);
            if (booleanValue4) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            yt22.r(false);
            Float valueOf4 = Float.valueOf(f4);
            boolean g6 = yt22.g(K0);
            Object Q8 = yt22.Q();
            if (g6 || Q8 == obj3) {
                Q8 = u55.i(new wo0(K0, 21));
                yt22.o0(Q8);
            }
            gm7 gm72 = (gm7) ((a37) Q8).getValue();
            yt22.e0(-111222965);
            yt22.r(false);
            fw0 fw03 = J;
            rc9.a(sl52, su0.J(-527401546, new zp5(aq43, F, rc9.F(K0, valueOf3, valueOf4, je22, lo7, yt22, 196608), a37, fw0, dk7), yt22), ek72, fw03, yt22, (i5 & 896) | (i5 & 14) | 100663344 | 14380032);
            jl4 = jl4.w;
            z3 = true;
        } else {
            yt2.Y();
            jl4 = ml4;
            z3 = z;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ug(sl5, fw0, ek7, jl4, z3, fw02, i);
        }
    }

    public static final ek7 d(yt2 yt2) {
        mq4 mq4 = c70.a;
        boolean h = yt2.h(false) | yt2.g(mq4);
        Object Q = yt2.Q();
        if (h || Q == ay0.a) {
            Q = new ek7(mq4);
            yt2.o0(Q);
        }
        return (ek7) Q;
    }
}
