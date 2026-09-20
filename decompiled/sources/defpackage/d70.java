package defpackage;

/* renamed from: d70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class d70 implements gs2 {
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ String x;
    public final /* synthetic */ fw0 y;

    public /* synthetic */ d70(String str, fw0 fw0) {
        this.x = str;
        this.y = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        int i = this.w;
        vs7 vs7 = vs7.a;
        fw0 fw0 = this.y;
        String str = this.x;
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
                    boolean g = yt2.g(str);
                    Object Q = yt2.Q();
                    if (g || Q == ay0.a) {
                        Q = new cb(str, 2);
                        yt2.o0(Q);
                    }
                    ml4 a = ck6.a(jl4.w, false, (vr2) Q);
                    lh4 d = mb0.d(xb4.y, false);
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
                num.getClass();
                gr8.i(str, fw0, yt2, b85.v(49));
                return vs7;
        }
    }

    public /* synthetic */ d70(String str, fw0 fw0, int i) {
        this.x = str;
        this.y = fw0;
    }
}
