package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o14  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o14 extends p14 {
    public static final /* synthetic */ int p = 0;
    public final x06 n;
    public final w04 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o14(am6 am6, x06 x06, w04 w04) {
        super(am6, (a14) null);
        x06.getClass();
        this.n = x06;
        this.o = w04;
    }

    public static cr5 v(cr5 cr5) {
        if (cr5.u() != 2) {
            return cr5;
        }
        Collection s = cr5.s();
        s.getClass();
        Iterable<cr5> iterable = s;
        ArrayList arrayList = new ArrayList(et0.e0(iterable, 10));
        for (cr5 cr52 : iterable) {
            cr52.getClass();
            arrayList.add(v(cr52));
        }
        return (cr5) dt0.Q0(dt0.b1(dt0.f1(arrayList)));
    }

    public final vq0 e(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        oz4.getClass();
        return null;
    }

    public final Set h(is1 is1, vr2 vr2) {
        is1.getClass();
        return g42.w;
    }

    public final Set i(is1 is1, jo3 jo3) {
        Collection collection;
        is1.getClass();
        Set f1 = dt0.f1(((ck1) this.e.b()).a());
        w04 w04 = this.o;
        o14 l = wn6.l(w04);
        if (l != null) {
            collection = l.c();
        } else {
            collection = null;
        }
        if (collection == null) {
            collection = g42.w;
        }
        f1.addAll(collection);
        if (this.n.a.isEnum()) {
            f1.addAll(sg3.E(n27.c, n27.a));
        }
        am6 am6 = this.b;
        ((xb4) ((pj3) am6.x).x).getClass();
        w04.getClass();
        am6.getClass();
        f1.addAll(new ArrayList());
        return f1;
    }

    public final void j(uq4 uq4, ArrayList arrayList) {
        uq4.getClass();
        am6 am6 = this.b;
        ((xb4) ((pj3) am6.x).x).getClass();
        this.o.getClass();
        uq4.getClass();
        am6.getClass();
    }

    public final ck1 k() {
        return new zp0(this.n, jo3.L);
    }

    public final void m(LinkedHashSet linkedHashSet, uq4 uq4) {
        Collection collection;
        uq4.getClass();
        w04 w04 = this.o;
        o14 l = wn6.l(w04);
        if (l == null) {
            collection = g42.w;
        } else {
            collection = dt0.g1(l.b(uq4, oz4.A));
        }
        pj3 pj3 = (pj3) this.b.x;
        r62 r62 = pj3.f;
        h95 h95 = ((lz4) pj3.u).d;
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        uq4 uq42 = uq4;
        linkedHashSet2.addAll(rj1.G(r62, this.o, uq42, h95, linkedHashSet2, collection));
        if (!this.n.a.isEnum()) {
            return;
        }
        if (uq42.equals(n27.c)) {
            linkedHashSet2.add(fd1.z(w04));
        } else if (uq42.equals(n27.a)) {
            linkedHashSet2.add(fd1.A(w04));
        }
    }

    public final void n(uq4 uq4, ArrayList arrayList) {
        ArrayList arrayList2;
        uq4 uq42;
        er5 y;
        uq4.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b0 b0Var = new b0(22, uq4);
        w04 w04 = this.o;
        dh4.j(sg3.D(w04), kw5.F, new n14(w04, linkedHashSet, b0Var));
        boolean isEmpty = arrayList.isEmpty();
        am6 am6 = this.b;
        if (!isEmpty) {
            pj3 pj3 = (pj3) am6.x;
            uq42 = uq4;
            arrayList2 = arrayList;
            arrayList2.addAll(rj1.G(pj3.f, this.o, uq42, ((lz4) pj3.u).d, arrayList2, linkedHashSet));
        } else {
            uq42 = uq4;
            arrayList2 = arrayList;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : linkedHashSet) {
                cr5 v = v((cr5) next);
                Object obj = linkedHashMap.get(v);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(v, obj);
                }
                ((List) obj).add(next);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry value : linkedHashMap.entrySet()) {
                pj3 pj32 = (pj3) am6.x;
                r62 r62 = pj32.f;
                h95 h95 = ((lz4) pj32.u).d;
                it0.h0(arrayList3, rj1.G(r62, this.o, uq42, h95, arrayList2, (Collection) value.getValue()));
            }
            arrayList2.addAll(arrayList3);
        }
        if (this.n.a.isEnum() && uq42.equals(n27.b) && (y = fd1.y(w04)) != null) {
            arrayList2.add(y);
        }
    }

    public final Set o(is1 is1) {
        is1.getClass();
        Set f1 = dt0.f1(((ck1) this.e.b()).f());
        jo3 jo3 = jo3.M;
        w04 w04 = this.o;
        dh4.j(sg3.D(w04), kw5.F, new n14(w04, f1, jo3));
        if (this.n.a.isEnum()) {
            f1.add(n27.b);
        }
        return f1;
    }

    public final vj1 q() {
        return this.o;
    }
}
