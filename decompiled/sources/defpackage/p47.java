package defpackage;

/* renamed from: p47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class p47 extends z1 {
    public final String C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p47(String str, wl3 wl3) {
        super(wl3);
        str.getClass();
        this.C = str;
    }

    public final int B(int i) {
        if (i < this.C.length()) {
            return i;
        }
        return -1;
    }

    public int C() {
        char charAt;
        int i = this.x;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.C;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                this.x = i;
            } else {
                i++;
            }
        }
        this.x = i;
        return i;
    }

    public boolean e() {
        int i = this.x;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.C;
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                    i++;
                } else {
                    this.x = i;
                    return z1.x(charAt);
                }
            } else {
                this.x = i;
                return false;
            }
        }
    }

    public final String g() {
        String str;
        k('\"');
        int i = this.x;
        String str2 = this.C;
        int F0 = d57.F0(str2, '\"', i, 4);
        if (F0 == -1) {
            p();
            int i2 = this.x;
            if (i2 == str2.length() || i2 < 0) {
                str = "EOF";
            } else {
                str = String.valueOf(str2.charAt(i2));
            }
            z1.u(this, f21.h("Expected quotation mark '\"', but had '", str, "' instead"), i2, (String) null, 4);
            throw null;
        }
        for (int i3 = i; i3 < F0; i3++) {
            if (str2.charAt(i3) == '\\') {
                return o(str2, this.x, i3);
            }
        }
        this.x = F0 + 1;
        return str2.substring(i, F0);
    }

    public byte h() {
        String str;
        int i = this.x;
        while (true) {
            str = this.C;
            if (i == -1 || i >= str.length()) {
                this.x = str.length();
            } else {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                    i = i2;
                } else {
                    this.x = i2;
                    return fd1.t(charAt);
                }
            }
        }
        this.x = str.length();
        return 10;
    }

    public void k(char c) {
        int i = this.x;
        if (i != -1) {
            while (true) {
                String str = this.C;
                if (i < str.length()) {
                    int i2 = i + 1;
                    char charAt = str.charAt(i);
                    if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                        i = i2;
                    } else {
                        this.x = i2;
                        if (charAt != c) {
                            F(c);
                            throw null;
                        }
                        return;
                    }
                } else {
                    this.x = -1;
                    F(c);
                    throw null;
                }
            }
        } else {
            F(c);
            throw null;
        }
    }

    public final CharSequence w() {
        return this.C;
    }

    public final String y(String str, boolean z) {
        str.getClass();
        int i = this.x;
        try {
            if (h() == 6) {
                if (sg3.e(A(z), str)) {
                    this.A = null;
                    if (h() == 5) {
                        String A = A(z);
                        this.x = i;
                        this.A = null;
                        return A;
                    }
                }
            }
            return null;
        } finally {
            this.x = i;
            this.A = null;
        }
    }
}
