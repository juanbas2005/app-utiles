package defpackage;

import java.util.Arrays;

/* renamed from: zo4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zo4 {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public zo4(int i) {
        boolean z;
        this.a = bg6.a;
        this.b = ve3.a;
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

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0081, code lost:
        r3 = d(r5);
        r12 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0089, code lost:
        if (r0.e != 0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009d, code lost:
        if (((r0.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009f, code lost:
        r27 = 255;
        r31 = true;
        r20 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a9, code lost:
        r3 = r0.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ab, code lost:
        if (r3 <= 8) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ad, code lost:
        r20 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c5, code lost:
        if (java.lang.Long.compare((((long) r0.d) * 32) ^ Long.MIN_VALUE, (((long) r3) * 25) ^ Long.MIN_VALUE) > 0) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c7, code lost:
        r3 = r0.a;
        r4 = r0.c;
        r6 = r0.b;
        r7 = (r4 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d3, code lost:
        if (r14 >= r7) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d5, code lost:
        r29 = r8;
        r8 = r3[r14] & -9187201950435737472L;
        r3[r14] = -72340172838076674L & ((~r8) + (r8 >>> 7));
        r14 = r14 + 1;
        r12 = r12;
        r8 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f2, code lost:
        r29 = r8;
        r27 = r12;
        r7 = defpackage.qs.Z0(r3);
        r8 = r7 - 1;
        r3[r8] = (r3[r8] & 72057594037927935L) | -72057594037927936L;
        r3[r7] = r3[0];
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0113, code lost:
        if (r7 == r4) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0115, code lost:
        r8 = r7 >> 3;
        r9 = (r7 & 7) << 3;
        r12 = (r3[r8] >> r9) & r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0122, code lost:
        if (r12 != 128) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0124, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0129, code lost:
        if (r12 == 254) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x012c, code lost:
        r12 = java.lang.Integer.hashCode(r6[r7]) * r22;
        r12 = r12 ^ (r12 << 16);
        r13 = r12 >>> 7;
        r14 = d(r13);
        r13 = r13 & r4;
        r31 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x014b, code lost:
        if ((((r14 - r13) & r4) / 8) != (((r7 - r13) & r4) / 8)) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x014d, code lost:
        r30 = r6;
        r3[r8] = ((~(r27 << r9)) & r3[r8]) | (((long) (r12 & 127)) << r9);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x016b, code lost:
        r6 = r30;
        r15 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0170, code lost:
        r30 = r6;
        r32 = r7;
        r6 = r14 >> 3;
        r33 = r3[r6];
        r7 = (r14 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0182, code lost:
        if (((r33 >> r7) & r27) != 128) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0184, code lost:
        r35 = r7;
        r3[r6] = (r33 & (~(r27 << r35))) | (((long) (r12 & 127)) << r35);
        r3[r8] = (r3[r8] & (~(r27 << r9))) | (128 << r9);
        r30[r14] = r30[r32];
        r30[r32] = 0;
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01a8, code lost:
        r35 = r7;
        r3[r6] = (((long) (r12 & 127)) << r35) | (r33 & (~(r27 << r35)));
        r6 = r30[r14];
        r30[r14] = r30[r32];
        r30[r32] = r6;
        r7 = r32 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01c2, code lost:
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01d0, code lost:
        r31 = r15;
        r0.e = defpackage.bg6.a(r0.c) - r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01df, code lost:
        r27 = 255;
        r31 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01e6, code lost:
        r20 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01e9, code lost:
        r3 = defpackage.bg6.b(r0.c);
        r4 = r0.a;
        r6 = r0.b;
        r7 = r0.c;
        e(r3);
        r3 = r0.a;
        r8 = r0.b;
        r9 = r0.c;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0200, code lost:
        if (r12 >= r7) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x020f, code lost:
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r20) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0211, code lost:
        r13 = r6[r12];
        r14 = java.lang.Integer.hashCode(r13) * r22;
        r14 = r14 ^ (r14 << 16);
        r15 = d(r14 >>> 7);
        r19 = r3;
        r18 = r4;
        r3 = (long) (r14 & 127);
        r14 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r3 = (r19[r14] & (~(255 << r23))) | (r3 << r23);
        r19[r14] = r3;
        r19[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r15] = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x024c, code lost:
        r19 = r3;
        r18 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0250, code lost:
        r12 = r12 + 1;
        r4 = r18;
        r3 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0257, code lost:
        r3 = d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x025b, code lost:
        r14 = r3;
        r0.d++;
        r3 = r0.e;
        r4 = r0.a;
        r5 = r14 >> 3;
        r6 = r4[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0274, code lost:
        if (((r6 >> r8) & r27) != r20) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0276, code lost:
        r9 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0279, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x027b, code lost:
        r0.e = r3 - (r9 ? 1 : 0);
        r3 = r0.c;
        r6 = (r6 & (~(r27 << r8))) | (r10 << r8);
        r4[r5] = r6;
        r4[(((r14 - 7) & r3) + (r3 & 7)) >> 3] = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0073, code lost:
        r22 = r4;
        r4 = (((r8 & ((~r8) << 6)) & -9187201950435737472L) > 0 ? 1 : (((r8 & ((~r8) << 6)) & -9187201950435737472L) == 0 ? 0 : -1));
        r8 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007f, code lost:
        if (r4 == 0) goto L_0x029d;
     */
    public final boolean a(int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = i;
        int i5 = this.d;
        int i6 = -862048943;
        int hashCode = Integer.hashCode(i4) * -862048943;
        int i7 = hashCode ^ (hashCode << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.c;
        int i11 = i8 & i10;
        int i12 = 0;
        loop0:
        while (true) {
            long[] jArr = this.a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            boolean z2 = true;
            int i15 = i12;
            long j = (((-((long) i14)) >> 63) & (jArr[i13 + 1] << (64 - i14))) | (jArr[i13] >>> i14);
            long j2 = (long) i9;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = (j3 - 72340172838076673L) & (~j3) & -9187201950435737472L;
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j4) >> 3) + i11) & i10;
                int i16 = i6;
                if (this.b[i3] == i4) {
                    z = true;
                    break loop0;
                }
                j4 &= j4 - 1;
                i6 = i16;
            }
            i12 = i15 + 8;
            i11 = (i11 + i12) & i10;
            i6 = i2;
        }
        this.b[i3] = i4;
        if (this.d != i5) {
            return z;
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
        this.e = bg6.a(this.c) - this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0067, code lost:
        if (((r6 & ((~r6) << 6)) & -9187201950435737472L) == 0) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0069, code lost:
        r10 = -1;
     */
    public final boolean c(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * -862048943;
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.c;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0:
        while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-((long) i9)) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (((long) i4) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & -9187201950435737472L;
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public final int d(int i) {
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

    public final void e(int i) {
        int i2;
        long[] jArr;
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
        this.b = new int[i2];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zo4)) {
            return false;
        }
        zo4 zo4 = (zo4) obj;
        if (zo4.d != this.d) {
            return false;
        }
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !zo4.c(iArr[(i << 3) + i3])) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0067, code lost:
        if (((r6 & ((~r6) << 6)) & -9187201950435737472L) == 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0069, code lost:
        r10 = -1;
     */
    public final boolean f(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * -862048943;
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.c;
        int i6 = (i3 >>> 7) & i5;
        boolean z = false;
        int i7 = 0;
        loop0:
        while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-((long) i9)) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (((long) i4) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & -9187201950435737472L;
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (i2 >= 0) {
            z = true;
        }
        if (z) {
            g(i2);
        }
        return z;
    }

    public final void g(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        i2 = Integer.hashCode(iArr[(i << 3) + i4]) + i2;
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int[] iArr = this.b;
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
                            int i5 = iArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append("...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(", ");
                            }
                            sb.append(i5);
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

    public /* synthetic */ zo4() {
        this(6);
    }
}
