package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c extends us0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F = Integer.MAX_VALUE;
    public final FileInputStream y;
    public final byte[] z;

    public c(FileInputStream fileInputStream) {
        Charset charset = tf3.a;
        this.y = fileInputStream;
        this.z = new byte[4096];
        this.A = 0;
        this.C = 0;
        this.E = 0;
    }

    public final int A() {
        return K();
    }

    public final long B() {
        return L();
    }

    public final boolean C(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.A - this.C;
            byte[] bArr = this.z;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.C;
                    this.C = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.c();
            }
            while (i3 < 10) {
                if (this.C == this.A) {
                    O(1);
                }
                int i6 = this.C;
                this.C = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.c();
            return true;
        } else if (i2 == 1) {
            P(8);
            return true;
        } else if (i2 == 2) {
            P(K());
            return true;
        } else if (i2 == 3) {
            D();
            a(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                P(4);
                return true;
            }
            throw InvalidProtocolBufferException.b();
        }
    }

    public final byte[] F(int i) {
        byte[] G = G(i);
        if (G != null) {
            return G;
        }
        int i2 = this.C;
        int i3 = this.A;
        int i4 = i3 - i2;
        this.E += i3;
        this.C = 0;
        this.A = 0;
        ArrayList H = H(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.z, i2, bArr, 0, i4);
        Iterator it = H.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] G(int i) {
        if (i == 0) {
            return tf3.b;
        }
        if (i >= 0) {
            int i2 = this.E;
            int i3 = this.C;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE <= 0) {
                int i5 = this.F;
                if (i4 <= i5) {
                    int i6 = this.A - i3;
                    int i7 = i - i6;
                    FileInputStream fileInputStream = this.y;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > fileInputStream.available()) {
                                return null;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            e.w = true;
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.z, this.C, bArr, 0, i6);
                    this.E += this.A;
                    this.C = 0;
                    this.A = 0;
                    while (i6 < i) {
                        try {
                            int read = fileInputStream.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.E += read;
                                i6 += read;
                            } else {
                                throw InvalidProtocolBufferException.e();
                            }
                        } catch (InvalidProtocolBufferException e2) {
                            e2.w = true;
                            throw e2;
                        }
                    }
                    return bArr;
                }
                P((i5 - i2) - i3);
                throw InvalidProtocolBufferException.e();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw InvalidProtocolBufferException.d();
    }

    public final ArrayList H(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.y.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.E += read;
                    i2 += read;
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int I() {
        int i = this.C;
        if (this.A - i < 4) {
            O(4);
            i = this.C;
        }
        this.C = i + 4;
        byte[] bArr = this.z;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long J() {
        int i = this.C;
        if (this.A - i < 8) {
            O(8);
            i = this.C;
        }
        this.C = i + 8;
        byte[] bArr = this.z;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int K() {
        byte b;
        byte b2;
        int i = this.C;
        int i2 = this.A;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.z;
            byte b3 = bArr[i];
            if (b3 >= 0) {
                this.C = i3;
                return b3;
            } else if (i2 - i3 >= 9) {
                int i4 = i + 2;
                byte b4 = (bArr[i3] << 7) ^ b3;
                if (b4 < 0) {
                    b = b4 ^ Byte.MIN_VALUE;
                } else {
                    int i5 = i + 3;
                    byte b5 = (bArr[i4] << 14) ^ b4;
                    if (b5 >= 0) {
                        b2 = b5 ^ 16256;
                    } else {
                        int i6 = i + 4;
                        byte b6 = b5 ^ (bArr[i5] << 21);
                        if (b6 < 0) {
                            b = -2080896 ^ b6;
                        } else {
                            i5 = i + 5;
                            byte b7 = bArr[i6];
                            byte b8 = (b6 ^ (b7 << 28)) ^ 266354560;
                            if (b7 < 0) {
                                i6 = i + 6;
                                if (bArr[i5] < 0) {
                                    i5 = i + 7;
                                    if (bArr[i6] < 0) {
                                        i6 = i + 8;
                                        if (bArr[i5] < 0) {
                                            i5 = i + 9;
                                            if (bArr[i6] < 0) {
                                                int i7 = i + 10;
                                                if (bArr[i5] >= 0) {
                                                    byte b9 = b8;
                                                    i4 = i7;
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
                        i4 = i6;
                    }
                    i4 = i5;
                }
                this.C = i4;
                return b;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.C;
        int i2 = this.A;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.z;
            byte b = bArr[i];
            if (b >= 0) {
                this.C = i3;
                return (long) b;
            } else if (i2 - i3 >= 9) {
                int i4 = i + 2;
                byte b2 = (bArr[i3] << 7) ^ b;
                if (b2 < 0) {
                    j = (long) (b2 ^ Byte.MIN_VALUE);
                } else {
                    int i5 = i + 3;
                    byte b3 = (bArr[i4] << 14) ^ b2;
                    if (b3 >= 0) {
                        j = (long) (b3 ^ 16256);
                        i4 = i5;
                    } else {
                        int i6 = i + 4;
                        byte b4 = b3 ^ (bArr[i5] << 21);
                        if (b4 < 0) {
                            j4 = (long) (-2080896 ^ b4);
                        } else {
                            long j5 = (long) b4;
                            int i7 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i6]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i6 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i7]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i7 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i6]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i6 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i7]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i8 = i + 10;
                                                if (((long) bArr[i4]) >= 0) {
                                                    i4 = i8;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i6;
                        j = j4;
                    }
                }
                this.C = i4;
                return j;
            }
        }
        return M();
    }

    public final long M() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.C == this.A) {
                O(1);
            }
            int i2 = this.C;
            this.C = i2 + 1;
            byte b = this.z[i2];
            j |= ((long) (b & Byte.MAX_VALUE)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void N() {
        int i = this.A + this.B;
        this.A = i;
        int i2 = this.E + i;
        int i3 = this.F;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.B = i4;
            this.A = i - i4;
            return;
        }
        this.B = 0;
    }

    public final void O(int i) {
        if (Q(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.E) - this.C) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw InvalidProtocolBufferException.e();
    }

    public final void P(int i) {
        int i2 = this.A;
        int i3 = this.C;
        int i4 = i2 - i3;
        if (i > i4 || i < 0) {
            FileInputStream fileInputStream = this.y;
            if (i >= 0) {
                int i5 = this.E;
                int i6 = i5 + i3;
                int i7 = i6 + i;
                int i8 = this.F;
                if (i7 <= i8) {
                    this.E = i6;
                    this.A = 0;
                    this.C = 0;
                    while (i4 < i) {
                        long j = (long) (i - i4);
                        try {
                            long skip = fileInputStream.skip(j);
                            int i9 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                            if (i9 < 0 || skip > j) {
                                throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            } else if (i9 == 0) {
                                break;
                            } else {
                                i4 += (int) skip;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            e.w = true;
                            throw e;
                        } catch (Throwable th) {
                            this.E += i4;
                            N();
                            throw th;
                        }
                    }
                    this.E += i4;
                    N();
                    if (i4 < i) {
                        int i10 = this.A;
                        int i11 = i10 - this.C;
                        this.C = i10;
                        O(1);
                        while (true) {
                            int i12 = i - i11;
                            int i13 = this.A;
                            if (i12 > i13) {
                                i11 += i13;
                                this.C = i13;
                                O(1);
                            } else {
                                this.C = i12;
                                return;
                            }
                        }
                    }
                } else {
                    P((i8 - i5) - i3);
                    throw InvalidProtocolBufferException.e();
                }
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            this.C = i3 + i;
        }
    }

    public final boolean Q(int i) {
        FileInputStream fileInputStream = this.y;
        int i2 = this.C;
        int i3 = i2 + i;
        int i4 = this.A;
        if (i3 > i4) {
            int i5 = this.E;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.F) {
                byte[] bArr = this.z;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.E += i2;
                    this.A -= i2;
                    this.C = 0;
                }
                int i6 = this.A;
                try {
                    int read = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.E) - i6));
                    if (read == 0 || read < -1 || read > bArr.length) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    } else if (read > 0) {
                        this.A += read;
                        N();
                        if (this.A >= i) {
                            return true;
                        }
                        return Q(i);
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.w = true;
                    throw e;
                }
            }
            return false;
        }
        h.s(pb4.i(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        return false;
    }

    public final void a(int i) {
        if (this.D != i) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        return this.E + this.C;
    }

    public final boolean c() {
        if (this.C != this.A || Q(1)) {
            return false;
        }
        return true;
    }

    public final void h(int i) {
        this.F = i;
        N();
    }

    public final int j(int i) {
        if (i >= 0) {
            int i2 = this.E + this.C + i;
            if (i2 >= 0) {
                int i3 = this.F;
                if (i2 <= i3) {
                    this.F = i2;
                    N();
                    return i3;
                }
                throw InvalidProtocolBufferException.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw InvalidProtocolBufferException.d();
    }

    public final boolean k() {
        if (L() != 0) {
            return true;
        }
        return false;
    }

    public final zf0 l() {
        int K = K();
        int i = this.A;
        int i2 = this.C;
        int i3 = i - i2;
        byte[] bArr = this.z;
        if (K <= i3 && K > 0) {
            zf0 g = zf0.g(bArr, i2, K);
            this.C += K;
            return g;
        } else if (K == 0) {
            return zf0.y;
        } else {
            if (K >= 0) {
                byte[] G = G(K);
                if (G != null) {
                    return zf0.g(G, 0, G.length);
                }
                int i4 = this.C;
                int i5 = this.A;
                int i6 = i5 - i4;
                this.E += i5;
                this.C = 0;
                this.A = 0;
                ArrayList H = H(K - i6);
                byte[] bArr2 = new byte[K];
                System.arraycopy(bArr, i4, bArr2, 0, i6);
                Iterator it = H.iterator();
                while (it.hasNext()) {
                    byte[] bArr3 = (byte[]) it.next();
                    System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
                    i6 += bArr3.length;
                }
                zf0 zf0 = zf0.y;
                return new zf0(bArr2);
            }
            throw InvalidProtocolBufferException.d();
        }
    }

    public final double m() {
        return Double.longBitsToDouble(J());
    }

    public final int n() {
        return K();
    }

    public final int o() {
        return I();
    }

    public final long p() {
        return J();
    }

    public final float q() {
        return Float.intBitsToFloat(I());
    }

    public final int r() {
        return K();
    }

    public final long s() {
        return L();
    }

    public final int t() {
        return I();
    }

    public final long u() {
        return J();
    }

    public final int v() {
        int K = K();
        return (-(K & 1)) ^ (K >>> 1);
    }

    public final long w() {
        long L = L();
        return (-(L & 1)) ^ (L >>> 1);
    }

    public final String x() {
        int K = K();
        byte[] bArr = this.z;
        if (K > 0) {
            int i = this.A;
            int i2 = this.C;
            if (K <= i - i2) {
                String str = new String(bArr, i2, K, tf3.a);
                this.C += K;
                return str;
            }
        }
        if (K == 0) {
            return "";
        }
        if (K < 0) {
            throw InvalidProtocolBufferException.d();
        } else if (K > this.A) {
            return new String(F(K), tf3.a);
        } else {
            O(K);
            String str2 = new String(bArr, this.C, K, tf3.a);
            this.C += K;
            return str2;
        }
    }

    public final String y() {
        int K = K();
        int i = this.C;
        int i2 = this.A;
        int i3 = i2 - i;
        byte[] bArr = this.z;
        if (K <= i3 && K > 0) {
            this.C = i + K;
        } else if (K == 0) {
            return "";
        } else {
            if (K >= 0) {
                i = 0;
                if (K <= i2) {
                    O(K);
                    this.C = K;
                } else {
                    bArr = F(K);
                }
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        return t08.a.c(bArr, i, K);
    }

    public final int z() {
        if (c()) {
            this.D = 0;
            return 0;
        }
        int K = K();
        this.D = K;
        if ((K >>> 3) != 0) {
            return K;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }
}
