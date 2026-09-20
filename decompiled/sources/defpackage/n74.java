package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: n74  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n74 extends l2 implements RandomAccess, Serializable {
    public static final n74 z;
    public Object[] w;
    public int x;
    public boolean y;

    static {
        n74 n74 = new n74(0);
        n74.y = true;
        z = n74;
    }

    public n74(int i) {
        if (i >= 0) {
            this.w = new Object[i];
        } else {
            h.q("capacity must be non-negative.");
            throw null;
        }
    }

    public final void add(int i, Object obj) {
        o();
        int i2 = this.x;
        if (i < 0 || i > i2) {
            h.l(b81.l(i, i2, "index: ", ", size: "));
            return;
        }
        this.modCount++;
        p(i, 1);
        this.w[i] = obj;
    }

    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        o();
        int i2 = this.x;
        if (i < 0 || i > i2) {
            h.l(b81.l(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        l(i, collection, size);
        if (size > 0) {
            return true;
        }
        return false;
    }

    public final void clear() {
        o();
        v(0, this.x);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.w;
            int i = this.x;
            if (i == list.size()) {
                int i2 = 0;
                while (i2 < i) {
                    if (sg3.e(objArr[i2], list.get(i2))) {
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.x;
    }

    public final Object g(int i) {
        o();
        int i2 = this.x;
        if (i >= 0 && i < i2) {
            return s(i);
        }
        h.l(b81.l(i, i2, "index: ", ", size: "));
        return null;
    }

    public final Object get(int i) {
        int i2 = this.x;
        if (i >= 0 && i < i2) {
            return this.w[i];
        }
        h.l(b81.l(i, i2, "index: ", ", size: "));
        return null;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.w;
        int i2 = this.x;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            int i5 = i3 * 31;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 = i5 + i;
        }
        return i3;
    }

    public final int indexOf(Object obj) {
        for (int i = 0; i < this.x; i++) {
            if (sg3.e(this.w[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (this.x == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void l(int i, Collection collection, int i2) {
        this.modCount++;
        p(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.w[i + i3] = it.next();
        }
    }

    public final int lastIndexOf(Object obj) {
        for (int i = this.x - 1; i >= 0; i--) {
            if (sg3.e(this.w[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final ListIterator listIterator(int i) {
        int i2 = this.x;
        if (i >= 0 && i <= i2) {
            return new d03(this, i);
        }
        h.l(b81.l(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void n(int i, Object obj) {
        this.modCount++;
        p(i, 1);
        this.w[i] = obj;
    }

    public final void o() {
        if (this.y) {
            ku4.p();
        }
    }

    public final void p(int i, int i2) {
        int i3 = this.x + i2;
        if (i3 >= 0) {
            Object[] objArr = this.w;
            if (i3 > objArr.length) {
                int length = objArr.length;
                int i4 = length + (length >> 1);
                if (i4 - i3 < 0) {
                    i4 = i3;
                }
                if (i4 - 2147483639 > 0) {
                    if (i3 > 2147483639) {
                        i4 = Integer.MAX_VALUE;
                    } else {
                        i4 = 2147483639;
                    }
                }
                this.w = Arrays.copyOf(objArr, i4);
            }
            Object[] objArr2 = this.w;
            qs.K0(i + i2, i, this.x, objArr2, objArr2);
            this.x += i2;
            return;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        o();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            g(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    public final boolean removeAll(Collection collection) {
        collection.getClass();
        o();
        if (w(0, this.x, collection, false) > 0) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        o();
        if (w(0, this.x, collection, true) > 0) {
            return true;
        }
        return false;
    }

    public final Object s(int i) {
        this.modCount++;
        Object[] objArr = this.w;
        Object obj = objArr[i];
        qs.K0(i, i + 1, this.x, objArr, objArr);
        Object[] objArr2 = this.w;
        objArr2.getClass();
        objArr2[this.x - 1] = null;
        this.x--;
        return obj;
    }

    public final Object set(int i, Object obj) {
        o();
        int i2 = this.x;
        if (i < 0 || i >= i2) {
            h.l(b81.l(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.w;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final List subList(int i, int i2) {
        ie1.A(i, i2, this.x);
        return new m74(this.w, i, i2 - i, (m74) null, this);
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.x;
        Object[] objArr2 = this.w;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        qs.K0(0, 0, i, objArr2, objArr);
        int i2 = this.x;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    public final String toString() {
        return we.e(this.w, 0, this.x, this);
    }

    public final void v(int i, int i2) {
        if (i2 > 0) {
            this.modCount++;
        }
        Object[] objArr = this.w;
        qs.K0(i, i + i2, this.x, objArr, objArr);
        Object[] objArr2 = this.w;
        int i3 = this.x;
        we.L(objArr2, i3 - i2, i3);
        this.x -= i2;
    }

    public final int w(int i, int i2, Collection collection, boolean z2) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.w;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z2) {
                Object[] objArr2 = this.w;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        qs.K0(i + i4, i2 + i, this.x, objArr, objArr);
        Object[] objArr3 = this.w;
        int i7 = this.x;
        we.L(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            this.modCount++;
        }
        this.x -= i6;
        return i6;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final boolean add(Object obj) {
        o();
        int i = this.x;
        this.modCount++;
        p(i, 1);
        this.w[i] = obj;
        return true;
    }

    public final Object[] toArray() {
        return qs.Q0(this.w, 0, this.x);
    }

    public final boolean addAll(Collection collection) {
        collection.getClass();
        o();
        int size = collection.size();
        l(this.x, collection, size);
        return size > 0;
    }
}
