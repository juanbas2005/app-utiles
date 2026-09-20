package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: ts0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ts0 {
    public final byte[] a = new byte[4096];
    public int b = 0;
    public int c;
    public int d = 0;
    public final InputStream e;
    public int f;
    public int g = 0;
    public int h = Integer.MAX_VALUE;
    public int i;

    public ts0(InputStream inputStream) {
        this.e = inputStream;
    }

    public final void a(int i2) {
        if (this.f != i2) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void b() {
        if (this.i >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public final int c() {
        int i2 = this.h;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.g + this.d);
    }

    public final void d(int i2) {
        this.h = i2;
        p();
    }

    public final int e(int i2) {
        if (i2 >= 0) {
            int i3 = this.g + this.d + i2;
            int i4 = this.h;
            if (i3 <= i4) {
                this.h = i3;
                p();
                return i4;
            }
            throw InvalidProtocolBufferException.b();
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final b94 f() {
        int l = l();
        int i2 = this.b;
        int i3 = this.d;
        if (l <= i2 - i3 && l > 0) {
            byte[] bArr = new byte[l];
            System.arraycopy(this.a, i3, bArr, 0, l);
            b94 b94 = new b94(bArr);
            this.d += l;
            return b94;
        } else if (l == 0) {
            return bg0.w;
        } else {
            return new b94(i(l));
        }
    }

    public final int g() {
        return l();
    }

    public final k2 h(fp3 fp3, y92 y92) {
        int l = l();
        b();
        int e2 = e(l);
        this.i++;
        k2 k2Var = (k2) fp3.b(this, y92);
        a(0);
        this.i--;
        d(e2);
        return k2Var;
    }

    public final byte[] i(int i2) {
        if (i2 > 0) {
            int i3 = this.g;
            int i4 = this.d;
            int i5 = i3 + i4 + i2;
            int i6 = this.h;
            if (i5 <= i6) {
                byte[] bArr = this.a;
                if (i2 < 4096) {
                    byte[] bArr2 = new byte[i2];
                    int i7 = this.b - i4;
                    System.arraycopy(bArr, i4, bArr2, 0, i7);
                    this.d = this.b;
                    int i8 = i2 - i7;
                    if (i8 > 0) {
                        q(i8);
                    }
                    System.arraycopy(bArr, 0, bArr2, i7, i8);
                    this.d = i8;
                    return bArr2;
                }
                int i9 = this.b;
                this.g = i3 + i9;
                this.d = 0;
                this.b = 0;
                int i10 = i9 - i4;
                int i11 = i2 - i10;
                ArrayList arrayList = new ArrayList();
                while (i11 > 0) {
                    int min = Math.min(i11, 4096);
                    byte[] bArr3 = new byte[min];
                    int i12 = 0;
                    while (i12 < min) {
                        int read = this.e.read(bArr3, i12, min - i12);
                        if (read != -1) {
                            this.g += read;
                            i12 += read;
                        } else {
                            throw InvalidProtocolBufferException.b();
                        }
                    }
                    i11 -= min;
                    arrayList.add(bArr3);
                }
                byte[] bArr4 = new byte[i2];
                System.arraycopy(bArr, i4, bArr4, 0, i10);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    byte[] bArr5 = (byte[]) it.next();
                    System.arraycopy(bArr5, 0, bArr4, i10, bArr5.length);
                    i10 += bArr5.length;
                }
                return bArr4;
            }
            s((i6 - i3) - i4);
            throw InvalidProtocolBufferException.b();
        } else if (i2 == 0) {
            return sf3.a;
        } else {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public final int j() {
        int i2 = this.d;
        if (this.b - i2 < 4) {
            q(4);
            i2 = this.d;
        }
        this.d = i2 + 4;
        byte[] bArr = this.a;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final long k() {
        int i2 = this.d;
        if (this.b - i2 < 8) {
            q(8);
            i2 = this.d;
        }
        this.d = i2 + 8;
        byte[] bArr = this.a;
        return ((((long) bArr[i2 + 1]) & 255) << 8) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    public final int l() {
        int i2;
        int i3;
        int i4 = this.d;
        int i5 = this.b;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.a;
            byte b2 = bArr[i4];
            if (b2 >= 0) {
                this.d = i6;
                return b2;
            } else if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                byte b3 = (bArr[i6] << 7) ^ b2;
                long j = (long) b3;
                if (j < 0) {
                    i2 = (int) (-128 ^ j);
                } else {
                    int i8 = i4 + 3;
                    byte b4 = (bArr[i7] << 14) ^ b3;
                    long j2 = (long) b4;
                    if (j2 >= 0) {
                        i3 = (int) (16256 ^ j2);
                    } else {
                        int i9 = i4 + 4;
                        byte b5 = b4 ^ (bArr[i8] << 21);
                        long j3 = (long) b5;
                        if (j3 < 0) {
                            i2 = (int) (-2080896 ^ j3);
                        } else {
                            i8 = i4 + 5;
                            byte b6 = bArr[i9];
                            int i10 = (int) (((long) (b5 ^ (b6 << 28))) ^ 266354560);
                            if (b6 < 0) {
                                i9 = i4 + 6;
                                if (bArr[i8] < 0) {
                                    i8 = i4 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i4 + 8;
                                        if (bArr[i8] < 0) {
                                            i8 = i4 + 9;
                                            if (bArr[i9] < 0) {
                                                int i11 = i4 + 10;
                                                if (bArr[i8] >= 0) {
                                                    int i12 = i10;
                                                    i7 = i11;
                                                    i2 = i12;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i10;
                            }
                            i3 = i10;
                        }
                        i7 = i9;
                    }
                    i7 = i8;
                }
                this.d = i7;
                return i2;
            }
        }
        return (int) n();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (((long) r3[r2]) < 0) goto L_0x00b8;
     */
    public final long m() {
        long j;
        int i2;
        long j2;
        long j3;
        int i3 = this.d;
        int i4 = this.b;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.a;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.d = i5;
                return (long) b2;
            } else if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                long j4 = (long) ((bArr[i5] << 7) ^ b2);
                if (j4 < 0) {
                    j2 = -128;
                } else {
                    int i7 = i3 + 3;
                    long j5 = j4 ^ ((long) (bArr[i6] << 14));
                    if (j5 >= 0) {
                        j3 = 16256;
                    } else {
                        i6 = i3 + 4;
                        j4 = j5 ^ ((long) (bArr[i7] << 21));
                        if (j4 < 0) {
                            j2 = -2080896;
                        } else {
                            i7 = i3 + 5;
                            j5 = j4 ^ (((long) bArr[i6]) << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i6 = i3 + 6;
                                j4 = j5 ^ (((long) bArr[i7]) << 35);
                                if (j4 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i7 = i3 + 7;
                                    j5 = j4 ^ (((long) bArr[i6]) << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i6 = i3 + 8;
                                        j4 = j5 ^ (((long) bArr[i7]) << 49);
                                        if (j4 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            int i8 = i3 + 9;
                                            long j6 = (j4 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j6 < 0) {
                                                i2 = i3 + 10;
                                            } else {
                                                i2 = i8;
                                            }
                                            j = j6;
                                            this.d = i2;
                                            return j;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i2 = i7;
                    j = j3 ^ j5;
                    this.d = i2;
                    return j;
                }
                j = j2 ^ j4;
                this.d = i2;
                return j;
            }
        }
        return n();
    }

    public final long n() {
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.d == this.b) {
                q(1);
            }
            int i3 = this.d;
            this.d = i3 + 1;
            byte b2 = this.a[i3];
            j |= ((long) (b2 & Byte.MAX_VALUE)) << i2;
            if ((b2 & 128) == 0) {
                return j;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public final int o() {
        if (this.d != this.b || t(1)) {
            int l = l();
            this.f = l;
            if ((l >>> 3) != 0) {
                return l;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        this.f = 0;
        return 0;
    }

    public final void p() {
        int i2 = this.b + this.c;
        this.b = i2;
        int i3 = this.g + i2;
        int i4 = this.h;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.c = i5;
            this.b = i2 - i5;
            return;
        }
        this.c = 0;
    }

    public final void q(int i2) {
        if (!t(i2)) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final boolean r(int i2, xs0 xs0) {
        boolean r;
        int i3 = i2 & 7;
        if (i3 == 0) {
            long m = m();
            xs0.f0(i2);
            xs0.g0(m);
            return true;
        } else if (i3 == 1) {
            long k = k();
            xs0.f0(i2);
            xs0.e0(k);
            return true;
        } else if (i3 == 2) {
            b94 f2 = f();
            xs0.f0(i2);
            xs0.f0(f2.size());
            xs0.b0(f2);
            return true;
        } else if (i3 == 3) {
            xs0.f0(i2);
            do {
                int o = o();
                if (o == 0) {
                    break;
                }
                b();
                this.i++;
                r = r(o, xs0);
                this.i--;
            } while (r);
            int i4 = ((i2 >>> 3) << 3) | 4;
            a(i4);
            xs0.f0(i4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                int j = j();
                xs0.f0(i2);
                xs0.d0(j);
                return true;
            }
            throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
        }
    }

    public final void s(int i2) {
        int i3 = this.b;
        int i4 = this.d;
        int i5 = i3 - i4;
        if (i2 <= i5 && i2 >= 0) {
            this.d = i4 + i2;
        } else if (i2 >= 0) {
            int i6 = this.g;
            int i7 = i6 + i4 + i2;
            int i8 = this.h;
            if (i7 <= i8) {
                this.d = i3;
                q(1);
                while (true) {
                    int i9 = i2 - i5;
                    int i10 = this.b;
                    if (i9 > i10) {
                        i5 += i10;
                        this.d = i10;
                        q(1);
                    } else {
                        this.d = i9;
                        return;
                    }
                }
            } else {
                s((i8 - i6) - i4);
                throw InvalidProtocolBufferException.b();
            }
        } else {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public final boolean t(int i2) {
        int i3 = this.d;
        int i4 = i3 + i2;
        int i5 = this.b;
        if (i4 > i5) {
            if (this.g + i3 + i2 <= this.h) {
                byte[] bArr = this.a;
                if (i3 > 0) {
                    if (i5 > i3) {
                        System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                    }
                    this.g += i3;
                    this.b -= i3;
                    this.d = 0;
                }
                int i6 = this.b;
                int read = this.e.read(bArr, i6, bArr.length - i6);
                if (read == 0 || read < -1 || read > bArr.length) {
                    h.s(pb4.i(read, "InputStream#read(byte[]) returned invalid result: ", "\nThe InputStream implementation is buggy."));
                    return false;
                } else if (read > 0) {
                    this.b += read;
                    if ((this.g + i2) - 67108864 <= 0) {
                        p();
                        if (this.b >= i2) {
                            return true;
                        }
                        return t(i2);
                    }
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
            }
            return false;
        }
        h.s(pb4.i(i2, "refillBuffer() called when ", " bytes were already available in buffer"));
        return false;
    }
}
