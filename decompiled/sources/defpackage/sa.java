package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: sa  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class sa implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ gs2 x;

    public /* synthetic */ sa(int i, gs2 gs2) {
        this.w = i;
        this.x = gs2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        float f;
        boolean z2;
        boolean z3;
        boolean z4;
        re6 re6;
        boolean z5;
        yt2 yt2;
        boolean z6;
        Object obj3 = obj2;
        int i = this.w;
        jl4 jl4 = jl4.w;
        float f2 = 1.0f;
        vs7 vs7 = null;
        vs7 vs72 = vs7.a;
        int i2 = 0;
        gs2 gs2 = this.x;
        switch (i) {
            case b85.b:
                yt2 yt22 = (yt2) obj;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt22.V(intValue & 1, z)) {
                    lz3 lz3 = new lz3(1.0f, false);
                    if (((Boolean) rm5.a.getValue()).booleanValue()) {
                        f = 16.0f;
                    } else {
                        f = 24.0f;
                    }
                    ml4 d = x91.J(lz3, x91.g(0.0f, 0.0f, 0.0f, f, 7)).d(new f23(xb4.K));
                    lh4 d2 = mb0.d(xb4.y, false);
                    int hashCode = Long.hashCode(yt22.T);
                    vf5 m = yt22.m();
                    ml4 E = gw8.E(yt22, d);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt22.i0();
                    if (yt22.S) {
                        yt22.l(vy0);
                    } else {
                        yt22.r0();
                    }
                    g75.Q(tx0.f, yt22, d2);
                    g75.Q(tx0.e, yt22, m);
                    g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
                    g75.O(yt22, tx0.h);
                    g75.Q(tx0.d, yt22, E);
                    gs2.H(yt22, 0);
                    yt22.r(true);
                } else {
                    yt22.Y();
                }
                return vs72;
            case 1:
                yt2 yt23 = (yt2) obj;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt23.V(intValue2 & 1, z2)) {
                    ml4 d3 = x91.J(jl4, eb.a).d(new f23(xb4.L));
                    lh4 d4 = mb0.d(xb4.y, false);
                    int hashCode2 = Long.hashCode(yt23.T);
                    vf5 m2 = yt23.m();
                    ml4 E2 = gw8.E(yt23, d3);
                    ux0.d.getClass();
                    vy0 vy02 = tx0.b;
                    yt23.i0();
                    if (yt23.S) {
                        yt23.l(vy02);
                    } else {
                        yt23.r0();
                    }
                    g75.Q(tx0.f, yt23, d4);
                    g75.Q(tx0.e, yt23, m2);
                    g75.Q(tx0.g, yt23, Integer.valueOf(hashCode2));
                    g75.O(yt23, tx0.h);
                    g75.Q(tx0.d, yt23, E2);
                    gs2.H(yt23, 0);
                    yt23.r(true);
                } else {
                    yt23.Y();
                }
                return vs72;
            case 2:
                yt2 yt24 = (yt2) obj;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt24.V(intValue3 & 1, z3)) {
                    lh4 d5 = mb0.d(xb4.E, false);
                    int hashCode3 = Long.hashCode(yt24.T);
                    vf5 m3 = yt24.m();
                    ml4 E3 = gw8.E(yt24, jl4);
                    ux0.d.getClass();
                    vy0 vy03 = tx0.b;
                    yt24.i0();
                    if (yt24.S) {
                        yt24.l(vy03);
                    } else {
                        yt24.r0();
                    }
                    g75.Q(tx0.f, yt24, d5);
                    g75.Q(tx0.e, yt24, m3);
                    g75.Q(tx0.g, yt24, Integer.valueOf(hashCode3));
                    g75.O(yt24, tx0.h);
                    g75.Q(tx0.d, yt24, E3);
                    gs2.H(yt24, 0);
                    yt24.r(true);
                } else {
                    yt24.Y();
                }
                return vs72;
            case 3:
                yt2 yt25 = (yt2) obj;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (yt25.V(intValue4 & 1, z4)) {
                    if (((double) 1.0f) <= 0.0d) {
                        wb3.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    }
                    lz3 lz32 = new lz3(f2, true);
                    lh4 d6 = mb0.d(xb4.y, false);
                    int hashCode4 = Long.hashCode(yt25.T);
                    vf5 m4 = yt25.m();
                    ml4 E4 = gw8.E(yt25, lz32);
                    ux0.d.getClass();
                    vy0 vy04 = tx0.b;
                    yt25.i0();
                    if (yt25.S) {
                        yt25.l(vy04);
                    } else {
                        yt25.r0();
                    }
                    g75.Q(tx0.f, yt25, d6);
                    g75.Q(tx0.e, yt25, m4);
                    g75.Q(tx0.g, yt25, Integer.valueOf(hashCode4));
                    g75.O(yt25, tx0.h);
                    g75.Q(tx0.d, yt25, E4);
                    gs2.H(yt25, 0);
                    yt25.r(true);
                } else {
                    yt25.Y();
                }
                return vs72;
            case 4:
                ne6 ne6 = (ne6) obj;
                List list = (List) gs2.H(ne6, obj3);
                int size = list.size();
                while (i2 < size) {
                    Object obj4 = list.get(i2);
                    if (obj4 == null || (re6 = ne6.x) == null || re6.c(obj4)) {
                        i2++;
                    } else {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj4).toString());
                    }
                }
                if (!list.isEmpty()) {
                    return new ArrayList(list);
                }
                return null;
            case 5:
                yt2 yt26 = (yt2) obj;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (yt26.V(intValue5 & 1, z5)) {
                    if (gs2 == null) {
                        yt26.e0(-1784929923);
                        yt26.r(false);
                    } else {
                        yt26.e0(635158276);
                        gs2.H(yt26, 0);
                        yt26.r(false);
                        vs7 = vs72;
                    }
                    if (vs7 == null) {
                        yt26.e0(635158660);
                        yt2 yt27 = yt26;
                        yf7.b("", (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt27, 6, 0, 262142);
                        yt2 = yt27;
                    } else {
                        yt2 = yt26;
                        yt2.e0(635158071);
                    }
                    yt2.r(false);
                } else {
                    yt26.Y();
                }
                return vs72;
            default:
                yt2 yt28 = (yt2) obj;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (yt28.V(intValue6 & 1, z6)) {
                    yf7.a(tg7.a(dr7.a(jo5.d, yt28), 0, 0, (am2) null, (ea7) null, 0, 0, (dk5) null, (m64) null, 16744447), gs2, yt28, 0);
                } else {
                    yt28.Y();
                }
                return vs72;
        }
    }
}
