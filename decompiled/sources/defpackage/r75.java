package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: r75  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r75 implements e05 {
    public final String a;
    public final az0 b;
    public final ArrayList c;

    public r75(String str, az0 az0) {
        this.a = str;
        this.b = az0;
        n74 m = sg3.m();
        ie1.p(m, az0);
        n74 i = sg3.i(m);
        ArrayList arrayList = new ArrayList(et0.e0(i, 10));
        ListIterator listIterator = i.listIterator(0);
        while (true) {
            d03 d03 = (d03) listIterator;
            if (!d03.hasNext()) {
                break;
            }
            arrayList.add(((mc2) d03.next()).c());
        }
        List<g1> b1 = dt0.b1(dt0.f1(arrayList));
        ArrayList arrayList2 = new ArrayList(et0.e0(b1, 10));
        for (g1 g1Var : b1) {
            g1Var.getClass();
            Object b2 = g1Var.b();
            if (b2 != null) {
                arrayList2.add(new p75(g1Var.a(), b2));
            } else {
                ku4.w(g1Var.c(), "' does not define a default value", "The field '");
                throw null;
            }
        }
        this.c = arrayList2;
    }

    /* JADX WARNING: type inference failed for: r14v5, types: [bz0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v6, types: [bz0, java.lang.Object] */
    public final bz0 a() {
        bn5 bn5;
        bn5 d11;
        bz0 a2 = this.b.a();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p75 p75 = (p75) it.next();
            arrayList2.add(new vu0(p75.b, new o0(1, p75.a, zq5.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0, 0, 28)));
        }
        boolean isEmpty = arrayList2.isEmpty();
        bn5 bn52 = io7.a;
        if (isEmpty) {
            bn5 = bn52;
        } else {
            if (arrayList2.size() == 1) {
                d11 = (bn5) dt0.Q0(arrayList2);
            } else {
                d11 = new d11(arrayList2);
            }
            bn5 = d11;
        }
        if (bn5 instanceof io7) {
            return new Object();
        }
        sg3.E(new yb5(new je7(1, bn5, bn5.class, "test", "test(Ljava/lang/Object;)Z", 0, 0, 1), new Object()), new yb5(new q75(1, bn52, io7.class, "test", "test(Ljava/lang/Object;)Z", 0, 0, 0), a2));
        return new Object();
    }

    public final qd5 b() {
        List list;
        qd5 b2 = this.b.b();
        qd5 b3 = new c21(this.a).b();
        boolean isEmpty = this.c.isEmpty();
        a42 a42 = a42.w;
        if (isEmpty) {
            list = a42;
        } else {
            list = sg3.D(new ms7(new h43(25, this)));
        }
        return new qd5(a42, sg3.E(b2, t35.l(sg3.E(b3, new qd5(list, a42)))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r75)) {
            return false;
        }
        r75 r75 = (r75) obj;
        if (!this.a.equals(r75.a) || !this.b.equals(r75.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Optional(" + this.a + ", " + this.b + ')';
    }
}
