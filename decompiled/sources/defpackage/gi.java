package defpackage;

/* renamed from: gi  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gi implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ long x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ gi(long j, boolean z2, ml4 ml4, x35 x35) {
        this.x = j;
        this.y = z2;
        this.z = ml4;
        this.A = x35;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        rr rrVar;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (i) {
            case b85.b:
                ml4 ml4 = (ml4) obj4;
                x35 x35 = (x35) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    long j = this.x;
                    int i2 = (j > 9205357640488583168L ? 1 : (j == 9205357640488583168L ? 0 : -1));
                    boolean z3 = this.y;
                    d63 d63 = ay0.a;
                    if (i2 != 0) {
                        yt2.e0(3458246);
                        if (z3) {
                            rrVar = sg3.b;
                        } else {
                            rrVar = sg3.a;
                        }
                        ml4 j2 = yu6.j(ml4, px1.b(j), px1.a(j), 0.0f, 0.0f, 12);
                        ea6 a = ca6.a(rrVar, xb4.H, yt2, 0);
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
                        g75.Q(tx0.f, yt2, a);
                        g75.Q(tx0.e, yt2, m);
                        g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
                        g75.O(yt2, tx0.h);
                        g75.Q(tx0.d, yt2, E);
                        boolean i3 = yt2.i(x35);
                        Object Q = yt2.Q();
                        if (i3 || Q == d63) {
                            Q = new hi(x35, 0);
                            yt2.o0(Q);
                        }
                        r16.r(jl4.w, (sr2) Q, z3, yt2, 6);
                        yt2.r(true);
                        yt2.r(false);
                    } else {
                        yt2.e0(4389176);
                        boolean i4 = yt2.i(x35);
                        Object Q2 = yt2.Q();
                        if (i4 || Q2 == d63) {
                            Q2 = new hi(x35, 1);
                            yt2.o0(Q2);
                        }
                        r16.r(ml4, (sr2) Q2, z3, yt2, 0);
                        yt2.r(false);
                    }
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                ((Integer) obj2).getClass();
                d36.a((String) obj4, this.x, (String) obj3, this.y, (yt2) obj, b85.v(1));
                return vs7;
        }
    }

    public /* synthetic */ gi(String str, long j, String str2, boolean z2, int i) {
        this.z = str;
        this.x = j;
        this.A = str2;
        this.y = z2;
    }
}
