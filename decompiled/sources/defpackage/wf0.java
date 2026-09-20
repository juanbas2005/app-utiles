package defpackage;

/* renamed from: wf0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wf0 extends zf0 {
    public final int A;
    public final int B;

    public wf0(byte[] bArr, int i, int i2) {
        super(bArr);
        zf0.f(i, i + i2, bArr.length);
        this.A = i;
        this.B = i2;
    }

    public final byte d(int i) {
        int i2 = this.B;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.x[this.A + i];
        } else if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(hl6.k(i, "Index < 0: "));
        } else {
            throw new ArrayIndexOutOfBoundsException(b81.l(i, i2, "Index > length: ", ", "));
        }
    }

    public final void k(int i, byte[] bArr) {
        System.arraycopy(this.x, this.A, bArr, 0, i);
    }

    public final int l() {
        return this.A;
    }

    public final byte n(int i) {
        return this.x[this.A + i];
    }

    public final int size() {
        return this.B;
    }
}
