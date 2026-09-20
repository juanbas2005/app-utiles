package defpackage;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* renamed from: rs0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rs0 extends m55 {
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '-', '.', ' ', '$', '/', '+', '%', 'a', 'b', 'c', 'd', '*'};
    public static final int[] d;
    public static final int e;
    public final StringBuilder a = new StringBuilder(20);
    public final int[] b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        d = iArr;
        e = iArr[47];
    }

    public static void g(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != c[i3 % 47]) {
            throw ChecksumException.a();
        }
    }

    public static int h(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((((float) iArr[i4]) * 9.0f) / ((float) i));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d2, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0144, code lost:
        r14.append(r4);
     */
    public final n66 b(int i, i90 i90, Map map) {
        char c2;
        int i2;
        int i3 = i90.x;
        int b2 = i90.b(0);
        int[] iArr = this.b;
        Arrays.fill(iArr, 0);
        int length = iArr.length;
        boolean z = false;
        int i4 = 0;
        int i5 = b2;
        while (b2 < i3) {
            if (i90.a(b2) != z) {
                iArr[i4] = iArr[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i4++;
                } else if (h(iArr) == e) {
                    int[] iArr2 = {i5, b2};
                    int b3 = i90.b(iArr2[1]);
                    Arrays.fill(iArr, 0);
                    StringBuilder sb = this.a;
                    sb.setLength(0);
                    while (true) {
                        m55.e(b3, i90, iArr);
                        int h = h(iArr);
                        if (h >= 0) {
                            int i6 = 0;
                            while (i6 < 48) {
                                if (d[i6] == h) {
                                    char c3 = c[i6];
                                    sb.append(c3);
                                    int i7 = b3;
                                    for (int i8 : iArr) {
                                        i7 += i8;
                                    }
                                    int b4 = i90.b(i7);
                                    if (c3 == '*') {
                                        sb.deleteCharAt(sb.length() - 1);
                                        int i9 = 0;
                                        for (int i10 : iArr) {
                                            i9 += i10;
                                        }
                                        if (b4 == i3 || !i90.a(b4)) {
                                            throw NotFoundException.y;
                                        } else if (sb.length() >= 2) {
                                            int length2 = sb.length();
                                            g(sb, length2 - 2, 20);
                                            g(sb, length2 - 1, 15);
                                            sb.setLength(sb.length() - 2);
                                            int length3 = sb.length();
                                            StringBuilder sb2 = new StringBuilder(length3);
                                            int i11 = 0;
                                            while (i11 < length3) {
                                                char charAt = sb.charAt(i11);
                                                if (charAt < 'a' || charAt > 'd') {
                                                    sb2.append(charAt);
                                                } else if (i11 < length3 - 1) {
                                                    i11++;
                                                    char charAt2 = sb.charAt(i11);
                                                    switch (charAt) {
                                                        case 'a':
                                                            if (charAt2 < 'A' || charAt2 > 'Z') {
                                                                throw FormatException.a();
                                                            }
                                                            i2 = charAt2 - '@';
                                                            break;
                                                        case 'b':
                                                            if (charAt2 >= 'A' && charAt2 <= 'E') {
                                                                i2 = charAt2 - '&';
                                                            } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                                                                i2 = charAt2 - 11;
                                                            } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                                                                i2 = charAt2 + 16;
                                                            } else if (charAt2 < 'P' || charAt2 > 'T') {
                                                                if (charAt2 != 'U') {
                                                                    if (charAt2 != 'V') {
                                                                        if (charAt2 != 'W') {
                                                                            if (charAt2 >= 'X' && charAt2 <= 'Z') {
                                                                                c2 = 127;
                                                                                break;
                                                                            } else {
                                                                                throw FormatException.a();
                                                                            }
                                                                        } else {
                                                                            c2 = '`';
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        c2 = '@';
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                i2 = charAt2 + '+';
                                                            }
                                                            break;
                                                        case 'c':
                                                            if (charAt2 >= 'A' && charAt2 <= 'O') {
                                                                i2 = charAt2 - ' ';
                                                            } else if (charAt2 == 'Z') {
                                                                c2 = ':';
                                                                break;
                                                            } else {
                                                                throw FormatException.a();
                                                            }
                                                        case 'd':
                                                            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                                                i2 = charAt2 + ' ';
                                                                c2 = (char) i2;
                                                                break;
                                                            } else {
                                                                throw FormatException.a();
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    throw FormatException.a();
                                                }
                                                i11++;
                                            }
                                            float f = (float) i;
                                            return new n66(sb2.toString(), (byte[]) null, new r66[]{new r66(((float) (iArr2[1] + iArr2[0])) / 2.0f, f), new r66((((float) i9) / 2.0f) + ((float) b3), f)}, d50.z);
                                        } else {
                                            throw NotFoundException.y;
                                        }
                                    } else {
                                        b3 = b4;
                                    }
                                } else {
                                    i6++;
                                }
                            }
                            throw NotFoundException.y;
                        }
                        throw NotFoundException.y;
                    }
                } else {
                    i5 += iArr[0] + iArr[1];
                    int i12 = i4 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i4] = 0;
                    i4--;
                }
                iArr[i4] = 1;
                z = !z;
            }
            b2++;
        }
        throw NotFoundException.y;
    }
}
