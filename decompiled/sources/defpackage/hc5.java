package defpackage;

import java.util.List;

/* renamed from: hc5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hc5 implements is2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ List x;
    public final /* synthetic */ vr2 y;

    public /* synthetic */ hc5(List list, vr2 vr2, int i) {
        this.w = i;
        this.x = list;
        this.y = vr2;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3 = this.w;
        vs7 vs7 = vs7.a;
        List list = this.x;
        int i4 = 16;
        int i5 = 2;
        vr2 vr2 = this.y;
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
                    yt2.e0(-754352794);
                    fd1.j((bc5) list.get(intValue), vr2, yt2, 0);
                    k75.a(yt2, yu6.d(jl4.w, 10.0f));
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
                    cm6 cm6 = (cm6) list.get(intValue3);
                    yt22.e0(-412755793);
                    String str = cm6.a;
                    String str2 = cm6.b;
                    bm6 bm6 = (bm6) em6.b.get(str);
                    if (bm6 == null) {
                        bm6 = em6.a;
                    }
                    bm6 bm62 = bm6;
                    boolean g = yt22.g(vr2) | yt22.g(cm6);
                    Object Q = yt22.Q();
                    if (g || Q == ay0.a) {
                        Q = new p3(vr2, false, cm6, 26);
                        yt22.o0(Q);
                    }
                    yt2 yt23 = yt22;
                    em6.a(str, str2, bm62, (sr2) Q, yt23, 0);
                    yt23.r(false);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }
}
