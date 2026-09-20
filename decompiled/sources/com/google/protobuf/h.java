package com.google.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h {
    public static final h f = new h(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public h(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final int a() {
        int c2;
        int e2;
        int c3;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    c3 = vs0.c(i5) + 8;
                } else if (i6 == 2) {
                    int c4 = vs0.c(i5);
                    int size = ((yf0) this.c[i3]).size();
                    i2 = pb4.a(size, size, c4, i2);
                } else if (i6 == 3) {
                    c2 = vs0.c(i5) * 2;
                    e2 = ((h) this.c[i3]).a();
                } else if (i6 == 5) {
                    ((Integer) this.c[i3]).getClass();
                    c3 = vs0.c(i5) + 4;
                } else {
                    throw new IllegalStateException(new IOException("Protocol message tag had invalid wire type."));
                }
                i2 = c3 + i2;
            } else {
                long longValue = ((Long) this.c[i3]).longValue();
                c2 = vs0.c(i5);
                e2 = vs0.e(longValue);
            }
            i2 = e2 + c2 + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void b(wv2 wv2) {
        if (this.a != 0) {
            wv2.getClass();
            vs0 vs0 = (vs0) wv2.x;
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    vs0.q(((Long) obj).longValue(), i3);
                } else if (i4 == 1) {
                    vs0.k(((Long) obj).longValue(), i3);
                } else if (i4 == 2) {
                    vs0.o(i3, 2);
                    vs0.h((yf0) obj);
                } else if (i4 == 3) {
                    vs0.o(i3, 3);
                    ((h) obj).b(wv2);
                    vs0.o(i3, 4);
                } else if (i4 == 5) {
                    vs0.i(i3, ((Integer) obj).intValue());
                } else {
                    rf2.o(new IOException("Protocol message tag had invalid wire type."));
                    return;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            int i = this.a;
            if (i == hVar.a) {
                int[] iArr = this.b;
                int[] iArr2 = hVar.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.c;
                        Object[] objArr2 = hVar.c;
                        int i3 = this.a;
                        int i4 = 0;
                        while (i4 < i3) {
                            if (objArr[i4].equals(objArr2[i4])) {
                                i4++;
                            }
                        }
                        return true;
                    } else if (iArr[i2] != iArr2[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
