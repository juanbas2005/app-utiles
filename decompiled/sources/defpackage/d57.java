package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: d57  reason: default package */
public abstract class d57 extends k57 {
    public static boolean A0(CharSequence charSequence, String str) {
        charSequence.getClass();
        if (charSequence instanceof String) {
            return k57.m0((String) charSequence, str, false);
        }
        return Q0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean B0(String str, char c) {
        if (str.length() <= 0 || !rd3.p(str.charAt(str.length() - 1), c, false)) {
            return false;
        }
        return true;
    }

    public static int C0(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static final int D0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return E0(charSequence, str, i, charSequence.length(), z, false);
    }

    public static final int E0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        pe3 pe3;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            pe3 = new pe3(i, i2, 1);
        } else {
            int C0 = C0(charSequence);
            if (i > C0) {
                i = C0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            pe3 = new pe3(i, i2, -1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = pe3.y;
        int i4 = pe3.x;
        int i5 = pe3.w;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (!Q0(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        if (i5 == i4) {
                            break;
                        }
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (!k57.p0(0, i6, str.length(), str, (String) charSequence, z6)) {
                    if (i6 == i4) {
                        break;
                    }
                    i6 += i3;
                    z = z6;
                } else {
                    return i6;
                }
            }
        }
        return -1;
    }

    public static int F0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        return H0(charSequence, new char[]{c}, i, false);
    }

    public static /* synthetic */ int G0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return D0(charSequence, str, i, z);
    }

