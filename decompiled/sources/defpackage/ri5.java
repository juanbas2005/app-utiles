package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: ri5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ri5 implements gs2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ vr2 x;
    public final /* synthetic */ String y;
    public final /* synthetic */ long z;

    public /* synthetic */ ri5(vr2 vr2, ml4 ml4, String str, xw4 xw4, long j, long j2, ix4 ix4, fw0 fw0, int i) {
        this.x = vr2;
        this.C = ml4;
        this.y = str;
        this.D = xw4;
        this.z = j;
        this.A = j2;
        this.E = ix4;
        this.F = fw0;
        this.B = i;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.w;
        vs7 vs7 = vs7.a;
        int i2 = this.B;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.D;
        Object obj6 = this.C;
        switch (i) {
            case b85.b:
                List list = (List) obj6;
                x83 x83 = (x83) obj3;
                String str = (String) obj5;
                vr2 vr2 = (vr2) obj4;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                h80 h80 = xb4.I;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    jl4 jl4 = jl4.w;
                    ml4 K = x91.K(jl4, 16.0f);
                    g80 g80 = xb4.K;
                    sr srVar = wr.c;
                    au0 a = zt0.a(srVar, g80, yt2, 0);
                    g80 g802 = g80;
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E2 = gw8.E(yt2, K);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    vs7 vs72 = vs7;
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    ck ckVar = tx0.f;
                    g75.Q(ckVar, yt2, a);
                    ck ckVar2 = tx0.e;
                    g75.Q(ckVar2, yt2, m);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ck ckVar3 = tx0.g;
                    g75.Q(ckVar3, yt2, valueOf);
                    ce ceVar = tx0.h;
                    g75.O(yt2, ceVar);
                    sr srVar2 = srVar;
                    ck ckVar4 = tx0.d;
                    g75.Q(ckVar4, yt2, E2);
                    rr rrVar = wr.a;
                    String str2 = str;
                    List list2 = list;
                    ea6 a2 = ca6.a(rrVar, h80, yt2, 48);
                    int hashCode2 = Long.hashCode(yt2.T);
                    vf5 m2 = yt2.m();
                    x83 x832 = x83;
                    ml4 E3 = gw8.E(yt2, jl4);
                    yt2.i0();
                    jl4 jl42 = jl4;
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(ckVar, yt2, a2);
                    g75.Q(ckVar2, yt2, m2);
                    f21.s(hashCode2, yt2, ckVar3, yt2, ceVar);
                    g75.Q(ckVar4, yt2, E3);
                    ce ceVar2 = ceVar;
                    ck ckVar5 = ckVar4;
                    ck ckVar6 = ckVar2;
                    ck ckVar7 = ckVar3;
                    jl4 jl43 = jl42;
                    ce ceVar3 = ceVar2;
                    yi5.d(x832, this.z, this.A, 0, yt2, 0);
                    k75.a(yt2, yu6.p(jl43, 15.0f));
                    lz3 lz3 = new lz3(1.0f, true);
                    au0 a3 = zt0.a(srVar2, g802, yt2, 0);
                    int hashCode3 = Long.hashCode(yt2.T);
                    vf5 m3 = yt2.m();
                    ml4 E4 = gw8.E(yt2, lz3);
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(ckVar, yt2, a3);
                    g75.Q(ckVar6, yt2, m3);
                    f21.s(hashCode3, yt2, ckVar7, yt2, ceVar3);
                    g75.Q(ckVar5, yt2, E4);
                    yt2 yt22 = yt2;
                    yf7.b(str2, (ml4) null, v08.d(), ya5.k(16), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 1597440, 0, 262058);
                    yt2 yt23 = yt22;
                    yt23.r(true);
                    yt23.r(true);
                    k75.a(yt23, yu6.d(jl43, 8.0f));
                    yt23.e0(-608861151);
                    Iterator it = list2.iterator();
                    int i3 = 0;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        Object obj7 = ay0.a;
                        if (hasNext) {
                            Object next = it.next();
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                ph5 ph5 = (ph5) next;
                                sd2 sd2 = yu6.a;
                                boolean g = yt23.g(vr2) | yt23.e(i3);
                                Object Q = yt23.Q();
                                if (g || Q == obj7) {
                                    Q = new yh1(i3, 1, vr2);
                                    yt23.o0(Q);
                                }
                                ml4 u = h49.u(sd2, false, (String) null, (sr2) Q, 15);
                                ea6 a4 = ca6.a(rrVar, h80, yt23, 48);
                                int hashCode4 = Long.hashCode(yt23.T);
                                vf5 m4 = yt23.m();
                                ml4 E5 = gw8.E(yt23, u);
                                ux0.d.getClass();
                                vy0 vy02 = tx0.b;
                                yt23.i0();
                                rr rrVar2 = rrVar;
                                if (yt23.S) {
                                    yt23.l(vy02);
                                } else {
                                    yt23.r0();
                                }
                                g75.Q(tx0.f, yt23, a4);
                                g75.Q(tx0.e, yt23, m4);
                                g75.Q(tx0.g, yt23, Integer.valueOf(hashCode4));
                                g75.O(yt23, tx0.h);
                                g75.Q(tx0.d, yt23, E5);
                                if (i3 == i2) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                boolean g2 = yt23.g(vr2) | yt23.e(i3);
                                Object Q2 = yt23.Q();
                                if (g2 || Q2 == obj7) {
                                    Q2 = new yh1(i3, 2, vr2);
                                    yt23.o0(Q2);
                                }
                                u55.a(z4, (sr2) Q2, (ml4) null, false, o55.e(v08.a(), v08.b(), yt23), yt23, 0, 44);
                                yt2 yt24 = yt23;
                                yf7.b(ph5.a, new lz3(1.0f, true), v08.d(), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, 24576, 0, 262120);
                                yf7.b(ph5.b, (ml4) null, v08.d(), ya5.k(14), am2.A, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, 1597440, 0, 262058);
                                yt23 = yt24;
                                yt23.r(true);
                                rrVar = rrVar2;
                                i3 = i4;
                            } else {
                                sg3.Z();
                                throw null;
                            }
                        } else {
                            yt23.r(false);
                            String str3 = this.y;
                            if (str3 != null) {
                                yt23.e0(-1693645085);
                                yt2 yt25 = yt23;
                                yf7.b(str3, x91.O(jl43, 42.0f, 0.0f, 0.0f, 0.0f, 14), v08.b(), ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt25, 24624, 0, 262120);
                                yt23 = yt25;
                                yt23.r(false);
                            } else {
                                yt23.e0(-1693435153);
                                yt23.r(false);
                            }
                            k75.a(yt23, yu6.d(jl43, 12.0f));
                            if (i2 >= 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            vr2 vr22 = this.x;
                            boolean g3 = yt23.g(vr22) | yt23.e(i2);
                            Object Q3 = yt23.Q();
                            if (g3 || Q3 == obj7) {
                                Q3 = new yh1(i2, 3, vr22);
                                yt23.o0(Q3);
                            }
                            yi5.c(z3, (sr2) Q3, yt23, 0);
                            yt23.r(true);
                            return vs72;
                        }
                    }
                } else {
                    vs7 vs73 = vs7;
                    yt2.Y();
                    return vs73;
                }
            default:
                ((Integer) obj2).getClass();
                fx4.e(this.x, (ml4) obj6, this.y, (xw4) obj5, this.z, this.A, (ix4) obj4, (fw0) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
        }
    }

    public /* synthetic */ ri5(List list, String str, int i, vr2 vr2, x83 x83, long j, long j2, String str2, vr2 vr22) {
        this.C = list;
        this.y = str;
        this.B = i;
        this.x = vr2;
        this.F = x83;
        this.z = j;
        this.A = j2;
        this.D = str2;
        this.E = vr22;
    }
}
