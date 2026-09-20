package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: sc0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sc0 implements ed0, dd0, Cloneable, ByteChannel {
    public qi6 w;
    public long x;

    public final boolean B(long j, dg0 dg0, int i) {
        dg0.getClass();
        if (i < 0 || j < 0 || ((long) i) + j > this.x || i > dg0.d()) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        if (b.a(this, dg0, j, j + 1, i) != -1) {
            return true;
        }
        return false;
    }

    public final long C(byte b, long j, long j2) {
        qi6 qi6;
        byte b2 = b;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            long j6 = this.x;
            throw new IllegalArgumentException(("size=" + j6 + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j7 = this.x;
        if (j4 > j7) {
            j4 = j7;
        }
        long j8 = -1;
        if (j3 == j4 || (qi6 = this.w) == null) {
            return -1;
        }
        if (j7 - j3 < j3) {
            while (j7 > j3) {
                qi6 = qi6.g;
                qi6.getClass();
                j7 -= (long) (qi6.c - qi6.b);
            }
            while (j7 < j4) {
                byte[] bArr = qi6.a;
                long j9 = j8;
                int min = (int) Math.min((long) qi6.c, (((long) qi6.b) + j4) - j7);
                for (int i = (int) ((((long) qi6.b) + j3) - j7); i < min; i++) {
                    if (bArr[i] == b2) {
                        return ((long) (i - qi6.b)) + j7;
                    }
                }
                j7 += (long) (qi6.c - qi6.b);
                qi6 = qi6.f;
                qi6.getClass();
                j8 = j9;
                j3 = j7;
            }
            return j8;
        }
        while (true) {
            long j10 = ((long) (qi6.c - qi6.b)) + j5;
            if (j10 > j3) {
                break;
            }
            qi6 = qi6.f;
            qi6.getClass();
            j5 = j10;
        }
        while (j5 < j4) {
            byte[] bArr2 = qi6.a;
            int min2 = (int) Math.min((long) qi6.c, (((long) qi6.b) + j4) - j5);
            for (int i2 = (int) ((((long) qi6.b) + j3) - j5); i2 < min2; i2++) {
                if (bArr2[i2] == b2) {
                    return ((long) (i2 - qi6.b)) + j5;
                }
            }
            j5 += (long) (qi6.c - qi6.b);
            qi6 = qi6.f;
            qi6.getClass();
            j3 = j5;
        }
        return -1;
    }

    public final byte[] D(long j) {
        if (j < 0 || j > 2147483647L) {
            h.j(f21.f(j, "byteCount: "));
            return null;
        } else if (this.x >= j) {
            byte[] bArr = new byte[((int) j)];
            int i = 0;
            while (i < bArr.length) {
                int read = read(bArr, i, bArr.length - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARNING: type inference failed for: r15v2, types: [sc0, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e A[EDGE_INSN: B:44:0x008e->B:29:0x008e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0019  */
    public final long E() {
        byte b;
        int i;
        if (this.x != 0) {
            int i2 = 0;
            boolean z = false;
            long j = 0;
            do {
                qi6 qi6 = this.w;
                qi6.getClass();
                byte[] bArr = qi6.a;
                int i3 = qi6.b;
                int i4 = qi6.c;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    b = bArr[i3];
                    if (b >= 48 && b <= 57) {
                        i = b - 48;
                    } else if (b >= 97 && b <= 102) {
                        i = b - 87;
                    } else if (b < 65 || b > 70) {
                        z = true;
                    } else {
                        i = b - 55;
                    }
                    if ((-1152921504606846976L & j) == 0) {
                        j = (j << 4) | ((long) i);
                        i3++;
                        i2++;
                    } else {
                        ? obj = new Object();
                        obj.h0(j);
                        obj.a0(b);
                        throw new NumberFormatException("Number too large: ".concat(obj.L()));
                    }
                }
                z = true;
                if (i2 == 0) {
                    char[] cArr = su0.b;
                    throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                }
                if (i3 != i4) {
                    this.w = qi6.a();
                    ti6.a(qi6);
                } else {
                    qi6.b = i3;
                }
                if (z || this.w == null) {
                    this.x -= (long) i2;
                }
                qi6 qi62 = this.w;
                qi62.getClass();
                byte[] bArr2 = qi62.a;
                int i32 = qi62.b;
                int i42 = qi62.c;
                while (true) {
                    if (i32 >= i42) {
                    }
                    j = (j << 4) | ((long) i);
                    i32++;
                    i2++;
                }
                z = true;
                if (i2 == 0) {
                }
                if (i32 != i42) {
                }
                break;
            } while (this.w == null);
            this.x -= (long) i2;
            return j;
        }
        throw new EOFException();
    }

    public final short G() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [sc0, java.lang.Object] */
    public final String H(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long j3 = j2;
            long C = C((byte) 10, 0, j3);
            if (C != -1) {
                return b.c(C, this);
            }
            if (j3 < this.x && u(j3 - 1) == 13 && u(j3) == 10) {
                return b.c(j3, this);
            }
            ? obj = new Object();
            o(obj, 0, Math.min(32, this.x));
            long min = Math.min(this.x, j);
            String e = obj.q(obj.x).e();
            throw new EOFException("\\n not found: limit=" + min + " content=" + e + 8230);
        }
        h.j(f21.f(j, "limit < 0: "));
        return null;
    }

    public final String I(long j, Charset charset) {
        charset.getClass();
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0 || j > 2147483647L) {
            h.j(f21.f(j, "byteCount: "));
            return null;
        } else if (this.x < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            qi6 qi6 = this.w;
            qi6.getClass();
            int i2 = qi6.b;
            if (((long) i2) + j > ((long) qi6.c)) {
                return new String(D(j), charset);
            }
            int i3 = (int) j;
            String str = new String(qi6.a, i2, i3, charset);
            int i4 = qi6.b + i3;
            qi6.b = i4;
            this.x -= j;
            if (i4 == qi6.c) {
                this.w = qi6.a();
                ti6.a(qi6);
            }
            return str;
        }
    }

    public final String L() {
        return I(this.x, mo0.a);
    }

    public final int M() {
        byte b;
        int i;
        byte b2;
        if (this.x != 0) {
            byte u = u(0);
            int i2 = 1;
            if ((u & 128) == 0) {
                b2 = u & Byte.MAX_VALUE;
                b = 0;
                i = 1;
            } else if ((u & 224) == 192) {
                b2 = u & 31;
                i = 2;
                b = 128;
            } else if ((u & 240) == 224) {
                b2 = u & 15;
                i = 3;
                b = 2048;
            } else if ((u & 248) == 240) {
                b2 = u & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j = (long) i;
            if (this.x >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte u2 = u(j2);
                    if ((u2 & 192) == 128) {
                        b2 = (b2 << 6) | (u2 & 63);
                        i2++;
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (b2 <= 1114111 && ((55296 > b2 || b2 >= 57344) && b2 >= b)) {
                    return b2;
                }
                return 65533;
            }
            StringBuilder o = pb4.o(i, "size < ", ": ");
            o.append(this.x);
            o.append(" (to read code point prefixed 0x");
            char[] cArr = su0.b;
            o.append(new String(new char[]{cArr[(u >> 4) & 15], cArr[u & 15]}));
            o.append(')');
            throw new EOFException(o.toString());
        }
        throw new EOFException();
    }

    public final /* bridge */ /* synthetic */ dd0 N(String str) {
        o0(str);
        return this;
    }

    public final String Q(Charset charset) {
        charset.getClass();
        return I(this.x, charset);
    }

    public final dg0 T(int i) {
        if (i == 0) {
            return dg0.z;
        }
        t49.x(this.x, 0, (long) i);
        qi6 qi6 = this.w;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            qi6.getClass();
            int i5 = qi6.c;
            int i6 = qi6.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                qi6 = qi6.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        qi6 qi62 = this.w;
        int i7 = 0;
        while (i2 < i) {
            qi62.getClass();
            bArr[i7] = qi62.a;
            i2 += qi62.c - qi62.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = qi62.b;
            qi62.d = true;
            i7++;
            qi62 = qi62.f;
        }
        return new aj6(bArr, iArr);
    }

    public final qi6 V(int i) {
        if (i < 1 || i > 8192) {
            h.q("unexpected capacity");
            return null;
        }
        qi6 qi6 = this.w;
        if (qi6 == null) {
            qi6 b = ti6.b();
            this.w = b;
            b.g = b;
            b.f = b;
            return b;
        }
        qi6 qi62 = qi6.g;
        qi62.getClass();
        if (qi62.c + i <= 8192 && qi62.e) {
            return qi62;
        }
        qi6 b2 = ti6.b();
        qi62.b(b2);
        return b2;
    }

    public final void X(dg0 dg0) {
        dg0.getClass();
        dg0.s(this, dg0.d());
    }

    public final long Y(long j, sc0 sc0) {
        sc0.getClass();
        if (j >= 0) {
            long j2 = this.x;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            sc0.g0(j, this);
            return j;
        }
        h.j(f21.f(j, "byteCount < 0: "));
        return 0;
    }

    public final void a() {
        skip(this.x);
    }

    public final void a0(int i) {
        qi6 V = V(1);
        byte[] bArr = V.a;
        int i2 = V.c;
        V.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.x++;
    }

    public final void b0(long j) {
        boolean z;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            a0(48);
            return;
        }
        int i2 = 0;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                o0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        if (j > b.b[numberOfLeadingZeros]) {
            i2 = 1;
        }
        int i3 = numberOfLeadingZeros + i2;
        if (z) {
            i3++;
        }
        qi6 V = V(i3);
        byte[] bArr2 = V.a;
        int i4 = V.c + i3;
        while (j != 0) {
            i4--;
            bArr2[i4] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i4 - 1] = 45;
        }
        V.c += i3;
        this.x += (long) i3;
    }

    public final boolean c0(long j, dg0 dg0) {
        dg0.getClass();
        return B(j, dg0, dg0.d());
    }

    public final long d0(yw5 yw5) {
        long j = this.x;
        if (j > 0) {
            yw5.g0(j, this);
        }
        return j;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final boolean equals(Object r19) {
        sc0 sc0 = r19;
        if (this == sc0) {
            return true;
        }
        if (!(sc0 instanceof sc0)) {
            return false;
        }
        long j = this.x;
        sc0 sc02 = sc0;
        if (j != sc02.x) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        qi6 qi6 = this.w;
        qi6.getClass();
        qi6 qi62 = sc02.w;
        qi62.getClass();
        int i = qi6.b;
        int i2 = qi62.b;
        long j2 = 0;
        while (j2 < this.x) {
            long min = (long) Math.min(qi6.c - i, qi62.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (qi6.a[i] != qi62.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == qi6.c) {
                qi6 = qi6.f;
                qi6.getClass();
                i = qi6.b;
            }
            if (i2 == qi62.c) {
                qi62 = qi62.f;
                qi62.getClass();
                i2 = qi62.b;
            }
            j2 += min;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ dd0 f0(dg0 dg0) {
        X(dg0);
        return this;
    }

    public final ri7 g() {
        return ri7.d;
    }

    public final void g0(long j, sc0 sc0) {
        qi6 qi6;
        qi6 qi62;
        int i;
        sc0.getClass();
        if (sc0 != this) {
            t49.x(sc0.x, 0, j);
            while (j > 0) {
                qi6 qi63 = sc0.w;
                qi63.getClass();
                int i2 = qi63.c;
                qi6 qi64 = sc0.w;
                qi64.getClass();
                int i3 = (j > ((long) (i2 - qi64.b)) ? 1 : (j == ((long) (i2 - qi64.b)) ? 0 : -1));
                int i4 = 0;
                if (i3 < 0) {
                    qi6 qi65 = this.w;
                    if (qi65 != null) {
                        qi6 = qi65.g;
                    } else {
                        qi6 = null;
                    }
                    if (qi6 != null && qi6.e) {
                        long j2 = ((long) qi6.c) + j;
                        if (qi6.d) {
                            i = 0;
                        } else {
                            i = qi6.b;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            qi6 qi66 = sc0.w;
                            qi66.getClass();
                            qi66.d(qi6, (int) j);
                            sc0.x -= j;
                            this.x += j;
                            return;
                        }
                    }
                    qi6 qi67 = sc0.w;
                    qi67.getClass();
                    int i5 = (int) j;
                    if (i5 <= 0 || i5 > qi67.c - qi67.b) {
                        h.q("byteCount out of range");
                        return;
                    }
                    if (i5 >= 1024) {
                        qi62 = qi67.c();
                    } else {
                        qi62 = ti6.b();
                        byte[] bArr = qi67.a;
                        byte[] bArr2 = qi62.a;
                        int i6 = qi67.b;
                        qs.O0(bArr, bArr2, 0, i6, i6 + i5, 2);
                    }
                    qi62.c = qi62.b + i5;
                    qi67.b += i5;
                    qi6 qi68 = qi67.g;
                    qi68.getClass();
                    qi68.b(qi62);
                    sc0.w = qi62;
                }
                qi6 qi69 = sc0.w;
                qi69.getClass();
                long j3 = (long) (qi69.c - qi69.b);
                sc0.w = qi69.a();
                qi6 qi610 = this.w;
                if (qi610 == null) {
                    this.w = qi69;
                    qi69.g = qi69;
                    qi69.f = qi69;
                } else {
                    qi6 qi611 = qi610.g;
                    qi611.getClass();
                    qi611.b(qi69);
                    qi6 qi612 = qi69.g;
                    if (qi612 != qi69) {
                        qi612.getClass();
                        if (qi612.e) {
                            int i7 = qi69.c - qi69.b;
                            qi6 qi613 = qi69.g;
                            qi613.getClass();
                            int i8 = 8192 - qi613.c;
                            qi6 qi614 = qi69.g;
                            qi614.getClass();
                            if (!qi614.d) {
                                qi6 qi615 = qi69.g;
                                qi615.getClass();
                                i4 = qi615.b;
                            }
                            if (i7 <= i8 + i4) {
                                qi6 qi616 = qi69.g;
                                qi616.getClass();
                                qi69.d(qi616, i7);
                                qi69.a();
                                ti6.a(qi69);
                            }
                        }
                    } else {
                        h.s("cannot compact");
                        return;
                    }
                }
                sc0.x -= j3;
                this.x += j3;
                j -= j3;
            }
            return;
        }
        h.q("source == this");
    }

    public final void h0(long j) {
        if (j == 0) {
            a0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        qi6 V = V(i);
        byte[] bArr = V.a;
        int i2 = V.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        V.c += i;
        this.x += (long) i;
    }

    public final int hashCode() {
        qi6 qi6 = this.w;
        if (qi6 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = qi6.c;
            for (int i3 = qi6.b; i3 < i2; i3++) {
                i = (i * 31) + qi6.a[i3];
            }
            qi6 = qi6.f;
            qi6.getClass();
        } while (qi6 != this.w);
        return i;
    }

    public final boolean isOpen() {
        return true;
    }

    public final boolean j(long j) {
        if (this.x >= j) {
            return true;
        }
        return false;
    }

    public final void j0(int i) {
        qi6 V = V(4);
        byte[] bArr = V.a;
        int i2 = V.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        V.c = i2 + 4;
        this.x += 4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [sc0, java.lang.Object] */
    /* renamed from: k */
    public final sc0 clone() {
        ? obj = new Object();
        if (this.x == 0) {
            return obj;
        }
        qi6 qi6 = this.w;
        qi6.getClass();
        qi6 c = qi6.c();
        obj.w = c;
        c.g = c;
        c.f = c;
        for (qi6 qi62 = qi6.f; qi62 != qi6; qi62 = qi62.f) {
            qi6 qi63 = c.g;
            qi63.getClass();
            qi62.getClass();
            qi63.b(qi62.c());
        }
        obj.x = this.x;
        return obj;
    }

    public final long l() {
        long j = this.x;
        if (j == 0) {
            return 0;
        }
        qi6 qi6 = this.w;
        qi6.getClass();
        qi6 qi62 = qi6.g;
        qi62.getClass();
        int i = qi62.c;
        if (i >= 8192 || !qi62.e) {
            return j;
        }
        return j - ((long) (i - qi62.b));
    }

    public final InputStream l0() {
        return new aa0(1, (Object) this);
    }

    public final void m0(int i) {
        qi6 V = V(2);
        byte[] bArr = V.a;
        int i2 = V.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        V.c = i2 + 2;
        this.x += 2;
    }

    public final void n0(int i, int i2, String str) {
        char c;
        char charAt;
        str.getClass();
        if (i < 0) {
            h.j(hl6.k(i, "beginIndex < 0: "));
        } else if (i2 < i) {
            h.j(b81.l(i2, i, "endIndex < beginIndex: ", " < "));
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    qi6 V = V(1);
                    byte[] bArr = V.a;
                    int i3 = V.c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt2;
                    while (true) {
                        i = i4;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            int i5 = V.c;
                            int i6 = (i3 + i) - i5;
                            V.c = i5 + i6;
                            this.x += (long) i6;
                        } else {
                            i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                        }
                    }
                    int i52 = V.c;
                    int i62 = (i3 + i) - i52;
                    V.c = i52 + i62;
                    this.x += (long) i62;
                } else {
                    if (charAt2 < 2048) {
                        qi6 V2 = V(2);
                        byte[] bArr2 = V2.a;
                        int i7 = V2.c;
                        bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                        bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                        V2.c = i7 + 2;
                        this.x += 2;
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        qi6 V3 = V(3);
                        byte[] bArr3 = V3.a;
                        int i8 = V3.c;
                        bArr3[i8] = (byte) ((charAt2 >> 12) | 224);
                        bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                        V3.c = i8 + 3;
                        this.x += 3;
                    } else {
                        int i9 = i + 1;
                        if (i9 < i2) {
                            c = str.charAt(i9);
                        } else {
                            c = 0;
                        }
                        if (charAt2 > 56319 || 56320 > c || c >= 57344) {
                            a0(63);
                            i = i9;
                        } else {
                            int i10 = (((charAt2 & 1023) << 10) | (c & 1023)) + 0;
                            qi6 V4 = V(4);
                            byte[] bArr4 = V4.a;
                            int i11 = V4.c;
                            bArr4[i11] = (byte) ((i10 >> 18) | 240);
                            bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                            V4.c = i11 + 4;
                            this.x += 4;
                            i += 2;
                        }
                    }
                    i++;
                }
            }
        } else {
            h.i(str.length(), pb4.o(i2, "endIndex > string.length: ", " > "));
        }
    }

    public final void o(sc0 sc0, long j, long j2) {
        sc0.getClass();
        long j3 = j;
        long j4 = j2;
        t49.x(this.x, j3, j4);
        if (j4 != 0) {
            sc0.x += j4;
            qi6 qi6 = this.w;
            while (true) {
                qi6.getClass();
                long j5 = (long) (qi6.c - qi6.b);
                if (j3 < j5) {
                    break;
                }
                j3 -= j5;
                qi6 = qi6.f;
            }
            long j6 = j4;
            while (j6 > 0) {
                qi6.getClass();
                qi6 c = qi6.c();
                int i = c.b + ((int) j3);
                c.b = i;
                c.c = Math.min(i + ((int) j6), c.c);
                qi6 qi62 = sc0.w;
                if (qi62 == null) {
                    c.g = c;
                    c.f = c;
                    sc0.w = c;
                } else {
                    qi6 qi63 = qi62.g;
                    qi63.getClass();
                    qi63.b(c);
                }
                j6 -= (long) (c.c - c.b);
                qi6 = qi6.f;
                j3 = 0;
            }
        }
    }

    public final void o0(String str) {
        str.getClass();
        n0(0, str.length(), str);
    }

    public final void p(long j) {
        if (this.x < j) {
            throw new EOFException();
        }
    }

    public final void p0(int i) {
        if (i < 128) {
            a0(i);
        } else if (i < 2048) {
            qi6 V = V(2);
            byte[] bArr = V.a;
            int i2 = V.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            V.c = i2 + 2;
            this.x += 2;
        } else if (55296 <= i && i < 57344) {
            a0(63);
        } else if (i < 65536) {
            qi6 V2 = V(3);
            byte[] bArr2 = V2.a;
            int i3 = V2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            V2.c = i3 + 3;
            this.x += 3;
        } else if (i <= 1114111) {
            qi6 V3 = V(4);
            byte[] bArr3 = V3.a;
            int i4 = V3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            V3.c = i4 + 4;
            this.x += 4;
        } else {
            h.q("Unexpected code point: 0x".concat(t49.e0(i)));
        }
    }

    public final dg0 q(long j) {
        if (j < 0 || j > 2147483647L) {
            h.j(f21.f(j, "byteCount: "));
            return null;
        } else if (this.x < j) {
            throw new EOFException();
        } else if (j < 4096) {
            return new dg0(D(j));
        } else {
            dg0 T = T((int) j);
            skip(j);
            return T;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        t49.x((long) bArr.length, (long) i, (long) i2);
        qi6 qi6 = this.w;
        if (qi6 == null) {
            return -1;
        }
        int min = Math.min(i2, qi6.c - qi6.b);
        byte[] bArr2 = qi6.a;
        int i3 = qi6.b;
        qs.I0(i, i3, i3 + min, bArr2, bArr);
        int i4 = qi6.b + min;
        qi6.b = i4;
        this.x -= (long) min;
        if (i4 == qi6.c) {
            this.w = qi6.a();
            ti6.a(qi6);
        }
        return min;
    }

    public final byte readByte() {
        if (this.x != 0) {
            qi6 qi6 = this.w;
            qi6.getClass();
            int i = qi6.b;
            int i2 = qi6.c;
            int i3 = i + 1;
            byte b = qi6.a[i];
            this.x--;
            if (i3 == i2) {
                this.w = qi6.a();
                ti6.a(qi6);
                return b;
            }
            qi6.b = i3;
            return b;
        }
        throw new EOFException();
    }

    public final int readInt() {
        if (this.x >= 4) {
            qi6 qi6 = this.w;
            qi6.getClass();
            int i = qi6.b;
            int i2 = qi6.c;
            if (((long) (i2 - i)) < 4) {
                return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
            }
            byte[] bArr = qi6.a;
            byte b = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i3 = i + 3;
            int i4 = i + 4;
            byte b2 = (bArr[i3] & 255) | b | ((bArr[i + 2] & 255) << 8);
            this.x -= 4;
            if (i4 == i2) {
                this.w = qi6.a();
                ti6.a(qi6);
                return b2;
            }
            qi6.b = i4;
            return b2;
        }
        throw new EOFException();
    }

    public final short readShort() {
        if (this.x >= 2) {
            qi6 qi6 = this.w;
            qi6.getClass();
            int i = qi6.b;
            int i2 = qi6.c;
            if (i2 - i < 2) {
                return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
            }
            byte[] bArr = qi6.a;
            int i3 = i + 1;
            int i4 = i + 2;
            byte b = (bArr[i3] & 255) | ((bArr[i] & 255) << 8);
            this.x -= 2;
            if (i4 == i2) {
                this.w = qi6.a();
                ti6.a(qi6);
            } else {
                qi6.b = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    public final void skip(long j) {
        while (j > 0) {
            qi6 qi6 = this.w;
            if (qi6 != null) {
                int min = (int) Math.min(j, (long) (qi6.c - qi6.b));
                long j2 = (long) min;
                this.x -= j2;
                j -= j2;
                int i = qi6.b + min;
                qi6.b = i;
                if (i == qi6.c) {
                    this.w = qi6.a();
                    ti6.a(qi6);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final long t(oy6 oy6) {
        oy6.getClass();
        long j = 0;
        while (true) {
            long Y = oy6.Y(8192, this);
            if (Y == -1) {
                return j;
            }
            j += Y;
        }
    }

    public final String toString() {
        long j = this.x;
        if (j <= 2147483647L) {
            return T((int) j).toString();
        }
        long j2 = this.x;
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + j2).toString());
    }

    public final byte u(long j) {
        long j2 = j;
        t49.x(this.x, j2, 1);
        qi6 qi6 = this.w;
        qi6.getClass();
        long j3 = this.x;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                qi6 = qi6.g;
                qi6.getClass();
                j3 -= (long) (qi6.c - qi6.b);
            }
            return qi6.a[(int) ((((long) qi6.b) + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i = qi6.c;
            int i2 = qi6.b;
            long j5 = ((long) (i - i2)) + j4;
            if (j5 > j2) {
                return qi6.a[(int) ((((long) i2) + j2) - j4)];
            }
            qi6 = qi6.f;
            qi6.getClass();
            j4 = j5;
        }
    }

    public final long v(dg0 dg0) {
        long j;
        int i;
        int i2;
        int i3;
        dg0.getClass();
        qi6 qi6 = this.w;
        if (qi6 == null) {
            return -1;
        }
        long j2 = this.x;
        long j3 = 0;
        if (j2 < 0) {
            while (j2 > 0) {
                qi6 = qi6.g;
                qi6.getClass();
                j2 -= (long) (qi6.c - qi6.b);
            }
            if (dg0.d() == 2) {
                byte i4 = dg0.i(0);
                byte i5 = dg0.i(1);
                while (j < this.x) {
                    byte[] bArr = qi6.a;
                    i2 = (int) ((((long) qi6.b) + j3) - j);
                    int i6 = qi6.c;
                    while (i2 < i6) {
                        byte b = bArr[i2];
                        if (!(b == i4 || b == i5)) {
                            i2++;
                        }
                    }
                    j3 = ((long) (qi6.c - qi6.b)) + j;
                    qi6 = qi6.f;
                    qi6.getClass();
                    j2 = j3;
                }
                return -1;
            }
            byte[] h = dg0.h();
            while (j < this.x) {
                byte[] bArr2 = qi6.a;
                i = (int) ((((long) qi6.b) + j3) - j);
                int i7 = qi6.c;
                while (i < i7) {
                    byte b2 = bArr2[i];
                    for (byte b3 : h) {
                        if (b2 == b3) {
                            i3 = qi6.b;
                            return ((long) (i2 - i3)) + j;
                        }
                    }
                    i++;
                }
                j3 = ((long) (qi6.c - qi6.b)) + j;
                qi6 = qi6.f;
                qi6.getClass();
                j2 = j3;
            }
            return -1;
        }
        j = 0;
        while (true) {
            long j4 = ((long) (qi6.c - qi6.b)) + j;
            if (j4 > 0) {
                break;
            }
            qi6 = qi6.f;
            qi6.getClass();
            j = j4;
        }
        if (dg0.d() == 2) {
            byte i8 = dg0.i(0);
            byte i9 = dg0.i(1);
            while (j < this.x) {
                byte[] bArr3 = qi6.a;
                int i10 = (int) ((((long) qi6.b) + j3) - j);
                int i11 = qi6.c;
                while (i2 < i11) {
                    byte b4 = bArr3[i2];
                    if (!(b4 == i8 || b4 == i9)) {
                        i10 = i2 + 1;
                    }
                }
                j3 = ((long) (qi6.c - qi6.b)) + j;
                qi6 = qi6.f;
                qi6.getClass();
                j = j3;
            }
            return -1;
        }
        byte[] h2 = dg0.h();
        while (j < this.x) {
            byte[] bArr4 = qi6.a;
            int i12 = (int) ((((long) qi6.b) + j3) - j);
            int i13 = qi6.c;
            while (i < i13) {
                byte b5 = bArr4[i];
                for (byte b6 : h2) {
                    if (b5 == b6) {
                        i3 = qi6.b;
                        return ((long) (i2 - i3)) + j;
                    }
                }
                i12 = i + 1;
            }
            j3 = ((long) (qi6.c - qi6.b)) + j;
            qi6 = qi6.f;
            qi6.getClass();
            j = j3;
        }
        return -1;
        i3 = qi6.b;
        return ((long) (i2 - i3)) + j;
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = (long) i2;
        t49.x((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            qi6 V = V(1);
            int min = Math.min(i3 - i, 8192 - V.c);
            int i4 = i + min;
            qs.I0(V.c, i, i4, bArr, V.a);
            V.c += min;
            i = i4;
        }
        this.x += j;
    }

    public final /* bridge */ /* synthetic */ dd0 writeByte(int i) {
        a0(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ dd0 writeInt(int i) {
        j0(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ dd0 writeShort(int i) {
        m0(i);
        return this;
    }

    public final boolean x() {
        if (this.x == 0) {
            return true;
        }
        return false;
    }

    public final int z(u75 u75) {
        u75.getClass();
        int d = b.d(this, u75, false);
        if (d == -1) {
            return -1;
        }
        skip((long) u75.w[d].d());
        return d;
    }

    public final sc0 c() {
        return this;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            qi6 V = V(1);
            int min = Math.min(i, 8192 - V.c);
            byteBuffer.get(V.a, V.c, min);
            i -= min;
            V.c += min;
        }
        this.x += (long) remaining;
        return remaining;
    }

    public final dd0 write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        qi6 qi6 = this.w;
        if (qi6 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qi6.c - qi6.b);
        byteBuffer.put(qi6.a, qi6.b, min);
        int i = qi6.b + min;
        qi6.b = i;
        this.x -= (long) min;
        if (i == qi6.c) {
            this.w = qi6.a();
            ti6.a(qi6);
        }
        return min;
    }
}
