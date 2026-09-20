package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: fe3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fe3 extends r2 implements nf3, RandomAccess {
    public static final fe3 z = new fe3(new int[0], 0, false);
    public int[] x;
    public int y;

    public fe3(int[] iArr, int i, boolean z2) {
        super(z2);
        this.x = iArr;
        this.y = i;
    }

    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        d();
        if (i < 0 || i > (i2 = this.y)) {
            ku4.d(this.y, pb4.o(i, "Index:", ", Size:"));
            return;
        }
        int[] iArr = this.x;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.x, i, iArr2, i + 1, this.y - i);
            this.x = iArr2;
        }
        this.x[i] = intValue;
        this.y++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        d();
        Charset charset = rf3.a;
        collection.getClass();
        if (!(collection instanceof fe3)) {
            return super.addAll(collection);
        }
        fe3 fe3 = (fe3) collection;
        int i = fe3.y;
        if (i == 0) {
            return false;
        }
        int i2 = this.y;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.x;
            if (i3 > iArr.length) {
                this.x = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(fe3.x, 0, this.x, this.y, fe3.y);
            this.y = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe3)) {
            return super.equals(obj);
        }
        fe3 fe3 = (fe3) obj;
        if (this.y != fe3.y) {
            return false;
        }
        int[] iArr = fe3.x;
        for (int i = 0; i < this.y; i++) {
            if (this.x[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        d();
        int i2 = this.y;
        int[] iArr = this.x;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.x = iArr2;
        }
        int[] iArr3 = this.x;
        int i3 = this.y;
        this.y = i3 + 1;
        iArr3[i3] = i;
    }

    public final void g(int i) {
        if (i < 0 || i >= this.y) {
            ku4.d(this.y, pb4.o(i, "Index:", ", Size:"));
        }
    }

    public final Object get(int i) {
        return Integer.valueOf(k(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.y; i2++) {
            i = (i * 31) + this.x[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.x[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final pf3 j(int i) {
        if (i >= this.y) {
            return new fe3(Arrays.copyOf(this.x, i), this.y, true);
        }
        ku4.v();
        return null;
    }

    public final int k(int i) {
        g(i);
        return this.x[i];
    }

    public final Object remove(int i) {
        d();
        g(i);
        int[] iArr = this.x;
        int i2 = iArr[i];
        int i3 = this.y;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.y--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        d();
        if (i2 >= i) {
            int[] iArr = this.x;
            System.arraycopy(iArr, i2, iArr, i, this.y - i2);
            this.y -= i2 - i;
            this.modCount++;
            return;
        }
        h.l("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        d();
        g(i);
        int[] iArr = this.x;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.y;
    }

    public final boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
