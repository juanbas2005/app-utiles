package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: oa9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class oa9 implements hs2 {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ vr2 x;
    public final /* synthetic */ a37 y;

    public /* synthetic */ oa9(vr2 vr2, aq4 aq4, boolean z) {
        this.w = z;
        this.x = vr2;
        this.y = aq4;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        i80 i80 = xb4.C;
        int intValue = ((Integer) obj3).intValue();
        yt2 yt2 = (yt2) obj2;
        la5 la5 = (la5) obj;
        la5.getClass();
        if ((intValue & 6) == 0) {
            if (true != yt2.g(la5)) {
                i = 2;
            } else {
                i = 4;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(intValue & 1, z)) {
            jl4 jl4 = jl4.w;
            ml4 J = x91.J(jl4, la5);
            sd2 sd2 = yu6.c;
            ml4 d = J.d(sd2);
            lh4 d2 = mb0.d(xb4.y, false);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, d);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, d2);
            g75.Q(tx0.e, yt2, m);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            boolean z4 = this.w;
            qb0 qb0 = qb0.a;
            if (!z4) {
                yt2.e0(1047762394);
                yt2 yt22 = yt2;
                yf7.b(l55.u(R.string.no_licenses_available, yt2), qb0.a(jl4, i80), 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 0, 0, 262140);
                yt2 = yt22;
                yt2.r(false);
                z2 = true;
            } else {
                yt2.e0(1047960887);
                vr8 vr8 = (vr8) this.y.getValue();
                if (vr8 instanceof sr8) {
                    yt2.e0(1047999699);
                    yt2 yt23 = yt2;
                    rq5.a(qb0.a(jl4, i80), 0, 0.0f, 0, 0, 0.0f, yt23, 0, 62);
                    yt2 = yt23;
                    yt2.r(false);
                    z2 = true;
                    z3 = false;
                } else if (vr8 instanceof pr8) {
                    yt2.e0(1048152746);
                    String str = ((pr8) vr8).a;
                    long j = ((zg4) yt2.k(ch4.b)).a.w;
                    ml4 a = qb0.a(jl4, i80);
                    yt2 yt24 = yt2;
                    z2 = true;
                    z3 = false;
                    yf7.b(str, a, j, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, 0, 0, 262136);
                    yt2 = yt24;
                    yt2.r(false);
                } else {
                    z2 = true;
                    z3 = false;
                    if (vr8 instanceof rr8) {
                        yt2.e0(1048391105);
                        boolean i2 = yt2.i(vr8);
                        vr2 vr2 = this.x;
                        boolean g = i2 | yt2.g(vr2);
                        Object Q = yt2.Q();
                        if (g || Q == ay0.a) {
                            Q = new e3(23, (Object) (rr8) vr8, (Object) vr2);
                            yt2.o0(Q);
                        }
                        x91.a(sd2, (s34) null, (la5) null, (vr) null, (ib) null, (eh2) null, false, (xf) null, (vr2) Q, yt2, 6, 510);
                        yt2.r(false);
                    } else {
                        yt2.e0(1280731179);
                        yt2.r(false);
                        h.c();
                        return null;
                    }
                }
                yt2.r(z3);
            }
            yt2.r(z2);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
