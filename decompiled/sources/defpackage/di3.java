package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: di3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class di3 {
    public static final Map a = sf4.V(new yb5("PACKAGE", EnumSet.noneOf(uw3.class)), new yb5("TYPE", EnumSet.of(uw3.y, uw3.K)), new yb5("ANNOTATION_TYPE", EnumSet.of(uw3.z)), new yb5("TYPE_PARAMETER", EnumSet.of(uw3.A)), new yb5("FIELD", EnumSet.of(uw3.C)), new yb5("LOCAL_VARIABLE", EnumSet.of(uw3.D)), new yb5("PARAMETER", EnumSet.of(uw3.E)), new yb5("CONSTRUCTOR", EnumSet.of(uw3.F)), new yb5("METHOD", EnumSet.of(uw3.G, uw3.H, uw3.I)), new yb5("TYPE_USE", EnumSet.of(uw3.J)));
    public static final Map b = sf4.V(new yb5("RUNTIME", tw3.w), new yb5("CLASS", tw3.x), new yb5("SOURCE", tw3.y));

    public static ps a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof d16) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) a.get(uq4.e(((d16) it.next()).b.name()).b());
            if (iterable == null) {
                iterable = g42.w;
            }
            it0.h0(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(et0.e0(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            up2 up2 = m27.u;
            up2.getClass();
            arrayList3.add(new b62(new gq0(up2.b(), up2.a.g()), uq4.e(((uw3) it2.next()).name())));
        }
        return new ps(arrayList3, v61.Z);
    }
}
