package defpackage;

import java.util.Arrays;

/* renamed from: uk8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uk8 extends tk8 {
    public final byte[] y;

    public uk8(byte[] bArr) {
        bArr.getClass();
        this.y = bArr;
    }

    public final byte d(int i) {
        return this.y[i];
    }

    public final int f() {
        return this.y.length;
    }

    public final tk8 g(int i, int i2) {
        byte[] bArr = this.y;
        int w = vk8.w(0, i2, bArr.length);
        if (w == 0) {
            return vk8.x;
        }
        return new sk8(bArr, 0, w);
    }

    public final void k(int i, byte[] bArr) {
        System.arraycopy(this.y, 0, bArr, 0, i);
    }

    public final void l(fl8 fl8) {
        byte[] bArr = this.y;
        fl8.c(bArr, 0, bArr.length);
    }

    public final boolean n(vk8 vk8) {
        boolean z = vk8 instanceof uk8;
        byte[] bArr = this.y;
        if (z) {
            return Arrays.equals(bArr, ((uk8) vk8).y);
        }
        boolean z2 = vk8 instanceof sk8;
        if (!z2) {
            return vk8.n(this);
        }
        sk8 sk8 = (sk8) vk8;
        int i = sk8.A;
        int length = bArr.length;
        if (length > i) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (length > i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(length);
            sb2.append(", ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (z) {
            return vk8.x(0, 0, length, bArr, ((uk8) vk8).y);
        } else {
            if (!z2) {
                return vk8.g(0, length).equals(g(0, length));
            }
            return vk8.x(0, sk8.z, length, bArr, sk8.y);
        }
    }

    public final int o(int i, int i2) {
        return xl8.a(i, 0, i2, this.y);
    }
}
