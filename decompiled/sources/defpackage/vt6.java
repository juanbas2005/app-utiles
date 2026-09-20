package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;

/* renamed from: vt6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vt6 implements e05 {
    public final k60 a;
    public final Set b;

    public vt6(k60 k60) {
        this.a = k60;
        n74 m = sg3.m();
        ie1.p(m, k60);
        n74 i = sg3.i(m);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = i.listIterator(0);
        while (true) {
            d03 d03 = (d03) listIterator;
            if (!d03.hasNext()) {
                break;
            }
            q35 d = ((mc2) d03.next()).c().d();
            if (d != null) {
                arrayList.add(d);
            }
        }
        Set g1 = dt0.g1(arrayList);
        this.b = g1;
        if (g1.isEmpty()) {
            h.q("Signed format must contain at least one field with a sign");
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [bz0, java.lang.Object] */
    public final bz0 a() {
        this.a.a.a();
        return new Object();
    }

    public final qd5 b() {
        ph6 ph6 = new ph6(4, this);
        return t35.l(sg3.E(new qd5(sg3.D(new mt6(ph6, "sign for " + this.b)), a42.w), this.a.a.b()));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vt6)) {
            return false;
        }
        if (this.a.equals(((vt6) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignedFormatStructure(" + this.a + ')';
    }
}
