package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: eq4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eq4 implements RandomAccess {
    public Object[] w;
    public jp4 x;
    public int y = 0;

    public eq4(Object[] objArr) {
        this.w = objArr;
    }

    public final void a(int i, Object obj) {
        int i2 = this.y + 1;
        if (this.w.length < i2) {
            n(i2);
        }
        Object[] objArr = this.w;
        int i3 = this.y;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.y++;
    }

    public final void b(Object obj) {
        int i = this.y + 1;
        if (this.w.length < i) {
            n(i);
        }
        Object[] objArr = this.w;
        int i2 = this.y;
        objArr[i2] = obj;
        this.y = i2 + 1;
    }

    public final void c(int i, eq4 eq4) {
        int i2 = eq4.y;
        if (i2 != 0) {
            int i3 = this.y + i2;
            if (this.w.length < i3) {
                n(i3);
            }
            Object[] objArr = this.w;
            int i4 = this.y;
            if (i != i4) {
                System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
            }
            System.arraycopy(eq4.w, 0, objArr, i, i2);
            this.y += i2;
        }
    }

    public final void d(int i, List list) {
        if (!list.isEmpty()) {
            int size = list.size();
            int i2 = this.y + size;
            if (this.w.length < i2) {
                n(i2);
            }
            Object[] objArr = this.w;
            int i3 = this.y;
            if (i != i3) {
                System.arraycopy(objArr, i, objArr, i + size, i3 - i);
            }
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                objArr[i + i4] = list.get(i4);
            }
            this.y += size;
        }
    }

    public final boolean e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.y + size;
        if (this.w.length < i3) {
            n(i3);
        }
        Object[] objArr = this.w;
        int i4 = this.y;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object next : collection) {
            int i5 = i2 + 1;
            if (i2 >= 0) {
                objArr[i2 + i] = next;
                i2 = i5;
            } else {
                sg3.Z();
                throw null;
            }
        }
        this.y += size;
        return true;
    }

    public final List f() {
        jp4 jp4 = this.x;
        if (jp4 != null) {
            return jp4;
        }
        jp4 jp42 = new jp4(1, this);
        this.x = jp42;
        return jp42;
    }

    public final void g() {
        Object[] objArr = this.w;
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.y = 0;
    }

    public final boolean h(Object obj) {
        int i = this.y - 1;
        if (i >= 0) {
            int i2 = 0;
            while (!sg3.e(this.w[i2], obj)) {
                if (i2 != i) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.w;
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            if (sg3.e(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return false;
        }
        l(i);
        return true;
    }

    public final Object l(int i) {
        Object[] objArr = this.w;
        Object obj = objArr[i];
        int i2 = this.y;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.y - 1;
        this.y = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void m(int i, int i2) {
        if (i2 > i) {
            int i3 = this.y;
            if (i2 < i3) {
                Object[] objArr = this.w;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.y;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.w[i7] = null;
                    if (i7 == i6) {
                        break;
                    }
                    i7++;
                }
            }
            this.y = i5;
        }
    }

    public final void n(int i) {
        Object[] objArr = this.w;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.w = objArr2;
    }
}
