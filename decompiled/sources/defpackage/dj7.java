package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: dj7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class dj7 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ dj7(vr2 vr2, vr2 vr22, int i) {
        this.w = 13;
        this.z = vr2;
        this.y = vr22;
        this.x = i;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        long b;
        long j;
        long j2;
        boolean z4;
        int i = this.w;
        boolean z5 = false;
        int i2 = 2;
        vs7 vs7 = vs7.a;
        boolean z6 = true;
        int i3 = this.x;
        Object obj3 = this.z;
        Object obj4 = this.y;
        switch (i) {
            case b85.b:
                ArrayList arrayList = (ArrayList) obj4;
                vr2 vr2 = (vr2) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    ml4 o = j45.o(x91.K(yu6.c, 4.0f));
                    ea6 a = ca6.a(wr.a, xb4.H, yt2, 0);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, o);
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
                    yt2.e0(-473994885);
                    Iterator it = arrayList.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            ej7 ej7 = (ej7) next;
                            if (i3 == i4) {
                                z3 = z6;
                            } else {
                                z3 = z5;
                            }
                            if (z3) {
                                yt2.e0(-1320175599);
                                b = ((zg4) yt2.k(ch4.b)).a.c;
                                yt2.r(z5);
                            } else {
                                yt2.e0(-1320079840);
                                b = jt0.b(0.5f, ((zg4) yt2.k(ch4.b)).a.r);
                                yt2.r(z5);
                            }
                            yt2 yt22 = yt2;
                            yt2 yt23 = yt22;
                            ml4 h = b96.h(we.f(new lz3(1.0f, z6).d(yu6.b), ((zg4) yt23.k(ch4.b)).c.c), ((jt0) ru6.a(b, (hl) null, "background color", yt22, 384, 10).getValue()).a, gr8.h);
                            Object Q = yt23.Q();
                            Object obj5 = ay0.a;
                            if (Q == obj5) {
                                Q = b81.e(yt23);
                            }
                            ap4 ap4 = (ap4) Q;
                            boolean g = yt23.g(vr2) | yt23.e(i4);
                            Object Q2 = yt23.Q();
                            if (g || Q2 == obj5) {
                                Q2 = new yh1(i4, 4, vr2);
                                yt23.o0(Q2);
                            }
                            ml4 M = x91.M(h49.t(h, ap4, (o86) null, false, (s86) null, (sr2) Q2, 28), 12.0f, 0.0f, i2);
                            lh4 d = mb0.d(xb4.y, z5);
                            int hashCode2 = Long.hashCode(yt23.T);
                            vf5 m2 = yt23.m();
                            ml4 E2 = gw8.E(yt23, M);
                            ux0.d.getClass();
                            vy0 vy02 = tx0.b;
                            yt23.i0();
                            if (yt23.S) {
                                yt23.l(vy02);
                            } else {
                                yt23.r0();
                            }
                            ck ckVar = tx0.f;
                            g75.Q(ckVar, yt23, d);
                            ck ckVar2 = tx0.e;
                            g75.Q(ckVar2, yt23, m2);
                            Integer valueOf = Integer.valueOf(hashCode2);
                            ck ckVar3 = tx0.g;
                            g75.Q(ckVar3, yt23, valueOf);
                            ce ceVar = tx0.h;
                            g75.O(yt23, ceVar);
                            ck ckVar4 = tx0.d;
                            g75.Q(ckVar4, yt23, E2);
                            sd2 sd2 = yu6.c;
                            ea6 a2 = ca6.a(wr.e, xb4.I, yt23, 54);
                            vs7 vs72 = vs7;
                            int hashCode3 = Long.hashCode(yt23.T);
                            vf5 m3 = yt23.m();
                            ml4 E3 = gw8.E(yt23, sd2);
                            yt23.i0();
                            Iterator it2 = it;
                            if (yt23.S) {
                                yt23.l(vy02);
                            } else {
                                yt23.r0();
                            }
                            g75.Q(ckVar, yt23, a2);
                            g75.Q(ckVar2, yt23, m3);
                            f21.s(hashCode3, yt23, ckVar3, yt23, ceVar);
                            g75.Q(ckVar4, yt23, E3);
                            x83 x83 = ej7.b;
                            if (z3) {
                                yt23.e0(1880813780);
                                j = su0.r(yt23).a;
                                yt23.r(false);
                            } else {
                                yt23.e0(1880916235);
                                j = su0.r(yt23).s;
                                yt23.r(false);
                            }
                            long j3 = j;
                            jl4 jl4 = jl4.w;
                            d83.a(x83, (String) null, yu6.l(jl4, 20.0f), j3, yt23, 432, 0);
                            k75.a(yt23, yu6.p(jl4, 8.0f));
                            String u = l55.u(ej7.a, yt23);
                            tg7 tg7 = su0.x(yt23).m;
                            if (z3) {
                                yt23.e0(1881395092);
                                j2 = su0.r(yt23).a;
                                yt23.r(false);
                            } else {
                                yt23.e0(1881497547);
                                j2 = su0.r(yt23).s;
                                yt23.r(false);
                            }
                            yt2 yt24 = yt23;
                            yf7.b(u, (ml4) null, j2, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, tg7, yt24, 0, 0, 131066);
                            yt2 = yt24;
                            yt2.r(true);
                            yt2.r(true);
                            vs7 = vs72;
                            i4 = i5;
                            z5 = false;
                            i2 = 2;
                            z6 = true;
                            it = it2;
                        } else {
                            sg3.Z();
                            throw null;
                        }
                    }
                    boolean z7 = z6;
                    vs7 vs73 = vs7;
                    yt2.r(z5);
                    yt2.r(z7);
                    return vs73;
                }
                vs7 vs74 = vs7;
                yt2.Y();
                return vs74;
            case 1:
                ((Integer) obj2).intValue();
                yl.a((vl) obj4, (List) obj3, (yt2) obj, b85.v(i3 | 1));
                return vs7;
            case 2:
                ((Integer) obj2).intValue();
                b30.a((k20) obj4, (gs2) obj3, (yt2) obj, b85.v(i3 | 1));
                return vs7;
            case 3:
                ((Integer) obj2).getClass();
                ((fw0) obj4).e(obj3, (yt2) obj, b85.v(i3) | 1);
                return vs7;
            case 4:
                ((Integer) obj2).getClass();
                t49.d((ju5[]) obj4, (gs2) obj3, (yt2) obj, b85.v(i3 | 1));
                return vs7;
            case 5:
                ((Integer) obj2).intValue();
                t49.c((ju5) obj4, (gs2) obj3, (yt2) obj, b85.v(i3 | 1));
                return vs7;
            case 6:
                ((Integer) obj2).intValue();
                gi1.l((ig1) obj4, (vh0) obj3, (yt2) obj, b85.v(i3 | 1));
                return vs7;
            case 7:
                ((Integer) obj2).intValue();
                t13.i((o03) obj4, (sr2) obj3, (yt2) obj, b85.v(i3 | 1));
                return vs7;
            case 8:
                ((Integer) obj2).getClass();
                ((wz3) obj4).d(i3, obj3, (yt2) obj, b85.v(1));
                return vs7;
            case 9:
                h24 h24 = (h24) obj4;
                yt2 yt25 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (yt25.V(1 & intValue2, z4)) {
                    h24.d(i3, obj3, yt25, 0);
                } else {
                    yt25.Y();
                }
                return vs7;
            case 10:
                ((Integer) obj2).getClass();
                ((i34) obj4).d(i3, obj3, (yt2) obj, b85.v(1));
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                ((Integer) obj2).intValue();
                hj8.h((ef3) obj4, (pq6) obj3, (yt2) obj, b85.v(i3 | 1));
                return vs7;
            case 12:
                ((Integer) obj2).getClass();
                ((bb5) obj4).d(i3, obj3, (yt2) obj, b85.v(1));
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                ((Integer) obj2).intValue();
                yi5.a((vr2) obj3, (vr2) obj4, (yt2) obj, b85.v(i3 | 1));
                return vs7;
            case 14:
                ((Integer) obj2).intValue();
                mp7.s((String) obj4, (Integer) obj3, (yt2) obj, b85.v(i3 | 1));
                return vs7;
            case h75.g /*15*/:
                String str = (String) obj4;
                bd5 bd5 = (bd5) obj3;
                yt2 yt26 = (yt2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z5 = true;
                }
                if (yt26.V(intValue3 & 1, z5)) {
                    am2 am2 = am2.A;
                    long k = ya5.k(13);
                    long x2 = xz5.x(jt0.b, jt0.c);
                    if (bd5.d() != i3) {
                        x2 = jt0.b(0.7f, x2);
                    }
                    yf7.b(str, (ml4) null, x2, k, am2, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt26, 1597440, 0, 262058);
                } else {
                    yt26.Y();
                }
                return vs7;
            case 16:
                ((Integer) obj2).intValue();
                xz5.d((oz5) obj4, (sr2) obj3, (yt2) obj, b85.v(i3 | 1));
                return vs7;
            case 17:
                ((Integer) obj2).intValue();
                d36.r((String) obj4, (String) obj3, (yt2) obj, b85.v(i3 | 1));
                return vs7;
            case 18:
                ((Integer) obj2).getClass();
                c35.a((nw6) obj4, (ml4) obj3, (yt2) obj, b85.v(i3 | 1));
                return vs7;
            case 19:
                ((Integer) obj2).intValue();
                q17.e((r11) obj4, (vr2) obj3, (yt2) obj, b85.v(i3 | 1));
                return vs7;
            case 20:
                ((Integer) obj2).getClass();
                q17.d((is2) obj4, (t17) obj3, (yt2) obj, b85.v(i3 | 1));
                return vs7;
            case 21:
                ((Integer) obj2).getClass();
                yf7.a((tg7) obj4, (gs2) obj3, (yt2) obj, b85.v(i3 | 1));
                return vs7;
            default:
                ((Integer) obj2).intValue();
                ((mm7) obj4).a(obj3, (yt2) obj, b85.v(i3 | 1));
                return vs7;
        }
    }

    public /* synthetic */ dj7(h24 h24, int i, Object obj, int i2, int i3) {
        this.w = i3;
        this.y = h24;
        this.x = i;
        this.z = obj;
    }

    public /* synthetic */ dj7(Object obj, int i, Object obj2, int i2) {
        this.w = i2;
        this.y = obj;
        this.x = i;
        this.z = obj2;
    }

    public /* synthetic */ dj7(Object obj, Object obj2, int i, int i2) {
        this.w = i2;
        this.y = obj;
        this.z = obj2;
        this.x = i;
    }
}
