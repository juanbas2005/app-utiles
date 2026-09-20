package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: mp4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mp4 {
    public long[] a = bg6.a;
    public Object[] b = ie1.B;
    public long[] c = gl0.t;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f;
    public int g;
    public int h;

    public mp4(int i) {
        boolean z;
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
        int i = this.g;
        int d2 = d(obj);
        this.b[d2] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[d2] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) d2) & 2147483647L) << 31) | (jArr[i2] & -4611686016279904257L);
        }
        this.d = d2;
        if (this.e == Integer.MAX_VALUE) {
            this.e = d2;
        }
        if (this.g != i) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.g = 0;
        long[] jArr = this.a;
        if (jArr != bg6.a) {
            qs.T0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        qs.S0(0, this.f, (Object) null, this.b);
        qs.T0(this.c, 4611686018427387903L);
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.h = bg6.a(this.f) - this.g;
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
        int i6 = this.f;
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
        int i2;
        long j3;
        char c2;
        int i3;
        int i4;
        long[] jArr;
        long[] jArr2;
        int i5;
        int i6;
        int i7;
        int i8;
        long j4;
        Object obj2 = obj;
        if (obj2 != null) {
            i = obj2.hashCode();
        } else {
            i = 0;
        }
        int i9 = -862048943;
        int i10 = i * -862048943;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j5 = ((jArr3[i17 + 1] << (64 - i18)) & ((-((long) i18)) >> 63)) | (jArr3[i17] >>> i18);
            long j6 = (long) i13;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7) & -9187201950435737472L;
            while (j8 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i15) & i14;
                int i19 = i9;
                if (sg3.e(this.b[numberOfTrailingZeros], obj2)) {
                    return numberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i9 = i19;
            }
            int i20 = i9;
            if ((j5 & ((~j5) << 6) & -9187201950435737472L) != 0) {
                int e2 = e(i12);
                long j9 = 255;
                if (this.h != 0 || ((this.a[e2 >> 3] >> ((e2 & 7) << 3)) & 255) == 254) {
                    i2 = 0;
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i21 = this.f;
                    if (i21 > 8) {
                        c2 = 31;
                        j3 = 128;
                        if (Long.compare((((long) this.g) * 32) ^ Long.MIN_VALUE, (((long) i21) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            if (jArr4 == null) {
                                i2 = 0;
                                j = j6;
                                j2 = 255;
                            } else {
                                int i22 = this.f;
                                Object[] objArr = this.b;
                                long[] jArr5 = this.c;
                                long[] jArr6 = new long[i22];
                                Arrays.fill(jArr6, 0, i22, 9223372034707292159L);
                                i2 = 0;
                                int i23 = (i22 + 7) >> 3;
                                int i24 = 0;
                                while (i24 < i23) {
                                    long j10 = j9;
                                    long j11 = jArr4[i24] & -9187201950435737472L;
                                    int i25 = i24;
                                    jArr4[i25] = ((~j11) + (j11 >>> 7)) & -72340172838076674L;
                                    i24 = i25 + 1;
                                    j9 = j10;
                                }
                                j2 = j9;
                                int length = jArr4.length;
                                int i26 = length - 1;
                                int i27 = length - 2;
                                jArr4[i27] = (jArr4[i27] & 72057594037927935L) | -72057594037927936L;
                                jArr4[i26] = jArr4[0];
                                int i28 = 0;
                                while (i28 != i22) {
                                    int i29 = i28 >> 3;
                                    int i30 = (i28 & 7) << 3;
                                    long j12 = (jArr4[i29] >> i30) & j2;
                                    if (j12 != 128 && j12 == 254) {
                                        Object obj3 = objArr[i28];
                                        if (obj3 != null) {
                                            i8 = obj3.hashCode();
                                        } else {
                                            i8 = 0;
                                        }
                                        int i31 = i8 * i20;
                                        int i32 = i31 ^ (i31 << 16);
                                        int i33 = i32 >>> 7;
                                        int e3 = e(i33);
                                        int i34 = i33 & i22;
                                        if (((e3 - i34) & i22) / 8 == ((i28 - i34) & i22) / 8) {
                                            int i35 = i22;
                                            Object[] objArr2 = objArr;
                                            jArr4[i29] = (jArr4[i29] & (~(j2 << i30))) | (((long) (i32 & 127)) << i30);
                                            if (jArr6[i28] == 9223372034707292159L) {
                                                long j13 = (long) i28;
                                                jArr6[i28] = j13 | (j13 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i28++;
                                            i22 = i35;
                                            objArr = objArr2;
                                        } else {
                                            int i36 = i22;
                                            Object[] objArr3 = objArr;
                                            int i37 = e3 >> 3;
                                            long j14 = jArr4[i37];
                                            int i38 = (e3 & 7) << 3;
                                            if (((j14 >> i38) & j2) == 128) {
                                                int i39 = i38;
                                                jArr4[i37] = (j14 & (~(j2 << i39))) | (((long) (i32 & 127)) << i39);
                                                jArr4[i29] = (jArr4[i29] & (~(j2 << i30))) | (128 << i30);
                                                objArr3[e3] = objArr3[i28];
                                                objArr3[i28] = null;
                                                jArr5[e3] = jArr5[i28];
                                                jArr5[i28] = 4611686018427387903L;
                                                int i40 = (int) ((jArr6[i28] >> 32) & 4294967295L);
                                                if (i40 != Integer.MAX_VALUE) {
                                                    j4 = j6;
                                                    jArr6[i40] = ((long) e3) | (jArr6[i40] & -4294967296L);
                                                    jArr6[i28] = (jArr6[i28] & 4294967295L) | -4294967296L;
                                                } else {
                                                    j4 = j6;
                                                    jArr6[i28] = 9223372032559808512L | ((long) e3);
                                                }
                                                jArr6[e3] = (((long) i28) << 32) | 2147483647L;
                                            } else {
                                                int i41 = i38;
                                                j4 = j6;
                                                jArr4[i37] = (((long) (i32 & 127)) << i41) | (j14 & (~(j2 << i41)));
                                                Object obj4 = objArr3[e3];
                                                objArr3[e3] = objArr3[i28];
                                                objArr3[i28] = obj4;
                                                long j15 = jArr5[e3];
                                                jArr5[e3] = jArr5[i28];
                                                jArr5[i28] = j15;
                                                int i42 = (int) ((jArr6[i28] >> 32) & 4294967295L);
                                                if (i42 != Integer.MAX_VALUE) {
                                                    long j16 = (long) e3;
                                                    jArr6[i42] = (jArr6[i42] & -4294967296L) | j16;
                                                    jArr6[i28] = (jArr6[i28] & 4294967295L) | (j16 << 32);
                                                } else {
                                                    long j17 = (long) e3;
                                                    jArr6[i28] = j17 | (j17 << 32);
                                                    i42 = i28;
                                                }
                                                jArr6[e3] = (((long) i42) << 32) | ((long) i28);
                                                i28--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i28++;
                                            i22 = i36;
                                            objArr = objArr3;
                                            j6 = j4;
                                        }
                                    } else {
                                        i28++;
                                    }
                                }
                                j = j6;
                                this.h = bg6.a(this.f) - this.g;
                                long[] jArr7 = this.c;
                                int length2 = jArr7.length;
                                for (int i43 = 0; i43 < length2; i43++) {
                                    long j18 = jArr7[i43];
                                    int i44 = (int) ((j18 >> 31) & 2147483647L);
                                    int i45 = (int) (j18 & 2147483647L);
                                    long j19 = j18 & -4611686018427387904L;
                                    if (i44 == Integer.MAX_VALUE) {
                                        i6 = Integer.MAX_VALUE;
                                    } else {
                                        i6 = (int) (jArr6[i44] & 4294967295L);
                                    }
                                    long j20 = (j19 | ((long) i6)) << 31;
                                    if (i45 == Integer.MAX_VALUE) {
                                        i7 = Integer.MAX_VALUE;
                                    } else {
                                        i7 = (int) (jArr6[i45] & 4294967295L);
                                    }
                                    jArr7[i43] = j20 | ((long) i7);
                                }
                                int i46 = this.d;
                                if (i46 != Integer.MAX_VALUE) {
                                    this.d = (int) (jArr6[i46] & 4294967295L);
                                }
                                int i47 = this.e;
                                if (i47 != Integer.MAX_VALUE) {
                                    this.e = (int) (jArr6[i47] & 4294967295L);
                                }
                            }
                            e2 = e(i12);
                        }
                    } else {
                        c2 = 31;
                        j3 = 128;
                    }
                    i2 = 0;
                    j = j6;
                    j2 = 255;
                    int b2 = bg6.b(this.f);
                    long[] jArr8 = this.a;
                    Object[] objArr4 = this.b;
                    long[] jArr9 = this.c;
                    int i48 = this.f;
                    int[] iArr = new int[i48];
                    f(b2);
                    long[] jArr10 = this.a;
                    Object[] objArr5 = this.b;
                    long[] jArr11 = this.c;
                    int i49 = this.f;
                    int i50 = 0;
                    while (i50 < i48) {
                        if (((jArr8[i50 >> 3] >> ((i50 & 7) << 3)) & 255) < j3) {
                            Object obj5 = objArr4[i50];
                            if (obj5 != null) {
                                i5 = obj5.hashCode();
                            } else {
                                i5 = 0;
                            }
                            int i51 = i5 * i20;
                            int i52 = i51 ^ (i51 << 16);
                            int e4 = e(i52 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j21 = (long) (i52 & 127);
                            int i53 = e4 >> 3;
                            int i54 = (e4 & 7) << 3;
                            long j22 = (jArr[i53] & (~(255 << i54))) | (j21 << i54);
                            jArr[i53] = j22;
                            jArr[(((e4 - 7) & i49) + (i49 & 7)) >> 3] = j22;
                            objArr5[e4] = obj5;
                            jArr11[e4] = jArr9[i50];
                            iArr[i50] = e4;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i50++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.c;
                    int length3 = jArr12.length;
                    for (int i55 = 0; i55 < length3; i55++) {
                        long j23 = jArr12[i55];
                        int i56 = (int) ((j23 >> c2) & 2147483647L);
                        int i57 = (int) (j23 & 2147483647L);
                        long j24 = j23 & -4611686018427387904L;
                        if (i56 == Integer.MAX_VALUE) {
                            i3 = Integer.MAX_VALUE;
                        } else {
                            i3 = iArr[i56];
                        }
                        long j25 = (j24 | ((long) i3)) << c2;
                        if (i57 == Integer.MAX_VALUE) {
                            i4 = Integer.MAX_VALUE;
                        } else {
                            i4 = iArr[i57];
                        }
                        jArr12[i55] = j25 | ((long) i4);
                    }
                    int i58 = this.d;
                    if (i58 != Integer.MAX_VALUE) {
                        this.d = iArr[i58];
                    }
                    int i59 = this.e;
                    if (i59 != Integer.MAX_VALUE) {
                        this.e = iArr[i59];
                    }
                    e2 = e(i12);
                }
                this.g++;
                int i60 = this.h;
                long[] jArr13 = this.a;
                int i61 = e2 >> 3;
                long j26 = jArr13[i61];
                int i62 = (e2 & 7) << 3;
                if (((j26 >> i62) & j2) == j3) {
                    i2 = 1;
                }
                this.h = i60 - i2;
                int i63 = this.f;
                long j27 = (j26 & (~(j2 << i62))) | (j << i62);
                jArr13[i61] = j27;
                jArr13[(((e2 - 7) & i63) + (i63 & 7)) >> 3] = j27;
                return e2;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i9 = i20;
        }
    }

    public final int e(int i) {
        int i2 = this.f;
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
        if (!(obj instanceof mp4)) {
            return false;
        }
        mp4 mp4 = (mp4) obj;
        if (mp4.g != this.g) {
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
                        if ((255 & j) < 128 && !mp4.c(objArr[(i << 3) + i3])) {
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
        long[] jArr2;
        if (i > 0) {
            i2 = Math.max(7, bg6.c(i));
        } else {
            i2 = 0;
        }
        this.f = i2;
        if (i2 == 0) {
            jArr = bg6.a;
        } else {
            int i3 = ((i2 + 15) & -8) >> 3;
            long[] jArr3 = new long[i3];
            Arrays.fill(jArr3, 0, i3, -9187201950435737472L);
            jArr = jArr3;
        }
        this.a = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j)) | j;
        this.h = bg6.a(this.f) - this.g;
        if (i2 == 0) {
            objArr = ie1.B;
        } else {
            objArr = new Object[i2];
        }
        this.b = objArr;
        if (i2 == 0) {
            jArr2 = gl0.t;
        } else {
            long[] jArr4 = new long[i2];
            Arrays.fill(jArr4, 0, i2, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.c = jArr2;
    }

    public final void g(Object obj) {
        int d2 = d(obj);
        this.b[d2] = obj;
        long[] jArr = this.c;
        int i = this.d;
        jArr[d2] = (((long) i) & 2147483647L) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((((long) d2) & 2147483647L) << 31) | (jArr[i] & -4611686016279904257L);
        }
        this.d = d2;
        if (this.e == Integer.MAX_VALUE) {
            this.e = d2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & -9187201950435737472L) == 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        r11 = -1;
     */
    public final boolean h(Object obj) {
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
        int i6 = this.f;
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
            i(i2);
        }
        return z;
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f * 31) + this.g;
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

    public final void i(int i) {
        this.g--;
        long[] jArr = this.a;
        int i2 = this.f;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & -2147483648L) | (((long) i6) & 2147483647L);
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((((long) i5) & 2147483647L) << 31) | (jArr2[i6] & -4611686016279904257L);
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final boolean j(Collection collection) {
        collection.getClass();
        Object[] objArr = this.b;
        int i = this.g;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!dt0.q0(collection, objArr[i5])) {
                                i(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        if (i != this.g) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Object[] objArr = this.b;
        long[] jArr = this.c;
        int i = this.e;
        int i2 = 0;
        while (true) {
            if (i == Integer.MAX_VALUE) {
                sb.append("]");
                break;
            }
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i2 == -1) {
                sb.append("...");
                break;
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
            i = i3;
        }
        return sb.toString();
    }
}
