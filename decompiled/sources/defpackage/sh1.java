package defpackage;

/* renamed from: sh1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class sh1 implements is2 {
    public final /* synthetic */ Long A;
    public final /* synthetic */ rg1 B;
    public final /* synthetic */ kg1 C;
    public final /* synthetic */ ig1 D;
    public final /* synthetic */ s34 E;
    public final /* synthetic */ ik2 F;
    public final /* synthetic */ sr2 G;
    public final /* synthetic */ vh0 w;
    public final /* synthetic */ yh0 x;
    public final /* synthetic */ vr2 y;
    public final /* synthetic */ th0 z;

    public /* synthetic */ sh1(vh0 vh0, yh0 yh0, vr2 vr2, th0 th0, Long l, rg1 rg1, kg1 kg1, ig1 ig1, s34 s34, ik2 ik2, sr2 sr2) {
        this.w = vh0;
        this.x = yh0;
        this.y = vr2;
        this.z = th0;
        this.A = l;
        this.B = rg1;
        this.C = kg1;
        this.D = ig1;
        this.E = s34;
        this.F = ik2;
        this.G = sr2;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z2;
        int i2;
        int i3;
        r04 r04 = (r04) obj;
        int intValue = ((Integer) obj2).intValue();
        yt2 yt2 = (yt2) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (yt2.g(r04)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (yt2.e(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i & 1, z2)) {
            vh0 vh0 = this.w;
            yh0 k = vh0.k(this.x, intValue);
            jd5 jd5 = new jd5(r04.a);
            lh4 d = mb0.d(xb4.y, false);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E2 = gw8.E(yt2, jd5);
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
            g75.Q(tx0.d, yt2, E2);
            gi1.i(k, this.y, this.z.z, this.A, this.B, this.C, this.D, vh0.a, this.E, this.F, this.G, yt2, 221184);
            yt2.r(true);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
