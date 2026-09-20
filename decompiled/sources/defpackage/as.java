package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: as  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class as extends l2 {
    public static final Object[] z = new Object[0];
    public int w;
    public Object[] x;
    public int y;

    public as(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = z;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            h.q(hl6.k(i, "Illegal Capacity: "));
            throw null;
        }
        this.x = objArr;
    }

    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.y;
        if (i < 0 || i > i3) {
            h.l(b81.l(i, i3, "index: ", ", size: "));
        } else if (i == i3) {
            addLast(obj);
        } else if (i == 0) {
            addFirst(obj);
        } else {
            x();
            l(this.y + 1);
            int w2 = w(this.w + i);
            int i4 = this.y;
            if (i < ((i4 + 1) >> 1)) {
                if (w2 == 0) {
                    Object[] objArr = this.x;
                    objArr.getClass();
                    i2 = objArr.length - 1;
                } else {
                    i2 = w2 - 1;
                }
                int i5 = this.w;
                if (i5 == 0) {
                    Object[] objArr2 = this.x;
                    objArr2.getClass();
                    i5 = objArr2.length;
                }
                int i6 = i5 - 1;
                int i7 = this.w;
                Object[] objArr3 = this.x;
                if (i2 >= i7) {
                    objArr3[i6] = objArr3[i7];
                    qs.K0(i7, i7 + 1, i2 + 1, objArr3, objArr3);
                } else {
                    qs.K0(i7 - 1, i7, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.x;
                    objArr4[objArr4.length - 1] = objArr4[0];
                    qs.K0(0, 1, i2 + 1, objArr4, objArr4);
                }
                this.x[i2] = obj;
                this.w = i6;
            } else {
                int w3 = w(i4 + this.w);
                Object[] objArr5 = this.x;
                if (w2 < w3) {
                    qs.K0(w2 + 1, w2, w3, objArr5, objArr5);
                } else {
                    qs.K0(1, 0, w3, objArr5, objArr5);
                    Object[] objArr6 = this.x;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    qs.K0(w2 + 1, w2, objArr6.length - 1, objArr6, objArr6);
                }
                this.x[w2] = obj;
            }
            this.y++;
        }
    }

    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.y;
        if (i < 0 || i > i2) {
            h.l(b81.l(i, i2, "index: ", ", size: "));
            return false;
        } else if (collection.isEmpty()) {
            return false;
        } else {
            if (i == this.y) {
                return addAll(collection);
            }
            x();
            l(collection.size() + this.y);
            int w2 = w(this.y + this.w);
            int w3 = w(this.w + i);
            int size = collection.size();
            if (i < ((this.y + 1) >> 1)) {
                int i3 = this.w;
                int i4 = i3 - size;
                Object[] objArr = this.x;
                if (w3 < i3) {
                    qs.K0(i4, i3, objArr.length, objArr, objArr);
                    Object[] objArr2 = this.x;
                    if (size >= w3) {
                        qs.K0(objArr2.length - size, 0, w3, objArr2, objArr2);
                    } else {
                        qs.K0(objArr2.length - size, 0, size, objArr2, objArr2);
                        Object[] objArr3 = this.x;
                        qs.K0(0, size, w3, objArr3, objArr3);
                    }
                } else if (i4 >= 0) {
                    qs.K0(i4, i3, w3, objArr, objArr);
                } else {
                    i4 += objArr.length;
                    int i5 = w3 - i3;
                    int length = objArr.length - i4;
                    if (length >= i5) {
                        qs.K0(i4, i3, w3, objArr, objArr);
                    } else {
                        qs.K0(i4, i3, i3 + length, objArr, objArr);
                        Object[] objArr4 = this.x;
                        qs.K0(0, this.w + length, w3, objArr4, objArr4);
                    }
                }
                this.w = i4;
                k(s(w3 - size), collection);
                return true;
            }
            int i6 = w3 + size;
            Object[] objArr5 = this.x;
            if (w3 < w2) {
                int i7 = size + w2;
                if (i7 <= objArr5.length) {
                    qs.K0(i6, w3, w2, objArr5, objArr5);
                } else if (i6 >= objArr5.length) {
                    qs.K0(i6 - objArr5.length, w3, w2, objArr5, objArr5);
                } else {
                    int length2 = w2 - (i7 - objArr5.length);
                    qs.K0(0, length2, w2, objArr5, objArr5);
                    Object[] objArr6 = this.x;
                    qs.K0(i6, w3, length2, objArr6, objArr6);
                }
            } else {
                qs.K0(size, 0, w2, objArr5, objArr5);
                Object[] objArr7 = this.x;
                if (i6 >= objArr7.length) {
                    qs.K0(i6 - objArr7.length, w3, objArr7.length, objArr7, objArr7);
                } else {
                    qs.K0(0, objArr7.length - size, objArr7.length, objArr7, objArr7);
                    Object[] objArr8 = this.x;
                    qs.K0(i6, w3, objArr8.length - size, objArr8, objArr8);
                }
            }
            k(w3, collection);
            return true;
        }
    }

    public final void addFirst(Object obj) {
        x();
        l(this.y + 1);
        int i = this.w;
        if (i == 0) {
            Object[] objArr = this.x;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.w = i2;
        this.x[i2] = obj;
        this.y++;
    }

    public final void addLast(Object obj) {
        x();
        l(f() + 1);
        this.x[w(f() + this.w)] = obj;
        this.y = f() + 1;
    }

    public final void clear() {
        if (!isEmpty()) {
            x();
            v(this.w, w(f() + this.w));
        }
        this.w = 0;
        this.y = 0;
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.y;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.x[this.w];
        }
        kj6.i("ArrayDeque is empty.");
        return null;
    }

    public final Object g(int i) {
        int i2 = this.y;
        if (i < 0 || i >= i2) {
            h.l(b81.l(i, i2, "index: ", ", size: "));
            return null;
        } else if (i == f() - 1) {
            return removeLast();
        } else {
            if (i == 0) {
                return removeFirst();
            }
            x();
            int w2 = w(this.w + i);
            Object[] objArr = this.x;
            Object obj = objArr[w2];
            int i3 = this.y >> 1;
            int i4 = this.w;
            if (i < i3) {
                if (w2 >= i4) {
                    qs.K0(i4 + 1, i4, w2, objArr, objArr);
                } else {
                    qs.K0(1, 0, w2, objArr, objArr);
                    Object[] objArr2 = this.x;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i5 = this.w;
                    qs.K0(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.x;
                int i6 = this.w;
                objArr3[i6] = null;
                this.w = o(i6);
            } else {
                int w3 = w((f() - 1) + i4);
                Object[] objArr4 = this.x;
                if (w2 <= w3) {
                    qs.K0(w2, w2 + 1, w3 + 1, objArr4, objArr4);
                } else {
                    qs.K0(w2, w2 + 1, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.x;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    qs.K0(0, 1, w3 + 1, objArr5, objArr5);
                }
                this.x[w3] = null;
            }
            this.y--;
            return obj;
        }
    }

    public final Object get(int i) {
        int f = f();
        if (i >= 0 && i < f) {
            return this.x[w(this.w + i)];
        }
        h.l(b81.l(i, f, "index: ", ", size: "));
        return null;
    }

    public final int indexOf(Object obj) {
        int i;
        int i2;
        int w2 = w(f() + this.w);
        int i3 = this.w;
        if (i3 < w2) {
            while (i < w2) {
                if (sg3.e(obj, this.x[i])) {
                    i2 = this.w;
                } else {
                    i3 = i + 1;
                }
            }
            return -1;
        } else if (isEmpty() || (i = this.w) < w2) {
            return -1;
        } else {
            int length = this.x.length;
            while (true) {
                if (i >= length) {
                    int i4 = 0;
                    while (i4 < w2) {
                        if (sg3.e(obj, this.x[i4])) {
                            i = i4 + this.x.length;
                            i2 = this.w;
                        } else {
                            i4++;
                        }
                    }
                    return -1;
                } else if (sg3.e(obj, this.x[i])) {
                    i2 = this.w;
                    break;
                } else {
                    i++;
                }
            }
        }
        return i - i2;
    }

    public final boolean isEmpty() {
        if (f() == 0) {
            return true;
        }
        return false;
    }

    public final void k(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.x.length;
        while (i < length && it.hasNext()) {
            this.x[i] = it.next();
            i++;
        }
        int i2 = this.w;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.x[i3] = it.next();
        }
        this.y = collection.size() + this.y;
    }

    public final void l(int i) {
        if (i >= 0) {
            Object[] objArr = this.x;
            if (i > objArr.length) {
                if (objArr == z) {
                    if (i < 10) {
                        i = 10;
                    }
                    this.x = new Object[i];
                    return;
                }
                int length = objArr.length;
                int i2 = length + (length >> 1);
                if (i2 - i < 0) {
                    i2 = i;
                }
                if (i2 - 2147483639 > 0) {
                    if (i > 2147483639) {
                        i2 = Integer.MAX_VALUE;
                    } else {
                        i2 = 2147483639;
                    }
                }
                Object[] objArr2 = new Object[i2];
                qs.K0(0, this.w, objArr.length, objArr, objArr2);
                Object[] objArr3 = this.x;
                int length2 = objArr3.length;
                int i3 = this.w;
                qs.K0(length2 - i3, 0, i3, objArr3, objArr2);
                this.w = 0;
                this.x = objArr2;
                return;
            }
            return;
        }
        h.s("Deque is too big.");
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.x[w((size() - 1) + this.w)];
        }
        kj6.i("ArrayDeque is empty.");
        return null;
    }

    public final int lastIndexOf(Object obj) {
        int i;
        int i2;
        int w2 = w(this.y + this.w);
        int i3 = this.w;
        if (i3 < w2) {
            i = w2 - 1;
            if (i3 <= i) {
                while (!sg3.e(obj, this.x[i])) {
                    if (i != i3) {
                        i--;
                    }
                }
                i2 = this.w;
            }
            return -1;
        }
        if (!isEmpty() && this.w >= w2) {
            while (true) {
                w2--;
                Object[] objArr = this.x;
                if (-1 >= w2) {
                    objArr.getClass();
                    int length = objArr.length - 1;
                    int i4 = this.w;
                    if (i4 <= length) {
                        while (!sg3.e(obj, this.x[i])) {
                            if (i != i4) {
                                length = i - 1;
                            }
                        }
                        i2 = this.w;
                    }
                } else if (sg3.e(obj, objArr[w2])) {
                    i = w2 + this.x.length;
                    i2 = this.w;
                    break;
                }
            }
        }
        return -1;
        return i - i2;
    }

    public final Object n() {
        if (isEmpty()) {
            return null;
        }
        return this.x[this.w];
    }

    public final int o(int i) {
        Object[] objArr = this.x;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object p() {
        if (isEmpty()) {
            return null;
        }
        return this.x[w((size() - 1) + this.w)];
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        g(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    public final boolean removeAll(Collection collection) {
        int i;
        Object[] objArr;
        boolean z2;
        collection.getClass();
        ? r1 = 0;
        if (!isEmpty() && this.x.length != 0) {
            int w2 = w(f() + this.w);
            int i2 = this.w;
            if (i2 < w2) {
                i = i2;
                while (true) {
                    objArr = this.x;
                    if (i2 >= w2) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (!collection.contains(obj)) {
                        this.x[i] = obj;
                        i++;
                        z2 = r1;
                    } else {
                        z2 = true;
                    }
                    i2++;
                    r1 = z2;
                }
                qs.S0(i, w2, (Object) null, objArr);
                r1 = r1;
            } else {
                int length = this.x.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.x;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (!collection.contains(obj2)) {
                        this.x[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                i = w(i3);
                while (r1 < w2) {
                    Object[] objArr3 = this.x;
                    Object obj3 = objArr3[r1];
                    objArr3[r1] = null;
                    if (!collection.contains(obj3)) {
                        this.x[i] = obj3;
                        i = o(i);
                    } else {
                        z3 = true;
                    }
                    r1++;
                }
                r1 = z3;
            }
            if (r1 != 0) {
                x();
                this.y = s(i - this.w);
            }
        }
        return r1;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            x();
            Object[] objArr = this.x;
            int i = this.w;
            Object obj = objArr[i];
            objArr[i] = null;
            this.w = o(i);
            this.y = f() - 1;
            return obj;
        }
        kj6.i("ArrayDeque is empty.");
        return null;
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            x();
            int w2 = w((size() - 1) + this.w);
            Object[] objArr = this.x;
            Object obj = objArr[w2];
            objArr[w2] = null;
            this.y = f() - 1;
            return obj;
        }
        kj6.i("ArrayDeque is empty.");
        return null;
    }

    public final void removeRange(int i, int i2) {
        ie1.A(i, i2, this.y);
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == this.y) {
                clear();
            } else if (i3 == 1) {
                g(i);
            } else {
                x();
                int i4 = this.y - i2;
                int i5 = this.w;
                if (i < i4) {
                    int w2 = w((i - 1) + i5);
                    int w3 = w(this.w + (i2 - 1));
                    while (i > 0) {
                        int i6 = w2 + 1;
                        int min = Math.min(i, Math.min(i6, w3 + 1));
                        Object[] objArr = this.x;
                        int i7 = w3 - min;
                        int i8 = w2 - min;
                        qs.K0(i7 + 1, i8 + 1, i6, objArr, objArr);
                        w2 = s(i8);
                        w3 = s(i7);
                        i -= min;
                    }
                    int w4 = w(this.w + i3);
                    v(this.w, w4);
                    this.w = w4;
                } else {
                    int w5 = w(i5 + i2);
                    int w6 = w(this.w + i);
                    int i9 = this.y;
                    while (true) {
                        i9 -= i2;
                        if (i9 <= 0) {
                            break;
                        }
                        Object[] objArr2 = this.x;
                        i2 = Math.min(i9, Math.min(objArr2.length - w5, objArr2.length - w6));
                        Object[] objArr3 = this.x;
                        int i10 = w5 + i2;
                        qs.K0(w6, w5, i10, objArr3, objArr3);
                        w5 = w(i10);
                        w6 = w(w6 + i2);
                    }
                    int w7 = w(this.y + this.w);
                    v(s(w7 - i3), w7);
                }
                this.y -= i3;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    public final boolean retainAll(Collection collection) {
        int i;
        Object[] objArr;
        boolean z2;
        collection.getClass();
        ? r1 = 0;
        if (!isEmpty() && this.x.length != 0) {
            int w2 = w(f() + this.w);
            int i2 = this.w;
            if (i2 < w2) {
                i = i2;
                while (true) {
                    objArr = this.x;
                    if (i2 >= w2) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (collection.contains(obj)) {
                        this.x[i] = obj;
                        i++;
                        z2 = r1;
                    } else {
                        z2 = true;
                    }
                    i2++;
                    r1 = z2;
                }
                qs.S0(i, w2, (Object) null, objArr);
                r1 = r1;
            } else {
                int length = this.x.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.x;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        this.x[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                i = w(i3);
                while (r1 < w2) {
                    Object[] objArr3 = this.x;
                    Object obj3 = objArr3[r1];
                    objArr3[r1] = null;
                    if (collection.contains(obj3)) {
                        this.x[i] = obj3;
                        i = o(i);
                    } else {
                        z3 = true;
                    }
                    r1++;
                }
                r1 = z3;
            }
            if (r1 != 0) {
                x();
                this.y = s(i - this.w);
            }
        }
        return r1;
    }

    public final int s(int i) {
        if (i < 0) {
            return i + this.x.length;
        }
        return i;
    }

    public final Object set(int i, Object obj) {
        int f = f();
        if (i < 0 || i >= f) {
            h.l(b81.l(i, f, "index: ", ", size: "));
            return null;
        }
        int w2 = w(this.w + i);
        Object[] objArr = this.x;
        Object obj2 = objArr[w2];
        objArr[w2] = obj;
        return obj2;
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.y;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int w2 = w(this.y + this.w);
        int i2 = this.w;
        if (i2 < w2) {
            qs.N0(i2, w2, 2, this.x, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.x;
            qs.K0(0, this.w, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.x;
            qs.K0(objArr3.length - this.w, 0, w2, objArr3, objArr);
        }
        int i3 = this.y;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public final void v(int i, int i2) {
        Object[] objArr = this.x;
        if (i < i2) {
            qs.S0(i, i2, (Object) null, objArr);
            return;
        }
        qs.S0(i, objArr.length, (Object) null, objArr);
        qs.S0(0, i2, (Object) null, this.x);
    }

    public final int w(int i) {
        Object[] objArr = this.x;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    public final void x() {
        this.modCount++;
    }

    public as() {
        this.x = z;
    }

    public final Object[] toArray() {
        return toArray(new Object[f()]);
    }

    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        x();
        l(collection.size() + f());
        k(w(f() + this.w), collection);
        return true;
    }
}
