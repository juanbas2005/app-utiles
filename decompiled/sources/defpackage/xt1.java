package defpackage;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* renamed from: xt1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xt1 {
    public static final int[] g = {3808, 476, 2107, 1799};
    public final k90 a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public xt1(k90 k90) {
        this.a = k90;
    }

    public static r66[] b(r66[] r66Arr, int i, int i2) {
        float f2 = ((float) i2) / (((float) i) * 2.0f);
        r66 r66 = r66Arr[0];
        float f3 = r66.a;
        r66 r662 = r66Arr[2];
        float f4 = r662.a;
        float f5 = f3 - f4;
        float f6 = r66.b;
        float f7 = r662.b;
        float f8 = f6 - f7;
        float f9 = (f3 + f4) / 2.0f;
        float f10 = (f6 + f7) / 2.0f;
        float f11 = f5 * f2;
        float f12 = f8 * f2;
        r66 r663 = new r66(f9 + f11, f10 + f12);
        r66 r664 = new r66(f9 - f11, f10 - f12);
        r66 r665 = r66Arr[1];
        float f13 = r665.a;
        r66 r666 = r66Arr[3];
        float f14 = r666.a;
        float f15 = f13 - f14;
        float f16 = r665.b;
        float f17 = r666.b;
        float f18 = f16 - f17;
        float f19 = (f13 + f14) / 2.0f;
        float f20 = (f16 + f17) / 2.0f;
        float f21 = f15 * f2;
        float f22 = f2 * f18;
        return new r66[]{r663, new r66(f19 + f21, f20 + f22), r664, new r66(f19 - f21, f20 - f22)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final d30 a(boolean z) {
        r66 r66;
        r66 r662;
        r66 r663;
        r66 r664;
        r66 r665;
        r66 r666;
        r66 r667;
        r66 r668;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        long j;
        int i9;
        dv5 dv5;
        k90 k90 = this.a;
        int i10 = -1;
        int i11 = 1;
        int i12 = 0;
        try {
            r66[] b2 = new u88(k90).b();
            r663 = b2[0];
            r662 = b2[1];
            r66 = b2[2];
            r664 = b2[3];
        } catch (NotFoundException unused) {
            int i13 = k90.w / 2;
            int i14 = k90.x / 2;
            int i15 = i13 + 7;
            int i16 = i14 - 7;
            r66 b3 = e(new dv5(i15, i16, 3), false, 1, -1).b();
            int i17 = i14 + 7;
            r66 b4 = e(new dv5(i15, i17, 3), false, 1, 1).b();
            int i18 = i13 - 7;
            r66 b5 = e(new dv5(i18, i17, 3), false, -1, 1).b();
            r664 = e(new dv5(i18, i16, 3), false, -1, -1).b();
            r66 r669 = b4;
            r66 = b5;
            r663 = b3;
            r662 = r669;
        }
        int w0 = bb0.w0((((r663.a + r664.a) + r662.a) + r66.a) / 4.0f);
        int w02 = bb0.w0((((r663.b + r664.b) + r662.b) + r66.b) / 4.0f);
        char c2 = 15;
        try {
            r66[] b6 = new u88(k90, 15, w0, w02).b();
            r667 = b6[0];
            r666 = b6[1];
            r665 = b6[2];
            r668 = b6[3];
        } catch (NotFoundException unused2) {
            int i19 = w0 + 7;
            int i20 = w02 - 7;
            r66 b7 = e(new dv5(i19, i20, 3), false, 1, -1).b();
            int i21 = w02 + 7;
            r66 b8 = e(new dv5(i19, i21, 3), false, 1, 1).b();
            int i22 = w0 - 7;
            r665 = e(new dv5(i22, i21, 3), false, -1, 1).b();
            r668 = e(new dv5(i22, i20, 3), false, -1, -1).b();
            r666 = b8;
            r667 = b7;
        }
        dv5 dv52 = new dv5(bb0.w0((((r667.a + r668.a) + r666.a) + r665.a) / 4.0f), bb0.w0((((r667.b + r668.b) + r666.b) + r665.b) / 4.0f), 3);
        this.e = 1;
        boolean z3 = true;
        dv5 dv53 = dv52;
        dv5 dv54 = dv53;
        dv5 dv55 = dv54;
        while (true) {
            i = dv55.c;
            i2 = dv55.b;
            i3 = i12;
            i4 = dv52.c;
            char c3 = c2;
            i5 = dv52.b;
            if (this.e >= 9) {
                i6 = i11;
                break;
            }
            dv5 e2 = e(dv52, z3, i11, i10);
            int i23 = e2.c;
            int i24 = e2.b;
            dv5 e3 = e(dv53, z3, i11, i11);
            dv5 dv56 = e2;
            dv5 e4 = e(dv54, z3, i10, i11);
            dv5 e5 = e(dv55, z3, i10, i10);
            int i25 = e5.c;
            i6 = i11;
            int i26 = e5.b;
            dv5 dv57 = e5;
            boolean z4 = z3;
            if (this.e > 2) {
                int i27 = i23;
                double g0 = (double) ((bb0.g0(i26, i25, i24, i23) * ((float) this.e)) / (bb0.g0(i2, i, i5, i4) * ((float) (this.e + 2))));
                if (g0 < 0.75d || g0 > 1.25d) {
                    break;
                }
                dv5 dv58 = new dv5(i24 - 3, i27 + 3, 3);
                int i28 = i25;
                dv5 dv59 = new dv5(e3.b - 3, e3.c - 3, 3);
                dv5 = e3;
                dv5 dv510 = new dv5(e4.b + 3, e4.c - 3, 3);
                dv5 dv511 = new dv5(i26 + 3, i28 + 3, 3);
                int c4 = c(dv511, dv58);
                if (c4 == 0 || c(dv58, dv59) != c4 || c(dv59, dv510) != c4 || c(dv510, dv511) != c4) {
                    break;
                }
            } else {
                dv5 = e3;
            }
            z3 = !z4;
            this.e++;
            dv54 = e4;
            i12 = i3;
            c2 = c3;
            dv52 = dv56;
            i11 = i6;
            dv55 = dv57;
            dv53 = dv5;
            i10 = -1;
        }
        int i29 = this.e;
        if (i29 == 5 || i29 == 7) {
            if (i29 == 5) {
                z2 = i6;
            } else {
                z2 = i3;
            }
            this.b = z2;
            int i30 = i29 * 2;
            r66[] b9 = b(new r66[]{new r66(((float) i5) + 0.5f, ((float) i4) - 0.5f), new r66(((float) dv53.b) + 0.5f, ((float) dv53.c) + 0.5f), new r66(((float) dv54.b) - 0.5f, ((float) dv54.c) + 0.5f), new r66(((float) i2) - 0.5f, ((float) i) - 0.5f)}, i30 - 3, i30);
            if (z) {
                r66 r6610 = b9[i3];
                b9[i3] = b9[2];
                b9[2] = r6610;
            }
            if (!g(b9[i3]) || !g(b9[i6]) || !g(b9[2]) || !g(b9[3])) {
                throw NotFoundException.y;
            }
            int i31 = this.e * 2;
            int[] iArr = {h(b9[i3], b9[i6], i31), h(b9[i6], b9[2], i31), h(b9[2], b9[3], i31), h(b9[3], b9[i3], i31)};
            int i32 = i3;
            int i33 = i32;
            while (i32 < 4) {
                int i34 = iArr[i32];
                i33 = (i33 << 3) + ((i34 >> (i31 - 2)) << 1) + (i34 & 1);
                i32++;
            }
            int i35 = ((i33 & 1) << 11) + (i33 >> 1);
            int i36 = i3;
            while (i36 < 4) {
                if (Integer.bitCount(g[i36] ^ i35) <= 2) {
                    this.f = i36;
                    long j2 = 0;
                    int i37 = i3;
                    while (true) {
                        i7 = 10;
                        if (i37 >= 4) {
                            break;
                        }
                        int i38 = iArr[(this.f + i37) % 4];
                        if (this.b) {
                            j = j2 << 7;
                            i9 = (i38 >> 1) & 127;
                        } else {
                            j = j2 << 10;
                            i9 = ((i38 >> 2) & 992) + ((i38 >> 1) & 31);
                        }
                        j2 = j + ((long) i9);
                        i37++;
                    }
                    if (this.b) {
                        i7 = 7;
                        i8 = 2;
                    } else {
                        i8 = 4;
                    }
                    int i39 = i7 - i8;
                    int[] iArr2 = new int[i7];
                    for (int i40 = i7 - 1; i40 >= 0; i40--) {
                        iArr2[i40] = ((int) j2) & 15;
                        j2 >>= 4;
                    }
                    try {
                        new br4(8, (Object) gv2.k).x(iArr2, i39);
                        int i41 = i3;
                        for (int i42 = i41; i42 < i8; i42++) {
                            i41 = (i41 << 4) + iArr2[i42];
                        }
                        if (this.b) {
                            this.c = (i41 >> 6) + 1;
                            this.d = (i41 & 63) + 1;
                        } else {
                            this.c = (i41 >> 11) + 1;
                            this.d = (i41 & 2047) + 1;
                        }
                        int i43 = this.f;
                        r66 r6611 = b9[i43 % 4];
                        r66 r6612 = b9[(i43 + 1) % 4];
                        r66 r6613 = b9[(i43 + 2) % 4];
                        r66 r6614 = b9[(i43 + 3) % 4];
                        int d2 = d();
                        float f2 = ((float) d2) / 2.0f;
                        float f3 = (float) this.e;
                        float f4 = f2 - f3;
                        float f5 = f2 + f3;
                        return new d30(gw8.L(k90, d2, d2, lg5.a(f4, f4, f5, f4, f5, f5, f4, f5, r6611.a, r6611.b, r6612.a, r6612.b, r6613.a, r6613.b, r6614.a, r6614.b)), b(b9, this.e * 2, d()), this.b, this.d, this.c);
                    } catch (ReedSolomonException unused3) {
                        throw NotFoundException.y;
                    }
                } else {
                    i36++;
                }
            }
            throw NotFoundException.y;
        }
        throw NotFoundException.y;
    }

    public final int c(dv5 dv5, dv5 dv52) {
        int i = dv5.b;
        int i2 = dv5.c;
        int i3 = dv52.b;
        int i4 = dv52.c;
        float g0 = bb0.g0(i, i2, i3, i4);
        float f2 = ((float) (i3 - i)) / g0;
        float f3 = ((float) (i4 - i2)) / g0;
        float f4 = (float) i;
        float f5 = (float) i2;
        k90 k90 = this.a;
        boolean b2 = k90.b(i, i2);
        int ceil = (int) Math.ceil((double) g0);
        boolean z = false;
        int i5 = 0;
        for (int i6 = 0; i6 < ceil; i6++) {
            f4 += f2;
            f5 += f3;
            if (k90.b(bb0.w0(f4), bb0.w0(f5)) != b2) {
                i5++;
            }
        }
        float f6 = ((float) i5) / g0;
        if (f6 > 0.1f && f6 < 0.9f) {
            return 0;
        }
        if (f6 <= 0.1f) {
            z = true;
        }
        if (z == b2) {
            return 1;
        }
        return -1;
    }

    public final int d() {
        boolean z = this.b;
        int i = this.c;
        if (z) {
            return (i * 4) + 11;
        }
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return ((((i - 4) / 8) + 1) * 2) + (i * 4) + 15;
    }

    public final dv5 e(dv5 dv5, boolean z, int i, int i2) {
        int i3 = dv5.b + i;
        int i4 = dv5.c;
        while (true) {
            i4 += i2;
            boolean f2 = f(i3, i4);
            k90 k90 = this.a;
            if (!f2 || k90.b(i3, i4) != z) {
                int i5 = i3 - i;
                int i6 = i4 - i2;
            } else {
                i3 += i;
            }
        }
        int i52 = i3 - i;
        int i62 = i4 - i2;
        while (f(i52, i62) && k90.b(i52, i62) == z) {
            i52 += i;
        }
        int i7 = i52 - i;
        while (f(i7, i62) && k90.b(i7, i62) == z) {
            i62 += i2;
        }
        return new dv5(i7, i62 - i2, 3);
    }

    public final boolean f(int i, int i2) {
        if (i < 0) {
            return false;
        }
        k90 k90 = this.a;
        if (i >= k90.w || i2 <= 0 || i2 >= k90.x) {
            return false;
        }
        return true;
    }

    public final boolean g(r66 r66) {
        return f(bb0.w0(r66.a), bb0.w0(r66.b));
    }

    public final int h(r66 r66, r66 r662, int i) {
        float f2 = r66.a;
        float f3 = r66.b;
        float f4 = r662.a;
        float f5 = r662.b;
        float f0 = bb0.f0(f2, f3, f4, f5);
        float f6 = f0 / ((float) i);
        float f7 = r66.a;
        float f8 = ((r662.a - f7) * f6) / f0;
        float f9 = ((f5 - f3) * f6) / f0;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f10 = (float) i3;
            if (this.a.b(bb0.w0((f10 * f8) + f7), bb0.w0((f10 * f9) + f3))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }
}
