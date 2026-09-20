package defpackage;

/* renamed from: m90  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m90 {
    public final byte[] a;
    public int b;
    public int c;

    public m90(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    public int a() {
        return ((this.a.length - this.b) * 8) - this.c;
    }

    public int b(int i) {
        byte b2 = 0;
        if (i <= 0 || i > 32 || i > a()) {
            h.q(String.valueOf(i));
            return 0;
        }
        int i2 = this.c;
        byte[] bArr = this.a;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int min = Math.min(i, i3);
            int i4 = i3 - min;
            int i5 = this.b;
            int i6 = (((255 >> (8 - min)) << i4) & bArr[i5]) >> i4;
            i -= min;
            int i7 = this.c + min;
            this.c = i7;
            if (i7 == 8) {
                this.c = 0;
                this.b = i5 + 1;
            }
            b2 = i6;
        }
        if (i <= 0) {
            return b2;
        }
        while (i >= 8) {
            int i8 = this.b;
            b2 = (b2 << 8) | (bArr[i8] & 255);
            this.b = i8 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b2;
        }
        int i9 = 8 - i;
        int i10 = (b2 << i) | ((bArr[this.b] & ((255 >> i9) << i9)) >> i9);
        this.c += i;
        return i10;
    }

    public m90(byte[] bArr) {
        this.a = bArr;
    }
}
