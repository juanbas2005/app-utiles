package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* renamed from: z73  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z73 extends m55 {
    public static final int[] b = {6, 8, 10, 12, 14};
    public static final int[] c = {1, 1, 1, 1};
    public static final int[][] d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    public static final int[][] e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    public int a = -1;

    public static int g(int[] iArr) {
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < 20; i2++) {
            float d2 = m55.d(iArr, e[i2], 0.5f);
            if (d2 < f) {
                i = i2;
                f = d2;
            } else if (d2 == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw NotFoundException.y;
    }

    public static int[] h(int i, i90 i90, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i2 = i90.x;
        int i3 = i;
        boolean z = false;
        int i4 = 0;
        while (i < i2) {
            if (i90.a(i) != z) {
                iArr2[i4] = iArr2[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i4++;
                } else if (m55.d(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i3, i};
                } else {
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = i4 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i4--;
                }
                iArr2[i4] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.y;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r7 = h(r8, r1, r7[1]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0037 */
    public final n66 b(int i, i90 i90, Map map) {
        int[] iArr;
        boolean z;
        i90 i902 = i90;
        Map map2 = map;
        int i2 = i902.x;
        int b2 = i902.b(0);
        if (b2 != i2) {
            int[] h = h(b2, i902, c);
            int i3 = h[1];
            int i4 = h[0];
            this.a = (i3 - i4) / 4;
            i(i902, i4);
            int[][] iArr2 = d;
            i902.e();
            try {
                int b3 = i902.b(0);
                if (b3 != i2) {
                    int[] iArr3 = h(b3, i902, iArr2[0]);
                    i(i902, iArr3[0]);
                    int i5 = iArr3[0];
                    iArr3[0] = i2 - iArr3[1];
                    iArr3[1] = i2 - i5;
                    i902.e();
                    StringBuilder sb = new StringBuilder(20);
                    int i6 = h[1];
                    int i7 = iArr3[0];
                    int[] iArr4 = new int[10];
                    int[] iArr5 = new int[5];
                    int[] iArr6 = new int[5];
                    while (i6 < i7) {
                        m55.e(i6, i902, iArr4);
                        for (int i8 = 0; i8 < 5; i8++) {
                            int i9 = i8 * 2;
                            iArr5[i8] = iArr4[i9];
                            iArr6[i8] = iArr4[i9 + 1];
                        }
                        sb.append((char) (g(iArr5) + 48));
                        sb.append((char) (g(iArr6) + 48));
                        for (int i10 = 0; i10 < 10; i10++) {
                            i6 += iArr4[i10];
                        }
                    }
                    String sb2 = sb.toString();
                    if (map2 != null) {
                        iArr = (int[]) map2.get(fk1.B);
                    } else {
                        iArr = null;
                    }
                    if (iArr == null) {
                        iArr = b;
                    }
                    int length = sb2.length();
                    int length2 = iArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            z = false;
                            break;
                        }
                        int i13 = iArr[i11];
                        if (length == i13) {
                            z = true;
                            break;
                        }
                        if (i13 > i12) {
                            i12 = i13;
                        }
                        i11++;
                    }
                    if (!z && length > i12) {
                        z = true;
                    }
                    if (z) {
                        float f = (float) i;
                        return new n66(sb2, (byte[]) null, new r66[]{new r66((float) h[1], f), new r66((float) iArr3[0], f)}, d50.E);
                    }
                    throw FormatException.a();
                }
                throw NotFoundException.y;
            } catch (Throwable th) {
                i902.e();
                throw th;
            }
        } else {
            throw NotFoundException.y;
        }
    }

    public final void i(i90 i90, int i) {
        int min = Math.min(this.a * 10, i);
        int i2 = i - 1;
        while (min > 0 && i2 >= 0 && !i90.a(i2)) {
            min--;
            i2--;
        }
        if (min != 0) {
            throw NotFoundException.y;
        }
    }
}
