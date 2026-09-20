package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aa9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class aa9 implements is2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ List x;
    public final /* synthetic */ ds2 y;
    public final /* synthetic */ Object z;

    public /* synthetic */ aa9(List list, ds2 ds2, Object obj, int i) {
        this.w = i;
        this.x = list;
        this.y = ds2;
        this.z = obj;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        int i3 = this.w;
        vs7 vs7 = vs7.a;
        Object obj5 = this.z;
        List list = this.x;
        int i4 = 16;
        int i5 = 2;
        ds2 ds2 = this.y;
        d63 d63 = ay0.a;
        switch (i3) {
            case b85.b /*0*/:
                r04 r04 = (r04) obj;
                int intValue = ((Number) obj2).intValue();
                yt2 yt2 = (yt2) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (true == yt2.g(r04)) {
                        i5 = 4;
                    }
                    i = intValue2 | i5;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (true == yt2.e(intValue)) {
                        i4 = 32;
                    }
                    i |= i4;
                }
                if ((i & 147) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(i & 1, z2)) {
                    jb9 jb9 = (jb9) ((ArrayList) list).get(intValue);
                    yt2.e0(663007845);
                    au0 a = zt0.a(wr.c, xb4.K, yt2, 0);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, jl4.w);
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
                    String str = jb9.w;
                    str.getClass();
                    sd2 sd2 = yu6.a;
                    vr2 vr2 = (vr2) ds2;
                    boolean g = yt2.g(vr2);
                    if ((((i & 112) ^ 48) <= 32 || !yt2.e(intValue)) && (i & 48) != 32) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    boolean z5 = z3 | g;
                    Object Q = yt2.Q();
                    if (z5 || Q == d63) {
                        Q = new m61(intValue, 3, vr2);
                        yt2.o0(Q);
                    }
                    yt2 yt22 = yt2;
                    yf7.b(str, x91.K(h49.u(sd2, false, (String) null, bb0.h0((sr2) Q, yt2), 15), 16.0f), 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, ((zg4) yt2.k(ch4.b)).b.j, yt22, 0, 0, 131068);
                    yt2 yt23 = yt22;
                    if (intValue < ((rr8) obj5).a.size() - 1) {
                        yt23.e0(90413708);
                        kl8.c((ml4) null, 0.0f, 0, yt23, 0, 7);
                        yt23.r(false);
                    } else {
                        yt23.e0(90472329);
                        yt23.r(false);
                    }
                    yt23.r(true);
                    yt23.r(false);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                r04 r042 = (r04) obj;
                int intValue3 = ((Number) obj2).intValue();
                yt2 yt24 = (yt2) obj3;
                int intValue4 = ((Number) obj4).intValue();
                gs2 gs2 = (gs2) ds2;
                if ((intValue4 & 6) == 0) {
                    if (yt24.g(r042)) {
                        i5 = 4;
                    }
                    i2 = intValue4 | i5;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (yt24.e(intValue3)) {
                        i4 = 32;
                    }
                    i2 |= i4;
                }
                if ((i2 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (yt24.V(i2 & 1, z4)) {
                    tm2 tm2 = (tm2) list.get(intValue3);
                    yt24.e0(998016529);
                    boolean g2 = yt24.g(gs2) | yt24.i(tm2);
                    Object Q2 = yt24.Q();
                    if (g2 || Q2 == d63) {
                        Q2 = new e3(9, (Object) gs2, (Object) tm2);
                        yt24.o0(Q2);
                    }
                    vr2 vr22 = (vr2) Q2;
                    boolean i6 = yt24.i(tm2);
                    Object Q3 = yt24.Q();
                    if (i6 || Q3 == d63) {
                        Q3 = new p3(tm2, false, (aq4) obj5, 7);
                        yt24.o0(Q3);
                    }
                    r16.d(tm2, vr22, (sr2) Q3, yt24, 0);
                    yt24.r(false);
                } else {
                    yt24.Y();
                }
                return vs7;
        }
    }
}
