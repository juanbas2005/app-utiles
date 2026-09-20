package defpackage;

import android.content.Context;
import cu.lestebang.utiletecsa.R;
import java.util.WeakHashMap;

/* renamed from: b88  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class b88 {
    public static final long a = uq3.d(4281245275L);
    public static final long b = uq3.d(4291383119L);
    public static final /* synthetic */ int c = 0;

    public static final void a(x83 x83, long j, long j2, String str, String str2, sr2 sr2, yt2 yt2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        int i9 = i;
        yt22.g0(-1638138495);
        x83 x832 = x83;
        if ((i9 & 6) == 0) {
            if (yt22.g(x832)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        long j3 = j;
        if ((i9 & 48) == 0) {
            if (yt22.f(j3)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        long j4 = j2;
        if ((i9 & 384) == 0) {
            if (yt22.f(j4)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        String str3 = str;
        if ((i9 & 3072) == 0) {
            if (yt22.g(str3)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        String str4 = str2;
        if ((i9 & 24576) == 0) {
            if (yt22.g(str4)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i9) == 0) {
            if (yt22.i(sr22)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((74899 & i2) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            o96 a2 = q96.a(20.0f);
            pl0 w = rc9.w(z08.f(), yt22, 24576);
            we.b(h49.u(we.f(yu6.a, q96.a(20.0f)), false, (String) null, sr22, 15), a2, w, rc9.x(62, 0.0f), su0.J(1772052431, new y78(j3, x832, j4, str3, str4), yt22), yt22, 196608, 16);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new nv4(x83, j, j2, str, str2, sr22, i9);
        }
    }

    public static final void b(x83 x83, String str, String str2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        yt2 yt22 = yt2;
        yt22.g0(1982557764);
        x83 x832 = x83;
        if (yt22.g(x832)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (yt22.g(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (yt22.g(str2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i7 & 1, z)) {
            ea6 a2 = ca6.a(wr.a, xb4.I, yt22, 48);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            jl4 jl4 = jl4.w;
            ml4 E = gw8.E(yt22, jl4);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a2);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            d83.a(x832, (String) null, yu6.l(jl4, 20.0f), z08.b(), yt22, (i7 & 14) | 432, 0);
            k75.a(yt22, yu6.p(jl4, 10.0f));
            long e = z08.e();
            long k = ya5.k(13);
            yf7.b(str, yu6.p(jl4, 80.0f), e, k, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, ((i7 >> 3) & 14) | 24624, 0, 262120);
            yt2 yt23 = yt2;
            yf7.b(str2, (ml4) null, z08.k(), ya5.k(14), am2.z, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, ((i7 >> 6) & 14) | 1597440, 0, 262058);
            yt22 = yt23;
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ou4(i, 16, x83, str, str2);
        }
    }

    public static final void c(ru4 ru4, is2 is2, e88 e88, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        e88 e882;
        int i4;
        e88 e883;
        is2 is22 = is2;
        yt2 yt22 = yt2;
        is22.getClass();
        yt22.g0(1459144266);
        ru4 ru42 = ru4;
        if (yt22.i(ru42)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (yt22.g(is22)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3 | 128;
        boolean z2 = true;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i6 & 1, z)) {
            yt22.a0();
            if ((i & 1) == 0 || yt22.C()) {
                a68 a2 = va4.a(yt22);
                if (a2 != null) {
                    i4 = i6 & -897;
                    e883 = (e88) n85.p(b26.a.b(e88.class), a2, b96.O(o85.l(a2), yt22), o85.k(a2), yt22);
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt22.Y();
                i4 = i6 & -897;
                e883 = e88;
            }
            int i7 = i4;
            yt22.s();
            Context context = (Context) yt22.k(ye.b);
            aq4 n = hj8.n(e883.d, yt22);
            Object Q = yt22.Q();
            Object obj = ay0.a;
            if (Q == obj) {
                Q = u55.p(Boolean.FALSE);
                yt22.o0(Q);
            }
            aq4 aq4 = (aq4) Q;
            s8 s8Var = new s8(0);
            boolean i8 = yt22.i(e883);
            Object Q2 = yt22.Q();
            if (i8 || Q2 == obj) {
                Q2 = new x78(e883, 0);
                yt22.o0(Q2);
            }
            se4 N = tf4.N(s8Var, (vr2) Q2, yt22, 0);
            s8 s8Var2 = new s8(false, 4);
            boolean i9 = yt22.i(e883);
            Object Q3 = yt22.Q();
            if (i9 || Q3 == obj) {
                Q3 = new x78(e883, 1);
                yt22.o0(Q3);
            }
            se4 N2 = tf4.N(s8Var2, (vr2) Q3, yt22, 0);
            String u = l55.u(R.string.vpn_no_email_app, yt22);
            if (((Boolean) aq4.getValue()).booleanValue()) {
                yt22.e0(3664049);
                if ((i7 & 112) != 32) {
                    z2 = false;
                }
                boolean g = yt22.g(u) | z2;
                Object Q4 = yt22.Q();
                if (g || Q4 == obj) {
                    pd7 pd7 = new pd7(is22, u, aq4, (f61) null, 5);
                    yt22.o0(pd7);
                    Q4 = pd7;
                }
                t49.h((gs2) Q4, yt22, is22);
                yt22.r(false);
            } else {
                yt22.e0(3824536);
                yt22.r(false);
            }
            sg3.c((is7) n.getValue(), is22, su0.J(559877142, new z78(ru42, N, e883, l55.u(R.string.vpn_email_subject, yt22), l55.u(R.string.vpn_email_body, yt22), context, N2, aq4), yt22), yt22, 392 | (i7 & 112));
            e882 = e883;
        } else {
            yt22.Y();
            e882 = e88;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ou4(i, 17, ru4, is22, e882);
        }
    }

    public static final void d(w78 w78, ru4 ru4, sr2 sr2, sr2 sr22, sr2 sr23, sr2 sr24, yt2 yt2, int i) {
        int i2;
        w78 w782;
        long j;
        vy0 vy0;
        String str;
        boolean z;
        w78 w783 = w78;
        yt2 yt22 = yt2;
        int i3 = i;
        yt22.g0(283561165);
        if ((i3 & 6) == 0) {
            i2 = ((i3 & 8) == 0 ? yt22.g(w783) : yt22.i(w783) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        ru4 ru42 = ru4;
        if ((i3 & 48) == 0) {
            i2 |= yt22.i(ru42) ? 32 : 16;
        }
        sr2 sr25 = sr2;
        if ((i3 & 384) == 0) {
            i2 |= yt22.i(sr25) ? 256 : 128;
        }
        sr2 sr26 = sr22;
        if ((i3 & 3072) == 0) {
            i2 |= yt22.i(sr26) ? 2048 : 1024;
        }
        sr2 sr27 = sr23;
        if ((i3 & 24576) == 0) {
            i2 |= yt22.i(sr27) ? 16384 : 8192;
        }
        sr2 sr28 = sr24;
        if ((196608 & i3) == 0) {
            i2 |= yt22.i(sr28) ? 131072 : 65536;
        }
        int i4 = i2;
        if (yt22.V(i4 & 1, (i4 & 74899) != 74898)) {
            boolean z2 = w783.d;
            String str2 = w783.a;
            long j2 = a;
            if (z2) {
                j = j2;
            } else {
                j = jt0.c;
            }
            long j3 = j;
            boolean z3 = z2;
            yt2 yt23 = yt22;
            String str3 = str2;
            a37 a2 = ru6.a(j3, (hl) null, "vpnStatusColor", yt23, 384, 10);
            yt2 yt24 = yt23;
            sd2 sd2 = yu6.c;
            long c2 = z08.c();
            m23 m23 = gr8.h;
            ml4 h = b96.h(sd2, c2, m23);
            WeakHashMap weakHashMap = ib8.w;
            ml4 T = x91.T(h, new e64(n63.h(yt24).l, h75.h));
            g80 g80 = xb4.K;
            sr srVar = wr.c;
            au0 a3 = zt0.a(srVar, g80, yt24, 0);
            int hashCode = Long.hashCode(yt24.T);
            vf5 m = yt24.m();
            ml4 E = gw8.E(yt24, T);
            ux0.d.getClass();
            vy0 vy02 = tx0.b;
            yt24.i0();
            if (yt24.S) {
                yt24.l(vy02);
            } else {
                yt24.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt24, a3);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt24, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt24, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt24, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt24, E);
            sd2 sd22 = yu6.a;
            sd2 sd23 = sd2;
            ml4 L = x91.L(sd22, 4.0f, 4.0f);
            sd2 sd24 = sd22;
            ea6 a4 = ca6.a(wr.a, xb4.I, yt24, 48);
            g80 g802 = g80;
            m23 m232 = m23;
            int hashCode2 = Long.hashCode(yt24.T);
            vf5 m2 = yt24.m();
            ml4 E2 = gw8.E(yt24, L);
            yt24.i0();
            if (yt24.S) {
                yt24.l(vy02);
            } else {
                yt24.r0();
            }
            g75.Q(ckVar, yt24, a4);
            g75.Q(ckVar2, yt24, m2);
            f21.s(hashCode2, yt24, ckVar3, yt24, ceVar);
            g75.Q(ckVar4, yt24, E2);
            ce ceVar2 = ceVar;
            sd2 sd25 = sd24;
            ck ckVar5 = ckVar2;
            yt2 yt25 = yt2;
            hj8.e(ru42, (ml4) null, false, (a83) null, (pq6) null, x91.g, yt25, ((i4 >> 3) & 14) | 1572864, 62);
            String u = l55.u(R.string.vpn_screen_title, yt25);
            long k = z08.k();
            long k2 = ya5.k(20);
            am2 am2 = am2.B;
            vy0 vy03 = vy02;
            ck ckVar6 = ckVar4;
            m23 m233 = m232;
            ck ckVar7 = ckVar5;
            ck ckVar8 = ckVar3;
            yt2 yt26 = yt2;
            ck ckVar9 = ckVar;
            yf7.b(u, (ml4) null, k, k2, am2, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt26, 1597440, 0, 262058);
            am2 am22 = am2;
            yt2 yt27 = yt26;
            yt27.r(true);
            ml4 M = x91.M(t49.Z(sd23, t49.Y(yt27), true), 16.0f, 0.0f, 2);
            sr srVar2 = srVar;
            au0 a5 = zt0.a(srVar2, g802, yt27, 0);
            int hashCode3 = Long.hashCode(yt27.T);
            vf5 m3 = yt27.m();
            ml4 E3 = gw8.E(yt27, M);
            yt27.i0();
            if (yt27.S) {
                vy0 = vy03;
                yt27.l(vy0);
            } else {
                vy0 = vy03;
                yt27.r0();
            }
            ck ckVar10 = ckVar9;
            g75.Q(ckVar10, yt27, a5);
            ck ckVar11 = ckVar7;
            g75.Q(ckVar11, yt27, m3);
            ce ceVar3 = ceVar2;
            ck ckVar12 = ckVar8;
            f21.s(hashCode3, yt27, ckVar12, yt27, ceVar3);
            ck ckVar13 = ckVar6;
            g75.Q(ckVar13, yt27, E3);
            sd2 sd26 = sd25;
            ml4 M2 = x91.M(b96.g(we.f(sd26, q96.a(24.0f)), b18.a), 0.0f, 28.0f, 1);
            i80 i80 = xb4.C;
            lh4 d = mb0.d(i80, false);
            i80 i802 = i80;
            int hashCode4 = Long.hashCode(yt27.T);
            vf5 m4 = yt27.m();
            ml4 E4 = gw8.E(yt27, M2);
            yt27.i0();
            if (yt27.S) {
                yt27.l(vy0);
            } else {
                yt27.r0();
            }
            g75.Q(ckVar10, yt27, d);
            g75.Q(ckVar11, yt27, m4);
            f21.s(hashCode4, yt27, ckVar12, yt27, ceVar3);
            g75.Q(ckVar13, yt27, E4);
            au0 a6 = zt0.a(srVar2, xb4.L, yt27, 48);
            int hashCode5 = Long.hashCode(yt27.T);
            vf5 m5 = yt27.m();
            jl4 jl4 = jl4.w;
            ml4 E5 = gw8.E(yt27, jl4);
            yt27.i0();
            if (yt27.S) {
                yt27.l(vy0);
            } else {
                yt27.r0();
            }
            g75.Q(ckVar10, yt27, a6);
            g75.Q(ckVar11, yt27, m5);
            f21.s(hashCode5, yt27, ckVar12, yt27, ceVar3);
            g75.Q(ckVar13, yt27, E5);
            ml4 f = we.f(yu6.l(jl4, 88.0f), q96.a);
            long j4 = jt0.c;
            sd2 sd27 = sd26;
            ml4 h2 = b96.h(f, jt0.b(0.12f, j4), m233);
            lh4 d2 = mb0.d(i802, false);
            int hashCode6 = Long.hashCode(yt27.T);
            vf5 m6 = yt27.m();
            ml4 E6 = gw8.E(yt27, h2);
            yt27.i0();
            if (yt27.S) {
                yt27.l(vy0);
            } else {
                yt27.r0();
            }
            g75.Q(ckVar10, yt27, d2);
            g75.Q(ckVar11, yt27, m6);
            f21.s(hashCode6, yt27, ckVar12, yt27, ceVar3);
            g75.Q(ckVar13, yt27, E6);
            sd2 sd28 = sd27;
            d83.a(g75.B(), (String) null, yu6.l(jl4, 48.0f), ((jt0) a2.getValue()).a, yt27, 432, 0);
            yt27.r(true);
            k75.a(yt27, yu6.d(jl4, 14.0f));
            long j5 = j4;
            yt2 yt28 = yt2;
            jl4 jl42 = jl4;
            yf7.b(l55.u(z3 ? R.string.vpn_status_connected : R.string.vpn_status_disconnected, yt27), (ml4) null, j5, ya5.k(22), am22, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt28, 1597824, 0, 262058);
            yt2 yt29 = yt28;
            k75.a(yt29, yu6.d(jl42, 4.0f));
            if (str3 == null) {
                str = hl6.l(yt29, 915614315, R.string.vpn_no_config, yt29, false);
            } else {
                yt29.e0(915613726);
                yt29.r(false);
                str = str3;
            }
            yt2 yt210 = yt2;
            sd2 sd29 = sd28;
            yf7.b(str, (ml4) null, jt0.b(0.75f, j5), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt210, 24960, 0, 262122);
            yt2 yt211 = yt210;
            yt211.r(true);
            yt211.r(true);
            if (str3 != null) {
                yt211.e0(-1209450115);
                k75.a(yt211, yu6.d(jl42, 14.0f));
                z = false;
                we.b((ml4) null, q96.a(20.0f), rc9.w(z08.f(), yt211, 24576), rc9.x(62, 0.0f), su0.J(340772468, new a88(w78, 0), yt211), yt211, 196608, 17);
                yt211.r(false);
            } else {
                z = false;
                w78 w784 = w78;
                yt211.e0(-1208031679);
                yt211.r(false);
            }
            boolean z4 = z;
            yt2 yt212 = yt2;
            yf7.b(pb4.j(jl42, 20.0f, yt211, R.string.vpn_config_section, yt211), (ml4) null, z08.l(uq3.d(4286945452L), uq3.d(4286485416L)), ya5.k(13), am2.A, (ea7) null, ya5.k(1), (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt212, 102260736, 0, 261802);
            yt2 yt213 = yt212;
            k75.a(yt213, yu6.d(jl42, 10.0f));
            x83 x83 = gl0.z;
            if (x83 == null) {
                w83 w83 = new w83("Rounded.FolderOpen", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                int i5 = e38.a;
                ky6 ky6 = new ky6(jt0.b);
                be5 be5 = new be5();
                be5.j(20.0f, 6.0f);
                be5.g(-8.0f);
                be5.i(-1.41f, -1.41f);
                be5 be52 = be5;
                be52.d(10.21f, 4.21f, 9.7f, 4.0f, 9.17f, 4.0f);
                be5 be53 = be52;
                be53.h(4.0f, 4.0f);
                be52.e(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                be53.h(2.0f, 18.0f);
                be52.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                be53.g(16.0f);
                be52.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                be53.h(22.0f, 8.0f);
                be52.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                b81.v(be53, 19.0f, 18.0f, 5.0f, 18.0f);
                be52.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                be53.h(4.0f, 9.0f);
                be52.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                be53.g(14.0f);
                be52.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                be53.n(8.0f);
                be52.e(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                be53.c();
                w83.a(w83, be53.a, ky6, 14336);
                x83 = w83.b();
                gl0.z = x83;
            }
            a(x83, z08.l(uq3.d(4292667899L), uq3.d(4279644750L)), z08.d(), l55.u(R.string.vpn_load_file, yt213), l55.u(R.string.vpn_load_file_desc, yt213), sr2, yt213, (i4 << 9) & 458752);
            k75.a(yt213, yu6.d(jl42, 10.0f));
            x83 x832 = fd1.l;
            if (x832 == null) {
                w83 w832 = new w83("Rounded.CloudDownload", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                int i6 = e38.a;
                ky6 ky62 = new ky6(jt0.b);
                be5 e = pb4.e(19.35f, 10.04f);
                e.d(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
                e.d(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
                e.d(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
                e.e(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
                be5 be54 = e;
                be54.g(13.0f);
                e.e(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
                e.e(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
                be54.c();
                be54.j(17.0f, 13.0f);
                be54.i(-4.65f, 4.65f);
                e.e(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f);
                be54.h(7.0f, 13.0f);
                be54.g(3.0f);
                be54.m(9.0f);
                be54.g(4.0f);
                be54.n(4.0f);
                be54.g(3.0f);
                be54.c();
                w83.a(w832, be54.a, ky62, 14336);
                x832 = w832.b();
                fd1.l = x832;
            }
            a(x832, z08.j(), z08.i(), l55.u(R.string.vpn_auto_config, yt213), l55.u(R.string.vpn_auto_config_desc, yt213), sr22, yt213, (i4 << 6) & 458752);
            k75.a(yt213, yu6.d(jl42, 10.0f));
            a(ar7.z(), z08.l(uq3.d(4292994295L), uq3.d(4280625997L)), z08.l(uq3.d(4284181447L), uq3.d(4288127976L)), l55.u(R.string.vpn_request_config, yt213), l55.u(R.string.vpn_request_config_desc, yt213), sr23, yt213, (i4 << 3) & 458752);
            k75.a(yt213, yu6.d(jl42, 24.0f));
            if (z3 || str3 != null) {
                z4 = true;
            }
            o96 a7 = q96.a(18.0f);
            pa5 pa5 = yd0.a;
            if (z3) {
                j2 = b;
            }
            w782 = w78;
            yt2 yt214 = yt213;
            gw8.a(sr24, yu6.d(sd29, 56.0f), z4, a7, yd0.a(j2, 0, z08.h(), 0, yt213, 10), (ce0) null, (ua0) null, (la5) null, su0.J(-790104207, new a88(w782, 1), yt213), yt214, ((i4 >> 15) & 14) | 805306416, 480);
            yt22 = yt214;
            k75.a(yt22, yu6.d(jl42, 24.0f));
            yt22.r(true);
            yt22.r(true);
        } else {
            w782 = w783;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dw0((Object) w782, (Object) ru4, (Object) sr2, (ds2) sr22, (Object) sr23, (ds2) sr24, i, 11);
        }
    }
}
