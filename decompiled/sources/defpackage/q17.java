package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import cu.lestebang.utiletecsa.R;
import java.util.Iterator;
import java.util.Map;

/* renamed from: q17  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class q17 {
    public static final Map a = sf4.V(new yb5(q07.w, new jt0(uq3.d(4281236786L))), new yb5(q07.x, new jt0(uq3.d(4283796271L))), new yb5(q07.y, new jt0(uq3.d(4289756187L))), new yb5(q07.z, new jt0(uq3.d(4291176488L))));

    public static final void a(String str, vr2 vr2, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        yt2 yt22 = yt2;
        yt22.g0(118993862);
        String str2 = str;
        if (yt22.g(str2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (yt22.i(vr2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i6 & 1, z)) {
            Context context = (Context) yt22.k(ye.b);
            Object Q = yt22.Q();
            Object obj = ay0.a;
            if (Q == obj) {
                Q = u55.p(str2);
                yt22.o0(Q);
            }
            aq4 aq4 = (aq4) Q;
            Object Q2 = yt22.Q();
            if (Q2 == obj) {
                Q2 = u55.p(r11.w);
                yt22.o0(Q2);
            }
            aq4 aq42 = (aq4) Q2;
            Object Q3 = yt22.Q();
            if (Q3 == obj) {
                Q3 = u55.p(q07.x);
                yt22.o0(Q3);
            }
            aq4 aq43 = (aq4) Q3;
            Object Q4 = yt22.Q();
            if (Q4 == obj) {
                Q4 = u55.p("");
                yt22.o0(Q4);
            }
            aq4 aq44 = (aq4) Q4;
            Object Q5 = yt22.Q();
            if (Q5 == obj) {
                Q5 = u55.p("");
                yt22.o0(Q5);
            }
            aq4 aq45 = (aq4) Q5;
            Object Q6 = yt22.Q();
            if (Q6 == obj) {
                Q6 = u55.p("");
                yt22.o0(Q6);
            }
            aq4 aq46 = (aq4) Q6;
            Object Q7 = yt22.Q();
            if (Q7 == obj) {
                Q7 = u55.p(Boolean.FALSE);
                yt22.o0(Q7);
            }
            aq4 aq47 = (aq4) Q7;
            Object Q8 = yt22.Q();
            if (Q8 == obj) {
                Q8 = u55.p((Object) null);
                yt22.o0(Q8);
            }
            aq4 aq48 = (aq4) Q8;
            s8 s8Var = new s8(false, 3);
            boolean i7 = yt22.i(context);
            Object Q9 = yt22.Q();
            if (i7 || Q9 == obj) {
                i4 = 0;
                Q9 = new h17(context, aq48, aq47, 0);
                yt22.o0(Q9);
            } else {
                i4 = 0;
            }
            aq4 aq49 = aq47;
            se4 N = tf4.N(s8Var, (vr2) Q9, yt22, i4);
            aq4 aq410 = aq42;
            aq4 aq411 = aq44;
            aq4 aq412 = aq45;
            aq4 aq413 = aq48;
            aq4 aq414 = aq43;
            aq4 aq415 = aq413;
            yt2 yt23 = yt22;
            sr2 sr22 = sr2;
            su0.a(sr22, su0.J(-977003394, new i17(vr2, aq4, aq410, aq414, aq411, aq412, aq46, aq413, aq49), yt22), (ml4) null, su0.J(-1561775044, new cw6(2, sr2), yt22), (gs2) null, rc9.i, su0.J(1856034777, new j17(aq4, aq410, aq414, aq411, aq412, aq46, context, N, aq49, aq415), yt22), (pq6) null, n(jt0.c, uq3.d(4279575600L)), 0, 0, 0, (wu1) null, yt23, 1772598, 16020);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new s46(str, vr2, sr2, i, 1);
        }
    }

    public static final void b(o11 o11, boolean z, gs2 gs2, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        yt2 yt22 = yt2;
        yt22.g0(-1631164515);
        if (yt22.i(o11)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (yt22.h(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        gs2 gs22 = gs2;
        if (yt22.i(gs22)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        sr2 sr22 = sr2;
        if (yt22.i(sr22)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i9 & 1, z2)) {
            we.b(yu6.a, q96.a(14.0f), rc9.w(n(jt0.c, uq3.d(4279575600L)), yt22, 24576), rc9.x(62, 1.0f), su0.J(-578542101, new l17(o11, z, sr22, (Context) yt22.k(ye.b), gs22), yt22), yt22, 196614, 16);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ai0((Object) o11, z, (ds2) gs2, sr2, i, 12);
        }
    }

    public static final void c(e17 e17, vr2 vr2, vr2 vr22, gs2 gs2, vr2 vr23, vr2 vr24, yt2 yt2, int i) {
        int i2;
        boolean z;
        boolean z2;
        Object obj;
        int i3;
        aq4 aq4;
        aq4 aq42;
        aq4 aq43;
        int i4;
        aq4 aq44;
        yt2 yt22;
        float f;
        boolean z3;
        boolean z4;
        boolean z5;
        yt2 yt23;
        boolean z6;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        e17 e172 = e17;
        vr2 vr25 = vr2;
        vr2 vr26 = vr22;
        gs2 gs22 = gs2;
        vr2 vr27 = vr23;
        vr2 vr28 = vr24;
        yt2 yt24 = yt2;
        int i11 = i;
        yt24.g0(232158948);
        if ((i11 & 6) == 0) {
            if (yt24.g(e172)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i11;
        } else {
            i2 = i11;
        }
        if ((i11 & 48) == 0) {
            if (yt24.i(vr25)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i11 & 384) == 0) {
            if (yt24.i(vr26)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i11 & 3072) == 0) {
            if (yt24.i(gs22)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i11 & 24576) == 0) {
            if (yt24.i(vr27)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i11) == 0) {
            if (yt24.i(vr28)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((74899 & i2) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt24.V(i2 & 1, z)) {
            Object Q = yt24.Q();
            Object obj2 = ay0.a;
            if (Q == obj2) {
                Q = u55.p(Boolean.FALSE);
                yt24.o0(Q);
            }
            aq4 aq45 = (aq4) Q;
            Object Q2 = yt24.Q();
            if (Q2 == obj2) {
                Q2 = u55.p((Object) null);
                yt24.o0(Q2);
            }
            aq4 aq46 = (aq4) Q2;
            Object Q3 = yt24.Q();
            if (Q3 == obj2) {
                Q3 = u55.p(e172.c);
                yt24.o0(Q3);
            }
            aq4 aq47 = (aq4) Q3;
            if (((Boolean) aq45.getValue()).booleanValue()) {
                yt24.e0(1350341255);
                String str = e172.d;
                if ((i2 & 57344) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Object Q4 = yt24.Q();
                if (z6 || Q4 == obj2) {
                    Q4 = new no2(vr27, aq45, 6);
                    yt24.o0(Q4);
                }
                vr2 vr29 = (vr2) Q4;
                Object Q5 = yt24.Q();
                if (Q5 == obj2) {
                    Q5 = new x26(aq45, 4);
                    yt24.o0(Q5);
                }
                a(str, vr29, (sr2) Q5, yt24, 384);
                z2 = false;
                yt24.r(false);
            } else {
                z2 = false;
                yt24.e0(1350578622);
                yt24.r(false);
            }
            o11 o11 = (o11) aq46.getValue();
            if (o11 == null) {
                yt24.e0(1350634111);
                yt24.r(z2);
                i4 = i2;
                aq43 = aq46;
                aq4 = aq45;
                aq42 = aq47;
                obj = obj2;
                i3 = 14;
            } else {
                yt24.e0(1350634112);
                long n = n(jt0.c, uq3.d(4279575600L));
                Object Q6 = yt2.Q();
                if (Q6 == obj2) {
                    Q6 = new x26(aq46, 5);
                    yt23 = yt2;
                    yt23.o0(Q6);
                } else {
                    yt23 = yt2;
                }
                long j = n;
                fw0 J = su0.J(1955570653, new ou4((Object) vr28, (Object) o11, (Object) aq46, 14), yt23);
                aq42 = aq47;
                i3 = 14;
                aq43 = aq46;
                aq4 = aq45;
                fw0 J2 = su0.J(-485887137, new ns4(aq46, 12), yt23);
                obj = obj2;
                i4 = i2;
                yt2 yt25 = yt23;
                z2 = false;
                su0.a((sr2) Q6, J, (ml4) null, J2, (gs2) null, rc9.d, su0.J(-2000590174, new ph6(11, o11), yt23), (pq6) null, j, 0, 0, 0, (wu1) null, yt25, 1772598, 16020);
                yt24 = yt25;
                yt24.r(false);
            }
            sd2 sd2 = yu6.c;
            lh4 d = mb0.d(xb4.y, z2);
            int hashCode = Long.hashCode(yt24.T);
            vf5 m = yt24.m();
            ml4 E = gw8.E(yt24, sd2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt24.i0();
            if (yt24.S) {
                yt24.l(vy0);
            } else {
                yt24.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt24, d);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt24, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt24, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt24, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt24, E);
            au0 a2 = zt0.a(wr.c, xb4.K, yt24, z2 ? 1 : 0);
            int i12 = i4;
            int hashCode2 = Long.hashCode(yt24.T);
            vf5 m2 = yt24.m();
            ml4 E2 = gw8.E(yt24, sd2);
            yt24.i0();
            sd2 sd22 = sd2;
            if (yt24.S) {
                yt24.l(vy0);
            } else {
                yt24.r0();
            }
            g75.Q(ckVar, yt24, a2);
            g75.Q(ckVar2, yt24, m2);
            f21.s(hashCode2, yt24, ckVar3, yt24, ceVar);
            g75.Q(ckVar4, yt24, E2);
            h80 h80 = xb4.I;
            ur urVar = new ur(8.0f, true, new h(2));
            sd2 sd23 = yu6.a;
            ml4 L = x91.L(sd23, 16.0f, 8.0f);
            ea6 a3 = ca6.a(urVar, h80, yt24, 54);
            sd2 sd24 = sd23;
            int hashCode3 = Long.hashCode(yt24.T);
            vf5 m3 = yt24.m();
            ml4 E3 = gw8.E(yt24, L);
            yt24.i0();
            if (yt24.S) {
                yt24.l(vy0);
            } else {
                yt24.r0();
            }
            g75.Q(ckVar, yt24, a3);
            g75.Q(ckVar2, yt24, m3);
            f21.s(hashCode3, yt24, ckVar3, yt24, ceVar);
            g75.Q(ckVar4, yt24, E3);
            String str2 = (String) aq42.getValue();
            Object Q7 = yt24.Q();
            Object obj3 = obj;
            if (Q7 == obj3) {
                aq44 = aq42;
                Q7 = new t46(aq44, 13);
                yt24.o0(Q7);
            } else {
                aq44 = aq42;
            }
            f(str2, (vr2) Q7, l55.u(R.string.spot_search_address_label, yt24), new lz3(1.0f, true), (m78) null, su0.J(1139431036, new r46(vr26, aq44, 1), yt24), yt24, 12804144);
            yt24.r(true);
            e17 e173 = e17;
            e(e173.b, vr25, yt24, i12 & 112);
            if (e173.b().isEmpty()) {
                yt24.e0(-1090059316);
                String u = l55.u(R.string.spots_empty, yt24);
                long i13 = i();
                long k = ya5.k(i3);
                ml4 K = x91.K(sd24, 24.0f);
                yt2 yt26 = yt2;
                f = 16.0f;
                z3 = true;
                yf7.b(u, K, i13, k, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt26, 24624, 0, 262120);
                yt22 = yt26;
                yt22.r(false);
            } else {
                z3 = true;
                f = 16.0f;
                yt24.e0(-1089734405);
                pa5 g = x91.g(16.0f, 0.0f, 16.0f, 88.0f, 2);
                ur urVar2 = new ur(10.0f, true, new h(2));
                if ((i12 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i12 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z7 = z5 | z4;
                Object Q8 = yt24.Q();
                if (z7 || Q8 == obj3) {
                    Q8 = new g5((Object) e173, (Object) gs2, (Object) aq43, 29);
                    yt24.o0(Q8);
                } else {
                    gs2 gs23 = gs2;
                }
                ur urVar3 = urVar2;
                sd2 sd25 = sd22;
                yt2 yt27 = yt2;
                x91.a(sd25, (s34) null, g, urVar3, (ib) null, (eh2) null, false, (xf) null, (vr2) Q8, yt27, 24966, 490);
                yt22 = yt27;
                yt22.r(false);
            }
            yt22.r(z3);
            long h = h();
            long j2 = jt0.c;
            i80 i80 = xb4.G;
            qb0 qb0 = qb0.a;
            jl4 jl4 = jl4.w;
            ml4 K2 = x91.K(qb0.a(jl4, i80), f);
            Object Q9 = yt22.Q();
            if (Q9 == obj3) {
                Q9 = new x26(aq4, 2);
                yt22.o0(Q9);
            }
            yt2 yt28 = yt22;
            ag8.c((sr2) Q9, K2, (pq6) null, h, j2, (sh2) null, rc9.e, yt28, 12607494, 100);
            yt24 = yt28;
            yt24.r(z3);
            k75.a(yt24, yu6.d(jl4, 60.0f));
        } else {
            e17 e174 = e172;
            yt24.Y();
        }
        yx5 v = yt24.v();
        if (v != null) {
            v.d = new dw0((Object) e17, (Object) vr25, (Object) vr26, (ds2) gs2, (Object) vr23, (ds2) vr24, i, 9);
        }
    }

    public static final void d(is2 is2, t17 t17, yt2 yt2, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        is2.getClass();
        yt2.g0(-997483215);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                z2 = yt2.g(is2);
            } else {
                z2 = yt2.i(is2);
            }
            if (z2) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            yt2.a0();
            if ((i & 1) == 0 || yt2.C()) {
                a68 a2 = va4.a(yt2);
                if (a2 != null) {
                    t17 = (t17) n85.p(b26.a.b(t17.class), a2, b96.O(o85.l(a2), yt2), o85.k(a2), yt2);
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt2.Y();
            }
            int i4 = i2 & -113;
            yt2.s();
            sg3.c((is7) hj8.n(t17.d, yt2).getValue(), is2, su0.J(-1774048952, new gc5(23, (Object) is2, (Object) t17), yt2), yt2, ((i4 << 3) & 112) | 392);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new dj7((Object) is2, (Object) t17, i, 20);
        }
    }

    public static final void e(r11 r11, vr2 vr2, yt2 yt2, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        char c;
        d63 d63;
        int i3;
        int i4;
        int i5;
        r11 r112 = r11;
        vr2 vr22 = vr2;
        yt2 yt22 = yt2;
        yt22.g0(-1797673080);
        if ((i & 6) == 0) {
            if (r112 == null) {
                i4 = -1;
            } else {
                i4 = r112.ordinal();
            }
            if (yt22.e(i4)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i | i5;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt22.i(vr22)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i6 & 1, z)) {
            ur urVar = new ur(6.0f, true, new h(2));
            ml4 Z = t49.Z(x91.L(yu6.a, 16.0f, 8.0f), t49.Y(yt22), false);
            ea6 a2 = ca6.a(urVar, xb4.H, yt22, 6);
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
            if (r112 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i7 = i6 & 112;
            if (i7 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object Q = yt22.Q();
            d63 d632 = ay0.a;
            if (z3 || Q == d632) {
                Q = new f17(0, vr22);
                yt22.o0(Q);
            }
            int i8 = i7;
            d63 d633 = d632;
            sp0.b(z2, (sr2) Q, rc9.f, (ml4) null, false, (gs2) null, (pq6) null, (cj6) null, (dj6) null, (ua0) null, (tr) null, (la5) null, yt22, 384, 16376);
            yt22.e0(-957220623);
            w52 w52 = r11.y;
            w52.getClass();
            e2 e2Var = new e2(0, w52);
            while (e2Var.hasNext()) {
                r11 r113 = (r11) e2Var.next();
                if (r112 == r113) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                int i9 = i8;
                if (i9 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i6 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean e = z5 | z6 | yt22.e(r113.ordinal());
                Object Q2 = yt22.Q();
                if (!e) {
                    d63 = d633;
                    if (Q2 != d63) {
                        vr2 vr23 = vr2;
                        c = 19;
                        char c2 = c;
                        sp0.b(z4, (sr2) Q2, su0.J(158276496, new g17(r113, 0), yt22), (ml4) null, false, (gs2) null, (pq6) null, (cj6) null, (dj6) null, (ua0) null, (tr) null, (la5) null, yt22, 384, 16376);
                        e2Var = e2Var;
                        i8 = i9;
                        d633 = d63;
                    }
                } else {
                    d63 = d633;
                }
                c = 19;
                Q2 = new g20(vr2, r112, r113, 19);
                yt22.o0(Q2);
                char c22 = c;
                sp0.b(z4, (sr2) Q2, su0.J(158276496, new g17(r113, 0), yt22), (ml4) null, false, (gs2) null, (pq6) null, (cj6) null, (dj6) null, (ua0) null, (tr) null, (la5) null, yt22, 384, 16376);
                e2Var = e2Var;
                i8 = i9;
                d633 = d63;
            }
            yt22.r(false);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dj7((Object) r112, (Object) vr2, i, 19);
        }
    }

    public static final void f(String str, vr2 vr2, String str2, ml4 ml4, m78 m78, gs2 gs2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        kj6 kj6;
        String str3 = str2;
        ml4 ml42 = ml4;
        yt2 yt22 = yt2;
        yt22.g0(-337228881);
        String str4 = str;
        if (yt22.g(str4)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (yt22.g(str3)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i5 | i3;
        if (yt22.g(ml42)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4 | 1572864;
        if ((4793491 & i7) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i7 & 1, z)) {
            kj6 kj62 = g22.M;
            o96 a2 = q96.a(13.0f);
            bt3 bt3 = bt3.e;
            int i8 = w08.a;
            long a3 = w08.a(uq3.d(4294178553L), uq3.d(4280036924L));
            yd7 t = pe2.t(0, 0, w08.a(uq3.d(4294178553L), uq3.d(4280036924L)), a3, 0, w08.a(uq3.d(4279391610L), uq3.d(4281301934L)), w08.a(uq3.d(4292666861L), uq3.d(4281090902L)), 0, 0, yt22, 2147477455);
            String str5 = str4;
            kj6 kj63 = kj62;
            z85.b(str5, vr2, yu6.d(ml42, 56.0f), false, false, (tg7) null, (gs2) null, su0.J(-672234346, new q20(str3, 17), yt22), (gs2) null, gs2, (gs2) null, false, kj63, bt3, (zs3) null, true, 0, 0, a2, t, yt22, (i7 & 14) | 817889328, 12582912, 0, 1916280);
            kj6 = kj63;
        } else {
            yt2.Y();
            kj6 = m78;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new zp5(str, vr2, str3, ml42, kj6, gs2, i);
        }
    }

    public static final void g(x83 x83, long j, boolean z, long j2, boolean z2, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        long j3;
        boolean z4 = z;
        boolean z5 = z2;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(2093046744);
        x83 x832 = x83;
        if (yt22.g(x832)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (yt22.f(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (yt22.h(z4)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        long j4 = j2;
        if (yt22.f(j4)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (yt22.h(z5)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (yt22.i(sr22)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i13 = i12 | i7;
        if ((74899 & i13) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i13 & 1, z3)) {
            if (z4) {
                j3 = j4;
            } else {
                j3 = i();
            }
            h80 h80 = xb4.I;
            o96 a2 = q96.a(8.0f);
            jl4 jl4 = jl4.w;
            int i14 = i13;
            ml4 L = x91.L(h49.u(we.f(jl4, a2), z5, (String) null, sr22, 14), 4.0f, 2.0f);
            ea6 a3 = ca6.a(wr.a, h80, yt22, 48);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, L);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a3);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            jl4 jl42 = jl4;
            d83.a(x832, (String) null, yu6.l(jl4, 16.0f), j3, yt22, (i14 & 14) | 432, 0);
            k75.a(yt22, yu6.p(jl42, 4.0f));
            yt2 yt23 = yt22;
            yf7.b(String.valueOf(j), (ml4) null, j3, ya5.k(12), am2.A, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 1597440, 0, 262058);
            yt22 = yt23;
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new o17(x83, j, z4, j4, z5, sr22, i);
        }
    }

    public static final long h() {
        return n(uq3.d(4279658664L), uq3.d(4284131291L));
    }

    public static final long i() {
        return n(uq3.d(4284708234L), uq3.d(4288656326L));
    }

    public static final long j() {
        return n(uq3.d(4279381056L), uq3.d(4293127927L));
    }

    public static final int k(r11 r11) {
        r11.getClass();
        int ordinal = r11.ordinal();
        if (ordinal == 0) {
            return R.string.spot_type_wifi;
        }
        if (ordinal == 1) {
            return R.string.spot_type_4g;
        }
        if (ordinal == 2) {
            return R.string.spot_type_sala;
        }
        if (ordinal == 3) {
            return R.string.spot_type_joven_club;
        }
        if (ordinal == 4) {
            return R.string.spot_type_other;
        }
        h.c();
        return 0;
    }

    public static final int l(q07 q07) {
        int ordinal = q07.ordinal();
        if (ordinal == 0) {
            return R.string.spot_quality_excellent;
        }
        if (ordinal == 1) {
            return R.string.spot_quality_good;
        }
        if (ordinal == 2) {
            return R.string.spot_quality_fair;
        }
        if (ordinal == 3) {
            return R.string.spot_quality_bad;
        }
        h.c();
        return 0;
    }

    public static final yb5 m(Context context) {
        LocationManager locationManager;
        Location location;
        Object obj;
        Object systemService = context.getSystemService("location");
        if (systemService instanceof LocationManager) {
            locationManager = (LocationManager) systemService;
        } else {
            locationManager = null;
        }
        if (locationManager == null) {
            return null;
        }
        Iterator it = sg3.E("gps", "network", "passive").iterator();
        while (true) {
            if (!it.hasNext()) {
                location = null;
                break;
            }
            try {
                obj = locationManager.getLastKnownLocation((String) it.next());
            } catch (Throwable th) {
                obj = new m66(th);
            }
            if (obj instanceof m66) {
                obj = null;
            }
            location = (Location) obj;
            if (location != null) {
                break;
            }
        }
        if (location != null) {
            return new yb5(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
        }
        return null;
    }

    public static final long n(long j, long j2) {
        if (d18.a()) {
            return za5.k(j2);
        }
        if (d18.b()) {
            return j2;
        }
        return j;
    }
}
