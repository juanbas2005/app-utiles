package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: tb  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tb implements e05 {
    public final az0 a;
    public final ArrayList b;

    public tb(az0 az0, ArrayList arrayList) {
        this.a = az0;
        this.b = arrayList;
    }

    public final bz0 a() {
        return this.a.a();
    }

    public final qd5 b() {
        n74 m = sg3.m();
        m.add(this.a.b());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            m.add(((nm2) it.next()).b());
        }
        return new qd5(a42.w, sg3.i(m));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tb)) {
            return false;
        }
        tb tbVar = (tb) obj;
        if (!this.a.equals(tbVar.a) || !this.b.equals(tbVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlternativesParsing(" + this.b + ')';
    }
}
