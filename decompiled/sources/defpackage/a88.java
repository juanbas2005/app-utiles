package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: a88  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class a88 implements hs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ w78 x;

    public /* synthetic */ a88(w78 w78, int i) {
        this.w = i;
        this.x = w78;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        int i2 = this.w;
        vs7 vs7 = vs7.a;
        jl4 jl4 = jl4.w;
        boolean z2 = false;
        w78 w78 = this.x;
        switch (i2) {
            case b85.b /*0*/:
                yt2 yt2 = (yt2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((bu0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    ml4 K = x91.K(jl4, 16.0f);
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
                    g75.Q(tx0.f, yt2, a);
                    g75.Q(tx0.e, yt2, m);
                    g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
                    g75.O(yt2, tx0.h);
                    g75.Q(tx0.d, yt2, E);
                    x83 x83 = x91.q;
                    if (x83 == null) {
                        w83 w83 = new w83("Rounded.Description", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                        int i3 = e38.a;
                        ky6 ky6 = new ky6(jt0.b);
                        be5 e = pb4.e(14.59f, 2.59f);
                        e.e(-0.38f, -0.38f, -0.89f, -0.59f, -1.42f, -0.59f);
                        be5 be5 = e;
                        be5.h(6.0f, 2.0f);
                        e.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        be5.n(16.0f);
                        e.e(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
                        be5.h(18.0f, 22.0f);
                        e.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        be5.h(20.0f, 8.83f);
                        e.e(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
                        be5.i(-4.82f, -4.83f);
                        be5.c();
                        be5.j(15.0f, 18.0f);
                        be5.h(9.0f, 18.0f);
                        e.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        be5.l(0.45f, -1.0f, 1.0f, -1.0f);
                        be5.g(6.0f);
                        e.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                        be5.l(-0.45f, 1.0f, -1.0f, 1.0f);
                        b81.v(be5, 15.0f, 14.0f, 9.0f, 14.0f);
                        e.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        be5.l(0.45f, -1.0f, 1.0f, -1.0f);
                        be5.g(6.0f);
                        e.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                        be5.l(-0.45f, 1.0f, -1.0f, 1.0f);
                        b81.v(be5, 13.0f, 8.0f, 13.0f, 3.5f);
                        be5.h(18.5f, 9.0f);
                        be5.h(14.0f, 9.0f);
                        e.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        be5.c();
                        w83.a(w83, be5.a, ky6, 14336);
                        x83 = w83.b();
                        x91.q = x83;
                    }
                    b88.b(x83, l55.u(R.string.vpn_config_label, yt2), w78.a, yt2, 0);
                    String str = w78.b;
                    if (str == null) {
                        yt2.e0(1940881987);
                        yt2.r(false);
                    } else {
                        yt2.e0(1940881988);
                        k75.a(yt2, yu6.d(jl4, 10.0f));
                        b88.b(i35.h(), l55.u(R.string.vpn_endpoint_label, yt2), str, yt2, 0);
                        yt2.r(false);
                    }
                    String str2 = w78.c;
                    if (str2 == null) {
                        yt2.e0(1941269735);
                        yt2.r(false);
                    } else {
                        yt2.e0(1941269736);
                        k75.a(yt2, yu6.d(jl4, 10.0f));
                        x83 x832 = kl8.u;
                        if (x832 == null) {
                            w83 w832 = new w83("Rounded.Dns", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                            int i4 = e38.a;
                            ky6 ky62 = new ky6(jt0.b);
                            be5 be52 = new be5();
                            be52.j(19.0f, 13.0f);
                            be52.f(5.0f);
                            be5 be53 = be52;
                            be53.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            be52.n(4.0f);
                            be53.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            be52.g(14.0f);
                            be53.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            be52.n(-4.0f);
                            be53.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            be52.c();
                            be52.j(7.0f, 19.0f);
                            be53.e(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                            be52.l(0.9f, -2.0f, 2.0f, -2.0f);
                            be52.l(2.0f, 0.9f, 2.0f, 2.0f);
                            be52.l(-0.9f, 2.0f, -2.0f, 2.0f);
                            be52.c();
                            be52.j(19.0f, 3.0f);
                            be52.f(5.0f);
                            be53.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            be52.n(4.0f);
                            be53.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            be52.g(14.0f);
                            be53.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            be52.m(5.0f);
                            be53.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            be52.c();
                            be52.j(7.0f, 9.0f);
                            be53.e(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                            be52.l(0.9f, -2.0f, 2.0f, -2.0f);
                            be52.l(2.0f, 0.9f, 2.0f, 2.0f);
                            be52.l(-0.9f, 2.0f, -2.0f, 2.0f);
                            be52.c();
                            w83.a(w832, be52.a, ky62, 14336);
                            x832 = w832.b();
                            kl8.u = x832;
                        }
                        b88.b(x832, l55.u(R.string.vpn_address_label, yt2), str2, yt2, 0);
                        yt2.r(false);
                    }
                    yt2.r(true);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                yt2 yt22 = (yt2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                }
                if (yt22.V(intValue2 & 1, z2)) {
                    x83 x833 = l55.a;
                    if (x833 == null) {
                        w83 w833 = new w83("Rounded.PowerSettingsNew", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                        int i5 = e38.a;
                        ky6 ky63 = new ky6(jt0.b);
                        be5 e2 = pb4.e(12.0f, 3.0f);
                        e2.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                        be5 be54 = e2;
                        be54.n(8.0f);
                        e2.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                        be54.l(1.0f, -0.45f, 1.0f, -1.0f);
                        be54.h(13.0f, 4.0f);
                        e2.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                        be54.c();
                        be54.j(17.14f, 5.86f);
                        e2.e(-0.39f, 0.39f, -0.38f, 1.0f, -0.01f, 1.39f);
                        e2.e(1.13f, 1.2f, 1.83f, 2.8f, 1.87f, 4.57f);
                        e2.e(0.09f, 3.83f, -3.08f, 7.13f, -6.91f, 7.17f);
                        e2.d(8.18f, 19.05f, 5.0f, 15.9f, 5.0f, 12.0f);
                        e2.e(0.0f, -1.84f, 0.71f, -3.51f, 1.87f, -4.76f);
                        e2.e(0.37f, -0.39f, 0.37f, -1.0f, -0.01f, -1.38f);
                        e2.e(-0.4f, -0.4f, -1.05f, -0.39f, -1.43f, 0.02f);
                        e2.d(3.98f, 7.42f, 3.07f, 9.47f, 3.0f, 11.74f);
                        e2.e(-0.14f, 4.88f, 3.83f, 9.1f, 8.71f, 9.25f);
                        e2.e(5.1f, 0.16f, 9.29f, -3.93f, 9.29f, -9.0f);
                        e2.e(0.0f, -2.37f, -0.92f, -4.51f, -2.42f, -6.11f);
                        e2.e(-0.38f, -0.41f, -1.04f, -0.42f, -1.44f, -0.02f);
                        be54.c();
                        w83.a(w833, be54.a, ky63, 14336);
                        x833 = w833.b();
                        l55.a = x833;
                    }
                    yt2 yt23 = yt22;
                    d83.a(x833, (String) null, (ml4) null, jt0.c, yt23, 3120, 4);
                    yt2 yt24 = yt23;
                    k75.a(yt24, yu6.p(jl4, 8.0f));
                    if (w78.d) {
                        i = R.string.vpn_disconnect;
                    } else {
                        i = R.string.vpn_connect;
                    }
                    yf7.b(l55.u(i, yt24), (ml4) null, 0, ya5.k(16), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, 1597440, 0, 262062);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }
}
