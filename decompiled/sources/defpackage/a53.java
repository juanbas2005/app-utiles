package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: a53  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class a53 {
    static {
        dg0 dg0 = dg0.z;
        td0.u("\"\\");
        td0.u("\t ,=");
    }

    public static final boolean a(a66 a66) {
        if (sg3.e((String) a66.w.y, "HEAD")) {
            return false;
        }
        int i = a66.z;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || fg8.e(a66) != -1) {
            return true;
        }
        String f = a66.B.f("Transfer-Encoding");
        if (f == null) {
            f = null;
        }
        if ("chunked".equalsIgnoreCase(f)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01cb, code lost:
        if (defpackage.bg8.a.e(r0) == false) goto L_0x01cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0224 A[SYNTHETIC] */
    public static final void b(s61 s61, g73 g73, bz2 bz2) {
        List list;
        boolean z;
        q61 q61;
        long j;
        q61 q612;
        String str;
        s61 s612 = s61;
        g73 g732 = g73;
        s612.getClass();
        g732.getClass();
        bz2.getClass();
        if (s612 != s61.f) {
            Pattern pattern = q61.k;
            List n = bz2.n("Set-Cookie");
            int size = n.size();
            boolean z2 = false;
            int i = 0;
            ArrayList arrayList = null;
            while (i < size) {
                String str2 = (String) n.get(i);
                str2.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                char c = ';';
                int e = dg8.e(str2, ';', z2 ? 1 : 0, z2, 6);
                char c2 = '=';
                int e2 = dg8.e(str2, '=', z2, e, 2);
                if (e2 != e) {
                    int h = dg8.h(z2, e2, str2);
                    String substring = str2.substring(h, dg8.i(h, e2, str2));
                    if (substring.length() != 0 && dg8.g(substring) == -1) {
                        int h2 = dg8.h(e2 + 1, e, str2);
                        String substring2 = str2.substring(h2, dg8.i(h2, e, str2));
                        if (dg8.g(substring2) == -1) {
                            int i2 = e + 1;
                            int length = str2.length();
                            boolean z3 = z2;
                            boolean z4 = z3;
                            boolean z5 = z4;
                            long j2 = -1;
                            long j3 = 253402300799999L;
                            String str3 = null;
                            String str4 = null;
                            boolean z6 = true;
                            String str5 = null;
                            while (true) {
                                long j4 = Long.MAX_VALUE;
                                if (i2 < length) {
                                    int d = dg8.d(str2, c, i2, length);
                                    int d2 = dg8.d(str2, c2, i2, d);
                                    int h3 = dg8.h(i2, d2, str2);
                                    String substring3 = str2.substring(h3, dg8.i(h3, d2, str2));
                                    if (d2 < d) {
                                        int h4 = dg8.h(d2 + 1, d, str2);
                                        str = str2.substring(h4, dg8.i(h4, d, str2));
                                    } else {
                                        str = "";
                                    }
                                    if (substring3.equalsIgnoreCase("expires")) {
                                        try {
                                            j3 = kl8.D(str.length(), str);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    } else if (substring3.equalsIgnoreCase("max-age")) {
                                        try {
                                            j2 = Long.parseLong(str);
                                            if (j2 <= 0) {
                                                j2 = Long.MIN_VALUE;
                                            }
                                        } catch (NumberFormatException e3) {
                                            Pattern compile = Pattern.compile("-?\\d+");
                                            compile.getClass();
                                            if (compile.matcher(str).matches()) {
                                                if (k57.u0(str, "-", false)) {
                                                    j4 = Long.MIN_VALUE;
                                                }
                                                j2 = j4;
                                            } else {
                                                throw e3;
                                            }
                                        }
                                    } else {
                                        if (substring3.equalsIgnoreCase("domain")) {
                                            if (!k57.m0(str, ".", false)) {
                                                String b = bg8.b(d57.R0(str, "."));
                                                if (b != null) {
                                                    str4 = b;
                                                    z6 = false;
                                                } else {
                                                    throw new IllegalArgumentException();
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Failed requirement.");
                                            }
                                        } else if (substring3.equalsIgnoreCase("path")) {
                                            str3 = str;
                                        } else if (substring3.equalsIgnoreCase("secure")) {
                                            z5 = true;
                                        } else if (substring3.equalsIgnoreCase("httponly")) {
                                            z3 = true;
                                        } else if (substring3.equalsIgnoreCase("samesite")) {
                                            str5 = str;
                                        }
                                        i2 = d + 1;
                                        c = ';';
                                        c2 = '=';
                                    }
                                    z4 = true;
                                    i2 = d + 1;
                                    c = ';';
                                    c2 = '=';
                                } else {
                                    if (j2 == Long.MIN_VALUE) {
                                        j = Long.MIN_VALUE;
                                    } else if (j2 != -1) {
                                        if (j2 <= 9223372036854775L) {
                                            j4 = j2 * 1000;
                                        }
                                        long j5 = currentTimeMillis + j4;
                                        if (j5 < currentTimeMillis || j5 > 253402300799999L) {
                                            j = 253402300799999L;
                                        } else {
                                            j = j5;
                                        }
                                    } else {
                                        j = j3;
                                    }
                                    String str6 = g732.d;
                                    if (str4 == null) {
                                        str4 = str6;
                                    } else if (!sg3.e(str6, str4)) {
                                        if (k57.m0(str6, str4, false)) {
                                            if (str6.charAt((str6.length() - str4.length()) - 1) == '.') {
                                            }
                                        }
                                        z = false;
                                        q612 = null;
                                        q61 = q612;
                                    }
                                    if (str6.length() == str4.length() || su5.d.a(str4) != null) {
                                        String str7 = "/";
                                        z = false;
                                        if (str3 == null || !k57.u0(str3, str7, false)) {
                                            String b2 = g732.b();
                                            int L0 = d57.L0(b2, '/', 0, 6);
                                            if (L0 != 0) {
                                                str7 = b2.substring(0, L0);
                                            }
                                            str3 = str7;
                                        }
                                        q612 = new q61(substring, substring2, j, str4, str3, z5, z3, z4, z6, str5);
                                        q61 = q612;
                                    }
                                    z = false;
                                    q612 = null;
                                    q61 = q612;
                                }
                            }
                            if (q61 != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(q61);
                            }
                            i++;
                            z2 = z;
                        }
                    }
                }
                z = z2;
                q61 = null;
                if (q61 != null) {
                }
                i++;
                z2 = z;
            }
            if (arrayList != null) {
                list = Collections.unmodifiableList(arrayList);
                list.getClass();
            } else {
                list = null;
            }
            if (list == null) {
                list = a42.w;
            }
            if (!list.isEmpty()) {
                s612.k(g732, list);
            }
        }
    }
}
