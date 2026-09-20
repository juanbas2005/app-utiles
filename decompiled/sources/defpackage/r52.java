package defpackage;

import java.util.LinkedHashMap;

/* renamed from: r52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r52 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;

    public r52(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                this.b = new LinkedHashMap();
                return;
            default:
                this.a = new LinkedHashMap();
                this.b = new LinkedHashMap();
                return;
        }
    }

    public void a(gq3 gq3, vr2 vr2, vr2 vr22, fw0 fw0) {
        LinkedHashMap linkedHashMap = this.a;
        if (!linkedHashMap.containsKey(gq3)) {
            linkedHashMap.put(gq3, new q52(gq3, vr2, vr22, fw0));
        } else {
            rf2.f(46, gq3.A(), "An `entry` with the same `clazz` has already been added: ");
        }
    }
}
