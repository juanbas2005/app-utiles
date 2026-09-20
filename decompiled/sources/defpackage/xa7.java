package defpackage;

import android.content.Context;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.feature.nauta.service.NautaOverlayService;
import cu.lestebang.utiletecsa.feature.registro.navigation.ContactDetail;
import java.util.List;
import java.util.Set;

/* renamed from: xa7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class xa7 implements hs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ xa7(qq4 qq4, pq4 pq4) {
        this.w = 6;
        this.x = qq4;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        u96 u96;
        am6 am6 = (am6) this.x;
        int intValue = ((Integer) obj).intValue();
        String str = (String) obj2;
        bv4 bv4 = (bv4) obj3;
        str.getClass();
        bv4.getClass();
        if ((bv4 instanceof ct0) || ((zr3) am6.y).getDescriptor().i(intValue)) {
            u96 = u96.x;
        } else {
            u96 = u96.w;
        }
        int ordinal = u96.ordinal();
        if (ordinal == 0) {
            String h = pb4.h('}', "{", str);
            am6.z = ((String) am6.z) + '/' + h;
        } else if (ordinal == 1) {
            am6.k(str, "{" + str + '}');
        } else {
            h.c();
            return null;
        }
        return vs7.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        oe6 oe6 = (oe6) this.x;
        cu4 cu4 = (cu4) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (yt2.g(cu4)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(intValue & 1, z)) {
            oe6.b(cu4.b, su0.J(121262920, new o30(cu4, 1), yt2), yt2, 48);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        ay6 ay6 = (ay6) this.x;
        cu4 cu4 = (cu4) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (yt2.g(cu4)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(intValue & 1, z)) {
            Object obj4 = cu4.b;
            if (!((Set) yt2.k(hg6.a)).contains(obj4)) {
                yt2.e0(1574916499);
                yt2.c0(1159182959, obj4);
                Object Q = yt2.Q();
                if (Q == ay0.a) {
                    Object obj5 = ay6.get(obj4);
                    if (obj5 == null) {
                        fw0 fw0 = new fw0(1032736913, new xa7(5, (Object) new fn4(gr8.d)), true);
                        ay6.put(obj4, fw0);
                        obj5 = fw0;
                    }
                    Q = (hs2) obj5;
                    yt2.o0(Q);
                }
                ((hs2) Q).u(su0.J(-804085656, new o30(cu4, 2), yt2), yt2, 54);
                yt2.r(false);
                yt2.r(false);
            } else {
                yt2.e0(1576267665);
                yt2.r(false);
            }
        } else {
            yt2.Y();
        }
        return vs7.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        gm6 gm6 = (gm6) this.x;
        dm6 dm6 = (dm6) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        dm6.getClass();
        if ((intValue & 6) == 0) {
            if (yt2.g(dm6)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(intValue & 1, z)) {
            List list = dm6.a;
            boolean i2 = yt2.i(gm6);
            Object Q = yt2.Q();
            if (i2 || Q == ay0.a) {
                q75 q75 = new q75(1, gm6, gm6.class, "callService", "callService(Ljava/lang/String;)V", 0, 0, 25);
                yt2.o0(q75);
                Q = q75;
            }
            em6.c(list, (vr2) ((zq3) Q), yt2, 0);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        boolean z;
        a37 a37 = (a37) this.x;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((pb0) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(intValue & 1, z)) {
            x83 x83 = aa5.d;
            if (x83 == null) {
                w83 w83 = new w83("Filled.SimCard", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                int i = e38.a;
                ky6 ky6 = new ky6(jt0.b);
                be5 e = pb4.e(19.99f, 4.0f);
                e.e(0.0f, -1.1f, -0.89f, -2.0f, -1.99f, -2.0f);
                e.g(-8.0f);
                e.h(4.0f, 8.0f);
                e.n(12.0f);
                e.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                e.g(12.01f);
                e.e(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                e.i(-0.01f, -16.0f);
                e.c();
                e.j(9.0f, 19.0f);
                e.h(7.0f, 19.0f);
                e.n(-2.0f);
                e.g(2.0f);
                e.n(2.0f);
                e.c();
                e.j(17.0f, 19.0f);
                e.g(-2.0f);
                e.n(-2.0f);
                e.g(2.0f);
                e.n(2.0f);
                e.c();
                e.j(9.0f, 15.0f);
                e.h(7.0f, 15.0f);
                e.n(-4.0f);
                e.g(2.0f);
                e.n(4.0f);
                e.c();
                e.j(13.0f, 19.0f);
                e.g(-2.0f);
                e.n(-4.0f);
                e.g(2.0f);
                e.n(4.0f);
                e.c();
                e.j(13.0f, 13.0f);
                e.g(-2.0f);
                e.n(-2.0f);
                e.g(2.0f);
                e.n(2.0f);
                e.c();
                e.j(17.0f, 15.0f);
                e.g(-2.0f);
                e.n(-4.0f);
                e.g(2.0f);
                e.n(4.0f);
                e.c();
                w83.a(w83, e.a, ky6, 14336);
                x83 = w83.b();
                aa5.d = x83;
            }
            d83.a(x83, l55.u(R.string.default_sim_quick_selector_description, yt2), ub5.r(yu6.l(jl4.w, 22.0f), ((Number) a37.getValue()).floatValue()), ((zg4) yt2.k(ch4.b)).a.q, yt2, 0, 0);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        boolean z7;
        boolean z8;
        int i3;
        boolean z9;
        int i4;
        boolean z10;
        boolean z11;
        int i5;
        boolean z12;
        boolean z13;
        Object obj4 = obj;
        int i6 = this.w;
        sr srVar = wr.c;
        rr rrVar = wr.a;
        jl4 jl4 = jl4.w;
        Object obj5 = ay0.a;
        vs7 vs7 = vs7.a;
        Object obj6 = this.x;
        boolean z14 = false;
        switch (i6) {
            case b85.b:
                wa7 wa7 = (wa7) obj6;
                yt2 yt2 = (yt2) obj2;
                ((Integer) obj3).getClass();
                yt2.e0(-1541271084);
                float f = wa7.b;
                vm4 vm4 = vm4.w;
                a37 a = vj.a(f, hj8.H(vm4, yt2), yt2);
                a37 a2 = vj.a(wa7.a, hj8.H(vm4, yt2), yt2);
                ml4 s = yu6.s(((ml4) obj4).d(yu6.a), xb4.E, 2);
                boolean g = yt2.g(a2);
                Object Q = yt2.Q();
                if (g || Q == obj5) {
                    Q = new pn(4, a2);
                    yt2.o0(Q);
                }
                ml4 p = yu6.p(gw8.G(s, (vr2) Q), ((lx1) a.getValue()).w);
                yt2.r(false);
                return p;
            case 1:
                uy7 uy7 = (uy7) obj6;
                yt2 yt22 = (yt2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((r04) obj4).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt22.V(intValue & 1, z)) {
                    yf7.b(uy7.w, x91.O(jl4.w, 0.0f, 10.0f, 0.0f, 4.0f, 5), b30.r(uq3.d(4279391610L), uq3.d(4281301934L)), ya5.k(13), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 1597488, 0, 262056);
                } else {
                    yt22.Y();
                }
                return vs7;
            case 2:
                x71 x71 = (x71) obj6;
                int intValue2 = ((Integer) obj4).intValue();
                int intValue3 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (!booleanValue) {
                    intValue2 = x71.S.h(intValue2);
                }
                if (!booleanValue) {
                    intValue3 = x71.S.h(intValue3);
                }
                if (x71.Q) {
                    long j = x71.N.b;
                    int i7 = lg7.c;
                    if (!(intValue2 == ((int) (j >> 32)) && intValue3 == ((int) (j & 4294967295L)))) {
                        int min = Math.min(intValue2, intValue3);
                        ey2 ey2 = ey2.w;
                        if (min < 0 || Math.max(intValue2, intValue3) > x71.N.a.x.length()) {
                            ze7 ze7 = x71.T;
                            ze7.t(false);
                            ze7.q(ey2);
                        } else {
                            if (booleanValue || intValue2 == intValue3) {
                                ze7 ze72 = x71.T;
                                ze72.t(false);
                                ze72.q(ey2);
                            } else {
                                x71.T.h(true);
                            }
                            x71.O.v.y(new hf7(x71.N.a, i95.a(intValue2, intValue3), (lg7) null));
                            z2 = true;
                            return Boolean.valueOf(z2);
                        }
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 3:
                en2 en2 = (en2) obj6;
                yt2 yt23 = (yt2) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((fa6) obj4).getClass();
                if ((intValue4 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt23.V(intValue4 & 1, z3)) {
                    if (en2 == null) {
                        i = R.string.forum_publish;
                    } else {
                        i = R.string.forum_save;
                    }
                    yf7.b(l55.u(i, yt23), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 0, 0, 262142);
                } else {
                    yt23.Y();
                }
                return vs7;
            case 4:
                oh5 oh5 = (oh5) obj6;
                yt2 yt24 = (yt2) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((bu0) obj4).getClass();
                if ((intValue5 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (yt24.V(intValue5 & 1, z4)) {
                    ml4 L = x91.L(jl4, 14.0f, 8.0f);
                    ea6 a3 = ca6.a(rrVar, xb4.I, yt24, 48);
                    int hashCode = Long.hashCode(yt24.T);
                    vf5 m = yt24.m();
                    ml4 E = gw8.E(yt24, L);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt24.i0();
                    if (yt24.S) {
                        yt24.l(vy0);
                    } else {
                        yt24.r0();
                    }
                    ck ckVar = tx0.f;
                    g75.Q(ckVar, yt24, a3);
                    ck ckVar2 = tx0.e;
                    g75.Q(ckVar2, yt24, m);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ck ckVar3 = tx0.g;
                    g75.Q(ckVar3, yt24, valueOf);
                    ce ceVar = tx0.h;
                    g75.O(yt24, ceVar);
                    ck ckVar4 = tx0.d;
                    g75.Q(ckVar4, yt24, E);
                    x83 x83 = oh5.b;
                    String str = oh5.g;
                    yt2 yt25 = yt24;
                    t13.q(x83, oh5.c, oh5.d, 36, yt25, 3072, 0);
                    yt2 yt26 = yt25;
                    k75.a(yt26, yu6.p(jl4, 10.0f));
                    au0 a4 = zt0.a(srVar, xb4.K, yt26, 0);
                    int hashCode2 = Long.hashCode(yt26.T);
                    vf5 m2 = yt26.m();
                    ml4 E2 = gw8.E(yt26, jl4);
                    yt26.i0();
                    if (yt26.S) {
                        yt26.l(vy0);
                    } else {
                        yt26.r0();
                    }
                    g75.Q(ckVar, yt26, a4);
                    g75.Q(ckVar2, yt26, m2);
                    f21.s(hashCode2, yt26, ckVar3, yt26, ceVar);
                    g75.Q(ckVar4, yt26, E2);
                    String str2 = oh5.a;
                    long k = z08.k();
                    long k2 = ya5.k(15);
                    am2 am2 = am2.B;
                    long k3 = ya5.k(15);
                    tg7 tg7 = t13.c;
                    yt2 yt27 = yt26;
                    yf7.b(str2, (ml4) null, k, k2, am2, (ea7) null, 0, (rd7) null, (hc7) null, k3, 0, false, 0, 0, tg7, yt27, 1597440, 12582960, 128938);
                    yf7.b(oh5.f, (ml4) null, z08.e(), ya5.k(11), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, ya5.k(11), 0, false, 0, 0, tg7, yt27, 24576, 12582960, 129002);
                    yt2 yt28 = yt27;
                    if (str.length() > 0) {
                        yt28.e0(1163273815);
                        yf7.b(str, (ml4) null, z08.e(), ya5.k(10), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, ya5.k(10), 0, false, 0, 0, tg7, yt28, 24576, 12582960, 129002);
                        yt28.r(false);
                    } else {
                        yt28.e0(1163673591);
                        yt28.r(false);
                    }
                    yt28.r(true);
                    yt28.r(true);
                } else {
                    yt24.Y();
                }
                return vs7;
            case 5:
                fn4 fn4 = (fn4) obj6;
                yt2 yt29 = (yt2) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    if ((intValue6 & 8) == 0) {
                        z6 = yt29.g(obj4);
                    } else {
                        z6 = yt29.i(obj4);
                    }
                    if (z6) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue6 |= i2;
                }
                if ((intValue6 & 19) != 18) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (yt29.V(intValue6 & 1, z5)) {
                    yt29.H(fn4, yt29.m(), obj4, false);
                } else {
                    yt29.Y();
                }
                return vs7;
            case 6:
                qq4 qq4 = (qq4) obj6;
                Throwable th = (Throwable) obj4;
                vs7 vs72 = (vs7) obj2;
                e81 e81 = (e81) obj3;
                qq4.F.set(qq4, (Object) null);
                qq4.k((Object) null);
                return vs7;
            case 7:
                vs4 vs4 = (vs4) obj6;
                hs4 hs4 = (hs4) obj4;
                yt2 yt210 = (yt2) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                hs4.getClass();
                if ((intValue7 & 6) == 0) {
                    if (yt210.g(hs4)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    intValue7 |= i3;
                }
                if ((intValue7 & 19) != 18) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (yt210.V(intValue7 & 1, z7)) {
                    Context context = (Context) yt210.k(ye.b);
                    aq4 n = hj8.n(NautaOverlayService.K, yt210);
                    Object Q2 = yt210.Q();
                    if (Q2 == obj5) {
                        Q2 = u55.p(Boolean.FALSE);
                        yt210.o0(Q2);
                    }
                    aq4 aq4 = (aq4) Q2;
                    s8 s8Var = new s8(false, 3);
                    boolean i8 = yt210.i(vs4);
                    Object Q3 = yt210.Q();
                    if (i8 || Q3 == obj5) {
                        Q3 = new w34(5, vs4, aq4);
                        yt210.o0(Q3);
                    }
                    se4 N = tf4.N(s8Var, (vr2) Q3, yt210, 0);
                    if (((Boolean) aq4.getValue()).booleanValue()) {
                        yt210.e0(1422661731);
                        i98 i98 = hs4.f;
                        if (i98 == null) {
                            i98 = new i98((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 511);
                        }
                        boolean i9 = yt210.i(vs4);
                        Object Q4 = yt210.Q();
                        if (i9 || Q4 == obj5) {
                            Q4 = new js4(vs4, 1);
                            yt210.o0(Q4);
                        }
                        sr2 sr2 = (sr2) Q4;
                        Object Q5 = yt210.Q();
                        if (Q5 == obj5) {
                            Q5 = new vo2(aq4, 22);
                            yt210.o0(Q5);
                        }
                        rs4.n(i98, sr2, (sr2) Q5, yt210, 384);
                        yt210.r(false);
                    } else {
                        yt210.e0(1422885644);
                        yt210.r(false);
                    }
                    Boolean valueOf2 = Boolean.valueOf(hs4.a);
                    int i10 = intValue7 & 14;
                    if (i10 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean i11 = z8 | yt210.i(context);
                    Object Q6 = yt210.Q();
                    if (i11 || Q6 == obj5) {
                        Q6 = new tc1(hs4, context, (f61) null, 10);
                        yt210.o0(Q6);
                    }
                    t49.h((gs2) Q6, yt210, valueOf2);
                    boolean booleanValue2 = ((Boolean) n.getValue()).booleanValue();
                    boolean i12 = yt210.i(vs4);
                    Object Q7 = yt210.Q();
                    if (i12 || Q7 == obj5) {
                        Q7 = new ch(3, vs4);
                        yt210.o0(Q7);
                    }
                    is2 is2 = (is2) Q7;
                    boolean i13 = yt210.i(vs4);
                    Object Q8 = yt210.Q();
                    if (i13 || Q8 == obj5) {
                        Q8 = new js4(vs4, 2);
                        yt210.o0(Q8);
                    }
                    sr2 sr22 = (sr2) Q8;
                    boolean i14 = yt210.i(vs4);
                    Object Q9 = yt210.Q();
                    if (i14 || Q9 == obj5) {
                        Q9 = new js4(vs4, 3);
                        yt210.o0(Q9);
                    }
                    sr2 sr23 = (sr2) Q9;
                    boolean i15 = yt210.i(vs4);
                    Object Q10 = yt210.Q();
                    if (i15 || Q10 == obj5) {
                        Q10 = new is4(vs4, 0);
                        yt210.o0(Q10);
                    }
                    vr2 vr2 = (vr2) Q10;
                    boolean i16 = yt210.i(vs4);
                    Object Q11 = yt210.Q();
                    if (i16 || Q11 == obj5) {
                        Q11 = new yg(18, vs4);
                        yt210.o0(Q11);
                    }
                    gs2 gs2 = (gs2) Q11;
                    boolean i17 = yt210.i(vs4);
                    Object Q12 = yt210.Q();
                    if (i17 || Q12 == obj5) {
                        Q12 = new is4(vs4, 1);
                        yt210.o0(Q12);
                    }
                    vr2 vr22 = (vr2) Q12;
                    boolean i18 = yt210.i(vs4);
                    Object Q13 = yt210.Q();
                    if (i18 || Q13 == obj5) {
                        Q13 = new js4(vs4, 0);
                        yt210.o0(Q13);
                    }
                    sr2 sr24 = (sr2) Q13;
                    boolean i19 = yt210.i(context) | yt210.g(n);
                    Object Q14 = yt210.Q();
                    if (i19 || Q14 == obj5) {
                        Q14 = new qm3(5, (Object) context, (Object) n);
                        yt210.o0(Q14);
                    }
                    sr2 sr25 = (sr2) Q14;
                    boolean i20 = yt210.i(context) | yt210.i(vs4) | yt210.i(N);
                    Object Q15 = yt210.Q();
                    if (i20 || Q15 == obj5) {
                        mm0 mm0 = new mm0((Object) context, (Object) vs4, (Object) N, (Object) aq4, 4);
                        yt210.o0(mm0);
                        Q15 = mm0;
                    }
                    rs4.h(hs4, booleanValue2, is2, sr22, sr23, vr2, gs2, vr22, sr24, sr25, (sr2) Q15, yt210, i10);
                } else {
                    yt210.Y();
                }
                return vs7;
            case 8:
                iu4 iu4 = (iu4) obj6;
                String str3 = (String) obj4;
                String str4 = (String) obj2;
                String str5 = (String) obj3;
                str3.getClass();
                str4.getClass();
                str5.getClass();
                iu4.getClass();
                iu4.a(new ot4(28), new ContactDetail(str3, str4, str5));
                return vs7;
            case 9:
                dj5 dj5 = (dj5) obj6;
                oi5 oi5 = (oi5) obj4;
                yt2 yt211 = (yt2) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                oi5.getClass();
                if ((intValue8 & 6) == 0) {
                    if (yt211.g(oi5)) {
                        i4 = 4;
                    } else {
                        i4 = 2;
                    }
                    intValue8 |= i4;
                }
                if ((intValue8 & 19) != 18) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (yt211.V(intValue8 & 1, z9)) {
                    boolean i21 = yt211.i(dj5);
                    Object Q16 = yt211.Q();
                    if (i21 || Q16 == obj5) {
                        Q16 = new q75(1, dj5, dj5.class, "setSinConfirmacion", "setSinConfirmacion(Z)V", 0, 0, 3);
                        yt211.o0(Q16);
                    }
                    vr2 vr23 = (vr2) ((zq3) Q16);
                    boolean i22 = yt211.i(dj5);
                    Object Q17 = yt211.Q();
                    if (i22 || Q17 == obj5) {
                        Q17 = new yd(0, dj5, dj5.class, "dialBolsaMensajeria", "dialBolsaMensajeria()V", 0, 0, 28);
                        yt211.o0(Q17);
                    }
                    sr2 sr26 = (sr2) ((zq3) Q17);
                    boolean i23 = yt211.i(dj5);
                    Object Q18 = yt211.Q();
                    if (i23 || Q18 == obj5) {
                        Q18 = new q75(1, dj5, dj5.class, "dialPlanVoz", "dialPlanVoz(I)V", 0, 0, 5);
                        yt211.o0(Q18);
                    }
                    vr2 vr24 = (vr2) ((zq3) Q18);
                    boolean i24 = yt211.i(dj5);
                    Object Q19 = yt211.Q();
                    if (i24 || Q19 == obj5) {
                        Q19 = new q75(1, dj5, dj5.class, "dialPaqueteCombinado", "dialPaqueteCombinado(I)V", 0, 0, 6);
                        yt211.o0(Q19);
                    }
                    vr2 vr25 = (vr2) ((zq3) Q19);
                    boolean i25 = yt211.i(dj5);
                    Object Q20 = yt211.Q();
                    if (i25 || Q20 == obj5) {
                        Q20 = new yd(0, dj5, dj5.class, "dialBolsaDiariaLte", "dialBolsaDiariaLte()V", 0, 0, 29);
                        yt211.o0(Q20);
                    }
                    sr2 sr27 = (sr2) ((zq3) Q20);
                    boolean i26 = yt211.i(dj5);
                    Object Q21 = yt211.Q();
                    if (i26 || Q21 == obj5) {
                        Q21 = new xi5(0, dj5, dj5.class, "dialPaqueteDatos", "dialPaqueteDatos()V", 0, 0, 0);
                        yt211.o0(Q21);
                    }
                    sr2 sr28 = (sr2) ((zq3) Q21);
                    boolean i27 = yt211.i(dj5);
                    Object Q22 = yt211.Q();
                    if (i27 || Q22 == obj5) {
                        Q22 = new q75(1, dj5, dj5.class, "dialPlanSms", "dialPlanSms(I)V", 0, 0, 7);
                        yt211.o0(Q22);
                    }
                    vr2 vr26 = (vr2) ((zq3) Q22);
                    boolean i28 = yt211.i(dj5);
                    Object Q23 = yt211.Q();
                    if (i28 || Q23 == obj5) {
                        Q23 = new q75(1, dj5, dj5.class, "dialPlanAmigo", "dialPlanAmigo(I)V", 0, 0, 8);
                        yt211.o0(Q23);
                    }
                    vr2 vr27 = (vr2) ((zq3) Q23);
                    boolean i29 = yt211.i(dj5);
                    Object Q24 = yt211.Q();
                    if (i29 || Q24 == obj5) {
                        Q24 = new q75(1, dj5, dj5.class, "dialAdicionarAmigo", "dialAdicionarAmigo(Ljava/lang/String;)V", 0, 0, 9);
                        yt211.o0(Q24);
                    }
                    vr2 vr28 = (vr2) ((zq3) Q24);
                    boolean i30 = yt211.i(dj5);
                    Object Q25 = yt211.Q();
                    if (i30 || Q25 == obj5) {
                        Q25 = new q75(1, dj5, dj5.class, "dialEliminarAmigo", "dialEliminarAmigo(Ljava/lang/String;)V", 0, 0, 4);
                        yt211.o0(Q25);
                    }
                    vr2 vr29 = (vr2) ((zq3) Q25);
                    boolean i31 = yt211.i(dj5);
                    Object Q26 = yt211.Q();
                    if (i31 || Q26 == obj5) {
                        Q26 = new yd(0, dj5, dj5.class, "dialSyncAmigos", "dialSyncAmigos()V", 0, 0, 25);
                        yt211.o0(Q26);
                    }
                    sr2 sr29 = (sr2) ((zq3) Q26);
                    boolean i32 = yt211.i(dj5);
                    Object Q27 = yt211.Q();
                    if (i32 || Q27 == obj5) {
                        Q27 = new yd(0, dj5, dj5.class, "dialActivarTarifa", "dialActivarTarifa()V", 0, 0, 26);
                        yt211.o0(Q27);
                    }
                    sr2 sr210 = (sr2) ((zq3) Q27);
                    boolean i33 = yt211.i(dj5);
                    Object Q28 = yt211.Q();
                    if (i33 || Q28 == obj5) {
                        yd ydVar = new yd(0, dj5, dj5.class, "dialDesactivarTarifa", "dialDesactivarTarifa()V", 0, 0, 27);
                        yt211.o0(ydVar);
                        Q28 = ydVar;
                    }
                    vr2 vr210 = vr23;
                    sr2 sr211 = sr26;
                    vr2 vr211 = vr24;
                    yi5.m(oi5, vr210, sr211, vr211, vr25, sr27, sr28, vr26, vr27, vr28, vr29, sr29, sr210, (sr2) ((zq3) Q28), yt211, intValue8 & 14);
                } else {
                    yt211.Y();
                }
                return vs7;
            case 10:
                bd5 bd5 = (bd5) obj6;
                List list = (List) obj4;
                yt2 yt212 = (yt2) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                list.getClass();
                if ((intValue9 & 6) == 0) {
                    if ((intValue9 & 8) == 0) {
                        z11 = yt212.g(list);
                    } else {
                        z11 = yt212.i(list);
                    }
                    if (z11) {
                        i5 = 4;
                    } else {
                        i5 = 2;
                    }
                    intValue9 |= i5;
                }
                if ((intValue9 & 19) != 18) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (yt212.V(intValue9 & 1, z10)) {
                    d63.Q.j(new zx0(new xa7(0, (Object) (wa7) list.get(bd5.d()))), 3.0f, xz5.w(), yt212, 3120, 0);
                } else {
                    yt212.Y();
                }
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                mi0 mi0 = (mi0) obj6;
                yt2 yt213 = (yt2) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((bu0) obj4).getClass();
                if ((intValue10 & 17) != 16) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (yt213.V(intValue10 & 1, z12)) {
                    ml4 L2 = x91.L(jl4, 14.0f, 12.0f);
                    ea6 a5 = ca6.a(rrVar, xb4.I, yt213, 48);
                    int hashCode3 = Long.hashCode(yt213.T);
                    vf5 m3 = yt213.m();
                    ml4 E3 = gw8.E(yt213, L2);
                    ux0.d.getClass();
                    vy0 vy02 = tx0.b;
                    yt213.i0();
                    if (yt213.S) {
                        yt213.l(vy02);
                    } else {
                        yt213.r0();
                    }
                    ck ckVar5 = tx0.f;
                    g75.Q(ckVar5, yt213, a5);
                    ck ckVar6 = tx0.e;
                    g75.Q(ckVar6, yt213, m3);
                    Integer valueOf3 = Integer.valueOf(hashCode3);
                    ck ckVar7 = tx0.g;
                    g75.Q(ckVar7, yt213, valueOf3);
                    ce ceVar2 = tx0.h;
                    g75.O(yt213, ceVar2);
                    ck ckVar8 = tx0.d;
                    g75.Q(ckVar8, yt213, E3);
                    yt2 yt214 = yt213;
                    d36.a(mi0.f, mi0.g, mi0.h, mi0.i, yt214, 0);
                    yt2 yt215 = yt214;
                    k75.a(yt215, yu6.p(jl4, 13.0f));
                    lz3 lz3 = new lz3(1.0f, true);
                    au0 a6 = zt0.a(srVar, xb4.K, yt215, 0);
                    int hashCode4 = Long.hashCode(yt215.T);
                    vf5 m4 = yt215.m();
                    ml4 E4 = gw8.E(yt215, lz3);
                    yt215.i0();
                    if (yt215.S) {
                        yt215.l(vy02);
                    } else {
                        yt215.r0();
                    }
                    g75.Q(ckVar5, yt215, a6);
                    g75.Q(ckVar6, yt215, m4);
                    f21.s(hashCode4, yt215, ckVar7, yt215, ceVar2);
                    g75.Q(ckVar8, yt215, E4);
                    yt2 yt216 = yt215;
                    yf7.b(mi0.a, (ml4) null, x08.e(), ya5.k(15), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 2, false, 1, 0, (tg7) null, yt216, 1597440, 24960, 241578);
                    yf7.b(mi0.c, (ml4) null, x08.a(), ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt216, 24576, 0, 262122);
                    yt2 yt217 = yt216;
                    yt217.r(true);
                    au0 a7 = zt0.a(srVar, xb4.M, yt217, 48);
                    int hashCode5 = Long.hashCode(yt217.T);
                    vf5 m5 = yt217.m();
                    ml4 E5 = gw8.E(yt217, jl4);
                    yt217.i0();
                    if (yt217.S) {
                        yt217.l(vy02);
                    } else {
                        yt217.r0();
                    }
                    g75.Q(ckVar5, yt217, a7);
                    g75.Q(ckVar6, yt217, m5);
                    f21.s(hashCode5, yt217, ckVar7, yt217, ceVar2);
                    g75.Q(ckVar8, yt217, E5);
                    yf7.b(mi0.d, (ml4) null, x08.a(), ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt217, 24576, 0, 262122);
                    yt217.r(true);
                    k75.a(yt217, yu6.p(jl4, 8.0f));
                    d36.c(mi0.e, yt217, 0);
                    yt217.r(true);
                } else {
                    yt213.Y();
                }
                return vs7;
            case 12:
                yv6 yv6 = (yv6) obj6;
                yt2 yt218 = (yt2) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((bu0) obj4).getClass();
                if ((intValue11 & 17) != 16) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (yt218.V(intValue11 & 1, z13)) {
                    ml4 L3 = x91.L(jl4, 14.0f, 12.0f);
                    ea6 a8 = ca6.a(rrVar, xb4.I, yt218, 48);
                    int hashCode6 = Long.hashCode(yt218.T);
                    vf5 m6 = yt218.m();
                    ml4 E6 = gw8.E(yt218, L3);
                    ux0.d.getClass();
                    vy0 vy03 = tx0.b;
                    yt218.i0();
                    if (yt218.S) {
                        yt218.l(vy03);
                    } else {
                        yt218.r0();
                    }
                    ck ckVar9 = tx0.f;
                    g75.Q(ckVar9, yt218, a8);
                    ck ckVar10 = tx0.e;
                    g75.Q(ckVar10, yt218, m6);
                    Integer valueOf4 = Integer.valueOf(hashCode6);
                    ck ckVar11 = tx0.g;
                    g75.Q(ckVar11, yt218, valueOf4);
                    ce ceVar3 = tx0.h;
                    g75.O(yt218, ceVar3);
                    ck ckVar12 = tx0.d;
                    g75.Q(ckVar12, yt218, E6);
                    yt2 yt219 = yt218;
                    d36.a(yv6.e, yv6.f, yv6.g, yv6.h, yt219, 0);
                    yt2 yt220 = yt219;
                    k75.a(yt220, yu6.p(jl4, 13.0f));
                    lz3 lz32 = new lz3(1.0f, true);
                    au0 a9 = zt0.a(srVar, xb4.K, yt220, 0);
                    int hashCode7 = Long.hashCode(yt220.T);
                    vf5 m7 = yt220.m();
                    ml4 E7 = gw8.E(yt220, lz32);
                    yt220.i0();
                    if (yt220.S) {
                        yt220.l(vy03);
                    } else {
                        yt220.r0();
                    }
                    g75.Q(ckVar9, yt220, a9);
                    g75.Q(ckVar10, yt220, m7);
                    f21.s(hashCode7, yt220, ckVar11, yt220, ceVar3);
                    g75.Q(ckVar12, yt220, E7);
                    yt2 yt221 = yt220;
                    yf7.b(yv6.a, (ml4) null, x08.e(), ya5.k(15), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 2, false, 1, 0, (tg7) null, yt221, 1597440, 24960, 241578);
                    yf7.b(yv6.c, (ml4) null, x08.a(), ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt221, 24576, 0, 262122);
                    yt2 yt222 = yt221;
                    yt222.r(true);
                    d36.k(yv6.d, yt222, 0);
                    yt222.r(true);
                } else {
                    yt218.Y();
                }
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                hi1 hi1 = (hi1) obj6;
                yt2 yt223 = (yt2) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((bu0) obj4).getClass();
                if ((intValue12 & 17) != 16) {
                    z14 = true;
                }
                if (yt223.V(intValue12 & 1, z14)) {
                    gi1.b(hi1, (ml4) null, (rg1) null, (ig1) null, (gs2) null, (gs2) null, false, (ok2) null, yt223, 0);
                } else {
                    yt223.Y();
                }
                return vs7;
            case 14:
                return a(obj, obj2, obj3);
            case h75.g:
                return e(obj, obj2, obj3);
            case 16:
                return f(obj, obj2, obj3);
            case 17:
                Throwable th2 = (Throwable) obj4;
                vs7 vs73 = (vs7) obj2;
                e81 e812 = (e81) obj3;
                ((sk6) obj6).d();
                return vs7;
            case 18:
                return k(obj, obj2, obj3);
            case 19:
                return l(obj, obj2, obj3);
            default:
                ze7 ze73 = (ze7) obj6;
                ml4 ml4 = (ml4) obj4;
                yt2 yt224 = (yt2) obj2;
                ((Integer) obj3).getClass();
                yt224.e0(1980580247);
                tp1 tp1 = (tp1) yt224.k(xy0.h);
                Object Q29 = yt224.Q();
                if (Q29 == obj5) {
                    Q29 = u55.p(new we3(0));
                    yt224.o0(Q29);
                }
                aq4 aq42 = (aq4) Q29;
                boolean i34 = yt224.i(ze73);
                Object Q30 = yt224.Q();
                if (i34 || Q30 == obj5) {
                    Q30 = new n17(3, (Object) ze73, (Object) aq42);
                    yt224.o0(Q30);
                }
                sr2 sr212 = (sr2) Q30;
                boolean g2 = yt224.g(tp1);
                Object Q31 = yt224.Q();
                if (g2 || Q31 == obj5) {
                    Q31 = new cf7(0, tp1, aq42);
                    yt224.o0(Q31);
                }
                ll llVar = xj6.a;
                ml4 p2 = gw8.p(ml4, new gc5(20, (Object) sr212, (Object) (vr2) Q31));
                yt224.r(false);
                return p2;
        }
    }

    public /* synthetic */ xa7(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }
}
