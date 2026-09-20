package defpackage;

import java.util.List;

/* renamed from: lp4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lp4 {
    public Object[] a;
    public int b;
    public jp4 c;

    public lp4(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = w25.a;
        } else {
            objArr = new Object[i];
        }
        this.a = objArr;
    }

    public final void a(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void b(lp4 lp4) {
        lp4.getClass();
        if (!lp4.h()) {
            int i = this.b + lp4.b;
            Object[] objArr = this.a;
            if (objArr.length < i) {
                m(i, objArr);
            }
            qs.K0(this.b, 0, lp4.b, lp4.a, this.a);
            this.b += lp4.b;
        }
    }

    public final void c(List list) {
        if (!list.isEmpty()) {
            int i = this.b;
            int size = list.size() + i;
            Object[] objArr = this.a;
            if (objArr.length < size) {
                m(size, objArr);
            }
            Object[] objArr2 = this.a;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                objArr2[i2 + i] = list.get(i2);
            }
            this.b = list.size() + this.b;
        }
    }

    public final void d() {
        qs.S0(0, this.b, (Object) null, this.a);
        this.b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.a[0];
        }
        kj6.i("ObjectList is empty.");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r6 = (defpackage.lp4) r6;
     */
    public final boolean equals(Object obj) {
        lp4 lp4;
        int i;
        if (!(obj instanceof lp4) || lp4.b != (i = this.b)) {
            return false;
        }
        Object[] objArr = this.a;
        Object[] objArr2 = lp4.a;
        re3 V = z65.V(0, i);
        int i2 = V.w;
        int i3 = V.x;
        if (i2 > i3) {
            return true;
        }
        while (sg3.e(objArr[i2], objArr2[i2])) {
            if (i2 == i3) {
                return true;
            }
            i2++;
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        o(i);
        throw null;
    }

    public final int g(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean h() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 += i * 31;
        }
        return i3;
    }

    public final boolean i() {
        if (this.b != 0) {
            return true;
        }
        return false;
    }

    public final boolean j(Object obj) {
        int g = g(obj);
        if (g < 0) {
            return false;
        }
        k(g);
        return true;
    }

    public final Object k(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            o(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            qs.K0(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void l(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            ku4.d(this.b, pb4.p("Start (", i, ") and end (", i2, ") must be in 0.."));
        } else if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        } else if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                qs.K0(i, i2, i3, objArr, objArr);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            qs.S0(i5, i4, (Object) null, this.a);
            this.b = i5;
        }
    }

    public final void m(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        qs.K0(0, 0, length, objArr, objArr2);
        this.a = objArr2;
    }

    public final Object n(int i, Object obj) {
        if (i < 0 || i >= this.b) {
            o(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void o(int i) {
        StringBuilder o = pb4.o(i, "Index ", " must be in 0..");
        o.append(this.b - 1);
        throw new IndexOutOfBoundsException(o.toString());
    }

    public final void p(int i) {
        StringBuilder o = pb4.o(i, "Index ", " must be in 0..");
        o.append(this.b);
        throw new IndexOutOfBoundsException(o.toString());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append("]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append("...");
                break;
            }
            if (i2 != 0) {
                sb.append(", ");
            }
            if (obj == this) {
                str = "(this)";
            } else {
                str = String.valueOf(obj);
            }
            sb.append(str);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ lp4() {
        this(16);
    }
}
