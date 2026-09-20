package defpackage;

import java.util.ArrayList;

/* renamed from: g65  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g65 extends vg2 {
    public static final g65 d = new vg2(0, 1, 1);

    public final void d(tt2 tt2, kr krVar, jv6 jv6, u36 u36, f75 f75) {
        eq4 eq4;
        yx5 yx5 = (yx5) tt2.f(0);
        tp4 tp4 = u36.i;
        if (tp4 != null && ((af5) tp4.g(yx5)) != null) {
            ArrayList arrayList = u36.j;
            if (!(arrayList == null || (eq4 = (eq4) arrayList.remove(arrayList.size() - 1)) == null)) {
                u36.e = eq4;
            }
            tp4.k(yx5);
        }
    }
}
