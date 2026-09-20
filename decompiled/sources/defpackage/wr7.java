package defpackage;

import com.google.zxing.NotFoundException;
import java.util.EnumMap;

/* renamed from: wr7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wr7 {
    public static final int[] c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    public final int[] a;
    public final StringBuilder b;

    public wr7(int i) {
        switch (i) {
            case 1:
                this.a = new int[4];
                this.b = new StringBuilder();
                return;
            default:
                this.a = new int[4];
                this.b = new StringBuilder();
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b7, code lost:
        if (r0.equals("99991") == false) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014c  */
    public n66 a(int i, i90 i90, int[] iArr) {
        EnumMap enumMap;
        String str;
        String str2;
        String str3;
        i90 i902 = i90;
        StringBuilder sb = this.b;
        sb.setLength(0);
        int[] iArr2 = this.a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        char c2 = 2;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i2 = i902.x;
        int i3 = iArr[1];
        int i4 = 0;
        for (int i5 = 0; i5 < 5 && i3 < i2; i5++) {
            int h = xr7.h(i902, iArr2, i3, xr7.g);
            sb.append((char) ((h % 10) + 48));
            for (int i6 : iArr2) {
                i3 += i6;
            }
            if (h >= 10) {
                i4 |= 1 << (4 - i5);
            }
            if (i5 != 4) {
                i3 = i902.c(i902.b(i3));
            }
        }
        if (sb.length() == 5) {
            for (int i7 = 0; i7 < 10; i7++) {
                if (i4 == c[i7]) {
                    String sb2 = sb.toString();
                    int length = sb2.length();
                    int i8 = 0;
                    for (int i9 = length - 2; i9 >= 0; i9 -= 2) {
                        i8 += sb2.charAt(i9) - '0';
                    }
                    int i10 = i8 * 3;
                    for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
                        i10 += sb2.charAt(i11) - '0';
                    }
                    if ((i10 * 3) % 10 == i7) {
                        String sb3 = sb.toString();
                        if (sb3.length() == 5) {
                            char charAt = sb3.charAt(0);
                            if (charAt == '0') {
                                str2 = "£";
                            } else if (charAt != '5') {
                                str2 = "";
                                if (charAt == '9') {
                                    switch (sb3.hashCode()) {
                                        case 54118329:
                                            if (sb3.equals("90000")) {
                                                c2 = 0;
                                                break;
                                            }
                                        case 54395376:
                                            if (sb3.equals("99990")) {
                                                c2 = 1;
                                                break;
                                            }
                                        case 54395377:
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    switch (c2) {
                                        case b85.b:
                                            str = null;
                                            break;
                                        case 1:
                                            str = "Used";
                                            break;
                                        case 2:
                                            str = "0.00";
                                            break;
                                    }
                                }
                            } else {
                                str2 = "$";
                            }
                            int parseInt = Integer.parseInt(sb3.substring(1));
                            String valueOf = String.valueOf(parseInt / 100);
                            int i12 = parseInt % 100;
                            if (i12 < 10) {
                                str3 = "0".concat(String.valueOf(i12));
                            } else {
                                str3 = String.valueOf(i12);
                            }
                            str = str2 + valueOf + '.' + str3;
                            if (str != null) {
                                enumMap = new EnumMap(q66.class);
                                enumMap.put(q66.A, str);
                                float f = (float) i;
                                n66 n66 = new n66(sb3, (byte[]) null, new r66[]{new r66(((float) (iArr[0] + iArr[1])) / 2.0f, f), new r66((float) i3, f)}, d50.M);
                                if (enumMap != null) {
                                    n66.a(enumMap);
                                }
                                return n66;
                            }
                        }
                        enumMap = null;
                        float f2 = (float) i;
                        n66 n662 = new n66(sb3, (byte[]) null, new r66[]{new r66(((float) (iArr[0] + iArr[1])) / 2.0f, f2), new r66((float) i3, f2)}, d50.M);
                        if (enumMap != null) {
                        }
                        return n662;
                    }
                    throw NotFoundException.y;
                }
                int i13 = i;
            }
            throw NotFoundException.y;
        }
        throw NotFoundException.y;
    }
}
