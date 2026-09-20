package defpackage;

import java.util.HashMap;

/* renamed from: od6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class od6 {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap(13);
        a = hashMap;
        hashMap.put("normal", 400);
        hashMap.put("bold", 700);
        pb4.r(1, hashMap, "bolder", -1, "lighter");
        pb4.r(100, hashMap, "100", 200, "200");
        hashMap.put("300", 300);
        hashMap.put("400", 400);
        pb4.r(500, hashMap, "500", 600, "600");
        hashMap.put("700", 700);
        hashMap.put("800", 800);
        hashMap.put("900", 900);
    }
}
