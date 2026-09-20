package defpackage;

/* renamed from: on  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class on implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ hs2 x;

    public /* synthetic */ on(hs2 hs2, int i) {
        this.w = i;
        this.x = hs2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        int i = this.w;
        vs7 vs7 = vs7.a;
        boolean z2 = false;
        ga6 ga6 = ga6.a;
        hs2 hs2 = this.x;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case b85.b:
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (yt2.V(intValue & 1, z2)) {
                    ea6 a = ca6.a(wr.b, xb4.I, yt2, 54);
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
                    hs2.u(ga6, yt2, 6);
                    yt2.r(true);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    hs2.u(ga6, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
        }
    }
}
