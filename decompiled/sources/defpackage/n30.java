package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: n30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class n30 implements hs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ aq4 x;

    public /* synthetic */ n30(aq4 aq4, int i) {
        this.w = i;
        this.x = aq4;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        k54 k54;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2 = this.w;
        vs7 vs7 = vs7.a;
        d63 d63 = ay0.a;
        aq4 aq4 = this.x;
        boolean z6 = true;
        switch (i2) {
            case b85.b:
                cu4 cu4 = (cu4) obj;
                yt2 yt2 = (yt2) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (yt2.g(cu4)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    List list = (List) aq4.getValue();
                    if ((intValue & 14) != 4) {
                        z6 = false;
                    }
                    Object Q = yt2.Q();
                    if (z6 || Q == d63) {
                        Q = new gg0(7, (Object) cu4);
                        yt2.o0(Q);
                    }
                    vr2 vr2 = (vr2) Q;
                    if (list instanceof RandomAccess) {
                        int size = list.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                if (!((Boolean) vr2.y(list.get(i3))).booleanValue()) {
                                    i3++;
                                }
                            }
                        }
                    } else {
                        if (list == null || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((Boolean) vr2.y(it.next())).booleanValue()) {
                                    }
                                }
                            }
                        }
                        k54 = k54.y;
                        t49.c(ha4.a.a(o55.p(k54, yt2)), su0.J(-1713684244, new o30(cu4, 0), yt2), yt2, 56);
                    }
                    k54 = k54.A;
                    t49.c(ha4.a.a(o55.p(k54, yt2)), su0.J(-1713684244, new o30(cu4, 0), yt2), yt2, 56);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                yt2 yt22 = (yt2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((sj2) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt22.V(intValue2 & 1, z2)) {
                    Iterator it2 = r11.y.iterator();
                    while (it2.hasNext()) {
                        r11 r11 = (r11) it2.next();
                        if (((r11) aq4.getValue()) == r11) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean e = yt22.e(r11.ordinal());
                        Object Q2 = yt22.Q();
                        if (e || Q2 == d63) {
                            Q2 = new n17(0, (Object) r11, (Object) aq4);
                            yt22.o0(Q2);
                        }
                        yt2 yt23 = yt22;
                        sp0.b(z3, (sr2) Q2, su0.J(971793722, new g17(r11, 1), yt22), (ml4) null, false, (gs2) null, (pq6) null, (cj6) null, (dj6) null, (ua0) null, (tr) null, (la5) null, yt23, 384, 16376);
                        yt22 = yt23;
                    }
                } else {
                    yt22.Y();
                }
                return vs7;
            default:
                yt2 yt24 = (yt2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((sj2) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (yt24.V(intValue3 & 1, z4)) {
                    Iterator it3 = q07.B.iterator();
                    while (it3.hasNext()) {
                        q07 q07 = (q07) it3.next();
                        if (((q07) aq4.getValue()) == q07) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        boolean e2 = yt24.e(q07.ordinal());
                        Object Q3 = yt24.Q();
                        if (e2 || Q3 == d63) {
                            Q3 = new qm3(29, (Object) q07, (Object) aq4);
                            yt24.o0(Q3);
                        }
                        yt2 yt25 = yt24;
                        sp0.b(z5, (sr2) Q3, su0.J(-550165906, new ph6(10, q07), yt24), (ml4) null, false, (gs2) null, (pq6) null, (cj6) null, (dj6) null, (ua0) null, (tr) null, (la5) null, yt25, 384, 16376);
                        yt24 = yt25;
                    }
                } else {
                    yt24.Y();
                }
                return vs7;
        }
    }
}
