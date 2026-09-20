package defpackage;

/* renamed from: zh2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class zh2 implements gs2 {
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ float x;
    public final /* synthetic */ Object y;

    public /* synthetic */ zh2(float f, fw0 fw0) {
        this.x = f;
        this.y = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.y;
        switch (i) {
            case b85.b:
                fw0 fw0 = (fw0) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    ml4 a = yu6.a(jl4.w, this.x, 56.0f);
                    lh4 d = mb0.d(xb4.C, false);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, a);
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
                    f21.r(0, fw0, yt2, true);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                qw6 qw6 = (qw6) obj3;
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt22.V(intValue2 & 1, z2)) {
                    c35.b(qw6, x91.O(jl4.w, 0.0f, 0.0f, 0.0f, this.x, 7), (hs2) null, yt22, 0);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ zh2(qw6 qw6, float f) {
        this.y = qw6;
        this.x = f;
    }
}
