package defpackage;

import java.util.Arrays;

/* renamed from: xo4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xo4 {
    public int[] a;
    public int b;

    public xo4(int i) {
        int[] iArr;
        if (i == 0) {
            iArr = ve3.a;
        } else {
            iArr = new int[i];
        }
        this.a = iArr;
    }

    public final void a(int i) {
        b(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final int c(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        h.l("Index must be between 0 and size");
        return 0;
    }

    public final int d() {
        int i = this.b;
        if (i != 0) {
            return this.a[i - 1];
        }
        kj6.i("IntList is empty.");
        return 0;
    }

    public final void e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            h.l("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            qs.J0(i, i + 1, i2, iArr, iArr);
        }
        this.b--;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r6 = (defpackage.xo4) r6;
     */
    public final boolean equals(Object obj) {
        xo4 xo4;
        int i;
        if (!(obj instanceof xo4) || xo4.b != (i = this.b)) {
            return false;
        }
        int[] iArr = this.a;
        int[] iArr2 = xo4.a;
        re3 V = z65.V(0, i);
        int i2 = V.w;
        int i3 = V.x;
        if (i2 > i3) {
            return true;
        }
        while (iArr[i2] == iArr2[i2]) {
            if (i2 == i3) {
                return true;
            }
            i2++;
        }
        return false;
    }

    public final void f(int i, int i2) {
        if (i < 0 || i >= this.b) {
            h.l("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append("]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append("...");
                break;
            }
            if (i2 != 0) {
                sb.append(", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ xo4() {
        this(16);
    }
}
