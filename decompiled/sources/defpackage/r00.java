package defpackage;

import java.util.Arrays;

/* renamed from: r00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r00 extends b92 {
    public final byte[] a;
    public final byte[] b;

    public r00(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b92) {
            b92 b92 = (b92) obj;
            boolean z = b92 instanceof r00;
            r00 r00 = (r00) b92;
            if (z) {
                bArr = r00.a;
            } else {
                bArr = r00.a;
            }
            if (Arrays.equals(this.a, bArr)) {
                r00 r002 = (r00) b92;
                if (z) {
                    bArr2 = r002.b;
                } else {
                    bArr2 = r002.b;
                }
                if (Arrays.equals(this.b, bArr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((Arrays.hashCode(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
