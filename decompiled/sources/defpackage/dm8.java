package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: dm8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dm8 extends qk8 implements RandomAccess, yl8, sm8 {
    public static final dm8 A;
    public static final long[] z;
    public long[] x;
    public int y;

    static {
        long[] jArr = new long[0];
        z = jArr;
        A = new dm8(jArr, 0, false);
    }

    public dm8(long[] jArr, int i, boolean z2) {
        super(z2);
        this.x = jArr;
        this.y = i;
    }

    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        d();
        if (i < 0 || i > (i2 = this.y)) {
            h.l(mj2.c(this.y, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.x;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.x, 0, jArr2, 0, i);
            System.arraycopy(this.x, i, jArr2, i3, this.y - i);
            this.x = jArr2;
        }
        this.x[i] = longValue;
        this.y++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        d();
        collection.getClass();
        if (!(collection instanceof dm8)) {
            return super.addAll(collection);
        }
        dm8 dm8 = (dm8) collection;
        int i = dm8.y;
        if (i == 0) {
            return false;
        }
        int i2 = this.y;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.x;
            if (i3 > jArr.length) {
                this.x = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(dm8.x, 0, this.x, this.y, dm8.y);
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
        if (!(obj instanceof dm8)) {
            return super.equals(obj);
        }
        dm8 dm8 = (dm8) obj;
        if (this.y != dm8.y) {
            return false;
        }
        long[] jArr = dm8.x;
        for (int i = 0; i < this.y; i++) {
            if (this.x[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final long f(int i) {
        l(i);
        return this.x[i];
    }

    /* renamed from: g */
    public final dm8 t(int i) {
        long[] jArr;
        if (i >= this.y) {
            if (i == 0) {
                jArr = z;
            } else {
                jArr = Arrays.copyOf(this.x, i);
            }
            return new dm8(jArr, this.y, true);
        }
        ku4.v();
        return null;
    }

    public final /* synthetic */ Object get(int i) {
        l(i);
        return Long.valueOf(this.x[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.y; i2++) {
            long j = this.x[i2];
            byte[] bArr = xl8.a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.x[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void k(long j) {
        d();
        int i = this.y;
        int length = this.x.length;
        if (i == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.x, 0, jArr, 0, this.y);
            this.x = jArr;
        }
        long[] jArr2 = this.x;
        int i2 = this.y;
        this.y = i2 + 1;
        jArr2[i2] = j;
    }

    public final void l(int i) {
        if (i < 0 || i >= this.y) {
            h.l(mj2.c(this.y, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        d();
        l(i);
        long[] jArr = this.x;
        long j = jArr[i];
        int i2 = this.y;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.y--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        d();
        if (i2 >= i) {
            long[] jArr = this.x;
            System.arraycopy(jArr, i2, jArr, i, this.y - i2);
            this.y -= i2 - i;
            this.modCount++;
            return;
        }
        h.l("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        d();
        l(i);
        long[] jArr = this.x;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.y;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        k(((Long) obj).longValue());
        return true;
    }
}
