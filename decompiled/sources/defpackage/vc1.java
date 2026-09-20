package defpackage;

import java.util.Arrays;

/* renamed from: vc1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vc1 {
    public final int[] a = new int[10];
    public final int[] b = new int[10];
    public final int[] c = new int[10];
    public final int[] d = new int[10];
    public final int[] e = new int[10];
    public final int[] f = new int[10];
    public final int[] g = new int[10];
    public final int[] h = new int[10];
    public final int[] i = new int[10];
    public final long[] j = new long[20];
    public final int[] k = new int[20];
    public final int[] l = new int[10];
    public final int[] m = new int[10];
    public final int[] n = new int[10];
    public final int[] o = new int[10];
    public final int[] p = new int[10];

    public static void b(int i2, int[] iArr, int[] iArr2) {
        int i3 = -i2;
        for (int i4 = 0; i4 < 10; i4++) {
            int i5 = iArr[i4];
            int i6 = (iArr2[i4] ^ i5) & i3;
            iArr[i4] = i5 ^ i6;
            iArr2[i4] = iArr2[i4] ^ i6;
        }
    }

    public static void i(int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            i2 = (iArr2[i3] - iArr3[i3]) - ((i2 >> 26) & 1);
            iArr[i3] = i2 & 67108863;
        }
        int i4 = iArr[0] - ((-((i2 >> 26) & 1)) & 19);
        iArr[0] = i4 & 67108863;
        for (int i5 = 1; i5 < 10; i5++) {
            i4 = iArr[i5] - ((i4 >> 26) & 1);
            iArr[i5] = i4 & 67108863;
        }
        iArr[9] = iArr[9] & 2097151;
    }

    public final void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = iArr2[0] + iArr3[0];
        iArr[0] = i2 & 67108863;
        for (int i3 = 1; i3 < 10; i3++) {
            i2 = (i2 >> 26) + iArr2[i3] + iArr3[i3];
            iArr[i3] = i2 & 67108863;
        }
        h(iArr);
    }

    public final void c() {
        Arrays.fill(this.l, 0);
        Arrays.fill(this.m, 0);
        Arrays.fill(this.n, 0);
        Arrays.fill(this.o, 0);
        Arrays.fill(this.p, 0);
        Arrays.fill(this.a, 0);
        Arrays.fill(this.c, 0);
        Arrays.fill(this.e, 0);
        Arrays.fill(this.g, 0);
        Arrays.fill(this.i, 0);
        Arrays.fill(this.b, 0);
        Arrays.fill(this.d, 0);
        Arrays.fill(this.h, 0);
        Arrays.fill(this.f, 0);
        Arrays.fill(this.j, 0);
        Arrays.fill(this.k, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void d(byte[] bArr) {
        int[] iArr;
        byte b2;
        byte b3;
        int i2 = 31;
        byte b4 = bArr[31] | 64;
        byte b5 = 6;
        int i3 = 0;
        while (true) {
            int i4 = (b4 >> b5) & 1;
            int i5 = i3 ^ i4;
            int[] iArr2 = this.m;
            int[] iArr3 = this.n;
            b(i5, iArr2, iArr3);
            int[] iArr4 = this.o;
            int[] iArr5 = this.p;
            b(i5, iArr4, iArr5);
            int[] iArr6 = this.a;
            a(iArr6, iArr2, iArr4);
            int[] iArr7 = this.b;
            e(iArr7, iArr6, iArr6);
            int[] iArr8 = this.c;
            i(iArr8, iArr2, iArr4);
            int[] iArr9 = this.d;
            e(iArr9, iArr8, iArr8);
            int[] iArr10 = this.i;
            i(iArr10, iArr7, iArr9);
            int[] iArr11 = this.e;
            a(iArr11, iArr3, iArr5);
            int[] iArr12 = this.g;
            i(iArr12, iArr3, iArr5);
            byte b6 = b4;
            int[] iArr13 = this.h;
            e(iArr13, iArr12, iArr6);
            int[] iArr14 = this.f;
            e(iArr14, iArr11, iArr8);
            a(iArr3, iArr13, iArr14);
            e(iArr3, iArr3, iArr3);
            i(iArr5, iArr13, iArr14);
            e(iArr5, iArr5, iArr5);
            e(iArr5, iArr5, this.l);
            e(iArr2, iArr7, iArr9);
            long j2 = 0;
            int i6 = 0;
            while (true) {
                iArr = this.k;
                if (i6 >= 10) {
                    break;
                }
                long j3 = (((long) iArr10[i6]) * 121665) + j2;
                iArr[i6] = ((int) j3) & 67108863;
                j2 = j3 >> 26;
                i6++;
                iArr2 = iArr2;
            }
            int[] iArr15 = iArr2;
            iArr[10] = ((int) j2) & 67108863;
            g(1, iArr4, iArr);
            a(iArr4, iArr4, iArr7);
            e(iArr4, iArr4, iArr10);
            if (b5 > 0) {
                b4 = b6;
                b2 = b5 - 1;
            } else if (i2 == 0) {
                b(i4, iArr15, iArr3);
                b(i4, iArr4, iArr5);
                return;
            } else {
                if (i2 == 1) {
                    i2--;
                    b3 = bArr[i2] & 248;
                } else {
                    i2--;
                    b3 = bArr[i2];
                }
                byte b7 = b3;
                b2 = 7;
                b4 = b7;
            }
            i3 = i4;
            b5 = b2;
        }
    }

    public final void e(int[] iArr, int[] iArr2, int[] iArr3) {
        long[] jArr;
        long j2 = (long) iArr2[0];
        int i2 = 0;
        while (true) {
            jArr = this.j;
            if (i2 >= 10) {
                break;
            }
            jArr[i2] = ((long) iArr3[i2]) * j2;
            i2++;
        }
        for (int i3 = 1; i3 < 10; i3++) {
            long j3 = (long) iArr2[i3];
            for (int i4 = 0; i4 < 9; i4++) {
                int i5 = i3 + i4;
                jArr[i5] = (((long) iArr3[i4]) * j3) + jArr[i5];
            }
            jArr[i3 + 9] = j3 * ((long) iArr3[9]);
        }
        long j4 = jArr[0];
        int[] iArr4 = this.k;
        iArr4[0] = ((int) j4) & 67108863;
        for (int i6 = 1; i6 < 20; i6++) {
            j4 = (j4 >> 26) + jArr[i6];
            iArr4[i6] = ((int) j4) & 67108863;
        }
        g(10, iArr, iArr4);
    }

    public final void f(int[] iArr, int[] iArr2) {
        int[] iArr3 = this.a;
        e(iArr3, iArr2, iArr2);
        for (int i2 = 0; i2 < 9; i2++) {
            e(iArr3, iArr3, iArr3);
        }
        e(iArr, iArr3, iArr2);
        for (int i3 = 0; i3 < 23; i3++) {
            for (int i4 = 0; i4 < 10; i4++) {
                e(iArr3, iArr3, iArr3);
            }
            e(iArr, iArr, iArr3);
        }
        e(iArr3, iArr, iArr);
        e(iArr, iArr, iArr3);
        for (int i5 = 0; i5 < 8; i5++) {
            e(iArr3, iArr3, iArr3);
            e(iArr, iArr, iArr3);
        }
        e(iArr, iArr, iArr);
        e(iArr, iArr, iArr);
        e(iArr, iArr, iArr2);
        e(iArr, iArr, iArr);
        e(iArr, iArr, iArr);
        e(iArr, iArr, iArr2);
        e(iArr, iArr, iArr);
        e(iArr, iArr, iArr2);
    }

    public final void g(int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr2[9];
        int i4 = i3 >> 21;
        iArr2[9] = i3 & 2097151;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = i4 + (iArr2[i6 + 10] << 5);
            int i8 = ((i7 & 67108863) * 19) + iArr2[i6] + i5;
            iArr2[i6] = i8 & 67108863;
            i4 = i7 >> 26;
            i5 = i8 >> 26;
        }
        if (i2 < 10) {
            while (i2 < 10) {
                int i9 = i5 + iArr2[i2];
                iArr2[i2] = i9 & 67108863;
                i5 = i9 >> 26;
                i2++;
            }
        }
        int i10 = iArr2[9];
        int i11 = (i10 >> 21) * 19;
        iArr2[9] = i10 & 2097151;
        for (int i12 = 0; i12 < 10; i12++) {
            int i13 = i11 + iArr2[i12];
            iArr[i12] = i13 & 67108863;
            i11 = i13 >> 26;
        }
        h(iArr);
    }

    public final void h(int[] iArr) {
        int[] iArr2;
        int i2 = 19;
        int i3 = 0;
        while (true) {
            iArr2 = this.k;
            if (i3 >= 10) {
                break;
            }
            int i4 = i2 + iArr[i3];
            iArr2[i3] = 67108863 & i4;
            i2 = i4 >> 26;
            i3++;
        }
        int i5 = iArr2[9];
        int i6 = -((i5 >> 21) & 1);
        int i7 = ~i6;
        iArr2[9] = i5 & 2097151;
        for (int i8 = 0; i8 < 10; i8++) {
            iArr[i8] = (iArr[i8] & i7) | (iArr2[i8] & i6);
        }
    }
}
