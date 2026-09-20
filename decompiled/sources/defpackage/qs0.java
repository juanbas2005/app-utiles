package defpackage;

import com.google.zxing.ChecksumException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* renamed from: qs0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qs0 extends m55 {
    public static final int[] d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};
    public final boolean a;
    public final StringBuilder b = new StringBuilder(20);
    public final int[] c = new int[9];

    public qs0(boolean z) {
        this.a = z;
    }

    public static int g(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r20v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final n66 b(int i, i90 i90, Map map) {
        int i2;
        char c2;
        i90 i902 = i90;
        int[] iArr = this.c;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.b;
        sb.setLength(0);
        int i3 = i902.x;
        int b2 = i902.b(0);
        int length = iArr.length;
        boolean z = false;
        int i4 = 0;
        int i5 = b2;
        while (b2 < i3) {
            boolean z2 = true;
            if (i902.a(b2) != z) {
                iArr[i4] = iArr[i4] + 1;
                int i6 = i;
            } else {
                if (i4 != length - 1) {
                    int i7 = i;
                    i2 = 1;
                    i4++;
                } else if (g(iArr) != 148 || !i902.d(Math.max(0, i5 - ((b2 - i5) / 2)), i5)) {
                    int i8 = i;
                    i2 = 1;
                    i5 += iArr[0] + iArr[1];
                    int i9 = i4 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i9);
                    iArr[i9] = 0;
                    iArr[i4] = 0;
                    i4--;
                } else {
                    int[] iArr2 = {i5, b2};
                    int b3 = i902.b(iArr2[1]);
                    while (true) {
                        m55.e(b3, i902, iArr);
                        int g = g(iArr);
                        if (g >= 0) {
                            int i10 = 0;
                            while (true) {
                                if (i10 < 43) {
                                    if (d[i10] == g) {
                                        c2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i10);
                                        break;
                                    }
                                    i10++;
                                } else if (g == 148) {
                                    c2 = '*';
                                } else {
                                    throw NotFoundException.y;
                                }
                            }
                            sb.append(c2);
                            ? r20 = z2;
                            int i11 = b3;
                            for (int i12 : iArr) {
                                i11 += i12;
                            }
                            int b4 = i902.b(i11);
                            if (c2 == '*') {
                                sb.setLength(sb.length() - 1);
                                int i13 = 0;
                                for (int i14 : iArr) {
                                    i13 += i14;
                                }
                                int i15 = (b4 - b3) - i13;
                                if (b4 == i3 || (i15 << 1) >= i13) {
                                    if (this.a) {
                                        int length2 = sb.length() - 1;
                                        int i16 = 0;
                                        for (int i17 = 0; i17 < length2; i17++) {
                                            i16 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(sb.charAt(i17));
                                        }
                                        if (sb.charAt(length2) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i16 % 43)) {
                                            sb.setLength(length2);
                                        } else {
                                            throw ChecksumException.a();
                                        }
                                    }
                                    if (sb.length() != 0) {
                                        float f = (float) i;
                                        return new n66(sb.toString(), (byte[]) null, new r66[]{new r66(((float) (iArr2[r20] + iArr2[0])) / 2.0f, f), new r66((((float) i13) / 2.0f) + ((float) b3), f)}, d50.y);
                                    }
                                    throw NotFoundException.y;
                                }
                                throw NotFoundException.y;
                            }
                            int i18 = i;
                            z2 = r20;
                            b3 = b4;
                        } else {
                            throw NotFoundException.y;
                        }
                    }
                }
                iArr[i4] = i2;
                z = !z;
            }
            b2++;
        }
        throw NotFoundException.y;
    }
}
