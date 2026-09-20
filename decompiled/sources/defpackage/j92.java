package defpackage;

/* renamed from: j92  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class j92 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ j92(wi4 wi4, boolean z2, fw0 fw0) {
        this.w = 3;
        this.y = wi4;
        this.x = z2;
        this.z = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.z;
        boolean z5 = this.x;
        Object obj4 = this.y;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                ((k92) obj4).a(z5, (ml4) obj3, (yt2) obj, b85.v(385));
                return vs7;
            case 1:
                ((Integer) obj2).getClass();
                t13.m((x83) obj4, z5, (sr2) obj3, (yt2) obj, b85.v(1));
                return vs7;
            case 2:
                fw0 fw0 = (fw0) obj4;
                fw0 fw02 = (fw0) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(1 & intValue, z2)) {
                    if (z5) {
                        yt2.e0(-1776671487);
                        fw0.H(yt2, 0);
                    } else {
                        yt2.e0(-1776670855);
                        fw02.H(yt2, 0);
                    }
                    yt2.r(false);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 3:
                wi4 wi4 = (wi4) obj4;
                fw0 fw03 = (fw0) obj3;
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt22.V(1 & intValue2, z3)) {
                    yt22.e0(-864297175);
                    yt22.r(false);
                    yy0 yy0 = j41.a;
                    if (z5) {
                        j = wi4.a;
                    } else {
                        j = wi4.d;
                    }
                    t49.c(b81.g(j, yy0), su0.J(-893579015, new x30(fw03, 7), yt22), yt22, 56);
                    yt22.e0(-863079991);
                    yt22.r(false);
                } else {
                    yt22.Y();
                }
                return vs7;
            case 4:
                sr2 sr2 = (sr2) obj4;
                sr2 sr22 = (sr2) obj3;
                yt2 yt23 = (yt2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (yt23.V(intValue3 & 1, z4)) {
                    ea6 a = ca6.a(wr.a, xb4.H, yt23, 0);
                    int hashCode = Long.hashCode(yt23.T);
                    vf5 m = yt23.m();
                    ml4 E = gw8.E(yt23, jl4.w);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt23.i0();
                    if (yt23.S) {
                        yt23.l(vy0);
                    } else {
                        yt23.r0();
                    }
                    g75.Q(tx0.f, yt23, a);
                    g75.Q(tx0.e, yt23, m);
                    g75.Q(tx0.g, yt23, Integer.valueOf(hashCode));
                    g75.O(yt23, tx0.h);
                    g75.Q(tx0.d, yt23, E);
                    if (z5) {
                        yt23.e0(-1803854658);
                        boolean g = yt23.g(sr2) | yt23.g(sr22);
                        Object Q = yt23.Q();
                        if (g || Q == ay0.a) {
                            Q = new qm3(6, (Object) sr2, (Object) sr22);
                            yt23.o0(Q);
                        }
                        yt2 yt24 = yt23;
                        gw8.e((sr2) Q, (ml4) null, false, (pq6) null, (xd0) null, (la5) null, dh4.k, yt24, 805306368, 510);
                        yt23 = yt24;
                        yt23.r(false);
                    } else {
                        yt23.e0(-1803493322);
                        yt23.r(false);
                    }
                    gw8.e(sr22, (ml4) null, false, (pq6) null, (xd0) null, (la5) null, dh4.l, yt23, 805306368, 510);
                    yt23.r(true);
                } else {
                    yt23.Y();
                }
                return vs7;
            default:
                ((Integer) obj2).getClass();
                ((xi6) obj4).b(z5, (gs2) obj3, (yt2) obj, b85.v(3073));
                return vs7;
        }
    }

    public /* synthetic */ j92(int i, int i2, Object obj, Object obj2, boolean z2) {
        this.w = i2;
        this.y = obj;
        this.x = z2;
        this.z = obj2;
    }

    public /* synthetic */ j92(boolean z2, ds2 ds2, ds2 ds22, int i) {
        this.w = i;
        this.x = z2;
        this.y = ds2;
        this.z = ds22;
    }
}
