package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: h67  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h67 implements List, cr3 {
    public final yx6 w;
    public final int x;
    public int y;
    public int z;

    public h67(yx6 yx6, int i, int i2) {
        this.w = yx6;
        this.x = i;
        this.y = rj1.x(yx6);
        this.z = i2 - i;
    }

    public final boolean add(Object obj) {
        f();
        int i = this.x + this.z;
        yx6 yx6 = this.w;
        yx6.add(i, obj);
        this.z++;
        this.y = rj1.x(yx6);
        return true;
    }

    public final boolean addAll(int i, Collection collection) {
        f();
        int i2 = i + this.x;
        yx6 yx6 = this.w;
        boolean addAll = yx6.addAll(i2, collection);
        if (addAll) {
            this.z = collection.size() + this.z;
            this.y = rj1.x(yx6);
        }
        return addAll;
    }

    public final void clear() {
        int i;
        o2 o2Var;
        ix6 j;
        boolean m;
        if (this.z > 0) {
            f();
            yx6 yx6 = this.w;
            int i2 = this.x;
            int i3 = this.z + i2;
            do {
                synchronized (rj1.D) {
                    k37 k37 = yx6.w;
                    k37.getClass();
                    k37 k372 = (k37) nx6.h(k37);
                    i = k372.d;
                    o2Var = k372.c;
                }
                o2Var.getClass();
                hg5 n = o2Var.n();
                n.subList(i2, i3).clear();
                o2 k = n.k();
                if (sg3.e(k, o2Var)) {
                    break;
                }
                k37 k373 = yx6.w;
                k373.getClass();
                synchronized (nx6.c) {
                    j = nx6.j();
                    m = rj1.m((k37) nx6.w(k373, yx6, j), i, k, true);
                }
                nx6.n(j, yx6);
            } while (!m);
            this.z = 0;
            this.y = rj1.x(this.w);
        }
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        Iterable<Object> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        if (rj1.x(this.w) != this.y) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object get(int i) {
        f();
        rj1.l(i, this.z);
        return this.w.get(this.x + i);
    }

    public final int indexOf(Object obj) {
        f();
        int i = this.z;
        int i2 = this.x;
        Iterator it = z65.V(i2, i + i2).iterator();
        while (((qe3) it).y) {
            int nextInt = ((je3) it).nextInt();
            if (sg3.e(obj, this.w.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (this.z == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        f();
        int i = this.z;
        int i2 = this.x;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (sg3.e(obj, this.w.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, f06] */
    public final ListIterator listIterator(int i) {
        f();
        ? obj = new Object();
        obj.w = i - 1;
        return new n76((f06) obj, this);
    }

    public final Object remove(int i) {
        f();
        int i2 = this.x + i;
        yx6 yx6 = this.w;
        Object remove = yx6.remove(i2);
        this.z--;
        this.y = rj1.x(yx6);
        return remove;
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    return z2;
                }
                if (remove(it.next()) || z2) {
                    z2 = true;
                }
            }
        }
    }

    public final boolean retainAll(Collection collection) {
        int i;
        o2 o2Var;
        ix6 j;
        boolean m;
        f();
        yx6 yx6 = this.w;
        int i2 = this.x;
        int i3 = this.z + i2;
        int size = yx6.size();
        do {
            synchronized (rj1.D) {
                k37 k37 = yx6.w;
                k37.getClass();
                k37 k372 = (k37) nx6.h(k37);
                i = k372.d;
                o2Var = k372.c;
            }
            o2Var.getClass();
            hg5 n = o2Var.n();
            n.subList(i2, i3).retainAll(collection);
            o2 k = n.k();
            if (sg3.e(k, o2Var)) {
                break;
            }
            k37 k373 = yx6.w;
            k373.getClass();
            synchronized (nx6.c) {
                j = nx6.j();
                m = rj1.m((k37) nx6.w(k373, yx6, j), i, k, true);
            }
            nx6.n(j, yx6);
        } while (!m);
        int size2 = size - yx6.size();
        if (size2 > 0) {
            this.y = rj1.x(this.w);
            this.z -= size2;
        }
        if (size2 > 0) {
            return true;
        }
        return false;
    }

    public final Object set(int i, Object obj) {
        rj1.l(i, this.z);
        f();
        int i2 = i + this.x;
        yx6 yx6 = this.w;
        Object obj2 = yx6.set(i2, obj);
        this.y = rj1.x(yx6);
        return obj2;
    }

    public final int size() {
        return this.z;
    }

    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.z) {
            vm5.a("fromIndex or toIndex are out of bounds");
        }
        f();
        int i3 = this.x;
        return new h67(this.w, i + i3, i2 + i3);
    }

    public final Object[] toArray() {
        return rc9.W0(this);
    }

    public final Object[] toArray(Object[] objArr) {
        return rc9.X0(this, objArr);
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final void add(int i, Object obj) {
        f();
        int i2 = this.x + i;
        yx6 yx6 = this.w;
        yx6.add(i2, obj);
        this.z++;
        this.y = rj1.x(yx6);
    }

    public final boolean addAll(Collection collection) {
        return addAll(this.z, collection);
    }
}
