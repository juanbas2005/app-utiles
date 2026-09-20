package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: q51  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q51 {
    public static final q51 e = new q51("*", "*", a42.w);
    public final String a;
    public final List b;
    public final String c;
    public final String d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public q51(String str, String str2, List list) {
        this(str + '/' + str2, list);
        str.getClass();
        str2.getClass();
        list.getClass();
        this.c = str;
        this.d = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (r1 != null) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0085 A[SYNTHETIC] */
    public final boolean a(q51 q51) {
        boolean z;
        q51.getClass();
        String str = q51.d;
        String str2 = q51.c;
        if (!sg3.e(str2, "*") && !k57.n0(str2, this.c, true)) {
            return false;
        }
        if (!sg3.e(str, "*") && !k57.n0(str, this.d, true)) {
            return false;
        }
        for (xy2 xy2 : q51.b) {
            String str3 = xy2.a;
            String str4 = xy2.b;
            if (!sg3.e(str3, "*")) {
                String b2 = b(str3);
                if (!sg3.e(str4, "*")) {
                    z = k57.n0(b2, str4, true);
                    continue;
                    if (!z) {
                    }
                }
            } else if (!sg3.e(str4, "*")) {
                List list = this.b;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (k57.n0(((xy2) it.next()).b, str4, true)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                continue;
                if (!z) {
                    return false;
                }
            }
            z = true;
            continue;
            if (!z) {
            }
        }
        return true;
    }

    public final String b(String str) {
        str.getClass();
        List list = this.b;
        int x = sg3.x(list);
        if (x < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            xy2 xy2 = (xy2) list.get(i);
            if (k57.n0(xy2.a, str, true)) {
                return xy2.b;
            }
            if (i == x) {
                return null;
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (defpackage.k57.n0(r1.b, r7, true) != false) goto L_0x004c;
     */
    public final q51 c(String str) {
        List<xy2> list = this.b;
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                xy2 xy2 = (xy2) list.get(0);
                if (k57.n0(xy2.a, "charset", true)) {
                }
            } else if (!list.isEmpty()) {
                for (xy2 xy22 : list) {
                    if (!k57.n0(xy22.a, "charset", true) || !k57.n0(xy22.b, str, true)) {
                    }
                }
            }
            return this;
        }
        return new q51(this.c, this.d, this.a, dt0.N0(list, new xy2("charset", str)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q51)) {
            return false;
        }
        q51 q51 = (q51) obj;
        if (!k57.n0(this.c, q51.c, true) || !k57.n0(this.d, q51.d, true) || !sg3.e(this.b, q51.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.c.toLowerCase(locale);
        lowerCase.getClass();
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.d.toLowerCase(locale);
        lowerCase2.getClass();
        int hashCode2 = lowerCase2.hashCode();
        return (this.b.hashCode() * 31) + hashCode2 + (hashCode * 31) + hashCode;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x011f A[LOOP:1: B:10:0x0044->B:56:0x011f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012a A[EDGE_INSN: B:62:0x012a->B:59:0x012a ?: BREAK  , SYNTHETIC] */
    public final String toString() {
        List<xy2> list = this.b;
        boolean isEmpty = list.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        int length = str.length();
        int i = 0;
        for (xy2 xy2 : list) {
            i += xy2.b.length() + xy2.a.length() + 3;
        }
        StringBuilder sb = new StringBuilder(length + i);
        sb.append(str);
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                xy2 xy22 = (xy2) list.get(i2);
                sb.append("; ");
                sb.append(xy22.a);
                sb.append("=");
                String str2 = xy22.b;
                Set set = yy2.a;
                if (str2.length() != 0) {
                    if (str2.length() >= 2) {
                        if (str2.length() == 0) {
                            kj6.i("Char sequence is empty.");
                            return null;
                        } else if (str2.charAt(0) == '\"' && d57.J0(str2) == '\"') {
                            int i3 = 1;
                            while (true) {
                                int F0 = d57.F0(str2, '\"', i3, 4);
                                if (F0 != str2.length() - 1) {
                                    int i4 = 0;
                                    for (int i5 = F0 - 1; str2.charAt(i5) == '\\'; i5--) {
                                        i4++;
                                    }
                                    if (i4 % 2 != 0) {
                                        i3 = F0 + 1;
                                        if (i3 >= str2.length()) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            sb.append(str2);
                            if (i2 != size) {
                                break;
                            }
                            i2++;
                        }
                    }
                    int length2 = str2.length();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length2) {
                            break;
                        }
                        if (yy2.a.contains(Character.valueOf(str2.charAt(i6)))) {
                            break;
                        }
                        i6++;
                    }
                }
                StringBuilder sb2 = new StringBuilder("\"");
                int length3 = str2.length();
                for (int i7 = 0; i7 < length3; i7++) {
                    char charAt = str2.charAt(i7);
                    if (charAt == 9) {
                        sb2.append("\\t");
                    } else if (charAt == 10) {
                        sb2.append("\\n");
                    } else if (charAt == 13) {
                        sb2.append("\\r");
                    } else if (charAt == '\"') {
                        sb2.append("\\\"");
                    } else if (charAt != '\\') {
                        sb2.append(charAt);
                    } else {
                        sb2.append("\\\\");
                    }
                }
                sb2.append("\"");
                sb.append(sb2.toString());
                if (i2 != size) {
                }
            }
        }
        return sb.toString();
    }

    public q51(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public q51(String str, String str2, String str3, ArrayList arrayList) {
        this(str3, arrayList);
        this.c = str;
        this.d = str2;
    }
}
