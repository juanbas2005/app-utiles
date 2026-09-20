package defpackage;

import java.util.Arrays;

/* renamed from: i90  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i90 implements Cloneable {
    public int[] w;
    public int x;

    public i90(int i) {
        this.x = i;
        this.w = new int[((i + 31) / 32)];
    }

    public final boolean a(int i) {
        if ((this.w[i / 32] & (1 << (i & 31))) != 0) {
            return true;
        }
        return false;
    }

    public final int b(int i) {
        int i2 = this.x;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & this.w[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.w;
            if (i3 == iArr.length) {
                return i2;
            }
            i4 = iArr[i3];
        }
        return Math.min(Integer.numberOfTrailingZeros(i4) + (i3 << 5), i2);
    }

    public final int c(int i) {
        int i2 = this.x;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & (~this.w[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.w;
            if (i3 == iArr.length) {
                return i2;
            }
            i4 = ~iArr[i3];
        }
        return Math.min(Integer.numberOfTrailingZeros(i4) + (i3 << 5), i2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [i90, java.lang.Object] */
    public final Object clone() {
        int i = this.x;
        ? obj = new Object();
        obj.w = (int[]) this.w.clone();
        obj.x = i;
        return obj;
    }

    public final boolean d(int i, int i2) {
        int i3;
        if (i2 < i || i < 0 || i2 > this.x) {
            ku4.v();
            return false;
        }
        if (i2 != i) {
            int i4 = i2 - 1;
            int i5 = i / 32;
            int i6 = i4 / 32;
            for (int i7 = i5; i7 <= i6; i7++) {
                int i8 = 31;
                if (i7 > i5) {
                    i3 = 0;
                } else {
                    i3 = i & 31;
                }
                if (i7 >= i6) {
                    i8 = 31 & i4;
                }
                if ((((2 << i8) - (1 << i3)) & this.w[i7]) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void e() {
        int i;
        int[] iArr = new int[this.w.length];
        int i2 = this.x;
        int i3 = (i2 - 1) / 32;
        int i4 = i3 + 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                break;
            }
            long j = (long) this.w[i5];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i3 - i5] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
            i5++;
        }
        int i6 = i4 << 5;
        if (i2 != i6) {
            int i7 = i6 - i2;
            int i8 = iArr[0] >>> i7;
            for (i = 1; i < i4; i++) {
                int i9 = iArr[i];
                iArr[i - 1] = i8 | (i9 << (32 - i7));
                i8 = i9 >>> i7;
            }
            iArr[i3] = i8;
        }
        this.w = iArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i90)) {
            return false;
        }
        i90 i90 = (i90) obj;
        if (this.x != i90.x || !Arrays.equals(this.w, i90.w)) {
            return false;
        }
        return true;
    }

    public final void f(int i) {
        int[] iArr = this.w;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.w) + (this.x * 31);
    }

    public final String toString() {
        char c;
        int i = this.x;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < i; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            if (a(i2)) {
                c = 'X';
            } else {
                c = '.';
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
