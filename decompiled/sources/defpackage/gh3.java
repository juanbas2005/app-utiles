package defpackage;

/* renamed from: gh3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gh3 extends vg2 {
    public final vg2 d;

    public gh3(vg2 vg2) {
        super(vg2.b, vg2.c, 1, (byte) 0);
        this.d = vg2;
    }

    public final byte[] g() {
        byte[] g = this.d.g();
        int i = this.b * this.c;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (255 - (g[i2] & 255));
        }
        return bArr;
    }

    public final byte[] h(int i, byte[] bArr) {
        byte[] h = this.d.h(i, bArr);
        for (int i2 = 0; i2 < this.b; i2++) {
            h[i2] = (byte) (255 - (h[i2] & 255));
        }
        return h;
    }

    public final boolean i() {
        return this.d.i();
    }

    public final vg2 j() {
        return new gh3(this.d.j());
    }
}
