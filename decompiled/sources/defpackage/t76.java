package defpackage;

import java.util.Arrays;

/* renamed from: t76  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t76 extends tt0 {
    public static final ku4 r = new ku4(17);
    public final t88 d;
    public final float e;
    public final float f;
    public final ll7 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final ex1 k;
    public final s76 l;
    public final p76 m;
    public final ex1 n;
    public final s76 o;
    public final p76 p;
    public final boolean q;

    /* JADX WARNING: type inference failed for: r44v1 */
    /* JADX WARNING: type inference failed for: r44v2 */
    /* JADX WARNING: type inference failed for: r44v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01e0, code lost:
        if ((((r25 - r12) * r3) - ((r1 - r15) * r10)) >= 0.0f) goto L_0x01e7;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public t76(String str, float[] fArr, t88 t88, float[] fArr2, ex1 ex1, ex1 ex12, float f2, float f3, ll7 ll7, int i2) {
        super(r8, 12884901888L, str);
        ? r44;
        float f4;
        float f5;
        boolean z;
        float[] fArr3 = fArr;
        t88 t882 = t88;
        float[] fArr4 = fArr2;
        ex1 ex13 = ex1;
        ex1 ex14 = ex12;
        float f6 = f2;
        float f7 = f3;
        int i3 = i2;
        this.d = t882;
        this.e = f6;
        this.f = f7;
        this.g = ll7;
        this.k = ex13;
        this.l = new s76(this, 1);
        this.m = new p76(this, 0);
        this.n = ex14;
        this.o = new s76(this, 0);
        this.p = new p76(this, 1);
        if (fArr3.length != 6 && fArr3.length != 9) {
            h.q("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        } else if (f6 < f7) {
            float[] fArr5 = new float[6];
            if (fArr3.length == 9) {
                float f8 = fArr3[0];
                float f9 = fArr3[1];
                float f10 = f8 + f9 + fArr3[2];
                fArr5[0] = f8 / f10;
                fArr5[1] = f9 / f10;
                float f11 = fArr3[3];
                float f12 = fArr3[4];
                float f13 = f11 + f12 + fArr3[5];
                fArr5[2] = f11 / f13;
                fArr5[3] = f12 / f13;
                float f14 = fArr3[6];
                float f15 = fArr3[7];
                float f16 = f14 + f15 + fArr3[8];
                fArr5[4] = f14 / f16;
                fArr5[5] = f15 / f16;
            } else {
                System.arraycopy(fArr3, 0, fArr5, 0, 6);
            }
            this.h = fArr5;
            if (fArr4 == null) {
                float f17 = fArr5[0];
                float f18 = fArr5[1];
                float f19 = fArr5[2];
                float f20 = fArr5[3];
                float f21 = fArr5[4];
                float f22 = fArr5[5];
                f4 = 1.0f;
                float f23 = t882.a;
                r44 = 1;
                float f24 = t882.b;
                float f25 = 1.0f - f17;
                float f26 = f25 / f18;
                float f27 = 1.0f - f19;
                float f28 = 1.0f - f21;
                float f29 = f17 / f18;
                float f30 = (f19 / f20) - f29;
                float f31 = (f23 / f24) - f29;
                float f32 = (f27 / f20) - f26;
                float f33 = (f21 / f22) - f29;
                float f34 = (((((1.0f - f23) / f24) - f26) * f30) - (f31 * f32)) / ((((f28 / f22) - f26) * f30) - (f32 * f33));
                float f35 = (f31 - (f33 * f34)) / f30;
                float f36 = (1.0f - f35) - f34;
                float f37 = f36 / f18;
                float f38 = f35 / f20;
                float f39 = f34 / f22;
                this.i = new float[]{f17 * f37, f36, (f25 - f18) * f37, f19 * f38, f35, (f27 - f20) * f38, f21 * f39, f34, (f28 - f22) * f39};
            } else {
                r44 = 1;
                f4 = 1.0f;
                if (fArr4.length == 9) {
                    this.i = fArr4;
                } else {
                    h.q(hl6.k(fArr4.length, "Transform must have 9 entries! Has "));
                    throw null;
                }
            }
            this.j = b96.E(this.i);
            float e2 = z85.e(fArr5);
            float[] fArr6 = vt0.a;
            if (e2 / z85.e(vt0.b) > 0.9f) {
                float[] fArr7 = vt0.a;
                float f40 = fArr5[0];
                float f41 = fArr7[0];
                float f42 = fArr5[r44];
                float f43 = fArr7[r44];
                float f44 = fArr5[2];
                float f45 = fArr7[2];
                float f46 = fArr5[3];
                float f47 = fArr7[3];
                float f48 = fArr5[4];
                float f49 = fArr7[4];
                float f50 = fArr5[5];
                float f51 = fArr7[5];
                f5 = 0.0f;
                float[] fArr8 = new float[6];
                fArr8[0] = f40 - f41;
                fArr8[r44] = f42 - f43;
                fArr8[2] = f44 - f45;
                fArr8[3] = f46 - f47;
                fArr8[4] = f48 - f49;
                fArr8[5] = f50 - f51;
                float f52 = fArr8[0];
                float f53 = fArr8[r44];
                if (((f43 - f51) * f52) - ((f41 - f49) * f53) >= 0.0f && ((f41 - f45) * f53) - ((f43 - f47) * f52) >= 0.0f) {
                    float f54 = fArr8[2];
                    float f55 = fArr8[3];
                    if (((f47 - f43) * f54) - ((f45 - f41) * f55) >= 0.0f && ((f45 - f49) * f55) - ((f47 - f51) * f54) >= 0.0f) {
                        float f56 = fArr8[4];
                        float f57 = fArr8[5];
                        if (((f51 - f47) * f56) - ((f49 - f45) * f57) >= 0.0f) {
                        }
                    }
                }
            } else {
                f5 = 0.0f;
            }
            int i4 = (f6 > f5 ? 1 : (f6 == f5 ? 0 : -1));
            if (i3 != 0) {
                float[] fArr9 = vt0.a;
                if (fArr5 != fArr9) {
                    int i5 = 0;
                    while (true) {
                        if (i5 < 6) {
                            if (Float.compare(fArr5[i5], fArr9[i5]) != 0 && Math.abs(fArr5[i5] - fArr9[i5]) > 0.001f) {
                                break;
                            }
                            i5++;
                        } else {
                            break;
                        }
                    }
                    z = false;
                    this.q = z;
                }
                if (b96.k(t882, kl8.k) && f6 == f5 && f7 == f4) {
                    float[] fArr10 = vt0.a;
                    t76 t76 = vt0.e;
                    double d2 = 0.0d;
                    while (true) {
                        if (d2 > 1.0d) {
                            break;
                        }
                        if (Math.abs(ex13.b(d2) - t76.k.b(d2)) > 0.001d) {
                            break;
                        }
                        if (Math.abs(ex14.b(d2) - t76.n.b(d2)) > 0.001d) {
                            break;
                        }
                        d2 += 0.00392156862745098d;
                    }
                }
                z = false;
                this.q = z;
            }
            z = r44;
            this.q = z;
        } else {
            throw new IllegalArgumentException("Invalid range: min=" + f6 + ", max=" + f7 + "; min must be strictly < max");
        }
    }

    public final float a(int i2) {
        return this.f;
    }

    public final float b(int i2) {
        return this.e;
    }

    public final boolean c() {
        return this.q;
    }

    public final long d(float f2, float f3, float f4) {
        double d2 = (double) f2;
        p76 p76 = this.p;
        float b = (float) p76.b(d2);
        float b2 = (float) p76.b((double) f3);
        float b3 = (float) p76.b((double) f4);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0;
        }
        float f5 = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
        float f6 = fArr[1] * b;
        return (((long) Float.floatToRawIntBits(f5)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * b3) + (fArr[4] * b2) + f6)));
    }

    public final float e(float f2, float f3, float f4) {
        double d2 = (double) f2;
        p76 p76 = this.p;
        float b = (float) p76.b((double) f3);
        float[] fArr = this.i;
        float b2 = fArr[2] * ((float) p76.b(d2));
        return (fArr[8] * ((float) p76.b((double) f4))) + (fArr[5] * b) + b2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t76.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        t76 t76 = (t76) obj;
        if (Float.compare(t76.e, this.e) != 0 || Float.compare(t76.f, this.f) != 0 || !sg3.e(this.d, t76.d) || !Arrays.equals(this.h, t76.h)) {
            return false;
        }
        ll7 ll7 = t76.g;
        ll7 ll72 = this.g;
        if (ll72 != null) {
            return sg3.e(ll72, ll7);
        }
        if (ll7 == null) {
            return true;
        }
        if (!sg3.e(this.k, t76.k)) {
            return false;
        }
        return sg3.e(this.n, t76.n);
    }

    public final long f(float f2, float f3, float f4, float f5, tt0 tt0) {
        float[] fArr = this.j;
        float f6 = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = fArr[2] * f2;
        float f9 = (fArr[8] * f4) + (fArr[5] * f3) + f8;
        p76 p76 = this.m;
        return uq3.b((float) p76.b((double) f6), (float) p76.b((double) f7), (float) p76.b((double) f9), f5, tt0);
    }

    public final int hashCode() {
        int i2;
        int i3;
        int hashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f2 = this.e;
        int i4 = 0;
        if (f2 == 0.0f) {
            i2 = 0;
        } else {
            i2 = Float.floatToIntBits(f2);
        }
        int i5 = (hashCode + i2) * 31;
        float f3 = this.f;
        if (f3 == 0.0f) {
            i3 = 0;
        } else {
            i3 = Float.floatToIntBits(f3);
        }
        int i6 = (i5 + i3) * 31;
        ll7 ll7 = this.g;
        if (ll7 != null) {
            i4 = ll7.hashCode();
        }
        int i7 = i6 + i4;
        if (ll7 != null) {
            return i7;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (i7 * 31)) * 31);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public t76(String str, float[] fArr, t88 t88, ll7 ll7, int i2) {
        this(str, fArr, t88, (float[]) null, r4, r6, 0.0f, 1.0f, r9, i2);
        double d2;
        r76 r76;
        r76 r762;
        ll7 ll72 = ll7;
        double d3 = ll72.a;
        boolean z = d3 == -3.0d;
        double d4 = ll72.g;
        double d5 = ll72.f;
        if (z) {
            d2 = -3.0d;
            r76 = new r76(ll72, 4);
        } else {
            d2 = -3.0d;
            if (d3 == -2.0d) {
                r76 = new r76(ll72, 5);
            } else if (d5 == 0.0d && d4 == 0.0d) {
                r76 = new r76(ll72, 6);
            } else {
                r76 = new r76(ll72, 7);
            }
        }
        if (d3 == d2) {
            r762 = new r76(ll72, 0);
        } else if (d3 == -2.0d) {
            r762 = new r76(ll72, 1);
        } else if (d5 == 0.0d && d4 == 0.0d) {
            r762 = new r76(ll72, 2);
        } else {
            r762 = new r76(ll72, 3);
        }
        r76 r763 = r762;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public t76(String str, float[] fArr, t88 t88, double d2, float f2, float f3, int i2) {
        this(str, fArr, t88, (float[]) null, r11, r0 != 0 ? new q76(r1, 1) : r3, f2, f3, new ll7(r1, 1.0d, 0.0d, 0.0d, 0.0d), i2);
        q76 q76;
        double d3 = d2;
        int i3 = (d3 > 1.0d ? 1 : (d3 == 1.0d ? 0 : -1));
        ex1 ex1 = r;
        if (i3 == 0) {
            q76 = ex1;
        } else {
            q76 = new q76(d3, 0);
        }
    }
}
