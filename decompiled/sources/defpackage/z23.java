package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: z23  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z23 {
    public final sc0 a;
    public int b = Integer.MAX_VALUE;
    public boolean c;
    public int d = 4096;
    public vy2[] e = new vy2[8];
    public int f = 7;
    public int g;
    public int h;

    public z23(sc0 sc0) {
        this.a = sc0;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    vy2[] vy2Arr = this.e;
                    int i4 = i2 + 1;
                    System.arraycopy(vy2Arr, i4, vy2Arr, i4 + i3, this.g);
                    vy2[] vy2Arr2 = this.e;
                    int i5 = this.f + 1;
                    Arrays.fill(vy2Arr2, i5, i5 + i3, (Object) null);
                    this.f += i3;
                } else {
                    vy2 vy2 = this.e[length];
                    vy2.getClass();
                    i -= vy2.c;
                    int i6 = this.h;
                    vy2 vy22 = this.e[length];
                    vy22.getClass();
                    this.h = i6 - vy22.c;
                    this.g--;
                    i3++;
                    length--;
                }
            }
            vy2[] vy2Arr3 = this.e;
            int i42 = i2 + 1;
            System.arraycopy(vy2Arr3, i42, vy2Arr3, i42 + i3, this.g);
            vy2[] vy2Arr22 = this.e;
            int i52 = this.f + 1;
            Arrays.fill(vy2Arr22, i52, i52 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(vy2 vy2) {
        int i = vy2.c;
        int i2 = this.d;
        if (i > i2) {
            vy2[] vy2Arr = this.e;
            qs.S0(0, vy2Arr.length, (Object) null, vy2Arr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        vy2[] vy2Arr2 = this.e;
        if (i3 > vy2Arr2.length) {
            vy2[] vy2Arr3 = new vy2[(vy2Arr2.length * 2)];
            System.arraycopy(vy2Arr2, 0, vy2Arr3, vy2Arr2.length, vy2Arr2.length);
            this.f = this.e.length - 1;
            this.e = vy2Arr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = vy2;
        this.g++;
        this.h += i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: byte} */
    /* JADX WARNING: type inference failed for: r0v5, types: [sc0, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void c(dg0 dg0) {
        dg0.getClass();
        int[] iArr = h73.a;
        int d2 = dg0.d();
        long j = 0;
        int i = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < d2; i2++) {
            byte i3 = dg0.i(i2);
            byte[] bArr = dg8.a;
            j2 += (long) h73.b[i3 & 255];
        }
        int i4 = (int) ((j2 + 7) >> 3);
        int d3 = dg0.d();
        sc0 sc0 = this.a;
        if (i4 < d3) {
            ? obj = new Object();
            int[] iArr2 = h73.a;
            int d4 = dg0.d();
            int i5 = 0;
            while (i < d4) {
                byte i6 = dg0.i(i);
                byte[] bArr2 = dg8.a;
                byte b2 = i6 & 255;
                int i7 = h73.a[b2];
                byte b3 = h73.b[b2];
                j = (j << b3) | ((long) i7);
                int i8 = i5 + b3;
                while (i8 >= 8) {
                    long j3 = i8 - 8;
                    obj.a0((int) (j >> j3));
                    i8 = j3;
                }
                i++;
                i5 = i8;
            }
            if (i5 > 0) {
                obj.a0((int) ((j << (8 - i5)) | (255 >>> i5)));
            }
            dg0 q = obj.q(obj.x);
            e(q.d(), 127, 128);
            sc0.X(q);
            return;
        }
        e(dg0.d(), 127, 0);
        sc0.X(dg0);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.c) {
            int i3 = this.b;
            if (i3 < this.d) {
                e(i3, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            vy2 vy2 = (vy2) arrayList.get(i4);
            dg0 q = vy2.a.q();
            dg0 dg0 = vy2.b;
            Integer num = (Integer) a33.b.get(q);
            if (num != null) {
                int intValue = num.intValue();
                i = intValue + 1;
                if (2 <= i && i < 8) {
                    vy2[] vy2Arr = a33.a;
                    if (sg3.e(vy2Arr[intValue].b, dg0)) {
                        i2 = i;
                    } else if (sg3.e(vy2Arr[i].b, dg0)) {
                        int i5 = i;
                        i = intValue + 2;
                        i2 = i5;
                    }
                }
                i2 = i;
                i = -1;
            } else {
                i2 = -1;
                i = -1;
            }
            if (i == -1) {
                int i6 = this.f + 1;
                int length = this.e.length;
                while (true) {
                    if (i6 >= length) {
                        break;
                    }
                    vy2 vy22 = this.e[i6];
                    vy22.getClass();
                    if (sg3.e(vy22.a, q)) {
                        vy2 vy23 = this.e[i6];
                        vy23.getClass();
                        if (sg3.e(vy23.b, dg0)) {
                            i = a33.a.length + (i6 - this.f);
                            break;
                        } else if (i2 == -1) {
                            i2 = (i6 - this.f) + a33.a.length;
                        }
                    }
                    i6++;
                }
            }
            if (i != -1) {
                e(i, 127, 128);
            } else if (i2 == -1) {
                this.a.a0(64);
                c(q);
                c(dg0);
                b(vy2);
            } else {
                dg0 dg02 = vy2.d;
                q.getClass();
                dg02.getClass();
                if (!q.m(0, dg02, dg02.d()) || sg3.e(vy2.i, q)) {
                    e(i2, 63, 64);
                    c(dg0);
                    b(vy2);
                } else {
                    e(i2, 15, 0);
                    c(dg0);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        sc0 sc0 = this.a;
        if (i < i2) {
            sc0.a0(i | i3);
            return;
        }
        sc0.a0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            sc0.a0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        sc0.a0(i4);
    }
}