    public static final int H0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length() - 1;
            if (i > length) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(i);
                for (char p : cArr) {
                    if (rd3.p(p, charAt, z)) {
                        return i;
                    }
                }
                if (i == length) {
                    return -1;
                }
                i++;
            }
        } else {
            return ((String) charSequence).indexOf(qs.i1(cArr), i);
        }
    }

    public static boolean I0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!rd3.C(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char J0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        kj6.i("Char sequence is empty.");
        return 0;
    }

    public static int K0(int i, int i2, String str, String str2) {
        if ((i2 & 2) != 0) {
            i = C0(str);
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, i);
    }

    public static int L0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = C0(charSequence);
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return M0(charSequence, new char[]{c}, i);
    }

    public static final int M0(CharSequence charSequence, char[] cArr, int i) {
        charSequence.getClass();
        if (cArr.length != 1 || !(charSequence instanceof String)) {
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            while (-1 < i) {
                char charAt = charSequence.charAt(i);
                for (char p : cArr) {
                    if (rd3.p(p, charAt, false)) {
                        return i;
                    }
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(qs.i1(cArr), i);
    }

    public static List N0(String str) {
        y64 y64 = new y64(str);
        if (!y64.hasNext()) {
            return a42.w;
        }
        Object next = y64.next();
        if (!y64.hasNext()) {
            return sg3.D(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (y64.hasNext()) {
            arrayList.add(y64.next());
        }
        return arrayList;
    }

    public static String O0(int i, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                int length = i - str.length();
                int i2 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append('0');
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                sb.append(str);
                charSequence = sb;
            }
            return charSequence.toString();
        }
        h.q(pb4.i(i, "Desired length ", " is less than zero."));
        return null;
    }

    public static rp1 P0(CharSequence charSequence, String[] strArr, int i) {
        U0(i);
        List asList = Arrays.asList(strArr);
        asList.getClass();
        return new rp1(charSequence, i, new c13(asList));
    }

    public static final boolean Q0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!rd3.p(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String R0(String str, String str2) {
        str.getClass();
        if (Z0(str, str2, false)) {
            return str.substring(str2.length());
        }
        return str;
    }

    public static String S0(String str, String str2) {
        str.getClass();
        if (A0(str, str2)) {
            return str.substring(0, str.length() - str2.length());
        }
        return str;
    }

    public static String T0(String str) {
        str.getClass();
        if (str.length() < 2 || !Z0(str, "\"", false) || !A0(str, "\"")) {
            return str;
        }
        return str.substring(1, str.length() - 1);
    }

    public static final void U0(int i) {
        if (i < 0) {
            h.j(hl6.k(i, "Limit must be non-negative, but was "));
        }
    }

    public static final List V0(CharSequence charSequence, String str, int i) {
        boolean z;
        U0(i);
        int D0 = D0(charSequence, str, 0, false);
        if (D0 == -1 || i == 1) {
            return sg3.D(charSequence.toString());
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        do {
            arrayList.add(charSequence.subSequence(i3, D0).toString());
            i3 = str.length() + D0;
            if ((z && arrayList.size() == i - 1) || (D0 = D0(charSequence, str, i3, false)) == -1) {
                arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i3, D0).toString());
            i3 = str.length() + D0;
            break;
        } while ((D0 = D0(charSequence, str, i3, false)) == -1);
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public static List W0(CharSequence charSequence, String[] strArr, int i) {
        int i2;
        if ((i & 4) != 0) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return V0(charSequence, str, i2);
            }
        }
        rp1<re3> P0 = P0(charSequence, strArr, i2);
        ArrayList arrayList = new ArrayList(et0.e0(new ss(2, P0), 10));
        for (re3 b1 : P0) {
            arrayList.add(b1(charSequence, b1));
        }
        return arrayList;
    }

    public static List X0(String str, char[] cArr) {
        str.getClass();
        if (cArr.length == 1) {
            return V0(str, String.valueOf(cArr[0]), 0);
        }
        U0(0);
        rp1<re3> rp1 = new rp1(str, 0, new ph6(13, cArr));
        ArrayList arrayList = new ArrayList(et0.e0(new ss(2, rp1), 10));
        for (re3 b1 : rp1) {
            arrayList.add(b1(str, b1));
        }
        return arrayList;
    }

    public static boolean Y0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return k57.t0(i, (String) charSequence, str, false);
        }
        return Q0(charSequence, i, str, 0, str.length(), z);
    }

    public static boolean Z0(CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        if (!z && (charSequence instanceof String)) {
            return k57.u0((String) charSequence, str, false);
        }
        return Q0(charSequence, 0, str, 0, str.length(), z);
    }

    public static boolean a1(String str, char c) {
        str.getClass();
        if (str.length() <= 0 || !rd3.p(str.charAt(0), c, false)) {
            return false;
        }
        return true;
    }

    public static final String b1(CharSequence charSequence, re3 re3) {
        charSequence.getClass();
        re3.getClass();
        return charSequence.subSequence(re3.w, re3.x + 1).toString();
    }

    public static String c1(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int G0 = G0(str, str2, 0, false, 6);
        if (G0 == -1) {
            return str3;
        }
        return str.substring(str2.length() + G0, str.length());
    }

    public static String d1(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int L0 = L0(str, c, 0, 6);
        if (L0 == -1) {
            return str2;
        }
        return str.substring(L0 + 1, str.length());
    }

    public static String e1(String str) {
        str.getClass();
        str.getClass();
        int K0 = K0(0, 6, str, ".");
        if (K0 == -1) {
            return str;
        }
        return str.substring(1 + K0, str.length());
    }

    public static String f1(String str, char c) {
        str.getClass();
        str.getClass();
        int F0 = F0(str, c, 0, 6);
        if (F0 == -1) {
            return str;
        }
        return str.substring(0, F0);
    }

    public static String g1(String str, String str2) {
        str.getClass();
        str.getClass();
        int G0 = G0(str, str2, 0, false, 6);
        if (G0 == -1) {
            return str;
        }
        return str.substring(0, G0);
    }

    public static CharSequence h1(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (i >= 0) {
            int length = charSequence.length();
            if (i > length) {
                i = length;
            }
            return charSequence.subSequence(0, i);
        }
        h.j(pb4.i(i, "Requested character count ", " is less than zero."));
        return null;
    }

    public static String i1(int i, String str) {
        str.getClass();
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(0, i);
        }
        h.j(pb4.i(i, "Requested character count ", " is less than zero."));
        return null;
    }

    public static String j1(String str) {
        int length = str.length();
        int i = 8;
        if (8 > length) {
            i = length;
        }
        return str.substring(length - i);
    }

    public static CharSequence k1(CharSequence charSequence) {
        int i;
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean C = rd3.C(charSequence.charAt(i));
            if (!z) {
                if (!C) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!C) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static String l1(String str, char... cArr) {
        Object obj;
        str.getClass();
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char charAt = str.charAt(length);
                int length2 = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        i2 = -1;
                        break;
                    } else if (charAt == cArr[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < 0) {
                    obj = str.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            return obj.toString();
        }
        obj = "";
        return obj.toString();
    }

    public static boolean x0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (!(charSequence2 instanceof String)) {
            if (E0(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
                return true;
            }
        } else if (G0(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean y0(CharSequence charSequence, char c) {
        charSequence.getClass();
        if (F0(charSequence, c, 0, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static String z0(int i, String str) {
        str.getClass();
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(i);
        }
        h.j(pb4.i(i, "Requested character count ", " is less than zero."));
        return null;
    }
}
