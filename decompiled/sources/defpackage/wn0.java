package defpackage;

import java.util.ArrayList;

/* renamed from: wn0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wn0 implements CharSequence, Appendable {
    public boolean A;
    public int B;
    public int C;
    public final y25 w;
    public ArrayList x;
    public char[] y;
    public String z;

    public wn0() {
        y25 y25 = zn0.a;
        y25.getClass();
        this.w = y25;
    }

    public final char[] a(int i) {
        ArrayList arrayList = this.x;
        if (arrayList != null) {
            char[] cArr = this.y;
            cArr.getClass();
            return (char[]) arrayList.get(i / cArr.length);
        } else if (i < 2048) {
            char[] cArr2 = this.y;
            if (cArr2 != null) {
                return cArr2;
            }
            e(i);
            throw null;
        } else {
            e(i);
            throw null;
        }
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return this;
        }
        int i3 = i;
        while (i3 < i2) {
            char[] d = d();
            int length = d.length;
            int i4 = this.B;
            int i5 = length - i4;
            int min = Math.min(i2 - i3, i4);
            for (int i6 = 0; i6 < min; i6++) {
                d[i5 + i6] = charSequence.charAt(i3 + i6);
            }
            i3 += min;
            this.B -= min;
        }
        this.z = null;
        this.C = (i2 - i) + this.C;
        return this;
    }

    public final CharSequence b(int i, int i2) {
        if (i == i2) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        for (int i3 = i - (i % 2048); i3 < i2; i3 += 2048) {
            char[] a = a(i3);
            int min = Math.min(i2 - i3, 2048);
            for (int max = Math.max(0, i - i3); max < min; max++) {
                sb.append(a[max]);
            }
        }
        return sb;
    }

    public final char c(int i) {
        char[] a = a(i);
        char[] cArr = this.y;
        cArr.getClass();
        return a[i % cArr.length];
    }

    public final char charAt(int i) {
        if (i < 0) {
            h.j(hl6.k(i, "index is negative: "));
            return 0;
        } else if (i < this.C) {
            return c(i);
        } else {
            h.j(f21.j(pb4.o(i, "index ", " is not in range [0, "), this.C, ')'));
            return 0;
        }
    }

    public final char[] d() {
        if (this.B == 0) {
            char[] cArr = (char[]) this.w.s();
            char[] cArr2 = this.y;
            this.y = cArr;
            this.B = cArr.length;
            this.A = false;
            if (cArr2 != null) {
                ArrayList arrayList = this.x;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.x = arrayList;
                    arrayList.add(cArr2);
                }
                arrayList.add(cArr);
            }
            return cArr;
        }
        char[] cArr3 = this.y;
        cArr3.getClass();
        return cArr3;
    }

    public final void e(int i) {
        if (this.A) {
            throw new IllegalStateException("Buffer is already released");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is not in range [0; ");
        char[] cArr = this.y;
        cArr.getClass();
        sb.append(cArr.length - this.B);
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (this.C == charSequence.length()) {
                int i = this.C;
                for (int i2 = 0; i2 < i; i2++) {
                    if (c(i2) != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.z;
        if (str != null) {
            return str.hashCode();
        }
        int i = this.C;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + c(i3);
        }
        return i2;
    }

    public final int length() {
        return this.C;
    }

    public final CharSequence subSequence(int i, int i2) {
        if (i > i2) {
            h.h(i, i2, ") should be less or equal to endIndex (", "startIndex (");
            return null;
        } else if (i < 0) {
            h.j(hl6.k(i, "startIndex is negative: "));
            return null;
        } else if (i2 <= this.C) {
            return new un0(this, i, i2);
        } else {
            h.j(f21.j(pb4.o(i2, "endIndex (", ") is greater than length ("), this.C, ')'));
            return null;
        }
    }

    public final String toString() {
        String str = this.z;
        if (str != null) {
            return str;
        }
        String obj = b(0, this.C).toString();
        this.z = obj;
        return obj;
    }

    public final Appendable append(char c) {
        char[] d = d();
        char[] cArr = this.y;
        cArr.getClass();
        int length = cArr.length;
        int i = this.B;
        d[length - i] = c;
        this.z = null;
        this.B = i - 1;
        this.C++;
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }
}
