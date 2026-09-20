package defpackage;

import java.util.ArrayList;

/* renamed from: w65  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w65 extends vg2 {
    public static final w65 d = new vg2(0, 1, 1);

    public final void d(tt2 tt2, kr krVar, jv6 jv6, u36 u36, f75 f75) {
        af5 af5;
        yx5 yx5 = (yx5) tt2.f(0);
        tp4 tp4 = u36.i;
        if (tp4 != null) {
            af5 = (af5) tp4.g(yx5);
        } else {
            af5 = null;
        }
        if (af5 != null) {
            ArrayList arrayList = u36.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                u36.j = arrayList;
            }
            arrayList.add(u36.e);
            u36.e = af5.x;
        }
    }
}
