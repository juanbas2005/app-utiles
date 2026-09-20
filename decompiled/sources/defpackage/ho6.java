package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: ho6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ho6 implements hs2 {
    public final /* synthetic */ vr2 A;
    public final /* synthetic */ vr2 B;
    public final /* synthetic */ vr2 C;
    public final /* synthetic */ zn6 w;
    public final /* synthetic */ vr2 x;
    public final /* synthetic */ vr2 y;
    public final /* synthetic */ vr2 z;

    public /* synthetic */ ho6(zn6 zn6, vr2 vr2, vr2 vr22, vr2 vr23, vr2 vr24, vr2 vr25, vr2 vr26) {
        this.w = zn6;
        this.x = vr2;
        this.y = vr22;
        this.z = vr23;
        this.A = vr24;
        this.B = vr25;
        this.C = vr26;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean z3;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xk) obj).getClass();
        if ((intValue & 17) != 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            au0 a = zt0.a(wr.c, xb4.K, yt2, 0);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, jl4.w);
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
            String u = l55.u(R.string.ussd_auto_after_call, yt2);
            zn6 zn6 = this.w;
            boolean z4 = zn6.y;
            boolean z5 = zn6.B;
            bb0.F(u, z4, this.x, yt2, 0);
            bb0.F(l55.u(R.string.ussd_auto_after_sms, yt2), zn6.z, this.y, yt2, 0);
            bb0.F(l55.u(R.string.ussd_auto_after_data_off, yt2), zn6.A, this.z, yt2, 0);
            bb0.F(l55.u(R.string.ussd_auto_periodic, yt2), z5, this.A, yt2, 0);
            if (z5) {
                yt2.e0(1654610847);
                bb0.Q(l55.u(R.string.ussd_auto_query_label, yt2), zn6.D, this.B, yt2, 0);
                String u2 = l55.u(R.string.ussd_auto_interval_label, yt2);
                int i = zn6.C;
                if (i < 30) {
                    i = 30;
                }
                String valueOf = String.valueOf(i);
                vr2 vr2 = this.C;
                boolean g = yt2.g(vr2);
                Object Q = yt2.Q();
                if (g || Q == ay0.a) {
                    Q = new vz1(2, vr2);
                    yt2.o0(Q);
                }
                bb0.R(u2, valueOf, (vr2) Q, true, yt2, 3072);
                String u3 = l55.u(R.string.ussd_auto_interval_hint, yt2);
                t37 t37 = ch4.b;
                tg7 tg7 = ((zg4) yt2.k(t37)).b.o;
                long j = ((zg4) yt2.k(t37)).a.s;
                yt2 yt22 = yt2;
                z3 = true;
                yf7.b(u3, (ml4) null, j, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, tg7, yt22, 0, 0, 131066);
                yt2 = yt22;
                yt2.r(false);
            } else {
                z3 = true;
                yt2.e0(1655493045);
                yt2.r(false);
            }
            yt2.r(z3);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
