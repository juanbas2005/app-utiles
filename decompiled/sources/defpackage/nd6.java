package defpackage;

import java.util.HashMap;

/* renamed from: nd6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class nd6 {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap(9);
        a = hashMap;
        hashMap.put("xx-small", new pb6(7, 0.694f));
        hashMap.put("x-small", new pb6(7, 0.833f));
        hashMap.put("small", new pb6(7, 10.0f));
        hashMap.put("medium", new pb6(7, 12.0f));
        hashMap.put("large", new pb6(7, 14.4f));
        hashMap.put("x-large", new pb6(7, 17.3f));
        hashMap.put("xx-large", new pb6(7, 20.7f));
        hashMap.put("smaller", new pb6(9, 83.33f));
        hashMap.put("larger", new pb6(9, 120.0f));
    }
}
