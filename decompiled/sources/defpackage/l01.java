package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l01  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l01 extends we {
    public static l01 G;
    public static final Map H;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(461L, "FIREPERF_AUTOPUSH");
        hashMap.put(462L, "FIREPERF");
        hashMap.put(675L, "FIREPERF_INTERNAL_LOW");
        hashMap.put(676L, "FIREPERF_INTERNAL_HIGH");
        H = Collections.unmodifiableMap(hashMap);
    }

    public final String r() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
