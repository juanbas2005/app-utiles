package defpackage;

/* renamed from: sw5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class sw5 extends z1 {
    public final f96 C;
    public int D = 128;
    public final yr E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sw5(f96 f96, char[] cArr, wl3 wl3) {
        super(wl3);
        wl3.getClass();
        this.C = f96;
        this.E = new yr(cArr);
        G(0);
    }

    public final int B(int i) {
        yr yrVar = this.E;
        if (i < yrVar.x) {
            return i;
        }
        this.x = i;
        r();
        if (this.x != 0 || yrVar.length() == 0) {
            return -1;
        }
        return 0;
    }

    public int C() {
        int B;
        char c;
        int i = this.x;
        while (true) {
            B = B(i);
            if (B == -1 || !((c = this.E.w[B]) == ' ' || c == 10 || c == 13 || c == 9)) {
                this.x = B;
            } else {
                i = B + 1;
            }
        }
        this.x = B;
        return B;
    }

    public final String D(int i, int i2) {
        yr yrVar = this.E;
        return k57.j0(yrVar.w, i, Math.min(i2, yrVar.x));
    }

    public final void G(int i) {
        yr yrVar = this.E;
        char[] cArr = yrVar.w;
        if (i != 0) {
            int i2 = this.x;
            System.arraycopy(cArr, i2, cArr, 0, (i2 + i) - i2);
        }
        int i3 = yrVar.x;
        while (true) {
            if (i == i3) {
                break;
            }
            f96 f96 = this.C;
            f96.getClass();
            int a = ((lo0) f96.x).a(cArr, i, i3 - i);
            if (a == -1) {
                yrVar.x = Math.min(yrVar.w.length, i);
                this.D = -1;
                break;
            }
            i += a;
        }
        this.x = 0;
    }

    public final void c(int i, int i2) {
        ((StringBuilder) this.B).append(this.E.w, i, i2 - i);
    }

    public boolean e() {
        r();
        int i = this.x;
        while (true) {
            int B = B(i);
            if (B != -1) {
                char c = this.E.w[B];
                if (c == ' ' || c == 10 || c == 13 || c == 9) {
                    i = B + 1;
                } else {
                    this.x = B;
                    return z1.x(c);
                }
            } else {
                this.x = B;
                return false;
            }
        }
    }

    public final String g() {
        int i;
        String str;
        k('\"');
        int i2 = this.x;
        yr yrVar = this.E;
        int i3 = yrVar.x;
        char[] cArr = yrVar.w;
        int i4 = i2;
        while (true) {
            if (i4 >= i3) {
                i4 = -1;
                break;
            } else if (cArr[i4] == '\"') {
                break;
            } else {
                i4++;
            }
        }
        if (i4 == -1) {
            int B = B(i2);
            int i5 = this.x;
            if (B != -1) {
                return o(yrVar, i5, B);
            }
            if (i5 > 0) {
                i = i5 - 1;
            } else {
                i = i5;
            }
            if (i5 == yrVar.x || i < 0) {
                str = "EOF";
            } else {
                str = String.valueOf(yrVar.w[i]);
            }
            z1.u(this, f21.h("Expected quotation mark '\"', but had '", str, "' instead"), i, (String) null, 4);
            throw null;
        }
        for (int i6 = i2; i6 < i4; i6++) {
            if (cArr[i6] == '\\') {
                return o(yrVar, this.x, i6);
            }
        }
        this.x = i4 + 1;
        return k57.j0(cArr, i2, Math.min(i4, yrVar.x));
    }

    public byte h() {
        r();
        int i = this.x;
        while (true) {
            int B = B(i);
            if (B != -1) {
                int i2 = B + 1;
                byte t = fd1.t(this.E.w[B]);
                if (t != 3) {
                    this.x = i2;
                    return t;
                }
                i = i2;
            } else {
                this.x = B;
                return 10;
            }
        }
    }

    public void k(char c) {
        r();
        int i = this.x;
        while (true) {
            int B = B(i);
            if (B != -1) {
                int i2 = B + 1;
                char c2 = this.E.w[B];
                if (c2 == ' ' || c2 == 10 || c2 == 13 || c2 == 9) {
                    i = i2;
                } else {
                    this.x = i2;
                    if (c2 != c) {
                        F(c);
                        throw null;
                    }
                    return;
                }
            } else {
                this.x = B;
                F(c);
                throw null;
            }
        }
    }

    public final void r() {
        int i = this.E.x - this.x;
        if (i <= this.D) {
            G(i);
        }
    }

    public final CharSequence w() {
        return this.E;
    }

    public final String y(String str, boolean z) {
        str.getClass();
        return null;
    }
}
