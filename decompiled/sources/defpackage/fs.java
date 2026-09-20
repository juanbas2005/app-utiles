package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: fs  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fs implements Set {
    public final /* synthetic */ js w;

    public fs(js jsVar) {
        this.w = jsVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.w.clear();
    }

    public final boolean contains(Object obj) {
        return this.w.containsKey(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.w.k(collection);
    }

    public final boolean equals(Object obj) {
        js jsVar = this.w;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (jsVar.y != set.size() || !jsVar.k(set)) {
                return false;
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final int hashCode() {
        int i;
        js jsVar = this.w;
        int i2 = 0;
        for (int i3 = jsVar.y - 1; i3 >= 0; i3--) {
            Object g = jsVar.g(i3);
            if (g == null) {
                i = 0;
            } else {
                i = g.hashCode();
            }
            i2 += i;
        }
        return i2;
    }

    public final boolean isEmpty() {
        return this.w.isEmpty();
    }

    public final Iterator iterator() {
        return new es(this.w, 0);
    }

    public final boolean remove(Object obj) {
        js jsVar = this.w;
        int e = jsVar.e(obj);
        if (e < 0) {
            return false;
        }
        jsVar.h(e);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        return this.w.l(collection);
    }

    public final boolean retainAll(Collection collection) {
        js jsVar = this.w;
        int i = jsVar.y;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(jsVar.g(i2))) {
                jsVar.h(i2);
            }
        }
        if (i != jsVar.y) {
            return true;
        }
        return false;
    }

    public final int size() {
        return this.w.y;
    }

    public final Object[] toArray(Object[] objArr) {
        js jsVar = this.w;
        int i = jsVar.y;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = jsVar.g(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public final Object[] toArray() {
        js jsVar = this.w;
        int i = jsVar.y;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = jsVar.g(i2);
        }
        return objArr;
    }
}
