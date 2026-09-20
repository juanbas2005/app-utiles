package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: os  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class os implements Collection, Set, br3, lr3 {
    public int[] w = ie1.z;
    public Object[] x = ie1.B;
    public int y;

    public os(int i) {
        if (i > 0) {
            this.w = new int[i];
            this.x = new Object[i];
        }
    }

    public final boolean add(Object obj) {
        int i;
        int i2;
        int i3 = this.y;
        if (obj == null) {
            i2 = we.x(this, (Object) null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            i2 = we.x(this, obj, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i4 = ~i2;
        int[] iArr = this.w;
        if (i3 >= iArr.length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.x;
            int[] iArr2 = new int[i5];
            this.w = iArr2;
            this.x = new Object[i5];
            if (i3 != this.y) {
                throw new ConcurrentModificationException();
            } else if (iArr2.length != 0) {
                qs.M0(0, iArr.length, 6, iArr, iArr2);
                qs.N0(0, objArr.length, 6, objArr, this.x);
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.w;
            int i6 = i4 + 1;
            qs.J0(i6, i4, i3, iArr3, iArr3);
            Object[] objArr2 = this.x;
            qs.K0(i6, i4, i3, objArr2, objArr2);
        }
        int i7 = this.y;
        if (i3 == i7) {
            int[] iArr4 = this.w;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                this.x[i4] = obj;
                this.y = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.y;
        int i = this.y;
        int[] iArr = this.w;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.x;
            int[] iArr2 = new int[size];
            this.w = iArr2;
            this.x = new Object[size];
            if (i > 0) {
                qs.M0(0, i, 6, iArr, iArr2);
                qs.N0(0, this.y, 6, objArr, this.x);
            }
        }
        if (this.y == i) {
            for (Object add : collection) {
                z |= add(add);
            }
            return z;
        }
        throw new ConcurrentModificationException();
    }

    public final void clear() {
        if (this.y != 0) {
            this.w = ie1.z;
            this.x = ie1.B;
            this.y = 0;
        }
        if (this.y != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean contains(Object obj) {
        int i;
        if (obj == null) {
            i = we.x(this, (Object) null, 0);
        } else {
            i = we.x(this, obj, obj.hashCode());
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        collection.getClass();
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.y != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.y;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.x[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Object f(int i) {
        int i2 = this.y;
        Object[] objArr = this.x;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.w;
        int i4 = 8;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i5 = i + 1;
                qs.J0(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.x;
                qs.K0(i, i5, i2, objArr2, objArr2);
            }
            this.x[i3] = null;
        } else {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            int[] iArr2 = new int[i4];
            this.w = iArr2;
            this.x = new Object[i4];
            if (i > 0) {
                qs.M0(0, i, 6, iArr, iArr2);
                qs.N0(0, i, 6, objArr, this.x);
            }
            if (i < i3) {
                int i6 = i + 1;
                qs.J0(i, i6, i2, iArr, this.w);
                qs.K0(i, i6, i2, objArr, this.x);
            }
        }
        if (i2 == this.y) {
            this.y = i3;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final int hashCode() {
        int[] iArr = this.w;
        int i = this.y;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final boolean isEmpty() {
        if (this.y <= 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new es(this);
    }

    public final boolean remove(Object obj) {
        int i;
        if (obj == null) {
            i = we.x(this, (Object) null, 0);
        } else {
            i = we.x(this, obj, obj.hashCode());
        }
        if (i < 0) {
            return false;
        }
        f(i);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.y - 1; -1 < i; i--) {
            if (!dt0.q0(collection, this.x[i])) {
                f(i);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.y;
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.y;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        qs.K0(0, 0, this.y, this.x, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.y * 14);
        sb.append('{');
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.x[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object[] toArray() {
        return qs.Q0(this.x, 0, this.y);
    }
}
