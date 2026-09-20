package defpackage;

import java.util.List;

/* renamed from: zr7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class zr7 {
    public static final List a = sg3.D("");

    public static final int a(int i, int i2, String str) {
        boolean z = false;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != ':') {
                if (charAt == '[') {
                    z = true;
                } else if (charAt == ']') {
                    z = false;
                }
            } else if (!z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void b(yr7 yr7, String str) {
        yr7.getClass();
        str.getClass();
        if (!d57.I0(str)) {
            try {
                c(yr7, str);
            } catch (Throwable th) {
                throw new IllegalStateException("Fail to parse url: ".concat(str), th);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r17v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final void c(yr7 yr7, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        List list;
        int i5;
        int i6;
        List list2;
        List list3;
        int i7;
        int i8;
        int i9;
        char c;
        yr7 yr72 = yr7;
        String str2 = str;
        yr72.getClass();
        str2.getClass();
        int length = str2.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!rd3.C(str2.charAt(i10))) {
                break;
            } else {
                i10++;
            }
        }
        int length2 = str2.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i11 = length2 - 1;
                if (!rd3.C(str2.charAt(length2))) {
                    break;
                } else if (i11 < 0) {
                    break;
                } else {
                    length2 = i11;
                }
            }
        }
        length2 = -1;
        int i12 = length2 + 1;
        char charAt = str2.charAt(i10);
        if (('a' > charAt || charAt >= '{') && ('A' > charAt || charAt >= '[')) {
            i2 = i10;
            i = i2;
        } else {
            i2 = i10;
            i = -1;
        }
        while (true) {
            if (i2 < i12) {
                char charAt2 = str2.charAt(i2);
                if (charAt2 != ':') {
                    if (charAt2 == '#' || charAt2 == '/' || charAt2 == '?') {
                        break;
                    }
                    if (i != -1 || ('a' <= charAt2 && charAt2 < '{')) {
                        c = '[';
                    } else {
                        c = '[';
                        if (('A' > charAt2 || charAt2 >= '[') && !(('0' <= charAt2 && charAt2 < ':') || charAt2 == '.' || charAt2 == '+' || charAt2 == '-')) {
                            i = i2;
                        }
                    }
                    i2++;
                    char c2 = c;
                } else if (i == -1) {
                    i3 = i2 - i10;
                } else {
                    h.q(hl6.k(i, "Illegal character in scheme at position "));
                    return;
                }
            } else {
                break;
            }
        }
        i3 = -1;
        if (i3 > 0) {
            String substring = str2.substring(i10, i10 + i3);
            as7 as7 = as7.y;
            String v = o85.v(substring);
            as7 as72 = (as7) as7.z.get(v);
            if (as72 == null) {
                as72 = new as7(v, 0);
            }
            yr72.d = as72;
            i10 += i3 + 1;
        }
        if (yr72.d().w.equals("data")) {
            yr72.a = str2.substring(i10, i12);
            return;
        }
        int i13 = 0;
        while (true) {
            i4 = i10 + i13;
            if (i4 < i12 && str2.charAt(i4) == '/') {
                i13++;
            }
        }
        if (!yr72.d().w.equals("file")) {
            Integer num = null;
            if (yr72.d().w.equals("mailto")) {
                if (i13 == 0) {
                    int G0 = d57.G0(str2, "@", i4, false, 4);
                    if (G0 != -1) {
                        String c3 = ss0.c(str2.substring(i4, G0));
                        if (c3 != null) {
                            num = ss0.e(c3, false);
                        }
                        yr72.e = num;
                        yr72.a = str2.substring(G0 + 1, i12);
                        return;
                    }
                    h.q(f21.h("Invalid mailto url: ", str2, ", it should contain '@'."));
                    return;
                }
                h.q("Failed requirement.");
            } else if (yr72.d().w.equals("about")) {
                if (i13 == 0) {
                    yr72.a = str2.substring(i4, i12);
                } else {
                    h.q("Failed requirement.");
                }
            } else if (!yr72.d().w.equals("tel")) {
                if (i13 >= 2) {
                    while (true) {
                        int H0 = d57.H0(str2, sg3.c0("@/\\?#"), i4, false);
                        Integer valueOf = Integer.valueOf(H0);
                        if (H0 <= 0) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            i7 = valueOf.intValue();
                        } else {
                            i7 = i12;
                        }
                        if (i7 >= i12 || str2.charAt(i7) != '@') {
                            int a2 = a(i4, i7, str2);
                            Integer valueOf2 = Integer.valueOf(a2);
                        } else {
                            int a3 = a(i4, i7, str2);
                            if (a3 != -1) {
                                yr72.e = str2.substring(i4, a3);
                                yr72.f = str2.substring(a3 + 1, i7);
                            } else {
                                yr72.e = str2.substring(i4, i7);
                            }
                            i4 = i7 + 1;
                        }
                    }
                    int a22 = a(i4, i7, str2);
                    Integer valueOf22 = Integer.valueOf(a22);
                    if (a22 <= 0) {
                        valueOf22 = null;
                    }
                    if (valueOf22 != null) {
                        i8 = valueOf22.intValue();
                    } else {
                        i8 = i7;
                    }
                    yr72.a = str2.substring(i4, i8);
                    int i14 = i8 + 1;
                    if (i14 < i7) {
                        i9 = Integer.parseInt(str2.substring(i14, i7));
                    } else {
                        i9 = 0;
                    }
                    yr72.e(i9);
                    i4 = i7;
                }
                List list4 = a;
                List list5 = a42.w;
                if (i4 >= i12) {
                    if (str2.charAt(length2) != '/') {
                        list4 = list5;
                    }
                    list4.getClass();
                    yr72.h = list4;
                    return;
                }
                if (i13 == 0) {
                    list = dt0.t0(1, yr72.h);
                } else {
                    list = list5;
                }
                yr72.h = list;
                int H02 = d57.H0(str2, sg3.c0("?#"), i4, false);
                Integer valueOf3 = Integer.valueOf(H02);
                if (H02 <= 0) {
                    valueOf3 = null;
                }
                if (valueOf3 != null) {
                    i5 = valueOf3.intValue();
                } else {
                    i5 = i12;
                }
                if (i5 > i4) {
                    String substring2 = str2.substring(i4, i5);
                    if (yr72.h.size() == 1 && ((CharSequence) dt0.w0(yr72.h)).length() == 0) {
                        list2 = list5;
                    } else {
                        list2 = yr72.h;
                    }
                    if (substring2.equals("/")) {
                        list3 = list4;
                    } else {
                        list3 = d57.X0(substring2, new char[]{'/'});
                    }
                    if (i13 != 1) {
                        list4 = list5;
                    }
                    yr72.h = dt0.M0(list2, dt0.M0(list4, list3));
                    i4 = i5;
                }
                if (i4 < i12 && str2.charAt(i4) == '?') {
                    int i15 = i4 + 1;
                    if (i15 == i12) {
                        yr72.b = true;
                        i4 = i12;
                    } else {
                        int F0 = d57.F0(str2, '#', i15, 4);
                        Integer valueOf4 = Integer.valueOf(F0);
                        if (F0 > 0) {
                            num = valueOf4;
                        }
                        if (num != null) {
                            i6 = num.intValue();
                        } else {
                            i6 = i12;
                        }
                        j45.l(str2.substring(i15, i6)).w(new ph6(18, yr72));
                        i4 = i6;
                    }
                }
                if (i4 < i12 && str2.charAt(i4) == '#') {
                    yr72.g = str2.substring(i4 + 1, i12);
                }
            } else if (i13 == 0) {
                yr72.a = str2.substring(i4, i12);
            } else {
                h.q("Failed requirement.");
            }
        } else if (i13 == 1) {
            yr72.a = "";
            t35.B(yr72, str2.substring(i4, i12));
        } else if (i13 == 2) {
            int F02 = d57.F0(str2, '/', i4, 4);
            if (F02 == -1 || F02 == i12) {
                yr72.a = str2.substring(i4, i12);
                return;
            }
            yr72.a = str2.substring(i4, F02);
            t35.B(yr72, str2.substring(F02, i12));
        } else if (i13 == 3) {
            yr72.a = "";
            t35.B(yr72, "/".concat(str2.substring(i4, i12)));
        } else {
            h.q("Invalid file url: ".concat(str2));
        }
    }
}
