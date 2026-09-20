package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: ya  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ya implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ml4 x;
    public final /* synthetic */ fw0 y;

    public /* synthetic */ ya(ml4 ml4, fw0 fw0) {
        this.w = 0;
        this.x = ml4;
        this.y = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        int i = this.w;
        ml4 ml4 = this.x;
        vs7 vs7 = vs7.a;
        fw0 fw0 = this.y;
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
                    String i2 = h75.i(R.string.m3c_dialog, yt2);
                    ml4 o = yu6.o(this.x, 280.0f, 0.0f, 560.0f, 0.0f, 10);
                    boolean g = yt2.g(i2);
                    Object Q = yt2.Q();
                    if (g || Q == ay0.a) {
                        Q = new cb(i2, 0);
                        yt2.o0(Q);
                    }
                    ml4 d = o.d(ck6.a(jl4.w, false, (vr2) Q));
                    lh4 d2 = mb0.d(xb4.y, true);
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
                    f21.r(0, fw0, yt2, true);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                num.getClass();
                mp7.u(ml4, fw0, yt2, b85.v(49));
                return vs7;
            default:
                num.getClass();
                za5.a(ml4, fw0, yt2, b85.v(49));
                return vs7;
        }
    }

    public /* synthetic */ ya(ml4 ml4, fw0 fw0, int i, int i2) {
        this.w = i2;
        this.x = ml4;
        this.y = fw0;
    }
}
