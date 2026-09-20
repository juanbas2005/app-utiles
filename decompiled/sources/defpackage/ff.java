package defpackage;

/* renamed from: ff  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ff implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ff(x35 x35, ml4 ml4, long j, int i) {
        this.w = 0;
        this.y = x35;
        this.z = ml4;
        this.x = j;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        boolean z2 = false;
        vs7 vs7 = vs7.a;
        Object obj3 = this.z;
        Object obj4 = this.y;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                x35 x35 = (x35) obj4;
                ml4 ml4 = (ml4) obj3;
                x35 x352 = x35;
                kf.a(x352, ml4, this.x, (yt2) obj, b85.v(1));
                return vs7;
            case 1:
                la5 la5 = (la5) obj4;
                hs2 hs2 = (hs2) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (yt2.V(intValue & 1, z2)) {
                    a35.a(this.x, ((zg4) yt2.k(ch4.b)).b.m, su0.J(417635459, new p13(8, (Object) la5, (Object) hs2), yt2), yt2, 384);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 2:
                nw6 nw6 = (nw6) obj4;
                String str = (String) obj3;
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (yt22.V(intValue2 & 1, z2)) {
                    xd0 g = yd0.g(this.x, yt22);
                    boolean g2 = yt22.g(nw6);
                    Object Q = yt22.Q();
                    if (g2 || Q == ay0.a) {
                        Q = new mw6(nw6, 1);
                        yt22.o0(Q);
                    }
                    gw8.e((sr2) Q, (ml4) null, false, (pq6) null, g, (la5) null, su0.J(521110564, new gh1(str, 1), yt22), yt22, 805306368, 494);
                } else {
                    yt22.Y();
                }
                return vs7;
            default:
                tg7 tg7 = (tg7) obj4;
                gs2 gs2 = (gs2) obj3;
                yt2 yt23 = (yt2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                }
                if (yt23.V(intValue3 & 1, z2)) {
                    g75.d(this.x, tg7, gs2, yt23, 0);
                } else {
                    yt23.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ ff(long j, Object obj, Object obj2, int i) {
        this.w = i;
        this.x = j;
        this.y = obj;
        this.z = obj2;
    }
}
