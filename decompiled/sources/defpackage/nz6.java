package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: nz6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class nz6 {
    public static final LinkedHashSet a;
    public static final gq0 b;

    static {
        List<up2> E = sg3.E(nn3.a, nn3.h, nn3.i, nn3.c, nn3.d, nn3.f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (up2 up2 : E) {
            up2.getClass();
            linkedHashSet.add(new gq0(up2.b(), up2.a.g()));
        }
        a = linkedHashSet;
        up2 up22 = nn3.g;
        up22.getClass();
        b = new gq0(up22.b(), up22.a.g());
    }
}
