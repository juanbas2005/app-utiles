package defpackage;

/* renamed from: xj7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class xj7 implements gs2 {
    public final /* synthetic */ float w;
    public final /* synthetic */ long x;
    public final /* synthetic */ fw0 y;

    public /* synthetic */ xj7(float f, long j, fw0 fw0) {
        this.w = f;
        this.x = j;
        this.y = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(intValue & 1, z)) {
            ml4 J = x91.J(yu6.o(jl4.w, 40.0f, 24.0f, this.w, 0.0f, 8), ak7.a);
            lh4 d = mb0.d(xb4.y, false);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, J);
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
            t49.d(new ju5[]{b81.g(this.x, j41.a), yf7.a.a(dr7.a(ie1.V, yt2))}, this.y, yt2, 8);
            yt2.r(true);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
