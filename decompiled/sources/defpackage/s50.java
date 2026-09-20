package defpackage;

/* renamed from: s50  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s50 extends u50 {
    public final char[] d = new char[512];

    /* JADX WARNING: Illegal instructions before constructor call */
    public s50() {
        super(new r50("base16()", r1), (Character) null);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.d;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    public final void c(StringBuilder sb, byte[] bArr, int i) {
        g75.n(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2] & 255;
            char[] cArr = this.d;
            sb.append(cArr[b]);
            sb.append(cArr[b | 256]);
        }
    }
}
