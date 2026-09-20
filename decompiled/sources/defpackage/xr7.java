package defpackage;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.Arrays;
import java.util.Map;

/* renamed from: xr7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class xr7 extends m55 {
    public static final int[] d = {1, 1, 1};
    public static final int[] e = {1, 1, 1, 1, 1};
    public static final int[][] f;
    public static final int[][] g;
    public final StringBuilder a = new StringBuilder(20);
    public final qc3 b = new qc3(4);
    public final h12 c = new h12(0);

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f = iArr;
        int[][] iArr2 = new int[20][];
        g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            g[i] = iArr4;
        }
    }

    public static int h(i90 i90, int[] iArr, int i, int[][] iArr2) {
        m55.e(i, i90, iArr);
        int length = iArr2.length;
        float f2 = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float d2 = m55.d(iArr, iArr2[i3], 0.7f);
            if (d2 < f2) {
                i2 = i3;
                f2 = d2;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.y;
    }

    public static int[] l(i90 i90, int i, boolean z, int[] iArr, int[] iArr2) {
        int i2;
        int i3 = i90.x;
        if (z) {
            i2 = i90.c(i);
        } else {
            i2 = i90.b(i);
        }
        int length = iArr.length;
        boolean z2 = z;
        int i4 = 0;
        int i5 = i2;
        while (i2 < i3) {
            if (i90.a(i2) != z2) {
                iArr2[i4] = iArr2[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i4++;
                } else if (m55.d(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i5, i2};
                } else {
                    i5 += iArr2[0] + iArr2[1];
                    int i6 = i4 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i6);
                    iArr2[i6] = 0;
                    iArr2[i4] = 0;
                    i4--;
                }
                iArr2[i4] = 1;
                z2 = !z2;
            }
            i2++;
        }
        throw NotFoundException.y;
    }

    public static int[] m(i90 i90) {
        int[] iArr = new int[3];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            Arrays.fill(iArr, 0, 3, 0);
            iArr2 = l(i90, i, false, d, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = i90.d(i4, i2);
            }
            i = i3;
        }
        return iArr2;
    }

    public n66 b(int i, i90 i90, Map map) {
        return k(i, i90, m(i90), map);
    }

    public boolean g(String str) {
        int length = str.length();
        if (length != 0) {
            int i = length - 1;
            int digit = Character.digit(str.charAt(i), 10);
            CharSequence subSequence = str.subSequence(0, i);
            int length2 = subSequence.length();
            int i2 = 0;
            for (int i3 = length2 - 1; i3 >= 0; i3 -= 2) {
                int charAt = subSequence.charAt(i3) - '0';
                if (charAt < 0 || charAt > 9) {
                    throw FormatException.a();
                }
                i2 += charAt;
            }
            int i4 = i2 * 3;
            for (int i5 = length2 - 2; i5 >= 0; i5 -= 2) {
                int charAt2 = subSequence.charAt(i5) - '0';
                if (charAt2 < 0 || charAt2 > 9) {
                    throw FormatException.a();
                }
                i4 += charAt2;
            }
            if ((1000 - i4) % 10 == digit) {
                return true;
            }
        }
        return false;
    }

    public int[] i(i90 i90, int i) {
        return l(i90, i, false, d, new int[3]);
    }

    public abstract int j(i90 i90, int[] iArr, StringBuilder sb);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public n66 k(int i, i90 i90, int[] iArr, Map map) {
        s66 s66;
        int i2;
        int[] iArr2;
        String str = null;
        if (map == null) {
            s66 = null;
        } else {
            s66 = (s66) map.get(fk1.F);
        }
        if (s66 != null) {
            s66.a(new r66(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.a;
        sb.setLength(0);
        int j = j(i90, iArr, sb);
        if (s66 != null) {
            s66.a(new r66((float) j, (float) i));
        }
        int[] i3 = i(i90, j);
        if (s66 != null) {
            s66.a(new r66(((float) (i3[0] + i3[1])) / 2.0f, (float) i));
        }
        int i4 = i3[1];
        int i5 = (i4 - i3[0]) + i4;
        if (i5 >= i90.x || !i90.d(i4, i5)) {
            throw NotFoundException.y;
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw FormatException.a();
        } else if (g(sb2)) {
            d50 n = n();
            float f2 = (float) i;
            n66 n66 = new n66(sb2, (byte[]) null, new r66[]{new r66(((float) (iArr[1] + iArr[0])) / 2.0f, f2), new r66(((float) (i3[1] + i3[0])) / 2.0f, f2)}, n);
            try {
                n66 u = this.b.u(i, i3[1], i90);
                n66.b(q66.C, u.a);
                n66.a(u.e);
                r66[] r66Arr = u.c;
                r66[] r66Arr2 = n66.c;
                if (r66Arr2 == null) {
                    n66.c = r66Arr;
                } else if (r66Arr != null && r66Arr.length > 0) {
                    r66[] r66Arr3 = new r66[(r66Arr2.length + r66Arr.length)];
                    System.arraycopy(r66Arr2, 0, r66Arr3, 0, r66Arr2.length);
                    System.arraycopy(r66Arr, 0, r66Arr3, r66Arr2.length, r66Arr.length);
                    n66.c = r66Arr3;
                }
                i2 = u.a.length();
            } catch (ReaderException unused) {
                i2 = 0;
            }
            if (map == null) {
                iArr2 = null;
            } else {
                iArr2 = (int[]) map.get(fk1.G);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i6 = 0;
                while (i6 < length) {
                    if (i2 != iArr2[i6]) {
                        i6++;
                    }
                }
                throw NotFoundException.y;
            }
            if (n == d50.D || n == d50.K) {
                h12 h12 = this.c;
                synchronized (h12) {
                    if (h12.a.isEmpty()) {
                        h12.b(new int[]{0, 19}, "US/CA");
                        h12.b(new int[]{30, 39}, "US");
                        h12.b(new int[]{60, 139}, "US/CA");
                        h12.b(new int[]{300, 379}, "FR");
                        h12.b(new int[]{380}, "BG");
                        h12.b(new int[]{383}, "SI");
                        h12.b(new int[]{385}, "HR");
                        h12.b(new int[]{387}, "BA");
                        h12.b(new int[]{400, 440}, "DE");
                        h12.b(new int[]{450, 459}, "JP");
                        h12.b(new int[]{460, 469}, "RU");
                        h12.b(new int[]{471}, "TW");
                        h12.b(new int[]{474}, "EE");
                        h12.b(new int[]{475}, "LV");
                        h12.b(new int[]{476}, "AZ");
                        h12.b(new int[]{477}, "LT");
                        h12.b(new int[]{478}, "UZ");
                        h12.b(new int[]{479}, "LK");
                        h12.b(new int[]{480}, "PH");
                        h12.b(new int[]{481}, "BY");
                        h12.b(new int[]{482}, "UA");
                        h12.b(new int[]{484}, "MD");
                        h12.b(new int[]{485}, "AM");
                        h12.b(new int[]{486}, "GE");
                        h12.b(new int[]{487}, "KZ");
                        h12.b(new int[]{489}, "HK");
                        h12.b(new int[]{490, 499}, "JP");
                        h12.b(new int[]{500, 509}, "GB");
                        h12.b(new int[]{520}, "GR");
                        h12.b(new int[]{528}, "LB");
                        h12.b(new int[]{529}, "CY");
                        h12.b(new int[]{531}, "MK");
                        h12.b(new int[]{535}, "MT");
                        h12.b(new int[]{539}, "IE");
                        h12.b(new int[]{540, 549}, "BE/LU");
                        h12.b(new int[]{560}, "PT");
                        h12.b(new int[]{569}, "IS");
                        h12.b(new int[]{570, 579}, "DK");
                        h12.b(new int[]{590}, "PL");
                        h12.b(new int[]{594}, "RO");
                        h12.b(new int[]{599}, "HU");
                        h12.b(new int[]{600, 601}, "ZA");
                        h12.b(new int[]{603}, "GH");
                        h12.b(new int[]{608}, "BH");
                        h12.b(new int[]{609}, "MU");
                        h12.b(new int[]{611}, "MA");
                        h12.b(new int[]{613}, "DZ");
                        h12.b(new int[]{616}, "KE");
                        h12.b(new int[]{618}, "CI");
                        h12.b(new int[]{619}, "TN");
                        h12.b(new int[]{621}, "SY");
                        h12.b(new int[]{622}, "EG");
                        h12.b(new int[]{624}, "LY");
                        h12.b(new int[]{625}, "JO");
                        h12.b(new int[]{626}, "IR");
                        h12.b(new int[]{627}, "KW");
                        h12.b(new int[]{628}, "SA");
                        h12.b(new int[]{629}, "AE");
                        h12.b(new int[]{640, 649}, "FI");
                        h12.b(new int[]{690, 695}, "CN");
                        h12.b(new int[]{700, 709}, "NO");
                        h12.b(new int[]{729}, "IL");
                        h12.b(new int[]{730, 739}, "SE");
                        h12.b(new int[]{740}, "GT");
                        h12.b(new int[]{741}, "SV");
                        h12.b(new int[]{742}, "HN");
                        h12.b(new int[]{743}, "NI");
                        h12.b(new int[]{744}, "CR");
                        h12.b(new int[]{745}, "PA");
                        h12.b(new int[]{746}, "DO");
                        h12.b(new int[]{750}, "MX");
                        h12.b(new int[]{754, 755}, "CA");
                        h12.b(new int[]{759}, "VE");
                        h12.b(new int[]{760, 769}, "CH");
                        h12.b(new int[]{770}, "CO");
                        h12.b(new int[]{773}, "UY");
                        h12.b(new int[]{775}, "PE");
                        h12.b(new int[]{777}, "BO");
                        h12.b(new int[]{779}, "AR");
                        h12.b(new int[]{780}, "CL");
                        h12.b(new int[]{784}, "PY");
                        h12.b(new int[]{785}, "PE");
                        h12.b(new int[]{786}, "EC");
                        h12.b(new int[]{789, 790}, "BR");
                        h12.b(new int[]{800, 839}, "IT");
                        h12.b(new int[]{840, 849}, "ES");
                        h12.b(new int[]{850}, "CU");
                        h12.b(new int[]{858}, "SK");
                        h12.b(new int[]{859}, "CZ");
                        h12.b(new int[]{860}, "YU");
                        h12.b(new int[]{865}, "MN");
                        h12.b(new int[]{867}, "KP");
                        h12.b(new int[]{868, 869}, "TR");
                        h12.b(new int[]{870, 879}, "NL");
                        h12.b(new int[]{880}, "KR");
                        h12.b(new int[]{885}, "TH");
                        h12.b(new int[]{888}, "SG");
                        h12.b(new int[]{890}, "IN");
                        h12.b(new int[]{893}, "VN");
                        h12.b(new int[]{896}, "PK");
                        h12.b(new int[]{899}, "ID");
                        h12.b(new int[]{900, 919}, "AT");
                        h12.b(new int[]{930, 939}, "AU");
                        h12.b(new int[]{940, 949}, "AZ");
                        h12.b(new int[]{955}, "MY");
                        h12.b(new int[]{958}, "MO");
                    }
                }
                int parseInt = Integer.parseInt(sb2.substring(0, 3));
                int size = h12.a.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        int[] iArr3 = (int[]) h12.a.get(i7);
                        int i8 = iArr3[0];
                        if (parseInt < i8) {
                            break;
                        }
                        if (iArr3.length != 1) {
                            i8 = iArr3[1];
                        }
                        if (parseInt <= i8) {
                            str = h12.b.get(i7);
                            break;
                        }
                        i7++;
                    } else {
                        break;
                    }
                }
                if (str != null) {
                    n66.b(q66.B, str);
                }
            }
            return n66;
        } else {
            throw ChecksumException.a();
        }
    }

    public abstract d50 n();
}
