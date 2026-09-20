package defpackage;

/* renamed from: ny8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ny8 extends py8 {
    /* JADX WARNING: Illegal instructions before constructor call */
    public ny8(String str, String str2) {
        super(new jy8(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        if (charArray.length != 64) {
            ku4.v();
            throw null;
        }
    }

    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        g75.b0(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            byte b = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            jy8 jy8 = this.a;
            char[] cArr = jy8.b;
            char[] cArr2 = jy8.b;
            sb.append(cArr[b >>> 18]);
            sb.append(cArr2[(b >>> 12) & 63]);
            sb.append(cArr2[(b >>> 6) & 63]);
            sb.append(cArr2[b & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            b(sb, bArr, i2, i - i2);
        }
    }
}
