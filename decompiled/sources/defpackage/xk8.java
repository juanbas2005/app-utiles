package defpackage;

import com.google.android.gms.internal.measurement.zzaeh;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: xk8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xk8 extends yk8 {
    public final InputStream d;
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public /* synthetic */ xk8(InputStream inputStream, int i2) {
        this.d = inputStream;
        this.e = new byte[(i2 < 8 ? 8 : i2)];
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    public final int A() {
        return G();
    }

    public final int B() {
        return G();
    }

    public final int C() {
        return P();
    }

    public final long D() {
        return Q();
    }

    public final int E() {
        return yk8.j(G());
    }

    public final long F() {
        return yk8.k(H());
    }

    public final int G() {
        byte b;
        byte b2;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b3 = bArr[i2];
            if (b3 >= 0) {
                this.h = i4;
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
                this.h = i5;
                return b;
            }
        }
        return (int) O();
    }

    public final long H() {
        long j2;
        long j3;
        long j4;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
                return (long) b;
            } else if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                byte b2 = (bArr[i4] << 7) ^ b;
                if (b2 < 0) {
                    j2 = (long) (b2 ^ Byte.MIN_VALUE);
                } else {
                    int i6 = i2 + 3;
                    byte b3 = (bArr[i5] << 14) ^ b2;
                    if (b3 >= 0) {
                        j2 = (long) (b3 ^ 16256);
                    } else {
                        int i7 = i2 + 4;
                        byte b4 = b3 ^ (bArr[i6] << 21);
                        if (b4 < 0) {
                            i5 = i7;
                            j2 = (long) (-2080896 ^ b4);
                        } else {
                            i6 = i2 + 5;
                            long j5 = ((long) b4) ^ (((long) bArr[i7]) << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                int i8 = i2 + 6;
                                long j6 = j5 ^ (((long) bArr[i6]) << 35);
                                if (j6 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i6 = i2 + 7;
                                    j5 = j6 ^ (((long) bArr[i8]) << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i2 + 8;
                                        j6 = j5 ^ (((long) bArr[i6]) << 49);
                                        if (j6 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i6 = i2 + 9;
                                            j5 = j6 ^ (((long) bArr[i8]) << 56);
                                            if (j5 >= 0) {
                                                j3 = 71499008037633920L;
                                            } else {
                                                int i9 = i2 + 10;
                                                long j7 = j5 ^ (((long) bArr[i6]) << 63);
                                                if (j7 >= 0) {
                                                    j2 = j7 ^ -9151873028817141888L;
                                                    i5 = i9;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j6 ^ j4;
                                i5 = i8;
                            }
                            j2 = j5 ^ j3;
                        }
                    }
                    i5 = i6;
                }
                this.h = i5;
                return j2;
            }
        }
        return O();
    }

    public final void I() {
        int i2 = this.f + this.g;
        this.f = i2;
        int i3 = this.j + i2;
        int i4 = this.k;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.g = i5;
            this.f = i2 - i5;
            return;
        }
        this.g = 0;
    }

    public final void J(int i2) {
        if (K(i2)) {
            return;
        }
        if (i2 > (Integer.MAX_VALUE - this.j) - this.h) {
            zz8.b("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final boolean K(int i2) {
        InputStream inputStream = this.d;
        int i3 = this.h;
        int i4 = i3 + i2;
        int i5 = this.f;
        if (i4 > i5) {
            int i6 = this.j;
            if (i2 <= (Integer.MAX_VALUE - i6) - i3 && i6 + i3 + i2 <= this.k) {
                byte[] bArr = this.e;
                if (i3 > 0) {
                    if (i5 > i3) {
                        System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                    }
                    i6 = this.j + i3;
                    this.j = i6;
                    i5 = this.f - i3;
                    this.f = i5;
                    this.h = 0;
                }
                try {
                    int read = inputStream.read(bArr, i5, Math.min(bArr.length - i5, (Integer.MAX_VALUE - i6) - i5));
                    if (read == 0 || read < -1 || read > bArr.length) {
                        String valueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(read).length() + valueOf.length() + 39 + 41);
                        sb.append(valueOf);
                        sb.append("#read(byte[]) returned invalid result: ");
                        sb.append(read);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    } else if (read > 0) {
                        this.f += read;
                        I();
                        if (this.f >= i2 || K(i2)) {
                            return true;
                        }
                    }
                } catch (zzaeh e2) {
                    e2.w = true;
                    throw e2;
                }
            }
            return false;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 66);
        sb2.append("refillBuffer() called when ");
        sb2.append(i2);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }

    public final byte[] L(int i2) {
        byte[] M = M(i2);
        if (M != null) {
            return M;
        }
        int i3 = this.h;
        int i4 = this.f;
        int i5 = i4 - i3;
        this.j += i4;
        this.h = 0;
        this.f = 0;
        ArrayList N = N(i2 - i5);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.e, i3, bArr, 0, i5);
        Iterator it = N.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return bArr;
    }

    public final byte[] M(int i2) {
        if (i2 == 0) {
            return xl8.a;
        }
        int i3 = this.j;
        int i4 = this.h;
        int i5 = i3 + i4 + i2;
        if (-2147483647 + i5 <= 0) {
            int i6 = this.k;
            if (i5 <= i6) {
                int i7 = this.f - i4;
                int i8 = i2 - i7;
                InputStream inputStream = this.d;
                if (i8 >= 4096) {
                    try {
                        if (i8 > inputStream.available()) {
                            return null;
                        }
                    } catch (zzaeh e2) {
                        e2.w = true;
                        throw e2;
                    }
                }
                byte[] bArr = new byte[i2];
                System.arraycopy(this.e, this.h, bArr, 0, i7);
                this.j += this.f;
                this.h = 0;
                this.f = 0;
                while (i7 < i2) {
                    try {
                        int read = inputStream.read(bArr, i7, i2 - i7);
                        if (read != -1) {
                            this.j += read;
                            i7 += read;
                        } else {
                            zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            return null;
                        }
                    } catch (zzaeh e3) {
                        e3.w = true;
                        throw e3;
                    }
                }
                return bArr;
            }
            g((i6 - i3) - i4);
            zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        zz8.b("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        return null;
    }

    public final ArrayList N(int i2) {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int min = Math.min(i2, 4096);
            byte[] bArr = new byte[min];
            int i3 = 0;
            while (i3 < min) {
                try {
                    int read = this.d.read(bArr, i3, min - i3);
                    if (read != -1) {
                        this.j += read;
                        i3 += read;
                    } else {
                        zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                } catch (zzaeh e2) {
                    e2.w = true;
                    throw e2;
                }
            }
            i2 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final long O() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.h == this.f) {
                J(1);
            }
            int i3 = this.h;
            this.h = i3 + 1;
            byte b = this.e[i3];
            j2 |= ((long) (b & Byte.MAX_VALUE)) << i2;
            if ((b & 128) == 0) {
                return j2;
            }
        }
        zz8.b("CodedInputStream encountered a malformed varint.");
        return 0;
    }

    public final int P() {
        int i2 = this.h;
        if (this.f - i2 < 4) {
            J(4);
            i2 = this.h;
        }
        this.h = i2 + 4;
        byte[] bArr = this.e;
        int i3 = (bArr[i2 + 1] & 255) << 8;
        return ((bArr[i2 + 3] & 255) << 24) | i3 | (bArr[i2] & 255) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final long Q() {
        int i2 = this.h;
        if (this.f - i2 < 8) {
            J(8);
            i2 = this.h;
        }
        this.h = i2 + 8;
        byte[] bArr = this.e;
        long j2 = (long) bArr[i2];
        long j3 = ((((long) bArr[i2 + 1]) & 255) << 8) | (j2 & 255) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32);
        return ((((long) bArr[i2 + 7]) & 255) << 56) | j3 | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public final int a(int i2) {
        if (i2 >= 0) {
            int i3 = this.j + this.h + i2;
            if (i3 >= 0) {
                int i4 = this.k;
                if (i3 <= i4) {
                    this.k = i3;
                    I();
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
        this.k = i2;
        I();
    }

    public final int c() {
        int i2 = this.k;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.j + this.h);
    }

    public final boolean d() {
        if (this.h != this.f || K(1)) {
            return false;
        }
        return true;
    }

    public final int e() {
        return this.j + this.h;
    }

    public final int f(byte[] bArr, int i2, int i3) {
        if ((bArr.length - i2) - i3 < 0 || (i2 | i3) < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i3 == 0) {
            return 0;
        } else {
            int i4 = this.f;
            int i5 = this.h;
            int i6 = i4 - i5;
            if (i6 > 0) {
                int min = Math.min(i3, i6);
                System.arraycopy(this.e, this.h, bArr, i2, min);
                this.h += min;
                return min;
            }
            int min2 = Math.min(i3, (this.k - this.j) - i5);
            if (min2 <= 0) {
                return -1;
            }
            try {
                int read = this.d.read(bArr, i2, min2);
                if (read != -1) {
                    this.j += read;
                }
                return read;
            } catch (zzaeh e2) {
                e2.w = true;
                throw e2;
            }
        }
    }

    public final void g(int i2) {
        InputStream inputStream = this.d;
        int i3 = this.f;
        int i4 = this.h;
        int i5 = i3 - i4;
        if (i2 <= i5 && i2 >= 0) {
            this.h = i4 + i2;
        } else if (i2 >= 0) {
            int i6 = this.j;
            int i7 = i6 + i4;
            int i8 = this.k;
            if (i7 + i2 <= i8) {
                this.j = i7;
                this.f = 0;
                this.h = 0;
                while (i5 < i2) {
                    long j2 = (long) (i2 - i5);
                    try {
                        long skip = inputStream.skip(j2);
                        int i9 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i9 < 0 || skip > j2) {
                            String valueOf = String.valueOf(inputStream.getClass());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 31 + String.valueOf(skip).length() + 41);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        } else if (i9 == 0) {
                            break;
                        } else {
                            i5 += (int) skip;
                        }
                    } catch (zzaeh e2) {
                        e2.w = true;
                        throw e2;
                    } catch (Throwable th) {
                        this.j += i5;
                        I();
                        throw th;
                    }
                }
                this.j += i5;
                I();
                if (i5 < i2) {
                    int i10 = this.f;
                    int i11 = i10 - this.h;
                    this.h = i10;
                    J(1);
                    while (true) {
                        int i12 = i2 - i11;
                        int i13 = this.f;
                        if (i12 > i13) {
                            i11 += i13;
                            this.h = i13;
                            J(1);
                        } else {
                            this.h = i12;
                            return;
                        }
                    }
                }
            } else {
                g((i8 - i6) - i4);
                zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } else {
            zz8.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public final int l() {
        if (d()) {
            this.i = 0;
            return 0;
        }
        int G = G();
        this.i = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        zz8.b("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    public final void m(int i2) {
        if (this.i != i2) {
            zz8.b("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean n(int i2) {
        int i3 = i2 & 7;
        if (i3 == 0) {
            int i4 = this.f - this.h;
            byte[] bArr = this.e;
            if (i4 >= 10) {
                int i5 = 0;
                while (i5 < 10) {
                    int i6 = this.h;
                    this.h = i6 + 1;
                    if (bArr[i6] < 0) {
                        i5++;
                    }
                }
                zz8.b("CodedInputStream encountered a malformed varint.");
                return false;
            }
            int i7 = 0;
            while (i7 < 10) {
                if (this.h == this.f) {
                    J(1);
                }
                int i8 = this.h;
                this.h = i8 + 1;
                if (bArr[i8] < 0) {
                    i7++;
                }
            }
            zz8.b("CodedInputStream encountered a malformed varint.");
            return false;
            return true;
        } else if (i3 == 1) {
            g(8);
            return true;
        } else if (i3 == 2) {
            g(G());
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
        return Double.longBitsToDouble(Q());
    }

    public final float p() {
        return Float.intBitsToFloat(P());
    }

    public final long q() {
        return H();
    }

    public final long r() {
        return H();
    }

    public final int s() {
        return G();
    }

    public final long t() {
        return Q();
    }

    public final int u() {
        return P();
    }

    public final boolean v() {
        if (H() != 0) {
            return true;
        }
        return false;
    }

    public final String w() {
        int G = G();
        byte[] bArr = this.e;
        if (G > 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (G <= i2 - i3) {
                String str = new String(bArr, i3, G, StandardCharsets.UTF_8);
                this.h += G;
                return str;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G < 0) {
            zz8.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        } else if (G > this.f) {
            return new String(L(G), StandardCharsets.UTF_8);
        } else {
            J(G);
            String str2 = new String(bArr, this.h, G, StandardCharsets.UTF_8);
            this.h += G;
            return str2;
        }
    }

    public final String x() {
        int G = G();
        int i2 = this.h;
        int i3 = this.f;
        int i4 = i3 - i2;
        byte[] bArr = this.e;
        if (G <= i4 && G > 0) {
            this.h = i2 + G;
        } else if (G == 0) {
            return "";
        } else {
            if (G >= 0) {
                i2 = 0;
                if (G <= i3) {
                    J(G);
                    this.h = G;
                } else {
                    bArr = L(G);
                }
            } else {
                zz8.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
        }
        return ln8.d(bArr, i2, G);
    }

    public final uk8 y() {
        int G = G();
        int i2 = this.f;
        int i3 = this.h;
        int i4 = i2 - i3;
        byte[] bArr = this.e;
        if (G <= i4 && G > 0) {
            uk8 s = vk8.s(bArr, i3, G);
            this.h += G;
            return s;
        } else if (G == 0) {
            return vk8.x;
        } else {
            if (G >= 0) {
                byte[] M = M(G);
                if (M != null) {
                    return vk8.s(M, 0, M.length);
                }
                int i5 = this.h;
                int i6 = this.f;
                int i7 = i6 - i5;
                this.j += i6;
                this.h = 0;
                this.f = 0;
                ArrayList N = N(G - i7);
                byte[] bArr2 = new byte[G];
                System.arraycopy(bArr, i5, bArr2, 0, i7);
                Iterator it = N.iterator();
                while (it.hasNext()) {
                    byte[] bArr3 = (byte[]) it.next();
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i7, length);
                    i7 += length;
                }
                try {
                    uk8 uk8 = vk8.x;
                    if (G == 0) {
                        return vk8.x;
                    }
                    return new uk8(bArr2);
                } catch (zzaeh e2) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
                }
            } else {
                zz8.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
        }
    }

    public final byte[] z() {
        int G = G();
        int i2 = this.f;
        int i3 = this.h;
        if (G <= i2 - i3 && G > 0) {
            byte[] copyOfRange = Arrays.copyOfRange(this.e, i3, i3 + G);
            this.h += G;
            return copyOfRange;
        } else if (G >= 0) {
            return L(G);
        } else {
            zz8.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
    }
}
