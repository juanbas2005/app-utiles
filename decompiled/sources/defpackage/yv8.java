package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* renamed from: yv8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yv8 extends f76 {
    public static final Set b;
    public static final wv8 c;

    static {
        Set<du8> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new du8[]{yt8.a, iu8.a, ku8.a})));
        b = unmodifiableSet;
        qc3 qc3 = new qc3(5);
        for (du8 du8 : unmodifiableSet) {
            HashMap hashMap = (HashMap) qc3.y;
            HashMap hashMap2 = (HashMap) qc3.x;
            if (du8 != null) {
                boolean z = du8.c;
                if (z) {
                    n63 n63 = qc3.F;
                    if (z) {
                        hashMap2.remove(du8);
                        hashMap.put(du8, n63);
                    } else {
                        h.q("key must be repeating");
                        return;
                    }
                } else {
                    tz2 tz2 = qc3.E;
                    hashMap.remove(du8);
                    hashMap2.put(du8, tz2);
                }
            } else {
                ku4.j("key".concat(" must not be null"));
                return;
            }
        }
        or2 or2 = new or2(qc3);
        c = new wv8(Level.ALL, b, or2);
    }
}
