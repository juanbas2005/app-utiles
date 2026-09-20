package defpackage;

import cu.lestebang.utiletecsa.R;
import java.util.List;

/* renamed from: ro2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ro2 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ro2(String str, ml4 ml4, boolean z2, boolean z3, sr2 sr2, String str2, ig1 ig1, int i) {
        this.z = str;
        this.A = ml4;
        this.x = z2;
        this.y = z3;
        this.B = sr2;
        this.C = str2;
        this.D = ig1;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        ck ckVar;
        vy0 vy0;
        ck ckVar2;
        jl4 jl4;
        ce ceVar;
        ck ckVar3;
        boolean z3;
        yt2 yt2;
        yt2 yt22;
        aq4 aq4;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.B;
        Object obj6 = this.A;
        Object obj7 = this.z;
        switch (i) {
            case b85.b:
                List list = (List) obj7;
                gs2 gs2 = (gs2) obj6;
                aq4 aq42 = (aq4) obj5;
                vr2 vr2 = (vr2) obj3;
                aq4 aq43 = (aq4) obj4;
                yt2 yt23 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt23.V(intValue & 1, z2)) {
                    au0 a = zt0.a(wr.c, xb4.K, yt23, 0);
                    int hashCode = Long.hashCode(yt23.T);
                    vf5 m = yt23.m();
                    jl4 jl42 = jl4.w;
                    ml4 E = gw8.E(yt23, jl42);
                    ux0.d.getClass();
                    vy0 vy02 = tx0.b;
                    yt23.i0();
                    if (yt23.S) {
                        yt23.l(vy02);
                    } else {
                        yt23.r0();
                    }
                    ck ckVar4 = tx0.f;
                    g75.Q(ckVar4, yt23, a);
                    ck ckVar5 = tx0.e;
                    g75.Q(ckVar5, yt23, m);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ck ckVar6 = tx0.g;
                    g75.Q(ckVar6, yt23, valueOf);
                    ce ceVar2 = tx0.h;
                    g75.O(yt23, ceVar2);
                    ck ckVar7 = tx0.d;
                    g75.Q(ckVar7, yt23, E);
                    vs7 vs72 = vs7;
                    vr2 vr22 = vr2;
                    ml4 f = yu6.f(jl42, 0.0f, 320.0f, 1);
                    lh4 d = mb0.d(xb4.y, false);
                    ck ckVar8 = ckVar7;
                    int hashCode2 = Long.hashCode(yt23.T);
                    vf5 m2 = yt23.m();
                    ml4 E2 = gw8.E(yt23, f);
                    yt23.i0();
                    aq4 aq44 = aq43;
                    if (yt23.S) {
                        yt23.l(vy02);
                    } else {
                        yt23.r0();
                    }
                    g75.Q(ckVar4, yt23, d);
                    g75.Q(ckVar5, yt23, m2);
                    f21.s(hashCode2, yt23, ckVar6, yt23, ceVar2);
                    ck ckVar9 = ckVar8;
                    g75.Q(ckVar9, yt23, E2);
                    boolean z4 = this.y;
                    Object obj8 = ay0.a;
                    if (z4) {
                        yt23.e0(238470957);
                        vy0 = vy02;
                        ckVar3 = ckVar6;
                        ce ceVar3 = ceVar2;
                        ckVar2 = ckVar4;
                        ceVar = ceVar3;
                        ckVar = ckVar9;
                        jl4 = jl42;
                        yt2 yt24 = yt23;
                        z3 = false;
                        rq5.a(yu6.l(qb0.a.a(jl42, xb4.C), 32.0f), 0, 0.0f, 0, 0, 0.0f, yt24, 0, 62);
                        yt2 = yt24;
                        yt2.r(false);
                    } else {
                        ckVar = ckVar9;
                        vy0 = vy02;
                        ckVar2 = ckVar4;
                        jl4 = jl42;
                        ce ceVar4 = ceVar2;
                        ck ckVar10 = ckVar6;
                        if (list.isEmpty()) {
                            yt23.e0(-1197084815);
                            yt2 yt25 = yt23;
                            z3 = false;
                            ceVar = ceVar4;
                            ckVar3 = ckVar10;
                            yf7.b(l55.u(R.string.forum_no_comments, yt23), x91.M(jl4, 0.0f, 16.0f, 1), r16.L(), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt25, 24624, 0, 262120);
                            yt2 = yt25;
                            yt2.r(false);
                        } else {
                            yt23.e0(-1196772738);
                            ur urVar = new ur(8.0f, true, new h(2));
                            ck ckVar11 = ckVar10;
                            sd2 sd2 = yu6.a;
                            boolean i2 = yt23.i(list) | yt23.g(gs2);
                            Object Q = yt23.Q();
                            if (i2 || Q == obj8) {
                                Q = new g5((Object) list, (Object) gs2, (Object) aq42, 15);
                                yt23.o0(Q);
                            }
                            ceVar = ceVar4;
                            ckVar3 = ckVar11;
                            z3 = false;
                            yt2 yt26 = yt23;
                            x91.a(sd2, (s34) null, (la5) null, urVar, (ib) null, (eh2) null, false, (xf) null, (vr2) Q, yt26, 24582, 494);
                            yt2 = yt26;
                            yt2.r(false);
                        }
                    }
                    yt2.r(true);
                    k75.a(yt2, yu6.d(jl4, 10.0f));
                    if (this.x) {
                        yt2.e0(-960337652);
                        ea6 a2 = ca6.a(wr.a, xb4.I, yt2, 48);
                        int hashCode3 = Long.hashCode(yt2.T);
                        vf5 m3 = yt2.m();
                        ml4 E3 = gw8.E(yt2, jl4);
                        yt2.i0();
                        if (yt2.S) {
                            yt2.l(vy0);
                        } else {
                            yt2.r0();
                        }
                        g75.Q(ckVar2, yt2, a2);
                        g75.Q(ckVar5, yt2, m3);
                        f21.s(hashCode3, yt2, ckVar3, yt2, ceVar);
                        g75.Q(ckVar, yt2, E3);
                        String str = (String) aq44.getValue();
                        o96 a3 = q96.a(13.0f);
                        yt2 yt27 = yt2;
                        yt2 yt28 = yt27;
                        yd7 t = pe2.t(0, 0, r16.N(), r16.N(), 0, r16.K(), r16.O(), 0, 0, yt28, 2147477455);
                        yt2 yt29 = yt28;
                        ml4 d2 = yu6.d(new lz3(1.0f, true), 80.0f);
                        Object Q2 = yt29.Q();
                        if (Q2 == obj8) {
                            aq4 = aq44;
                            Q2 = new xi(aq4, 9);
                            yt29.o0(Q2);
                        } else {
                            aq4 = aq44;
                        }
                        yt2 yt210 = yt29;
                        z85.b(str, (vr2) Q2, d2, false, false, (tg7) null, (gs2) null, ie1.y, (gs2) null, (gs2) null, (gs2) null, false, (m78) null, (bt3) null, (zs3) null, false, 0, 0, a3, t, yt210, 12582960, 12582912, 0, 1965944);
                        yt22 = yt210;
                        vr2 vr23 = vr22;
                        boolean g = yt22.g(vr23);
                        Object Q3 = yt22.Q();
                        if (g || Q3 == obj8) {
                            Q3 = new yo2(vr23, aq4, z3 ? 1 : 0);
                            yt22.o0(Q3);
                        }
                        hj8.e((sr2) Q3, (ml4) null, !d57.I0((String) aq4.getValue()), (a83) null, (pq6) null, su0.J(-2110774599, new ns4(aq4, 4), yt22), yt22, 1572864, 58);
                        yt22.r(true);
                        yt22.r(z3);
                    } else {
                        yt2.e0(-958393053);
                        yt2 yt211 = yt2;
                        yf7.b(l55.u(R.string.forum_sign_in_to_comment, yt2), (ml4) null, r16.L(), ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt211, 24576, 0, 262122);
                        yt22 = yt211;
                        yt22.r(z3);
                    }
                    yt22.r(true);
                    return vs72;
                }
                vs7 vs73 = vs7;
                yt23.Y();
                return vs73;
            default:
                ((Integer) obj2).getClass();
                gi1.m((String) obj7, (ml4) obj6, this.x, this.y, (sr2) obj5, (String) obj4, (ig1) obj3, (yt2) obj, b85.v(1));
                return vs7;
        }
    }

    public /* synthetic */ ro2(boolean z2, boolean z3, List list, gs2 gs2, aq4 aq4, vr2 vr2, aq4 aq42) {
        this.x = z2;
        this.y = z3;
        this.z = list;
        this.A = gs2;
        this.B = aq4;
        this.D = vr2;
        this.C = aq42;
    }
}
