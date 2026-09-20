package defpackage;

import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* renamed from: os0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class os0 extends m55 {
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '$', ':', '/', '.', '+', 'A', 'B', 'C', 'D'};
    public static final int[] e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    public static final char[] f = {'A', 'B', 'C', 'D'};
    public final StringBuilder a = new StringBuilder(20);
    public int[] b = new int[80];
    public int c = 0;

    public static boolean g(char[] cArr, char c2) {
        for (char c3 : cArr) {
            if (c3 == c2) {
                return true;
            }
        }
        return false;
    }

    public final n66 b(int i, i90 i90, Map map) {
        int i2;
        int[] iArr;
        int i3;
        i90 i902 = i90;
        Map map2 = map;
        Arrays.fill(this.b, 0);
        this.c = 0;
        int c2 = i902.c(0);
        int i4 = i902.x;
        if (c2 < i4) {
            int i5 = 1;
            int i6 = 0;
            boolean z = true;
            while (c2 < i4) {
                if (i902.a(c2) != z) {
                    i6++;
                } else {
                    int[] iArr2 = this.b;
                    int i7 = this.c;
                    iArr2[i7] = i6;
                    int i8 = i7 + 1;
                    this.c = i8;
                    if (i8 >= iArr2.length) {
                        int[] iArr3 = new int[(i8 << 1)];
                        System.arraycopy(iArr2, 0, iArr3, 0, i8);
                        this.b = iArr3;
                    }
                    z = !z;
                    i6 = 1;
                }
                c2++;
            }
            int[] iArr4 = this.b;
            int i9 = this.c;
            iArr4[i9] = i6;
            int i10 = i9 + 1;
            this.c = i10;
            if (i10 >= iArr4.length) {
                int[] iArr5 = new int[(i10 << 1)];
                System.arraycopy(iArr4, 0, iArr5, 0, i10);
                this.b = iArr5;
            }
            int i11 = 1;
            while (i11 < this.c) {
                int h = h(i11);
                if (h != -1) {
                    char[] cArr = d;
                    char c3 = cArr[h];
                    char[] cArr2 = f;
                    if (g(cArr2, c3)) {
                        int i12 = 0;
                        for (int i13 = i11; i13 < i11 + 7; i13++) {
                            i12 += this.b[i13];
                        }
                        if (i11 == i5 || this.b[i11 - 1] >= i12 / 2) {
                            StringBuilder sb = this.a;
                            sb.setLength(0);
                            int i14 = i11;
                            while (true) {
                                int h2 = h(i14);
                                if (h2 != -1) {
                                    sb.append((char) h2);
                                    i2 = i14 + 8;
                                    if ((sb.length() <= i5 || !g(cArr2, cArr[h2])) && i2 < this.c) {
                                        int i15 = i5;
                                        int i16 = i;
                                        i14 = i2;
                                        i5 = i15;
                                    }
                                } else {
                                    throw NotFoundException.y;
                                }
                            }
                            int i17 = i14 + 7;
                            int i18 = this.b[i17];
                            int i19 = 0;
                            for (int i20 = -8; i20 < -1; i20++) {
                                i19 += this.b[i2 + i20];
                            }
                            if (i2 >= this.c || i18 >= i19 / 2) {
                                int[] iArr6 = new int[4];
                                iArr6[0] = 0;
                                iArr6[i5] = 0;
                                iArr6[2] = 0;
                                iArr6[3] = 0;
                                int[] iArr7 = new int[4];
                                iArr7[0] = 0;
                                iArr7[i5] = 0;
                                iArr7[2] = 0;
                                iArr7[3] = 0;
                                int length = sb.length() - i5;
                                int i21 = i11;
                                int i22 = 0;
                                while (true) {
                                    char charAt = sb.charAt(i22);
                                    iArr = e;
                                    int i23 = iArr[charAt];
                                    int i24 = 6;
                                    while (i24 >= 0) {
                                        int i25 = (i24 & 1) + ((i23 & 1) << 1);
                                        iArr6[i25] = iArr6[i25] + this.b[i21 + i24];
                                        iArr7[i25] = iArr7[i25] + 1;
                                        i23 >>= 1;
                                        i24--;
                                        i5 = i5;
                                    }
                                    int i26 = i5;
                                    if (i22 >= length) {
                                        break;
                                    }
                                    i21 += 8;
                                    i22++;
                                    i5 = i26;
                                }
                                float[] fArr = new float[4];
                                float[] fArr2 = new float[4];
                                int i27 = 0;
                                for (int i28 = 2; i27 < i28; i28 = 2) {
                                    fArr2[i27] = 0.0f;
                                    int i29 = i27 + 2;
                                    float f2 = ((float) iArr6[i27]) / ((float) iArr7[i27]);
                                    float f3 = (float) iArr6[i29];
                                    float f4 = (float) iArr7[i29];
                                    float f5 = ((f3 / f4) + f2) / 2.0f;
                                    fArr2[i29] = f5;
                                    fArr[i27] = f5;
                                    fArr[i29] = ((f3 * 2.0f) + 1.5f) / f4;
                                    i27++;
                                }
                                int i30 = i11;
                                int i31 = 0;
                                loop8:
                                while (true) {
                                    int i32 = iArr[sb.charAt(i31)];
                                    int i33 = 6;
                                    while (i33 >= 0) {
                                        int i34 = (i33 & 1) + ((i32 & 1) << 1);
                                        float f6 = (float) this.b[i30 + i33];
                                        if (f6 >= fArr2[i34] && f6 <= fArr[i34]) {
                                            i32 >>= 1;
                                            i33--;
                                        }
                                    }
                                    if (i31 < length) {
                                        i30 += 8;
                                        i31++;
                                    } else {
                                        for (int i35 = 0; i35 < sb.length(); i35++) {
                                            sb.setCharAt(i35, cArr[sb.charAt(i35)]);
                                        }
                                        if (!g(cArr2, sb.charAt(0))) {
                                            throw NotFoundException.y;
                                        } else if (!g(cArr2, sb.charAt(sb.length() - 1))) {
                                            throw NotFoundException.y;
                                        } else if (sb.length() > 3) {
                                            if (map2 == null || !map2.containsKey(fk1.E)) {
                                                sb.deleteCharAt(sb.length() - 1);
                                                i3 = 0;
                                                sb.deleteCharAt(0);
                                            } else {
                                                i3 = 0;
                                            }
                                            int i36 = i3;
                                            while (i3 < i11) {
                                                i36 += this.b[i3];
                                                i3++;
                                            }
                                            float f7 = (float) i36;
                                            while (i11 < i17) {
                                                i36 += this.b[i11];
                                                i11++;
                                            }
                                            float f8 = (float) i;
                                            return new n66(sb.toString(), (byte[]) null, new r66[]{new r66(f7, f8), new r66((float) i36, f8)}, d50.x);
                                        } else {
                                            throw NotFoundException.y;
                                        }
                                    }
                                }
                                throw NotFoundException.y;
                            }
                            throw NotFoundException.y;
                        }
                    }
                }
                int i37 = i5;
                int i38 = i;
                i11 += 2;
                i5 = i37;
            }
            throw NotFoundException.y;
        }
        throw NotFoundException.y;
    }

    public final int h(int i) {
        int i2;
        int i3 = i + 7;
        if (i3 >= this.c) {
            return -1;
        }
        int[] iArr = this.b;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        for (int i7 = i; i7 < i3; i7 += 2) {
            int i8 = iArr[i7];
            if (i8 < i5) {
                i5 = i8;
            }
            if (i8 > i6) {
                i6 = i8;
            }
        }
        int i9 = (i5 + i6) / 2;
        int i10 = 0;
        for (int i11 = i + 1; i11 < i3; i11 += 2) {
            int i12 = iArr[i11];
            if (i12 < i4) {
                i4 = i12;
            }
            if (i12 > i10) {
                i10 = i12;
            }
        }
        int i13 = (i4 + i10) / 2;
        int i14 = 128;
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            if ((i16 & 1) == 0) {
                i2 = i9;
            } else {
                i2 = i13;
            }
            i14 >>= 1;
            if (iArr[i + i16] > i2) {
                i15 |= i14;
            }
        }
        for (int i17 = 0; i17 < 20; i17++) {
            if (e[i17] == i15) {
                return i17;
            }
        }
        return -1;
    }
}
