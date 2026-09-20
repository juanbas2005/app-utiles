package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: rs2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rs2 extends k0 {
    public final /* synthetic */ ss2 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rs2(ss2 ss2) {
        super(ss2.A);
        this.y = ss2;
    }

    public final Collection a() {
        List<gq0> list;
        ss2 ss2 = this.y;
        int i = ss2.D;
        ht2 ht2 = ss2.C;
        dt2 dt2 = dt2.d;
        if (sg3.e(ht2, dt2)) {
            list = sg3.D(ss2.H);
        } else if (sg3.e(ht2, et2.d)) {
            list = sg3.E(ss2.I, new gq0(n27.k, dt2.a(i)));
        } else {
            gt2 gt2 = gt2.d;
            if (sg3.e(ht2, gt2)) {
                list = sg3.D(ss2.H);
            } else if (sg3.e(ht2, ft2.d)) {
                list = sg3.E(ss2.I, new gq0(n27.f, gt2.a(i)));
            } else {
                int i2 = s9.a;
                h.s("should not be called");
                return null;
            }
        }
        sl4 f1 = ((y95) ss2.B).r();
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        for (gq0 gq0 : list) {
            ql4 y2 = r16.y(f1, gq0);
            if (y2 != null) {
                List<qp7> W0 = dt0.W0(y2.n().getParameters().size(), ss2.G);
                ArrayList arrayList2 = new ArrayList(et0.e0(W0, 10));
                for (qp7 g0 : W0) {
                    arrayList2.add(new p27((vw3) g0.g0()));
                }
                ro7.x.getClass();
                arrayList.add(kl8.H(ro7.y, y2, arrayList2));
            } else {
                ku4.i(gq0, " not found", "Built-in class ");
                return null;
            }
        }
        return dt0.b1(arrayList);
    }

    public final pe2 c() {
        return pe2.O;
    }

    public final List getParameters() {
        return this.y.G;
    }

    public final ql4 j() {
        return this.y;
    }

    public final String toString() {
        return this.y.toString();
    }

    public final vq0 u() {
        return this.y;
    }

    public final boolean y() {
        return true;
    }
}
