package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: m74  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m74 extends l2 implements RandomAccess, Serializable {
    public final n74 A;
    public Object[] w;
    public final int x;
    public int y;
    public final m74 z;

    public m74(Object[] objArr, int i, int i2, m74 m74, n74 n74) {
        objArr.getClass();
        n74.getClass();
        this.w = objArr;
        this.x = i;
        this.y = i2;
        this.z = m74;
        this.A = n74;
        this.modCount = n74.modCount;
    }

    public final void add(int i, Object obj) {
        p();
        o();
        int i2 = this.y;
        if (i < 0 || i > i2) {
            h.l(b81.l(i, i2, "index: ", ", size: "));
        } else {
            n(this.x + i, obj);
        }
    }

    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        p();
        o();
        int i2 = this.y;
        if (i < 0 || i > i2) {
            h.l(b81.l(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        l(this.x + i, collection, size);
        if (size > 0) {
            return true;
        }
        return false;
    }

    public final void clear() {
        p();
        o();
        v(this.x, this.y);
    }

    public final boolean equals(Object obj) {
        o();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.w;
            int i = this.y;
            if (i == list.size()) {
                int i2 = 0;
                while (i2 < i) {
                    if (sg3.e(objArr[this.x + i2], list.get(i2))) {
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int f() {
        o();
        return this.y;
    }

    public final Object g(int i) {
        p();
        o();
        int i2 = this.y;
        if (i >= 0 && i < i2) {
            return s(this.x + i);
        }
        h.l(b81.l(i, i2, "index: ", ", size: "));
        return null;
    }

    public final Object get(int i) {
        o();
        int i2 = this.y;
        if (i >= 0 && i < i2) {
            return this.w[this.x + i];
        }
        h.l(b81.l(i, i2, "index: ", ", size: "));
        return null;
    }

    public final int hashCode() {
        int i;
        o();
        Object[] objArr = this.w;
        int i2 = this.y;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[this.x + i4];
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
        o();
        for (int i = 0; i < this.y; i++) {
            if (sg3.e(this.w[this.x + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        o();
        if (this.y == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void l(int i, Collection collection, int i2) {
        this.modCount++;
        n74 n74 = this.A;
        m74 m74 = this.z;
        if (m74 != null) {
            m74.l(i, collection, i2);
        } else {
            n74 n742 = n74.z;
            n74.l(i, collection, i2);
        }
        this.w = n74.w;
        this.y += i2;
    }

    public final int lastIndexOf(Object obj) {
        o();
        for (int i = this.y - 1; i >= 0; i--) {
            if (sg3.e(this.w[this.x + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final ListIterator listIterator(int i) {
        o();
        int i2 = this.y;
        if (i >= 0 && i <= i2) {
            return new d03(this, i);
        }
        h.l(b81.l(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void n(int i, Object obj) {
        this.modCount++;
        n74 n74 = this.A;
        m74 m74 = this.z;
        if (m74 != null) {
            m74.n(i, obj);
        } else {
            n74 n742 = n74.z;
            n74.n(i, obj);
        }
        this.w = n74.w;
        this.y++;
    }

    public final void o() {
        if (this.A.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void p() {
        if (this.A.y) {
            ku4.p();
        }
    }

    public final boolean remove(Object obj) {
        p();
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
        p();
        o();
        if (w(this.x, this.y, collection, false) > 0) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        p();
        o();
        if (w(this.x, this.y, collection, true) > 0) {
            return true;
        }
        return false;
    }

    public final Object s(int i) {
        Object obj;
        this.modCount++;
        m74 m74 = this.z;
        if (m74 != null) {
            obj = m74.s(i);
        } else {
            n74 n74 = n74.z;
            obj = this.A.s(i);
        }
        this.y--;
        return obj;
    }

    public final Object set(int i, Object obj) {
        p();
        o();
        int i2 = this.y;
        if (i < 0 || i >= i2) {
            h.l(b81.l(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.w;
        int i3 = this.x;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    public final List subList(int i, int i2) {
        ie1.A(i, i2, this.y);
        return new m74(this.w, this.x + i, i2 - i, this, this.A);
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        o();
        int length = objArr.length;
        int i = this.y;
        Object[] objArr2 = this.w;
        int i2 = this.x;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        qs.K0(0, i2, i + i2, objArr2, objArr);
        int i3 = this.y;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public final String toString() {
        o();
        return we.e(this.w, this.x, this.y, this);
    }

    public final void v(int i, int i2) {
        if (i2 > 0) {
            this.modCount++;
        }
        m74 m74 = this.z;
        if (m74 != null) {
            m74.v(i, i2);
        } else {
            n74 n74 = n74.z;
            this.A.v(i, i2);
        }
        this.y -= i2;
    }

    public final int w(int i, int i2, Collection collection, boolean z2) {
        int i3;
        m74 m74 = this.z;
        if (m74 != null) {
            i3 = m74.w(i, i2, collection, z2);
        } else {
            n74 n74 = n74.z;
            i3 = this.A.w(i, i2, collection, z2);
        }
        if (i3 > 0) {
            this.modCount++;
        }
        this.y -= i3;
        return i3;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final boolean add(Object obj) {
        p();
        o();
        n(this.x + this.y, obj);
        return true;
    }

    public final Object[] toArray() {
        o();
        Object[] objArr = this.w;
        int i = this.y;
        int i2 = this.x;
        return qs.Q0(objArr, i2, i + i2);
    }

    public final boolean addAll(Collection collection) {
        collection.getClass();
        p();
        o();
        int size = collection.size();
        l(this.x + this.y, collection, size);
        return size > 0;
    }
}
