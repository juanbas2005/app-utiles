package defpackage;

import java.util.List;

/* renamed from: p17  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p17 implements is2 {
    public final /* synthetic */ List w;
    public final /* synthetic */ e17 x;
    public final /* synthetic */ gs2 y;
    public final /* synthetic */ aq4 z;

    public p17(List list, e17 e17, gs2 gs2, aq4 aq4) {
        this.w = list;
        this.x = e17;
        this.y = gs2;
        this.z = aq4;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        r04 r04 = (r04) obj;
        int intValue = ((Number) obj2).intValue();
        yt2 yt2 = (yt2) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (yt2.g(r04)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (yt2.e(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i & 1, z2)) {
            o11 o11 = (o11) this.w.get(intValue);
            yt2.e0(1522569495);
            if (o11.n || this.x.e) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean i4 = yt2.i(o11);
            Object Q = yt2.Q();
            if (i4 || Q == ay0.a) {
                Q = new p3(o11, false, this.z, 27);
                yt2.o0(Q);
            }
            q17.b(o11, z3, this.y, (sr2) Q, yt2, 0);
            yt2.r(false);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
