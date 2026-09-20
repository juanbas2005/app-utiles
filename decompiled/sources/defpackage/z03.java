package defpackage;

import cu.lestebang.utiletecsa.R;
import java.util.List;

/* renamed from: z03  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class z03 implements gs2 {
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ List x;
    public final /* synthetic */ vr2 y;

    public /* synthetic */ z03(List list, vr2 vr2) {
        this.x = list;
        this.y = vr2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        int i = this.w;
        vs7 vs7 = vs7.a;
        vr2 vr2 = this.y;
        List<yb5> list = this.x;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                g80 g80 = xb4.K;
                int i2 = 2;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!yt2.V(intValue & 1, z)) {
                    yt2.Y();
                } else if (list.isEmpty()) {
                    yt2.e0(1239042239);
                    yt2 yt22 = yt2;
                    yf7.b(l55.u(R.string.asterisco_99_history_empty, yt2), (ml4) null, z08.e(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 24576, 0, 262122);
                    yt22.r(false);
                } else {
                    boolean z2 = false;
                    yt2.e0(1239290332);
                    au0 a = zt0.a(new ur(4.0f, true, new h(2)), g80, yt2, 6);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    jl4 jl4 = jl4.w;
                    ml4 E = gw8.E(yt2, jl4);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(tx0.f, yt2, a);
                    g75.Q(tx0.e, yt2, m);
                    g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
                    g75.O(yt2, tx0.h);
                    g75.Q(tx0.d, yt2, E);
                    yt2.e0(171676471);
                    for (yb5 yb5 : list) {
                        String str = (String) yb5.w;
                        String str2 = (String) yb5.x;
                        ml4 f = we.f(yu6.a, q96.a(10.0f));
                        boolean g = yt2.g(vr2) | yt2.g(str2);
                        Object Q = yt2.Q();
                        if (g || Q == ay0.a) {
                            Q = new r20(vr2, str2, i2);
                            yt2.o0(Q);
                        }
                        ml4 L = x91.L(h49.u(f, z2, (String) null, (sr2) Q, 15), 8.0f, 10.0f);
                        ea6 a2 = ca6.a(new ur(10.0f, true, new h(i2)), xb4.I, yt2, 54);
                        int hashCode2 = Long.hashCode(yt2.T);
                        vf5 m2 = yt2.m();
                        ml4 E2 = gw8.E(yt2, L);
                        ux0.d.getClass();
                        vy0 vy02 = tx0.b;
                        yt2.i0();
                        if (yt2.S) {
                            yt2.l(vy02);
                        } else {
                            yt2.r0();
                        }
                        ck ckVar = tx0.f;
                        g75.Q(ckVar, yt2, a2);
                        ck ckVar2 = tx0.e;
                        g75.Q(ckVar2, yt2, m2);
                        Integer valueOf = Integer.valueOf(hashCode2);
                        ck ckVar3 = tx0.g;
                        g75.Q(ckVar3, yt2, valueOf);
                        ce ceVar = tx0.h;
                        g75.O(yt2, ceVar);
                        ck ckVar4 = tx0.d;
                        g75.Q(ckVar4, yt2, E2);
                        String str3 = str2;
                        ce ceVar2 = ceVar;
                        ck ckVar5 = ckVar2;
                        ck ckVar6 = ckVar3;
                        ce ceVar3 = ceVar2;
                        vy0 vy03 = vy02;
                        ck ckVar7 = ckVar;
                        String str4 = str3;
                        d83.a(z65.C(), (String) null, yu6.l(jl4, 20.0f), z08.b(), yt2, 432, 0);
                        lz3 lz3 = new lz3(1.0f, true);
                        au0 a3 = zt0.a(wr.c, g80, yt2, 0);
                        int hashCode3 = Long.hashCode(yt2.T);
                        vf5 m3 = yt2.m();
                        ml4 E3 = gw8.E(yt2, lz3);
                        yt2.i0();
                        if (yt2.S) {
                            yt2.l(vy03);
                        } else {
                            yt2.r0();
                        }
                        g75.Q(ckVar7, yt2, a3);
                        g75.Q(ckVar5, yt2, m3);
                        f21.s(hashCode3, yt2, ckVar6, yt2, ceVar3);
                        g75.Q(ckVar4, yt2, E3);
                        yt2 yt23 = yt2;
                        String str5 = str;
                        g80 g802 = g80;
                        jl4 jl42 = jl4;
                        yf7.b(str5, (ml4) null, z08.k(), ya5.k(14), am2.z, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 1597440, 0, 262058);
                        yt2 = yt23;
                        if (!sg3.e(str5, str4)) {
                            yt2.e0(285765147);
                            yt2 yt24 = yt2;
                            yf7.b(str4, (ml4) null, z08.e(), ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, 24576, 0, 262122);
                            yt2 = yt24;
                            z2 = false;
                            yt2.r(false);
                        } else {
                            z2 = false;
                            yt2.e0(286041915);
                            yt2.r(false);
                        }
                        yt2.r(true);
                        yt2.r(true);
                        g80 = g802;
                        i2 = 2;
                        jl4 = jl42;
                    }
                    yt2.r(z2);
                    yt2.r(true);
                    yt2.r(z2);
                }
                return vs7;
            default:
                ((Integer) obj2).getClass();
                em6.c(list, vr2, (yt2) obj, b85.v(1));
                return vs7;
        }
    }

    public /* synthetic */ z03(List list, vr2 vr2, int i) {
        this.x = list;
        this.y = vr2;
    }
}
