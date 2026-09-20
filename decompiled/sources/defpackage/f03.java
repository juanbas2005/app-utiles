package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: f03  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f03 implements List, ar3 {
    public final lp4 w = new lp4(16);
    public final cp4 x = new cp4(16);
    public int y = -1;

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        this.y = -1;
        this.w.d();
        this.x.b = 0;
    }

    public final boolean contains(Object obj) {
        if ((obj instanceof ll4) && indexOf((ll4) obj) != -1) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((ll4) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        return r0;
     */
    public final long f() {
        long q = mp7.q(Float.POSITIVE_INFINITY, false, false);
        int i = this.y + 1;
        int i2 = this.w.b - 1;
        if (i > i2) {
            return q;
        }
        while (true) {
            cp4 cp4 = this.x;
            if (i >= 0) {
                if (i >= cp4.b) {
                    break;
                }
                long j = cp4.a[i];
                if (hj8.p(j, q) < 0) {
                    q = j;
                }
                if ((hj8.v(q) >= 0.0f || !hj8.C(q)) && i != i2) {
                    i++;
                }
            } else {
                cp4.getClass();
                break;
            }
        }
        h.l("Index must be between 0 and size");
        return 0;
    }

    public final void g(int i, int i2) {
        if (i < i2) {
            this.w.l(i, i2);
            cp4 cp4 = this.x;
            if (i >= 0) {
                int i3 = cp4.b;
                if (i <= i3 && i2 >= 0 && i2 <= i3) {
                    if (i2 < i) {
                        h.q("The end index must be < start index");
                        return;
                    } else if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = cp4.a;
                            qs.L0(jArr, jArr, i, i2, i3);
                        }
                        cp4.b -= i2 - i;
                        return;
                    } else {
                        return;
                    }
                }
            } else {
                cp4.getClass();
            }
            h.l("Index must be between 0 and size");
        }
    }

    public final Object get(int i) {
        Object f = this.w.f(i);
        f.getClass();
        return (ll4) f;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof ll4)) {
            return -1;
        }
        ll4 ll4 = (ll4) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!sg3.e(this.w.f(i), ll4)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.w.h();
    }

    public final Iterator iterator() {
        return new d03(this, 0, 7);
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof ll4)) {
            return -1;
        }
        ll4 ll4 = (ll4) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (sg3.e(this.w.f(size), ll4)) {
                return size;
            }
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return new d03(this, 0, 7);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.w.b;
    }

    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List subList(int i, int i2) {
        return new e03(this, i, i2);
    }

    public final Object[] toArray() {
        return rc9.W0(this);
    }

    public final Object[] toArray(Object[] objArr) {
        return rc9.X0(this, objArr);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final ListIterator listIterator(int i) {
        return new d03(this, i, 6);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
