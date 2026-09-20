package defpackage;

import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: rs4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rs4 {
    public static final o96 a = q96.a(18.0f);
    public static final long b = uq3.d(4293216333L);

    public static final void a(String str, sr2 sr2, sr2 sr22, sr2 sr23, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        sr2 sr24 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(1081371016);
        String str2 = str;
        if (yt22.g(str2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (yt22.i(sr24)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (yt22.i(sr22)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (yt22.i(sr23)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i9 & 1, z)) {
            ml4 f = we.f(yu6.a, q96.a(10.0f));
            int i10 = u08.b;
            ml4 h = b96.h(f, u08.h(uq3.d(4281615708L), uq3.d(4281090902L)), gr8.h);
            if ((i9 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object Q = yt22.Q();
            if (z2 || Q == ay0.a) {
                Q = new gi0(6, sr24);
                yt22.o0(Q);
            }
            ml4 N = x91.N(h49.u(h, false, (String) null, (sr2) Q, 15), 14.0f, 4.0f, 4.0f, 4.0f);
            ea6 a2 = ca6.a(wr.a, xb4.I, yt22, 48);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, N);
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
            yf7.b(str2, new lz3(1.0f, true), u08.a, ya5.k(14), am2.z, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt2, (i9 & 14) | 1597440, 0, 262056);
            jl4 jl4 = jl4.w;
            yt22 = yt2;
            hj8.e(sr22, yu6.l(jl4, 36.0f), false, (a83) null, (pq6) null, dh4.d, yt22, ((i9 >> 6) & 14) | 1572912, 60);
            hj8.e(sr23, yu6.l(jl4, 36.0f), false, (a83) null, (pq6) null, dh4.e, yt22, ((i9 >> 9) & 14) | 1572912, 60);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new q60((Object) str, (Object) sr24, (Object) sr22, (ds2) sr23, i, 5);
        }
    }

    public static final void b(boolean z, sr2 sr2, sr2 sr22, sr2 sr23, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3 = z;
        yt2 yt22 = yt2;
        yt22.g0(-1881136143);
        if (yt22.h(z3)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (yt22.i(sr2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (yt22.i(sr22)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i7 & 1, z2)) {
            ur urVar = new ur(10.0f, true, new h(2));
            sd2 sd2 = yu6.a;
            ea6 a2 = ca6.a(urVar, xb4.H, yt22, 6);
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
            jl4 jl4 = jl4.w;
            jl4 jl42 = jl4;
            ml4 h = b96.h(we.f(yu6.l(jl4, 52.0f), q96.a(14.0f)), u08.a(), gr8.h);
            Object Q = yt22.Q();
            if (Q == ay0.a) {
                Q = new gi0(5, sr23);
                yt22.o0(Q);
            } else {
                sr2 sr24 = sr23;
            }
            ml4 u = h49.u(h, false, (String) null, (sr2) Q, 15);
            lh4 d = mb0.d(xb4.C, false);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, u);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, d);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E2);
            x83 x83 = c35.b;
            float f = 1.0f;
            if (x83 == null) {
                w83 w83 = new w83("Rounded.Timer", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                int i8 = e38.a;
                long j = jt0.b;
                ky6 ky6 = new ky6(j);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new ie5(10.0f, 3.0f));
                arrayList.add(new oe5(4.0f));
                arrayList.add(new ne5(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f));
                arrayList.add(new ne5(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f));
                arrayList.add(new oe5(-4.0f));
                arrayList.add(new fe5(9.45f, 1.0f, 9.0f, 1.45f, 9.0f, 2.0f));
                arrayList.add(new fe5(9.0f, 2.55f, 9.45f, 3.0f, 10.0f, 3.0f));
                arrayList.add(ee5.c);
                w83.a(w83, arrayList, ky6, 14336);
                ky6 ky62 = new ky6(j);
                be5 f2 = pb4.f(19.03f, 7.39f, 0.75f, -0.75f);
                f2.e(0.38f, -0.38f, 0.39f, -1.01f, 0.0f, -1.4f);
                f2.e(0.0f, 0.0f, -0.01f, -0.01f, -0.01f, -0.01f);
                f2.e(-0.39f, -0.39f, -1.01f, -0.38f, -1.4f, 0.0f);
                be5 be5 = f2;
                be5.i(-0.75f, 0.75f);
                f2.d(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
                f2.e(-4.8f, 0.0f, -8.88f, 3.96f, -9.0f, 8.76f);
                f2.d(2.87f, 17.84f, 6.94f, 22.0f, 12.0f, 22.0f);
                f2.e(4.98f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
                f2.d(21.0f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f);
                be5.c();
                be5.j(13.0f, 13.0f);
                f2.e(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                be5.l(-1.0f, -0.45f, -1.0f, -1.0f);
                be5.m(9.0f);
                f2.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                be5.l(1.0f, 0.45f, 1.0f, 1.0f);
                be5.m(13.0f);
                be5.c();
                w83.a(w83, be5.a, ky62, 14336);
                x83 = w83.b();
                c35.b = x83;
            }
            String u2 = l55.u(R.string.content_description_timer, yt22);
            long j2 = jt0.c;
            d83.a(x83, u2, yu6.l(jl42, 26.0f), j2, yt22, 3456, 0);
            long j3 = j2;
            yt22.r(true);
            if (z3) {
                yt22.e0(261644913);
                o96 a3 = q96.a(14.0f);
                pa5 pa5 = yd0.a;
                xd0 f3 = yd0.f(u08.h(uq3.d(4279974492L), uq3.d(4288329942L)), yt22);
                if (((double) 1.0f) <= 0.0d) {
                    wb3.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                gw8.b(sr22, yu6.d(new lz3(f, true), 52.0f), false, a3, f3, (ua0) null, (la5) null, dh4.h, yt22, ((i7 >> 6) & 14) | 805306368, 484);
                yt22.r(false);
            } else {
                yt22.e0(262152166);
                o96 a4 = q96.a(14.0f);
                pa5 pa52 = yd0.a;
                xd0 a5 = yd0.a(jt0.f, j3, 0, 0, yt22, 12);
                if (((double) 1.0f) <= 0.0d) {
                    wb3.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                yt2 yt23 = yt2;
                gw8.a(sr2, b96.g(we.f(yu6.d(new lz3(f, true), 52.0f), q96.a(14.0f)), a18.a), false, a4, a5, (ce0) null, (ua0) null, (la5) null, dh4.i, yt23, ((i7 >> 3) & 14) | 805306368, 484);
                yt22 = yt23;
                yt22.r(false);
            }
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ai0(z3, (ds2) sr2, (Object) sr22, (ds2) sr23, i, 4);
        }
    }

    public static final void c(String str, boolean z, boolean z2, String str2, vr2 vr2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        fw0 fw0;
        long j;
        long j2;
        boolean z4 = z2;
        String str3 = str2;
        yt2 yt22 = yt2;
        yt22.g0(922902139);
        String str4 = str;
        if (yt22.g(str4)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (yt22.h(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (yt22.h(z4)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i9 = i8 | i4;
        if (yt22.g(str3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (yt22.i(vr2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i11 & 1, z3)) {
            if (z4) {
                yt22.e0(2092391845);
                fw0 = su0.J(-396779629, new q20(str3, 11), yt22);
                yt22.r(false);
            } else {
                yt22.e0(2092462091);
                yt22.r(false);
                fw0 = null;
            }
            fw0 fw02 = fw0;
            o96 a2 = q96.a(13.0f);
            long d = u08.d();
            long d2 = u08.d();
            long d3 = u08.d();
            long j3 = b;
            if (z4) {
                j = j3;
            } else {
                j = u08.e();
            }
            if (z4) {
                j2 = j3;
            } else {
                j2 = u08.a();
            }
            yd7 t = pe2.t(jt0.b(0.6f, u08.g()), u08.g(), d2, d, d3, j2, j, u08.e(), j3, yt22, 2147452803);
            sd2 sd2 = yu6.a;
            ml4 ml4 = jl4.w;
            if (!z4) {
                ml4 = yu6.d(ml4, 56.0f);
            }
            int i12 = ((i11 << 3) & 7168) | 12582912;
            String str5 = str4;
            ml4 d4 = sd2.d(ml4);
            vr2 vr22 = vr2;
            z85.b(str5, vr22, d4, z, false, (tg7) null, (gs2) null, dh4.f, (gs2) null, (gs2) null, fw02, z4, (m78) null, (bt3) null, (zs3) null, true, 0, 0, a2, t, yt2, (i11 & 14) | 12582912 | ((i11 >> 9) & 112) | ((i11 << 6) & 7168), i12, 0, 1953648);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new jh1(str, z, z2, str2, vr2, i);
        }
    }

    public static final void d(boolean z, vr2 vr2, yt2 yt2, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4 = z;
        vr2 vr22 = vr2;
        yt2 yt22 = yt2;
        yt22.g0(219196160);
        if (yt22.h(z4)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i3 & 1, z2)) {
            h80 h80 = xb4.I;
            if ((i3 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object Q = yt22.Q();
            if (z3 || Q == ay0.a) {
                Q = new to0(2, vr22, z4);
                yt22.o0(Q);
            }
            jl4 jl4 = jl4.w;
            ml4 u = h49.u(jl4, false, (String) null, (sr2) Q, 15);
            ea6 a2 = ca6.a(wr.a, h80, yt22, 48);
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
            ck ckVar5 = ckVar4;
            kl8.a(z4, vr22, (ml4) null, false, hj8.o(u08.a(), u08.b(), yt22), yt22, i3 & 126, 44);
            au0 a3 = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, jl4);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a3);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar5, yt22, E2);
            yt2 yt23 = yt2;
            yf7.b(l55.u(R.string.label_force_reconnect, yt22), (ml4) null, u08.g(), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 24576, 0, 262122);
            yt22 = yt23;
            yt22.r(true);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new wi5(z, vr2, i, 3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:157:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0286  */
    public static final void e(boolean z, String str, String str2, List list, Long l, boolean z2, vr2 vr2, gs2 gs2, is2 is2, sr2 sr2, sr2 sr22, vr2 vr22, sr2 sr23, sr2 sr24, sr2 sr25, yt2 yt2, int i, int i2) {
        int i3;
        int i4;
        sr2 sr26;
        String str3;
        boolean z3;
        boolean z4;
        boolean z5;
        yt2 yt22;
        String str4;
        boolean z6;
        boolean z7 = z;
        List list2 = list;
        Long l2 = l;
        vr2 vr23 = vr2;
        yt2 yt23 = yt2;
        int i5 = i;
        int i6 = i2;
        yt23.g0(-1410861099);
        if ((i5 & 6) == 0) {
            i3 = (yt23.h(z7) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        String str5 = str;
        if ((i5 & 48) == 0) {
            i3 |= yt23.g(str5) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i3 |= yt23.g(str2) ? 256 : 128;
        } else {
            String str6 = str2;
        }
        int i7 = 1024;
        if ((i5 & 3072) == 0) {
            i3 |= (i5 & 4096) == 0 ? yt23.g(list2) : yt23.i(list2) ? 2048 : 1024;
        }
        int i8 = 8192;
        if ((i5 & 24576) == 0) {
            i3 |= yt23.g(l2) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i3 |= yt23.h(z2) ? 131072 : 65536;
        } else {
            boolean z8 = z2;
        }
        if ((i5 & 1572864) == 0) {
            i3 |= yt23.i(vr23) ? 1048576 : 524288;
        }
        is2 is22 = is2;
        if ((i5 & 100663296) == 0) {
            i3 |= yt23.i(is22) ? 67108864 : 33554432;
        }
        sr2 sr27 = sr2;
        if ((i5 & 805306368) == 0) {
            i3 |= yt23.i(sr27) ? 536870912 : 268435456;
        }
        int i9 = i3;
        if ((i6 & 6) == 0) {
            i4 = i6 | (yt23.i(sr22) ? 4 : 2);
        } else {
            sr2 sr28 = sr22;
            i4 = i6;
        }
        vr2 vr24 = vr22;
        if ((i6 & 48) == 0) {
            i4 |= yt23.i(vr24) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            sr26 = sr23;
            i4 |= yt23.i(sr26) ? 256 : 128;
        } else {
            sr26 = sr23;
        }
        if ((i6 & 3072) == 0) {
            if (yt23.i(sr24)) {
                i7 = 2048;
            }
            i4 |= i7;
        } else {
            sr2 sr29 = sr24;
        }
        if ((i6 & 24576) == 0) {
            if (yt23.i(sr25)) {
                i8 = 16384;
            }
            i4 |= i8;
        } else {
            sr2 sr210 = sr25;
        }
        int i10 = i4;
        boolean z9 = true;
        if (yt23.V(i9 & 1, ((i9 & 302589075) == 302589074 && (i10 & 9363) == 9362) ? false : true)) {
            int i11 = i9 & 14;
            boolean z10 = i11 == 4;
            Object Q = yt23.Q();
            boolean z11 = z10;
            d63 d63 = ay0.a;
            if (z11 || Q == d63) {
                Q = u55.p(z ? str5 : "");
                yt23.o0(Q);
            }
            aq4 aq4 = (aq4) Q;
            boolean z12 = i11 == 4;
            Object Q2 = yt23.Q();
            if (z12 || Q2 == d63) {
                Q2 = u55.p("");
                yt23.o0(Q2);
            }
            aq4 aq42 = (aq4) Q2;
            Object Q3 = yt23.Q();
            if (Q3 == d63) {
                Q3 = u55.p(Boolean.FALSE);
                yt23.o0(Q3);
            }
            aq4 aq43 = (aq4) Q3;
            Object Q4 = yt23.Q();
            if (Q4 == d63) {
                Q4 = u55.p(Boolean.FALSE);
                yt23.o0(Q4);
            }
            aq4 aq44 = (aq4) Q4;
            Object Q5 = yt23.Q();
            if (Q5 == d63) {
                Q5 = u55.p(Boolean.FALSE);
                yt23.o0(Q5);
            }
            aq4 aq45 = (aq4) Q5;
            aq4 aq46 = aq42;
            Object Q6 = yt23.Q();
            if (Q6 == d63) {
                Q6 = u55.p((Object) null);
                yt23.o0(Q6);
            }
            aq4 aq47 = (aq4) Q6;
            String u = l55.u(R.string.error_nauta_email_domain, yt23);
            if (z || d57.I0((String) aq4.getValue())) {
                str3 = u;
            } else {
                str3 = u;
                String lowerCase = d57.k1((String) aq4.getValue()).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (!p(lowerCase)) {
                    z3 = true;
                    if (!((Boolean) aq45.getValue()).booleanValue()) {
                        yt23.e0(-411776572);
                        boolean z13 = l != null;
                        z4 = z3;
                        Object Q7 = yt23.Q();
                        if (Q7 == d63) {
                            z6 = z13;
                            Q7 = new vo2(aq45, 19);
                            yt23.o0(Q7);
                        } else {
                            z6 = z13;
                        }
                        m(z6, vr24, sr26, (sr2) Q7, yt23, (i10 & 896) | (i10 & 112) | 3072);
                        yt22 = yt23;
                        z5 = false;
                        yt22.r(false);
                    } else {
                        z4 = z3;
                        yt22 = yt23;
                        z5 = false;
                        yt22.e0(-411552659);
                        yt22.r(false);
                    }
                    str4 = (String) aq47.getValue();
                    if (str4 != null) {
                        yt22.e0(-411521226);
                        yt22.r(z5);
                    } else {
                        yt22.e0(-411521225);
                        if ((i9 & 3670016) != 1048576) {
                            z9 = false;
                        }
                        boolean g = z9 | yt22.g(str4);
                        Object Q8 = yt22.Q();
                        if (g || Q8 == d63) {
                            Q8 = new p03(vr23, str4, aq47);
                            yt22.o0(Q8);
                        }
                        sr2 sr211 = (sr2) Q8;
                        Object Q9 = yt22.Q();
                        if (Q9 == d63) {
                            Q9 = new vo2(aq47, 20);
                            yt22.o0(Q9);
                        }
                        k(str4, sr211, (sr2) Q9, yt22, 384);
                        yt22.r(false);
                    }
                    yt2 yt24 = yt2;
                    we.b(yu6.a, a, rc9.w(u08.c(), yt22, 24576), rc9.x(62, 2.0f), su0.J(1026208839, new ls4(sr25, z, list, aq4, aq46, is22, z4, str3, l, sr27, aq47, str2, sr24, sr22, z2, aq43, aq44, aq45), yt24), yt24, 196662, 16);
                }
            }
            z3 = false;
            if (!((Boolean) aq45.getValue()).booleanValue()) {
            }
            str4 = (String) aq47.getValue();
            if (str4 != null) {
            }
            yt2 yt242 = yt2;
            we.b(yu6.a, a, rc9.w(u08.c(), yt22, 24576), rc9.x(62, 2.0f), su0.J(1026208839, new ls4(sr25, z, list, aq4, aq46, is22, z4, str3, l, sr27, aq47, str2, sr24, sr22, z2, aq43, aq44, aq45), yt242), yt242, 196662, 16);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ms4(z, str, str2, list, l, z2, vr2, gs2, is2, sr2, sr22, vr22, sr23, sr24, sr25, i, i2);
        }
    }

    public static final void f(sr2 sr2, yt2 yt2, int i) {
        int i2;
        boolean z;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(-1129861452);
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
            sd2 sd2 = yu6.a;
            lh4 d = mb0.d(xb4.y, false);
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
            g75.Q(ckVar, yt22, d);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            i80 i80 = xb4.C;
            qb0 qb0 = qb0.a;
            jl4 jl4 = jl4.w;
            ml4 a2 = qb0.a(jl4, i80);
            ea6 a3 = ca6.a(wr.a, xb4.I, yt22, 48);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, a2);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a3);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E2);
            jl4 jl42 = jl4;
            yt2 yt23 = yt2;
            yf7.b("Nauta", (ml4) null, u08.g(), ya5.k(28), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 1597446, 0, 262058);
            yt22 = yt23;
            k75.a(yt22, yu6.p(jl42, 6.0f));
            d83.a(j45.i(), (String) null, yu6.l(jl42, 22.0f), u08.a(), yt22, 432, 0);
            yt22.r(true);
            sr22 = sr2;
            hj8.e(sr22, yu6.l(qb0.a(jl42, xb4.A), 32.0f), false, (a83) null, (pq6) null, dh4.c, yt22, (i3 & 14) | 1572864, 60);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ce4(i, 21, sr22);
        }
    }

    public static final void g(is2 is2, vs4 vs4, yt2 yt2, int i) {
        int i2;
        boolean z;
        is2.getClass();
        yt2.g0(449320477);
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
                    vs4 = (vs4) n85.p(b26.a.b(vs4.class), a2, b96.O(o85.l(a2), yt2), o85.k(a2), yt2);
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt2.Y();
            }
            int i4 = i3 & -113;
            yt2.s();
            sg3.c((is7) hj8.n(vs4.g, yt2).getValue(), is2, su0.J(1771175702, new xa7(7, (Object) vs4), yt2), yt2, ((i4 << 3) & 112) | 392);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new p13(is2, vs4, i, 26);
        }
    }

    public static final void h(hs4 hs4, boolean z, is2 is2, sr2 sr2, sr2 sr22, vr2 vr2, gs2 gs2, vr2 vr22, sr2 sr23, sr2 sr24, sr2 sr25, yt2 yt2, int i) {
        int i2;
        vr2 vr23;
        boolean z2;
        yt2 yt22;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        hs4 hs42 = hs4;
        yt2 yt23 = yt2;
        int i13 = i;
        yt23.g0(1340643888);
        int i14 = 4;
        if ((i13 & 6) == 0) {
            if (yt23.g(hs42)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i13;
        } else {
            i2 = i13;
        }
        boolean z3 = z;
        if ((i13 & 48) == 0) {
            if (yt23.h(z3)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        is2 is22 = is2;
        if ((i13 & 384) == 0) {
            if (yt23.i(is22)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i2 |= i10;
        }
        sr2 sr26 = sr2;
        if ((i13 & 3072) == 0) {
            if (yt23.i(sr26)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        sr2 sr27 = sr22;
        if ((i13 & 24576) == 0) {
            if (yt23.i(sr27)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i13) == 0) {
            if (yt23.i(vr2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i2 |= i7;
        } else {
            vr2 vr24 = vr2;
        }
        gs2 gs22 = gs2;
        if ((1572864 & i13) == 0) {
            if (yt23.i(gs22)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((12582912 & i13) == 0) {
            vr23 = vr22;
            if (yt23.i(vr23)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        } else {
            vr23 = vr22;
        }
        sr2 sr28 = sr23;
        if ((100663296 & i13) == 0) {
            if (yt23.i(sr28)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        }
        sr2 sr29 = sr24;
        if ((805306368 & i13) == 0) {
            if (yt23.i(sr29)) {
                i3 = 536870912;
            } else {
                i3 = 268435456;
            }
            i2 |= i3;
        }
        sr2 sr210 = sr25;
        if (!yt23.i(sr210)) {
            i14 = 2;
        }
        int i15 = i2;
        if ((i2 & 306783379) == 306783378 && (i14 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (yt23.V(i15 & 1, z2)) {
            int i16 = i14;
            ml4 O = x91.O(x91.M(t49.Z(yu6.c, t49.Y(yt23), true), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            au0 a2 = zt0.a(wr.e, xb4.K, yt23, 6);
            int hashCode = Long.hashCode(yt23.T);
            vf5 m = yt23.m();
            ml4 E = gw8.E(yt23, O);
            ux0.d.getClass();
            int i17 = hashCode;
            vy0 vy0 = tx0.b;
            yt23.i0();
            if (yt23.S) {
                yt23.l(vy0);
            } else {
                yt23.r0();
            }
            g75.Q(tx0.f, yt23, a2);
            g75.Q(tx0.e, yt23, m);
            g75.Q(tx0.g, yt23, Integer.valueOf(i17));
            g75.O(yt23, tx0.h);
            g75.Q(tx0.d, yt23, E);
            jl4 jl4 = jl4.w;
            k75.a(yt23, yu6.d(jl4, 8.0f));
            jl4 jl42 = jl4;
            jl4 jl43 = jl42;
            jl4 jl44 = jl43;
            jl4 jl45 = jl44;
            int i18 = i15 << 3;
            int i19 = ((i15 << 12) & 458752) | (i18 & 3670016) | (i18 & 29360128);
            int i20 = i15 << 18;
            int i21 = i19 | (i20 & 234881024) | (i20 & 1879048192);
            int i22 = i15 >> 18;
            int i23 = (i22 & 7168) | ((i15 >> 12) & 14) | (i22 & 112) | (i22 & 896) | ((i16 << 12) & 57344);
            jl4 jl46 = jl45;
            yt2 yt24 = yt2;
            e(hs42.a, hs42.b, hs42.c, hs42.d, hs42.e, z3, vr2, gs22, is22, sr26, sr27, vr23, sr28, sr29, sr210, yt24, i21, i23);
            yt22 = yt24;
            k75.a(yt22, yu6.d(jl46, 12.0f));
            yt22.r(true);
        } else {
            yt22 = yt23;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ks4(hs4, z, is2, sr2, sr22, vr2, gs2, vr22, sr23, sr24, sr25, i);
        }
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [m78] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static final void i(String str, boolean z, vr2 vr2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        yt2 yt22 = yt2;
        yt22.g0(925192903);
        if (yt22.g(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (yt22.h(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (yt22.i(vr2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i7 & 1, z2)) {
            bt3 bt3 = new bt3(7, 0, 121);
            Object obj = new Object();
            o96 a2 = q96.a(13.0f);
            long d = u08.d();
            bt3 bt32 = bt3;
            long d2 = u08.d();
            long d3 = u08.d();
            bt3 bt33 = bt32;
            long e = u08.e();
            bt3 bt34 = bt33;
            int i8 = i7;
            boolean z3 = z;
            ? r12 = obj;
            vr2 vr22 = vr2;
            int i9 = ((i8 << 6) & 7168) | (i8 & 14) | 1573248 | ((i8 >> 3) & 112);
            String str2 = str;
            z85.b(str2, vr22, yu6.a, z3, false, (tg7) null, dh4.g, (gs2) null, (gs2) null, (gs2) null, (gs2) null, false, r12, bt34, (zs3) null, true, 0, 0, a2, pe2.t(jt0.b(0.6f, u08.g()), 0, d2, d, d3, u08.a(), e, u08.e(), 0, yt2, 2147469195), yt2, i9, 12582912, 0, 1916848);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new qs4(str, z, vr2, i, 0);
        }
    }

    public static final void j(boolean z, vr2 vr2, yt2 yt2, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4 = z;
        vr2 vr22 = vr2;
        yt2 yt22 = yt2;
        yt22.g0(-223134119);
        if (yt22.h(z4)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i3 & 1, z2)) {
            h80 h80 = xb4.I;
            if ((i3 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object Q = yt22.Q();
            if (z3 || Q == ay0.a) {
                Q = new to0(1, vr22, z4);
                yt22.o0(Q);
            }
            ml4 u = h49.u(jl4.w, false, (String) null, (sr2) Q, 15);
            ea6 a2 = ca6.a(wr.a, h80, yt22, 48);
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
            kl8.a(z4, vr22, (ml4) null, false, hj8.o(u08.a(), u08.b(), yt22), yt22, i3 & 126, 44);
            yt2 yt23 = yt2;
            yf7.b(l55.u(R.string.label_remember_me, yt22), (ml4) null, u08.g(), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 24576, 0, 262122);
            yt22 = yt23;
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new wi5(z, vr2, i, 2);
        }
    }

    public static final void k(String str, sr2 sr2, sr2 sr22, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        String str2 = str;
        sr2 sr23 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(142089956);
        if (yt22.g(str2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (yt22.i(sr23)) {
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
            sr2 sr24 = sr22;
            su0.a(sr24, su0.J(1495896876, new ce4(19, sr23), yt22), (ml4) null, su0.J(-291972946, new ce4(20, sr24), yt22), (gs2) null, dh4.q, su0.J(1321189617, new q20(str2, 10), yt22), (pq6) null, u08.c(), 0, 0, 0, (wu1) null, yt22, 1772598, 16020);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new y30(i, 28, str2, sr23, sr22);
        }
    }

    public static final void l(List list, vr2 vr2, vr2 vr22, vr2 vr23, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        vr2 vr24;
        boolean z2;
        boolean z3;
        vr2 vr25 = vr2;
        vr2 vr26 = vr22;
        yt2 yt22 = yt2;
        yt22.g0(1345612189);
        if (yt22.g(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (yt22.i(vr25)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (yt22.i(vr26)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i7 & 1, z)) {
            yt2 yt23 = yt2;
            yf7.b(l55.u(R.string.label_sign_in_with, yt22), (ml4) null, u08.f(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 24576, 0, 262122);
            yt22 = yt23;
            jl4 jl4 = jl4.w;
            k75.a(yt22, yu6.d(jl4, 8.0f));
            au0 a2 = zt0.a(new ur(6.0f, true, new h(2)), xb4.K, yt22, 6);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
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
            yt22.e0(333172679);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                yb5 yb5 = (yb5) it.next();
                String str = (String) yb5.w;
                if ((i7 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean g = z2 | yt22.g(yb5);
                Object Q = yt22.Q();
                Object obj = ay0.a;
                if (g || Q == obj) {
                    Q = new ps4(vr25, yb5, 0);
                    yt22.o0(Q);
                }
                sr2 sr2 = (sr2) Q;
                if ((i7 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean g2 = z3 | yt22.g(yb5);
                Object Q2 = yt22.Q();
                if (g2 || Q2 == obj) {
                    Q2 = new ps4(vr26, yb5, 1);
                    yt22.o0(Q2);
                }
                sr2 sr22 = (sr2) Q2;
                boolean g3 = yt22.g(yb5);
                Object Q3 = yt22.Q();
                if (g3 || Q3 == obj) {
                    Q3 = new ps4(vr23, yb5, 2);
                    yt22.o0(Q3);
                } else {
                    vr2 vr27 = vr23;
                }
                a(str, sr2, sr22, (sr2) Q3, yt22, 0);
            }
            vr24 = vr23;
            yt22.r(false);
            yt22.r(true);
        } else {
            vr24 = vr23;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new q60((Object) list, (Object) vr25, (Object) vr26, (ds2) vr24, i, 4);
        }
    }

    public static final void m(boolean z, vr2 vr2, sr2 sr2, sr2 sr22, yt2 yt2, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3 = z;
        vr2 vr22 = vr2;
        sr2 sr23 = sr2;
        sr2 sr24 = sr22;
        yt2 yt22 = yt2;
        int i7 = i;
        yt22.g0(-1691393062);
        if ((i7 & 6) == 0) {
            if (yt22.h(z3)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            i2 = i7;
        }
        if ((i7 & 48) == 0) {
            if (yt22.i(vr22)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i7 & 384) == 0) {
            if (yt22.i(sr23)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i7 & 3072) == 0) {
            if (yt22.i(sr24)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i2 & 1, z2)) {
            Object Q = yt22.Q();
            if (Q == ay0.a) {
                Q = u55.p("");
                yt22.o0(Q);
            }
            aq4 aq4 = (aq4) Q;
            su0.a(sr24, su0.J(-172348782, new y30((Object) vr22, (Object) sr24, aq4, 27), yt22), (ml4) null, su0.J(-712778288, new j92(z3, sr23, sr24, 4), yt22), (gs2) null, dh4.m, su0.J(624061101, new ns4(aq4, 0), yt22), (pq6) null, u08.c(), 0, 0, 0, (wu1) null, yt22, ((i2 >> 9) & 14) | 1772592, 16020);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new rb0(z3, vr22, sr23, sr22, i);
        }
    }

    public static final void n(i98 i98, sr2 sr2, sr2 sr22, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        i98 i982 = i98;
        sr2 sr23 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(2081188748);
        if (yt22.g(i982)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (yt22.i(sr23)) {
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
            sr2 sr24 = sr22;
            su0.a(sr24, su0.J(-859971628, new ce4(17, sr24), yt22), (ml4) null, su0.J(1647125846, new ce4(18, sr23), yt22), (gs2) null, dh4.t, su0.J(-1034678887, new yg(19, i982), yt22), (pq6) null, u08.c(), 0, 0, 0, (wu1) null, yt22, 1772598, 16020);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new y30(i, 26, i982, sr23, sr22);
        }
    }

    public static final void o(String str, String str2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        String str3;
        String str4 = str;
        String str5 = str2;
        yt2 yt22 = yt2;
        yt22.g0(1657988867);
        if (yt22.g(str4)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (yt22.g(str5)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i6 & 1, z)) {
            sd2 sd2 = yu6.a;
            ea6 a2 = ca6.a(wr.a, xb4.H, yt22, 0);
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
            g75.Q(tx0.f, yt22, a2);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            yt2 yt23 = yt2;
            yf7.b(str4, yu6.p(jl4.w, 110.0f), u08.f(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, (i6 & 14) | 24624, 0, 262120);
            str3 = str2;
            yf7.b(str3, (ml4) null, u08.g(), ya5.k(13), am2.z, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, ((i6 >> 3) & 14) | 1597440, 0, 262058);
            yt22 = yt23;
            i4 = 1;
            yt22.r(true);
        } else {
            str3 = str5;
            i4 = 1;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new wf1(i, i4, str, str3);
        }
    }

    public static final boolean p(String str) {
        String obj = d57.k1(str).toString();
        if (obj.length() <= 0 || d57.f1(obj, '@').length() <= 0) {
            return false;
        }
        if (k57.m0(obj, "@nauta.com.cu", true) || k57.m0(obj, "@nauta.co.cu", true) || k57.m0(obj, "@nautaplus", true)) {
            return true;
        }
        return false;
    }
}
