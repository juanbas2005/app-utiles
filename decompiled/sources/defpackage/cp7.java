package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: cp7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cp7 {
    public final LinkedHashMap a;

    public cp7(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final cp7 a() {
        LinkedHashMap linkedHashMap = this.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tf4.F(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            zj3 zj3 = (zj3) entry.getValue();
            linkedHashMap2.put(key, new zj3(zj3.a, zj3.b, zj3.c, true, true));
        }
        return new cp7(linkedHashMap2);
    }
}
