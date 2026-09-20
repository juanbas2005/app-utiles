package defpackage;

/* renamed from: j90  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class j90 {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    public static byte[] a(String[] strArr) {
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                strArr2[0] = strArr2[0].substring(1);
                int i = 0;
                for (String length : strArr2) {
                    i += length.length();
                }
                byte[] bArr = new byte[i];
                int i2 = 0;
                for (String str : strArr2) {
                    int length2 = str.length();
                    int i3 = 0;
                    while (i3 < length2) {
                        bArr[i2] = (byte) str.charAt(i3);
                        i3++;
                        i2++;
                    }
                }
                return bArr;
            } else if (charAt == 65535) {
                strArr = (String[]) strArr.clone();
                strArr[0] = strArr[0].substring(1);
            }
        }
        int i4 = 0;
        for (String length3 : strArr) {
            i4 += length3.length();
        }
        byte[] bArr2 = new byte[i4];
        int i5 = 0;
        for (String str2 : strArr) {
            int length4 = str2.length();
            int i6 = 0;
            while (i6 < length4) {
                bArr2[i5] = (byte) str2.charAt(i6);
                i6++;
                i5++;
            }
        }
        for (int i7 = 0; i7 < i4; i7++) {
            bArr2[i7] = (byte) ((bArr2[i7] + Byte.MAX_VALUE) & 127);
        }
        int i8 = (i4 * 7) / 8;
        byte[] bArr3 = new byte[i8];
        int i9 = 0;
        byte b = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = i9 + 1;
            int i12 = b + 1;
            bArr3[i10] = (byte) (((bArr2[i9] & 255) >>> b) + ((bArr2[i11] & ((1 << i12) - 1)) << (7 - b)));
            if (b == 6) {
                i9 += 2;
                b = 0;
            } else {
                i9 = i11;
                b = i12;
            }
        }
        return bArr3;
    }
}
