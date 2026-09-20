package defpackage;

import java.util.List;

/* renamed from: p71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p71 implements lh4 {
    public final /* synthetic */ u44 a;
    public final /* synthetic */ ze7 b;
    public final /* synthetic */ w98 c;
    public final /* synthetic */ o81 d;
    public final /* synthetic */ vr2 e;
    public final /* synthetic */ hf7 f;
    public final /* synthetic */ v35 g;
    public final /* synthetic */ tp1 h;
    public final /* synthetic */ yb0 i;
    public final /* synthetic */ int j;

    public p71(u44 u44, ze7 ze7, w98 w98, o81 o81, vr2 vr2, hf7 hf7, v35 v35, tp1 tp1, yb0 yb0, int i2) {
        this.a = u44;
        this.b = ze7;
        this.c = w98;
        this.d = o81;
        this.e = vr2;
        this.f = hf7;
        this.g = v35;
        this.h = tp1;
        this.i = yb0;
        this.j = i2;
    }

    public final int a(kg3 kg3, List list, int i2) {
        u44 u44 = this.a;
        u44.a.a(kg3.getLayoutDirection());
        o9 o9Var = u44.a.j;
        if (o9Var != null) {
            return l55.f(o9Var.e());
        }
        h.s("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x024d  */
    public final mh4 b(oh4 oh4, List list, long j2) {
        vr2 vr2;
        bg7 bg7;
        bg7 bg72;
        bg7 bg73;
        bg7 bg74;
        p71 p71;
        int i2;
        dy3 dy3;
        vl vlVar;
        ag7 ag7;
        long j3;
        ey3 ey3;
        int i3;
        int i4;
        u44 u44 = this.a;
        ix6 h2 = j45.h();
        if (h2 != null) {
            vr2 = h2.e();
        } else {
            vr2 = null;
        }
        ix6 j4 = j45.j(h2);
        try {
            cg7 d2 = u44.d();
            if (d2 != null) {
                bg7 = d2.a;
            } else {
                bg7 = null;
            }
            td7 td7 = u44.a;
            ey3 layoutDirection = oh4.getLayoutDirection();
            int i5 = td7.f;
            boolean z = td7.e;
            int i6 = td7.c;
            if (bg7 != null) {
                pn4 pn4 = bg7.b;
                ag7 ag72 = bg7.a;
                vl vlVar2 = td7.a;
                tg7 tg7 = td7.b;
                List list2 = td7.i;
                tp1 tp1 = td7.g;
                dl2 dl2 = td7.h;
                bg7 bg75 = bg7;
                if (pn4.a.b()) {
                    j3 = j2;
                    ey3 = layoutDirection;
                } else {
                    vl vlVar3 = ag72.a;
                    dl2 dl22 = dl2;
                    ey3 ey32 = layoutDirection;
                    long j5 = ag72.j;
                    if (!sg3.e(vlVar3, vlVar2) || !ag72.b.c(tg7) || !sg3.e(ag72.c, list2) || ag72.d != i6 || ag72.e != z || ag72.f != i5 || !sg3.e(ag72.g, tp1)) {
                        j3 = j2;
                        bg72 = bg75;
                        ey3 = ey32;
                    } else {
                        ey3 = ey32;
                        if (ag72.h != ey3 || !sg3.e(ag72.i, dl22) || k31.j(j2) != k31.j(j5) || ((z || i5 == 2) && !(k31.h(j2) == k31.h(j5) && k31.g(j2) == k31.g(j5)))) {
                            j3 = j2;
                        } else {
                            vl vlVar4 = ag72.a;
                            tg7 tg72 = td7.b;
                            vl vlVar5 = vlVar4;
                            List list3 = ag72.c;
                            int i7 = ag72.d;
                            boolean z2 = ag72.e;
                            int i8 = ag72.f;
                            tp1 tp12 = ag72.g;
                            ey3 ey33 = ag72.h;
                            pn4 pn42 = pn4;
                            dl2 dl23 = ag72.i;
                            bg72 = bg75;
                            long j6 = j2;
                            bg73 = new bg7(new ag7(vlVar5, tg72, list3, i7, z2, i8, tp12, ey33, dl23, j6), pn42, m31.d(j6, (((long) l55.f(pn42.e)) & 4294967295L) | (((long) l55.f(pn42.d)) << 32)));
                            long j7 = bg73.c;
                            Integer valueOf = Integer.valueOf((int) (j7 >> 32));
                            Integer valueOf2 = Integer.valueOf((int) (j7 & 4294967295L));
                            int intValue = valueOf.intValue();
                            int intValue2 = valueOf2.intValue();
                            bg74 = bg72;
                            if (sg3.e(bg74, bg73)) {
                                if (d2 != null) {
                                    dy3 = d2.c;
                                } else {
                                    dy3 = null;
                                }
                                u44.i.setValue(new cg7(bg73, dy3));
                                u44.p = false;
                                p71 = this;
                                ze7 ze7 = p71.b;
                                if (ze7.k() && ze7.j() && ((k44) p71.c).b() && lg7.c(((lg7) u44.A.getValue()).a) && lg7.c(((lg7) u44.B.getValue()).a) && u44.b()) {
                                    if (bg74 == null || (ag7 = bg74.a) == null) {
                                        vlVar = null;
                                    } else {
                                        vlVar = ag7.a;
                                    }
                                    if (!sg3.e(vlVar, bg73.a.a)) {
                                        ar7.H(p71.d, (e81) null, (r81) null, new n0(ze7, p71.i, (f61) null, 23), 3);
                                    }
                                }
                                p71.e.y(bg73);
                                pv8.M(u44, p71.f, p71.g);
                            } else {
                                p71 = this;
                            }
                            if (p71.j != 1) {
                                i2 = l55.f(bg73.b.b(0));
                            } else {
                                i2 = 0;
                            }
                            u44.g.setValue(new lx1(p71.h.P(i2)));
                            return oh4.d0(intValue, intValue2, sf4.V(new yb5(nb.a, Integer.valueOf(Math.round(bg73.d))), new yb5(nb.b, Integer.valueOf(Math.round(bg73.e)))), new vd2(20));
                        }
                    }
                }
                bg72 = bg75;
            } else {
                j3 = j2;
                bg72 = bg7;
                ey3 = layoutDirection;
            }
            td7.a(ey3);
            int j8 = k31.j(j3);
            if ((z || i5 == 2) && k31.d(j3)) {
                i3 = k31.h(j3);
            } else {
                i3 = Integer.MAX_VALUE;
            }
            if (z || i5 != 2) {
                i4 = i6;
            } else {
                i4 = 1;
            }
            if (j8 != i3) {
                o9 o9Var = td7.j;
                if (o9Var != null) {
                    i3 = z65.p(l55.f(o9Var.e()), j8, i3);
                } else {
                    h.s("layoutIntrinsics must be called first");
                    return null;
                }
            }
            o9 o9Var2 = td7.j;
            if (o9Var2 != null) {
                pn4 pn43 = new pn4(o9Var2, x91.x(0, i3, 0, k31.g(j3)), i4, td7.f);
                long d3 = m31.d(j3, (((long) l55.f(pn43.d)) << 32) | (((long) l55.f(pn43.e)) & 4294967295L));
                vl vlVar6 = td7.a;
                long j9 = d3;
                ey3 ey34 = ey3;
                vl vlVar7 = vlVar6;
                long j10 = j9;
                bg73 = new bg7(new ag7(vlVar7, td7.b, td7.i, td7.c, td7.e, td7.f, td7.g, ey34, td7.h, j3), pn43, j10);
                long j72 = bg73.c;
                Integer valueOf3 = Integer.valueOf((int) (j72 >> 32));
                Integer valueOf22 = Integer.valueOf((int) (j72 & 4294967295L));
                int intValue3 = valueOf3.intValue();
                int intValue22 = valueOf22.intValue();
                bg74 = bg72;
                if (sg3.e(bg74, bg73)) {
                }
                if (p71.j != 1) {
                }
                u44.g.setValue(new lx1(p71.h.P(i2)));
                return oh4.d0(intValue3, intValue22, sf4.V(new yb5(nb.a, Integer.valueOf(Math.round(bg73.d))), new yb5(nb.b, Integer.valueOf(Math.round(bg73.e)))), new vd2(20));
            }
            h.s("layoutIntrinsics must be called first");
            return null;
        } finally {
            j45.m(h2, j4, vr2);
        }
    }
}
