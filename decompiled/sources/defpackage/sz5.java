package defpackage;

/* renamed from: sz5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class sz5 implements hs2 {
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ long y;
    public final /* synthetic */ String z;

    public /* synthetic */ sz5(long j, String str, String str2, String str3) {
        this.w = str;
        this.x = str2;
        this.y = j;
        this.z = str3;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z2;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((bu0) obj).getClass();
        if ((intValue & 17) != 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            ml4 L = x91.L(yu6.a, 8.0f, 12.0f);
            au0 a = zt0.a(wr.c, xb4.L, yt2, 48);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, L);
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
            long j = jt0.c;
            yt2 yt22 = yt2;
            yf7.b(this.w, (ml4) null, jt0.b(0.45f, j), ya5.k(10), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 24960, 0, 262122);
            k75.a(yt22, yu6.d(jl4.w, 4.0f));
            yf7.b(this.x, (ml4) null, this.y, ya5.k(18), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 1597440, 0, 262058);
            yf7.b(this.z, (ml4) null, jt0.b(0.35f, j), ya5.k(10), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 24960, 0, 262122);
            yt22.r(true);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
