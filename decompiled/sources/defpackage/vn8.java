package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: vn8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vn8 extends nk8 implements List, RandomAccess {
    public static final ql8 A = new ql8(lp8.D, 0);

    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (Objects.equals(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                ql8 x = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (x.hasNext()) {
                        if (it.hasNext()) {
                            if (!Objects.equals(x.next(), it.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public int s(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public vn8 v() {
        if (size() <= 1) {
            return this;
        }
        return new jm8(this);
    }

    /* renamed from: w */
    public vn8 subList(int i, int i2) {
        t35.G(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return lp8.D;
        }
        return new an8(this, i, i3);
    }

    /* renamed from: x */
    public final ql8 listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            h.l(t35.H(i, size, "index"));
            return null;
        } else if (isEmpty()) {
            return A;
        } else {
            return new ql8(this, i);
        }
    }
}
