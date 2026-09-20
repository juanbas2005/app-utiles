package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: h2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class h2 extends w0 implements List {
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        if (size() != collection.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        for (Object e : this) {
            if (!sg3.e(e, it.next())) {
            }
        }
        return true;
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1;
        for (Object next : this) {
            int i3 = i2 * 31;
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object e : this) {
            if (sg3.e(e, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator iterator() {
        return new e2(0, this);
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (sg3.e(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new f2(this, 0);
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i, int i2) {
        return new g2(this, i, i2);
    }

    public ListIterator listIterator(int i) {
        return new f2(this, i);
    }
}
