package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: s58  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s58 {
    public final hr2 a = new hr2(11);
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();
    public volatile boolean d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                hl6.s(autoCloseable);
            } catch (Exception e) {
                rf2.o(e);
            }
        }
    }
}
