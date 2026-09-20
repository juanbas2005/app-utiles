package defpackage;

import com.google.android.gms.internal.measurement.zzacy;
import java.util.Locale;

/* renamed from: zk8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zk8 extends fl8 {
    public final byte[] c;
    public final int d;
    public int e;

    public zk8(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.c = bArr;
            this.e = 0;
            this.d = i;
            return;
        }
        Locale locale = Locale.US;
        h.q(b81.l(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        throw null;
    }

    public final void c(byte[] bArr, int i, int i2) {
        w(bArr, i, i2);
    }

    public final void d(int i, int i2) {
        r((i << 3) | i2);
    }

    public final void e(int i, int i2) {
        r(i << 3);
        q(i2);
    }

    public final void f(int i, int i2) {
        r(i << 3);
        r(i2);
    }

    public final void g(int i, int i2) {
        r((i << 3) | 5);
        s(i2);
    }

    public final void h(long j, int i) {
        r(i << 3);
        t(j);
    }

    public final void i(long j, int i) {
        r((i << 3) | 1);
        u(j);
    }

    public final void j(int i, boolean z) {
        r(i << 3);
        p(z ? (byte) 1 : 0);
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
        w(bArr, 0, i);
    }

    public final void o(pk8 pk8) {
        nl8 nl8 = (nl8) pk8;
        r(nl8.m());
        nl8.f(this);
    }

    public final void p(byte b) {
        int i = this.e;
        try {
            int i2 = i + 1;
            try {
                this.c[i] = b;
                this.e = i2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                i = i2;
                throw new zzacy((long) i, (long) this.d, 1, e);
            }
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
            throw new zzacy((long) i, (long) this.d, 1, e);
        }
    }

    public final void q(int i) {
        if (i >= 0) {
            r(i);
        } else {
            t((long) i);
        }
    }

    public final void r(int i) {
        int i2;
        int i3 = this.e;
        while (true) {
            int i4 = i & -128;
            byte[] bArr = this.c;
            if (i4 == 0) {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) i;
                    this.e = i2;
                    return;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzacy((long) i2, (long) this.d, 1, e2);
                }
            } else {
                i2 = i3 + 1;
                bArr[i3] = (byte) (i | 128);
                i >>>= 7;
                i3 = i2;
            }
        }
    }

    public final void s(int i) {
        int i2 = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.e = i2 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzacy((long) i2, (long) this.d, 4, e2);
        }
    }

    public final void t(long j) {
        int i;
        int i2 = this.e;
        byte[] bArr = this.c;
        int i3 = this.d;
        if (!fl8.b || i3 - i2 < 10) {
            while ((j & -128) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i = i4;
                    throw new zzacy((long) i, (long) i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                throw new zzacy((long) i, (long) i3, 1, e);
            }
        } else {
            while ((j & -128) != 0) {
                jn8.k(bArr, (long) i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            jn8.k(bArr, (long) i2, (byte) ((int) j));
        }
        this.e = i;
    }

    public final void u(long j) {
        int i = this.e;
        try {
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
        } catch (IndexOutOfBoundsException e2) {
            throw new zzacy((long) i, (long) this.d, 8, e2);
        }
    }

    public final void v(String str) {
        int i = this.e;
        try {
            int a = fl8.a(str.length() * 3);
            int a2 = fl8.a(str.length());
            byte[] bArr = this.c;
            if (a2 == a) {
                int i2 = i + a2;
                this.e = i2;
                int c2 = ln8.c(str, bArr, i2, bArr.length - i2);
                this.e = i;
                r((c2 - i) - a2);
                this.e = c2;
                return;
            }
            r(ln8.b(str));
            int i3 = this.e;
            this.e = ln8.c(str, bArr, i3, bArr.length - i3);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzacy(e2);
        }
    }

    public final void w(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzacy((long) this.e, (long) this.d, i2, e2);
        }
    }

    public final int x() {
        return this.d - this.e;
    }
}
