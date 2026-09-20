package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: wf5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class wf5 implements Map, ar3 {
    public static final wf5 y = new wf5(rn7.e, 0);
    public final rn7 w;
    public final int x;

    public wf5(rn7 rn7, int i) {
        this.w = rn7;
        this.x = i;
    }

    public yf5 a() {
        return new yf5(this);
    }

    public /* bridge */ yf5 b() {
        return a();
    }

    public final Set c() {
        return new dg5(this, 0);
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return this.w.d(i, 0, obj);
    }

    public boolean containsValue(Object obj) {
        Set<Map.Entry> c = c();
        if (c.isEmpty()) {
            return false;
        }
        for (Map.Entry value : c) {
            if (sg3.e(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final int e() {
        return this.x;
    }

    public final /* bridge */ Set entrySet() {
        return c();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (e() != map.size()) {
            return false;
        }
        Iterable<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && ((Collection) entrySet).isEmpty()) {
            return true;
        }
        for (Map.Entry entry : entrySet) {
            if (entry == null) {
                return false;
            }
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = get(key);
            if (!sg3.e(value, obj2)) {
                return false;
            }
            if (obj2 == null && !containsKey(key)) {
                return false;
            }
        }
        return true;
    }

    public final wf5 f(Object obj, k74 k74) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        qa u = this.w.u(obj, i, k74, 0);
        if (u == null) {
            return this;
        }
        return new wf5((rn7) u.y, this.x + u.x);
    }

    public Object get(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return this.w.g(i, 0, obj);
    }

    public int hashCode() {
        return c().hashCode();
    }

    public final boolean isEmpty() {
        if (e() == 0) {
            return true;
        }
        return false;
    }

    public final Set keySet() {
        return new dg5(this, 1);
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return e();
    }

    public final String toString() {
        return dt0.E0(c(), ", ", "{", "}", new gg0(3, (Object) this), 24);
    }

    public final Collection values() {
        return new wf4(1, this);
    }
}
