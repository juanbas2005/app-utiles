package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: u50  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class u50 {
    public static final t50 c = new t50("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    public final r50 a;
    public final Character b;

    static {
        new t50("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new u50("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new u50("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new s50();
    }

    public u50(r50 r50, Character ch) {
        boolean z;
        this.a = r50;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = r50.g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                g75.i(z, "Padding character %s was already in alphabet", ch);
                this.b = ch;
            }
        }
        z = true;
        g75.i(z, "Padding character %s was already in alphabet", ch);
        this.b = ch;
    }

    public final String a(byte[] bArr) {
        int length = bArr.length;
        g75.n(0, length, bArr.length);
        r50 r50 = this.a;
        int i = r50.e;
        int i2 = r50.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(kl8.l(length, i2) * i);
        try {
            c(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        boolean z;
        g75.n(i, i + i2, bArr.length);
        r50 r50 = this.a;
        int i3 = r50.f;
        int i4 = r50.d;
        int i5 = 0;
        if (i2 <= i3) {
            z = true;
        } else {
            z = false;
        }
        g75.h(z);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(r50.b[((int) (j >>> (i7 - i5))) & r50.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < r50.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        g75.n(0, i, bArr.length);
        while (i2 < i) {
            r50 r50 = this.a;
            b(sb, bArr, i2, Math.min(r50.f, i - i2));
            i2 += r50.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u50) {
            u50 u50 = (u50) obj;
            if (!this.a.equals(u50.a) || !a35.h(this.b, u50.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b}) ^ Arrays.hashCode(this.a.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        r50 r50 = this.a;
        sb.append(r50.a);
        if (8 % r50.d != 0) {
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

    public u50(String str, String str2) {
        this(new r50(str, str2.toCharArray()), (Character) '=');
    }
}
