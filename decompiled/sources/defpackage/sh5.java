package defpackage;

/* renamed from: sh5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sh5 extends vg2 {
    public final byte[] d;
    public final int e;
    public final int f;

    public sh5(byte[] bArr, int i, int i2, int i3, int i4) {
        super(i3, i4, 1, (byte) 0);
        if (i3 > i || i4 > i2) {
            h.q("Crop rectangle does not fit within image data.");
            throw null;
        }
        this.d = bArr;
        this.e = i;
        this.f = i2;
    }

    public final byte[] g() {
        byte[] bArr = this.d;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.e;
        if (i == i3 && i2 == this.f) {
            return bArr;
        }
        int i4 = i * i2;
        byte[] bArr2 = new byte[i4];
        if (i == i3) {
            System.arraycopy(bArr, 0, bArr2, 0, i4);
            return bArr2;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            System.arraycopy(bArr, i5, bArr2, i6 * i, i);
            i5 += i3;
        }
        return bArr2;
    }

    public final byte[] h(int i, byte[] bArr) {
        if (i < 0 || i >= this.c) {
            h.q("Requested row is outside the image: ".concat(String.valueOf(i)));
            return null;
        }
        int i2 = this.b;
        if (bArr == null || bArr.length < i2) {
            bArr = new byte[i2];
        }
        System.arraycopy(this.d, i * this.e, bArr, 0, i2);
        return bArr;
    }
}
