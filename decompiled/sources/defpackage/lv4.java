package defpackage;

/* renamed from: lv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class lv4 implements gs2 {
    public final /* synthetic */ aa8 A;
    public final /* synthetic */ fw0 B;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ float x;
    public final /* synthetic */ nh2 y;
    public final /* synthetic */ float z;

    public /* synthetic */ lv4(boolean z2, float f, nh2 nh2, float f2, aa8 aa8, fw0 fw0) {
        this.w = z2;
        this.x = f;
        this.y = nh2;
        this.z = f2;
        this.A = aa8;
        this.B = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            jl4 jl4 = jl4.w;
            ml4 T = x91.T(mp7.X(yu6.o(jl4, 240.0f, 0.0f, this.x, 0.0f, 10), new jv4(this.y, this.z, this.w, 0)).d(jl4), this.A);
            au0 a = zt0.a(wr.c, xb4.K, yt2, 0);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, T);
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
            this.B.u(bu0.a, yt2, 6);
            yt2.r(true);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
