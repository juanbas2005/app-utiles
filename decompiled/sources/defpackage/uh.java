package defpackage;

/* renamed from: uh  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uh extends wx3 implements gs2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ pl5 y;
    public final /* synthetic */ aq4 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uh(pl5 pl5, aq4 aq4, int i) {
        super(2);
        this.x = i;
        this.y = pl5;
        this.z = aq4;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        float f;
        boolean z3;
        int i = this.x;
        vs7 vs7 = vs7.a;
        aq4 aq4 = this.z;
        pl5 pl5 = this.y;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    Object Q = yt2.Q();
                    d63 d63 = ay0.a;
                    if (Q == d63) {
                        Q = ce.F;
                        yt2.o0(Q);
                    }
                    ml4 a = ck6.a(jl4.w, false, (vr2) Q);
                    boolean i2 = yt2.i(pl5);
                    Object Q2 = yt2.Q();
                    if (i2 || Q2 == d63) {
                        Q2 = new rh(pl5, 1);
                        yt2.o0(Q2);
                    }
                    ml4 W = t49.W(a, (vr2) Q2);
                    if (pl5.getCanCalculatePosition()) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    if (f != 1.0f) {
                        W = mp7.Y(W, 0.0f, 0.0f, f, 0.0f, 0.0f, (pq6) null, true, 1044475);
                    }
                    yy0 yy0 = vh.a;
                    gs2 gs2 = (gs2) aq4.getValue();
                    Object Q3 = yt2.Q();
                    if (Q3 == d63) {
                        Q3 = pf.c;
                        yt2.o0(Q3);
                    }
                    lh4 lh4 = (lh4) Q3;
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, W);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(tx0.f, yt2, lh4);
                    g75.Q(tx0.e, yt2, m);
                    g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
                    g75.O(yt2, tx0.h);
                    g75.Q(tx0.d, yt2, E);
                    gs2.H(yt2, 0);
                    yt2.r(true);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt22.V(1 & intValue2, z3)) {
                    t49.c(vh.b.a(Boolean.TRUE), su0.J(1022273628, new uh(pl5, aq4, 0), yt22), yt22, 56);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }
}
