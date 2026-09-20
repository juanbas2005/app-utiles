package defpackage;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* renamed from: gp4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gp4 {
    public long[] a = bg6.a;
    public Object[] b = ie1.B;
    public float[] c = ph2.a;
    public int d;
    public int e;
    public int f;

    public gp4(int i) {
        if (i >= 0) {
            d(bg6.d(i));
        } else {
            h.q("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i) {
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

    public final int b(Object obj) {
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

    public final float c(Object obj) {
        int b2 = b(obj);
        if (b2 >= 0) {
            return this.c[b2];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final void d(int i) {
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
        this.c = new float[i2];
    }

    public final void e(int i) {
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

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final boolean equals(Object r18) {
        gp4 gp4 = r18;
        if (gp4 == this) {
            return true;
        }
        if (!(gp4 instanceof gp4)) {
            return false;
        }
        gp4 gp42 = gp4;
        if (gp42.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        float[] fArr = this.c;
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
                            float f2 = fArr[i4];
                            int b2 = gp42.b(obj);
                            if (b2 < 0 || f2 != gp42.c[b2]) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0078, code lost:
        r20 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0083, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0085, code lost:
        r2 = a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008d, code lost:
        if (r0.f != 0) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a1, code lost:
        if (((r0.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a3, code lost:
        r25 = 255;
        r29 = r11;
        r18 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ad, code lost:
        r2 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00af, code lost:
        if (r2 <= 8) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b1, code lost:
        r18 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00cb, code lost:
        if (java.lang.Long.compare((((long) r0.e) * 32) ^ Long.MIN_VALUE, (((long) r2) * 25) ^ Long.MIN_VALUE) > 0) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cd, code lost:
        r2 = r0.a;
        r3 = r0.d;
        r4 = r0.b;
        r6 = r0.c;
        r7 = (r3 + 7) >> 3;
        r25 = 255;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00dc, code lost:
        if (r8 >= r7) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00de, code lost:
        r10 = r2[r8] & r13;
        r2[r8] = -72340172838076674L & ((~r10) + (r10 >>> 7));
        r8 = r8 + 1;
        r11 = r11;
        r13 = -9187201950435737472L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00fa, code lost:
        r29 = r11;
        r9 = 7;
        r7 = defpackage.qs.Z0(r2);
        r8 = r7 - 1;
        r12 = 72057594037927935L;
        r2[r8] = (r2[r8] & 72057594037927935L) | -72057594037927936L;
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0116, code lost:
        if (r7 == r3) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0118, code lost:
        r8 = r7 >> 3;
        r14 = (r7 & 7) << 3;
        r10 = (r2[r8] >> r14) & 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0125, code lost:
        if (r10 != 128) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0127, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x012c, code lost:
        if (r10 == 254) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x012f, code lost:
        r10 = r4[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0131, code lost:
        if (r10 == null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0133, code lost:
        r10 = r10.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0138, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0139, code lost:
        r10 = r10 * r20;
        r10 = r10 ^ (r10 << 16);
        r11 = r10 >>> 7;
        r27 = a(r11);
        r11 = r11 & r3;
        r31 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0152, code lost:
        if ((((r27 - r11) & r3) / 8) != (((r7 - r11) & r3) / 8)) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0154, code lost:
        r32 = r12;
        r2[r8] = (((long) (r10 & 127)) << r14) | (r2[r8] & (~(255 << r14)));
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r9 = r31;
        r12 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0176, code lost:
        r32 = r12;
        r9 = r27 >> 3;
        r11 = r2[r9];
        r13 = (r27 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0186, code lost:
        if (((r11 >> r13) & 255) != 128) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0188, code lost:
        r28 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | (((long) (r10 & 127)) << r13);
        r2[r8] = (r2[r8] & (~(255 << r14))) | (128 << r14);
        r34[r27] = r34[r7];
        r34[r7] = null;
        r6[r27] = r6[r7];
        r6[r7] = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01b4, code lost:
        r28 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | (((long) (r10 & 127)) << r13);
        r3 = r34[r27];
        r34[r27] = r34[r7];
        r34[r7] = r3;
        r3 = r6[r27];
        r6[r27] = r6[r7];
        r6[r7] = r3;
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01d8, code lost:
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r3 = r28;
        r9 = r31;
        r12 = r32;
        r4 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01ef, code lost:
        r31 = r9;
        r0.f = defpackage.bg6.a(r0.d) - r0.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01fe, code lost:
        r25 = 255;
        r29 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0205, code lost:
        r18 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0208, code lost:
        r2 = defpackage.bg6.b(r0.d);
        r3 = r0.a;
        r4 = r0.b;
        r6 = r0.c;
        r7 = r0.d;
        d(r2);
        r2 = r0.a;
        r8 = r0.b;
        r9 = r0.c;
        r10 = r0.d;
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0222, code lost:
        if (r11 >= r7) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0231, code lost:
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r18) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0233, code lost:
        r12 = r4[r11];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0235, code lost:
        if (r12 == null) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0237, code lost:
        r13 = r12.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x023c, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x023d, code lost:
        r13 = r13 * r20;
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
        r17 = r2;
        r1 = (long) (r13 & 127);
        r13 = r14 >> 3;
        r21 = (r14 & 7) << 3;
        r1 = (r17[r13] & (~(255 << r21))) | (r1 << r21);
        r17[r13] = r1;
        r17[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0274, code lost:
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0276, code lost:
        r11 = r11 + 1;
        r1 = r38;
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x027d, code lost:
        r2 = a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0281, code lost:
        r0.e++;
        r1 = r0.f;
        r3 = r0.a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0299, code lost:
        if (((r5 >> r7) & r25) != r18) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x029b, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x029d, code lost:
        r0.f = r1 - r15;
        r1 = r0.d;
        r5 = (r5 & (~(r25 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    public final void f(Object obj, float f2) {
        int i;
        int i2;
        int i3;
        Object obj2 = obj;
        if (obj2 != null) {
            i = obj2.hashCode();
        } else {
            i = 0;
        }
        int i4 = -862048943;
        int i5 = i * -862048943;
        int i6 = i5 ^ (i5 << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.d;
        int i10 = i7 & i9;
        int i11 = 0;
        loop0:
        while (true) {
            long[] jArr = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j = ((jArr[i12 + 1] << (64 - i13)) & ((-((long) i13)) >> 63)) | (jArr[i12] >>> i13);
            long j2 = (long) i8;
            int i14 = i8;
            int i15 = 0;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = -9187201950435737472L;
            long j5 = (~j3) & (j3 - 72340172838076673L) & -9187201950435737472L;
            while (true) {
                if (j5 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j5) >> 3)) & i9;
                int i16 = i4;
                if (sg3.e(this.b[numberOfTrailingZeros], obj2)) {
                    i3 = numberOfTrailingZeros;
                    break loop0;
                } else {
                    j5 &= j5 - 1;
                    i4 = i16;
                }
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
            obj2 = obj;
            i8 = i14;
            i4 = i2;
        }
        if (i3 < 0) {
            i3 = ~i3;
        }
        this.b[i3] = obj;
        this.c[i3] = f2;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.b;
        float[] fArr = this.c;
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
                        float f2 = fArr[i6];
                        if (obj != null) {
                            i = obj.hashCode();
                        } else {
                            i = 0;
                        }
                        i3 += Float.hashCode(f2) ^ i;
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
        float[] fArr = this.c;
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
                            float f2 = fArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f2);
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
}
