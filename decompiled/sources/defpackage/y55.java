package defpackage;

import java.util.List;

/* renamed from: y55  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y55 extends vg2 {
    public static final y55 d = new vg2(0, 2, 1);

    public final void d(tt2 tt2, kr krVar, jv6 jv6, u36 u36, f75 f75) {
        int i = ((te3) tt2.f(0)).a;
        List list = (List) tt2.f(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            krVar.b(i3, obj);
            krVar.k(i3, obj);
        }
    }
}
