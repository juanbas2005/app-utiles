package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: de9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class de9 extends cj8 {
    public final Map b;

    public de9(b85 b85, b85 b852) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, b85);
        d(linkedHashMap, b852);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((id9) entry.getKey()).c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, b85 b85) {
        for (int i = 0; i < b85.w(); i++) {
            id9 y = b85.y(i);
            Object obj = linkedHashMap.get(y);
            boolean z = y.c;
            Class cls = y.b;
            if (z) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    linkedHashMap.put(y, list);
                }
                list.add(cls.cast(b85.z(i)));
            } else {
                linkedHashMap.put(y, cls.cast(b85.z(i)));
            }
        }
    }

    public final void a(zd9 zd9, ud9 ud9) {
        for (Map.Entry entry : this.b.entrySet()) {
            id9 id9 = (id9) entry.getKey();
            Object value = entry.getValue();
            if (id9.c) {
                zd9.b(id9, ((List) value).iterator(), ud9);
            } else {
                zd9.a(id9, value, ud9);
            }
        }
    }

    public final int b() {
        return this.b.size();
    }

    public final Set c() {
        return this.b.keySet();
    }
}
