package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: du5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class du5 extends AbstractList implements RandomAccess, qf3 {
    public static final du5 z = new du5(new Object[0], 0, false);
    public boolean w;
    public Object[] x;
    public int y;

    public du5(Object[] objArr, int i, boolean z2) {
        this.w = z2;
        this.x = objArr;
        this.y = i;
    }

    public final void add(int i, Object obj) {
        int i2;
        f();
        if (i < 0 || i > (i2 = this.y)) {
            ku4.d(this.y, pb4.o(i, "Index:", ", Size:"));
            return;
        }
        Object[] objArr = this.x;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.x, i, objArr2, i + 1, this.y - i);
            this.x = objArr2;
        }
        this.x[i] = obj;
        this.y++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        f();
        return super.addAll(collection);
    }

    public final void clear() {
        f();
        super.clear();
    }

    public final void d(int i) {
        if (i < 0 || i >= this.y) {
            ku4.d(this.y, pb4.o(i, "Index:", ", Size:"));
        }
    }

    public final boolean equals(Object obj) {
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

    public final void f() {
        if (!this.w) {
            ku4.p();
        }
    }

    public final du5 g(int i) {
        if (i >= this.y) {
            return new du5(Arrays.copyOf(this.x, i), this.y, true);
        }
        ku4.v();
        return null;
    }

    public final Object get(int i) {
        d(i);
        return this.x[i];
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final Object remove(int i) {
        f();
        d(i);
        Object[] objArr = this.x;
        Object obj = objArr[i];
        int i2 = this.y;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.y--;
        this.modCount++;
        return obj;
    }

    public final boolean removeAll(Collection collection) {
        f();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        f();
        return super.retainAll(collection);
    }

    public final Object set(int i, Object obj) {
        f();
        d(i);
        Object[] objArr = this.x;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.y;
    }

    public final boolean addAll(int i, Collection collection) {
        f();
        return super.addAll(i, collection);
    }

    public final boolean remove(Object obj) {
        f();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean add(Object obj) {
        f();
        int i = this.y;
        Object[] objArr = this.x;
        if (i == objArr.length) {
            this.x = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.x;
        int i2 = this.y;
        this.y = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
