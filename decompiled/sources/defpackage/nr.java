package defpackage;

import java.util.Arrays;

/* renamed from: nr  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nr {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public float h;
    public float i;
    public final float[] j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final boolean p;
    public final float q;
    public final float r;

    public nr(int i2, float f2, float f3, float f4, float f5, float f6, float f7) {
        boolean z;
        float f8;
        boolean z2;
        boolean z3;
        float f9;
        float f10;
        int i3;
        float f11;
        int i4 = i2;
        float f12 = f2;
        float f13 = f3;
        float f14 = f4;
        float f15 = f5;
        float f16 = f6;
        float f17 = f7;
        this.a = f12;
        this.b = f13;
        this.c = f14;
        this.d = f15;
        this.e = f16;
        this.f = f17;
        float f18 = f16 - f14;
        float f19 = f17 - f15;
        float f20 = 0.0f;
        int i5 = 1;
        if (i4 == 1 || (i4 == 4 ? f19 > 0.0f : !(i4 != 5 || f19 >= 0.0f))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f8 = -1.0f;
        } else {
            f8 = 1.0f;
        }
        this.m = f8;
        float f21 = 1.0f / (f13 - f12);
        this.k = f21;
        float[] fArr = new float[101];
        this.j = fArr;
        if (i4 == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || Math.abs(f18) < 0.001f || Math.abs(f19) < 0.001f) {
            float hypot = (float) Math.hypot((double) f19, (double) f18);
            this.g = hypot;
            this.l = hypot * f21;
            this.q = f18 * f21;
            this.r = f19 * f21;
            this.n = Float.NaN;
            this.o = Float.NaN;
            z3 = true;
        } else {
            this.n = f18 * f8;
            this.o = f19 * (-f8);
            if (z) {
                f9 = f16;
            } else {
                f9 = f14;
            }
            this.q = f9;
            if (z) {
                f10 = f15;
            } else {
                f10 = f17;
            }
            this.r = f10;
            float f22 = f16 - f14;
            float f23 = f15 - f17;
            float[] fArr2 = rg3.a;
            float f24 = f23;
            float f25 = 0.0f;
            float f26 = 0.0f;
            int i6 = 1;
            while (true) {
                i3 = i5;
                double d2 = (double) ((float) (((((double) i6) * 90.0d) / 90.0d) * 0.017453292519943295d));
                float sin = ((float) Math.sin(d2)) * f22;
                float cos = ((float) Math.cos(d2)) * f23;
                f11 = f20;
                f25 += (float) Math.hypot((double) (sin - f26), (double) (cos - f24));
                fArr2[i6] = f25;
                if (i6 == 90) {
                    break;
                }
                i6++;
                f26 = sin;
                f24 = cos;
                i5 = i3;
                f20 = f11;
            }
            this.g = f25;
            int i7 = i3;
            while (true) {
                fArr2[i7] = fArr2[i7] / f25;
                if (i7 == 90) {
                    break;
                }
                i7++;
            }
            int length = fArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                float f27 = ((float) i8) / 100.0f;
                int binarySearch = Arrays.binarySearch(fArr2, 0, 91, f27);
                if (binarySearch >= 0) {
                    fArr[i8] = ((float) binarySearch) / 90.0f;
                } else if (binarySearch == -1) {
                    fArr[i8] = f11;
                } else {
                    int i9 = -binarySearch;
                    int i10 = i9 - 2;
                    float f28 = (float) i10;
                    float f29 = fArr2[i10];
                    fArr[i8] = (((f27 - f29) / (fArr2[i9 - i3] - f29)) + f28) / 90.0f;
                }
            }
            this.l = this.g * this.k;
            z3 = z2;
        }
        this.p = z3;
    }

    public final float a() {
        float f2 = this.n * this.i;
        float f3 = (-this.o) * this.h;
        float f4 = this.l;
        return f2 * this.m * (f4 / ((float) Math.hypot((double) f2, (double) f3)));
    }

    public final float b() {
        float f2 = this.n * this.i;
        float f3 = (-this.o) * this.h;
        float hypot = (float) Math.hypot((double) f2, (double) f3);
        return f3 * this.m * (this.l / hypot);
    }

    public final void c(float f2) {
        float f3;
        if (this.m == -1.0f) {
            f3 = this.b - f2;
        } else {
            f3 = f2 - this.a;
        }
        float f4 = f3 * this.k;
        float f5 = 0.0f;
        if (f4 > 0.0f) {
            f5 = 1.0f;
            if (f4 < 1.0f) {
                float f6 = f4 * 100.0f;
                int i2 = (int) f6;
                float[] fArr = this.j;
                float f7 = fArr[i2];
                f5 = b81.d(fArr[i2 + 1], f7, f6 - ((float) i2), f7);
            }
        }
        double d2 = (double) (f5 * 1.5707964f);
        this.h = (float) Math.sin(d2);
        this.i = (float) Math.cos(d2);
    }
}
