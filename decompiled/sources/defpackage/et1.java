package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: et1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class et1 extends qt1 {
    public final ax3 g;
    public final ib4 h;
    public final ib4 i;
    public final /* synthetic */ gt1 j;

    /* JADX WARNING: type inference failed for: r1v1, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r9v3, types: [ib4, hb4] */
    /* JADX WARNING: Illegal instructions before constructor call */
    public et1(gt1 gt1, ax3 ax3) {
        super(r1, r2, r3, r4, new bt1(0, r5));
        ax3.getClass();
        this.j = gt1;
        z00 z00 = gt1.H;
        tr5 tr5 = gt1.A;
        List list = tr5.M;
        list.getClass();
        List list2 = tr5.N;
        list2.getClass();
        List list3 = tr5.O;
        list3.getClass();
        List<Number> list4 = tr5.G;
        list4.getClass();
        vq4 vq4 = (vq4) gt1.H.b;
        ArrayList arrayList = new ArrayList(et0.e0(list4, 10));
        for (Number intValue : list4) {
            arrayList.add(t49.P(vq4, intValue.intValue()));
        }
        ws1 ws1 = (ws1) z00.a;
        this.g = ax3;
        kb4 kb4 = ws1.a;
        ct1 ct1 = new ct1(this, 0);
        kb4.getClass();
        this.h = new hb4(kb4, ct1);
        kb4 kb42 = ws1.a;
        ct1 ct12 = new ct1(this, 1);
        kb42.getClass();
        this.i = new hb4(kb42, ct12);
    }

    public final Collection a(is1 is1, vr2 vr2) {
        is1.getClass();
        return (Collection) this.h.b();
    }

    public final Collection b(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        s(uq4, oz4);
        return super.b(uq4, oz4);
    }

    public final vq0 e(uq4 uq4, oz4 oz4) {
        ql4 ql4;
        uq4.getClass();
        oz4.getClass();
        s(uq4, oz4);
        am6 am6 = this.j.L;
        if (am6 == null || (ql4 = (ql4) ((m70) am6.y).y(uq4)) == null) {
            return super.e(uq4, oz4);
        }
        return ql4;
    }

    public final Collection f(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        s(uq4, oz4);
        return super.f(uq4, oz4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: a42} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void h(ArrayList arrayList, vr2 vr2) {
        a42 a42;
        am6 am6 = this.j.L;
        if (am6 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (uq4 uq4 : ((LinkedHashMap) am6.x).keySet()) {
                uq4.getClass();
                ql4 ql4 = (ql4) ((m70) am6.y).y(uq4);
                if (ql4 != null) {
                    arrayList2.add(ql4);
                }
            }
            a42 = arrayList2;
        } else {
            a42 = null;
        }
        if (a42 == null) {
            a42 = a42.w;
        }
        arrayList.addAll(a42);
    }

    public final void j(uq4 uq4, ArrayList arrayList) {
        uq4.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (vw3 R : (Collection) this.i.b()) {
            arrayList2.addAll(R.R().b(uq4, oz4.y));
        }
        z00 z00 = this.b;
        arrayList.addAll(((ws1) z00.a).n.k(uq4, this.j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        uq4 uq42 = uq4;
        ((lz4) ((ws1) z00.a).q).d.h(uq42, arrayList2, arrayList3, this.j, new dt1(arrayList, 0));
    }

    public final void k(uq4 uq4, ArrayList arrayList) {
        uq4.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (vw3 R : (Collection) this.i.b()) {
            arrayList2.addAll(R.R().f(uq4, oz4.y));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        uq4 uq42 = uq4;
        ((lz4) ((ws1) this.b.a).q).d.h(uq42, arrayList2, arrayList3, this.j, new dt1(arrayList, 0));
    }

    public final gq0 l(uq4 uq4) {
        uq4.getClass();
        return this.j.D.d(uq4);
    }

    public final Set n() {
        List<vw3> d = this.j.J.e();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (vw3 R : d) {
            Iterable d2 = R.R().d();
            if (d2 == null) {
                return null;
            }
            it0.h0(linkedHashSet, d2);
        }
        return linkedHashSet;
    }

    public final Set o() {
        gt1 gt1 = this.j;
        List<vw3> d = gt1.J.e();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (vw3 R : d) {
            it0.h0(linkedHashSet, R.R().c());
        }
        linkedHashSet.addAll(((ws1) this.b.a).n.g(gt1));
        return linkedHashSet;
    }

    public final Set p() {
        List<vw3> d = this.j.J.e();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (vw3 R : d) {
            it0.h0(linkedHashSet, R.R().g());
        }
        return linkedHashSet;
    }

    public final boolean r(tt1 tt1) {
        return ((ws1) this.b.a).o.h(this.j, tt1);
    }

    public final void s(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        oz4.getClass();
        ((ws1) this.b.a).i.getClass();
        this.j.getClass();
    }
}
