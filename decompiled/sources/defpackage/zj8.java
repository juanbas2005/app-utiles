package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum zj8 {
    ;
    
    public static final Map x = null;
    public final char w;

    static {
        int i;
        HashMap hashMap = new HashMap();
        zj8[] values = values();
        int length = values.length;
        while (i < length) {
            zj8 zj8 = values[i];
            if (hashMap.put(Character.valueOf(zj8.w), zj8) == null) {
                i++;
            } else {
                h.s("duplicate format character: ".concat(String.valueOf(zj8)));
                return;
            }
        }
        x = Collections.unmodifiableMap(hashMap);
    }

    /* access modifiers changed from: public */
    zj8(char c) {
        this.w = c;
    }
}
