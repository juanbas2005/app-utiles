package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: zw5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zw5 implements ed0 {
    public final oy6 w;
    public final sc0 x = new Object();
    public boolean y;

    /* JADX WARNING: type inference failed for: r1v1, types: [sc0, java.lang.Object] */
    public zw5(oy6 oy6) {
        oy6.getClass();
        this.w = oy6;
    }

    public final long C(byte b, long j, long j2) {
        if (this.y) {
            h.s("closed");
            return 0;
        } else if (0 > j || j > j2) {
            StringBuilder q = hl6.q(j, "fromIndex=", " toIndex=");
            q.append(j2);
            throw new IllegalArgumentException(q.toString().toString());
        } else {
            long j3 = j;
            while (j3 < j2) {
                sc0 sc0 = this.x;
                byte b2 = b;
                long j4 = j2;
                long C = sc0.C(b2, j3, j4);
                if (C == -1) {
                    long j5 = sc0.x;
                    if (j5 >= j4 || this.w.Y(8192, sc0) == -1) {
                        break;
                    }
                    j3 = Math.max(j3, j5);
                    b = b2;
                    j2 = j4;
                } else {
                    return C;
                }
            }
            return -1;
        }
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [sc0, java.lang.Object] */
    public final String H(long j) {
        long j2;
        long j3 = j;
        if (j3 >= 0) {
            if (j3 == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j3 + 1;
            }
            long C = C((byte) 10, 0, j2);
            int i = (C > -1 ? 1 : (C == -1 ? 0 : -1));
            sc0 sc0 = this.x;
            if (i != 0) {
                return b.c(C, sc0);
            }
            if (j2 < Long.MAX_VALUE && j(j2) && sc0.u(j2 - 1) == 13 && j(j2 + 1) && sc0.u(j2) == 10) {
                return b.c(j2, sc0);
            }
            ? obj = new Object();
            sc0.o(obj, 0, Math.min(32, sc0.x));
            throw new EOFException("\\n not found: limit=" + Math.min(sc0.x, j3) + " content=" + obj.q(obj.x).e() + 8230);
        }
        h.j(f21.f(j3, "limit < 0: "));
        return null;
    }

    public final String Q(Charset charset) {
        charset.getClass();
        oy6 oy6 = this.w;
        sc0 sc0 = this.x;
        sc0.t(oy6);
        return sc0.I(sc0.x, charset);
    }

    public final long Y(long j, sc0 sc0) {
        sc0.getClass();
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            h.j(f21.f(j, "byteCount < 0: "));
            return 0;
        } else if (!this.y) {
            sc0 sc02 = this.x;
            if (sc02.x == 0) {
                if (i == 0) {
                    return 0;
                }
                if (this.w.Y(8192, sc02) == -1) {
                    return -1;
                }
            }
            return sc02.Y(Math.min(j, sc02.x), sc0);
        } else {
            h.s("closed");
            return 0;
        }
    }

    public final zw5 a() {
        return new zw5(new df5(this));
    }

    public final sc0 c() {
        return this.x;
    }

    public final boolean c0(long j, dg0 dg0) {
        long a;
        boolean z;
        boolean z2;
        long j2;
        dg0.getClass();
        int d = dg0.d();
        if (this.y) {
            h.s("closed");
            return false;
        } else if (d < 0 || j < 0 || d > dg0.d()) {
            return false;
        } else {
            if (d == 0) {
                return true;
            }
            long j3 = 1;
            long j4 = j + 1;
            long j5 = (long) d;
            t49.x((long) dg0.d(), 0, j5);
            long j6 = j5;
            if (!this.y) {
                long j7 = j;
                loop0:
                while (true) {
                    sc0 sc0 = this.x;
                    a = b.a(sc0, dg0, j7, j4, d);
                    if (a == -1) {
                        long j8 = sc0.x;
                        z = false;
                        z2 = true;
                        long j9 = (j8 - j6) + j3;
                        if (j9 >= j4) {
                            break;
                        }
                        if (j8 >= j4) {
                            int max = (int) Math.max(j3, (j8 - j4) + j3);
                            int min = ((int) Math.min(j6, (sc0.x - j7) + j3)) - 1;
                            if (max > min) {
                                break;
                            }
                            while (true) {
                                j2 = j4;
                                if (!sc0.B(sc0.x - ((long) min), dg0, min)) {
                                    if (min == max) {
                                        break loop0;
                                    }
                                    min--;
                                    j4 = j2;
                                } else {
                                    break;
                                }
                            }
                        } else {
                            j2 = j4;
                            dg0 dg02 = dg0;
                        }
                        if (this.w.Y(8192, sc0) == -1) {
                            break;
                        }
                        j7 = Math.max(j7, j9);
                        j4 = j2;
                        j3 = 1;
                    } else {
                        z = false;
                        z2 = true;
                        break;
                    }
                }
                a = -1;
                if (a != -1) {
                    return z2;
                }
                return z;
            }
            h.s("closed");
            return false;
        }
    }

    public final void close() {
        if (!this.y) {
            this.y = true;
            this.w.close();
            this.x.a();
        }
    }

    public final long d0(yw5 yw5) {
        sc0 sc0;
        long j = 0;
        while (true) {
            oy6 oy6 = this.w;
            sc0 = this.x;
            if (oy6.Y(8192, sc0) == -1) {
                break;
            }
            long l = sc0.l();
            if (l > 0) {
                j += l;
                yw5.g0(l, sc0);
            }
        }
        long j2 = sc0.x;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        yw5.g0(j2, sc0);
        return j3;
    }

    public final ri7 g() {
        return this.w.g();
    }

    public final boolean isOpen() {
        return !this.y;
    }

    public final boolean j(long j) {
        sc0 sc0;
        if (j < 0) {
            h.j(f21.f(j, "byteCount < 0: "));
            return false;
        } else if (!this.y) {
            do {
                sc0 = this.x;
                if (sc0.x >= j) {
                    return true;
                }
            } while (this.w.Y(8192, sc0) != -1);
            return false;
        } else {
            h.s("closed");
            return false;
        }
    }

    public final int k() {
        p(4);
        int readInt = this.x.readInt();
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final long l() {
        char c;
        char c2;
        long j;
        p(8);
        sc0 sc0 = this.x;
        if (sc0.x >= 8) {
            qi6 qi6 = sc0.w;
            qi6.getClass();
            int i = qi6.b;
            int i2 = qi6.c;
            if (((long) (i2 - i)) < 8) {
                j = ((((long) sc0.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) sc0.readInt()));
                c = 24;
                c2 = '(';
            } else {
                byte[] bArr = qi6.a;
                c = 24;
                c2 = '(';
                long j2 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48);
                int i3 = i + 7;
                int i4 = i + 8;
                long j3 = j2 | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8) | (((long) bArr[i3]) & 255);
                sc0.x -= 8;
                if (i4 == i2) {
                    sc0.w = qi6.a();
                    ti6.a(qi6);
                } else {
                    qi6.b = i4;
                }
                j = j3;
            }
            return ((j & 255) << 56) | ((-72057594037927936L & j) >>> 56) | ((71776119061217280L & j) >>> c2) | ((280375465082880L & j) >>> c) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << c) | ((65280 & j) << c2);
        }
        throw new EOFException();
    }

    public final InputStream l0() {
        return new aa0(3, (Object) this);
    }

    public final short o() {
        p(2);
        return this.x.G();
    }

    public final void p(long j) {
        if (!j(j)) {
            throw new EOFException();
        }
    }

    public final dg0 q(long j) {
        p(j);
        return this.x.q(j);
    }

    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        sc0 sc0 = this.x;
        if (sc0.x == 0 && this.w.Y(8192, sc0) == -1) {
            return -1;
        }
        return sc0.read(byteBuffer);
    }

    public final byte readByte() {
        p(1);
        return this.x.readByte();
    }

    public final int readInt() {
        p(4);
        return this.x.readInt();
    }

    public final short readShort() {
        p(2);
        return this.x.readShort();
    }

    public final void skip(long j) {
        if (!this.y) {
            while (j > 0) {
                sc0 sc0 = this.x;
                if (sc0.x == 0 && this.w.Y(8192, sc0) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, sc0.x);
                sc0.skip(min);
                j -= min;
            }
            return;
        }
        h.s("closed");
    }

    public final String toString() {
        return "buffer(" + this.w + ')';
    }

    public final String u(long j) {
        p(j);
        return this.x.I(j, mo0.a);
    }

    public final boolean x() {
        if (!this.y) {
            sc0 sc0 = this.x;
            if (!sc0.x() || this.w.Y(8192, sc0) != -1) {
                return false;
            }
            return true;
        }
        h.s("closed");
        return false;
    }

    public final int z(u75 u75) {
        u75.getClass();
        if (!this.y) {
            while (true) {
                sc0 sc0 = this.x;
                int d = b.d(sc0, u75, true);
                if (d == -2) {
                    if (this.w.Y(8192, sc0) == -1) {
                        break;
                    }
                } else if (d != -1) {
                    sc0.skip((long) u75.w[d].d());
                    return d;
                }
            }
            return -1;
        }
        h.s("closed");
        return 0;
    }
}
