package defpackage;

/* renamed from: my8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class my8 extends py8 {
    public final char[] e = new char[512];

    public my8(jy8 jy8) {
        super(jy8, (Character) null);
        char[] cArr = jy8.b;
        if (cArr.length == 16) {
            for (int i = 0; i < 256; i++) {
                char[] cArr2 = this.e;
                cArr2[i] = cArr[i >>> 4];
                cArr2[i | 256] = cArr[i & 15];
            }
            return;
        }
        ku4.v();
        throw null;
    }

    public final void a(StringBuilder sb, byte[] bArr, int i) {
        g75.b0(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[b]);
            sb.append(cArr[b | 256]);
        }
    }
}
