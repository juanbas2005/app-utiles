package defpackage;

/* renamed from: t26  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class t26 implements hs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ Object y;

    public /* synthetic */ t26(int i, long j, Object obj) {
        this.w = i;
        this.y = obj;
        this.x = j;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        fw0 fw0;
        int i = this.w;
        vs7 vs7 = vs7.a;
        jl4 jl4 = jl4.w;
        Object obj4 = this.y;
        switch (i) {
            case b85.b:
                pl7 pl7 = (pl7) obj4;
                yt2 yt2 = (yt2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((bu0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    ml4 K = x91.K(jl4, 14.0f);
                    au0 a = zt0.a(wr.c, xb4.K, yt2, 0);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, K);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    ck ckVar = tx0.f;
                    g75.Q(ckVar, yt2, a);
                    ck ckVar2 = tx0.e;
                    g75.Q(ckVar2, yt2, m);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ck ckVar3 = tx0.g;
                    g75.Q(ckVar3, yt2, valueOf);
                    ce ceVar = tx0.h;
                    g75.O(yt2, ceVar);
                    ck ckVar4 = tx0.d;
                    g75.Q(ckVar4, yt2, E);
                    sd2 sd2 = yu6.a;
                    ea6 a2 = ca6.a(wr.g, xb4.I, yt2, 54);
                    int hashCode2 = Long.hashCode(yt2.T);
                    vf5 m2 = yt2.m();
                    ml4 E2 = gw8.E(yt2, sd2);
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(ckVar, yt2, a2);
                    g75.Q(ckVar2, yt2, m2);
                    f21.s(hashCode2, yt2, ckVar3, yt2, ceVar);
                    g75.Q(ckVar4, yt2, E2);
                    yt2 yt22 = yt2;
                    yf7.b(pl7.a, new lz3(1.0f, true), this.x, ya5.k(14), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 1597440, 0, 262056);
                    yf7.b(pl7.c, (ml4) null, x08.a(), ya5.k(11), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 24576, 0, 262122);
                    yt2 yt23 = yt22;
                    yt23.r(true);
                    yf7.b(pl7.d, (ml4) null, x08.a(), ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 24576, 0, 262122);
                    yt23.r(true);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                gs2 gs2 = (gs2) obj4;
                xk xkVar = (xk) obj;
                yt2 yt24 = (yt2) obj2;
                ((Integer) obj3).getClass();
                if (gs2 != null) {
                    yt24.e0(1575370973);
                    fw0 = su0.J(-237350650, new rp0(this.x, gs2, 0, (byte) 0), yt24);
                    yt24.r(false);
                } else {
                    yt24.e0(1575598419);
                    yt24.r(false);
                    fw0 = null;
                }
                Object Q = yt24.Q();
                if (Q == ay0.a) {
                    Q = u55.p(fw0);
                    yt24.o0(Q);
                }
                aq4 aq4 = (aq4) Q;
                if (fw0 != null) {
                    aq4.setValue(fw0);
                }
                lh4 d = mb0.d(xb4.C, false);
                int hashCode3 = Long.hashCode(yt24.T);
                vf5 m3 = yt24.m();
                ml4 E3 = gw8.E(yt24, jl4);
                ux0.d.getClass();
                vy0 vy02 = tx0.b;
                yt24.i0();
                if (yt24.S) {
                    yt24.l(vy02);
                } else {
                    yt24.r0();
                }
                g75.Q(tx0.f, yt24, d);
                g75.Q(tx0.e, yt24, m3);
                g75.Q(tx0.g, yt24, Integer.valueOf(hashCode3));
                g75.O(yt24, tx0.h);
                g75.Q(tx0.d, yt24, E3);
                gs2 gs22 = (gs2) aq4.getValue();
                if (gs22 == null) {
                    yt24.e0(2094511935);
                } else {
                    yt24.e0(1037396226);
                    gs22.H(yt24, 0);
                }
                yt24.r(false);
                yt24.r(true);
                return vs7;
        }
    }
}
