package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.JsonException;

/* renamed from: z1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class z1 {
    public Object A;
    public Object B;
    public final /* synthetic */ int w = 1;
    public int x;
    public final Object y;
    public final Object z;

    public z1(wl3 wl3) {
        wl3.getClass();
        this.y = wl3;
        this.z = new kb9(wl3);
        this.B = new StringBuilder();
    }

    public static /* synthetic */ void u(z1 z1Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = z1Var.x;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        z1Var.t(i, str, str2);
        throw null;
    }

    public static boolean x(char c) {
        if (c == ',' || c == ':' || c == ']' || c == '}') {
            return false;
        }
        return true;
    }

    public String A(boolean z2) {
        String str;
        byte z3 = z();
        if (z2) {
            if (z3 != 1 && z3 != 0) {
                return null;
            }
            str = p();
        } else if (z3 != 1) {
            return null;
        } else {
            str = n();
        }
        this.A = str;
        return str;
    }

    public abstract int B(int i);

    public abstract int C();

    public String D(int i, int i2) {
        return w().subSequence(i, i2).toString();
    }

    public boolean E() {
        int C = C();
        CharSequence w2 = w();
        if (C >= w2.length() || C == -1 || w2.charAt(C) != ',') {
            return false;
        }
        this.x++;
        return true;
    }

    /* JADX INFO: finally extract failed */
    public void F(char c) {
        int i;
        String str;
        int i2 = this.x;
        if (i2 > 0 && c == '\"') {
            try {
                this.x = i2 - 1;
                String p = p();
                this.x = i2;
                if (sg3.e(p, "null")) {
                    t(this.x - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.x = i2;
                throw th;
            }
        }
        String a0 = fd1.a0(fd1.t(c));
        int i3 = this.x;
        if (i3 > 0) {
            i = i3 - 1;
        } else {
            i = i3;
        }
        if (i3 == w().length() || i < 0) {
            str = "EOF";
        } else {
            str = String.valueOf(w().charAt(i));
        }
        u(this, pb4.m("Expected ", a0, ", but had '", str, "' instead"), i, (String) null, 4);
        throw null;
    }

    public void a() {
        Map.Entry entry;
        this.A = (Map.Entry) this.B;
        Iterator it = (Iterator) this.z;
        if (it.hasNext()) {
            entry = (Map.Entry) it.next();
        } else {
            entry = null;
        }
        this.B = entry;
    }

    public int b(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.x = i;
            r();
            if (this.x + 4 < charSequence.length()) {
                return b(this.x, charSequence);
            }
            u(this, "Unexpected EOF during unicode escape", 0, (String) null, 6);
            throw null;
        }
        ((StringBuilder) this.B).append((char) (v(i + 3, charSequence) + (v(i, charSequence) << 12) + (v(i + 1, charSequence) << 8) + (v(i + 2, charSequence) << 4)));
        return i2;
    }

    public void c(int i, int i2) {
        ((StringBuilder) this.B).append(w(), i, i2);
    }

    public abstract boolean e();

    public void f(int i, String str) {
        if (w().length() - i >= str.length()) {
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                if (str.charAt(i2) == (w().charAt(i + i2) | ' ')) {
                    i2++;
                } else {
                    u(this, "Expected valid boolean literal prefix, but had '" + p() + '\'', 0, (String) null, 6);
                    throw null;
                }
            }
            this.x = str.length() + i;
            return;
        }
        u(this, "Unexpected end of boolean literal", 0, (String) null, 6);
        throw null;
    }

    public abstract String g();

    public abstract byte h();

    public boolean hasNext() {
        if (((Map.Entry) this.B) != null) {
            return true;
        }
        return false;
    }

    public byte j(byte b) {
        int i;
        String str;
        byte h = h();
        if (h == b) {
            return h;
        }
        String a0 = fd1.a0(b);
        int i2 = this.x;
        if (i2 > 0) {
            i = i2 - 1;
        } else {
            i = i2;
        }
        if (i2 == w().length() || i < 0) {
            str = "EOF";
        } else {
            str = String.valueOf(w().charAt(i));
        }
        u(this, pb4.m("Expected ", a0, ", but had '", str, "' instead"), i, (String) null, 4);
        throw null;
    }

    public abstract void k(char c);

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01be, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01bf, code lost:
        if (r21 == false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01c1, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c6, code lost:
        if (r14 == Long.MIN_VALUE) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c9, code lost:
        return -r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ca, code lost:
        u(r0, "Numeric value overflow", 0, (java.lang.String) null, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01cf, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d0, code lost:
        u(r0, "Expected numeric literal", r11, (java.lang.String) null, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d6, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0137, code lost:
        if (r11 == r1) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0139, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013c, code lost:
        if (r1 == r11) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013e, code lost:
        if (r21 == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0142, code lost:
        if (r1 == (r11 - 1)) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0148, code lost:
        if (r19 == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014a, code lost:
        if (r2 == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0156, code lost:
        if (w().charAt(r11) != '\"') goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0158, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015b, code lost:
        u(r0, "Expected closing quotation mark", r11, (java.lang.String) null, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0162, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0163, code lost:
        u(r0, "EOF", 0, (java.lang.String) null, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0169, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x016a, code lost:
        r0.x = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016c, code lost:
        if (r20 == false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x016e, code lost:
        r1 = (double) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0171, code lost:
        if (r8 != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0173, code lost:
        r5 = java.lang.Math.pow(10.0d, -((double) r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x017b, code lost:
        if (r8 != true) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017d, code lost:
        r5 = java.lang.Math.pow(10.0d, (double) r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0182, code lost:
        r1 = r1 * r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0187, code lost:
        if (r1 > 9.223372036854776E18d) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x018d, code lost:
        if (r1 < -9.223372036854776E18d) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0195, code lost:
        if (java.lang.Math.floor(r1) != r1) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0197, code lost:
        r14 = (long) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x019a, code lost:
        u(r0, "Can't convert " + r1 + " to Long", 0, (java.lang.String) null, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b3, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b4, code lost:
        u(r0, "Numeric value overflow", 0, (java.lang.String) null, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ba, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01bb, code lost:
        defpackage.h.c();
     */
    public long l() {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        char charAt;
        boolean z6;
        int B2 = B(C());
        if (B2 >= w().length() || B2 == -1) {
            u(this, "EOF", 0, (String) null, 6);
            throw null;
        }
        if (w().charAt(B2) == '\"') {
            B2++;
            if (B2 != w().length()) {
                z2 = true;
            } else {
                u(this, "EOF", 0, (String) null, 6);
                throw null;
            }
        } else {
            z2 = false;
        }
        int i = B2;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        long j = 0;
        long j2 = 0;
        while (true) {
            if (i == w().length()) {
                z3 = z2;
                z4 = z8;
                z5 = z9;
                break;
            }
            charAt = w().charAt(i);
            z3 = z2;
            if ((charAt != 'e' && charAt != 'E') || z8) {
                z4 = z8;
                if (charAt != '-' || !z4) {
                    if (charAt != '+' || !z4) {
                        z5 = z9;
                        if (charAt != '-') {
                            if (fd1.t(charAt) != 0) {
                                break;
                            }
                            int i2 = i + 1;
                            int i3 = charAt - '0';
                            if (i3 < 0 || i3 >= 10) {
                                u(this, "Unexpected symbol '" + charAt + "' in numeric literal", i, (String) null, 4);
                            } else {
                                if (z4) {
                                    j = (j * 10) + ((long) i3);
                                } else {
                                    j2 = (j2 * 10) - ((long) i3);
                                    if (j2 > 0) {
                                        u(this, "Numeric value overflow", 0, (String) null, 6);
                                        throw null;
                                    }
                                }
                                i = i2;
                                z6 = z3;
                                z8 = z4;
                                z9 = z5;
                            }
                        } else if (i == B2) {
                            i++;
                            z6 = z3;
                            z8 = z4;
                            z9 = true;
                        } else {
                            u(this, "Unexpected symbol '-' in numeric literal", i, (String) null, 4);
                            throw null;
                        }
                    } else if (i != B2) {
                        i++;
                        z6 = z3;
                        z8 = z4;
                        z7 = true;
                    } else {
                        u(this, "Unexpected symbol '+' in numeric literal", i, (String) null, 4);
                        throw null;
                    }
                } else if (i != B2) {
                    i++;
                    z6 = z3;
                    z8 = z4;
                    z7 = false;
                } else {
                    u(this, "Unexpected symbol '-' in numeric literal", i, (String) null, 4);
                    throw null;
                }
            } else if (i != B2) {
                i++;
                z6 = z3;
                z7 = true;
                z8 = true;
            } else {
                u(this, "Unexpected symbol '" + charAt + "' in numeric literal", i, (String) null, 4);
                throw null;
            }
        }
        u(this, "Unexpected symbol '" + charAt + "' in numeric literal", i, (String) null, 4);
        throw null;
    }

    public String n() {
        String str = (String) this.A;
        if (str == null) {
            return g();
        }
        str.getClass();
        this.A = null;
        return str;
    }

    public String o(CharSequence charSequence, int i, int i2) {
        String str;
        char c;
        StringBuilder sb = (StringBuilder) this.B;
        charSequence.getClass();
        char charAt = charSequence.charAt(i2);
        boolean z2 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                c(i, i2);
                int B2 = B(i2 + 1);
                if (B2 != -1) {
                    int i3 = B2 + 1;
                    char charAt2 = w().charAt(B2);
                    if (charAt2 == 'u') {
                        i3 = b(i3, w());
                    } else {
                        if (charAt2 < 'u') {
                            c = bo0.a[charAt2];
                        } else {
                            c = 0;
                        }
                        if (c != 0) {
                            sb.append(c);
                        } else {
                            u(this, "Invalid escaped char '" + charAt2 + '\'', 0, (String) null, 6);
                            throw null;
                        }
                    }
                    i = B(i3);
                    if (i == -1) {
                        u(this, "Unexpected EOF", i, (String) null, 4);
                        throw null;
                    }
                } else {
                    u(this, "Expected escape sequence to continue, got EOF", 0, (String) null, 6);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    c(i, i2);
                    i = B(i2);
                    if (i == -1) {
                        u(this, "Unexpected EOF", i, (String) null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i2);
                }
            }
            i2 = i;
            z2 = true;
            charAt = charSequence.charAt(i2);
        }
        if (!z2) {
            str = D(i, i2);
        } else {
            c(i, i2);
            str = sb.toString();
            sb.setLength(0);
        }
        this.x = i2 + 1;
        return str;
    }

    public String p() {
        String str;
        StringBuilder sb = (StringBuilder) this.B;
        String str2 = (String) this.A;
        if (str2 != null) {
            str2.getClass();
            this.A = null;
            return str2;
        }
        int C = C();
        if (C >= w().length() || C == -1) {
            u(this, "EOF", C, (String) null, 4);
            throw null;
        }
        byte t = fd1.t(w().charAt(C));
        if (t == 1) {
            return n();
        }
        if (t == 0) {
            boolean z2 = false;
            while (fd1.t(w().charAt(C)) == 0) {
                C++;
                if (C >= w().length()) {
                    c(this.x, C);
                    int B2 = B(C);
                    if (B2 == -1) {
                        this.x = C;
                        c(0, 0);
                        String sb2 = sb.toString();
                        sb.setLength(0);
                        return sb2;
                    }
                    C = B2;
                    z2 = true;
                }
            }
            int i = this.x;
            if (!z2) {
                str = D(i, C);
            } else {
                c(i, C);
                String sb3 = sb.toString();
                sb.setLength(0);
                str = sb3;
            }
            this.x = C;
            return str;
        }
        u(this, "Expected beginning of the string, but got " + w().charAt(C), 0, (String) null, 6);
        throw null;
    }

    public String q() {
        String p = p();
        if (!sg3.e(p, "null") || w().charAt(this.x - 1) == '\"') {
            return p;
        }
        u(this, "Unexpected 'null' value instead of string literal", 0, (String) null, 6);
        throw null;
    }

    public void remove() {
        ay6 ay6 = (ay6) this.y;
        if (ay6.b().d == this.x) {
            Map.Entry entry = (Map.Entry) this.A;
            if (entry != null) {
                ay6.remove(entry.getKey());
                this.A = null;
                this.x = ay6.b().d;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }

    public void s() {
        if (h() != 10) {
            u(this, "Expected EOF after parsing, but had " + w().charAt(this.x - 1) + " instead", 0, (String) null, 6);
            throw null;
        }
    }

    public void t(int i, String str, String str2) {
        String str3;
        String e = ((kb9) this.z).e();
        CharSequence w2 = w();
        w2.getClass();
        if (((wl3) this.y).k) {
            str3 = ar7.J(i, w2).toString();
        } else {
            str3 = null;
        }
        throw new JsonException(ar7.t(i, str, e, str2, str3));
    }

    public String toString() {
        switch (this.w) {
            case b85.b:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(w());
                sb.append("', currentPosition=");
                return f21.j(sb, this.x, ')');
            default:
                return super.toString();
        }
    }

    public int v(int i, CharSequence charSequence) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        u(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, (String) null, 6);
        throw null;
    }

    public abstract CharSequence w();

    public abstract String y(String str, boolean z2);

    public byte z() {
        CharSequence w2 = w();
        int i = this.x;
        while (true) {
            int B2 = B(i);
            if (B2 != -1) {
                char charAt = w2.charAt(B2);
                if (charAt == 9 || charAt == 10 || charAt == 13 || charAt == ' ') {
                    i = B2 + 1;
                } else {
                    this.x = B2;
                    return fd1.t(charAt);
                }
            } else {
                this.x = B2;
                return 10;
            }
        }
    }

    public void r() {
    }

    public z1(ay6 ay6, Iterator it) {
        this.y = ay6;
        this.z = it;
        this.x = ay6.b().d;
        a();
    }
}
