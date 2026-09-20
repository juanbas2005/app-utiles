package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: pf4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pf4 implements Map, ar3 {
    public final tp4 w;
    public p52 x;
    public p52 y;
    public r67 z;

    public pf4(tp4 tp4) {
        tp4.getClass();
        this.w = tp4;
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return this.w.c(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.w.d(obj);
    }

    public final Set entrySet() {
        p52 p52 = this.x;
        if (p52 != null) {
            return p52;
        }
        p52 p522 = new p52(this.w, 0);
        this.x = p522;
        return p522;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pf4.class != obj.getClass()) {
            return false;
        }
        return sg3.e(this.w, ((pf4) obj).w);
    }

    public final Object get(Object obj) {
        return this.w.g(obj);
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final boolean isEmpty() {
        return this.w.i();
    }

    public final Set keySet() {
        p52 p52 = this.y;
        if (p52 != null) {
            return p52;
        }
        p52 p522 = new p52(this.w, 1);
        this.y = p522;
        return p522;
    }

    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.w.e;
    }

    public final String toString() {
        return this.w.toString();
    }

    public final Collection values() {
        r67 r67 = this.z;
        if (r67 != null) {
            return r67;
        }
        r67 r672 = new r67(this.w);
        this.z = r672;
        return r672;
    }

    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
