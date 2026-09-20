package defpackage;

import java.io.Serializable;

/* renamed from: qd3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qd3 implements Comparable, Serializable {
    public static final qd3 y = new qd3(-31557014167219200L, 0);
    public static final qd3 z = new qd3(31556889864403199L, 999999999);
    public final long w;
    public final int x;

    public qd3(long j, int i) {
        this.w = j;
        this.x = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            h.q("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    /* renamed from: a */
    public final int compareTo(qd3 qd3) {
        qd3.getClass();
        int l = sg3.l(this.w, qd3.w);
        if (l != 0) {
            return l;
        }
        return sg3.k(this.x, qd3.x);
    }

    public final qd3 b(long j) {
        xb4 xb4 = u02.x;
        long j2 = u02.j(j, y02.SECONDS);
        int f = u02.f(j);
        if (j2 == 0 && f == 0) {
            return this;
        }
        long j3 = this.w;
        long j4 = j3 + j2;
        if ((j3 ^ j4) >= 0 || (j2 ^ j3) < 0) {
            return tz2.i(j4, (long) (this.x + f));
        }
        if (j > 0) {
            return z;
        }
        return y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd3)) {
            return false;
        }
        qd3 qd3 = (qd3) obj;
        if (this.w == qd3.w && this.x == qd3.x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.x * 51) + Long.hashCode(this.w);
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.w;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j7 + j + ((long) (i3 / 10)));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append(sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        tf4.t(sb, sb, i4);
        sb.append('-');
        tf4.t(sb, sb, i5);
        sb.append('T');
        tf4.t(sb, sb, i7);
        sb.append(':');
        tf4.t(sb, sb, i9);
        sb.append(':');
        tf4.t(sb, sb, i10);
        int i12 = this.x;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = tf4.c;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            String valueOf = String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]);
            valueOf.getClass();
            sb.append(valueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
