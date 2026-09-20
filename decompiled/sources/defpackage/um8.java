package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: um8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class um8 extends qk8 implements RandomAccess {
    public static final um8 A;
    public static final Object[] z;
    public Object[] x;
    public int y;

    static {
        Object[] objArr = new Object[0];
        z = objArr;
        A = new um8(objArr, 0, false);
    }

    public um8(Object[] objArr, int i, boolean z2) {
        super(z2);
        this.x = objArr;
        this.y = i;
    }

    public final void add(int i, Object obj) {
        int i2;
        d();
        if (i < 0 || i > (i2 = this.y)) {
            h.l(mj2.c(this.y, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.x;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.x, 0, objArr2, 0, i);
            System.arraycopy(this.x, i, objArr2, i3, this.y - i);
            this.x = objArr2;
        }
        this.x[i] = obj;
        this.y++;
        this.modCount++;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i = this.y;
        if (i != list.size()) {
            return false;
        }
        if (obj instanceof um8) {
            um8 um8 = (um8) obj;
            for (int i2 = 0; i2 < i; i2++) {
                if (!this.x[i2].equals(um8.x[i2])) {
                    return false;
                }
            }
            return true;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.x[i3].equals(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.y) {
            h.l(mj2.c(this.y, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    public final Object get(int i) {
        f(i);
        return this.x[i];
    }

    public final int hashCode() {
        int i = this.y;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + this.x[i3].hashCode();
        }
        return i2;
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

    public final /* bridge */ /* synthetic */ zl8 t(int i) {
        Object[] objArr;
        if (i >= this.y) {
            if (i == 0) {
                objArr = z;
            } else {
                objArr = Arrays.copyOf(this.x, i);
            }
            return new um8(objArr, this.y, true);
        }
        ku4.v();
        return null;
    }

    public final boolean add(Object obj) {
        d();
        int i = this.y;
        int length = this.x.length;
        if (i == length) {
            this.x = Arrays.copyOf(this.x, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.x;
        int i2 = this.y;
        this.y = i2 + 1;
        objArr[i2] = obj;
        this.modCount++;
        return true;
    }
}
