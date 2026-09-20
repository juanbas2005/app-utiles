package defpackage;

/* renamed from: db  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class db implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ gs2 x;
    public final /* synthetic */ gs2 y;

    public /* synthetic */ db(gs2 gs2, gs2 gs22) {
        this.w = 0;
        this.x = gs2;
        this.y = gs22;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        g80 g80;
        int i = this.w;
        vs7 vs7 = vs7.a;
        gs2 gs2 = this.y;
        gs2 gs22 = this.x;
        yt2 yt2 = (yt2) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case b85.b:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    ml4 J = x91.J(jl4.w, eb.b);
                    if (gs22 == null) {
                        g80 = xb4.K;
                    } else {
                        g80 = xb4.L;
                    }
                    ml4 d = J.d(new f23(g80));
                    lh4 d2 = mb0.d(xb4.y, false);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, d);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(tx0.f, yt2, d2);
                    g75.Q(tx0.e, yt2, m);
                    g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
                    g75.O(yt2, tx0.h);
                    g75.Q(tx0.d, yt2, E);
                    gs2.H(yt2, 0);
                    yt2.r(true);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                num.getClass();
                fx4.a(gs22, gs2, yt2, b85.v(1));
                return vs7;
            default:
                num.getClass();
                va7.c(gs22, gs2, yt2, b85.v(1));
                return vs7;
        }
    }

    public /* synthetic */ db(gs2 gs2, gs2 gs22, int i, int i2) {
        this.w = i2;
        this.x = gs2;
        this.y = gs22;
    }
}
