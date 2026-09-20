package defpackage;

import java.io.Serializable;

/* renamed from: p18  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p18 implements Comparable, Serializable {
    public static final p18 y = new p18(0, 0);
    public final long w;
    public final long x;

    public p18(long j, long j2) {
        this.w = j;
        this.x = j2;
    }

    public final int compareTo(Object obj) {
        p18 p18 = (p18) obj;
        p18.getClass();
        long j = p18.w;
        long j2 = this.w;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.x ^ Long.MIN_VALUE, p18.x ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p18)) {
            return false;
        }
        p18 p18 = (p18) obj;
        if (this.w == p18.w && this.x == p18.x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.w ^ this.x);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        f55.h(this.w, bArr, 0, 0, 4);
        bArr[8] = 45;
        f55.h(this.w, bArr, 9, 4, 6);
        bArr[13] = 45;
        f55.h(this.w, bArr, 14, 6, 8);
        bArr[18] = 45;
        f55.h(this.x, bArr, 19, 0, 2);
        bArr[23] = 45;
        f55.h(this.x, bArr, 24, 2, 8);
        return k57.k0(bArr);
    }
}
