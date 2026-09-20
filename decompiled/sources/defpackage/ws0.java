package defpackage;

import androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException;
import androidx.datastore.preferences.protobuf.a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ws0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ws0 {
    public static final Logger f = Logger.getLogger(ws0.class.getName());
    public static final boolean g = tt7.e;
    public ji8 a;
    public final byte[] b;
    public final int c;
    public int d;
    public final ls7 e;

    public ws0(ls7 ls7, int i) {
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.b = new byte[max];
            this.c = max;
            this.e = ls7;
            return;
        }
        h.q("bufferSize must be >= 0");
        throw null;
    }

    public static int f(int i, zf0 zf0) {
        int h = h(i);
        int size = zf0.size();
        return i(size) + size + h;
    }

    public static int g(String str) {
        int i;
        try {
            i = t08.a(str);
        } catch (r08 unused) {
            i = str.getBytes(tf3.a).length;
        }
        return i(i) + i;
    }

    public static int h(int i) {
        return i(i << 3);
    }

    public static int i(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int j(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void A(String str) {
        int i;
        try {
            int length = str.length() * 3;
            int i2 = i(length);
            int i3 = i2 + length;
            int i4 = this.c;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int f2 = t08.a.f(str, bArr, 0, length);
                D(f2);
                n(bArr, 0, f2);
                return;
            }
            if (i3 > i4 - this.d) {
                k();
            }
            int i5 = i(str.length());
            i = this.d;
            byte[] bArr2 = this.b;
            if (i5 == i2) {
                int i6 = i + i5;
                this.d = i6;
                int f3 = t08.a.f(str, bArr2, i6, i4 - i6);
                this.d = i;
                d((f3 - i) - i5);
                this.d = f3;
                return;
            }
            int a2 = t08.a(str);
            d(a2);
            this.d = t08.a.f(str, bArr2, this.d, a2);
        } catch (r08 e2) {
            this.d = i;
            throw e2;
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException(e3);
        } catch (r08 e4) {
            f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e4);
            byte[] bytes = str.getBytes(tf3.a);
            try {
                D(bytes.length);
                x(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e5) {
                throw new CodedOutputStream$OutOfSpaceException(e5);
            }
        }
    }

    public final void B(int i, int i2) {
        D((i << 3) | i2);
    }

    public final void C(int i, int i2) {
        l(20);
        c(i, 0);
        d(i2);
    }

    public final void D(int i) {
        l(5);
        d(i);
    }

    public final void E(long j, int i) {
        l(20);
        c(i, 0);
        e(j);
    }

    public final void F(long j) {
        l(10);
        e(j);
    }

    public final void a(int i) {
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        byte[] bArr = this.b;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.d = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.d = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.d = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void b(long j) {
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        byte[] bArr = this.b;
        bArr[i] = (byte) ((int) (j & 255));
        int i3 = i + 2;
        this.d = i3;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i4 = i + 3;
        this.d = i4;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        int i5 = i + 4;
        this.d = i5;
        bArr[i4] = (byte) ((int) (255 & (j >> 24)));
        int i6 = i + 5;
        this.d = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.d = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.d = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.d = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void c(int i, int i2) {
        d((i << 3) | i2);
    }

    public final void d(int i) {
        boolean z = g;
        byte[] bArr = this.b;
        if (z) {
            while (true) {
                int i2 = i & -128;
                int i3 = this.d;
                if (i2 == 0) {
                    this.d = i3 + 1;
                    tt7.j(bArr, (long) i3, (byte) i);
                    return;
                }
                this.d = i3 + 1;
                tt7.j(bArr, (long) i3, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
        } else {
            while (true) {
                int i4 = i & -128;
                int i5 = this.d;
                if (i4 == 0) {
                    this.d = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                }
                this.d = i5 + 1;
                bArr[i5] = (byte) ((i | 128) & 255);
                i >>>= 7;
            }
        }
    }

    public final void e(long j) {
        boolean z = g;
        byte[] bArr = this.b;
        if (z) {
            while (true) {
                int i = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                int i2 = this.d;
                if (i == 0) {
                    this.d = i2 + 1;
                    tt7.j(bArr, (long) i2, (byte) ((int) j));
                    return;
                }
                this.d = i2 + 1;
                tt7.j(bArr, (long) i2, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i3 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                int i4 = this.d;
                if (i3 == 0) {
                    this.d = i4 + 1;
                    bArr[i4] = (byte) ((int) j);
                    return;
                }
                this.d = i4 + 1;
                bArr[i4] = (byte) ((((int) j) | 128) & 255);
                j >>>= 7;
            }
        }
    }

    public final void k() {
        this.e.write(this.b, 0, this.d);
        this.d = 0;
    }

    public final void l(int i) {
        if (this.c - this.d < i) {
            k();
        }
    }

    public final void m(byte b2) {
        if (this.d == this.c) {
            k();
        }
        int i = this.d;
        this.d = i + 1;
        this.b[i] = b2;
    }

    public final void n(byte[] bArr, int i, int i2) {
        int i3 = this.d;
        int i4 = this.c;
        int i5 = i4 - i3;
        byte[] bArr2 = this.b;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.d = i4;
        k();
        if (i7 <= i4) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.d = i7;
            return;
        }
        this.e.write(bArr, i6, i7);
    }

    public final void o(int i, boolean z) {
        l(11);
        c(i, 0);
        byte b2 = z ? (byte) 1 : 0;
        int i2 = this.d;
        this.d = i2 + 1;
        this.b[i2] = b2;
    }

    public final void p(int i, zf0 zf0) {
        B(i, 2);
        q(zf0);
    }

    public final void q(zf0 zf0) {
        D(zf0.size());
        x(zf0.x, zf0.l(), zf0.size());
    }

    public final void r(int i, int i2) {
        l(14);
        c(i, 5);
        a(i2);
    }

    public final void s(int i) {
        l(4);
        a(i);
    }

    public final void t(long j, int i) {
        l(18);
        c(i, 1);
        b(j);
    }

    public final void u(long j) {
        l(8);
        b(j);
    }

    public final void v(int i, int i2) {
        l(20);
        c(i, 0);
        if (i2 >= 0) {
            d(i2);
        } else {
            e((long) i2);
        }
    }

    public final void w(int i) {
        if (i >= 0) {
            D(i);
        } else {
            F((long) i);
        }
    }

    public final void x(byte[] bArr, int i, int i2) {
        n(bArr, i, i2);
    }

    public final void y(int i, a aVar, pg6 pg6) {
        B(i, 2);
        D(aVar.a(pg6));
        pg6.g(aVar, this.a);
    }

    public final void z(int i, String str) {
        B(i, 2);
        A(str);
    }
}
