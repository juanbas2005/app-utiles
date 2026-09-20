package defpackage;

/* renamed from: de7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class de7 implements hs2 {
    public final /* synthetic */ long w;
    public final /* synthetic */ tg7 x;
    public final /* synthetic */ gs2 y;

    public /* synthetic */ de7(long j, tg7 tg7, gs2 gs2) {
        this.w = j;
        this.x = tg7;
        this.y = gs2;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        ml4 ml4 = (ml4) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (yt2.g(ml4)) {
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
            lh4 d = mb0.d(xb4.y, false);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, ml4);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, d);
            g75.Q(tx0.e, yt2, m);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            g75.d(this.w, this.x, this.y, yt2, 0);
            yt2.r(true);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
