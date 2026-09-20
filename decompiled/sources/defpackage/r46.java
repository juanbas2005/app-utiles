package defpackage;

/* renamed from: r46  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class r46 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ vr2 x;
    public final /* synthetic */ aq4 y;

    public /* synthetic */ r46(vr2 vr2, aq4 aq4, int i) {
        this.w = i;
        this.x = vr2;
        this.y = aq4;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        long a;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = ay0.a;
        aq4 aq4 = this.y;
        vr2 vr2 = this.x;
        boolean z2 = false;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (yt2.V(intValue & 1, z2)) {
                    boolean g = yt2.g(vr2);
                    Object Q = yt2.Q();
                    if (g || Q == obj3) {
                        Q = new yo2(vr2, aq4, 7);
                        yt2.o0(Q);
                    }
                    gw8.e((sr2) Q, (ml4) null, false, (pq6) null, (xd0) null, (la5) null, hj8.b, yt2, 805306368, 510);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt22.V(intValue2 & 1, z)) {
                    x83 r = b35.r();
                    if (((String) aq4.getValue()).length() == 4) {
                        int i2 = w08.a;
                        a = w08.a(uq3.d(4279391610L), uq3.d(4281301934L));
                    } else {
                        int i3 = w08.a;
                        a = w08.a(uq3.d(4284708234L), uq3.d(4288656326L));
                    }
                    long j = a;
                    ml4 l = yu6.l(jl4.w, 18.0f);
                    boolean g2 = yt22.g(vr2);
                    Object Q2 = yt22.Q();
                    if (g2 || Q2 == obj3) {
                        Q2 = new yo2(vr2, aq4, 8);
                        yt22.o0(Q2);
                    }
                    d83.a(r, (String) null, h49.u(l, false, (String) null, (sr2) Q2, 15), j, yt22, 48, 0);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }
}
