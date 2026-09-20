package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;
import java.io.OutputStream;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: xs0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class xs0 implements wb6 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public xs0(CharSequence charSequence, int i, Locale locale) {
        this.a = 5;
        this.d = charSequence;
        if (charSequence.length() < 0) {
            zb3.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            zb3.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new go0(i, charSequence));
    }

    public static boolean F(int i) {
        if (i == 32 || i == 10 || i == 13 || i == 9) {
            return true;
        }
        return false;
    }

    public static xs0 G(OutputStream outputStream, int i) {
        return new xs0(outputStream, new byte[i]);
    }

    public static int k(int i, int i2) {
        return m(i2) + r(i);
    }

    public static int l(int i, int i2) {
        return m(i2) + r(i);
    }

    public static int m(int i) {
        if (i >= 0) {
            return p(i);
        }
        return 10;
    }

    public static int n(int i, k2 k2Var) {
        return o(k2Var) + r(i);
    }

    public static int o(k2 k2Var) {
        int c2 = k2Var.c();
        return p(c2) + c2;
    }

    public static int p(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((i & -268435456) == 0) {
            return 4;
        }
        return 5;
    }

    public static int q(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        if ((j & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int r(int i) {
        return p(i << 3);
    }

    public boolean A(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return b85.n(Character.codePointBefore((CharSequence) this.d, i));
    }

    public boolean B(int i) {
        h(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (D(i) && D(i - 1) && D(i + 1)) {
            return false;
        }
        if (i <= 0 || i >= ((CharSequence) this.d).length() - 1 || (!C(i) && !C(i + 1))) {
            return true;
        }
        return false;
    }

    public boolean C(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (sg3.e(of, unicodeBlock) && sg3.e(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        if (!sg3.e(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) || !sg3.e(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA)) {
            return false;
        }
        return true;
    }

    public boolean D(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!w22.d()) {
                return false;
            }
            w22 a2 = w22.a();
            if (a2.c() != 1 || a2.b(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean E(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return b85.n(Character.codePointAt((CharSequence) this.d, i));
    }

    public int H(int i) {
        h(i);
        int following = ((BreakIterator) this.e).following(i);
        if (!D(following - 1) || !D(following) || C(following)) {
            return following;
        }
        return H(following);
    }

    public Integer I() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        this.b = i + 1;
        return Integer.valueOf(((String) this.d).charAt(i));
    }

    public float J() {
        bc4 bc4 = (bc4) this.e;
        float o = bc4.o(this.b, this.c, (String) this.d);
        if (!Float.isNaN(o)) {
            this.b = bc4.x;
        }
        return o;
    }

    public pb6 K() {
        float J = J();
        if (Float.isNaN(J)) {
            return null;
        }
        int O = O();
        if (O == 0) {
            return new pb6(1, J);
        }
        return new pb6(O, J);
    }

    public String L() {
        String str = (String) this.d;
        if (v()) {
            return null;
        }
        int i = this.b;
        char charAt = str.charAt(i);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        int g = g();
        while (g != -1 && g != charAt) {
            g = g();
        }
        if (g == -1) {
            this.b = i;
            return null;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        return str.substring(i + 1, i2);
    }

    public String M() {
        return N(' ', false);
    }

    public String N(char c2, boolean z) {
        String str = (String) this.d;
        if (v()) {
            return null;
        }
        char charAt = str.charAt(this.b);
        if ((!z && F(charAt)) || charAt == c2) {
            return null;
        }
        int i = this.b;
        int g = g();
        while (g != -1 && g != c2 && (z || !F(g))) {
            g = g();
        }
        return str.substring(i, this.b);
    }

    public int O() {
        String str = (String) this.d;
        if (v()) {
            return 0;
        }
        char charAt = str.charAt(this.b);
        int i = this.b;
        if (charAt == '%') {
            this.b = i + 1;
            return 9;
        } else if (i > this.c - 2) {
            return 0;
        } else {
            try {
                int u = pb4.u(str.substring(i, i + 2).toLowerCase(Locale.US));
                this.b += 2;
                return u;
            } catch (IllegalArgumentException unused) {
                return 0;
            }
        }
    }

    public float P() {
        T();
        bc4 bc4 = (bc4) this.e;
        float o = bc4.o(this.b, this.c, (String) this.d);
        if (!Float.isNaN(o)) {
            this.b = bc4.x;
        }
        return o;
    }

    public int Q(int i) {
        h(i);
        int preceding = ((BreakIterator) this.e).preceding(i);
        if (!D(preceding) || !z(preceding) || C(preceding)) {
            return preceding;
        }
        return Q(preceding);
    }

    public void R() {
        ((OutputStream) this.e).write((byte[]) this.d, 0, this.c);
        this.c = 0;
    }

    public void S(int i, int i2, String str) {
        if (i > i2) {
            zb3.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            zb3.a("start must be non-negative, but was " + i);
        }
        tt2 tt2 = (tt2) this.e;
        if (tt2 == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - min;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = max - min2;
            int i5 = min2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            tt2 tt22 = new tt2(0);
            tt22.b = max;
            tt22.e = cArr;
            tt22.c = str.length() + min;
            tt22.d = i4;
            this.e = tt22;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > tt2.b - tt2.d()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            S(i, i2, str);
            return;
        }
        int length = str.length() - (i8 - i7);
        if (length > tt2.d()) {
            int d2 = length - tt2.d();
            int i9 = tt2.b;
            do {
                i9 *= 2;
            } while (i9 - tt2.b < d2);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) tt2.e, 0, cArr2, 0, tt2.c);
            int i10 = tt2.b;
            int i11 = tt2.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) tt2.e, i11, cArr2, i13, (i12 + i11) - i11);
            tt2.e = cArr2;
            tt2.b = i9;
            tt2.d = i13;
        }
        int i14 = tt2.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) tt2.e;
            System.arraycopy(cArr3, i8, cArr3, tt2.d - i15, i15);
            tt2.c = i7;
            tt2.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int d3 = tt2.d() + i8;
            int i16 = tt2.d;
            int d4 = (tt2.d() + i7) - i16;
            char[] cArr4 = (char[]) tt2.e;
            System.arraycopy(cArr4, i16, cArr4, tt2.c, d4);
            tt2.c += d4;
            tt2.d = d3;
        } else {
            tt2.d = tt2.d() + i8;
            tt2.c = i7;
        }
        str.getChars(0, str.length(), (char[]) tt2.e, tt2.c);
        tt2.c = str.length() + tt2.c;
    }

    public boolean T() {
        U();
        int i = this.b;
        if (i == this.c || ((String) this.d).charAt(i) != ',') {
            return false;
        }
        this.b++;
        U();
        return true;
    }

    public void U() {
        while (true) {
            int i = this.b;
            if (i < this.c && F(((String) this.d).charAt(i))) {
                this.b++;
            } else {
                return;
            }
        }
    }

    public void V(int i, int i2) {
        h0(i, 0);
        X(i2);
    }

    public void W(int i, int i2) {
        h0(i, 0);
        X(i2);
    }

    public void X(int i) {
        if (i >= 0) {
            f0(i);
        } else {
            g0((long) i);
        }
    }

    public void Y(int i, k2 k2Var) {
        h0(i, 2);
        Z(k2Var);
    }

    public void Z(k2 k2Var) {
        f0(k2Var.c());
        k2Var.f(this);
    }

    public void a(float f, float f2, float f3, float f4) {
        f((byte) 3);
        u(4);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        this.c = i + 4;
        fArr[i4] = f4;
    }

    public void a0(int i) {
        byte b2 = (byte) i;
        if (this.c == this.b) {
            R();
        }
        int i2 = this.c;
        this.c = i2 + 1;
        ((byte[]) this.d)[i2] = b2;
    }

    public void b(float f, float f2) {
        f((byte) 0);
        u(2);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    public void b0(bg0 bg0) {
        int size = bg0.size();
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        byte[] bArr = (byte[]) this.d;
        if (i3 >= size) {
            bg0.g(0, i2, size, bArr);
            this.c += size;
            return;
        }
        bg0.g(0, i2, i3, bArr);
        int i4 = size - i3;
        this.c = i;
        R();
        if (i4 <= i) {
            bg0.g(i3, 0, i4, bArr);
            this.c = i4;
            return;
        }
        OutputStream outputStream = (OutputStream) this.e;
        if (i3 < 0) {
            h.g(30, i3, "Source offset < 0: ");
        } else if (i4 >= 0) {
            int i5 = i3 + i4;
            if (i5 > bg0.size()) {
                h.g(39, i5, "Source end offset exceeded: ");
            } else if (i4 > 0) {
                bg0.A(outputStream, i3, i4);
            }
        } else {
            h.g(23, i4, "Length < 0: ");
        }
    }

    public void c(float f, float f2, float f3, float f4, float f5, float f6) {
        f((byte) 2);
        u(6);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.c = i5;
        fArr[i4] = f4;
        int i6 = i + 5;
        this.c = i6;
        fArr[i5] = f5;
        this.c = i + 6;
        fArr[i6] = f6;
    }

    public void c0(byte[] bArr) {
        int length = bArr.length;
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        byte[] bArr2 = (byte[]) this.d;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i2, length);
            this.c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i2, i3);
        int i4 = length - i3;
        this.c = i;
        R();
        if (i4 <= i) {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.c = i4;
            return;
        }
        ((OutputStream) this.e).write(bArr, i3, i4);
    }

    public void close() {
        f((byte) 8);
    }

    public void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        char c2;
        if (z) {
            c2 = 2;
        } else {
            c2 = 0;
        }
        f((c2 | true) | z2 ? (byte) 1 : 0);
        u(5);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.c = i5;
        fArr[i4] = f4;
        this.c = i + 5;
        fArr[i5] = f5;
    }

    public void d0(int i) {
        a0(i & 255);
        a0((i >> 8) & 255);
        a0((i >> 16) & 255);
        a0((i >> 24) & 255);
    }

    public void e(float f, float f2) {
        f((byte) 1);
        u(2);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    public void e0(long j) {
        a0(((int) j) & 255);
        a0(((int) (j >> 8)) & 255);
        a0(((int) (j >> 16)) & 255);
        a0(((int) (j >> 24)) & 255);
        a0(((int) (j >> 32)) & 255);
        a0(((int) (j >> 40)) & 255);
        a0(((int) (j >> 48)) & 255);
        a0(((int) (j >> 56)) & 255);
    }

    public void f(byte b2) {
        int i = this.b;
        byte[] bArr = (byte[]) this.d;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[(bArr.length * 2)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.d = bArr2;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        ((byte[]) this.d)[i2] = b2;
    }

    public void f0(int i) {
        while ((i & -128) != 0) {
            a0((i & 127) | 128);
            i >>>= 7;
        }
        a0(i);
    }

    public int g() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.b = i3;
        if (i3 < i2) {
            return ((String) this.d).charAt(i3);
        }
        return -1;
    }

    public void g0(long j) {
        while ((-128 & j) != 0) {
            a0((((int) j) & 127) | 128);
            j >>>= 7;
        }
        a0((int) j);
    }

    public void h(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (!z) {
            StringBuilder p = pb4.p("Invalid offset: ", i, ". Valid range is [", i2, " , ");
            p.append(i3);
            p.append("]");
            zb3.a(p.toString());
        }
    }

    public void h0(int i, int i2) {
        f0((i << 3) | i2);
    }

    public Boolean i(Object obj) {
        if (obj == null) {
            return null;
        }
        T();
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        char charAt = ((String) this.d).charAt(i);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        boolean z = true;
        this.b++;
        if (charAt != '1') {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public float j(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        T();
        return J();
    }

    public boolean s(char c2) {
        boolean z;
        int i = this.b;
        if (i >= this.c || ((String) this.d).charAt(i) != c2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.b++;
        }
        return z;
    }

    public boolean t(String str) {
        boolean z;
        int length = str.length();
        int i = this.b;
        if (i > this.c - length || !((String) this.d).substring(i, i + length).equals(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.b += length;
        }
        return z;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                tt2 tt2 = (tt2) this.e;
                String str = (String) this.d;
                if (tt2 == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str, 0, this.b);
                sb.append((char[]) tt2.e, 0, tt2.c);
                int i = tt2.d;
                sb.append((char[]) tt2.e, i, tt2.b - i);
                String str2 = (String) this.d;
                sb.append(str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        float[] fArr = (float[]) this.e;
        if (fArr.length < this.c + i) {
            float[] fArr2 = new float[(fArr.length * 2)];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.e = fArr2;
        }
    }

    public boolean v() {
        if (this.b == this.c) {
            return true;
        }
        return false;
    }

    public void w(wb6 wb6) {
        boolean z;
        boolean z2;
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            byte b2 = ((byte[]) this.d)[i2];
            if (b2 == 0) {
                float[] fArr = (float[]) this.e;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                wb6.b(f, fArr[i3]);
            } else if (b2 == 1) {
                float[] fArr2 = (float[]) this.e;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                wb6.e(f2, fArr2[i4]);
            } else if (b2 == 2) {
                float[] fArr3 = (float[]) this.e;
                int i5 = i + 6;
                wb6.c(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                i = i5;
            } else if (b2 == 3) {
                float[] fArr4 = (float[]) this.e;
                int i6 = i + 3;
                i += 4;
                wb6.a(fArr4[i], fArr4[i + 1], fArr4[i + 2], fArr4[i6]);
            } else if (b2 != 8) {
                if ((b2 & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((b2 & 1) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                float[] fArr5 = (float[]) this.e;
                int i7 = i + 5;
                wb6.d(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                i = i7;
            } else {
                wb6.close();
            }
        }
    }

    public void x() {
        R();
    }

    public int y() {
        tt2 tt2 = (tt2) this.e;
        String str = (String) this.d;
        if (tt2 == null) {
            return str.length();
        }
        return (tt2.b - tt2.d()) + (str.length() - (this.c - this.b));
    }

    public boolean z(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!w22.d()) {
                    return false;
                }
                w22 a2 = w22.a();
                if (a2.c() != 1 || a2.b(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public /* synthetic */ xs0(int i) {
        this.a = i;
    }

    public xs0(OutputStream outputStream, byte[] bArr) {
        this.a = 0;
        this.e = outputStream;
        this.d = bArr;
        this.c = 0;
        this.b = bArr.length;
    }

    public xs0(p42 p42, cf4 cf4) {
        this.a = 1;
        this.d = new SparseArray();
        this.e = p42;
        TypedArray typedArray = (TypedArray) cf4.y;
        this.b = typedArray.getResourceId(28, 0);
        this.c = typedArray.getResourceId(53, 0);
    }

    public xs0(String str) {
        this.a = 4;
        this.b = 0;
        this.c = 0;
        this.e = new bc4();
        String trim = str.trim();
        this.d = trim;
        this.c = trim.length();
    }
}
