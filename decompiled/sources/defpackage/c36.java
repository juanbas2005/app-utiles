package defpackage;

import java.util.List;

/* renamed from: c36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c36 implements is2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ List x;
    public final /* synthetic */ xa7 y;

    public /* synthetic */ c36(List list, xa7 xa7, int i) {
        this.w = i;
        this.x = list;
        this.y = xa7;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3 = this.w;
        vs7 vs7 = vs7.a;
        d63 d63 = ay0.a;
        List list = this.x;
        int i4 = 16;
        int i5 = 2;
        xa7 xa7 = this.y;
        switch (i3) {
            case b85.b:
                r04 r04 = (r04) obj;
                int intValue = ((Number) obj2).intValue();
                yt2 yt2 = (yt2) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (yt2.g(r04)) {
                        i5 = 4;
                    }
                    i = intValue2 | i5;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (yt2.e(intValue)) {
                        i4 = 32;
                    }
                    i |= i4;
                }
                if ((i & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(i & 1, z)) {
                    mi0 mi0 = (mi0) list.get(intValue);
                    yt2.e0(1575484420);
                    boolean g = yt2.g(xa7) | yt2.g(mi0);
                    Object Q = yt2.Q();
                    if (g || Q == d63) {
                        Q = new p3(xa7, false, mi0, 24);
                        yt2.o0(Q);
                    }
                    d36.b(mi0, (sr2) Q, yt2, 0);
                    yt2.r(false);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                r04 r042 = (r04) obj;
                int intValue3 = ((Number) obj2).intValue();
                yt2 yt22 = (yt2) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (yt22.g(r042)) {
                        i5 = 4;
                    }
                    i2 = intValue4 | i5;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (yt22.e(intValue3)) {
                        i4 = 32;
                    }
                    i2 |= i4;
                }
                if ((i2 & 147) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt22.V(i2 & 1, z2)) {
                    yv6 yv6 = (yv6) list.get(intValue3);
                    yt22.e0(-1305939610);
                    boolean g2 = yt22.g(xa7) | yt22.g(yv6);
                    Object Q2 = yt22.Q();
                    if (g2 || Q2 == d63) {
                        Q2 = new p3(xa7, false, yv6, 25);
                        yt22.o0(Q2);
                    }
                    d36.j(yv6, (sr2) Q2, yt22, 0);
                    yt22.r(false);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }
}
