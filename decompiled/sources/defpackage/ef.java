package defpackage;

/* renamed from: ef  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ef implements gs2 {
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ long x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ef(int i, long j, String str) {
        this.x = j;
        this.y = str;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.y;
        long j = this.x;
        switch (i) {
            case b85.b:
                ml4 ml4 = (ml4) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!yt2.V(intValue & 1, z)) {
                    yt2.Y();
                } else if (j != 9205357640488583168L) {
                    yt2.e0(-1244013944);
                    ml4 j2 = yu6.j(ml4, px1.b(j), px1.a(j), 0.0f, 0.0f, 12);
                    lh4 d = mb0.d(xb4.z, false);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, j2);
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
                    kf.b((ml4) null, yt2, 0, 1);
                    yt2.r(true);
                    yt2.r(false);
                } else {
                    yt2.e0(-1243644858);
                    kf.b(ml4, yt2, 0, 0);
                    yt2.r(false);
                }
                return vs7;
            default:
                ((Integer) obj2).getClass();
                t13.k(j, (String) obj3, (yt2) obj, b85.v(1));
                return vs7;
        }
    }

    public /* synthetic */ ef(long j, ml4 ml4) {
        this.x = j;
        this.y = ml4;
    }
}
