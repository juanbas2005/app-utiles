package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: ze4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ze4 implements Map, Serializable, er3 {
    public static final ze4 J;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public af4 F;
    public em0 G;
    public af4 H;
    public boolean I;
    public Object[] w;
    public Object[] x;
    public int[] y;
    public int[] z;

    static {
        ze4 ze4 = new ze4(0);
        ze4.I = true;
        J = ze4;
    }

    public ze4(int i) {
        if (i >= 0) {
            Object[] objArr = new Object[i];
            int[] iArr = new int[i];
            int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
            this.w = objArr;
            this.x = null;
            this.y = iArr;
            this.z = new int[highestOneBit];
            this.A = 2;
            this.B = 0;
            this.C = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        h.q("capacity must be non-negative.");
        throw null;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int k = k(obj);
            int i = this.A * 2;
            int length = this.z.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.z;
                int i3 = iArr[k];
                if (i3 == 0) {
                    int i4 = this.B;
                    Object[] objArr = this.w;
                    if (i4 >= objArr.length) {
                        g(1);
                    } else {
                        int i5 = i4 + 1;
                        this.B = i5;
                        objArr[i4] = obj;
                        this.y[i4] = k;
                        iArr[k] = i5;
                        this.E++;
                        this.D++;
                        if (i2 > this.A) {
                            this.A = i2;
                        }
                        return i4;
                    }
                } else if (sg3.e(this.w[i3 - 1], obj)) {
                    return -i3;
                } else {
                    i2++;
                    if (i2 > i) {
                        l(this.z.length * 2);
                        break;
                    }
                    int i6 = k - 1;
                    if (k == 0) {
                        k = this.z.length - 1;
                    } else {
                        k = i6;
                    }
                }
            }
        }
    }

    public final ze4 b() {
        c();
        this.I = true;
        if (this.E > 0) {
            return this;
        }
        ze4 ze4 = J;
        ze4.getClass();
        return ze4;
    }

    public final void c() {
        if (this.I) {
            ku4.p();
        }
    }

    public final void clear() {
        c();
        int i = this.B - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.y;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.z[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        we.L(this.w, 0, this.B);
        Object[] objArr = this.x;
        if (objArr != null) {
            we.L(objArr, 0, this.B);
        }
        this.E = 0;
        this.B = 0;
        this.D++;
    }

    public final boolean containsKey(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (j(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final void e(boolean z2) {
        int i;
        Object[] objArr = this.x;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.B;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.y;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.w;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z2) {
                    iArr[i3] = i4;
                    this.z[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        we.L(this.w, i3, i);
        if (objArr != null) {
            we.L(objArr, i3, this.B);
        }
        this.B = i3;
    }

    public final Set entrySet() {
        af4 af4 = this.H;
        if (af4 != null) {
            return af4;
        }
        af4 af42 = new af4(this, 0);
        this.H = af42;
        return af42;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.E != map.size() || !f(map.entrySet())) {
            return false;
        }
        return true;
    }

    public final boolean f(Collection collection) {
        boolean z2;
        collection.getClass();
        for (Object next : collection) {
            if (next != null) {
                try {
                    Map.Entry entry = (Map.Entry) next;
                    int h = h(entry.getKey());
                    if (h < 0) {
                        z2 = false;
                        continue;
                    } else {
                        Object[] objArr = this.x;
                        objArr.getClass();
                        z2 = sg3.e(objArr[h], entry.getValue());
                        continue;
                    }
                    if (!z2) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void g(int i) {
        Object[] objArr;
        Object[] objArr2 = this.w;
        int length = objArr2.length;
        int i2 = this.B;
        int i3 = length - i2;
        int i4 = i2 - this.E;
        int i5 = 1;
        if (i3 >= i || i3 + i4 < i || i4 < objArr2.length / 4) {
            int i6 = i2 + i;
            if (i6 < 0) {
                throw new OutOfMemoryError();
            } else if (i6 > objArr2.length) {
                int length2 = objArr2.length;
                int i7 = length2 + (length2 >> 1);
                if (i7 - i6 < 0) {
                    i7 = i6;
                }
                if (i7 - 2147483639 > 0) {
                    if (i6 > 2147483639) {
                        i7 = Integer.MAX_VALUE;
                    } else {
                        i7 = 2147483639;
                    }
                }
                this.w = Arrays.copyOf(objArr2, i7);
                Object[] objArr3 = this.x;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, i7);
                } else {
                    objArr = null;
                }
                this.x = objArr;
                this.y = Arrays.copyOf(this.y, i7);
                if (i7 >= 1) {
                    i5 = i7;
                }
                int highestOneBit = Integer.highestOneBit(i5 * 3);
                if (highestOneBit > this.z.length) {
                    l(highestOneBit);
                }
            }
        } else {
            e(true);
        }
    }

    public final Object get(Object obj) {
        int h = h(obj);
        if (h < 0) {
            return null;
        }
        Object[] objArr = this.x;
        objArr.getClass();
        return objArr[h];
    }

    public final int h(Object obj) {
        int k = k(obj);
        int i = this.A;
        while (true) {
            int i2 = this.z[k];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (sg3.e(this.w[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = k - 1;
            if (k == 0) {
                k = this.z.length - 1;
            } else {
                k = i4;
            }
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        we4 we4 = new we4(this, 0);
        int i3 = 0;
        while (we4.hasNext()) {
            int i4 = we4.w;
            ze4 ze4 = (ze4) we4.z;
            if (i4 < ze4.B) {
                we4.w = i4 + 1;
                we4.x = i4;
                Object obj = ze4.w[i4];
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] objArr = ze4.x;
                objArr.getClass();
                Object obj2 = objArr[we4.x];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                } else {
                    i2 = 0;
                }
                we4.f();
                i3 += i ^ i2;
            } else {
                rf2.c();
                return 0;
            }
        }
        return i3;
    }

    public final boolean isEmpty() {
        if (this.E == 0) {
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        int i = this.B;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.y[i] >= 0) {
                Object[] objArr = this.x;
                objArr.getClass();
                if (sg3.e(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int k(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (i * -1640531527) >>> this.C;
    }

    public final Set keySet() {
        af4 af4 = this.F;
        if (af4 != null) {
            return af4;
        }
        af4 af42 = new af4(this, 1);
        this.F = af42;
        return af42;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r3[r0] = r6;
        r5.y[r2] = r0;
        r2 = r6;
     */
    public final void l(int i) {
        this.D++;
        int i2 = 0;
        if (this.B > this.E) {
            e(false);
        }
        this.z = new int[i];
        this.C = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.B) {
            int i3 = i2 + 1;
            int k = k(this.w[i2]);
            int i4 = this.A;
            while (true) {
                int[] iArr = this.z;
                if (iArr[k] == 0) {
                    break;
                }
                i4--;
                if (i4 >= 0) {
                    int i5 = k - 1;
                    if (k == 0) {
                        k = iArr.length - 1;
                    } else {
                        k = i5;
                    }
                } else {
                    h.s("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
            }
        }
    }

    public final void n(int i) {
        int i2;
        int i3;
        int[] iArr;
        Object[] objArr = this.w;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.x;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i4 = this.y[i];
        loop0:
        while (true) {
            int i5 = i4;
            int i6 = 0;
            do {
                int i7 = i4 - 1;
                if (i4 == 0) {
                    i4 = this.z.length - 1;
                } else {
                    i4 = i7;
                }
                int[] iArr2 = this.z;
                i2 = iArr2[i4];
                i6++;
                if (i6 > this.A) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iArr = this.z;
                }
            } while (((k(this.w[i3]) - i4) & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.y[i3] = i5;
        }
        this.y[i] = -1;
        this.E--;
        this.D++;
    }

    public final Object put(Object obj, Object obj2) {
        c();
        int a = a(obj);
        Object[] objArr = this.x;
        if (objArr == null) {
            int length = this.w.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.x = objArr;
            } else {
                h.q("capacity must be non-negative.");
                return null;
            }
        }
        if (a < 0) {
            int i = (-a) - 1;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        objArr[a] = obj2;
        return null;
    }

    public final void putAll(Map map) {
        map.getClass();
        c();
        Collection<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            g(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int a = a(entry.getKey());
                Object[] objArr = this.x;
                if (objArr == null) {
                    int length = this.w.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.x = objArr;
                    } else {
                        h.q("capacity must be non-negative.");
                        return;
                    }
                }
                if (a >= 0) {
                    objArr[a] = entry.getValue();
                } else {
                    int i = (-a) - 1;
                    if (!sg3.e(entry.getValue(), objArr[i])) {
                        objArr[i] = entry.getValue();
                    }
                }
            }
        }
    }

    public final Object remove(Object obj) {
        c();
        int h = h(obj);
        if (h < 0) {
            return null;
        }
        Object[] objArr = this.x;
        objArr.getClass();
        Object obj2 = objArr[h];
        n(h);
        return obj2;
    }

    public final int size() {
        return this.E;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.E * 3) + 2);
        sb.append("{");
        int i = 0;
        we4 we4 = new we4(this, 0);
        while (we4.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = we4.w;
            ze4 ze4 = (ze4) we4.z;
            if (i2 < ze4.B) {
                we4.w = i2 + 1;
                we4.x = i2;
                Object obj = ze4.w[i2];
                if (obj == ze4) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = ze4.x;
                objArr.getClass();
                Object obj2 = objArr[we4.x];
                if (obj2 == ze4) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                we4.f();
                i++;
            } else {
                rf2.c();
                return null;
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public final Collection values() {
        em0 em0 = this.G;
        if (em0 != null) {
            return em0;
        }
        em0 em02 = new em0(1, this);
        this.G = em02;
        return em02;
    }

    public ze4() {
        this(8);
    }
}
