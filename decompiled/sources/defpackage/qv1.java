package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: qv1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qv1 extends nd2 {
    public final nd2 x;

    public qv1(nd2 nd2) {
        nd2.getClass();
        this.x = nd2;
    }

    public final List B(ae5 ae5) {
        List<ae5> B = this.x.B(ae5);
        ArrayList arrayList = new ArrayList();
        for (ae5 ae52 : B) {
            ae52.getClass();
            arrayList.add(ae52);
        }
        ht0.f0(arrayList);
        return arrayList;
    }

    public final dq1 E(ae5 ae5) {
        ae5.getClass();
        dq1 E = this.x.E(ae5);
        if (E == null) {
            return null;
        }
        ae5 ae52 = (ae5) E.d;
        if (ae52 == null) {
            return E;
        }
        Map map = (Map) E.i;
        map.getClass();
        return new dq1(E.b, E.c, ae52, (Long) E.e, (Long) E.f, (Long) E.g, (Long) E.h, map);
    }

    public final go3 G(ae5 ae5) {
        return this.x.G(ae5);
    }

    public final tu6 I(ae5 ae5) {
        ae5 b = ae5.b();
        if (b != null) {
            as asVar = new as();
            while (b != null && !v(b)) {
                asVar.addFirst(b);
                b = b.b();
            }
            Iterator it = asVar.iterator();
            while (it.hasNext()) {
                l((ae5) it.next());
            }
        }
        return this.x.I(ae5);
    }

    public final oy6 L(ae5 ae5) {
        ae5.getClass();
        return this.x.L(ae5);
    }

    public final tu6 a(ae5 ae5) {
        ae5.getClass();
        return this.x.a(ae5);
    }

    public final void close() {
        this.x.close();
    }

    public final void k(ae5 ae5, ae5 ae52) {
        ae5.getClass();
        ae52.getClass();
        this.x.k(ae5, ae52);
    }

    public final void l(ae5 ae5) {
        ae5.getClass();
        this.x.l(ae5);
    }

    public final void o(ae5 ae5) {
        ae5.getClass();
        this.x.o(ae5);
    }

    public final String toString() {
        return b26.a.b(qv1.class).A() + '(' + this.x + ')';
    }
}
