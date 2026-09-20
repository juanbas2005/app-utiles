package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: b30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class b30 {
    public static final long a = uq3.d(4279391610L);
    public static final long b = uq3.d(4278460474L);
    public static final long c = uq3.d(4279793650L);
    public static final long d = uq3.d(4278225100L);
    public static final long e = uq3.d(4280669030L);
    public static final long f = uq3.d(4293542709L);
    public static final /* synthetic */ int g = 0;

    static {
        uq3.d(4278290271L);
    }

    public static final void a(k20 k20, gs2 gs2, yt2 yt2, int i) {
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        k20 k202 = k20;
        gs2 gs22 = gs2;
        yt2 yt22 = yt2;
        int i6 = i;
        yt22.g0(-1132995090);
        if ((i6 & 6) == 0) {
            if (yt22.g(k202)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 48) == 0) {
            if (yt22.i(gs22)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            Context context = (Context) yt22.k(ye.b);
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = u55.p((Object) null);
                yt22.o0(Q);
            }
            aq4 aq4 = (aq4) Q;
            i20 i20 = (i20) aq4.getValue();
            if (i20 == null) {
                i3 = -1;
            } else {
                i3 = a30.a[i20.ordinal()];
            }
            switch (i3) {
                case -1:
                    yt22.e0(2113463666);
                    yt22.r(false);
                    break;
                case 1:
                    yt22.e0(2113420439);
                    String u = l55.u(R.string.link_privacy_policy, yt22);
                    String u2 = l55.u(R.string.dialog_privacy_text, yt22);
                    Object Q2 = yt22.Q();
                    if (Q2 == d63) {
                        Q2 = new wi(aq4, 8);
                        yt22.o0(Q2);
                    }
                    h(u, u2, (sr2) Q2, yt22, 384);
                    yt22.r(false);
                    break;
                case 2:
                    yt22.e0(2113427793);
                    String u3 = l55.u(R.string.link_useful_tips, yt22);
                    String u4 = l55.u(R.string.dialog_tips_text, yt22);
                    Object Q3 = yt22.Q();
                    if (Q3 == d63) {
                        Q3 = new wi(aq4, 9);
                        yt22.o0(Q3);
                    }
                    h(u3, u4, (sr2) Q3, yt22, 384);
                    yt22.r(false);
                    break;
                case 3:
                    yt22.e0(2113435056);
                    String u5 = l55.u(R.string.link_credits, yt22);
                    String u6 = l55.u(R.string.dialog_credits_text, yt22);
                    Object Q4 = yt22.Q();
                    if (Q4 == d63) {
                        Q4 = new wi(aq4, 12);
                        yt22.o0(Q4);
                    }
                    h(u5, u6, (sr2) Q4, yt22, 384);
                    yt22.r(false);
                    break;
                case 4:
                    yt22.e0(2113442356);
                    String u7 = l55.u(R.string.link_changelog, yt22);
                    String u8 = l55.u(R.string.dialog_changelog_text, yt22);
                    Object Q5 = yt22.Q();
                    if (Q5 == d63) {
                        Q5 = new wi(aq4, 13);
                        yt22.o0(Q5);
                    }
                    h(u7, u8, (sr2) Q5, yt22, 384);
                    yt22.r(false);
                    break;
                case 5:
                    yt22.e0(2113449528);
                    List list = k202.a;
                    Object Q6 = yt22.Q();
                    if (Q6 == d63) {
                        Q6 = new wi(aq4, 14);
                        yt22.o0(Q6);
                    }
                    m(list, (sr2) Q6, yt22, 48);
                    yt22.r(false);
                    break;
                case 6:
                    yt22.e0(2113453855);
                    Object Q7 = yt22.Q();
                    if (Q7 == d63) {
                        Q7 = new wi(aq4, 15);
                        yt22.o0(Q7);
                    }
                    e((sr2) Q7, yt22, 6);
                    yt22.r(false);
                    break;
                case 7:
                    yt22.e0(2113456577);
                    if ((i2 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object Q8 = yt22.Q();
                    if (z2 || Q8 == d63) {
                        Q8 = new w20(gs22, aq4, 0);
                        yt22.o0(Q8);
                    }
                    gs2 gs23 = (gs2) Q8;
                    Object Q9 = yt22.Q();
                    if (Q9 == d63) {
                        Q9 = new wi(aq4, 16);
                        yt22.o0(Q9);
                    }
                    f(48, (sr2) Q9, gs23, yt22);
                    yt22.r(false);
                    break;
                default:
                    yt22.e0(2113419962);
                    yt22.r(false);
                    h.c();
                    return;
            }
            ml4 Z = t49.Z(yu6.c, t49.Y(yt22), true);
            au0 a2 = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, Z);
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
            g(0, yt22);
            o96 b2 = q96.b(24.0f, 24.0f);
            o96 o96 = b2;
            we.b(yu6.a, o96, rc9.w(o(), yt22, 24576), rc9.x(62, 0.0f), su0.J(-924522538, new gc5(4, (Object) context, (Object) aq4), yt22), yt22, 196614, 16);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dj7((Object) k202, (Object) gs22, i6, 2);
        }
    }

    public static final void b(is2 is2, c30 c30, yt2 yt2, int i) {
        int i2;
        boolean z;
        is2.getClass();
        yt2.g0(-1026190489);
        if (yt2.g(is2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i | 16;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            yt2.a0();
            if ((i & 1) == 0 || yt2.C()) {
                a68 a2 = va4.a(yt2);
                if (a2 != null) {
                    c30 = (c30) n85.p(b26.a.b(c30.class), a2, b96.O(o85.l(a2), yt2), o85.k(a2), yt2);
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt2.Y();
            }
            int i4 = i3 & -113;
            yt2.s();
            sg3.c((is7) hj8.n(c30.d, yt2).getValue(), is2, su0.J(-1022105835, new gc5(3, (Object) is2, (Object) c30), yt2), yt2, ((i4 << 3) & 112) | 392);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new p13(is2, c30, i, 4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    public static final void c(x83 x83, long j, String str, boolean z, sr2 sr2, yt2 yt2, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        yx5 v;
        long n;
        int i6;
        int i7;
        long j2 = j;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        int i8 = i;
        yt22.g0(-145214253);
        if (yt22.g(x83)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i3 | i8;
        if ((i8 & 48) == 0) {
            if (yt22.f(j2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i9 |= i7;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i9 |= 3072;
        } else if ((i8 & 3072) == 0) {
            z2 = z;
            if (yt22.h(z2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i9 |= i6;
            if (!yt22.i(sr22)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i5 = i9 | i4;
            if ((i5 & 9363) == 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!yt22.V(i5 & 1, z3)) {
                if (i10 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                ml4 M = x91.M(h49.u(yu6.a, false, (String) null, sr22, 15), 0.0f, 10.0f, 1);
                ea6 a2 = ca6.a(wr.a, xb4.I, yt22, 48);
                int hashCode = Long.hashCode(yt22.T);
                vf5 m = yt22.m();
                ml4 E = gw8.E(yt22, M);
                ux0.d.getClass();
                vy0 vy0 = tx0.b;
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                ck ckVar = tx0.f;
                g75.Q(ckVar, yt22, a2);
                ck ckVar2 = tx0.e;
                g75.Q(ckVar2, yt22, m);
                Integer valueOf = Integer.valueOf(hashCode);
                ck ckVar3 = tx0.g;
                g75.Q(ckVar3, yt22, valueOf);
                ce ceVar = tx0.h;
                g75.O(yt22, ceVar);
                ck ckVar4 = tx0.d;
                g75.Q(ckVar4, yt22, E);
                jl4 jl4 = jl4.w;
                int i11 = i5;
                ml4 h = b96.h(we.f(yu6.l(jl4, 40.0f), q96.a(10.0f)), jt0.b(0.1f, j2), gr8.h);
                lh4 d2 = mb0.d(xb4.C, false);
                int hashCode2 = Long.hashCode(yt22.T);
                vf5 m2 = yt22.m();
                ml4 E2 = gw8.E(yt22, h);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(ckVar, yt22, d2);
                g75.Q(ckVar2, yt22, m2);
                f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
                g75.Q(ckVar4, yt22, E2);
                d83.a(x83, (String) null, yu6.l(jl4, 22.0f), j, yt22, (i11 & 14) | 432 | ((i11 << 6) & 7168), 0);
                yt22.r(true);
                k75.a(yt22, yu6.p(jl4, 14.0f));
                if (z4) {
                    n = f;
                } else {
                    n = n();
                }
                yf7.b(str, (ml4) null, n, ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 24582, 0, 262122);
                yt22.r(true);
            } else {
                yt22.Y();
                z4 = z2;
            }
            v = yt22.v();
            if (v == null) {
                v.d = new t20(x83, j, str, z4, sr22, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if (!yt22.i(sr22)) {
        }
        i5 = i9 | i4;
        if ((i5 & 9363) == 9362) {
        }
        if (!yt22.V(i5 & 1, z3)) {
        }
        v = yt22.v();
        if (v == null) {
        }
    }

    public static final void d(int i, vr2 vr2, yt2 yt2, String str, String str2) {
        int i2;
        int i3;
        int i4;
        boolean z;
        String str3;
        vr2 vr22;
        boolean z2;
        boolean z3;
        vr2 vr23 = vr2;
        yt2 yt22 = yt2;
        String str4 = str2;
        yt22.g0(-1835174599);
        if (yt2.g(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (yt22.g(str4)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (yt22.i(vr23)) {
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
            sd2 sd2 = yu6.a;
            ea6 a2 = ca6.a(wr.a, xb4.I, yt22, 48);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, sd2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, a2);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            lz3 lz3 = new lz3(1.0f, true);
            au0 a3 = zt0.a(wr.c, xb4.K, yt22, 0);
            ce ceVar2 = ceVar;
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, lz3);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a3);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar2);
            g75.Q(ckVar4, yt22, E2);
            yt2 yt23 = yt2;
            int i8 = i7;
            yf7.b(str, (ml4) null, n(), ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, (i7 & 14) | 24576, 0, 262122);
            String str5 = str2;
            yf7.b(str5, (ml4) null, p(), ya5.k(16), am2.A, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, ((i8 >> 3) & 14) | 1597440, 0, 262058);
            str3 = str5;
            yt22 = yt23;
            yt22.r(true);
            k75.a(yt22, yu6.p(jl4.w, 8.0f));
            if ((i8 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i8 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = z3 | z2;
            Object Q = yt22.Q();
            if (z4 || Q == ay0.a) {
                vr22 = vr2;
                Q = new r20(vr22, str3, 0);
                yt22.o0(Q);
            } else {
                vr22 = vr2;
            }
            gw8.e((sr2) Q, (ml4) null, false, (pq6) null, (xd0) null, (la5) null, bb0.n, yt22, 805306368, 510);
            yt22.r(true);
        } else {
            vr22 = vr23;
            str3 = str4;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new s20(str, str3, vr22, i);
        }
    }

    public static final void e(sr2 sr2, yt2 yt2, int i) {
        boolean z;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(215627029);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i & 1, z)) {
            Context context = (Context) yt22.k(ye.b);
            cs0 cs0 = (cs0) yt22.k(xy0.e);
            String u = l55.u(R.string.donate_copied, yt22);
            boolean i2 = yt22.i(cs0) | yt22.i(context) | yt22.g(u);
            Object Q = yt22.Q();
            if (i2 || Q == ay0.a) {
                Q = new g5((Object) cs0, (Object) context, (Object) u, 2);
                yt22.o0(Q);
            }
            su0.a(sr22, su0.J(1067057501, new ce4(1, sr22), yt22), (ml4) null, (gs2) null, (gs2) null, bb0.m, su0.J(-553062878, new l20(0, (vr2) Q), yt22), (pq6) null, o(), 0, 0, 0, (wu1) null, yt2, 1769526, 16028);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ce4(i, 2, sr22);
        }
    }

    public static final void f(int i, sr2 sr2, gs2 gs2, yt2 yt2) {
        int i2;
        boolean z;
        int i3 = i;
        sr2 sr22 = sr2;
        gs2 gs22 = gs2;
        yt2 yt22 = yt2;
        yt22.g0(1208852473);
        if (yt22.i(gs22)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i4 & 1, z)) {
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = u55.p(b56.w);
                yt22.o0(Q);
            }
            aq4 aq4 = (aq4) Q;
            Object Q2 = yt22.Q();
            if (Q2 == d63) {
                Q2 = u55.p("");
                yt22.o0(Q2);
            }
            aq4 aq42 = (aq4) Q2;
            long o = o();
            su0.a(sr22, su0.J(-766164927, new y30((ds2) gs22, aq4, aq42, 6), yt22), (ml4) null, su0.J(-1200670525, new ce4(3, sr22), yt22), (gs2) null, bb0.f, su0.J(295054726, new o20(aq4, aq42, 0), yt22), (pq6) null, o, 0, 0, 0, (wu1) null, yt2, 1772598, 16020);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new p20(gs2, sr22, i3);
        }
    }

    public static final void g(int i, yt2 yt2) {
        boolean z;
        int i2 = i;
        yt2 yt22 = yt2;
        yt22.g0(-1068633228);
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            ml4 g2 = b96.g(yu6.d(yu6.a, 140.0f), new p64(sg3.E(new jt0(a), new jt0(b)), (List) null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)));
            lh4 d2 = mb0.d(xb4.C, false);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, g2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, d2);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            ed1.b(p25.x(R.drawable.ic_app_logo, yt22), (String) null, yu6.l(jl4.w, 84.0f), (jb) null, (j51) null, 0.0f, yt22, 440, 120);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new vw0(i2, 2);
        }
    }

    public static final void h(String str, String str2, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        String str3 = str;
        String str4 = str2;
        yt2 yt22 = yt2;
        yt22.g0(1650454772);
        if (yt22.g(str3)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (yt22.g(str4)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i5 & 1, z)) {
            sr2 sr22 = sr2;
            su0.a(sr22, su0.J(-324562628, new ce4(5, sr22), yt22), (ml4) null, (gs2) null, (gs2) null, su0.J(-1193573824, new q20(str3, 0), yt22), su0.J(736657025, new q20(str4, 1), yt22), (pq6) null, o(), 0, 0, 0, (wu1) null, yt22, 1769526, 16028);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new y30(i, 7, str3, str4, sr2);
        }
    }

    public static final void i(String str, sr2 sr2, yt2 yt2, int i) {
        int i2;
        boolean z;
        String str2;
        String str3 = str;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(501138282);
        if (yt22.g(str3)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i3 & 1, z)) {
            ml4 u = h49.u(yu6.a, false, (String) null, sr22, 15);
            au0 a2 = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, u);
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
            int i4 = i3;
            long p = p();
            long k = ya5.k(15);
            am2 am2 = am2.A;
            yf7.b(str3, x91.M(jl4.w, 0.0f, 12.0f, 1), p, k, am2, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt2, (i4 & 14) | 1597488, 0, 262056);
            str2 = str3;
            yt22 = yt2;
            kl8.c((ml4) null, 0.0f, r(uq3.d(4292927712L), uq3.d(4281090902L)), yt22, 0, 3);
            yt22.r(true);
        } else {
            str2 = str3;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new u20(str2, sr2, i, 0);
        }
    }

    public static final void j(int i, yt2 yt2) {
        boolean z;
        yt2 yt22;
        yt2.g0(-1365290490);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i & 1, z)) {
            yt22 = yt2;
            kl8.c(x91.M(jl4.w, 0.0f, 4.0f, 1), 0.0f, r(uq3.d(4292927712L), uq3.d(4281090902L)), yt22, 6, 2);
        } else {
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new vw0(i, 3);
        }
    }

    public static final void k(String str, yt2 yt2, int i) {
        int i2;
        boolean z;
        String str2;
        String str3 = str;
        yt2 yt22 = yt2;
        yt22.g0(1962035445);
        if (yt22.g(str3)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i3 & 1, z)) {
            long p = p();
            long k = ya5.k(15);
            am2 am2 = am2.B;
            jl4 jl4 = jl4.w;
            yf7.b(str3, x91.M(jl4, 0.0f, 10.0f, 1), p, k, am2, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt2, (i3 & 14) | 1597488, 0, 262056);
            str2 = str3;
            yt22 = yt2;
            kl8.c((ml4) null, 1.0f, r(uq3.d(4279391610L), uq3.d(4281301934L)), yt22, 48, 1);
            k75.a(yt22, yu6.d(jl4, 8.0f));
        } else {
            str2 = str3;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new q20(i, 2, str2);
        }
    }

    public static final void l(sr2 sr2, yt2 yt2, int i) {
        int i2;
        boolean z;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(-582459143);
        if (yt22.i(sr22)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i3 & 1, z)) {
            ml4 M = x91.M(h49.u(yu6.a, false, (String) null, sr22, 15), 0.0f, 12.0f, 1);
            ea6 a2 = ca6.a(wr.a, xb4.I, yt22, 48);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, M);
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
            x83 x83 = l55.b;
            if (x83 == null) {
                w83 w83 = new w83("Rounded.Share", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                int i4 = e38.a;
                ky6 ky6 = new ky6(jt0.b);
                be5 e2 = pb4.e(18.0f, 16.08f);
                e2.e(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
                e2.h(8.91f, 12.7f);
                e2.e(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
                e2.l(-0.04f, -0.47f, -0.09f, -0.7f);
                e2.i(7.05f, -4.11f);
                e2.e(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
                e2.e(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                e2.l(-1.34f, -3.0f, -3.0f, -3.0f);
                e2.l(-3.0f, 1.34f, -3.0f, 3.0f);
                e2.e(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
                e2.h(8.04f, 9.81f);
                e2.d(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
                e2.e(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                e2.l(1.34f, 3.0f, 3.0f, 3.0f);
                e2.e(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
                e2.i(7.12f, 4.16f);
                e2.e(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
                e2.e(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
                e2.l(2.92f, -1.31f, 2.92f, -2.92f);
                e2.l(-1.31f, -2.92f, -2.92f, -2.92f);
                e2.c();
                w83.a(w83, e2.a, ky6, 14336);
                x83 = w83.b();
                l55.b = x83;
            }
            long p = p();
            jl4 jl4 = jl4.w;
            d83.a(x83, (String) null, yu6.l(jl4, 24.0f), p, yt22, 432, 0);
            k75.a(yt22, yu6.p(jl4, 12.0f));
            yt2 yt23 = yt2;
            yf7.b(l55.u(R.string.share_invite_friends, yt22), (ml4) null, p(), ya5.k(15), am2.A, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 1597440, 0, 262058);
            yt22 = yt23;
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ce4(i, 6, sr2);
        }
    }

    public static final void m(List list, sr2 sr2, yt2 yt2, int i) {
        int i2;
        boolean z;
        List list2 = list;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(-116222579);
        if (yt22.g(list2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i3 & 1, z)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : list2) {
                uy7 uy7 = ((vy7) next).d;
                Object obj = linkedHashMap.get(uy7);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(uy7, obj);
                }
                ((List) obj).add(next);
            }
            su0.a(sr22, su0.J(-1227881403, new ce4(4, sr22), yt22), (ml4) null, (gs2) null, (gs2) null, bb0.k, su0.J(608380256, new yg(1, linkedHashMap), yt22), (pq6) null, o(), 0, 0, 0, (wu1) null, yt2, 1769526, 16028);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new p13(list2, sr22, i, 5);
        }
    }

    public static final long n() {
        return r(uq3.d(4284708234L), uq3.d(4288656326L));
    }

    public static final long o() {
        return r(uq3.d(4294967295L), uq3.d(4279575600L));
    }

    public static final long p() {
        return r(uq3.d(4279381056L), uq3.d(4293127927L));
    }

    public static final void q(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            parse.getClass();
            context.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (Throwable unused) {
        }
    }

    public static final long r(long j, long j2) {
        if (d18.a()) {
            return za5.k(j2);
        }
        if (d18.b()) {
            return j2;
        }
        return j;
    }
}
