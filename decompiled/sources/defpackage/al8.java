package defpackage;

import com.google.android.gms.internal.measurement.zzacy;
import java.io.OutputStream;

/* renamed from: al8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class al8 extends fl8 {
    public final byte[] c;
    public final int d;
    public int e;
    public final OutputStream f;

    public al8(OutputStream outputStream, int i) {
        if (outputStream != null) {
            this.f = outputStream;
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.c = bArr;
                this.d = bArr.length;
                return;
            }
            h.q("bufferSize must be >= 0");
            throw null;
        }
        ku4.j("out");
        throw null;
    }

    public final void A(int i) {
        if (this.d - this.e < i) {
            B();
        }
    }

    public final void B() {
        this.f.write(this.c, 0, this.e);
        this.e = 0;
    }

    public final void C(int i) {
        boolean z = fl8.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                int i2 = i & -128;
                int i3 = this.e;
                if (i2 == 0) {
                    this.e = i3 + 1;
                    jn8.k(bArr, (long) i3, (byte) i);
                    return;
                }
                this.e = i3 + 1;
                jn8.k(bArr, (long) i3, (byte) (i | 128));
                i >>>= 7;
            }
        } else {
            while (true) {
                int i4 = i & -128;
                int i5 = this.e;
                if (i4 == 0) {
                    this.e = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                }
                this.e = i5 + 1;
                bArr[i5] = (byte) (i | 128);
                i >>>= 7;
            }
        }
    }

    public final void c(byte[] bArr, int i, int i2) {
        z(bArr, i, i2);
    }

    public final void d(int i, int i2) {
        r((i << 3) | i2);
    }

    public final void e(int i, int i2) {
        A(20);
        C(i << 3);
        if (i2 >= 0) {
            C(i2);
        } else {
            w((long) i2);
        }
    }

    public final void f(int i, int i2) {
        A(20);
        C(i << 3);
        C(i2);
    }

    public final void g(int i, int i2) {
        A(14);
        C((i << 3) | 5);
        x(i2);
    }

    public final void h(long j, int i) {
        A(20);
        C(i << 3);
        w(j);
    }

    public final void i(long j, int i) {
        A(18);
        C((i << 3) | 1);
        y(j);
    }

    public final void j(int i, boolean z) {
        A(11);
        C(i << 3);
        int i2 = this.e;
        this.c[i2] = z ? (byte) 1 : 0;
        this.e = i2 + 1;
    }

    public final void k(int i, String str) {
        r((i << 3) | 2);
        v(str);
    }

    public final void l(int i, vk8 vk8) {
        r((i << 3) | 2);
        m(vk8);
    }

    public final void m(vk8 vk8) {
        r(vk8.f());
        vk8.l(this);
    }

    public final void n(int i, byte[] bArr) {
        r(i);
        z(bArr, 0, i);
    }

    public final void o(pk8 pk8) {
        nl8 nl8 = (nl8) pk8;
        r(nl8.m());
        nl8.f(this);
    }

    public final void p(byte b) {
        if (this.e == this.d) {
            B();
        }
        int i = this.e;
        this.c[i] = b;
        this.e = i + 1;
    }

    public final void q(int i) {
        if (i >= 0) {
            r(i);
        } else {
            t((long) i);
        }
    }

    public final void r(int i) {
        A(5);
        C(i);
    }

    public final void s(int i) {
        A(4);
        x(i);
    }

    public final void t(long j) {
        A(10);
        w(j);
    }

    public final void u(long j) {
        A(8);
        y(j);
    }

    public final void v(String str) {
        int length = str.length() * 3;
        int a = fl8.a(length);
        int i = a + length;
        int i2 = this.d;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int c2 = ln8.c(str, bArr, 0, length);
            r(c2);
            z(bArr, 0, c2);
            return;
        }
        if (i > i2 - this.e) {
            B();
        }
        int a2 = fl8.a(str.length());
        int i3 = this.e;
        byte[] bArr2 = this.c;
        if (a2 == a) {
            int i4 = i3 + a2;
            try {
                this.e = i4;
                int c3 = ln8.c(str, bArr2, i4, i2 - i4);
                this.e = i3;
                C((c3 - i3) - a2);
                this.e = c3;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzacy(e2);
            }
        } else {
            int b = ln8.b(str);
            C(b);
            this.e = ln8.c(str, bArr2, this.e, b);
        }
    }

    public final void w(long j) {
        boolean z = fl8.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                int i = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                int i2 = (int) j;
                int i3 = this.e;
                if (i == 0) {
                    this.e = i3 + 1;
                    jn8.k(bArr, (long) i3, (byte) i2);
                    return;
                }
                this.e = i3 + 1;
                jn8.k(bArr, (long) i3, (byte) (i2 | 128));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i4 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                int i5 = (int) j;
                int i6 = this.e;
                if (i4 == 0) {
                    this.e = i6 + 1;
                    bArr[i6] = (byte) i5;
                    return;
                }
                this.e = i6 + 1;
                bArr[i6] = (byte) (i5 | 128);
                j >>>= 7;
            }
        }
    }

    public final void x(int i) {
        int i2 = this.e;
        byte[] bArr = this.c;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.e = i2 + 4;
    }

    public final void y(long j) {
        int i = this.e;
        byte[] bArr = this.c;
        bArr[i] = (byte) ((int) j);
        bArr[i + 1] = (byte) ((int) (j >> 8));
        bArr[i + 2] = (byte) ((int) (j >> 16));
        bArr[i + 3] = (byte) ((int) (j >> 24));
        bArr[i + 4] = (byte) ((int) (j >> 32));
        bArr[i + 5] = (byte) ((int) (j >> 40));
        bArr[i + 6] = (byte) ((int) (j >> 48));
        bArr[i + 7] = (byte) ((int) (j >> 56));
        this.e = i + 8;
    }

    public final void z(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        int i4 = this.d;
        int i5 = i4 - i3;
        byte[] bArr2 = this.c;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        this.e = i4;
        B();
        int i7 = i2 - i5;
        if (i7 <= i4) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.e = i7;
            return;
        }
        this.f.write(bArr, i6, i7);
    }
}
