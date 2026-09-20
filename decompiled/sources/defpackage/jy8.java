package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: jy8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jy8 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    public jy8(String str, char[] cArr, byte[] bArr, boolean z) {
        int i;
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (sy8.a[roundingMode.ordinal()]) {
                    case 1:
                        if (((length - 1) & length) != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                        break;
                    case 2:
                    case 3:
                        break;
                    case 4:
                    case 5:
                        i = 32 - Integer.numberOfLeadingZeros(length - 1);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length);
                        i = (31 - numberOfLeadingZeros) + (((-1257966797 >>> numberOfLeadingZeros) - length) >>> 31);
                        break;
                    default:
                        throw new AssertionError();
                }
                i = 31 - Integer.numberOfLeadingZeros(length);
                this.d = i;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
                int i2 = 1 << (3 - numberOfTrailingZeros);
                this.e = i2;
                this.f = i >> numberOfTrailingZeros;
                this.c = length - 1;
                this.g = bArr;
                boolean[] zArr = new boolean[i2];
                for (int i3 = 0; i3 < this.f; i3++) {
                    int i4 = this.d;
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    zArr[w95.m(i3 * 8, i4)] = true;
                }
                this.h = z;
                return;
            }
            throw new IllegalArgumentException("x (0) must be > 0");
        } catch (ArithmeticException e2) {
            throw new IllegalArgumentException(hl6.k(cArr.length, "Illegal alphabet length "), e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jy8)) {
            return false;
        }
        jy8 jy8 = (jy8) obj;
        if (this.h != jy8.h || !Arrays.equals(this.b, jy8.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.b);
        if (true != this.h) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode + i;
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public jy8(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        while (i < cArr.length) {
            char c2 = cArr[i];
            boolean z = true;
            if (c2 < 128) {
                if (bArr[c2] != -1 ? false : z) {
                    bArr[c2] = (byte) i;
                    i++;
                } else {
                    h.q(h75.J("Duplicate character: %s", Character.valueOf(c2)));
                    throw null;
                }
            } else {
                h.q(h75.J("Non-ASCII character: %s", Character.valueOf(c2)));
                throw null;
            }
        }
    }
}
