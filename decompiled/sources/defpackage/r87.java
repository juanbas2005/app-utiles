package defpackage;

/* renamed from: r87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class r87 implements gs2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ ua0 B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ sr2 D;
    public final /* synthetic */ float E;
    public final /* synthetic */ fw0 F;
    public final /* synthetic */ ml4 w;
    public final /* synthetic */ ap4 x;
    public final /* synthetic */ pq6 y;
    public final /* synthetic */ long z;

    public /* synthetic */ r87(ml4 ml4, ap4 ap4, pq6 pq6, long j, float f, ua0 ua0, boolean z2, sr2 sr2, float f2, fw0 fw0) {
        this.w = ml4;
        this.x = ap4;
        this.y = pq6;
        this.z = j;
        this.A = f;
        this.B = ua0;
        this.C = z2;
        this.D = sr2;
        this.E = f2;
        this.F = fw0;
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
            h23 h23 = hf3.a;
            ml4 d = this.w.d(al4.w);
            yy0 yy0 = d86.a;
            p86 p86 = ((q86) yt2.k(yy0)).a;
            ml4 d2 = d.d(jl4.w);
            long e = s87.e(this.z, this.A, yt2);
            float e0 = ((tp1) yt2.k(xy0.h)).e0(this.E);
            pq6 pq6 = this.y;
            ml4 d3 = s87.d(d2, pq6, e, this.B, e0);
            p86 p862 = ((q86) yt2.k(yy0)).a;
            ml4 k = tf4.k(h49.t(d3, this.x, d86.a(false, 0.0f, 0, pq6, 215), this.C, (s86) null, this.D, 24));
            lh4 d4 = mb0.d(xb4.y, true);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E2 = gw8.E(yt2, k);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, d4);
            g75.Q(tx0.e, yt2, m);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E2);
            f21.r(0, this.F, yt2, true);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
