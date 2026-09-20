package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: ss0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ss0 {
    public static final Set a;
    public static final Set b = dt0.g1(dt0.M0(dt0.K0(new fo0('a', 'z'), new fo0('A', 'Z')), new fo0('0', '9')));
    public static final ArrayList c;
    public static final ArrayList d;

    static {
        ArrayList M0 = dt0.M0(dt0.K0(new fo0('a', 'z'), new fo0('A', 'Z')), new fo0('0', '9'));
        ArrayList arrayList = new ArrayList(et0.e0(M0, 10));
        Iterator it = M0.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        a = dt0.g1(arrayList);
        dt0.g1(dt0.M0(dt0.K0(new fo0('a', 'f'), new fo0('A', 'F')), new fo0('0', '9')));
        Iterable<Character> r1 = qs.r1(new Character[]{':', 47, '?', 35, 91, 93, 64, 33, 36, 38, 39, 40, 41, 42, 44, ';', '=', 45, 46, '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(et0.e0(r1, 10));
        for (Character charValue : r1) {
            arrayList2.add(Byte.valueOf((byte) charValue.charValue()));
        }
        c = arrayList2;
        qs.r1(new Character[]{':', 64, 33, 36, 38, 39, 40, 41, 42, 43, 44, 59, 61, 45, 46, 95, 126});
        wn6.o(b, qs.r1(new Character[]{33, 35, 36, 38, '+', '-', '.', '^', 95, '`', '|', 126}));
        List<Character> E = sg3.E(45, 46, 95, 126);
        ArrayList arrayList3 = new ArrayList(et0.e0(E, 10));
        for (Character charValue2 : E) {
            arrayList3.add(Byte.valueOf((byte) charValue2.charValue()));
        }
        d = arrayList3;
    }

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        if ('a' > c2 || c2 >= 'g') {
            return -1;
        }
        return c2 - 'W';
    }

    public static final String b(String str, int i, int i2, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (z && charAt == '+')) {
                int i4 = i2 - i;
                if (i4 > 255) {
                    i4 /= 3;
                }
                StringBuilder sb = new StringBuilder(i4);
                if (i3 > i) {
                    sb.append(str, i, i3);
                }
                byte[] bArr = null;
                while (i3 < i2) {
                    char charAt2 = str.charAt(i3);
                    if (z && charAt2 == '+') {
                        sb.append(' ');
                    } else if (charAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[((i2 - i3) / 3)];
                        }
                        int i5 = 0;
                        while (i3 < i2 && str.charAt(i3) == '%') {
                            int i6 = i3 + 2;
                            if (i6 < i2) {
                                int i7 = i3 + 1;
                                int a2 = a(str.charAt(i7));
                                int a3 = a(str.charAt(i6));
                                if (a2 == -1 || a3 == -1) {
                                    throw new Exception("Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + str + ", at " + i3);
                                }
                                bArr[i5] = (byte) ((a2 * 16) + a3);
                                i3 += 3;
                                i5++;
                            } else {
                                StringBuilder sb2 = new StringBuilder("Incomplete trailing HEX escape: ");
                                sb2.append(str.subSequence(i3, str.length()).toString());
                                sb2.append(", in ");
                                sb2.append(str);
                                throw new Exception(hl6.p(sb2, " at ", i3));
                            }
                        }
                        ie1.x(0, i5, bArr.length);
                        sb.append(new String(bArr, 0, i5, mo0.a));
                    } else {
                        sb.append(charAt2);
                    }
                    i3++;
                }
                return sb.toString();
            }
            i3++;
        }
        if (i == 0 && i2 == str.length()) {
            return str.toString();
        }
        return str.substring(i, i2);
    }

    public static String c(String str) {
        int length = str.length();
        Charset charset = mo0.a;
        str.getClass();
        charset.getClass();
        return b(str, 0, length, false);
    }

    public static String d(int i, int i2, int i3, String str) {
        boolean z = false;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) == 0) {
            z = true;
        }
        Charset charset = mo0.a;
        str.getClass();
        charset.getClass();
        return b(str, i, i2, z);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [tc0, java.lang.Object] */
    public static final String e(String str, boolean z) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder newEncoder = mo0.a.newEncoder();
        newEncoder.getClass();
        int length = str.length();
        ? obj = new Object();
        if (length <= 0) {
            f(obj, new j30(1, sb, z));
        } else {
            int i = 0;
            do {
                byte[] r = rg3.r(newEncoder, str, i, length);
                obj.D(r.length, r);
                int length2 = r.length;
                if (length2 >= 0) {
                    i += length2;
                } else {
                    h.s("Check failed.");
                    return null;
                }
            } while (i < length);
        }
        f(obj, new j30(1, sb, z));
        return sb.toString();
    }

    public static final void f(tc0 tc0, vr2 vr2) {
        while (!tc0.x()) {
            while (!tc0.x()) {
                vr2.y(Byte.valueOf(tc0.readByte()));
            }
        }
    }

    public static final String g(byte b2) {
        int i;
        int i2;
        int i3 = (b2 & 255) >> 4;
        if (i3 < 0 || i3 >= 10) {
            i = ((char) (i3 + 65)) - 10;
        } else {
            i = i3 + 48;
        }
        char c2 = (char) i;
        byte b3 = b2 & 15;
        if (b3 < 0 || b3 >= 10) {
            i2 = ((char) (b3 + 65)) - 10;
        } else {
            i2 = b3 + 48;
        }
        return new String(new char[]{'%', c2, (char) i2});
    }
}
