package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* renamed from: py8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class py8 {
    public static final my8 d = new my8(new jy8("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    public final jy8 a;
    public final Character b;
    public volatile py8 c;

    static {
        new ny8("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new ny8("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new py8("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new py8("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
    }

    public py8(jy8 jy8, Character ch) {
        this.a = jy8;
        if (ch != null) {
            byte[] bArr = jy8.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                h.q(h75.J("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        g75.b0(0, i, bArr.length);
        while (i2 < i) {
            jy8 jy8 = this.a;
            b(sb, bArr, i2, Math.min(jy8.f, i - i2));
            i2 += jy8.f;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        g75.b0(i, i + i2, bArr.length);
        jy8 jy8 = this.a;
        int i3 = jy8.f;
        int i4 = jy8.d;
        if (i2 <= i3) {
            int i5 = 0;
            long j = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                j = (j | ((long) (bArr[i + i6] & 255))) << 8;
            }
            int i7 = (i2 + 1) * 8;
            while (i5 < i2 * 8) {
                sb.append(jy8.b[((int) (j >>> ((i7 - i4) - i5))) & jy8.c]);
                i5 += i4;
            }
            if (this.b != null) {
                while (i5 < jy8.f * 8) {
                    sb.append('=');
                    i5 += i4;
                }
                return;
            }
            return;
        }
        ku4.v();
    }

    public final String c(int i, byte[] bArr) {
        g75.b0(0, i, bArr.length);
        jy8 jy8 = this.a;
        int i2 = jy8.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(jy8.e * w95.m(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof py8) {
            py8 py8 = (py8) obj;
            if (!this.a.equals(py8.a) || !Objects.equals(this.b, py8.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        jy8 jy8 = this.a;
        sb.append(jy8);
        if (8 % jy8.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public py8(String str, String str2) {
        this(new jy8(str, str2.toCharArray()), (Character) '=');
    }
}
