package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: dg8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class dg8 {
    public static final byte[] a = new byte[0];
    public static final u75 b;

    /* JADX WARNING: type inference failed for: r4v2, types: [sc0, java.lang.Object] */
    static {
        dg0 dg0 = dg0.z;
        dg0[] dg0Arr = {td0.t("efbbbf"), td0.t("feff"), td0.t("fffe0000"), td0.t("fffe"), td0.t("0000feff")};
        ArrayList arrayList = new ArrayList(new xr(dg0Arr, false));
        ht0.f0(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5) {
            arrayList2.set(sg3.h(arrayList, dg0Arr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((dg0) arrayList.get(0)).d() > 0) {
            int i4 = 0;
            while (i4 < arrayList.size()) {
                dg0 dg02 = (dg0) arrayList.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < arrayList.size()) {
                    dg0 dg03 = (dg0) arrayList.get(i6);
                    dg03.getClass();
                    dg02.getClass();
                    if (!dg03.m(0, dg02, dg02.d())) {
                        continue;
                        break;
                    } else if (dg03.d() == dg02.d()) {
                        rf2.j("duplicate option: ", dg03);
                        return;
                    } else if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                        arrayList.remove(i6);
                        ((Number) arrayList2.remove(i6)).intValue();
                    } else {
                        i6++;
                    }
                }
                i4 = i5;
            }
            ? obj = new Object();
            t75.f(0, obj, 0, arrayList, 0, arrayList.size(), arrayList2);
            int i7 = (int) (obj.x / 4);
            int[] iArr = new int[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                iArr[i8] = obj.readInt();
            }
            b = new u75((dg0[]) Arrays.copyOf(dg0Arr, 5), iArr);
            return;
        }
        h.q("the empty byte string is not a supported option");
    }

    public static final void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder q = hl6.q(j, "length=", ", offset=");
            q.append(j2);
            q.append(", count=");
            q.append(j2);
            throw new ArrayIndexOutOfBoundsException(q.toString());
        }
    }

    public static final void b(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int c(int i, int i2, String str, String str2) {
        str.getClass();
        while (i < i2) {
            if (d57.y0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int d(String str, char c, int i, int i2) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int e(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return d(str, c, i, i2);
    }

    public static final boolean f(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (!(strArr.length == 0 || strArr2 == null || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int g(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (sg3.k(charAt, 31) <= 0 || sg3.k(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int h(int i, int i2, String str) {
        str.getClass();
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int i(int i, int i2, String str) {
        str.getClass();
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    public static final String[] j(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean k(String str) {
        str.getClass();
        if (str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie")) {
            return true;
        }
        return false;
    }

    public static final int l(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int m(ed0 ed0) {
        ed0.getClass();
        return (ed0.readByte() & 255) | ((ed0.readByte() & 255) << 16) | ((ed0.readByte() & 255) << 8);
    }

    public static final int n(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
