package defpackage;

/* renamed from: t50  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t50 extends u50 {
    /* JADX WARNING: Illegal instructions before constructor call */
    public t50(String str, String str2) {
        super(new r50(str, r4), (Character) '=');
        boolean z;
        char[] charArray = str2.toCharArray();
        if (charArray.length == 64) {
            z = true;
        } else {
            z = false;
        }
        g75.h(z);
    }

    public final void c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        g75.n(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = (bArr[i2 + 1] & 255) << 8;
            i2 += 3;
            byte b = i5 | ((bArr[i2] & 255) << 16) | (bArr[i4] & 255);
            r50 r50 = this.a;
            char[] cArr = r50.b;
            char[] cArr2 = r50.b;
            sb.append(cArr[b >>> 18]);
            sb.append(cArr2[(b >>> 12) & 63]);
            sb.append(cArr2[(b >>> 6) & 63]);
            sb.append(cArr2[b & 63]);
        }
        if (i2 < i) {
            b(sb, bArr, i2, i - i2);
        }
    }
}
