package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: zt6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class zt6 {
    public int[] w;
    public Object[] x;
    public int y;

    public zt6(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = ie1.z;
        } else {
            iArr = new int[i];
        }
        this.w = iArr;
        if (i == 0) {
            objArr = ie1.B;
        } else {
            objArr = new Object[(i << 1)];
        }
        this.x = objArr;
    }

    public final int a(Object obj) {
        int i = this.y * 2;
        Object[] objArr = this.x;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.y;
        int[] iArr = this.w;
        if (iArr.length < i) {
            this.w = Arrays.copyOf(iArr, i);
            this.x = Arrays.copyOf(this.x, i * 2);
        }
        if (this.y != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i2 = this.y;
        if (i2 == 0) {
            return -1;
        }
        int q = ie1.q(i2, i, this.w);
        if (q < 0 || sg3.e(obj, this.x[q << 1])) {
            return q;
        }
        int i3 = q + 1;
        while (i3 < i2 && this.w[i3] == i) {
            if (sg3.e(obj, this.x[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = q - 1;
        while (i4 >= 0 && this.w[i4] == i) {
            if (sg3.e(obj, this.x[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public final void clear() {
        if (this.y > 0) {
            this.w = ie1.z;
            this.x = ie1.B;
            this.y = 0;
        }
        if (this.y > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (e(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int e(Object obj) {
        if (obj == null) {
            return f();
        }
        return c(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof zt6) {
                int i = this.y;
                if (i != ((zt6) obj).y) {
                    return false;
                }
                zt6 zt6 = (zt6) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object g = g(i2);
                    Object j = j(i2);
                    Object obj2 = zt6.get(g);
                    if (j == null) {
                        if (obj2 != null || !zt6.containsKey(g)) {
                            return false;
                        }
                    } else if (!j.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.y != ((Map) obj).size()) {
                return false;
            } else {
                int i3 = this.y;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object g2 = g(i4);
                    Object j2 = j(i4);
                    Object obj3 = ((Map) obj).get(g2);
                    if (j2 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(g2)) {
                            return false;
                        }
                    } else if (!j2.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i = this.y;
        if (i == 0) {
            return -1;
        }
        int q = ie1.q(i, 0, this.w);
        if (q < 0 || this.x[q << 1] == null) {
            return q;
        }
        int i2 = q + 1;
        while (i2 < i && this.w[i2] == 0) {
            if (this.x[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = q - 1;
        while (i3 >= 0 && this.w[i3] == 0) {
            if (this.x[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public final Object g(int i) {
        boolean z = false;
        if (i >= 0 && i < this.y) {
            z = true;
        }
        if (z) {
            return this.x[i << 1];
        }
        h.q(hl6.k(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public Object get(Object obj) {
        int e = e(obj);
        if (e >= 0) {
            return this.x[(e << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e = e(obj);
        if (e >= 0) {
            return this.x[(e << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.y)) {
            h.q(hl6.k(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.x;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.w;
        int i5 = 8;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i6 = i + 1;
                qs.J0(i, i6, i2, iArr, iArr);
                Object[] objArr2 = this.x;
                qs.K0(i3, i6 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.x;
            int i7 = i4 << 1;
            objArr3[i7] = null;
            objArr3[i7 + 1] = null;
        } else {
            if (i2 > 8) {
                i5 = i2 + (i2 >> 1);
            }
            this.w = Arrays.copyOf(iArr, i5);
            this.x = Arrays.copyOf(this.x, i5 << 1);
            if (i2 == this.y) {
                if (i > 0) {
                    qs.J0(0, 0, i, iArr, this.w);
                    qs.K0(0, 0, i3, objArr, this.x);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    qs.J0(i, i8, i2, iArr, this.w);
                    qs.K0(i3, i8 << 1, i2 << 1, objArr, this.x);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i2 == this.y) {
            this.y = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.w;
        Object[] objArr = this.x;
        int i2 = this.y;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final Object i(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.y) {
            z = true;
        }
        if (z) {
            int i2 = (i << 1) + 1;
            Object[] objArr = this.x;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        h.q(hl6.k(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final boolean isEmpty() {
        if (this.y <= 0) {
            return true;
        }
        return false;
    }

    public final Object j(int i) {
        boolean z = false;
        if (i >= 0 && i < this.y) {
            z = true;
        }
        if (z) {
            return this.x[(i << 1) + 1];
        }
        h.q(hl6.k(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.y;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (obj != null) {
            i2 = c(i, obj);
        } else {
            i2 = f();
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            Object[] objArr = this.x;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~i2;
        int[] iArr = this.w;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            this.w = Arrays.copyOf(iArr, i6);
            this.x = Arrays.copyOf(this.x, i6 << 1);
            if (i3 != this.y) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr2 = this.w;
            int i7 = i5 + 1;
            qs.J0(i7, i5, i3, iArr2, iArr2);
            Object[] objArr2 = this.x;
            qs.K0(i7 << 1, i5 << 1, this.y << 1, objArr2, objArr2);
        }
        int i8 = this.y;
        if (i3 == i8) {
            int[] iArr3 = this.w;
            if (i5 < iArr3.length) {
                iArr3[i5] = i;
                Object[] objArr3 = this.x;
                int i9 = i5 << 1;
                objArr3[i9] = obj;
                objArr3[i9 + 1] = obj2;
                this.y = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int e = e(obj);
        if (e < 0 || !sg3.e(obj2, j(e))) {
            return false;
        }
        h(e);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e = e(obj);
        if (e < 0 || !sg3.e(obj2, j(e))) {
            return false;
        }
        i(e, obj3);
        return true;
    }

    public final int size() {
        return this.y;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.y * 28);
        sb.append('{');
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object g = g(i2);
            if (g != sb) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j = j(i2);
            if (j != sb) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int e = e(obj);
        if (e >= 0) {
            return h(e);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e = e(obj);
        if (e >= 0) {
            return i(e, obj2);
        }
        return null;
    }
}
