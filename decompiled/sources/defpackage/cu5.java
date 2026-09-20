package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: cu5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cu5 extends r2 implements RandomAccess {
    public static final cu5 z = new cu5(new Object[0], 0, false);
    public Object[] x;
    public int y;

    public cu5(Object[] objArr, int i, boolean z2) {
        super(z2);
        this.x = objArr;
        this.y = i;
    }

    public final void add(int i, Object obj) {
        int i2;
        d();
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

    public final void f(int i) {
        if (i < 0 || i >= this.y) {
            ku4.d(this.y, pb4.o(i, "Index:", ", Size:"));
        }
    }

    public final Object get(int i) {
        f(i);
        return this.x[i];
    }

    public final pf3 j(int i) {
        if (i >= this.y) {
            return new cu5(Arrays.copyOf(this.x, i), this.y, true);
        }
        ku4.v();
        return null;
    }

    public final Object remove(int i) {
        d();
        f(i);
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

    public final Object set(int i, Object obj) {
        d();
        f(i);
        Object[] objArr = this.x;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.y;
    }

    public final boolean add(Object obj) {
        d();
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
