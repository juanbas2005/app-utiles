package defpackage;

/* renamed from: lz8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lz8 extends qz8 {
    public final int A;
    public final int z;

    public lz8(byte[] bArr, int i, int i2) {
        super(bArr);
        qz8.o(i, i + i2, bArr.length);
        this.z = i;
        this.A = i2;
    }

    public final byte d(int i) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException;
        int i2 = this.A;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.x[this.z + i];
        } else if (i < 0) {
            String k = hl6.k(i, "Index < 0: ");
            throw arrayIndexOutOfBoundsException;
        } else {
            arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(b81.l(i, i2, "Index > length: ", ", "));
            throw arrayIndexOutOfBoundsException;
        }
    }

    public final byte f(int i) {
        return this.x[this.z + i];
    }

    public final int g() {
        return this.z;
    }

    public final int k() {
        return this.A;
    }

    public final void l(int i, byte[] bArr) {
        System.arraycopy(this.x, this.z, bArr, 0, i);
    }
}
