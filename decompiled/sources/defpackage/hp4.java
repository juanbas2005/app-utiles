package defpackage;

import java.util.Arrays;

/* renamed from: hp4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hp4 {
    public long[] a;
    public Object[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public hp4(int i) {
        boolean z;
        this.a = bg6.a;
        this.b = ie1.B;
        this.c = ve3.a;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            e(bg6.d(i));
        } else {
            h.q("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != bg6.a) {
            qs.T0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        qs.S0(0, this.d, (Object) null, this.b);
        this.f = bg6.a(this.d) - this.e;
    }

    public final int b(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-((long) i6)) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & -9187201950435737472L;
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int c(Object obj) {
        int i;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Object obj2 = obj;
        if (obj2 != null) {
            i = obj2.hashCode();
        } else {
            i = 0;
        }
        int i5 = -862048943;
        int i6 = i * -862048943;
        int i7 = i6 ^ (i6 << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.d;
        int i11 = i8 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j4 = ((jArr3[i13 + 1] << (64 - i14)) & ((-((long) i14)) >> 63)) | (jArr3[i13] >>> i14);
            long j5 = (long) i9;
            int i15 = i9;
            int i16 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & -9187201950435737472L;
            while (j7 != 0) {
                int numberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j7) >> 3)) & i10;
                int i17 = i5;
                if (sg3.e(this.b[numberOfTrailingZeros], obj2)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i5 = i17;
            }
            int i18 = i5;
            if ((((~j4) << 6) & j4 & -9187201950435737472L) != 0) {
                int b2 = b(i8);
                long j8 = 255;
                if (this.f != 0 || ((this.a[b2 >> 3] >> ((b2 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i19 = this.d;
                    if (i19 > 8) {
                        int i20 = 8;
                        if (Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) i19) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            int i21 = this.d;
                            Object[] objArr2 = this.b;
                            int[] iArr = this.c;
                            j3 = 128;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = 0;
                            while (i23 < i22) {
                                long j9 = j8;
                                long j10 = jArr4[i23] & -9187201950435737472L;
                                jArr4[i23] = -72340172838076674L & ((~j10) + (j10 >>> 7));
                                i23++;
                                i20 = i20;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i24 = i20;
                            int Z0 = qs.Z0(jArr4);
                            int i25 = Z0 - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i25] = (jArr4[i25] & 72057594037927935L) | -72057594037927936L;
                            jArr4[Z0] = jArr4[0];
                            int i26 = 0;
                            while (i26 != i21) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j12 = (jArr4[i27] >> i28) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj3 = objArr2[i26];
                                    if (obj3 != null) {
                                        i3 = obj3.hashCode();
                                    } else {
                                        i3 = 0;
                                    }
                                    int i29 = i3 * i18;
                                    int i30 = i29 ^ (i29 << 16);
                                    int i31 = i30 >>> 7;
                                    int b3 = b(i31);
                                    int i32 = i31 & i21;
                                    long j13 = j11;
                                    if (((b3 - i32) & i21) / 8 == ((i26 - i32) & i21) / i24) {
                                        int i33 = i28;
                                        jArr4[i27] = (((long) (i30 & 127)) << i33) | (jArr4[i27] & (~(j << i33)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i26++;
                                        j11 = j13;
                                        i24 = i24;
                                    } else {
                                        int i34 = i24;
                                        int i35 = i28;
                                        int i36 = b3 >> 3;
                                        long j14 = jArr4[i36];
                                        int i37 = (b3 & 7) << 3;
                                        if (((j14 >> i37) & j) == 128) {
                                            i4 = i21;
                                            objArr = objArr2;
                                            jArr4[i36] = ((~(j << i37)) & j14) | (((long) (i30 & 127)) << i37);
                                            jArr4[i27] = (jArr4[i27] & (~(j << i35))) | (128 << i35);
                                            objArr[b3] = objArr[i26];
                                            objArr[i26] = null;
                                            iArr[b3] = iArr[i26];
                                            iArr[i26] = 0;
                                        } else {
                                            i4 = i21;
                                            objArr = objArr2;
                                            jArr4[i36] = (((long) (i30 & 127)) << i37) | ((~(j << i37)) & j14);
                                            Object obj4 = objArr[b3];
                                            objArr[b3] = objArr[i26];
                                            objArr[i26] = obj4;
                                            int i38 = iArr[b3];
                                            iArr[b3] = iArr[i26];
                                            iArr[i26] = i38;
                                            i26--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i26++;
                                        i21 = i4;
                                        j11 = j13;
                                        i24 = i34;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i26++;
                                }
                            }
                            this.f = bg6.a(this.d) - this.e;
                            b2 = b(i8);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int b4 = bg6.b(this.d);
                    long[] jArr5 = this.a;
                    Object[] objArr3 = this.b;
                    int[] iArr2 = this.c;
                    int i39 = this.d;
                    e(b4);
                    long[] jArr6 = this.a;
                    Object[] objArr4 = this.b;
                    int[] iArr3 = this.c;
                    int i40 = this.d;
                    int i41 = 0;
                    while (i41 < i39) {
                        if (((jArr5[i41 >> 3] >> ((i41 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr3[i41];
                            if (obj5 != null) {
                                i2 = obj5.hashCode();
                            } else {
                                i2 = 0;
                            }
                            int i42 = i2 * i18;
                            int i43 = i42 ^ (i42 << 16);
                            int b5 = b(i43 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = (long) (i43 & 127);
                            int i44 = b5 >> 3;
                            int i45 = (b5 & 7) << 3;
                            long j16 = (jArr[i44] & (~(255 << i45))) | (j15 << i45);
                            jArr[i44] = j16;
                            jArr[(((b5 - 7) & i40) + (i40 & 7)) >> 3] = j16;
                            objArr4[b5] = obj5;
                            iArr3[b5] = iArr2[i41];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i41++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    b2 = b(i8);
                }
                this.e++;
                int i46 = this.f;
                long[] jArr7 = this.a;
                int i47 = b2 >> 3;
                long j17 = jArr7[i47];
                int i48 = (b2 & 7) << 3;
                if (((j17 >> i48) & j) == j3) {
                    i16 = 1;
                }
                this.f = i46 - i16;
                int i49 = this.d;
                long j18 = (j17 & (~(j << i48))) | (j2 << i48);
                jArr7[i47] = j18;
                jArr7[(((b2 - 7) & i49) + (i49 & 7)) >> 3] = j18;
                return ~b2;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
            i9 = i15;
            i5 = i18;
        }
    }

    public final int d(Object obj) {
        int i;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * -862048943;
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this.d;
        int i7 = i4 >>> 7;
        while (true) {
            int i8 = i7 & i6;
            long[] jArr = this.a;
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-((long) i10)) >> 63)) | (jArr[i9] >>> i10);
            long j2 = (((long) i5) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & -9187201950435737472L; j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i8) & i6;
                if (sg3.e(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & -9187201950435737472L) != 0) {
                return -1;
            }
            i2 += 8;
            i7 = i8 + i2;
        }
    }

    public final void e(int i) {
        int i2;
        long[] jArr;
        if (i > 0) {
            i2 = Math.max(7, bg6.c(i));
        } else {
            i2 = 0;
        }
        this.d = i2;
        if (i2 == 0) {
            jArr = bg6.a;
        } else {
            int i3 = ((i2 + 15) & -8) >> 3;
            long[] jArr2 = new long[i3];
            Arrays.fill(jArr2, 0, i3, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j)) | j;
        this.f = bg6.a(this.d) - this.e;
        this.b = new Object[i2];
        this.c = new int[i2];
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final boolean equals(Object r18) {
        hp4 hp4 = r18;
        if (hp4 == this) {
            return true;
        }
        if (!(hp4 instanceof hp4)) {
            return false;
        }
        hp4 hp42 = hp4;
        if (hp42.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0:
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            int i5 = iArr[i4];
                            int d2 = hp42.d(obj);
                            if (d2 < 0 || i5 != hp42.c[d2]) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return false;
        }
        return true;
    }

    public final void f(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final void g(int i, Object obj) {
        int c2 = c(obj);
        if (c2 < 0) {
            c2 = ~c2;
        }
        this.b[c2] = obj;
        this.c[c2] = i;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj = objArr[i6];
                        int i7 = iArr[i6];
                        if (obj != null) {
                            i = obj.hashCode();
                        } else {
                            i = 0;
                        }
                        i3 += Integer.hashCode(i7) ^ i;
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return i3;
                }
            }
            if (i2 == length) {
                return i3;
            }
            i2++;
        }
    }

    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ hp4() {
        this(6);
    }
}
