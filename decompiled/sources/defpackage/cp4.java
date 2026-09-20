package defpackage;

import java.util.Arrays;

/* renamed from: cp4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cp4 {
    public long[] a;
    public int b;

    public cp4(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = uc4.a;
        } else {
            jArr = new long[i];
        }
        this.a = jArr;
    }

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.a;
        int i2 = this.b;
        jArr2[i2] = j;
        this.b = i2 + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r8 = (defpackage.cp4) r8;
     */
    public final boolean equals(Object obj) {
        cp4 cp4;
        int i;
        if (!(obj instanceof cp4) || cp4.b != (i = this.b)) {
            return false;
        }
        long[] jArr = this.a;
        long[] jArr2 = cp4.a;
        re3 V = z65.V(0, i);
        int i2 = V.w;
        int i3 = V.x;
        if (i2 > i3) {
            return true;
        }
        while (jArr[i2] == jArr2[i2]) {
            if (i2 == i3) {
                return true;
            }
            i2++;
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append("]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append("...");
                break;
            }
            if (i2 != 0) {
                sb.append(", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ cp4() {
        this(16);
    }
}
