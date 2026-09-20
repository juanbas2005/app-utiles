package defpackage;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: r2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class r2 extends AbstractList implements pf3 {
    public boolean w;

    public r2(boolean z) {
        this.w = z;
    }

    public boolean add(Object obj) {
        d();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        d();
        return super.addAll(collection);
    }

    public void clear() {
        d();
        super.clear();
    }

    public final void d() {
        if (!this.w) {
            ku4.p();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public abstract Object remove(int i);

    public final boolean remove(Object obj) {
        d();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        d();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        d();
        return super.retainAll(collection);
    }

    public boolean addAll(int i, Collection collection) {
        d();
        return super.addAll(i, collection);
    }
}
