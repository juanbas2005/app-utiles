package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: r50  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r50 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;

    public r50(String str, char[] cArr) {
        String str2;
        boolean z;
        boolean z2;
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int C = kl8.C(length);
            this.d = C;
            int min = Math.min(8, Integer.lowestOneBit(C));
            try {
                this.e = 8 / min;
                this.f = C / min;
                this.c = cArr.length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                int i = 0;
                while (i < cArr.length) {
                    char c2 = cArr[i];
                    if (c2 < 128) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (bArr[c2] == -1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            bArr[c2] = (byte) i;
                            i++;
                        } else {
                            h.q(u55.o("Duplicate character: %s", Character.valueOf(c2)));
                            throw null;
                        }
                    } else {
                        h.q(u55.o("Non-ASCII character: %s", Character.valueOf(c2)));
                        throw null;
                    }
                }
                this.g = bArr;
                boolean[] zArr = new boolean[this.e];
                for (int i2 = 0; i2 < this.f; i2++) {
                    int i3 = this.d;
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    zArr[kl8.l(i2 * 8, i3)] = true;
                }
            } catch (ArithmeticException e2) {
                String str3 = new String(cArr);
                if (str3.length() != 0) {
                    str2 = "Illegal alphabet ".concat(str3);
                } else {
                    str2 = new String("Illegal alphabet ");
                }
                throw new IllegalArgumentException(str2, e2);
            }
        } catch (ArithmeticException e3) {
            int length2 = cArr.length;
            StringBuilder sb = new StringBuilder(35);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString(), e3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r50) {
            return Arrays.equals(this.b, ((r50) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return this.a;
    }
}
