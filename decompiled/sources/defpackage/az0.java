package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: az0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class az0 implements nm2 {
    public final List a;

    public az0(List list) {
        list.getClass();
        this.a = list;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [bz0, java.lang.Object] */
    public bz0 a() {
        List<e05> list = this.a;
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        for (e05 a2 : list) {
            arrayList.add(a2.a());
        }
        if (arrayList.size() == 1) {
            return (bz0) dt0.Q0(arrayList);
        }
        return new Object();
    }

    public qd5 b() {
        List<e05> list = this.a;
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        for (e05 b : list) {
            arrayList.add(b.b());
        }
        return t35.l(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof az0)) {
            return false;
        }
        if (sg3.e(this.a, ((az0) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl6.o(new StringBuilder("ConcatenatedFormatStructure("), dt0.E0(this.a, ", ", (String) null, (String) null, (vr2) null, 62), ')');
    }
}
