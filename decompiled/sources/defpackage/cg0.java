package defpackage;

import java.util.Arrays;

/* renamed from: cg0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cg0 implements Comparable {
    public static final cg0 y = new cg0(new byte[0]);
    public static final char[] z = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final byte[] w;
    public int x;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public cg0(byte[] bArr, int i, int i2) {
        this(qs.P0(bArr, i, i2));
        bArr.getClass();
    }

    public final byte a(int i) {
        byte[] bArr = this.w;
        if (i >= 0 && i < bArr.length) {
            return bArr[i];
        }
        h.l(f21.j(pb4.o(i, "index (", ") is out of byte string bounds: [0.."), bArr.length, ')'));
        return 0;
    }

    public final int compareTo(Object obj) {
        cg0 cg0 = (cg0) obj;
        cg0.getClass();
        byte[] bArr = cg0.w;
        if (cg0 == this) {
            return 0;
        }
        byte[] bArr2 = this.w;
        int min = Math.min(bArr2.length, bArr.length);
        for (int i = 0; i < min; i++) {
            int k = sg3.k(bArr2[i] & 255, bArr[i] & 255);
            if (k != 0) {
                return k;
            }
        }
        return sg3.k(bArr2.length, bArr.length);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || cg0.class != obj.getClass()) {
            return false;
        }
        cg0 cg0 = (cg0) obj;
        byte[] bArr = cg0.w;
        int length = bArr.length;
        byte[] bArr2 = this.w;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = cg0.x;
        if (i2 == 0 || (i = this.x) == 0 || i2 == i) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.x;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.w);
        this.x = hashCode;
        return hashCode;
    }

    public final String toString() {
        byte[] bArr = this.w;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String valueOf = String.valueOf(bArr.length);
        StringBuilder sb = new StringBuilder((bArr.length * 2) + valueOf.length() + 22);
        sb.append("ByteString(size=");
        sb.append(valueOf);
        sb.append(" hex=");
        for (byte b : bArr) {
            char[] cArr = z;
            sb.append(cArr[(b >>> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        sb.append(')');
        return sb.toString();
    }

    public cg0(byte[] bArr) {
        this.w = bArr;
    }
}
