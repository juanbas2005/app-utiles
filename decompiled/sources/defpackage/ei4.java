package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ei4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ei4 {
    public final z00 a;
    public final qc3 b;

    public ei4(z00 z00) {
        this.a = z00;
        ws1 ws1 = (ws1) z00.a;
        this.b = new qc3(ws1.b, ws1.l);
    }

    public final st5 a(vj1 vj1) {
        if (vj1 instanceof x95) {
            up2 up2 = ((y95) ((x95) vj1)).A;
            z00 z00 = this.a;
            return new rt5(up2, (vq4) z00.b, (wv1) z00.d, (it1) z00.g);
        } else if (vj1 instanceof gt1) {
            return ((gt1) vj1).Q;
        } else {
            return null;
        }
    }

    public final ArrayList b(List list, List list2, wu2 wu2, int i) {
        int i2;
        rm rmVar;
        ei4 ei4 = this;
        z00 z00 = ei4.a;
        vj1 vj1 = (vj1) z00.c;
        vj1.getClass();
        pi0 pi0 = (pi0) vj1;
        vj1 r = pi0.r();
        r.getClass();
        st5 a2 = ei4.a(r);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object next : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                bt5 bt5 = (bt5) next;
                jt5 jt5 = (jt5) dt0.z0(i3, list2);
                if (jt5 == null || (jt5.y & 1) != 1) {
                    i2 = 0;
                } else {
                    i2 = jt5.z;
                }
                if (a2 == null || !wg2.c.e(i2).booleanValue()) {
                    rmVar = me6.x;
                } else {
                    rmVar = new g05(((ws1) z00.a).a, new di4(ei4, a2, wu2, i, i3, jt5, 1));
                }
                qz3 v = fd1.v(pi0, ((bk7) z00.h).g(bt5), (uq4) null, rmVar, i3);
                if (v != null) {
                    arrayList.add(v);
                }
                ei4 = this;
                i3 = i4;
            } else {
                sg3.Z();
                throw null;
            }
        }
        return arrayList;
    }

    public final rm c(wu2 wu2, int i, int i2) {
        if (!wg2.c.e(i).booleanValue()) {
            return me6.x;
        }
        return new g05(((ws1) this.a.a).a, new bi4(this, wu2, i2, 0));
    }

    public final rm d(qs5 qs5, boolean z) {
        if (!wg2.c.e(qs5.z).booleanValue()) {
            return me6.x;
        }
        return new g05(((ws1) this.a.a).a, new ci4(this, z, qs5));
    }

    public final zs1 e(wr5 wr5, boolean z) {
        int i;
        us1 us1;
        z00 z00 = this.a;
        vj1 vj1 = (vj1) z00.c;
        vj1.getClass();
        ql4 ql4 = (ql4) vj1;
        boolean z2 = z;
        zs1 zs1 = new zs1(ql4, (s31) null, c(wr5, wr5.z, 1), z2, 1, wr5, (vq4) z00.b, (wv1) z00.d, (i48) z00.e, (it1) z00.g, (sy6) null);
        List list = wr5.A;
        list.getClass();
        List h = ((ei4) z00.a(zs1, a42.w, (vq4) z00.b, (wv1) z00.d, (i48) z00.e, (n80) z00.f).i).h(list, wr5, 1);
        pt5 pt5 = (pt5) wg2.d.e(wr5.z);
        if (pt5 == null) {
            i = -1;
        } else {
            i = xt5.b[pt5.ordinal()];
        }
        switch (i) {
            case 1:
                us1 = vs1.d;
                us1.getClass();
                break;
            case 2:
                us1 = vs1.a;
                us1.getClass();
                break;
            case 3:
                us1 = vs1.b;
                us1.getClass();
                break;
            case 4:
                us1 = vs1.c;
                us1.getClass();
                break;
            case 5:
                us1 = vs1.e;
                us1.getClass();
                break;
            case 6:
                us1 = vs1.f;
                us1.getClass();
                break;
            default:
                us1 = vs1.a;
                us1.getClass();
                break;
        }
        zs1.u1(h, us1);
        zs1.p1(ql4.g0());
        zs1.N = ql4.H();
        zs1.R = !wg2.o.e(wr5.z).booleanValue();
        return zs1;
    }

    public final tt1 f(js5 js5) {
        int i;
        rm rmVar;
        i48 i48;
        qz3 qz3;
        ql4 ql4;
        vw3 g;
        js5 js52 = js5;
        z00 z00 = this.a;
        vq4 vq4 = (vq4) z00.b;
        wv1 wv1 = (wv1) z00.d;
        js52.getClass();
        if ((js52.y & 1) == 1) {
            i = js52.z;
        } else {
            int i2 = js52.A;
            i = ((i2 >> 8) << 6) + (i2 & 63);
        }
        int i3 = i;
        rm c = c(js52, i3, 1);
        int i4 = js52.y;
        if ((i4 & 32) == 32 || (i4 & 64) == 64) {
            rmVar = new xs1(((ws1) z00.a).a, new bi4(this, js52, 1, 1));
        } else {
            rmVar = me6.x;
        }
        rm rmVar2 = rmVar;
        if (ts1.g((vj1) z00.c).a(t49.P(vq4, js52.B)).equals(y87.a)) {
            i48 = i48.b;
        } else {
            i48 = (i48) z00.e;
        }
        tt1 tt1 = new tt1((vj1) z00.c, (au6) null, c, t49.P(vq4, js52.B), ub5.o((ks5) wg2.q.e(i3)), js52, (vq4) z00.b, wv1, i48, (it1) z00.g, (sy6) null);
        List list = js52.E;
        list.getClass();
        z00 b2 = z00.a(tt1, list, (vq4) z00.b, (wv1) z00.d, (i48) z00.e, (n80) z00.f);
        ei4 ei4 = (ei4) b2.i;
        bk7 bk7 = (bk7) b2.h;
        bt5 z = p25.z(js52, wv1);
        qz3 qz32 = null;
        if (z == null || (g = bk7.g(z)) == null) {
            qz3 = null;
        } else {
            qz3 = fd1.B(tt1, g, rmVar2);
        }
        vj1 vj1 = (vj1) z00.c;
        if (vj1 instanceof ql4) {
            ql4 = (ql4) vj1;
        } else {
            ql4 = null;
        }
        if (ql4 != null) {
            qz32 = ql4.Q();
        }
        qz3 qz33 = qz32;
        List i5 = p25.i(js52, wv1);
        List list2 = js52.K;
        list2.getClass();
        ArrayList b3 = ei4.b(i5, list2, js52, 1);
        List b4 = bk7.b();
        List list3 = js52.L;
        list3.getClass();
        tt1.t1(qz3, qz33, b3, b4, ei4.h(list3, js52, 1), bk7.g(p25.B(js52, wv1)), kw5.l((ls5) wg2.e.e(i3)), ub5.i((pt5) wg2.d.e(i3)), b42.w);
        tt1.I = wg2.r.e(i3).booleanValue();
        tt1.J = wg2.s.e(i3).booleanValue();
        tt1.K = wg2.v.e(i3).booleanValue();
        tt1.L = wg2.t.e(i3).booleanValue();
        tt1.M = wg2.u.e(i3).booleanValue();
        tt1.Q = wg2.w.e(i3).booleanValue();
        tt1.N = wg2.x.e(i3).booleanValue();
        tt1.R = !wg2.y.e(i3).booleanValue();
        ((ws1) z00.a).m.getClass();
        return tt1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: ql4} */
    /* JADX WARNING: type inference failed for: r0v5, types: [ql4] */
    /* JADX WARNING: type inference failed for: r0v7, types: [in8, lc2] */
    /* JADX WARNING: type inference failed for: r2v20, types: [in8, lc2] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02f4  */
    public final st1 g(qs5 qs5, boolean z) {
        int i;
        rm rmVar;
        ei4 ei4;
        boolean z2;
        rm rmVar2;
        vj1 vj1;
        ql4 ql4;
        boolean z3;
        qz3 qz3;
        bt5 A;
        qz3 qz32;
        st1 st1;
        fr5 fr5;
        jr5 jr5;
        hb4 hb4;
        boolean z4;
        vj1 vj12;
        ql4 ql42;
        Object obj;
        int i2;
        vw3 g;
        qs5 qs52 = qs5;
        rm rmVar3 = me6.x;
        z00 z00 = this.a;
        vq4 vq4 = (vq4) z00.b;
        wv1 wv1 = (wv1) z00.d;
        qs52.getClass();
        if ((qs52.y & 1) == 1) {
            i = qs52.z;
        } else {
            int i3 = qs52.A;
            i = ((i3 >> 8) << 6) + (i3 & 63);
        }
        if (z) {
            List<qr5> list = qs52.Q;
            list.getClass();
            ArrayList arrayList = new ArrayList(et0.e0(list, 10));
            for (qr5 qr5 : list) {
                qr5.getClass();
                arrayList.add(this.b.v(qr5, vq4));
            }
            if (arrayList.isEmpty()) {
                rmVar = rmVar3;
            } else {
                rmVar = new tm(0, arrayList);
            }
        } else {
            rmVar = null;
        }
        vj1 vj13 = (vj1) z00.c;
        if (rmVar == null) {
            rmVar = c(qs52, i, 2);
        }
        ug2 ug2 = wg2.e;
        fl4 l = kw5.l((ls5) ug2.e(i));
        ug2 ug22 = wg2.d;
        us1 i4 = ub5.i((pt5) ug22.e(i));
        boolean booleanValue = wg2.A.e(i).booleanValue();
        uq4 P = t49.P(vq4, qs52.B);
        int o = ub5.o((ks5) wg2.q.e(i));
        boolean booleanValue2 = wg2.E.e(i).booleanValue();
        boolean booleanValue3 = wg2.D.e(i).booleanValue();
        boolean booleanValue4 = wg2.G.e(i).booleanValue();
        us1 us1 = i4;
        boolean z5 = booleanValue4;
        us1 us12 = us1;
        z00 z002 = z00;
        ug2 ug23 = ug2;
        ug2 ug24 = ug22;
        boolean z6 = booleanValue3;
        fl4 fl4 = l;
        boolean z7 = booleanValue2;
        rm rmVar4 = rmVar;
        boolean z8 = booleanValue;
        st1 st12 = new st1(vj13, (cr5) null, rmVar4, fl4, us12, z8, P, o, z7, z6, z5, wg2.H.e(i).booleanValue(), wg2.I.e(i).booleanValue(), qs52, (vq4) z00.b, wv1, (i48) z00.e, (it1) z00.g);
        wv1 wv12 = wv1;
        List list2 = qs52.E;
        list2.getClass();
        z00 b2 = z002.a(st12, list2, (vq4) z002.b, (wv1) z002.d, (i48) z002.e, (n80) z002.f);
        bk7 bk7 = (bk7) b2.h;
        int i5 = i;
        boolean booleanValue5 = wg2.B.e(i5).booleanValue();
        if (booleanValue5) {
            int i6 = qs52.y;
            if ((i6 & 32) == 32 || (i6 & 64) == 64) {
                z2 = true;
                ei4 = this;
                rmVar2 = new xs1(((ws1) z002.a).a, new bi4(ei4, qs52, 3, 1));
                vw3 g2 = bk7.g(p25.C(qs52, wv12));
                List b3 = bk7.b();
                vj1 = (vj1) z002.c;
                if (!(vj1 instanceof ql4)) {
                    ql4 = (ql4) vj1;
                } else {
                    ql4 = null;
                }
                if (ql4 == null) {
                    z3 = z2;
                    qz3 = ql4.Q();
                } else {
                    z3 = z2;
                    qz3 = null;
                }
                A = p25.A(qs52, wv12);
                if (A == null || (g = bk7.g(A)) == null) {
                    qz32 = null;
                } else {
                    qz32 = fd1.B(st12, g, rmVar2);
                }
                List j = p25.j(qs52, wv12);
                List list3 = qs52.K;
                list3.getClass();
                ArrayList b4 = ((ei4) b2.i).b(j, list3, qs52, 3);
                st1 st13 = st12;
                boolean z9 = z3;
                st13.m1(g2, b3, qz3, qz32, b4);
                st1 st14 = st13;
                ug2 ug25 = ug24;
                ug2 ug26 = ug23;
                int b5 = wg2.b(wg2.c.e(i5).booleanValue(), (pt5) ug25.e(i5), (ls5) ug26.e(i5));
                or2 or2 = sy6.j;
                if (!booleanValue5) {
                    if ((qs52.y & 256) == 256) {
                        i2 = qs52.M;
                    } else {
                        i2 = b5;
                    }
                    boolean booleanValue6 = wg2.N.e(i2).booleanValue();
                    boolean booleanValue7 = wg2.O.e(i2).booleanValue();
                    boolean booleanValue8 = wg2.P.e(i2).booleanValue();
                    rm c = ei4.c(qs52, i2, 3);
                    if (booleanValue6) {
                        st1 = st14;
                        fr5 = new fr5(st14, c, kw5.l((ls5) ug26.e(i2)), ub5.i((pt5) ug25.e(i2)), !booleanValue6, booleanValue7, booleanValue8, st14.u(), (fr5) null, or2);
                    } else {
                        st1 = st14;
                        fr5 = fd1.w(st1, c);
                    }
                    fr5.i1(st1.k());
                } else {
                    st1 = st14;
                    fr5 = null;
                }
                if (!wg2.C.e(i5).booleanValue()) {
                    if ((qs52.y & 512) == 512) {
                        b5 = qs52.N;
                    }
                    boolean booleanValue9 = wg2.N.e(b5).booleanValue();
                    boolean booleanValue10 = wg2.O.e(b5).booleanValue();
                    boolean booleanValue11 = wg2.P.e(b5).booleanValue();
                    rm c2 = ei4.c(qs52, b5, 4);
                    if (booleanValue9) {
                        jr5 = new jr5(st1, c2, kw5.l((ls5) ug26.e(b5)), ub5.i((pt5) ug25.e(b5)), !booleanValue9, booleanValue10, booleanValue11, st1.u(), (jr5) null, or2);
                        h28 h28 = (h28) dt0.Q0(((ei4) b2.a(jr5, a42.w, (vq4) b2.b, (wv1) b2.d, (i48) b2.e, (n80) b2.f).i).h(sg3.D(qs52.L), qs52, 4));
                        if (h28 != null) {
                            jr5.I = h28;
                            hb4 = null;
                        } else {
                            jr5.v0(6);
                            throw null;
                        }
                    } else {
                        hb4 = null;
                        jr5 = fd1.x(st1, c2);
                    }
                } else {
                    hb4 = null;
                    jr5 = null;
                }
                if (!wg2.F.e(i5).booleanValue()) {
                    z4 = false;
                    st1.k1(hb4, new ai4(ei4, qs52, st1, 0));
                } else {
                    z4 = false;
                }
                vj12 = (vj1) z002.c;
                if (!(vj12 instanceof ql4)) {
                    ql42 = (ql4) vj12;
                } else {
                    ql42 = hb4;
                }
                if (ql42 == 0) {
                    obj = ql42.v();
                } else {
                    obj = hb4;
                }
                if (obj == iq0.A) {
                    st1.k1(hb4, new ai4(ei4, qs52, st1, z9));
                }
                st1.j1(fr5, jr5, new in8(ei4.d(qs52, z4)), new in8(ei4.d(qs52, z9)));
                return st1;
            }
        }
        z2 = true;
        ei4 = this;
        rmVar2 = rmVar3;
        vw3 g22 = bk7.g(p25.C(qs52, wv12));
        List b32 = bk7.b();
        vj1 = (vj1) z002.c;
        if (!(vj1 instanceof ql4)) {
        }
        if (ql4 == null) {
        }
        A = p25.A(qs52, wv12);
        if (A == null || (g = bk7.g(A)) == null) {
        }
        List j2 = p25.j(qs52, wv12);
        List list32 = qs52.K;
        list32.getClass();
        ArrayList b42 = ((ei4) b2.i).b(j2, list32, qs52, 3);
        st1 st132 = st12;
        boolean z92 = z3;
        st132.m1(g22, b32, qz3, qz32, b42);
        st1 st142 = st132;
        ug2 ug252 = ug24;
        ug2 ug262 = ug23;
        int b52 = wg2.b(wg2.c.e(i5).booleanValue(), (pt5) ug252.e(i5), (ls5) ug262.e(i5));
        or2 or22 = sy6.j;
        if (!booleanValue5) {
        }
        if (!wg2.C.e(i5).booleanValue()) {
        }
        if (!wg2.F.e(i5).booleanValue()) {
        }
        vj12 = (vj1) z002.c;
        if (!(vj12 instanceof ql4)) {
        }
        if (ql42 == 0) {
        }
        if (obj == iq0.A) {
        }
        st1.j1(fr5, jr5, new in8(ei4.d(qs52, z4)), new in8(ei4.d(qs52, z92)));
        return st1;
    }

    public final List h(List list, wu2 wu2, int i) {
        int i2;
        vw3 vw3;
        int i3;
        rm rmVar;
        bt5 bt5;
        vw3 vw32;
        ei4 ei4 = this;
        z00 z00 = ei4.a;
        wv1 wv1 = (wv1) z00.d;
        bk7 bk7 = (bk7) z00.h;
        vj1 vj1 = (vj1) z00.c;
        vj1.getClass();
        pi0 pi0 = (pi0) vj1;
        vj1 r = pi0.r();
        r.getClass();
        st5 a2 = ei4.a(r);
        List list2 = list;
        ArrayList arrayList = new ArrayList(et0.e0(list2, 10));
        int i4 = 0;
        for (Object next : list2) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                jt5 jt5 = (jt5) next;
                if ((jt5.y & 1) == 1) {
                    i2 = jt5.z;
                } else {
                    i2 = 0;
                }
                if (a2 == null || !wg2.c.e(i2).booleanValue()) {
                    i3 = i4;
                    vw3 = null;
                    rmVar = me6.x;
                } else {
                    i3 = i4;
                    vw3 = null;
                    rmVar = new g05(((ws1) z00.a).a, new di4(ei4, a2, wu2, i, i3, jt5, 0));
                }
                uq4 P = t49.P((vq4) z00.b, jt5.A);
                vw3 g = bk7.g(p25.E(jt5, wv1));
                boolean booleanValue = wg2.K.e(i2).booleanValue();
                boolean booleanValue2 = wg2.L.e(i2).booleanValue();
                boolean booleanValue3 = wg2.M.e(i2).booleanValue();
                int i6 = jt5.y;
                if ((i6 & 16) == 16) {
                    bt5 = jt5.D;
                } else if ((i6 & 32) == 32) {
                    bt5 = wv1.a(jt5.E);
                } else {
                    bt5 = vw3;
                }
                if (bt5 != null) {
                    vw32 = bk7.g(bt5);
                } else {
                    vw32 = vw3;
                }
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new h28(pi0, (h28) null, i3, rmVar, P, g, booleanValue, booleanValue2, booleanValue3, vw32, sy6.j));
                arrayList = arrayList2;
                i4 = i5;
                ei4 = this;
            } else {
                sg3.Z();
                throw null;
            }
        }
        return dt0.b1(arrayList);
    }
}
