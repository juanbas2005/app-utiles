package defpackage;

import com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: vs0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vs0 {
    public static final Logger e = Logger.getLogger(vs0.class.getName());
    public static final boolean f = st7.e;
    public wv2 a;
    public final byte[] b;
    public final int c;
    public int d;

    public vs0(byte[] bArr, int i) {
        if (((bArr.length - i) | i) >= 0) {
            this.b = bArr;
            this.d = 0;
            this.c = i;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)}));
    }

    public static int a(int i) {
        if (i >= 0) {
            return d(i);
        }
        return 10;
    }

    public static int b(String str) {
        int i;
        try {
            i = s08.b(str);
        } catch (q08 unused) {
            i = str.getBytes(rf3.a).length;
        }
        return d(i) + i;
    }

    public static int c(int i) {
        return d(i << 3);
    }

    public static int d(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((i & -268435456) == 0) {
            return 4;
        }
        return 5;
    }

    public static int e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            return i + 1;
        }
        return i;
    }

    public final void f(byte b2) {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), 1}), e2);
        }
    }

    public final void g(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i2)}), e2);
        }
    }

    public final void h(yf0 yf0) {
        p(yf0.size());
        g(yf0.x, yf0.g(), yf0.size());
    }

    public final void i(int i, int i2) {
        o(i, 5);
        j(i2);
    }

    public final void j(int i) {
        try {
            byte[] bArr = this.b;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.d = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.d = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), 1}), e2);
        }
    }

    public final void k(long j, int i) {
        o(i, 1);
        l(j);
    }

    public final void l(long j) {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
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
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), 1}), e2);
        }
    }

    public final void m(int i) {
        if (i >= 0) {
            p(i);
        } else {
            r((long) i);
        }
    }

    public final void n(String str) {
        int i = this.d;
        try {
            int d2 = d(str.length() * 3);
            int d3 = d(str.length());
            int i2 = this.c;
            byte[] bArr = this.b;
            if (d3 == d2) {
                int i3 = i + d3;
                this.d = i3;
                int d4 = s08.a.d(str, bArr, i3, i2 - i3);
                this.d = i;
                p((d4 - i) - d3);
                this.d = d4;
                return;
            }
            p(s08.b(str));
            int i4 = this.d;
            this.d = s08.a.d(str, bArr, i4, i2 - i4);
        } catch (q08 e2) {
            this.d = i;
            e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e2);
            byte[] bytes = str.getBytes(rf3.a);
            try {
                p(bytes.length);
                g(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e3) {
                throw new CodedOutputStream$OutOfSpaceException(e3);
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new CodedOutputStream$OutOfSpaceException(e4);
        }
    }

    public final void o(int i, int i2) {
        p((i << 3) | i2);
    }

    public final void p(int i) {
        while (true) {
            int i2 = i & -128;
            int i3 = this.d;
            byte[] bArr = this.b;
            if (i2 == 0) {
                try {
                    this.d = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                } catch (IndexOutOfBoundsException e2) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), 1}), e2);
                }
            } else {
                this.d = i3 + 1;
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    public final void q(long j, int i) {
        o(i, 0);
        r(j);
    }

    public final void r(long j) {
        boolean z = f;
        int i = this.c;
        byte[] bArr = this.b;
        if (!z || i - this.d < 10) {
            while (true) {
                int i2 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                int i3 = this.d;
                if (i2 == 0) {
                    try {
                        this.d = i3 + 1;
                        bArr[i3] = (byte) ((int) j);
                        return;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(i), 1}), e2);
                    }
                } else {
                    this.d = i3 + 1;
                    bArr[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                int i5 = this.d;
                if (i4 == 0) {
                    this.d = i5 + 1;
                    st7.k(bArr, (long) i5, (byte) ((int) j));
                    return;
                }
                this.d = i5 + 1;
                st7.k(bArr, (long) i5, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
        }
    }
}
