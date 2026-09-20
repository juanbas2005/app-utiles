package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: qt1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class qt1 extends ki4 {
    public static final /* synthetic */ yr3[] f;
    public final z00 b;
    public final pt1 c;
    public final ib4 d;
    public final hb4 e;

    static {
        Class<qt1> cls = qt1.class;
        f = new yr3[]{new gr5(cls, "classNames", "getClassNames$org_jetbrains_kotlin_deserialization()Ljava/util/Set;", 0), new gr5(cls, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0)};
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [ib4, hb4] */
    public qt1(z00 z00, List list, List list2, List list3, sr2 sr2) {
        z00.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.b = z00;
        ws1 ws1 = (ws1) z00.a;
        ws1.c.getClass();
        this.c = new pt1(this, list, list2, list3);
        kb4 kb4 = ws1.a;
        mt1 mt1 = new mt1(0, sr2);
        kb4.getClass();
        this.d = new hb4(kb4, mt1);
        k3 k3Var = new k3(17, this);
        kb4.getClass();
        this.e = new hb4(kb4, k3Var);
    }

    public Collection b(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        pt1 pt1 = this.c;
        pt1.getClass();
        if (!((Set) p25.q(pt1.g, pt1.j[0])).contains(uq4)) {
            return a42.w;
        }
        return (Collection) pt1.d.y(uq4);
    }

    public final Set c() {
        return (Set) p25.q(this.c.g, pt1.j[0]);
    }

    public final Set d() {
        yr3 yr3 = f[1];
        hb4 hb4 = this.e;
        hb4.getClass();
        yr3.getClass();
        return (Set) hb4.b();
    }

    public vq0 e(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        oz4.getClass();
        if (q(uq4)) {
            gq0 l = l(uq4);
            eq0 eq0 = ((ws1) this.b.a).t;
            Set set = eq0.c;
            return eq0.a(l, (xp0) null);
        }
        pt1 pt1 = this.c;
        if (!pt1.c.keySet().contains(uq4)) {
            return null;
        }
        pt1.getClass();
        return (ut1) pt1.f.y(uq4);
    }

    public Collection f(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        pt1 pt1 = this.c;
        pt1.getClass();
        if (!((Set) p25.q(pt1.h, pt1.j[1])).contains(uq4)) {
            return a42.w;
        }
        return (Collection) pt1.e.y(uq4);
    }

    public final Set g() {
        return (Set) p25.q(this.c.h, pt1.j[1]);
    }

    public abstract void h(ArrayList arrayList, vr2 vr2);

    public final List i(is1 is1, vr2 vr2) {
        Collection collection;
        Collection collection2;
        is1.getClass();
        ArrayList arrayList = new ArrayList(0);
        if (is1.a(is1.f)) {
            h(arrayList, vr2);
        }
        pt1 pt1 = this.c;
        pt1.getClass();
        ib4 ib4 = pt1.g;
        ib4 ib42 = pt1.h;
        a91 a91 = a91.A;
        boolean a = is1.a(is1.j);
        a42 a42 = a42.w;
        if (a) {
            ArrayList arrayList2 = new ArrayList();
            for (uq4 uq4 : (Set) p25.q(ib42, pt1.j[1])) {
                if (((Boolean) vr2.y(uq4)).booleanValue()) {
                    uq4.getClass();
                    if (!((Set) p25.q(ib42, pt1.j[1])).contains(uq4)) {
                        collection2 = a42;
                    } else {
                        collection2 = (Collection) pt1.e.y(uq4);
                    }
                    arrayList2.addAll(collection2);
                }
            }
            ht0.g0(arrayList2, a91);
            arrayList.addAll(arrayList2);
        }
        if (is1.a(is1.i)) {
            ArrayList arrayList3 = new ArrayList();
            for (uq4 uq42 : (Set) p25.q(ib4, pt1.j[0])) {
                if (((Boolean) vr2.y(uq42)).booleanValue()) {
                    uq42.getClass();
                    if (!((Set) p25.q(ib4, pt1.j[0])).contains(uq42)) {
                        collection = a42;
                    } else {
                        collection = (Collection) pt1.d.y(uq42);
                    }
                    arrayList3.addAll(collection);
                }
            }
            ht0.g0(arrayList3, a91);
            arrayList.addAll(arrayList3);
        }
        if (is1.a(is1.l)) {
            for (uq4 uq43 : m()) {
                if (((Boolean) vr2.y(uq43)).booleanValue()) {
                    gq0 l = l(uq43);
                    eq0 eq0 = ((ws1) this.b.a).t;
                    Set set = eq0.c;
                    ql4 a2 = eq0.a(l, (xp0) null);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
        }
        if (is1.a(is1.g)) {
            for (uq4 uq44 : pt1.c.keySet()) {
                if (((Boolean) vr2.y(uq44)).booleanValue()) {
                    pt1.getClass();
                    uq44.getClass();
                    ut1 ut1 = (ut1) pt1.f.y(uq44);
                    if (ut1 != null) {
                        arrayList.add(ut1);
                    }
                }
            }
        }
        return rd3.j(arrayList);
    }

    public void j(uq4 uq4, ArrayList arrayList) {
        uq4.getClass();
    }

    public void k(uq4 uq4, ArrayList arrayList) {
        uq4.getClass();
    }

    public abstract gq0 l(uq4 uq4);

    public final Set m() {
        return (Set) p25.q(this.d, f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(uq4 uq4) {
        uq4.getClass();
        return m().contains(uq4);
    }

    public boolean r(tt1 tt1) {
        return true;
    }
}
