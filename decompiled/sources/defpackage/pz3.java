package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: pz3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pz3 implements Map {
    public final n36 w;

    public pz3(n36 n36) {
        this.w = n36;
    }

    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public final boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.w.containsKey(((Class) obj).getName());
        }
        h.q("Key must be a class");
        return false;
    }

    public final boolean containsValue(Object obj) {
        return this.w.containsValue(obj);
    }

    public final Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    public final Object get(Object obj) {
        if (obj instanceof Class) {
            return this.w.get(((Class) obj).getName());
        }
        h.q("Key must be a class");
        return null;
    }

    public final boolean isEmpty() {
        return this.w.isEmpty();
    }

    public final Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    public final Object put(Object obj, Object obj2) {
        Class cls = (Class) obj;
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public final int size() {
        return this.w.z;
    }

    public final Collection values() {
        n36 n36 = this.w;
        m36 m36 = (m36) n36.C;
        if (m36 != null) {
            return m36;
        }
        m36 m362 = new m36(n36.y, 1, n36.z);
        n36.C = m362;
        return m362;
    }
}
