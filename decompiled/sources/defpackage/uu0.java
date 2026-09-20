package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: uu0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class uu0 {
    public static final LinkedHashSet a;

    static {
        Iterable<ro5> iterable = ro5.A;
        uq4 uq4 = n27.a;
        ArrayList arrayList = new ArrayList(et0.e0(iterable, 10));
        for (ro5 ro5 : iterable) {
            ro5.getClass();
            arrayList.add(n27.k.a(ro5.w));
        }
        ArrayList N0 = dt0.N0(dt0.N0(dt0.N0(arrayList, m27.f.i()), m27.h.i()), m27.j.i());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = N0.iterator();
        while (it.hasNext()) {
            up2 up2 = (up2) it.next();
            up2.getClass();
            linkedHashSet.add(new gq0(up2.b(), up2.a.g()));
        }
        a = linkedHashSet;
    }
}
