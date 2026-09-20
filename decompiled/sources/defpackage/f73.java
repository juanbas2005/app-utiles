package defpackage;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: f73  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f73 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public f73(int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                return;
            default:
                this.d = "";
                this.e = "";
                this.b = -1;
                this.h = sg3.I("");
                return;
        }
    }

    public static ArrayList g(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int F0 = d57.F0(str, '&', i2, 4);
            if (F0 == -1) {
                F0 = str.length();
            }
            int F02 = d57.F0(str, '=', i2, 4);
            if (F02 == -1 || F02 > F0) {
                arrayList.add(str.substring(i2, F0));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i2, F02));
                arrayList.add(str.substring(F02 + 1, F0));
            }
            i2 = F0 + 1;
        }
        return arrayList;
    }

    public void a(String str, String str2) {
        String str3;
        if (((ArrayList) this.i) == null) {
            this.i = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) this.i;
        arrayList.getClass();
        arrayList.add(ie1.v(0, 0, 91, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        ArrayList arrayList2 = (ArrayList) this.i;
        arrayList2.getClass();
        if (str2 != null) {
            str3 = ie1.v(0, 0, 91, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~");
        } else {
            str3 = null;
        }
        arrayList2.add(str3);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [int[][], java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [rq6[], java.lang.Object, java.io.Serializable] */
    public void b(int[] iArr, rq6 rq6) {
        int i2 = this.b;
        if (i2 == 0 || iArr.length == 0) {
            this.c = rq6;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i2 >= iArr2.length) {
            int i3 = i2 + 10;
            ? r3 = new int[i3][];
            System.arraycopy(iArr2, 0, r3, 0, i2);
            this.d = r3;
            ? r1 = new rq6[i3];
            System.arraycopy((rq6[]) this.e, 0, r1, 0, i2);
            this.e = r1;
        }
        int i4 = this.b;
        ((int[][]) this.d)[i4] = iArr;
        ((rq6[]) this.e)[i4] = rq6;
        this.b = i4 + 1;
    }

    public g73 c() {
        ArrayList arrayList;
        String str;
        String str2 = (String) this.c;
        String str3 = null;
        if (str2 != null) {
            String T = ie1.T(0, 0, 7, (String) this.d);
            String T2 = ie1.T(0, 0, 7, (String) this.e);
            String str4 = (String) this.f;
            if (str4 != null) {
                String str5 = T2;
                String str6 = str4;
                int d2 = d();
                ArrayList arrayList2 = (ArrayList) this.h;
                ArrayList arrayList3 = new ArrayList(et0.e0(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(ie1.T(0, 0, 7, (String) it.next()));
                }
                ArrayList<String> arrayList4 = (ArrayList) this.i;
                if (arrayList4 != null) {
                    arrayList = new ArrayList(et0.e0(arrayList4, 10));
                    for (String str7 : arrayList4) {
                        if (str7 != null) {
                            str = ie1.T(0, 0, 3, str7);
                        } else {
                            str = null;
                        }
                        arrayList.add(str);
                    }
                } else {
                    arrayList = null;
                }
                String str8 = (String) this.g;
                if (str8 != null) {
                    str3 = ie1.T(0, 0, 7, str8);
                }
                return new g73(str2, T, str5, str6, d2, arrayList, str3, toString());
            }
            h.s("host == null");
            return null;
        }
        h.s("scheme == null");
        return null;
    }

    public int d() {
        int i2 = this.b;
        if (i2 != -1) {
            return i2;
        }
        String str = (String) this.c;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r0v2, types: [rq6[], java.io.Serializable] */
    public void e() {
        this.c = new rq6();
        this.d = new int[10][];
        this.e = new rq6[10];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fb, code lost:
        if (r8 < 65536) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        if (r14 == ':') goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x01d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01bd  */
    public void f(g73 g73, String str) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int c2;
        char c3;
        int i7;
        int i8;
        int i9;
        int i10;
        ArrayList arrayList;
        String str2;
        g73 g732 = g73;
        String str3 = str;
        ArrayList arrayList2 = (ArrayList) this.h;
        str3.getClass();
        byte[] bArr = dg8.a;
        int h2 = dg8.h(0, str3.length(), str3);
        int i11 = dg8.i(h2, str3.length(), str3);
        char c4 = 65535;
        if (i11 - h2 >= 2) {
            char charAt = str3.charAt(h2);
            char c5 = 'a';
            if ((sg3.k(charAt, 97) >= 0 && sg3.k(charAt, 122) <= 0) || (sg3.k(charAt, 65) >= 0 && sg3.k(charAt, 90) <= 0)) {
                i2 = h2 + 1;
                while (true) {
                    if (i2 >= i11) {
                        break;
                    }
                    char charAt2 = str3.charAt(i2);
                    if ((c5 <= charAt2 && charAt2 < '{') || (('A' <= charAt2 && charAt2 < '[') || (('0' <= charAt2 && charAt2 < ':') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        i2++;
                        c5 = 'a';
                    }
                }
                if (i2 == -1) {
                    if (k57.t0(h2, str3, "https:", true)) {
                        this.c = "https";
                        h2 += 6;
                    } else if (k57.t0(h2, str3, "http:", true)) {
                        this.c = "http";
                        h2 += 5;
                    } else {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str3.substring(0, i2) + '\'');
                    }
                } else if (g732 != null) {
                    this.c = g732.a;
                } else {
                    if (str3.length() > 6) {
                        str2 = d57.i1(6, str3).concat("...");
                    } else {
                        str2 = str3;
                    }
                    h.q("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str2));
                    return;
                }
                i3 = h2;
                i4 = 0;
                while (i3 < i11 && ((r10 = str3.charAt(i3)) == '/' || r10 == '\\')) {
                    i4++;
                    i3++;
                }
                char c6 = '#';
                if (i4 < 2 || g732 == null || !sg3.e(g732.a, (String) this.c)) {
                    i6 = h2 + i4;
                    boolean z2 = false;
                    boolean z3 = false;
                    while (true) {
                        c2 = dg8.c(i6, i11, str3, "@/\\?#");
                        if (c2 == i11) {
                            c3 = str3.charAt(c2);
                        } else {
                            c3 = c4;
                        }
                        if (c3 == c4 || c3 == c6 || c3 == '/' || c3 == '\\' || c3 == '?') {
                            i7 = i6;
                        } else if (c3 == '@') {
                            if (!z2) {
                                int d2 = dg8.d(str3, ':', i6, c2);
                                String v = ie1.v(i6, d2, 112, str3, " \"':;<=>@[]^`{}|/\\?#");
                                if (z3) {
                                    v = f21.m(new StringBuilder(), (String) this.d, "%40", v);
                                }
                                this.d = v;
                                if (d2 != c2) {
                                    this.e = ie1.v(d2 + 1, c2, 112, str3, " \"':;<=>@[]^`{}|/\\?#");
                                    z2 = true;
                                }
                                z3 = true;
                            } else {
                                this.e = ((String) this.e) + "%40" + ie1.v(i6, c2, 112, str3, " \"':;<=>@[]^`{}|/\\?#");
                            }
                            i6 = c2 + 1;
                            c4 = 65535;
                            c6 = '#';
                        }
                    }
                    i7 = i6;
                    while (true) {
                        if (i7 < c2) {
                            char charAt3 = str3.charAt(i7);
                            if (charAt3 == ':') {
                                break;
                            }
                            if (charAt3 == '[') {
                                do {
                                    i7++;
                                    if (i7 >= c2) {
                                        break;
                                    }
                                } while (str3.charAt(i7) == ']');
                            }
                            i7++;
                        } else {
                            i7 = c2;
                            break;
                        }
                    }
                    i8 = i7 + 1;
                    if (i8 >= c2) {
                        this.f = bg8.b(ie1.T(i6, i7, 4, str3));
                        try {
                            i10 = Integer.parseInt(ie1.v(i8, c2, 120, str3, ""));
                            if (1 <= i10) {
                            }
                        } catch (NumberFormatException unused) {
                        }
                        i10 = -1;
                        this.b = i10;
                        if (i10 == -1) {
                            rf2.f(34, str3.substring(i8, c2), "Invalid URL port: \"");
                            return;
                        }
                    } else {
                        this.f = bg8.b(ie1.T(i6, i7, 4, str3));
                        String str4 = (String) this.c;
                        str4.getClass();
                        if (str4.equals("http")) {
                            i9 = 80;
                        } else if (str4.equals("https")) {
                            i9 = 443;
                        } else {
                            i9 = -1;
                        }
                        this.b = i9;
                    }
                    if (((String) this.f) == null) {
                        h2 = c2;
                    } else {
                        rf2.f(34, str3.substring(i6, i7), "Invalid URL host: \"");
                        return;
                    }
                } else {
                    this.d = g732.e();
                    this.e = g732.a();
                    this.f = g732.d;
                    this.b = g732.e;
                    arrayList2.clear();
                    arrayList2.addAll(g732.c());
                    if (h2 == i11 || str3.charAt(h2) == '#') {
                        String d3 = g732.d();
                        if (d3 != null) {
                            arrayList = g(ie1.v(0, 0, 83, d3, " \"'<>#"));
                        } else {
                            arrayList = null;
                        }
                        this.i = arrayList;
                    }
                }
                int c7 = dg8.c(h2, i11, str3, "?#");
                if (h2 != c7) {
                    char charAt4 = str3.charAt(h2);
                    if (charAt4 == '/' || charAt4 == '\\') {
                        arrayList2.clear();
                        arrayList2.add("");
                        h2++;
                    } else {
                        arrayList2.set(arrayList2.size() - 1, "");
                    }
                    while (i5 < c7) {
                        int c8 = dg8.c(i5, c7, str3, "/\\");
                        if (c8 < c7) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String v2 = ie1.v(i5, c8, 112, str3, " \"<>^`{}|/\\?#");
                        if (!v2.equals(".") && !v2.equalsIgnoreCase("%2e")) {
                            if (!v2.equals("..") && !v2.equalsIgnoreCase("%2e.") && !v2.equalsIgnoreCase(".%2e") && !v2.equalsIgnoreCase("%2e%2e")) {
                                if (((CharSequence) b81.k(1, arrayList2)).length() == 0) {
                                    arrayList2.set(arrayList2.size() - 1, v2);
                                } else {
                                    arrayList2.add(v2);
                                }
                                if (z) {
                                    arrayList2.add("");
                                }
                            } else if (((String) arrayList2.remove(arrayList2.size() - 1)).length() != 0 || arrayList2.isEmpty()) {
                                arrayList2.add("");
                            } else {
                                arrayList2.set(arrayList2.size() - 1, "");
                            }
                        }
                        if (z) {
                            i5 = c8 + 1;
                        } else {
                            i5 = c8;
                        }
                    }
                }
                if (c7 < i11 && str3.charAt(c7) == '?') {
                    int d4 = dg8.d(str3, '#', c7, i11);
                    this.i = g(ie1.v(c7 + 1, d4, 80, str3, " \"'<>#"));
                    c7 = d4;
                }
                if (c7 < i11 && str3.charAt(c7) == '#') {
                    this.g = ie1.v(c7 + 1, i11, 48, str3, "");
                    return;
                }
                return;
            }
        }
        i2 = -1;
        if (i2 == -1) {
        }
        i3 = h2;
        i4 = 0;
        while (i3 < i11) {
            i4++;
            i3++;
        }
        char c62 = '#';
        if (i4 < 2) {
        }
        i6 = h2 + i4;
        boolean z22 = false;
        boolean z32 = false;
        while (true) {
            c2 = dg8.c(i6, i11, str3, "@/\\?#");
            if (c2 == i11) {
            }
            if (c3 == c4) {
                break;
            }
            break;
        }
        i7 = i6;
        while (true) {
            if (i7 < c2) {
            }
            i7++;
        }
        i8 = i7 + 1;
        if (i8 >= c2) {
        }
        if (((String) this.f) == null) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a9, code lost:
        if (r1 != r3) goto L_0x00ab;
     */
    public String toString() {
        switch (this.a) {
            case b85.b:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.c;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.d).length() > 0 || ((String) this.e).length() > 0) {
                    sb.append((String) this.d);
                    if (((String) this.e).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.e);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.f;
                if (str2 != null) {
                    if (d57.y0(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.f);
                        sb.append(']');
                    } else {
                        sb.append((String) this.f);
                    }
                }
                int i2 = -1;
                if (!(this.b == -1 && ((String) this.c) == null)) {
                    int d2 = d();
                    String str3 = (String) this.c;
                    if (str3 != null) {
                        if (!str3.equals("http")) {
                            if (str3.equals("https")) {
                                i2 = 443;
                                break;
                            }
                        } else {
                            i2 = 80;
                            break;
                        }
                    }
                    sb.append(':');
                    sb.append(d2);
                }
                ArrayList arrayList = (ArrayList) this.h;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i3));
                }
                if (((ArrayList) this.i) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.i;
                    arrayList2.getClass();
                    hr2.k(sb, arrayList2);
                }
                if (((String) this.g) != null) {
                    sb.append('#');
                    sb.append((String) this.g);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public f73(rq6 rq6) {
        this.a = 1;
        e();
        b(StateSet.WILD_CARD, rq6);
    }
}
