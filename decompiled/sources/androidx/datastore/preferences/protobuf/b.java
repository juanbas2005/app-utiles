package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b extends us0 {
    public int A;
    public int B;
    public final int C;
    public int D;
    public int E = Integer.MAX_VALUE;
    public final byte[] y;
    public int z;

    public b(byte[] bArr, int i, int i2, boolean z2) {
        this.y = bArr;
        this.z = i2 + i;
        this.B = i;
        this.C = i;
    }

    public final int A() {
        return H();
    }

    public final long B() {
        return I();
    }

    public final boolean C(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.z - this.B;
            byte[] bArr = this.y;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.B;
                    this.B = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.c();
            }
            while (i3 < 10) {
                int i6 = this.B;
                if (i6 != this.z) {
                    this.B = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
            throw InvalidProtocolBufferException.c();
            return true;
        } else if (i2 == 1) {
            L(8);
            return true;
        } else if (i2 == 2) {
            L(H());
            return true;
        } else if (i2 == 3) {
            D();
            a(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                L(4);
                return true;
            }
            throw InvalidProtocolBufferException.b();
        }
    }

    public final int F() {
        int i = this.B;
        if (this.z - i >= 4) {
            this.B = i + 4;
            byte[] bArr = this.y;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw InvalidProtocolBufferException.e();
    }

    public final long G() {
        int i = this.B;
        if (this.z - i >= 8) {
            this.B = i + 8;
            byte[] bArr = this.y;
            return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
        }
        throw InvalidProtocolBufferException.e();
    }

    public final int H() {
        byte b;
        byte b2;
        int i = this.B;
        int i2 = this.z;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.y;
            byte b3 = bArr[i];
            if (b3 >= 0) {
                this.B = i3;
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
                this.B = i4;
                return b;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.B;
        int i2 = this.z;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.y;
            byte b = bArr[i];
            if (b >= 0) {
                this.B = i3;
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
                this.B = i4;
                return j;
            }
        }
        return J();
    }

    public final long J() {
        long j = 0;
        int i = 0;
        while (i < 64) {
            int i2 = this.B;
            if (i2 != this.z) {
                this.B = i2 + 1;
                byte b = this.y[i2];
                j |= ((long) (b & Byte.MAX_VALUE)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
                i += 7;
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void K() {
        int i = this.z + this.A;
        this.z = i;
        int i2 = i - this.C;
        int i3 = this.E;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.A = i4;
            this.z = i - i4;
            return;
        }
        this.A = 0;
    }

    public final void L(int i) {
        if (i >= 0) {
            int i2 = this.z;
            int i3 = this.B;
            if (i <= i2 - i3) {
                this.B = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    public final void a(int i) {
        if (this.D != i) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        return this.B - this.C;
    }

    public final boolean c() {
        if (this.B == this.z) {
            return true;
        }
        return false;
    }

    public final void h(int i) {
        this.E = i;
        K();
    }

    public final int j(int i) {
        if (i >= 0) {
            int b = b() + i;
            if (b >= 0) {
                int i2 = this.E;
                if (b <= i2) {
                    this.E = b;
                    K();
                    return i2;
                }
                throw InvalidProtocolBufferException.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw InvalidProtocolBufferException.d();
    }

    public final boolean k() {
        if (I() != 0) {
            return true;
        }
        return false;
    }

    public final zf0 l() {
        byte[] bArr;
        int H = H();
        byte[] bArr2 = this.y;
        if (H > 0) {
            int i = this.z;
            int i2 = this.B;
            if (H <= i - i2) {
                zf0 g = zf0.g(bArr2, i2, H);
                this.B += H;
                return g;
            }
        }
        if (H == 0) {
            return zf0.y;
        }
        if (H > 0) {
            int i3 = this.z;
            int i4 = this.B;
            if (H <= i3 - i4) {
                int i5 = H + i4;
                this.B = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                zf0 zf0 = zf0.y;
                return new zf0(bArr);
            }
        }
        if (H > 0) {
            throw InvalidProtocolBufferException.e();
        } else if (H == 0) {
            bArr = tf3.b;
            zf0 zf02 = zf0.y;
            return new zf0(bArr);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    public final double m() {
        return Double.longBitsToDouble(G());
    }

    public final int n() {
        return H();
    }

    public final int o() {
        return F();
    }

    public final long p() {
        return G();
    }

    public final float q() {
        return Float.intBitsToFloat(F());
    }

    public final int r() {
        return H();
    }

    public final long s() {
        return I();
    }

    public final int t() {
        return F();
    }

    public final long u() {
        return G();
    }

    public final int v() {
        int H = H();
        return (-(H & 1)) ^ (H >>> 1);
    }

    public final long w() {
        long I = I();
        return (-(I & 1)) ^ (I >>> 1);
    }

    public final String x() {
        int H = H();
        if (H > 0) {
            int i = this.z;
            int i2 = this.B;
            if (H <= i - i2) {
                String str = new String(this.y, i2, H, tf3.a);
                this.B += H;
                return str;
            }
        }
        if (H == 0) {
            return "";
        }
        if (H < 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    public final String y() {
        int H = H();
        if (H > 0) {
            int i = this.z;
            int i2 = this.B;
            if (H <= i - i2) {
                String c = t08.a.c(this.y, i2, H);
                this.B += H;
                return c;
            }
        }
        if (H == 0) {
            return "";
        }
        if (H <= 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    public final int z() {
        if (c()) {
            this.D = 0;
            return 0;
        }
        int H = H();
        this.D = H;
        if ((H >>> 3) != 0) {
            return H;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }
}
