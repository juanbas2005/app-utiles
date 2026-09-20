package defpackage;

import cu.lestebang.utiletecsa.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: d36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class d36 {
    public static final String[] a = {"android.permission.READ_CALL_LOG", "android.permission.READ_CONTACTS"};
    public static final String[] b = {"android.permission.READ_SMS", "android.permission.READ_CONTACTS"};
    public static final o96 c = q96.a(18.0f);

    public static final void a(String str, long j, String str2, boolean z, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        String str3 = str;
        String str4 = str2;
        boolean z3 = z;
        yt2 yt22 = yt2;
        m23 m23 = gr8.h;
        yt22.g0(1914234175);
        if (yt22.g(str3)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (yt22.f(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (yt22.g(str4)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (yt22.h(z3)) {
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
            jl4 jl4 = jl4.w;
            if (z3) {
                yt22.e0(1333047530);
                ed1.b(p25.x(R.drawable.ic_etecsa_logo, yt22), (String) null, x91.K(b96.h(we.f(yu6.l(jl4, 46.0f), q96.a), jt0.c, m23), 6.0f), (jb) null, (j51) null, 0.0f, yt22, 56, 120);
                yt22.r(false);
            } else if (str4 != null) {
                yt22.e0(-1624813702);
                wn6.b(str4, we.f(yu6.l(jl4, 46.0f), q96.a), i51.a, yt22, ((i9 >> 6) & 14) | 1572912);
                yt22.r(false);
            } else {
                yt22.e0(1333068160);
                ml4 h = b96.h(we.f(yu6.l(jl4, 46.0f), q96.a), uq3.d(j), m23);
                lh4 d = mb0.d(xb4.C, false);
                int hashCode = Long.hashCode(yt22.T);
                vf5 m = yt22.m();
                ml4 E = gw8.E(yt22, h);
                ux0.d.getClass();
                vy0 vy0 = tx0.b;
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(tx0.f, yt22, d);
                g75.Q(tx0.e, yt22, m);
                g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
                g75.O(yt22, tx0.h);
                g75.Q(tx0.d, yt22, E);
                yt2 yt23 = yt2;
                yf7.b(d57.i1(1, str3), (ml4) null, jt0.c, ya5.k(18), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 1597824, 0, 262058);
                yt22 = yt23;
                yt22.r(true);
                yt22.r(false);
            }
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new gi(str3, j, str4, z3, i);
        }
    }

    public static final void b(mi0 mi0, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        yt2 yt22;
        yt2.g0(-1044286285);
        if (yt2.g(mi0)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (yt2.i(sr2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i5 & 1, z)) {
            yt22 = yt2;
            we.b(h49.u(yu6.a, false, (String) null, sr2, 15), c, rc9.w(x08.b(), yt2, 24576), t(), su0.J(1617664805, new xa7(11, (Object) mi0), yt2), yt22, 196656, 16);
        } else {
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dx4(mi0, sr2, i, 9);
        }
    }

    public static final void c(oi0 oi0, yt2 yt2, int i) {
        int i2;
        boolean z;
        yt2 yt22;
        yb5 yb5;
        yt2.g0(-1924955667);
        if (yt2.e(oi0.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            int ordinal = oi0.ordinal();
            if (ordinal == 0) {
                yb5 = new yb5(b96.x(), new jt0(x08.d()));
            } else if (ordinal == 1) {
                yb5 = new yb5(mp7.V(), new jt0(x08.c()));
            } else if (ordinal == 2) {
                x83 p = t75.p();
                int i4 = x08.b;
                yb5 = new yb5(p, new jt0(x08.f(uq3.d(4279974492L), uq3.d(4288329942L))));
            } else {
                h.c();
                return;
            }
            yt22 = yt2;
            d83.a((x83) yb5.w, (String) null, yu6.l(jl4.w, 20.0f), ((jt0) yb5.x).a, yt22, 432, 0);
        } else {
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new yg(i, 27, oi0);
        }
    }

    public static final void d(List list, xa7 xa7, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        List list2 = list;
        xa7 xa72 = xa7;
        yt2 yt22 = yt2;
        int i4 = i;
        yt22.g0(703881747);
        if (yt22.g(list2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i4;
        if (yt22.i(xa72)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        boolean z3 = true;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i6 & 1, z)) {
            int i7 = i6;
            ml4 M = x91.M(jl4.w, 16.0f, 0.0f, 2);
            ur urVar = new ur(10.0f, true, new h(2));
            pa5 e = x91.e(1, 0.0f);
            if ((i7 & 14) != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((i7 & 112) != 32) {
                z3 = false;
            }
            boolean z4 = z2 | z3;
            Object Q = yt22.Q();
            if (z4 || Q == ay0.a) {
                Q = new r26(list2, xa72, 0);
                yt22.o0(Q);
            }
            x91.a(M, (s34) null, e, urVar, (ib) null, (eh2) null, false, (xf) null, (vr2) Q, yt22, 24966, 490);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new s26(list2, xa72, i4, 0);
        }
    }

    public static final void e(Long l, Long l2, gs2 gs2, yt2 yt2, int i) {
        int i2;
        boolean z;
        Long l3;
        aq4 aq4;
        int i3;
        boolean z2;
        Object obj;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i6;
        int i7;
        int i8;
        Long l4 = l;
        Long l5 = l2;
        gs2 gs22 = gs2;
        yt2 yt22 = yt2;
        int i9 = i;
        yt22.g0(912244343);
        if ((i9 & 6) == 0) {
            if (yt22.g(l4)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        if ((i9 & 48) == 0) {
            if (yt22.g(l5)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i9 & 384) == 0) {
            if (yt22.i(gs22)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            Object Q = yt22.Q();
            Object obj2 = ay0.a;
            if (Q == obj2) {
                Q = u55.p(Boolean.FALSE);
                yt22.o0(Q);
            }
            aq4 aq42 = (aq4) Q;
            Object Q2 = yt22.Q();
            if (Q2 == obj2) {
                Q2 = u55.p(Boolean.FALSE);
                yt22.o0(Q2);
            }
            aq4 aq43 = (aq4) Q2;
            Object Q3 = yt22.Q();
            if (Q3 == obj2) {
                Q3 = new SimpleDateFormat("d/M/yyyy", Locale.getDefault());
                yt22.o0(Q3);
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) Q3;
            sd2 sd2 = yu6.a;
            ea6 a2 = ca6.a(wr.g, xb4.H, yt22, 6);
            aq4 aq44 = aq43;
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
            Object Q4 = yt22.Q();
            if (Q4 == obj2) {
                Q4 = new vo2(aq42, 27);
                yt22.o0(Q4);
            }
            o96 a3 = q96.a(10.0f);
            pa5 pa5 = yd0.a;
            yt2 yt23 = yt22;
            aq4 aq45 = aq44;
            Object obj3 = obj2;
            gw8.b((sr2) Q4, (ml4) null, false, a3, yd0.f(x08.e(), yt22), (ua0) null, (la5) null, su0.J(377116001, new u26(l4, simpleDateFormat, 0), yt22), yt23, 805306374, 486);
            yt2 yt24 = yt23;
            Object Q5 = yt24.Q();
            if (Q5 == obj3) {
                Q5 = new vo2(aq45, 28);
                yt24.o0(Q5);
            }
            yt2 yt25 = yt2;
            gw8.b((sr2) Q5, (ml4) null, false, q96.a(10.0f), yd0.f(x08.e(), yt24), (ua0) null, (la5) null, su0.J(746593162, new u26(l5, simpleDateFormat, 1), yt24), yt25, 805306374, 486);
            yt2 yt26 = yt25;
            yt26.r(true);
            if (((Boolean) aq42.getValue()).booleanValue()) {
                yt26.e0(-1880416583);
                int i10 = i2 & 896;
                if (i10 == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int i11 = i2 & 112;
                if (i11 == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z12 = z8 | z9;
                Object Q6 = yt26.Q();
                if (z12 || Q6 == obj3) {
                    Q6 = new v26(gs22, l5, aq42, 0);
                    yt26.o0(Q6);
                }
                vr2 vr2 = (vr2) Q6;
                i3 = 256;
                if (i10 == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i11 == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z11 | z10;
                Object Q7 = yt26.Q();
                if (z13 || Q7 == obj3) {
                    z2 = false;
                    Q7 = new w26(gs22, l5, aq42, 0);
                    yt26.o0(Q7);
                } else {
                    z2 = false;
                }
                sr2 sr2 = (sr2) Q7;
                Object Q8 = yt26.Q();
                if (Q8 == obj3) {
                    Q8 = new vo2(aq42, 29);
                    yt26.o0(Q8);
                }
                obj = obj3;
                aq4 = aq45;
                yt22 = yt26;
                Long l6 = l;
                i5 = i2;
                sr2 sr22 = sr2;
                z3 = true;
                sr2 sr23 = (sr2) Q8;
                i4 = 4;
                n(l6, vr2, sr22, sr23, yt22, (i2 & 14) | 3072);
                l3 = l6;
                yt22.r(z2);
            } else {
                i4 = 4;
                z2 = false;
                i3 = 256;
                l3 = l;
                obj = obj3;
                z3 = true;
                aq4 = aq45;
                yt22 = yt26;
                i5 = i2;
                yt22.e0(-1880030261);
                yt22.r(false);
            }
            if (((Boolean) aq4.getValue()).booleanValue()) {
                yt22.e0(-1879994115);
                int i12 = i5 & 896;
                if (i12 == i3) {
                    z4 = z3;
                } else {
                    z4 = z2;
                }
                int i13 = i5 & 14;
                if (i13 == i4) {
                    z5 = z3;
                } else {
                    z5 = z2;
                }
                boolean z14 = z4 | z5;
                Object Q9 = yt22.Q();
                if (z14 || Q9 == obj) {
                    Q9 = new v26(gs22, l3, aq4, z3 ? 1 : 0);
                    yt22.o0(Q9);
                }
                vr2 vr22 = (vr2) Q9;
                if (i12 == i3) {
                    z6 = z3;
                } else {
                    z6 = z2;
                }
                if (i13 == i4) {
                    z7 = z3;
                } else {
                    z7 = z2;
                }
                boolean z15 = z6 | z7;
                Object Q10 = yt22.Q();
                if (z15 || Q10 == obj) {
                    Q10 = new w26(gs22, l3, aq4, z3);
                    yt22.o0(Q10);
                }
                sr2 sr24 = (sr2) Q10;
                Object Q11 = yt22.Q();
                if (Q11 == obj) {
                    Q11 = new x26(aq4, z2 ? 1 : 0);
                    yt22.o0(Q11);
                }
                n(l5, vr22, sr24, (sr2) Q11, yt22, ((i5 >> 3) & 14) | 3072);
                yt22.r(z2);
            } else {
                yt22.e0(-1879611637);
                yt22.r(z2);
            }
        } else {
            l3 = l4;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new bi(i, 15, (Object) l3, (Object) l2, (Object) gs22);
        }
    }

    public static final void f(List list, xa7 xa7, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        List list2 = list;
        xa7 xa72 = xa7;
        yt2 yt22 = yt2;
        int i4 = i;
        yt22.g0(-535324442);
        if (yt22.g(list2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i4;
        if (yt22.i(xa72)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        boolean z3 = false;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i6 & 1, z)) {
            int i7 = i6;
            ml4 M = x91.M(jl4.w, 16.0f, 0.0f, 2);
            ur urVar = new ur(10.0f, true, new h(2));
            pa5 e = x91.e(1, 0.0f);
            if ((i7 & 14) != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((i7 & 112) == 32) {
                z3 = true;
            }
            boolean z4 = z2 | z3;
            Object Q = yt22.Q();
            if (z4 || Q == ay0.a) {
                Q = new r26(list2, xa72, 1);
                yt22.o0(Q);
            }
            x91.a(M, (s34) null, e, urVar, (ib) null, (eh2) null, false, (xf) null, (vr2) Q, yt22, 24966, 490);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new s26(list2, xa72, i4, 1);
        }
    }

    public static final void g(String str, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        yt2.g0(568512400);
        if (yt2.g(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (yt2.i(sr2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i5 & 1, z)) {
            ml4 K = x91.K(yu6.c, 16.0f);
            au0 a2 = zt0.a(wr.c, xb4.K, yt2, 0);
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
            g75.Q(tx0.f, yt2, a2);
            g75.Q(tx0.e, yt2, m);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            pl0 w = rc9.w(x08.b(), yt2, 24576);
            pl0 pl0 = w;
            we.b(yu6.a, c, pl0, t(), su0.J(-952828040, new gc5(18, (Object) str, (Object) sr2), yt2), yt2, 196662, 16);
            yt2.r(true);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new u20(str, sr2, i, 1);
        }
    }

    public static final void h(q26 q26, int i, vr2 vr2, xa7 xa7, vr2 vr22, gs2 gs2, gs2 gs22, yt2 yt2, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        Boolean bool;
        Boolean bool2;
        um1 um1;
        o81 o81;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        q26 q262 = q26;
        int i12 = i;
        vr2 vr23 = vr2;
        vr2 vr24 = vr22;
        yt2 yt22 = yt2;
        int i13 = i2;
        yt22.g0(1683248568);
        if ((i13 & 6) == 0) {
            if (yt22.g(q262)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i13;
        } else {
            i3 = i13;
        }
        if ((i13 & 48) == 0) {
            if (yt22.e(i12)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i13 & 384) == 0) {
            if (yt22.i(vr23)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        xa7 xa72 = xa7;
        if ((i13 & 3072) == 0) {
            if (yt22.i(xa72)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i13 & 24576) == 0) {
            if (yt22.i(vr24)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        gs2 gs23 = gs2;
        if ((196608 & i13) == 0) {
            if (yt22.i(gs23)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        gs2 gs24 = gs22;
        if ((1572864 & i13) == 0) {
            if (yt22.i(gs24)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i3 & 1, z)) {
            x83 x83 = k75.a;
            if (x83 == null) {
                w83 w83 = new w83("Rounded.Phone", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                int i14 = e38.a;
                ky6 ky6 = new ky6(jt0.b);
                be5 f = pb4.f(19.23f, 15.26f, -2.54f, -0.29f);
                f.e(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f);
                be5 be5 = f;
                be5.i(-1.84f, 1.84f);
                f.e(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
                be5.i(1.85f, -1.85f);
                f.e(0.43f, -0.43f, 0.64f, -1.03f, 0.57f, -1.64f);
                be5.i(-0.29f, -2.52f);
                f.e(-0.12f, -1.01f, -0.97f, -1.77f, -1.99f, -1.77f);
                be5.f(5.03f);
                f.e(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f);
                f.e(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f);
                f.e(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f);
                be5.n(-1.73f);
                f.e(0.01f, -1.01f, -0.75f, -1.86f, -1.76f, -1.98f);
                be5.c();
                w83.a(w83, be5.a, ky6, 14336);
                x83 = w83.b();
                k75.a = x83;
            }
            List E = sg3.E(x83, b96.y(), tf4.u(), h03.l());
            boolean g = yt22.g(E);
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (g || Q == d63) {
                Q = new tm1(3, E);
                yt22.o0(Q);
            }
            int i15 = (i3 >> 3) & 14;
            um1 b2 = rb5.b(i12, (sr2) Q, yt22, i15, 2);
            Object Q2 = yt22.Q();
            if (Q2 == d63) {
                Q2 = t49.D(yt22);
                yt22.o0(Q2);
            }
            aq4 v = u55.v(vr23, yt22);
            boolean g2 = yt22.g(b2) | yt22.g(v);
            int i16 = i3;
            Object Q3 = yt22.Q();
            o81 o812 = (o81) Q2;
            if (g2 || Q3 == d63) {
                Q3 = new k05(b2, v, (f61) null, 7);
                yt22.o0(Q3);
            }
            t49.h((gs2) Q3, yt22, b2);
            Object[] objArr = new Object[0];
            Object Q4 = yt22.Q();
            if (Q4 == d63) {
                Q4 = new pp5(7);
                yt22.o0(Q4);
            }
            Set set = (Set) u55.s(objArr, (sr2) Q4, yt22, 48);
            aq4 v2 = u55.v(vr24, yt22);
            int intValue = ((Number) b2.s.getValue()).intValue();
            Integer valueOf = Integer.valueOf(intValue);
            um1 um12 = b2;
            Boolean valueOf2 = Boolean.valueOf(q262.o);
            Boolean valueOf3 = Boolean.valueOf(q262.p);
            boolean e = yt22.e(intValue);
            int i17 = i16 & 14;
            Boolean bool3 = valueOf3;
            if (i17 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean i18 = e | z2 | yt22.i(set) | yt22.g(v2);
            Object Q5 = yt22.Q();
            if (i18 || Q5 == d63) {
                i4 = i15;
                bool2 = valueOf2;
                bool = bool3;
                o81 = o812;
                um1 = um12;
                ii3 ii3 = new ii3(intValue, set, q26, v2, (f61) null);
                yt22.o0(ii3);
                Q5 = ii3;
            } else {
                i4 = i15;
                bool2 = valueOf2;
                bool = bool3;
                o81 = o812;
                um1 = um12;
            }
            t49.i(valueOf, bool2, bool, (gs2) Q5, yt22);
            sd2 sd2 = yu6.c;
            ml4 O = x91.O(sd2, 0.0f, 0.0f, 0.0f, 63.0f, 7);
            au0 a2 = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E2 = gw8.E(yt22, O);
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
            g75.Q(tx0.d, yt22, E2);
            ml4 d = yu6.d(jl4.w, 40.0f);
            int i19 = x08.b;
            long f2 = x08.f(uq3.d(4293127926L), uq3.d(4280036924L));
            long f3 = x08.f(jt0.b, jt0.c);
            int i20 = i12;
            fw0 J = su0.J(154884678, new z26(i12, 0), yt22);
            za5.b(i20, d, f2, f3, J, (gs2) null, su0.J(-2144269242, new bi(E, i12, o81, um1), yt22), yt22, i4 | 1597488, 32);
            yt2 yt23 = yt22;
            ya5.a(48, 16380, (xf) null, (h80) null, su0.J(-1043654929, new a36(q26, xa72, vr22, gs2, gs22), yt22), yt23, (xb4) null, sd2, (tx4) null, (la5) null, um1, (ax6) null, (gx6) null, false);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v3 = yt22.v();
        if (v3 != null) {
            v3.d = new b36(q26, i, vr2, xa7, vr22, gs2, gs22, i2);
        }
    }

    public static final void i(xa7 xa7, is2 is2, g36 g36, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        g36 g362;
        g36 g363;
        int i4;
        is2.getClass();
        yt2.g0(-1085645348);
        if (yt2.i(xa7)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (yt2.g(is2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3 | 128;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i6 & 1, z)) {
            yt2.a0();
            if ((i & 1) == 0 || yt2.C()) {
                a68 a2 = va4.a(yt2);
                if (a2 != null) {
                    g363 = (g36) n85.p(b26.a.b(g36.class), a2, b96.O(o85.l(a2), yt2), o85.k(a2), yt2);
                    i4 = i6 & -897;
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt2.Y();
                i4 = i6 & -897;
                g363 = g36;
            }
            yt2.s();
            aq4 n = hj8.n(g363.f, yt2);
            aq4 n2 = hj8.n(g363.k, yt2);
            s8 s8Var = new s8(false, 2);
            boolean i7 = yt2.i(g363);
            Object Q = yt2.Q();
            if (i7 || Q == ay0.a) {
                Q = new ay5(4, (Object) g363);
                yt2.o0(Q);
            }
            sg3.c((is7) n.getValue(), is2, su0.J(709118107, new uo2((Object) g363, (Object) xa7, (Object) tf4.N(s8Var, (vr2) Q, yt2, 0), (Object) n2, 7), yt2), yt2, (i4 & 112) | 392);
            g362 = g363;
        } else {
            yt2.Y();
            g362 = g36;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ou4(i, 7, xa7, is2, g362);
        }
    }

    public static final void j(yv6 yv6, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        yt2 yt22;
        yt2.g0(1864257781);
        if (yt2.g(yv6)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (yt2.i(sr2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i5 & 1, z)) {
            yt22 = yt2;
            we.b(h49.u(yu6.a, false, (String) null, sr2, 15), c, rc9.w(x08.b(), yt2, 24576), t(), su0.J(-626824217, new xa7(12, (Object) yv6), yt2), yt22, 196656, 16);
        } else {
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dx4(yv6, sr2, i, 10);
        }
    }

    public static final void k(ew6 ew6, yt2 yt2, int i) {
        int i2;
        boolean z;
        yt2 yt22;
        yb5 yb5;
        yt2.g0(-719882795);
        if (yt2.e(ew6.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            int ordinal = ew6.ordinal();
            if (ordinal == 0) {
                yb5 = new yb5(rd3.u(), new jt0(x08.d()));
            } else if (ordinal == 1) {
                yb5 = new yb5(ar7.z(), new jt0(x08.c()));
            } else {
                h.c();
                return;
            }
            yt22 = yt2;
            d83.a((x83) yb5.w, (String) null, yu6.l(jl4.w, 20.0f), ((jt0) yb5.x).a, yt22, 432, 0);
        } else {
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new yg(i, 28, ew6);
        }
    }

    public static final void l(String str, x83 x83, List list, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        yt2 yt22;
        yt2.g0(-987022082);
        if (yt2.g(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (yt2.g(x83)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (yt2.g(list)) {
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
        if (yt2.V(i7 & 1, z)) {
            yt22 = yt2;
            we.b(yu6.a, c, rc9.w(x08.b(), yt2, 24576), t(), su0.J(-675971856, new d13(x83, str, list), yt2), yt22, 196662, 16);
        } else {
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ou4(i, 6, str, x83, list);
        }
    }

    public static final void m(q26 q26, gs2 gs2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        x83 x83;
        q26 q262 = q26;
        gs2 gs22 = gs2;
        yt2 yt22 = yt2;
        int i5 = i;
        yt22.g0(220975463);
        int i6 = 2;
        if (yt22.g(q262)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i2 | i5;
        if (yt22.i(gs22)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if ((i8 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i8 & 1, z)) {
            ml4 O = x91.O(x91.M(t49.Z(yu6.c, t49.Y(yt22), true), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            au0 a2 = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, O);
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
            jl4 jl4 = jl4.w;
            k75.a(yt22, yu6.d(jl4, 12.0f));
            int i9 = 3;
            e(q262.m, q262.n, gs22, yt22, (i8 << 3) & 896);
            yt22.e0(96404696);
            for (rh5 rh5 : q262.h) {
                k75.a(yt22, yu6.d(jl4, 12.0f));
                int ordinal = rh5.a.ordinal();
                if (ordinal == 0) {
                    i4 = R.string.title_plan_combinados;
                } else if (ordinal == 1) {
                    i4 = R.string.title_plan_voz;
                } else if (ordinal == i6) {
                    i4 = R.string.title_plan_sms;
                } else if (ordinal == i9) {
                    i4 = R.string.title_plan_datos;
                } else {
                    h.c();
                    return;
                }
                String u = l55.u(i4, yt22);
                int ordinal2 = rh5.a.ordinal();
                if (ordinal2 == 0) {
                    x83 = w95.h();
                } else if (ordinal2 == 1) {
                    x83 = r16.R();
                } else if (ordinal2 == i6) {
                    x83 = b96.y();
                } else if (ordinal2 == i9) {
                    x83 = i35.h();
                } else {
                    h.c();
                    return;
                }
                l(u, x83, sg3.E(l55.u(R.string.label_purchases, yt22) + ": " + rh5.b, pb4.l(l55.u(R.string.label_cost, yt22), ": ", rh5.c), pb4.l(l55.u(R.string.label_paid, yt22), ": ", rh5.d)), yt22, 0);
                i6 = 2;
                i9 = 3;
            }
            yt22.r(false);
            k75.a(yt22, yu6.d(jl4, 12.0f));
            l(l55.u(R.string.title_transfer_expense, yt22), aa5.h(), sg3.E(pb4.l(l55.u(R.string.label_sent, yt22), " ", q262.j), pb4.l(l55.u(R.string.label_received, yt22), " ", q262.i), pb4.l(l55.u(R.string.label_commission, yt22), " ", q262.k)), yt22, 0);
            k75.a(yt22, yu6.d(jl4, 12.0f));
            p(l55.v(R.string.label_total_expense, new Object[]{q262.l}, yt22), yt22, 0);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dx4(q262, gs22, i5, 8);
        }
    }

    public static final void n(Long l, vr2 vr2, sr2 sr2, sr2 sr22, yt2 yt2, int i) {
        int i2;
        sr2 sr23;
        boolean z;
        Long l2;
        kg1 kg1;
        int i3;
        int i4;
        int i5;
        int i6;
        Long l3 = l;
        vr2 vr22 = vr2;
        sr2 sr24 = sr2;
        yt2 yt22 = yt2;
        int i7 = i;
        yt22.g0(1720409920);
        if ((i7 & 6) == 0) {
            if (yt22.g(l3)) {
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
            if (yt22.i(sr24)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i7 & 3072) == 0) {
            sr23 = sr22;
            if (yt22.i(sr23)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        } else {
            sr23 = sr22;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            if (l3 != null) {
                long longValue = l3.longValue();
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(longValue);
                Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                instance2.clear();
                instance2.set(instance.get(1), instance.get(2), instance.get(5));
                l2 = Long.valueOf(instance2.getTimeInMillis());
            } else {
                l2 = null;
            }
            pa5 pa5 = gi1.a;
            re3 re3 = lg1.b;
            kg1 kg12 = lg1.c;
            Locale locale = ((xa4) yt22.k(xy0.p)).a;
            Object[] objArr = new Object[0];
            kg5 Z = gl0.Z(new m0(15, kg12, locale), new xw0(28));
            boolean g = yt22.g(l2) | yt22.g(l2) | yt22.i(re3) | yt22.e(0) | yt22.g(kg12) | yt22.g(locale);
            Object Q = yt22.Q();
            if (g || Q == ay0.a) {
                kg1 kg13 = kg12;
                Q = new yf1(l2, l2, re3, kg13, locale);
                kg1 = kg13;
                yt22.o0(Q);
            } else {
                kg1 = kg12;
            }
            hi1 hi1 = (hi1) u55.t(objArr, Z, (sr2) Q, yt22, 0);
            hi1.d.setValue(kg1);
            qg1.a(sr23, su0.J(-1446306706, new dx4(11, vr22, hi1), yt22), (ml4) null, su0.J(2062662700, new ce4(27, sr24), yt22), (pq6) null, (ig1) null, (wu1) null, su0.J(737081847, new xa7(13, (Object) hi1), yt22), yt22, ((i2 >> 9) & 14) | 100666416);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new m13(i7, 5, l3, vr22, sr24, sr22);
        }
    }

    public static final void o(String str, String str2, long j, ml4 ml4, yt2 yt2, int i) {
        int i2;
        boolean z;
        yt2 yt22;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        ml4 ml42 = ml4;
        yt2 yt23 = yt2;
        int i7 = i;
        yt23.g0(539618416);
        String str3 = str;
        if ((i7 & 6) == 0) {
            if (yt23.g(str3)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            i2 = i7;
        }
        if ((i7 & 48) == 0) {
            if (yt23.g(str2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        } else {
            String str4 = str2;
        }
        if ((i7 & 384) == 0) {
            if (yt23.f(j2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i7 & 3072) == 0) {
            if (yt23.g(ml42)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (yt23.V(i2 & 1, z)) {
            ml4 L = x91.L(b96.h(we.f(ml42, q96.a(12.0f)), j2, gr8.h), 10.0f, 8.0f);
            au0 a2 = zt0.a(wr.c, xb4.L, yt23, 48);
            int hashCode = Long.hashCode(yt23.T);
            vf5 m = yt23.m();
            ml4 E = gw8.E(yt23, L);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt23.i0();
            if (yt23.S) {
                yt23.l(vy0);
            } else {
                yt23.r0();
            }
            g75.Q(tx0.f, yt23, a2);
            g75.Q(tx0.e, yt23, m);
            g75.Q(tx0.g, yt23, Integer.valueOf(hashCode));
            g75.O(yt23, tx0.h);
            g75.Q(tx0.d, yt23, E);
            long j3 = jt0.c;
            yf7.b(str3, (ml4) null, j3, ya5.k(11), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, (i2 & 14) | 24960, 0, 262122);
            yt2 yt24 = yt2;
            yf7.b(str2, (ml4) null, j3, ya5.k(13), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, ((i2 >> 3) & 14) | 1597824, 0, 262058);
            yt22 = yt24;
            yt22.r(true);
        } else {
            yt22 = yt23;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new y26(str, str2, j2, ml42, i7);
        }
    }

    public static final void p(String str, yt2 yt2, int i) {
        int i2;
        boolean z;
        String str2 = str;
        yt2 yt22 = yt2;
        yt22.g0(957777256);
        if (yt22.g(str2)) {
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
            ml4 f = we.f(yu6.a, q96.a(18.0f));
            int i4 = x08.b;
            ml4 L = x91.L(b96.h(f, x08.f(uq3.d(4278460474L), uq3.d(4279384924L)), gr8.h), 16.0f, 14.0f);
            lh4 d = mb0.d(xb4.y, false);
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
            g75.Q(tx0.f, yt22, d);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            yt2 yt23 = yt2;
            yf7.b(str2, (ml4) null, jt0.c, ya5.k(16), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, (i3 & 14) | 1597824, 0, 262058);
            yt22 = yt23;
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new q20(i, 13, str2);
        }
    }

    public static final void q(pl7 pl7, yt2 yt2, int i) {
        int i2;
        boolean z;
        long j;
        long j2;
        long j3;
        pl7 pl72 = pl7;
        yt2 yt22 = yt2;
        int i3 = i;
        yt22.g0(-1801106937);
        if (yt22.g(pl72)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i4 & 1, z)) {
            if (pl72.e) {
                int i5 = x08.b;
                j = 4288329942L;
                j2 = jt0.b(0.12f, x08.f(uq3.d(4281298912L), uq3.d(4286360048L)));
            } else {
                j = 4288329942L;
                int i6 = x08.b;
                j2 = jt0.b(0.12f, x08.f(uq3.d(4279974492L), uq3.d(4288329942L)));
            }
            if (pl72.e) {
                j3 = x08.f(uq3.d(4281298912L), uq3.d(4286360048L));
            } else {
                j3 = x08.f(uq3.d(4279974492L), uq3.d(j));
            }
            we.b(yu6.a, c, rc9.w(j2, yt22, 24576), rc9.x(62, 0.0f), su0.J(2778361, new t26(0, j3, pl72), yt22), yt22, 196662, 16);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new yg(i3, 26, pl72);
        }
    }

    public static final void r(String str, String str2, yt2 yt2, int i) {
        int i2;
        boolean z;
        String str3;
        String str4;
        float f;
        int i3;
        int i4;
        String str5 = str;
        String str6 = str2;
        yt2 yt22 = yt2;
        int i5 = i;
        yt22.g0(842674122);
        if ((i5 & 6) == 0) {
            if (yt22.g(str5)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 48) == 0) {
            if (yt22.g(str6)) {
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
            ml4 L = x91.L(yu6.a, 16.0f, 8.0f);
            ea6 a2 = ca6.a(new ur(8.0f, true, new h(2)), xb4.H, yt22, 6);
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
            g75.Q(tx0.f, yt22, a2);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            String u = l55.u(R.string.label_received, yt22);
            int i7 = x08.b;
            long f2 = x08.f(uq3.d(4279275704L), uq3.d(4282368489L));
            float f3 = 1.0f;
            if (((double) 1.0f) <= 0.0d) {
                wb3.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f;
            }
            o(u, str5, f2, new lz3(f, true), yt22, (i6 << 3) & 112);
            String u2 = l55.u(R.string.label_sent, yt22);
            long f4 = x08.f(uq3.d(4279974492L), uq3.d(4288329942L));
            if (((double) 1.0f) <= 0.0d) {
                wb3.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            }
            str4 = str6;
            str3 = str;
            o(u2, str4, f4, new lz3(f3, true), yt22, i6 & 112);
            yt22.r(true);
        } else {
            String str7 = str6;
            str3 = str5;
            str4 = str7;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dj7((Object) str3, (Object) str4, i5, 17);
        }
    }

    public static final void s(List list, String str, String str2, Long l, Long l2, gs2 gs2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        List list2 = list;
        String str3 = str;
        String str4 = str2;
        Long l3 = l;
        Long l4 = l2;
        gs2 gs22 = gs2;
        yt2 yt22 = yt2;
        yt22.g0(1284209861);
        if (yt22.g(list2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (yt22.g(str3)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (yt22.g(str4)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        if (yt22.g(l3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (yt22.g(l4)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (yt22.i(gs22)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i13 = i12 | i7;
        if ((74899 & i13) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i13 & 1, z)) {
            sd2 sd2 = yu6.c;
            au0 a2 = zt0.a(wr.c, xb4.K, yt22, 0);
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
            r(str3, str4, yt22, (i13 >> 3) & 126);
            jl4 jl4 = jl4.w;
            k75.a(yt22, yu6.d(jl4, 8.0f));
            int i14 = i13;
            ml4 M = x91.M(jl4, 16.0f, 0.0f, 2);
            lh4 d = mb0.d(xb4.y, false);
            jl4 jl42 = jl4;
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, M);
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
            e(l3, l4, gs22, yt22, (i14 >> 9) & 1022);
            yt22.r(true);
            jl4 jl43 = jl42;
            k75.a(yt22, yu6.d(jl43, 8.0f));
            ml4 M2 = x91.M(jl43, 16.0f, 0.0f, 2);
            ur urVar = new ur(8.0f, true, new h(2));
            pa5 g = x91.g(0.0f, 0.0f, 0.0f, 16.0f, 7);
            if ((i14 & 14) != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object Q = yt22.Q();
            if (z2 || Q == ay0.a) {
                z3 = true;
                Q = new qw4(1, list2);
                yt22.o0(Q);
            } else {
                z3 = true;
            }
            boolean z4 = z3;
            x91.a(M2, (s34) null, g, urVar, (ib) null, (eh2) null, false, (xf) null, (vr2) Q, yt22, 24966, 490);
            yt22.r(z4);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new zp5(list2, str, str2, l3, l4, gs22, i);
        }
    }

    public static final ql0 t() {
        return rc9.x(62, 2.0f);
    }
}
