package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: hm8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hm8 extends LinkedHashMap {
    public static final hm8 x;
    public boolean w = true;

    static {
        hm8 hm8 = new hm8();
        x = hm8;
        hm8.w = false;
    }

    public static int b(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            int a = xl8.a(length, 0, length, bArr);
            if (a == 0) {
                return 1;
            }
            return a;
        } else if (!(obj instanceof pl8)) {
            return obj.hashCode();
        } else {
            ku4.p();
            return 0;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.LinkedHashMap, hm8] */
    public final hm8 a() {
        if (isEmpty()) {
            return new hm8();
        }
        ? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.w = true;
        return linkedHashMap;
    }

    public final void c() {
        if (!this.w) {
            ku4.p();
        }
    }

    public final void clear() {
        c();
        super.clear();
    }

    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        c();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        c();
        for (Object next : map.keySet()) {
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        c();
        return super.remove(obj);
    }
}
