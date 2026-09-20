package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: yz7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class yz7 {
    static {
        sg3.E(vz7.a, wz7.a, rz7.a, xz7.a, uz7.a, tz7.a, sz7.a);
    }

    public abstract Map a();

    public abstract String b();

    public abstract az7 c();

    public final LinkedHashMap d(String str) {
        String str2;
        String str3;
        str.getClass();
        Map a = a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(tf4.F(a.size()));
        for (Map.Entry entry : a.entrySet()) {
            Object key = entry.getKey();
            xf4 a2 = k26.a((k26) entry.getValue(), str);
            if (a2 == null || (str3 = (String) dt0.z0(1, a2.a())) == null || (str2 = d57.k1(str3).toString()) == null) {
                str2 = "";
            }
            linkedHashMap.put(key, str2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((String) entry2.getValue()).length() > 0) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2;
    }
}
