package defpackage;

/* renamed from: vf0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vf0 extends yf0 {
    public final int A;
    public final int z;

    public vf0(byte[] bArr, int i, int i2) {
        super(bArr);
        yf0.f(i, i + i2, bArr.length);
        this.z = i;
        this.A = i2;
    }

    public final byte d(int i) {
        int i2 = this.A;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.x[this.z + i];
        } else if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(hl6.k(i, "Index < 0: "));
        } else {
            throw new ArrayIndexOutOfBoundsException(b81.l(i, i2, "Index > length: ", ", "));
        }
    }

    public final int g() {
        return this.z;
    }

    public final byte k(int i) {
        return this.x[this.z + i];
    }

    public final int size() {
        return this.A;
    }
}
