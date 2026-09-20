package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: q93  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class q93 extends j93 implements List, RandomAccess {
    public static final m93 x = new m93(i36.A, 0);

    public static i36 p(int i, Object[] objArr) {
        if (i == 0) {
            return i36.A;
        }
        return new i36(i, objArr);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [i93, l93] */
    public static q93 s(Iterable iterable) {
        if (iterable instanceof Collection) {
            return v((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return i36.A;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Object[] objArr = {next};
            p25.d(1, objArr);
            return p(1, objArr);
        }
        ? i93 = new i93(4);
        i93.a(next);
        while (it.hasNext()) {
            i93.a(it.next());
        }
        return i93.e();
    }

    public static q93 v(Collection collection) {
        if (collection instanceof j93) {
            q93 d = ((j93) collection).d();
            if (!d.n()) {
                return d;
            }
            Object[] array = d.toArray(j93.w);
            return p(array.length, array);
        }
        Object[] array2 = collection.toArray();
        p25.d(array2.length, array2);
        return p(array2.length, array2);
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

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        int i = 0;
                        while (i < size) {
                            if (a35.h(get(i), list.get(i))) {
                                i++;
                            }
                        }
                    } else {
                        Iterator it = list.iterator();
                        for (Object h : this) {
                            if (it.hasNext()) {
                                if (!a35.h(h, it.next())) {
                                }
                            }
                        }
                        return !it.hasNext();
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int f(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
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

    public Iterator iterator() {
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

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final at7 o() {
        return listIterator(0);
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: w */
    public final m93 listIterator(int i) {
        g75.m(i, size());
        if (isEmpty()) {
            return x;
        }
        return new m93(this, i);
    }

    public q93 x() {
        if (size() <= 1) {
            return this;
        }
        return new n93(this);
    }

    /* renamed from: y */
    public q93 subList(int i, int i2) {
        g75.n(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return i36.A;
        }
        return new o93(this, i, i3);
    }

    public final q93 d() {
        return this;
    }
}
