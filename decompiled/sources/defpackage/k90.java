package defpackage;

import java.util.Arrays;

/* renamed from: k90  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k90 implements Cloneable {
    public final int w;
    public final int x;
    public final int y;
    public final int[] z;

    public k90(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            h.q("Both dimensions must be greater than 0");
            throw null;
        }
        this.w = i;
        this.x = i2;
        int i3 = (i + 31) / 32;
        this.y = i3;
        this.z = new int[(i3 * i2)];
    }

    public final void a(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.y);
        int[] iArr = this.z;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public final boolean b(int i, int i2) {
        int i3 = i2 * this.y;
        if (((this.z[(i / 32) + i3] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int[] c() {
        int[] iArr = this.z;
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.y;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = iArr[length];
        int i5 = 31;
        while ((i4 >>> i5) == 0) {
            i5--;
        }
        return new int[]{i3 + i5, i2};
    }

    public final Object clone() {
        return new k90(this.w, this.x, this.y, (int[]) this.z.clone());
    }

    public final i90 d(i90 i90, int i) {
        int i2 = i90.x;
        int i3 = this.w;
        if (i2 < i3) {
            i90 = new i90(i3);
        } else {
            int length = i90.w.length;
            for (int i4 = 0; i4 < length; i4++) {
                i90.w[i4] = 0;
            }
        }
        int i5 = this.y;
        int i6 = i * i5;
        for (int i7 = 0; i7 < i5; i7++) {
            i90.w[(i7 << 5) / 32] = this.z[i6 + i7];
        }
        return i90;
    }

    public final int[] e() {
        int[] iArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.z;
            if (i2 < iArr.length && iArr[i2] == 0) {
                i2++;
            }
        }
        if (i2 == iArr.length) {
            return null;
        }
        int i3 = this.y;
        int i4 = i2 / i3;
        int i5 = (i2 % i3) << 5;
        while ((iArr[i2] << (31 - i)) == 0) {
            i++;
        }
        return new int[]{i5 + i, i4};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k90)) {
            return false;
        }
        k90 k90 = (k90) obj;
        if (this.w == k90.w && this.x == k90.x && this.y == k90.y && Arrays.equals(this.z, k90.z)) {
            return true;
        }
        return false;
    }

    public final void f(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.y);
        int[] iArr = this.z;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public final void g(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            h.q("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            h.q("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.x || i5 > this.w) {
                h.q("The region must fit inside the matrix");
                return;
            }
            while (i2 < i6) {
                int i7 = this.y * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int i9 = (i8 / 32) + i7;
                    int[] iArr = this.z;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public final int hashCode() {
        int i = this.w;
        return Arrays.hashCode(this.z) + (((((((i * 31) + i) * 31) + this.x) * 31) + this.y) * 31);
    }

    public final String toString() {
        String str;
        int i = this.w;
        int i2 = this.x;
        StringBuilder sb = new StringBuilder((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                if (b(i4, i3)) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb.append(str);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public k90(int i, int i2, int i3, int[] iArr) {
        this.w = i;
        this.x = i2;
        this.y = i3;
        this.z = iArr;
    }
}
