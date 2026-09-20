package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: ol8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ol8 extends qk8 implements RandomAccess, ul8, sm8 {
    public static final ol8 A;
    public static final int[] z;
    public int[] x;
    public int y;

    static {
        int[] iArr = new int[0];
        z = iArr;
        A = new ol8(iArr, 0, false);
    }

    public ol8(int[] iArr, int i, boolean z2) {
        super(z2);
        this.x = iArr;
        this.y = i;
    }

    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        d();
        if (i < 0 || i > (i2 = this.y)) {
            h.l(mj2.c(this.y, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.x;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.x, 0, iArr2, 0, i);
            System.arraycopy(this.x, i, iArr2, i3, this.y - i);
            this.x = iArr2;
        }
        this.x[i] = intValue;
        this.y++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        d();
        collection.getClass();
        if (!(collection instanceof ol8)) {
            return super.addAll(collection);
        }
        ol8 ol8 = (ol8) collection;
        int i = ol8.y;
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
            System.arraycopy(ol8.x, 0, this.x, this.y, ol8.y);
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
        if (!(obj instanceof ol8)) {
            return super.equals(obj);
        }
        ol8 ol8 = (ol8) obj;
        if (this.y != ol8.y) {
            return false;
        }
        int[] iArr = ol8.x;
        for (int i = 0; i < this.y; i++) {
            if (this.x[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final ol8 t(int i) {
        int[] iArr;
        if (i >= this.y) {
            if (i == 0) {
                iArr = z;
            } else {
                iArr = Arrays.copyOf(this.x, i);
            }
            return new ol8(iArr, this.y, true);
        }
        ku4.v();
        return null;
    }

    public final int g(int i) {
        l(i);
        return this.x[i];
    }

    public final /* synthetic */ Object get(int i) {
        l(i);
        return Integer.valueOf(this.x[i]);
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

    public final void k(int i) {
        d();
        int i2 = this.y;
        int length = this.x.length;
        if (i2 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.x, 0, iArr, 0, this.y);
            this.x = iArr;
        }
        int[] iArr2 = this.x;
        int i3 = this.y;
        this.y = i3 + 1;
        iArr2[i3] = i;
    }

    public final void l(int i) {
        if (i < 0 || i >= this.y) {
            h.l(mj2.c(this.y, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        d();
        l(i);
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

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        d();
        l(i);
        int[] iArr = this.x;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.y;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        k(((Integer) obj).intValue());
        return true;
    }
}
