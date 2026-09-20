package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: jf4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jf4 extends LinkedHashMap {
    public static final jf4 x;
    public boolean w = true;

    static {
        jf4 jf4 = new jf4();
        x = jf4;
        jf4.w = false;
    }

    public final void a() {
        if (!this.w) {
            ku4.p();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.LinkedHashMap, jf4] */
    public final jf4 b() {
        if (isEmpty()) {
            return new jf4();
        }
        ? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.w = true;
        return linkedHashMap;
    }

    public final void clear() {
        a();
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
        int i;
        int i2 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int i3 = 1;
            if (key instanceof byte[]) {
                Charset charset = tf3.a;
                i = r4;
                for (byte b : (byte[]) key) {
                    i = (i * 31) + b;
                }
                if (i == 0) {
                    i = 1;
                }
            } else {
                i = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Charset charset2 = tf3.a;
                int i4 = r3;
                for (byte b2 : (byte[]) value) {
                    i4 = (i4 * 31) + b2;
                }
                if (i4 != 0) {
                    i3 = i4;
                }
            } else {
                i3 = value.hashCode();
            }
            i2 += i ^ i3;
        }
        return i2;
    }

    public final Object put(Object obj, Object obj2) {
        a();
        Charset charset = tf3.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        a();
        for (Object next : map.keySet()) {
            Charset charset = tf3.a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        a();
        return super.remove(obj);
    }
}
