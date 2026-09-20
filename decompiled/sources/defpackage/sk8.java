package defpackage;

/* renamed from: sk8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sk8 extends tk8 {
    public final int A;
    public final byte[] y;
    public final int z;

    public sk8(byte[] bArr, int i, int i2) {
        vk8.w(i, i + i2, bArr.length);
        this.y = bArr;
        this.z = i;
        this.A = i2;
    }

    public final byte d(int i) {
        return this.y[this.z + i];
    }

    public final int f() {
        return this.A;
    }

    public final tk8 g(int i, int i2) {
        int w = vk8.w(i, i2, this.A);
        if (w == 0) {
            return vk8.x;
        }
        return new sk8(this.y, this.z + i, w);
    }

    public final void k(int i, byte[] bArr) {
        System.arraycopy(this.y, this.z, bArr, 0, i);
    }

    public final void l(fl8 fl8) {
        fl8.c(this.y, this.z, this.A);
    }

    public final boolean n(vk8 vk8) {
        boolean z2 = vk8 instanceof uk8;
        if (!z2 && !(vk8 instanceof sk8)) {
            return vk8.n(this);
        }
        int f = vk8.f();
        int i = this.A;
        if (i > f) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= vk8.f()) {
            byte[] bArr = this.y;
            int i2 = this.z;
            if (z2) {
                return vk8.x(i2, 0, i, bArr, ((uk8) vk8).y);
            }
            if (!(vk8 instanceof sk8)) {
                return vk8.g(0, i).equals(g(i2, i + i2));
            }
            sk8 sk8 = (sk8) vk8;
            return vk8.x(i2, sk8.z, i, bArr, sk8.y);
        } else {
            int f2 = vk8.f();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(f2).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(f2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final int o(int i, int i2) {
        return xl8.a(i, this.z, i2, this.y);
    }
}
