package defpackage;

import java.util.Arrays;

/* renamed from: dp4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dp4 {
    public long[] a = bg6.a;
    public long[] b = uc4.a;
    public Object[] c = ie1.B;
    public int d;
    public int e;
    public int f;

    public dp4(int i) {
        if (i >= 0) {
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
        qs.S0(0, this.d, (Object) null, this.c);
        this.f = bg6.a(this.d) - this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0066, code lost:
        if (((r6 & ((~r6) << 6)) & -9187201950435737472L) == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0068, code lost:
        r10 = -1;
     */
    public final boolean b(long j) {
        int i;
        int hashCode = Long.hashCode(j) * -862048943;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0:
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-((long) i8)) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (((long) i3) * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & -9187201950435737472L;
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.b[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public final int c(int i) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0063, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0065, code lost:
        r10 = -1;
     */
    public final Object d(long j) {
        int i;
        int hashCode = Long.hashCode(j) * -862048943;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0:
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-((long) i8)) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (((long) i3) * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & -9187201950435737472L;
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.b[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i >= 0) {
            return this.c[i];
        }
        return null;
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
        this.b = new long[i2];
        this.c = new Object[i2];
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final boolean equals(Object r18) {
        dp4 dp4 = r18;
        if (dp4 == this) {
            return true;
        }
        if (!(dp4 instanceof dp4)) {
            return false;
        }
        dp4 dp42 = dp4;
        if (dp42.e != this.e) {
            return false;
        }
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0:
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            long j2 = jArr[i4];
                            Object obj = objArr[i4];
                            if (obj == null) {
                                if (dp42.d(j2) != null || !dp42.b(j2)) {
                                    return false;
                                }
                            } else if (!obj.equals(dp42.d(j2))) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0063, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0065, code lost:
        r10 = -1;
     */
    public final Object f(long j) {
        int i;
        int hashCode = Long.hashCode(j) * -862048943;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0:
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-((long) i8)) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (((long) i3) * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & -9187201950435737472L;
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.b[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i < 0) {
            return null;
        }
        this.e--;
        long[] jArr2 = this.a;
        int i9 = this.d;
        int i10 = i >> 3;
        int i11 = (i & 7) << 3;
        long j5 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
        jArr2[i10] = j5;
        jArr2[(((i - 7) & i9) + (i9 & 7)) >> 3] = j5;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0081, code lost:
        if (r0.f != 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0095, code lost:
        if (((r0.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0097, code lost:
        r27 = 255;
        r31 = r10;
        r29 = 0;
        r18 = 1;
        r20 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a5, code lost:
        r1 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a7, code lost:
        if (r1 <= 8) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a9, code lost:
        r20 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c1, code lost:
        if (java.lang.Long.compare((((long) r0.e) * 32) ^ Long.MIN_VALUE, (((long) r1) * 25) ^ Long.MIN_VALUE) > 0) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c3, code lost:
        r1 = r0.a;
        r2 = r0.d;
        r4 = r0.b;
        r5 = r0.c;
        r6 = (r2 + 7) >> 3;
        r27 = 255;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d4, code lost:
        if (r7 >= r6) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d6, code lost:
        r9 = r1[r7] & -9187201950435737472L;
        r1[r7] = -72340172838076674L & ((~r9) + (r9 >>> 7));
        r7 = r7 + 1;
        r13 = r13;
        r12 = r12;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00f3, code lost:
        r31 = r10;
        r29 = r12;
        r11 = r13;
        r8 = 7;
        r6 = defpackage.qs.Z0(r1);
        r7 = r6 - 1;
        r12 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | -72057594037927936L;
        r1[r6] = r1[r29];
        r6 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0112, code lost:
        if (r6 == r2) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0114, code lost:
        r7 = r6 >> 3;
        r14 = (r6 & 7) << 3;
        r9 = (r1[r7] >> r14) & 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0121, code lost:
        if (r9 != 128) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0123, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0128, code lost:
        if (r9 == 254) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x012b, code lost:
        r9 = java.lang.Long.hashCode(r4[r6]) * r19;
        r9 = r9 ^ (r9 << 16);
        r10 = r9 >>> 7;
        r15 = c(r10);
        r10 = r10 & r2;
        r30 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x014a, code lost:
        if ((((r15 - r10) & r2) / 8) != (((r6 - r10) & r2) / 8)) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x014c, code lost:
        r10 = r11;
        r35 = r12;
        r1[r7] = (((long) (r9 & 127)) << r14) | (r1[r7] & (~(255 << r14)));
        r1[r1.length - r10] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r11 = r10;
        r8 = r30;
        r12 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x016f, code lost:
        r10 = r11;
        r35 = r12;
        r8 = r15 >> 3;
        r11 = r1[r8];
        r13 = (r15 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0180, code lost:
        if (((r11 >> r13) & 255) != 128) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0182, code lost:
        r18 = r10;
        r12 = r4;
        r37 = r5;
        r1[r8] = (r11 & (~(255 << r13))) | (((long) (r9 & 127)) << r13);
        r1[r7] = (r1[r7] & (~(255 << r14))) | (128 << r14);
        r12[r15] = r12[r6];
        r12[r6] = 0;
        r37[r15] = r37[r6];
        r37[r6] = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01af, code lost:
        r37 = r5;
        r18 = r10;
        r12 = r4;
        r1[r8] = (((long) (r9 & 127)) << r13) | (r11 & (~(255 << r13)));
        r4 = r12[r15];
        r12[r15] = r12[r6];
        r12[r6] = r4;
        r4 = r37[r15];
        r37[r15] = r37[r6];
        r37[r6] = r4;
        r6 = r6 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01d4, code lost:
        r1[r1.length - 1] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r4 = r12;
        r11 = r18;
        r8 = r30;
        r12 = r35;
        r5 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01ec, code lost:
        r30 = r8;
        r18 = r11;
        r0.f = defpackage.bg6.a(r0.d) - r0.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01fd, code lost:
        r27 = 255;
        r31 = r10;
        r29 = 0;
        r18 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0208, code lost:
        r20 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x020b, code lost:
        r1 = defpackage.bg6.b(r0.d);
        r2 = r0.a;
        r4 = r0.b;
        r5 = r0.c;
        r6 = r0.d;
        e(r1);
        r1 = r0.a;
        r7 = r0.b;
        r8 = r0.c;
        r9 = r0.d;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0226, code lost:
        if (r10 >= r6) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0235, code lost:
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r20) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0237, code lost:
        r11 = r4[r10];
        r13 = java.lang.Long.hashCode(r11) * r19;
        r13 = r13 ^ (r13 << 16);
        r14 = c(r13 >>> 7);
        r16 = r1;
        r15 = r2;
        r1 = (long) (r13 & 127);
        r13 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r1 = (r16[r13] & (~(255 << r17))) | (r1 << r17);
        r16[r13] = r1;
        r16[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0275, code lost:
        r16 = r1;
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0278, code lost:
        r10 = r10 + 1;
        r2 = r15;
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x027e, code lost:
        r1 = c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0282, code lost:
        r16 = r1;
        r0.e++;
        r1 = r0.f;
        r2 = r0.a;
        r3 = r16 >> 3;
        r4 = r2[r3];
        r6 = (r16 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x029c, code lost:
        if (((r4 >> r6) & r27) != r20) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x029e, code lost:
        r29 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x02a0, code lost:
        r0.f = r1 - r29;
        r1 = r0.d;
        r4 = (r4 & (~(r27 << r6))) | (r31 << r6);
        r2[r3] = r4;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x006c, code lost:
        r19 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0077, code lost:
        if (((((~r8) << 6) & r8) & -9187201950435737472L) == 0) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0079, code lost:
        r1 = c(r3);
     */
    public final void g(long j, Object obj) {
        int i;
        int i2;
        int i3 = -862048943;
        int hashCode = Long.hashCode(j) * -862048943;
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.d;
        int i8 = i5 & i7;
        int i9 = 0;
        loop0:
        while (true) {
            long[] jArr = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            long j2 = ((jArr[i10 + 1] << (64 - i11)) & ((-((long) i11)) >> 63)) | (jArr[i10] >>> i11);
            long j3 = (long) i6;
            int i13 = i9;
            int i14 = 0;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            long j5 = (~j4) & (j4 - 72340172838076673L) & -9187201950435737472L;
            while (true) {
                if (j5 == 0) {
                    break;
                }
                i2 = (i8 + (Long.numberOfTrailingZeros(j5) >> 3)) & i7;
                int i15 = i3;
                if (this.b[i2] == j) {
                    break loop0;
                }
                j5 &= j5 - 1;
                i3 = i15;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i;
        }
        this.b[i2] = j;
        this.c[i2] = obj;
    }

    public final int hashCode() {
        int i;
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr2[i2];
            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        long j2 = jArr[i6];
                        Object obj = objArr[i6];
                        int hashCode = Long.hashCode(j2);
                        if (obj != null) {
                            i = obj.hashCode();
                        } else {
                            i = 0;
                        }
                        i3 += i ^ hashCode;
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
        int i;
        int i2;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
