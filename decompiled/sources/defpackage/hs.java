package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: hs  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hs implements Collection {
    public final /* synthetic */ js w;

    public hs(js jsVar) {
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
        if (this.w.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.w.isEmpty();
    }

    public final Iterator iterator() {
        return new es(this.w, 1);
    }

    public final boolean remove(Object obj) {
        js jsVar = this.w;
        int a = jsVar.a(obj);
        if (a < 0) {
            return false;
        }
        jsVar.h(a);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        js jsVar = this.w;
        int i = jsVar.y;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(jsVar.j(i2))) {
                jsVar.h(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        js jsVar = this.w;
        int i = jsVar.y;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(jsVar.j(i2))) {
                jsVar.h(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
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
            objArr[i2] = jsVar.j(i2);
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
            objArr[i2] = jsVar.j(i2);
        }
        return objArr;
    }
}
