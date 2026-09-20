package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: ce1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ce1 {
    public static final ce1 b;
    public final HashMap a;

    static {
        ce1 ce1 = new ce1(new LinkedHashMap());
        r16.g0(ce1);
        b = ce1;
    }

    public ce1(ce1 ce1) {
        ce1.getClass();
        this.a = new HashMap(ce1.a);
    }

    public final boolean a(String str) {
        Object obj = this.a.get(str);
        if (obj == null) {
            return false;
        }
        if (String.class.isAssignableFrom(obj.getClass())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj != null && ce1.class.equals(obj.getClass())) {
                HashMap hashMap = ((ce1) obj).a;
                HashMap hashMap2 = this.a;
                Set<String> keySet = hashMap2.keySet();
                if (sg3.e(keySet, hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (obj2 != null && obj3 != null) {
                            if (obj2 instanceof Object[]) {
                                Object[] objArr = (Object[]) obj2;
                                if (obj3 instanceof Object[]) {
                                    z = qs.H0(objArr, (Object[]) obj3);
                                    continue;
                                }
                            }
                            z = obj2.equals(obj3);
                            continue;
                        } else if (obj2 == obj3) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Object[]) {
                i = Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value);
            } else {
                i = entry.hashCode();
            }
            i2 += i;
        }
        return i2 * 31;
    }

    public final String toString() {
        return f21.l(new StringBuilder("Data {"), dt0.E0(this.a.entrySet(), (String) null, (String) null, (String) null, new f81(1), 31), "}");
    }

    public ce1(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.a = new HashMap(linkedHashMap);
    }
}
