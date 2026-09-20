package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: x76  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x76 extends h2 implements RandomAccess {
    public final Object[] w;
    public final int x;
    public int y;
    public int z;

    public x76(int i, Object[] objArr) {
        this.w = objArr;
        if (i < 0) {
            h.j(hl6.k(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        } else if (i <= objArr.length) {
            this.x = objArr.length;
            this.z = i;
        } else {
            h.i(objArr.length, pb4.o(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    public final int f() {
        return this.z;
    }

    public final void g(int i) {
        if (i < 0) {
            h.j(hl6.k(i, "n shouldn't be negative but it is "));
        } else if (i > this.z) {
            h.i(this.z, pb4.o(i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
        } else if (i > 0) {
            int i2 = this.y;
            int i3 = this.x;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.w;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.y = i4;
            this.z -= i;
        }
    }

    public final Object get(int i) {
        int i2 = this.z;
        if (i < 0 || i >= i2) {
            h.l(b81.l(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.w[(this.y + i) % this.x];
    }

    public final Iterator iterator() {
        return new w76(this);
    }

    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.z;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.z;
        int i3 = this.y;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.w;
            if (i5 < i2 && i3 < this.x) {
                objArr[i5] = objArr2[i3];
                i5++;
                i3++;
            }
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    public final Object[] toArray() {
        return toArray(new Object[f()]);
    }
}
