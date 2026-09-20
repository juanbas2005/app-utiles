package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: mt8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class mt8 extends nk8 implements List, RandomAccess {
    public static final vs8 A = new vs8(nu8.D, 0);

    public static nu8 x(int i, Object[] objArr) {
        if (i == 0) {
            return nu8.D;
        }
        return new nu8(i, objArr);
    }

    public static nu8 y(Object[] objArr) {
        if (objArr.length == 0) {
            return nu8.D;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        int i = 0;
        while (i < length) {
            if (objArr2[i] != null) {
                i++;
            } else {
                ku4.j(hl6.k(i, "at index "));
                return null;
            }
        }
        return x(length, objArr2);
    }

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

    public int d(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
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
                        if (u55.A(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                vs8 z = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (z.hasNext()) {
                        if (it.hasNext()) {
                            if (!u55.A(z.next(), it.next())) {
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

    public final at7 n() {
        return listIterator(0);
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public mt8 v() {
        if (size() <= 1) {
            return this;
        }
        return new jt8(this);
    }

    /* renamed from: w */
    public mt8 subList(int i, int i2) {
        g75.b0(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return nu8.D;
        }
        return new kt8(this, i, i3);
    }

    /* renamed from: z */
    public final vs8 listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            h.l(g75.d0(i, size, "index"));
            return null;
        } else if (isEmpty()) {
            return A;
        } else {
            return new vs8(this, i);
        }
    }
}
