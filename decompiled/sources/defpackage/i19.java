package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.util.ArrayDeque;

/* renamed from: i19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i19 implements Closeable {
    public final ByteArrayInputStream w;
    public g19 x;
    public final byte[] y = new byte[8];
    public final br4 z = new br4(27, (byte) 0);

    public i19(ByteArrayInputStream byteArrayInputStream) {
        this.w = byteArrayInputStream;
    }

    public final void B() {
        o();
        byte b = this.x.b;
        if (b == 31) {
            h.s(hl6.k(b, "expected definite length but found "));
        }
    }

    public final void D(byte b) {
        o();
        byte b2 = this.x.a;
        if (b2 != b) {
            h.s(b81.l((b >> 5) & 7, (b2 >> 5) & 7, "expected major type ", " but found "));
        }
    }

    public final void E(int i, byte[] bArr) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.w.read(bArr, i2, i - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new EOFException();
            }
        }
        this.x = null;
    }

    public final byte[] G() {
        B();
        long v = v();
        if (v < 0 || v > 2147483647L) {
            kj6.n("the maximum supported byte/text string length is 2147483647 bytes");
            return null;
        } else if (((long) this.w.available()) >= v) {
            int i = (int) v;
            byte[] bArr = new byte[i];
            E(i, bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public final long a() {
        D(Byte.MIN_VALUE);
        B();
        long v = v();
        int i = (v > 0 ? 1 : (v == 0 ? 0 : -1));
        if (i >= 0) {
            if (i > 0) {
                ((ArrayDeque) this.z.x).push(Long.valueOf(v));
            }
            return v;
        }
        kj6.n("the maximum supported array length is 9223372036854775807");
        return 0;
    }

    public final void close() {
        this.w.close();
        this.z.V();
    }

    public final long k() {
        boolean z2;
        o();
        byte b = this.x.a;
        if (b == 0) {
            z2 = true;
        } else if (b == 32) {
            z2 = false;
        } else {
            h.s(hl6.k((b >> 5) & 7, "expected major type 0 or 1 but found "));
            return 0;
        }
        long v = v();
        if (v < 0) {
            kj6.n("the maximum supported unsigned/negative integer is 9223372036854775807");
            return 0;
        } else if (z2) {
            return v;
        } else {
            return ~v;
        }
    }

    public final long l() {
        D((byte) -96);
        B();
        long v = v();
        int i = (v > 0 ? 1 : (v == 0 ? 0 : -1));
        if (i < 0 || v > 4611686018427387903L) {
            kj6.n("the maximum supported map length is 4611686018427387903L");
            return 0;
        }
        if (i > 0) {
            ((ArrayDeque) this.z.x).push(Long.valueOf(v + v));
        }
        return v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        if (r0 != -2) goto L_0x008f;
     */
    public final g19 o() {
        if (this.x == null) {
            int read = this.w.read();
            br4 br4 = this.z;
            if (read == -1) {
                br4.V();
                return null;
            }
            g19 g19 = new g19(read);
            this.x = g19;
            long j = -2;
            byte b = g19.a;
            if (!(b == Byte.MIN_VALUE || b == -96 || b == -64)) {
                if (b != -32) {
                    if (!(b == 0 || b == 32)) {
                        if (b == 64) {
                            br4.W(-1);
                        } else if (b == 96) {
                            br4.W(-2);
                        } else {
                            h.s(hl6.k((b >> 5) & 7, "invalid major type: "));
                            return null;
                        }
                        long X = br4.X();
                        ArrayDeque arrayDeque = (ArrayDeque) br4.x;
                        int i = (X > 1 ? 1 : (X == 1 ? 0 : -1));
                        if (i == 0) {
                            arrayDeque.pop();
                        } else if (i > 0) {
                            arrayDeque.pop();
                            arrayDeque.push(Long.valueOf(X - 1));
                        } else if (X == -4) {
                            arrayDeque.pop();
                            arrayDeque.push(-5L);
                        } else if (X == -5) {
                            arrayDeque.pop();
                            arrayDeque.push(-4L);
                        }
                    }
                } else if (g19.b == 31) {
                    long X2 = br4.X();
                    if (X2 >= 0) {
                        rf2.i(f21.f(X2, "expected indefinite length scope but found "));
                        return null;
                    } else if (X2 != -5) {
                        ((ArrayDeque) br4.x).pop();
                    } else {
                        rf2.i("expected a value for dangling key in indefinite-length map");
                        return null;
                    }
                }
            }
            long X3 = br4.X();
            if (X3 == -1) {
                j = X3;
            }
            rf2.i(f21.f(j, "expected non-string scope but found "));
            return null;
        }
        return this.x;
    }

    public final boolean u() {
        D((byte) -32);
        if (this.x.b <= 24) {
            int v = (int) v();
            if (v == 20) {
                return false;
            }
            if (v == 21) {
                return true;
            }
            h.s("expected FALSE or TRUE");
            return false;
        }
        h.s("expected simple value");
        return false;
    }

    public final long v() {
        g19 g19 = this.x;
        byte b = g19.b;
        if (b < 24) {
            long j = (long) b;
            this.x = null;
            return j;
        } else if (b == 24) {
            int read = this.w.read();
            if (read != -1) {
                this.x = null;
                return ((long) read) & 255;
            }
            throw new EOFException();
        } else {
            byte[] bArr = this.y;
            if (b == 25) {
                E(2, bArr);
                return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
            } else if (b == 26) {
                E(4, bArr);
                return ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (((long) bArr[3]) & 255);
            } else if (b == 27) {
                E(8, bArr);
                long j2 = (long) bArr[3];
                byte[] bArr2 = bArr;
                long j3 = (long) bArr[4];
                long j4 = (long) bArr2[5];
                long j5 = (long) bArr2[6];
                long j6 = (long) bArr[0];
                long j7 = (long) bArr2[7];
                return (j7 & 255) | ((((long) bArr[1]) & 255) << 48) | ((j6 & 255) << 56) | ((((long) bArr[2]) & 255) << 40) | ((j2 & 255) << 32) | ((j3 & 255) << 24) | ((j4 & 255) << 16) | ((j5 & 255) << 8);
            } else {
                rf2.i(b81.l(b, (g19.a >> 5) & 7, "invalid additional information ", " for major type "));
                return 0;
            }
        }
    }
}
