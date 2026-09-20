package defpackage;

import java.util.Arrays;

/* renamed from: up4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class up4 {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;

    public up4(int i) {
        boolean z;
        this.a = bg6.a;
        this.b = ie1.B;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f(bg6.d(i));
        } else {
            h.q("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.d;
        this.b[d(obj)] = obj;
        if (this.d != i) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != bg6.a) {
            qs.T0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        qs.S0(0, this.c, (Object) null, this.b);
        this.e = bg6.a(this.c) - this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & -9187201950435737472L) == 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        r11 = -1;
     */
    public final boolean c(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        if (obj2 != null) {
            i = obj2.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * -862048943;
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this.c;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0:
        while (true) {
            long[] jArr = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-((long) i10)) >> 63)) | (jArr[i9] >>> i10);
            long j2 = (((long) i5) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & -9187201950435737472L;
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                if (sg3.e(this.b[i2], obj2)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
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
        int i5;
        Object obj2 = obj;
        if (obj2 != null) {
            i = obj2.hashCode();
        } else {
            i = 0;
        }
        int i6 = -862048943;
        int i7 = i * -862048943;
        int i8 = i7 ^ (i7 << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.c;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j4 = ((jArr3[i14 + 1] << (64 - i15)) & ((-((long) i15)) >> 63)) | (jArr3[i14] >>> i15);
            long j5 = (long) i10;
            int i16 = i10;
            int i17 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & -9187201950435737472L;
            while (j7 != 0) {
                int numberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j7) >> 3)) & i11;
                int i18 = i6;
                if (sg3.e(this.b[numberOfTrailingZeros], obj2)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i6 = i18;
            }
            int i19 = i6;
            if ((((~j4) << 6) & j4 & -9187201950435737472L) != 0) {
                int e2 = e(i9);
                long j8 = 255;
                if (this.e != 0 || ((this.a[e2 >> 3] >> ((e2 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i20 = this.c;
                    if (i20 > 8) {
                        int i21 = 8;
                        if (Long.compare((((long) this.d) * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            int i22 = this.c;
                            Object[] objArr2 = this.b;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = 0;
                            j3 = 128;
                            while (i24 < i23) {
                                long j9 = j8;
                                long j10 = jArr4[i24] & -9187201950435737472L;
                                jArr4[i24] = -72340172838076674L & ((~j10) + (j10 >>> 7));
                                i24++;
                                i21 = i21;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i25 = i21;
                            int Z0 = qs.Z0(jArr4);
                            int i26 = Z0 - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i26] = (jArr4[i26] & 72057594037927935L) | -72057594037927936L;
                            jArr4[Z0] = jArr4[0];
                            int i27 = 0;
                            while (i27 != i22) {
                                int i28 = i27 >> 3;
                                int i29 = (i27 & 7) << 3;
                                long j12 = (jArr4[i28] >> i29) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj3 = objArr2[i27];
                                    if (obj3 != null) {
                                        i3 = obj3.hashCode();
                                    } else {
                                        i3 = 0;
                                    }
                                    int i30 = i3 * i19;
                                    int i31 = i30 ^ (i30 << 16);
                                    int i32 = i31 >>> 7;
                                    int e3 = e(i32);
                                    int i33 = i32 & i22;
                                    if (((e3 - i33) & i22) / i25 == ((i27 - i33) & i22) / i25) {
                                        long j13 = j11;
                                        jArr4[i28] = (((long) (i31 & 127)) << i29) | ((~(j << i29)) & jArr4[i28]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i27++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i34 = e3 >> 3;
                                        long j15 = jArr4[i34];
                                        int i35 = (e3 & 7) << 3;
                                        if (((j15 >> i35) & j) == 128) {
                                            i5 = i25;
                                            i4 = i22;
                                            objArr = objArr2;
                                            jArr4[i34] = ((~(j << i35)) & j15) | (((long) (i31 & 127)) << i35);
                                            jArr4[i28] = (jArr4[i28] & (~(j << i29))) | (128 << i29);
                                            objArr[e3] = objArr[i27];
                                            objArr[i27] = null;
                                        } else {
                                            i4 = i22;
                                            objArr = objArr2;
                                            i5 = i25;
                                            int i36 = e3;
                                            jArr4[i34] = (((long) (i31 & 127)) << i35) | ((~(j << i35)) & j15);
                                            Object obj4 = objArr[i36];
                                            objArr[i36] = objArr[i27];
                                            objArr[i27] = obj4;
                                            i27--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i27++;
                                        j11 = j14;
                                        i25 = i5;
                                        i22 = i4;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i27++;
                                }
                            }
                            this.e = bg6.a(this.c) - this.d;
                            e2 = e(i9);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int b2 = bg6.b(this.c);
                    long[] jArr5 = this.a;
                    Object[] objArr3 = this.b;
                    int i37 = this.c;
                    f(b2);
                    long[] jArr6 = this.a;
                    Object[] objArr4 = this.b;
                    int i38 = this.c;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr5[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr3[i39];
                            if (obj5 != null) {
                                i2 = obj5.hashCode();
                            } else {
                                i2 = 0;
                            }
                            int i40 = i2 * i19;
                            int i41 = i40 ^ (i40 << 16);
                            int e4 = e(i41 >>> 7);
                            long j16 = (long) (i41 & 127);
                            int i42 = e4 >> 3;
                            int i43 = (e4 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i42] & (~(255 << i43))) | (j16 << i43);
                            jArr[i42] = j17;
                            jArr[(((e4 - 7) & i38) + (i38 & 7)) >> 3] = j17;
                            objArr4[e4] = obj5;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i39++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e2 = e(i9);
                }
                this.d++;
                int i44 = this.e;
                long[] jArr7 = this.a;
                int i45 = e2 >> 3;
                long j18 = jArr7[i45];
                int i46 = (e2 & 7) << 3;
                if (((j18 >> i46) & j) == j3) {
                    i17 = 1;
                }
                this.e = i44 - i17;
                int i47 = this.c;
                long j19 = (j18 & (~(j << i46))) | (j2 << i46);
                jArr7[i45] = j19;
                jArr7[(((e2 - 7) & i47) + (i47 & 7)) >> 3] = j19;
                return e2;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i10 = i16;
            i6 = i19;
        }
    }

    public final int e(int i) {
        int i2 = this.c;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof up4)) {
            return false;
        }
        up4 up4 = (up4) obj;
        if (up4.d != this.d) {
            return false;
        }
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !up4.c(objArr[(i << 3) + i3])) {
                            return false;
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
        }
        return true;
    }

    public final void f(int i) {
        int i2;
        long[] jArr;
        Object[] objArr;
        if (i > 0) {
            i2 = Math.max(7, bg6.c(i));
        } else {
            i2 = 0;
        }
        this.c = i2;
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
        this.e = bg6.a(this.c) - this.d;
        if (i2 == 0) {
            objArr = ie1.B;
        } else {
            objArr = new Object[i2];
        }
        this.b = objArr;
    }

    public final boolean g() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (this.d != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (this.c * 31) + this.d;
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i3 << 3) + i5];
                            if (!sg3.e(obj, this)) {
                                if (obj != null) {
                                    i = obj.hashCode();
                                } else {
                                    i = 0;
                                }
                                i2 += i;
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i2;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        r10 = -1;
     */
    public final void i(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * -862048943;
        int i5 = i4 ^ (i4 << 16);
        int i6 = i5 & 127;
        int i7 = this.c;
        int i8 = i5 >>> 7;
        loop0:
        while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.a;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j = ((jArr[i10 + 1] << (64 - i11)) & ((-((long) i11)) >> 63)) | (jArr[i10] >>> i11);
            long j2 = (((long) i6) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & -9187201950435737472L;
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i9) & i7;
                if (sg3.e(this.b[i2], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i3 += 8;
            i8 = i9 + i3;
        }
        if (i2 >= 0) {
            m(i2);
        }
    }

    public final void j(up4 up4) {
        up4.getClass();
        Object[] objArr = up4.b;
        long[] jArr = up4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            k(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k(Object obj) {
        this.b[d(obj)] = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & -9187201950435737472L) == 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        r11 = -1;
     */
    public final boolean l(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        boolean z = false;
        if (obj2 != null) {
            i = obj2.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * -862048943;
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this.c;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0:
        while (true) {
            long[] jArr = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-((long) i10)) >> 63)) | (jArr[i9] >>> i10);
            long j2 = (((long) i5) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & -9187201950435737472L;
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                if (sg3.e(this.b[i2], obj2)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        if (i2 >= 0) {
            z = true;
        }
        if (z) {
            m(i2);
        }
        return z;
    }

    public final void m(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0:
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append("...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(", ");
                            }
                            if (obj == this) {
                                str = "(this)";
                            } else {
                                str = String.valueOf(obj);
                            }
                            sb.append(str);
                            i2++;
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
        sb.append("]");
        return sb.toString();
    }

    public /* synthetic */ up4() {
        this(6);
    }
}
