package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: at1  reason: default package */
public final class at1 implements sr2 {
    public final /* synthetic */ int w;
    public final gt1 x;

    public /* synthetic */ at1(gt1 gt1, int i) {
        this.w = i;
        this.x = gt1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: wr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: wr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: wr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: wr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: wr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: wr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: wr5} */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d7, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dc, code lost:
        if (r3 == false) goto L_0x00d7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object b() {
        Object obj;
        us1 us1;
        Object obj2;
        bt5 bt5;
        fu6 fu6;
        int i = this.w;
        boolean z = false;
        gt1 gt1 = this.x;
        switch (i) {
            case b85.b /*0*/:
                gt1 gt12 = this.x;
                iq0 iq0 = gt12.G;
                if (iq0.a()) {
                    wp0 wp0 = new wp0(gt12, (s31) null, me6.x, true, 1, sy6.j);
                    List list = Collections.EMPTY_LIST;
                    int i2 = rs1.a;
                    if (iq0 == iq0.y || iq0.a()) {
                        us1 = vs1.a;
                        if (us1 == null) {
                            rs1.a(49);
                            throw null;
                        }
                    } else if (rs1.o(gt12)) {
                        us1 = vs1.a;
                        if (us1 == null) {
                            rs1.a(51);
                            throw null;
                        }
                    } else if (rs1.j(gt12)) {
                        us1 = vs1.j;
                        if (us1 == null) {
                            rs1.a(52);
                            throw null;
                        }
                    } else {
                        us1 = vs1.e;
                        if (us1 == null) {
                            rs1.a(53);
                            throw null;
                        }
                    }
                    wp0.u1(list, us1);
                    wp0.C = gt12.g0();
                    return wp0;
                }
                List list2 = gt12.A.L;
                list2.getClass();
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (!wg2.n.e(((wr5) obj).z).booleanValue()) {
                        }
                    } else {
                        obj = null;
                    }
                }
                wr5 wr5 = (wr5) obj;
                if (wr5 != null) {
                    return ((ei4) gt12.H.i).e(wr5, true);
                }
                return null;
            case 1:
                z00 z00 = gt1.H;
                List list3 = gt1.A.L;
                list3.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object next : list3) {
                    if (wg2.n.e(((wr5) next).z).booleanValue()) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    wr5 wr52 = (wr5) it2.next();
                    wr52.getClass();
                    arrayList2.add(((ei4) z00.i).e(wr52, false));
                }
                return dt0.M0(dt0.M0(arrayList2, sg3.F(gt1.p0())), ((ws1) z00.a).n.d(gt1));
            case 2:
                tr5 tr5 = gt1.A;
                if ((tr5.y & 4) != 4) {
                    return null;
                }
                vq0 e = gt1.C0().e(t49.P((vq4) gt1.H.b, tr5.B), oz4.C);
                if (e instanceof ql4) {
                    return (ql4) e;
                }
                return null;
            case 3:
                fl4 fl4 = gt1.E;
                fl4 fl42 = fl4.y;
                if (fl4 == fl42) {
                    List<Integer> list4 = gt1.A.Q;
                    list4.getClass();
                    if (!list4.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Integer num : list4) {
                            z00 z002 = gt1.H;
                            num.getClass();
                            gq0 J = t49.J((vq4) z002.b, num.intValue());
                            eq0 eq0 = ((ws1) z002.a).t;
                            Set set = eq0.c;
                            ql4 a = eq0.a(J, (xp0) null);
                            if (a != null) {
                                arrayList3.add(a);
                            }
                        }
                        return arrayList3;
                    } else if (fl4 == fl42) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        vj1 vj1 = gt1.M;
                        if (vj1 instanceof x95) {
                            su0.i(gt1, linkedHashSet, ((x95) vj1).R(), false);
                        }
                        su0.i(gt1, linkedHashSet, gt1.Y(), true);
                        return dt0.U0(linkedHashSet, new a91(10));
                    }
                }
                return a42.w;
            case 4:
                if (!gt1.j() && !gt1.z0()) {
                    return null;
                }
                boolean a2 = gt1.B.a(1, 5, 1);
                tr5 tr52 = gt1.A;
                z00 z003 = gt1.H;
                vq4 vq4 = (vq4) z003.b;
                wv1 wv1 = (wv1) z003.d;
                bk7 bk7 = (bk7) z003.h;
                tr52.getClass();
                vq4.getClass();
                if ((tr52.y & 8) == 8) {
                    uq4 d = uq4.d(vq4.getString(tr52.S));
                    int i3 = tr52.y;
                    if ((i3 & 16) == 16) {
                        bt5 = tr52.T;
                    } else if ((i3 & 32) == 32) {
                        bt5 = wv1.a(tr52.U);
                    } else {
                        bt5 = null;
                    }
                    if ((bt5 == null || (fu6 = bk7.d(bt5, true)) == null) && (fu6 = gt1.D0(d)) == null) {
                        ku4.u("cannot determine underlying type for value class ", uq4.d(vq4.getString(tr52.A)), " with property ", d);
                        return null;
                    }
                    obj2 = new cc3(d, fu6);
                } else {
                    if (a2 && wg2.k.e(tr52.z).booleanValue()) {
                        List list5 = tr52.L;
                        list5.getClass();
                        Iterator it3 = list5.iterator();
                        wr5 wr53 = null;
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            } else {
                                Object next2 = it3.next();
                                if (!wg2.n.e(next2.z).booleanValue()) {
                                    if (z) {
                                        break;
                                    } else {
                                        z = true;
                                        wr53 = next2;
                                    }
                                }
                            }
                        }
                        wr5 wr54 = wr53;
                        if (wr54 != null) {
                            List<jt5> list6 = wr54.A;
                            list6.getClass();
                            ArrayList arrayList4 = new ArrayList(et0.e0(list6, 10));
                            for (jt5 jt5 : list6) {
                                uq4 d2 = uq4.d(vq4.getString(jt5.A));
                                bt5 E = p25.E(jt5, wv1);
                                E.getClass();
                                arrayList4.add(new yb5(d2, bk7.d(E, true)));
                            }
                            obj2 = new kn4(arrayList4);
                        }
                    }
                    obj2 = null;
                }
                if (obj2 != null) {
                    return obj2;
                }
                if (a2) {
                    return null;
                }
                wp0 p0 = gt1.p0();
                if (p0 != null) {
                    List S = p0.S();
                    S.getClass();
                    uq4 name = ((h28) dt0.w0(S)).getName();
                    name.getClass();
                    fu6 D0 = gt1.D0(name);
                    if (D0 != null) {
                        return new cc3(name, D0);
                    }
                    ta1.l("Value class has no underlying property: ", gt1);
                    return null;
                }
                ta1.l("Inline class has no primary constructor: ", gt1);
                return null;
            case 5:
                return dt0.b1(((ws1) gt1.H.a).e.t(gt1.Q));
            default:
                return ya5.g(gt1);
        }
    }
}
