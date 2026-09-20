package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: pv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class pv4 {
    public static final jo7 a = new jo7(256, (i12) null, 6);

    public static final void a(aa8 aa8, ml4 ml4, pq6 pq6, long j, long j2, nh2 nh2, fw0 fw0, yt2 yt2, int i) {
        int i2;
        pq6 pq62;
        boolean z;
        nh2 nh22;
        nh2 nh23;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        yt2 yt22 = yt2;
        int i12 = i;
        yt22.g0(1560288494);
        if ((i12 & 6) == 0) {
            if (yt22.g((Object) null)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i12;
        } else {
            i2 = i12;
        }
        aa8 aa82 = aa8;
        if ((i12 & 48) == 0) {
            if (yt22.g(aa82)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        ml4 ml42 = ml4;
        if ((i12 & 384) == 0) {
            if (yt22.g(ml42)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i12 & 3072) == 0) {
            pq62 = pq6;
            if (yt22.g(pq62)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        } else {
            pq62 = pq6;
        }
        long j3 = j;
        if ((i12 & 24576) == 0) {
            if (yt22.f(j3)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i12) == 0) {
            if (yt22.f(j2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        } else {
            long j4 = j2;
        }
        if ((1572864 & i12) == 0) {
            if (yt22.d(0.0f)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((i12 & 12582912) == 0) {
            i2 |= 4194304;
        }
        fw0 fw02 = fw0;
        if ((100663296 & i12) == 0) {
            if (yt22.i(fw02)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        }
        if ((38347923 & i2) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            yt22.a0();
            if ((i12 & 1) == 0 || yt22.C()) {
                Object Q = yt22.Q();
                if (Q == ay0.a) {
                    Q = new qn(1);
                    yt22.o0(Q);
                }
                i3 = i2 & -29360129;
                nh23 = (nh2) Q;
            } else {
                yt22.Y();
                i3 = i2 & -29360129;
                nh23 = nh2;
            }
            yt22.s();
            float f = b96.n;
            float e0 = ((tp1) yt22.k(xy0.h)).e0(f);
            if (yt22.k(xy0.n) == ey3.x) {
                z2 = true;
            } else {
                z2 = false;
            }
            float f2 = f;
            int i13 = i3 >> 6;
            int i14 = (i13 & 57344) | (i13 & 112) | 12582912 | (i13 & 896) | (i13 & 7168);
            s87.a(mp7.X(yu6.o(ml42, 240.0f, 0.0f, f2, 0.0f, 10), new jv4(nh23, e0, z2, 1)).d(jl4.w).d(yu6.b), pq62, j, j2, 0.0f, 0.0f, su0.J(-315420087, new lv4(z2, f2, nh23, e0, aa82, fw02), yt22), yt22, i14, 96);
            nh22 = nh23;
        } else {
            yt2.Y();
            nh22 = nh2;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new mv4(aa8, ml4, pq6, j, j2, nh22, fw0, i12);
        }
    }

    public static final void b(ml4 ml4, pq6 pq6, long j, long j2, aa8 aa8, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z;
        aa8 aa82;
        long j3;
        pq6 pq62;
        jl4 jl4;
        int i3;
        e64 e64;
        yt2 yt22 = yt2;
        yt22.g0(1922633461);
        int i4 = i | 22;
        if (yt22.f(j)) {
            i2 = 256;
        } else {
            i2 = 128;
        }
        int i5 = i4 | i2 | 91136;
        if ((599187 & i5) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i5 & 1, z)) {
            yt22.a0();
            if ((i & 1) == 0 || yt22.C()) {
                float f = tz1.a;
                pq6 a2 = hr6.a(b96.m, yt22);
                j3 = st0.b(j, yt22);
                e64 a3 = tz1.a(yt22);
                i3 = i5 & -466033;
                e64 = a3;
                pq62 = a2;
                jl4 = jl4.w;
            } else {
                yt22.Y();
                jl4 = ml4;
                pq62 = pq6;
                j3 = j2;
                i3 = i5 & -466033;
                e64 = aa8;
            }
            yt22.s();
            a(e64, jl4, pq62, j, j3, (nh2) null, fw0, yt22, ((i3 << 6) & 57344) | 102236550);
            aa82 = e64;
        } else {
            yt2.Y();
            jl4 = ml4;
            pq62 = pq6;
            j3 = j2;
            aa82 = aa8;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new pr4(jl4, pq62, j, j3, aa82, fw0, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0382  */
    public static final void c(fw0 fw0, ml4 ml4, xz1 xz1, boolean z, long j, fw0 fw02, yt2 yt2, int i) {
        int i2;
        boolean z2;
        xz1 xz12;
        long j2;
        boolean z3;
        ml4 ml42;
        fw0 fw03;
        int i3;
        long b;
        jl4 jl4;
        boolean z4;
        boolean z5;
        ad5 ad5;
        aq4 aq4;
        int i4;
        d63 d63;
        o81 o81;
        xz1 xz13;
        sr2 sr2;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        sr2 sr22;
        boolean z10;
        Object Q;
        int i5;
        boolean z11;
        Object Q2;
        boolean z12;
        Object Q3;
        boolean z13;
        Object Q4;
        boolean z14;
        Object Q5;
        xz1 xz14 = xz1;
        yt2 yt22 = yt2;
        yt22.g0(-1907430816);
        int i6 = i | 48;
        if (yt22.g(xz14)) {
            i2 = 256;
        } else {
            i2 = 128;
        }
        int i7 = i6 | i2 | 11264;
        if ((74899 & i7) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i7 & 1, z2)) {
            yt22.a0();
            int i8 = i & 1;
            jl4 jl42 = jl4.w;
            if (i8 == 0 || yt22.C()) {
                float f = tz1.a;
                i3 = i7 & -57345;
                b = jt0.b(0.32f, st0.e(h49.A, yt22));
                jl4 = jl42;
                z4 = true;
            } else {
                yt22.Y();
                i3 = i7 & -57345;
                jl4 = ml4;
                z4 = z;
                b = j;
            }
            int i9 = i3;
            yt22.s();
            Object Q6 = yt22.Q();
            d63 d632 = ay0.a;
            if (Q6 == d632) {
                Q6 = t49.D(yt22);
                yt22.o0(Q6);
            }
            o81 o812 = (o81) Q6;
            String i10 = h75.i(R.string.navigation_menu, yt22);
            tp1 tp1 = (tp1) yt22.k(xy0.h);
            Object Q7 = yt22.Q();
            if (Q7 == d632) {
                Q7 = u55.p(Boolean.FALSE);
                yt22.o0(Q7);
            }
            aq4 aq42 = (aq4) Q7;
            boolean g = yt22.g(tp1);
            Object Q8 = yt22.Q();
            if (g || Q8 == d632) {
                Q8 = new ad5(0.0f);
                yt22.o0(Q8);
            }
            ad5 ad52 = (ad5) Q8;
            Object Q9 = yt22.Q();
            if (Q9 == d632) {
                Q9 = new ok2();
                yt22.o0(Q9);
            }
            ok2 ok2 = (ok2) Q9;
            vm4 vm4 = vm4.w;
            aq4 aq43 = aq42;
            je2 H = hj8.H(vm4, yt22);
            je2 H2 = hj8.H(vm4, yt22);
            o81 o813 = o812;
            je2 H3 = hj8.H(vm4.z, yt22);
            String str = i10;
            int i11 = (i9 & 896) ^ 384;
            long j3 = b;
            if ((i11 <= 256 || !yt22.g(xz14)) && (i9 & 384) != 256) {
                z5 = false;
            } else {
                z5 = true;
            }
            boolean g2 = z5 | yt22.g(tp1) | yt22.i(H2) | yt22.i(H3) | yt22.i(H);
            Object Q10 = yt22.Q();
            if (g2 || Q10 == d632) {
                i4 = i11;
                je2 je2 = H2;
                aq4 = aq43;
                o81 = o813;
                ad5 = ad52;
                d63 = d632;
                xz13 = xz1;
                sr2 = new mm0(xz13, tp1, je2, H3, H);
                yt22.o0(sr2);
            } else {
                o81 = o813;
                xz13 = xz1;
                ad5 = ad52;
                sr2 = Q10;
                aq4 = aq43;
                d63 = d632;
                i4 = i11;
            }
            t49.l(sr2, yt22);
            Boolean valueOf = Boolean.valueOf(xz13.c());
            if ((i4 <= 256 || !yt22.g(xz13)) && (i9 & 384) != 256) {
                z6 = false;
            } else {
                z6 = true;
            }
            Object Q11 = yt22.Q();
            if (z6 || Q11 == d63) {
                Q11 = new tc1(xz13, ok2, (f61) null, 13);
                yt22.o0(Q11);
            }
            t49.h((gs2) Q11, yt22, valueOf);
            if (yt22.k(xy0.n) == ey3.x) {
                z7 = true;
            } else {
                z7 = false;
            }
            ml4 d = jl4.d(yu6.c).d(new jc(xz13.b, z4, Boolean.valueOf(z7)));
            i80 i80 = xb4.y;
            lh4 d2 = mb0.d(i80, false);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, d);
            ux0.d.getClass();
            ml4 ml43 = jl4;
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            int i12 = hashCode;
            g75.Q(ckVar, yt22, d2);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf2 = Integer.valueOf(i12);
            ok2 ok22 = ok2;
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf2);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            boolean z15 = z4;
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            lh4 d3 = mb0.d(i80, false);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            d63 d633 = d63;
            ml4 E2 = gw8.E(yt22, jl42);
            yt22.i0();
            jl4 jl43 = jl42;
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, d3);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E2);
            fw02.H(yt22, 6);
            yt22.r(true);
            xz1 xz15 = xz1;
            if ((i4 <= 256 || !yt22.g(xz15)) && (i9 & 384) != 256) {
                z8 = false;
            } else {
                z8 = true;
            }
            boolean i13 = z8 | yt22.i(o81);
            Object Q12 = yt22.Q();
            d63 d634 = d633;
            if (i13 || Q12 == d634) {
                z9 = z15;
                Q12 = new m92(z9, xz15, o81);
                yt22.o0(Q12);
            } else {
                z9 = z15;
            }
            sr2 sr23 = (sr2) Q12;
            boolean z16 = z9;
            String i14 = h75.i(R.string.close_drawer, yt22);
            if (!xz15.c()) {
                sr23 = null;
            }
            ad5 ad53 = ad5;
            boolean g3 = yt22.g(ad53);
            String str2 = i14;
            if (i4 <= 256 || !yt22.g(xz15)) {
                sr22 = sr23;
                if ((i9 & 384) != 256) {
                    z10 = false;
                    boolean z17 = g3 | z10;
                    Q = yt22.Q();
                    if (z17 || Q == d634) {
                        Q = new qm3(8, (Object) xz15, (Object) ad53);
                        yt22.o0(Q);
                    }
                    String str3 = str2;
                    ck ckVar5 = ckVar4;
                    i5 = i9;
                    ck ckVar6 = ckVar2;
                    ce ceVar2 = ceVar;
                    xz12 = xz1;
                    long j4 = j3;
                    ck ckVar7 = ckVar3;
                    ck ckVar8 = ckVar;
                    gw8.c(str3, (ml4) null, sr22, (sr2) Q, j4, yt22, 0);
                    if ((i4 <= 256 || !yt22.g(xz12)) && (i5 & 384) != 256) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    Q2 = yt22.Q();
                    if (z11 || Q2 == d634) {
                        Q2 = new h43(19, xz12);
                        yt22.o0(Q2);
                    }
                    ml4 G = gw8.G(jl43, (vr2) Q2);
                    String str4 = str;
                    boolean g4 = yt22.g(str4);
                    if ((i4 <= 256 || !yt22.g(xz12)) && (i5 & 384) != 256) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    boolean i15 = g4 | z12 | yt22.i(o81);
                    Q3 = yt22.Q();
                    if (i15 || Q3 == d634) {
                        Q3 = new g5((Object) str4, (Object) xz12, (Object) o81, 21);
                        yt22.o0(Q3);
                    }
                    ml4 a2 = ck6.a(G, false, (vr2) Q3);
                    if ((i4 <= 256 || !yt22.g(xz12)) && (i5 & 384) != 256) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    boolean i16 = yt22.i(o81) | z13;
                    Q4 = yt22.Q();
                    if (i16 || Q4 == d634) {
                        Q4 = new e3(18, (Object) xz12, (Object) o81);
                        yt22.o0(Q4);
                    }
                    ml4 s = uq3.s(t49.U(a2, (vr2) Q4), ok22);
                    if ((i4 <= 256 || !yt22.g(xz12)) && (i5 & 384) != 256) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    boolean g5 = yt22.g(ad53) | z14;
                    Q5 = yt22.Q();
                    if (g5 || Q5 == d634) {
                        Q5 = new ov4(xz12, aq4, ad53, 0);
                        yt22.o0(Q5);
                    }
                    lh4 lh4 = (lh4) Q5;
                    int hashCode3 = Long.hashCode(yt22.T);
                    vf5 m3 = yt22.m();
                    ml4 E3 = gw8.E(yt22, s);
                    yt22.i0();
                    if (!yt22.S) {
                        yt22.l(vy0);
                    } else {
                        yt22.r0();
                    }
                    g75.Q(ckVar8, yt22, lh4);
                    g75.Q(ckVar6, yt22, m3);
                    f21.s(hashCode3, yt22, ckVar7, yt22, ceVar2);
                    g75.Q(ckVar5, yt22, E3);
                    fw03 = fw0;
                    fw03.H(yt22, 6);
                    yt22.r(true);
                    yt22.r(true);
                    j2 = j4;
                    ml42 = ml43;
                    z3 = z16;
                }
            } else {
                sr22 = sr23;
            }
            z10 = true;
            boolean z172 = g3 | z10;
            Q = yt22.Q();
            Q = new qm3(8, (Object) xz15, (Object) ad53);
            yt22.o0(Q);
            String str32 = str2;
            ck ckVar52 = ckVar4;
            i5 = i9;
            ck ckVar62 = ckVar2;
            ce ceVar22 = ceVar;
            xz12 = xz1;
            long j42 = j3;
            ck ckVar72 = ckVar3;
            ck ckVar82 = ckVar;
            gw8.c(str32, (ml4) null, sr22, (sr2) Q, j42, yt22, 0);
            if ((i4 <= 256 || !yt22.g(xz12)) && (i5 & 384) != 256) {
            }
            Q2 = yt22.Q();
            Q2 = new h43(19, xz12);
            yt22.o0(Q2);
            ml4 G2 = gw8.G(jl43, (vr2) Q2);
            String str42 = str;
            boolean g42 = yt22.g(str42);
            if ((i4 <= 256 || !yt22.g(xz12)) && (i5 & 384) != 256) {
            }
            boolean i152 = g42 | z12 | yt22.i(o81);
            Q3 = yt22.Q();
            Q3 = new g5((Object) str42, (Object) xz12, (Object) o81, 21);
            yt22.o0(Q3);
            ml4 a22 = ck6.a(G2, false, (vr2) Q3);
            if ((i4 <= 256 || !yt22.g(xz12)) && (i5 & 384) != 256) {
            }
            boolean i162 = yt22.i(o81) | z13;
            Q4 = yt22.Q();
            Q4 = new e3(18, (Object) xz12, (Object) o81);
            yt22.o0(Q4);
            ml4 s2 = uq3.s(t49.U(a22, (vr2) Q4), ok22);
            if ((i4 <= 256 || !yt22.g(xz12)) && (i5 & 384) != 256) {
            }
            boolean g52 = yt22.g(ad53) | z14;
            Q5 = yt22.Q();
            Q5 = new ov4(xz12, aq4, ad53, 0);
            yt22.o0(Q5);
            lh4 lh42 = (lh4) Q5;
            int hashCode32 = Long.hashCode(yt22.T);
            vf5 m32 = yt22.m();
            ml4 E32 = gw8.E(yt22, s2);
            yt22.i0();
            if (!yt22.S) {
            }
            g75.Q(ckVar82, yt22, lh42);
            g75.Q(ckVar62, yt22, m32);
            f21.s(hashCode32, yt22, ckVar72, yt22, ceVar22);
            g75.Q(ckVar52, yt22, E32);
            fw03 = fw0;
            fw03.H(yt22, 6);
            yt22.r(true);
            yt22.r(true);
            j2 = j42;
            ml42 = ml43;
            z3 = z16;
        } else {
            xz12 = xz14;
            fw03 = fw0;
            yt22.Y();
            ml42 = ml4;
            z3 = z;
            j2 = j;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new kv4(fw03, ml42, xz12, z3, j2, fw02, i);
        }
    }

    public static final void d(fw0 fw0, boolean z, f5 f5Var, ml4 ml4, gs2 gs2, pq6 pq6, ml1 ml1, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        pq6 pq62;
        pq6 pq63;
        int i5;
        long j;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3 = z;
        ml4 ml42 = ml4;
        ml1 ml12 = ml1;
        yt2 yt22 = yt2;
        int i11 = i;
        yt22.g0(-583709666);
        if ((i11 & 48) == 0) {
            if (yt22.h(z3)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 = i10 | i11;
        } else {
            i2 = i11;
        }
        f5 f5Var2 = f5Var;
        if ((i11 & 384) == 0) {
            if (yt22.i(f5Var2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i11 & 3072) == 0) {
            if (yt22.g(ml42)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if (yt22.i(gs2)) {
            i3 = 16384;
        } else {
            i3 = 8192;
        }
        int i12 = i2 | i3;
        if ((196608 & i11) == 0) {
            if (yt22.i((Object) null)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i12 |= i7;
        }
        int i13 = i12 | 524288;
        if (yt22.g(ml12)) {
            i4 = 8388608;
        } else {
            i4 = 4194304;
        }
        int i14 = i13 | i4;
        if ((100663296 & i11) == 0) {
            if (yt22.g((Object) null)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i14 |= i6;
        }
        if ((38347923 & i14) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i14 & 1, z2)) {
            yt22.a0();
            if ((i11 & 1) == 0 || yt22.C()) {
                i5 = i14 & -3670017;
                pq63 = hr6.a(b96.k, yt22);
            } else {
                yt22.Y();
                i5 = i14 & -3670017;
                pq63 = pq6;
            }
            yt22.s();
            Object Q = yt22.Q();
            if (Q == ay0.a) {
                Q = new ot4(12);
                yt22.o0(Q);
            }
            ml4 d = yu6.f(ck6.a(ml42, false, (vr2) Q), b96.j, 0.0f, 2).d(yu6.a);
            int i15 = i5 >> 3;
            ml12.getClass();
            yt22.e0(-433512770);
            if (z3) {
                j = ml12.e;
            } else {
                j = ml12.f;
            }
            aq4 v = u55.v(new jt0(j), yt22);
            yt22.r(false);
            long j2 = ((jt0) v.getValue()).a;
            int i16 = i15 & 126;
            pq6 pq64 = pq63;
            s87.b(z, f5Var, d, false, pq64, j2, 0, 0.0f, (ua0) null, (ap4) null, su0.J(-1173018444, new ai0((Object) gs2, (Object) ml12, z, (Object) fw0, 6), yt22), yt22, i16, 968);
            pq62 = pq64;
        } else {
            yt2.Y();
            pq62 = pq6;
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new sl0(fw0, z, f5Var, ml4, gs2, pq62, ml1, i);
        }
    }

    public static final void e(ml4 ml4, pq6 pq6, long j, long j2, aa8 aa8, fw0 fw0, yt2 yt2, int i) {
        int i2;
        long j3;
        boolean z;
        aa8 aa82;
        pq6 pq62;
        aa8 aa83;
        int i3;
        pq6 pq63;
        int i4;
        int i5;
        int i6;
        int i7;
        ml4 ml42 = ml4;
        yt2 yt22 = yt2;
        int i8 = i;
        yt22.g0(1877158612);
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
        int i9 = i2 | 48;
        if ((i8 & 384) == 0) {
            j3 = j;
            if (yt22.f(j3)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i9 |= i6;
        } else {
            j3 = j;
        }
        long j4 = j2;
        if ((i8 & 3072) == 0) {
            if (yt22.f(j4)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i9 |= i5;
        }
        int i10 = i9 | 24576;
        if ((196608 & i8) == 0) {
            i10 = 90112 | i9;
        }
        fw0 fw02 = fw0;
        if ((1572864 & i8) == 0) {
            if (yt22.i(fw02)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i10 |= i4;
        }
        if ((599187 & i10) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i10 & 1, z)) {
            yt22.a0();
            if ((i8 & 1) == 0 || yt22.C()) {
                pq63 = gr8.h;
                aa83 = tz1.a(yt22);
                i3 = i10 & -458753;
            } else {
                yt22.Y();
                aa83 = aa8;
                i3 = i10 & -458753;
                pq63 = pq6;
            }
            yt22.s();
            String i11 = h75.i(R.string.navigation_menu, yt22);
            boolean g = yt22.g(i11);
            Object Q = yt22.Q();
            if (g || Q == ay0.a) {
                Q = new cb(i11, 18);
                yt22.o0(Q);
            }
            int i12 = i3 << 6;
            pq6 pq64 = pq63;
            aa8 aa84 = aa83;
            a(aa84, ck6.a(ml42, false, (vr2) Q), pq64, j3, j4, (nh2) null, fw02, yt22, (i12 & 234881024) | 6 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12));
            aa82 = aa84;
            pq62 = pq64;
        } else {
            yt2.Y();
            pq62 = pq6;
            aa82 = aa8;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new nv4(ml42, pq62, j, j2, aa82, fw0, i);
        }
    }

    public static final xz1 f(yt2 yt2) {
        Object Q = yt2.Q();
        d63 d63 = ay0.a;
        if (Q == d63) {
            Q = new ot4(13);
            yt2.o0(Q);
        }
        vr2 vr2 = (vr2) Q;
        Object[] objArr = new Object[0];
        kg5 kg5 = new kg5(12, new uz1(0), new vz1(0, vr2));
        boolean g = yt2.g(vr2);
        Object Q2 = yt2.Q();
        if (g || Q2 == d63) {
            Q2 = new zg1(vr2);
            yt2.o0(Q2);
        }
        return (xz1) u55.t(objArr, kg5, (sr2) Q2, yt2, 0);
    }
}
