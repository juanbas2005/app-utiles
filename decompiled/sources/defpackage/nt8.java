package defpackage;

import java.io.Serializable;
import java.util.Map;

/* renamed from: nt8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class nt8 implements Map, Serializable {
    public static final Map.Entry[] x = new Map.Entry[0];
    public transient rt8 w;

    /* renamed from: a */
    public final rt8 entrySet() {
        rt8 rt8 = this.w;
        if (rt8 == null) {
            ut8 ut8 = (ut8) this;
            if (ut8.isEmpty()) {
                rt8 = ou8.I;
            } else {
                rt8 = new tt8(ut8);
            }
            this.w = rt8;
        }
        return rt8;
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        return ((ut8) this).z.contains(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((ut8) this).entrySet().equals(((Map) obj).entrySet());
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public final int hashCode() {
        return t75.M(entrySet());
    }

    public final boolean isEmpty() {
        if (((ut8) this).size() == 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        ut8 ut8 = (ut8) this;
        int size = ut8.size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
            sb.append('{');
            boolean z = true;
            for (Map.Entry entry : ut8.entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z = false;
            }
            sb.append('}');
            return sb.toString();
        }
        h.q(hl6.k(size, "size cannot be negative but was: "));
        return null;
    }
}
