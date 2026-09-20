package defpackage;

/* renamed from: m50  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class m50 {
    public static final k50 f;
    public static final byte[] g = {13, 10};
    public static final m50 h;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final l50 d;
    public final int e;

    /* JADX WARNING: type inference failed for: r0v0, types: [k50, m50] */
    static {
        l50 l50 = l50.w;
        f = new m50(false, false, -1, l50);
        h = new m50(true, false, -1, l50);
        new m50(false, true, 76, l50);
        new m50(false, true, 64, l50);
    }

    public m50(boolean z, boolean z2, int i, l50 l50) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = l50;
        if (!z || !z2) {
            this.e = i / 4;
        } else {
            h.q("Failed requirement.");
            throw null;
        }
    }

    public static String a(m50 m50, byte[] bArr) {
        byte[] bArr2;
        int i;
        int i2;
        m50 m502 = m50;
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        m502.getClass();
        l50 l50 = m502.d;
        bArr3.getClass();
        ie1.x(0, length, bArr3.length);
        int b2 = m502.b(length);
        byte[] bArr4 = new byte[b2];
        ie1.x(0, length, bArr3.length);
        int b3 = m502.b(length);
        if (b2 < 0) {
            h.l(hl6.k(b2, "destination offset: 0, destination size: "));
            return null;
        } else if (b3 < 0 || b3 > b2) {
            h.l(b81.l(b2, b3, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
            return null;
        } else {
            if (m502.a) {
                bArr2 = n50.c;
            } else {
                bArr2 = n50.a;
            }
            if (m502.b) {
                i = m502.e;
            } else {
                i = Integer.MAX_VALUE;
            }
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i2 = i3 + 2;
                if (i2 >= length) {
                    break;
                }
                int min = Math.min((length - i3) / 3, i);
                for (int i5 = 0; i5 < min; i5++) {
                    int i6 = i3 + 2;
                    i3 += 3;
                    byte b4 = ((bArr3[i3 + 1] & 255) << 8) | ((bArr3[i3] & 255) << 16) | (bArr3[i6] & 255);
                    bArr4[i4] = bArr2[b4 >>> 18];
                    bArr4[i4 + 1] = bArr2[(b4 >>> 12) & 63];
                    int i7 = i4 + 3;
                    bArr4[i4 + 2] = bArr2[(b4 >>> 6) & 63];
                    i4 += 4;
                    bArr4[i7] = bArr2[b4 & 63];
                }
                if (min == i && i3 != length) {
                    int i8 = i4 + 1;
                    byte[] bArr5 = g;
                    bArr4[i4] = bArr5[0];
                    i4 += 2;
                    bArr4[i8] = bArr5[1];
                }
            }
            int i9 = length - i3;
            l50 l502 = l50.y;
            l50 l503 = l50.w;
            if (i9 == 1) {
                int i10 = i3 + 1;
                int i11 = (bArr3[i3] & 255) << 4;
                bArr4[i4] = bArr2[i11 >>> 6];
                int i12 = i4 + 2;
                bArr4[i4 + 1] = bArr2[i11 & 63];
                if (l50 == l503 || l50 == l502) {
                    bArr4[i12] = 61;
                    bArr4[i4 + 3] = 61;
                }
                i3 = i10;
            } else if (i9 == 2) {
                int i13 = ((bArr3[i3 + 1] & 255) << 2) | ((bArr3[i3] & 255) << 10);
                bArr4[i4] = bArr2[i13 >>> 12];
                int i14 = i4 + 2;
                bArr4[i4 + 1] = bArr2[(i13 >>> 6) & 63];
                int i15 = i4 + 3;
                bArr4[i14] = bArr2[i13 & 63];
                if (l50 == l503 || l50 == l502) {
                    bArr4[i15] = 61;
                }
                i3 = i2;
            }
            if (i3 == length) {
                return new String(bArr4, mo0.e);
            }
            h.s("Check failed.");
            return null;
        }
    }

    public final int b(int i) {
        int i2 = i / 3;
        int i3 = i % 3;
        int i4 = 4;
        int i5 = i2 * 4;
        if (i3 != 0) {
            l50 l50 = l50.w;
            l50 l502 = this.d;
            if (!(l502 == l50 || l502 == l50.y)) {
                i4 = i3 + 1;
            }
            i5 += i4;
        }
        if (i5 >= 0) {
            if (this.b) {
                i5 += ((i5 - 1) / this.c) * 2;
            }
            if (i5 >= 0) {
                return i5;
            }
            h.q("Input is too big");
            return 0;
        }
        h.q("Input is too big");
        return 0;
    }
}
