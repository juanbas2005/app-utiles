package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* renamed from: g12  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g12 extends xr7 {
    public static final int[] j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    public static final int[] k = {1, 1, 1, 1, 1, 1};
    public static final int[][] l = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    public final /* synthetic */ int h;
    public final Object i;

    public g12(int i2) {
        this.h = i2;
        switch (i2) {
            case 1:
                this.i = new int[4];
                return;
            case 2:
                this.i = new int[4];
                return;
            case 3:
                this.i = new g12(0);
                return;
            default:
                this.i = new int[4];
                return;
        }
    }

    public static n66 o(n66 n66) {
        String str = n66.a;
        if (str.charAt(0) == '0') {
            n66 n662 = new n66(str.substring(1), (byte[]) null, n66.c, d50.K);
            Map map = n66.e;
            if (map != null) {
                n662.a(map);
            }
            return n662;
        }
        throw FormatException.a();
    }

    public n66 a(qc3 qc3, Map map) {
        switch (this.h) {
            case 3:
                return o(((g12) this.i).a(qc3, map));
            default:
                return super.a(qc3, map);
        }
    }

    public n66 b(int i2, i90 i90, Map map) {
        switch (this.h) {
            case 3:
                return o(((g12) this.i).b(i2, i90, map));
            default:
                return super.b(i2, i90, map);
        }
    }

    public boolean g(String str) {
        switch (this.h) {
            case 1:
                char[] cArr = new char[6];
                str.getChars(1, 7, cArr, 0);
                StringBuilder sb = new StringBuilder(12);
                sb.append(str.charAt(0));
                char c = cArr[5];
                switch (c) {
                    case h75.h /*48*/:
                    case '1':
                    case '2':
                        sb.append(cArr, 0, 2);
                        sb.append(c);
                        sb.append("0000");
                        sb.append(cArr, 2, 3);
                        break;
                    case '3':
                        sb.append(cArr, 0, 3);
                        sb.append("00000");
                        sb.append(cArr, 3, 2);
                        break;
                    case '4':
                        sb.append(cArr, 0, 4);
                        sb.append("00000");
                        sb.append(cArr[4]);
                        break;
                    default:
                        sb.append(cArr, 0, 5);
                        sb.append("0000");
                        sb.append(c);
                        break;
                }
                if (str.length() >= 8) {
                    sb.append(str.charAt(7));
                }
                return super.g(sb.toString());
            default:
                return super.g(str);
        }
    }

    public int[] i(i90 i90, int i2) {
        switch (this.h) {
            case 1:
                return xr7.l(i90, i2, true, k, new int[6]);
            default:
                return super.i(i90, i2);
        }
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [boolean] */
    public final int j(i90 i90, int[] iArr, StringBuilder sb) {
        i90 i902 = i90;
        int[] iArr2 = iArr;
        StringBuilder sb2 = sb;
        int i2 = this.h;
        int[][] iArr3 = xr7.g;
        int[] iArr4 = xr7.e;
        int[][] iArr5 = xr7.f;
        int i3 = 1;
        Object obj = this.i;
        switch (i2) {
            case b85.b:
                int[] iArr6 = (int[]) obj;
                iArr6[0] = 0;
                iArr6[1] = 0;
                iArr6[2] = 0;
                iArr6[3] = 0;
                int i4 = i902.x;
                int i5 = iArr2[1];
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 6; i6 < i8 && i5 < i4; i8 = 6) {
                    int h2 = xr7.h(i902, iArr6, i5, iArr3);
                    sb2.append((char) ((h2 % 10) + 48));
                    int i9 = i3;
                    for (int i10 : iArr6) {
                        i5 += i10;
                    }
                    if (h2 >= 10) {
                        i7 |= i9 << (5 - i6);
                    }
                    i6++;
                    i3 = i9;
                }
                int i11 = i3;
                for (int i12 = 0; i12 < 10; i12++) {
                    if (i7 == j[i12]) {
                        sb2.insert(0, (char) (i12 + 48));
                        ? r6 = i11;
                        int i13 = xr7.l(i902, i5, r6, iArr4, new int[5])[r6];
                        for (int i14 = 0; i14 < 6 && i13 < i4; i14++) {
                            sb2.append((char) (xr7.h(i902, iArr6, i13, iArr5) + 48));
                            for (int i15 : iArr6) {
                                i13 += i15;
                            }
                        }
                        return i13;
                    }
                    int i16 = i11;
                }
                throw NotFoundException.y;
            case 1:
                int[] iArr7 = (int[]) obj;
                iArr7[0] = 0;
                iArr7[1] = 0;
                iArr7[2] = 0;
                iArr7[3] = 0;
                int i17 = i902.x;
                int i18 = iArr2[1];
                int i19 = 0;
                for (int i20 = 0; i20 < 6 && i18 < i17; i20++) {
                    int h3 = xr7.h(i902, iArr7, i18, iArr3);
                    sb2.append((char) ((h3 % 10) + 48));
                    for (int i21 : iArr7) {
                        i18 += i21;
                    }
                    if (h3 >= 10) {
                        i19 |= 1 << (5 - i20);
                    }
                }
                for (int i22 = 0; i22 <= 1; i22++) {
                    for (int i23 = 0; i23 < 10; i23++) {
                        if (i19 == l[i22][i23]) {
                            sb2.insert(0, (char) (i22 + 48));
                            sb2.append((char) (i23 + 48));
                            return i18;
                        }
                    }
                }
                throw NotFoundException.y;
            case 2:
                int[] iArr8 = (int[]) obj;
                iArr8[0] = 0;
                iArr8[1] = 0;
                iArr8[2] = 0;
                iArr8[3] = 0;
                int i24 = i902.x;
                int i25 = iArr2[1];
                for (int i26 = 0; i26 < 4 && i25 < i24; i26++) {
                    sb2.append((char) (xr7.h(i902, iArr8, i25, iArr5) + 48));
                    for (int i27 : iArr8) {
                        i25 += i27;
                    }
                }
                int i28 = xr7.l(i902, i25, true, iArr4, new int[5])[1];
                for (int i29 = 0; i29 < 4 && i28 < i24; i29++) {
                    sb2.append((char) (xr7.h(i902, iArr8, i28, iArr5) + 48));
                    for (int i30 : iArr8) {
                        i28 += i30;
                    }
                }
                return i28;
            default:
                return ((g12) obj).j(i902, iArr2, sb2);
        }
    }

    public n66 k(int i2, i90 i90, int[] iArr, Map map) {
        switch (this.h) {
            case 3:
                return o(((g12) this.i).k(i2, i90, iArr, map));
            default:
                return super.k(i2, i90, iArr, map);
        }
    }

    public final d50 n() {
        switch (this.h) {
            case b85.b:
                return d50.D;
            case 1:
                return d50.L;
            case 2:
                return d50.C;
            default:
                return d50.K;
        }
    }
}
