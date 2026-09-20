package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: wk8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wk8 extends yk8 {
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i = Integer.MAX_VALUE;

    public /* synthetic */ wk8(byte[] bArr) {
        this.d = bArr;
        this.e = 0;
        this.g = 0;
    }

    public final int A() {
        return M();
    }

    public final int B() {
        return M();
    }

    public final int C() {
        return J();
    }

    public final long D() {
        return K();
    }

    public final int E() {
        return yk8.j(M());
    }

    public final long F() {
        return yk8.k(H());
    }

    public final int G() {
        return M();
    }

    public final long H() {
        long j;
        long j2;
        long j3;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return (long) b;
            } else if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                byte b2 = (bArr[i4] << 7) ^ b;
                if (b2 < 0) {
                    j = (long) (b2 ^ Byte.MIN_VALUE);
                } else {
                    int i6 = i2 + 3;
                    byte b3 = (bArr[i5] << 14) ^ b2;
                    if (b3 >= 0) {
                        j = (long) (b3 ^ 16256);
                    } else {
                        int i7 = i2 + 4;
                        byte b4 = b3 ^ (bArr[i6] << 21);
                        if (b4 < 0) {
                            i5 = i7;
                            j = (long) (-2080896 ^ b4);
                        } else {
                            i6 = i2 + 5;
                            long j4 = ((long) b4) ^ (((long) bArr[i7]) << 28);
                            if (j4 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i8 = i2 + 6;
                                long j5 = j4 ^ (((long) bArr[i6]) << 35);
                                if (j5 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i6 = i2 + 7;
                                    j4 = j5 ^ (((long) bArr[i8]) << 42);
                                    if (j4 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i8 = i2 + 8;
                                        j5 = j4 ^ (((long) bArr[i6]) << 49);
                                        if (j5 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i6 = i2 + 9;
                                            j4 = j5 ^ (((long) bArr[i8]) << 56);
                                            if (j4 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i9 = i2 + 10;
                                                long j6 = j4 ^ (((long) bArr[i6]) << 63);
                                                if (j6 >= 0) {
                                                    j = j6 ^ -9151873028817141888L;
                                                    i5 = i9;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j5 ^ j3;
                                i5 = i8;
                            }
                            j = j4 ^ j2;
                        }
                    }
                    i5 = i6;
                }
                this.g = i5;
                return j;
            }
        }
        return I();
    }

    public final long I() {
        int i2 = 0;
        long j = 0;
        while (i2 < 64) {
            int i3 = this.g;
            if (i3 != this.e) {
                this.g = i3 + 1;
                byte b = this.d[i3];
                j |= ((long) (b & Byte.MAX_VALUE)) << i2;
                if ((b & 128) == 0) {
                    return j;
                }
                i2 += 7;
            } else {
                zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
        }
        zz8.b("CodedInputStream encountered a malformed varint.");
        return 0;
    }

    public final int J() {
        int i2 = this.g;
        if (this.e - i2 >= 4) {
            this.g = i2 + 4;
            byte[] bArr = this.d;
            int i3 = (bArr[i2 + 1] & 255) << 8;
            return ((bArr[i2 + 3] & 255) << 24) | i3 | (bArr[i2] & 255) | ((bArr[i2 + 2] & 255) << 16);
        }
        zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public final long K() {
        int i2 = this.g;
        if (this.e - i2 >= 8) {
            this.g = i2 + 8;
            byte[] bArr = this.d;
            long j = (long) bArr[i2];
            long j2 = ((((long) bArr[i2 + 1]) & 255) << 8) | (j & 255) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32);
            return ((((long) bArr[i2 + 7]) & 255) << 56) | j2 | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public final byte[] L(int i2) {
        if (i2 > 0) {
            int i3 = this.e;
            int i4 = this.g;
            if (i2 <= i3 - i4) {
                int i5 = i2 + i4;
                this.g = i5;
                return Arrays.copyOfRange(this.d, i4, i5);
            }
        }
        if (i2 > 0) {
            zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        } else if (i2 == 0) {
            return xl8.a;
        } else {
            zz8.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
    }

    public final int M() {
        byte b;
        byte b2;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b3 = bArr[i2];
            if (b3 >= 0) {
                this.g = i4;
                return b3;
            } else if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                byte b4 = (bArr[i4] << 7) ^ b3;
                if (b4 < 0) {
                    b = b4 ^ Byte.MIN_VALUE;
                } else {
                    int i6 = i2 + 3;
                    byte b5 = (bArr[i5] << 14) ^ b4;
                    if (b5 >= 0) {
                        b2 = b5 ^ 16256;
                    } else {
                        int i7 = i2 + 4;
                        byte b6 = b5 ^ (bArr[i6] << 21);
                        if (b6 < 0) {
                            b = -2080896 ^ b6;
                        } else {
                            i6 = i2 + 5;
                            byte b7 = bArr[i7];
                            byte b8 = (b6 ^ (b7 << 28)) ^ 266354560;
                            if (b7 < 0) {
                                i7 = i2 + 6;
                                if (bArr[i6] < 0) {
                                    i6 = i2 + 7;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 8;
                                        if (bArr[i6] < 0) {
                                            i6 = i2 + 9;
                                            if (bArr[i7] < 0) {
                                                int i8 = i2 + 10;
                                                if (bArr[i6] >= 0) {
                                                    byte b9 = b8;
                                                    i5 = i8;
                                                    b = b9;
                                                }
                                            }
                                        }
                                    }
                                }
                                b = b8;
                            }
                            b2 = b8;
                        }
                        i5 = i7;
                    }
                    i5 = i6;
                }
                this.g = i5;
                return b;
            }
        }
        return (int) I();
    }

    public final int a(int i2) {
        if (i2 >= 0) {
            int i3 = i2 + this.g;
            if (i3 >= 0) {
                int i4 = this.i;
                if (i3 <= i4) {
                    this.i = i3;
                    int i5 = this.e + this.f;
                    this.e = i5;
                    if (i5 > i3) {
                        int i6 = i5 - i3;
                        this.f = i6;
                        this.e = i5 - i6;
                        return i4;
                    }
                    this.f = 0;
                    return i4;
                }
                zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            zz8.b("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        zz8.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public final void b(int i2) {
        this.i = i2;
        int i3 = this.e + this.f;
        this.e = i3;
        if (i3 > i2) {
            int i4 = i3 - i2;
            this.f = i4;
            this.e = i3 - i4;
            return;
        }
        this.f = 0;
    }

    public final int c() {
        int i2 = this.i;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - this.g;
    }

    public final boolean d() {
        if (this.g == this.e) {
            return true;
        }
        return false;
    }

    public final int e() {
        return this.g;
    }

    public final int f(byte[] bArr, int i2, int i3) {
        if ((bArr.length - i2) - i3 < 0 || (i2 | i3) < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i3 == 0) {
            return 0;
        } else {
            int min = Math.min(i3, this.e - this.g);
            if (min == 0) {
                return -1;
            }
            System.arraycopy(this.d, this.g, bArr, i2, min);
            this.g += min;
            return min;
        }
    }

    public final void g(int i2) {
        if (i2 >= 0) {
            int i3 = this.e;
            int i4 = this.g;
            if (i2 <= i3 - i4) {
                this.g = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            zz8.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final int l() {
        if (d()) {
            this.h = 0;
            return 0;
        }
        int M = M();
        this.h = M;
        if ((M >>> 3) != 0) {
            return M;
        }
        zz8.b("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    public final void m(int i2) {
        if (this.h != i2) {
            zz8.b("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean n(int i2) {
        int i3 = i2 & 7;
        if (i3 == 0) {
            int i4 = this.e - this.g;
            byte[] bArr = this.d;
            if (i4 >= 10) {
                int i5 = 0;
                while (i5 < 10) {
                    int i6 = this.g;
                    this.g = i6 + 1;
                    if (bArr[i6] < 0) {
                        i5++;
                    }
                }
                zz8.b("CodedInputStream encountered a malformed varint.");
                return false;
            }
            int i7 = 0;
            while (i7 < 10) {
                int i8 = this.g;
                if (i8 != this.e) {
                    this.g = i8 + 1;
                    if (bArr[i8] < 0) {
                        i7++;
                    }
                } else {
                    zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return false;
                }
            }
            zz8.b("CodedInputStream encountered a malformed varint.");
            return false;
            return true;
        } else if (i3 == 1) {
            g(8);
            return true;
        } else if (i3 == 2) {
            g(M());
            return true;
        } else if (i3 == 3) {
            i();
            m(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            if (this.b == 0) {
                m(0);
            }
            return false;
        } else if (i3 == 5) {
            g(4);
            return true;
        } else {
            kj6.g();
            return false;
        }
    }

    public final double o() {
        return Double.longBitsToDouble(K());
    }

    public final float p() {
        return Float.intBitsToFloat(J());
    }

    public final long q() {
        return H();
    }

    public final long r() {
        return H();
    }

    public final int s() {
        return M();
    }

    public final long t() {
        return K();
    }

    public final int u() {
        return J();
    }

    public final boolean v() {
        if (H() != 0) {
            return true;
        }
        return false;
    }

    public final String w() {
        int M = M();
        if (M > 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (M <= i2 - i3) {
                String str = new String(this.d, i3, M, StandardCharsets.UTF_8);
                this.g += M;
                return str;
            }
        }
        if (M == 0) {
            return "";
        }
        if (M < 0) {
            zz8.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    public final String x() {
        int M = M();
        if (M > 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (M <= i2 - i3) {
                String d2 = ln8.d(this.d, i3, M);
                this.g += M;
                return d2;
            }
        }
        if (M == 0) {
            return "";
        }
        if (M <= 0) {
            zz8.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    public final uk8 y() {
        int M = M();
        if (M > 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (M <= i2 - i3) {
                uk8 s = vk8.s(this.d, i3, M);
                this.g += M;
                return s;
            }
        }
        if (M == 0) {
            return vk8.x;
        }
        byte[] L = L(M);
        uk8 uk8 = vk8.x;
        if (L.length == 0) {
            return vk8.x;
        }
        return new uk8(L);
    }

    public final byte[] z() {
        return L(M());
    }
}
