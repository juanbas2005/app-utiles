package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: if4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class if4 extends LinkedHashMap {
    public static final if4 x;
    public boolean w = true;

    static {
        if4 if4 = new if4();
        x = if4;
        if4.w = false;
    }

    public static int a(Object obj) {
        if (obj instanceof byte[]) {
            Charset charset = rf3.a;
            int i = r0;
            for (byte b : (byte[]) obj) {
                i = (i * 31) + b;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof jr)) {
            return obj.hashCode();
        } else {
            ku4.p();
            return 0;
        }
    }

    public final void b() {
        if (!this.w) {
            ku4.p();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.LinkedHashMap, if4] */
    public final if4 c() {
        if (isEmpty()) {
            return new if4();
        }
        ? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.w = true;
        return linkedHashMap;
    }

    public final void clear() {
        b();
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
            i += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        b();
        Charset charset = rf3.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        b();
        for (Object next : map.keySet()) {
            Charset charset = rf3.a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        b();
        return super.remove(obj);
    }
}
