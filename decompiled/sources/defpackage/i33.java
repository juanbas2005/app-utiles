package defpackage;

/* renamed from: i33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class i33 {
    public static final dg0 a = td0.u("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] c = new String[64];
    public static final String[] d;

    static {
        dg0 dg0 = dg0.z;
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String replace = fg8.d("%8s", binaryString).replace(' ', '0');
            replace.getClass();
            strArr[i] = replace;
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = f21.l(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = f21.l(sb, strArr3[i4], "|PADDED");
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    public static String a(int i) {
        String[] strArr = b;
        if (i < strArr.length) {
            return strArr[i];
        }
        return fg8.d("0x%02x", Integer.valueOf(i));
    }

    public static String b(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String str3;
        String a2 = a(i3);
        if (i4 == 0) {
            str = "";
        } else {
            String[] strArr = d;
            if (!(i3 == 2 || i3 == 3)) {
                if (i3 == 4 || i3 == 6) {
                    if (i4 == 1) {
                        str = "ACK";
                    } else {
                        str = strArr[i4];
                    }
                } else if (!(i3 == 7 || i3 == 8)) {
                    String[] strArr2 = c;
                    if (i4 < strArr2.length) {
                        str3 = strArr2[i4];
                        str3.getClass();
                    } else {
                        str3 = strArr[i4];
                    }
                    if (i3 == 5 && (i4 & 4) != 0) {
                        str = k57.s0(str3, "HEADERS", "PUSH_PROMISE");
                    } else if (i3 != 0 || (i4 & 32) == 0) {
                        str = str3;
                    } else {
                        str = k57.s0(str3, "PRIORITY", "COMPRESSED");
                    }
                }
            }
            str = strArr[i4];
        }
        if (z) {
            str2 = "<<";
        } else {
            str2 = ">>";
        }
        return fg8.d("%s 0x%08x %5d %-13s %s", str2, Integer.valueOf(i), Integer.valueOf(i2), a2, str);
    }

    public static String c(boolean z, int i, int i2, long j) {
        String str;
        String a2 = a(8);
        if (z) {
            str = "<<";
        } else {
            str = ">>";
        }
        return fg8.d("%s 0x%08x %5d %-13s %d", str, Integer.valueOf(i), Integer.valueOf(i2), a2, Long.valueOf(j));
    }
}
