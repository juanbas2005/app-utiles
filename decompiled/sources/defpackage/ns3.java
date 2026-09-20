package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: ns3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ns3 {
    public final byte[] a;

    public ns3(byte[] bArr) {
        this.a = Arrays.copyOf(bArr, bArr.length);
    }

    public static int a(char[] cArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            char c = cArr[i3 + i];
            i2 |= ((((((((('@' - c) & (c - '[')) >>> 8) & (c - '@')) - 1) + (((('`' - c) & (c - '{')) >>> 8) & (c - 'F'))) + (((('/' - c) & (c - ':')) >>> 8) & (c + 5))) + (((('*' - c) & (c - ',')) >>> 8) & 63)) + ((((c - '0') & ('.' - c)) >>> 8) & 64)) << (18 - (i3 * 6));
        }
        return i2;
    }

    public static void b(byte[] bArr, int i, char[] cArr, int i2) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte[] bArr2 = {(byte) ((b >>> 2) & 63), (byte) (((b << 4) | ((b2 & 255) >>> 4)) & 63), (byte) ((((b3 & 255) >>> 6) | (b2 << 2)) & 63), (byte) (b3 & 63)};
        for (int i3 = 0; i3 < 4; i3++) {
            byte b4 = bArr2[i3];
            cArr[i3 + i2] = (char) (((((b4 + 65) + (((25 - b4) >>> 8) & 6)) - (((51 - b4) >>> 8) & 75)) - (((61 - b4) >>> 8) & 15)) + (((62 - b4) >>> 8) & 3));
        }
    }

    public static ns3 c(String str) {
        char[] charArray = str.toCharArray();
        if (charArray.length == 44 && charArray[43] == '=') {
            byte[] bArr = new byte[32];
            int i = 0;
            int i2 = 0;
            while (i < 10) {
                int a2 = a(charArray, i * 4);
                i2 |= a2 >>> 31;
                int i3 = i * 3;
                bArr[i3] = (byte) ((a2 >>> 16) & 255);
                bArr[i3 + 1] = (byte) ((a2 >>> 8) & 255);
                bArr[i3 + 2] = (byte) (a2 & 255);
                i++;
            }
            int i4 = i * 4;
            int a3 = a(new char[]{charArray[i4], charArray[i4 + 1], charArray[i4 + 2], 'A'}, 0);
            int i5 = (a3 >>> 31) | (a3 & 255) | i2;
            int i6 = i * 3;
            bArr[i6] = (byte) ((a3 >>> 16) & 255);
            bArr[i6 + 1] = (byte) ((a3 >>> 8) & 255);
            if (i5 == 0) {
                return new ns3(bArr);
            }
            throw new Exception();
        }
        throw new Exception();
    }

    public final String d() {
        char[] cArr = new char[44];
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i < bArr.length / 3) {
                b(bArr, i * 3, cArr, i * 4);
                i++;
            } else {
                int i2 = i * 3;
                b(new byte[]{bArr[i2], bArr[i2 + 1], 0}, 0, cArr, i * 4);
                cArr[43] = '=';
                return new String(cArr);
            }
        }
    }

    public final String e() {
        char[] cArr = new char[64];
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return new String(cArr);
            }
            int i2 = i * 2;
            byte b = bArr[i];
            cArr[i2] = (char) (((b >> 4) & 15) + 87 + (((((b >> 4) & 15) - 10) >> 8) & -39));
            cArr[i2 + 1] = (char) ((b & 15) + 87 + ((((b & 15) - 10) >> 8) & -39));
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != ns3.class) {
            return false;
        }
        return MessageDigest.isEqual(this.a, ((ns3) obj).a);
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length / 4) {
                return i2;
            }
            int i3 = i * 4;
            i2 ^= ((bArr[i3] + (bArr[i3 + 1] >> 8)) + (bArr[i3 + 2] >> 16)) + (bArr[i3 + 3] >> 24);
            i++;
        }
    }
}
