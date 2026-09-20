package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: gy8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gy8 implements hs2 {
    public final /* synthetic */ jb9 w;
    public final /* synthetic */ aq4 x;
    public final /* synthetic */ aq4 y;

    public /* synthetic */ gy8(jb9 jb9, aq4 aq4, aq4 aq42) {
        this.w = jb9;
        this.x = aq4;
        this.y = aq42;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int intValue = ((Integer) obj3).intValue();
        yt2 yt2 = (yt2) obj2;
        la5 la5 = (la5) obj;
        i80 i80 = xb4.C;
        la5.getClass();
        boolean z4 = true;
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
            jb9 jb9 = this.w;
            qb0 qb0 = qb0.a;
            if (jb9 == null) {
                yt2.e0(1930657343);
                if (((vr8) this.x.getValue()) instanceof sr8) {
                    yt2.e0(1930817148);
                    rq5.a(qb0.a(jl4, i80), 0, 0.0f, 0, 0, 0.0f, yt2, 0, 62);
                    yt2.r(false);
                    z3 = true;
                    z2 = false;
                } else {
                    yt2.e0(1930916565);
                    String u = l55.u(R.string.license_content_error, yt2);
                    ml4 a = qb0.a(jl4, i80);
                    yt2 yt22 = yt2;
                    z3 = true;
                    z2 = false;
                    yf7.b(u, a, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 0, 0, 262140);
                    yt2 = yt22;
                    yt2.r(false);
                }
                yt2.r(z2);
                z4 = z3;
            } else {
                yt2.e0(1931097543);
                String str = (String) this.y.getValue();
                if (str == null) {
                    yt2.e0(1931148476);
                    rq5.a(qb0.a(jl4, i80), 0, 0.0f, 0, 0, 0.0f, yt2, 0, 62);
                    yt2.r(false);
                } else {
                    yt2.e0(1931248172);
                    i35.t(str, x91.K(t49.Z(sd2, t49.Y(yt2), true), 16.0f), yt2, 0);
                    yt2.r(false);
                }
                yt2.r(false);
            }
            yt2.r(z4);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
