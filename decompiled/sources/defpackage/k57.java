package defpackage;

/* renamed from: k57  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class k57 extends j57 {
    public static String j0(char[] cArr, int i, int i2) {
        ie1.x(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static String k0(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, mo0.a);
    }

    public static byte[] l0(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(mo0.a);
        bytes.getClass();
        return bytes;
    }

    public static boolean m0(String str, String str2, boolean z) {
        str.getClass();
        if (!z) {
            return str.endsWith(str2);
        }
        return str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean n0(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static final void o0(String str) {
        throw new NumberFormatException(pb4.h('\'', "Invalid number format: '", str));
    }

    public static boolean p0(int i, int i2, int i3, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static String q0(int i, String str) {
        str.getClass();
        if (i < 0) {
            ta1.k(i, 46, "Count 'n' must be non-negative, but was ");
            return null;
        } else if (i == 0) {
            return "";
        } else {
            int i2 = 1;
            if (i == 1) {
                return str.toString();
            }
            int length = str.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(str.length() * i);
                if (1 <= i) {
                    while (true) {
                        sb.append(str);
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                return sb.toString();
            }
            char charAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
    }

    public static String r0(String str, char c, char c2) {
        str.getClass();
        String replace = str.replace(c, c2);
        replace.getClass();
        return replace;
    }

    public static String s0(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int D0 = d57.D0(str, str2, 0, false);
        if (D0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = 1;
        if (length >= 1) {
            i = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i2 = 0;
            do {
                sb.append(str, i2, D0);
                sb.append(str3);
                i2 = D0 + length;
                if (D0 >= str.length() || (D0 = d57.D0(str, str2, D0 + i, false)) <= 0) {
                    sb.append(str, i2, str.length());
                }
                sb.append(str, i2, D0);
                sb.append(str3);
                i2 = D0 + length;
                break;
            } while ((D0 = d57.D0(str, str2, D0 + i, false)) <= 0);
            sb.append(str, i2, str.length());
            return sb.toString();
        }
        throw new OutOfMemoryError();
    }

    public static boolean t0(int i, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.startsWith(str2, i);
        }
        return p0(i, 0, str2.length(), str, str2, z);
    }

    public static boolean u0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.startsWith(str2);
        }
        return p0(0, 0, str2.length(), str, str2, z);
    }

    public static Integer v0(String str) {
        int i;
        boolean z;
        int i2;
        str.getClass();
        rd3.i(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        if (charAt < '0') {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
            } else if (charAt != '-') {
                return null;
            } else {
                i4 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i++;
        }
        if (z) {
            return Integer.valueOf(i3);
        }
        return Integer.valueOf(-i3);
    }

    public static Long w0(String str) {
        boolean z;
        String str2 = str;
        str2.getClass();
        rd3.i(10);
        int length = str2.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str2.charAt(0);
        long j = -9223372036854775807L;
        if (charAt < '0') {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
                i = 1;
            } else if (charAt != '-') {
                return null;
            } else {
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int digit = Character.digit(str2.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / 10;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = (long) digit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        if (z) {
            return Long.valueOf(j2);
        }
        return Long.valueOf(-j2);
    }
}
