package defpackage;

/* renamed from: v68  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v68 {
    public static final v68 k;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[] fArr = pv8.c;
        float Q = (float) ((((double) pv8.Q()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = pv8.a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr3[1] * f3;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4 + (fArr3[0] * f2);
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f2 * fArr5[0]);
        float exp = (1.0f - (((float) Math.exp((double) (((-Q) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d2 = (double) exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * Q) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float cbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(((double) Q) * 5.0d))) + (f10 * Q);
        float Q2 = pv8.Q() / fArr[1];
        double d3 = (double) Q2;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * cbrt) * f8)) / 100.0d, 0.42d)};
        float f12 = fArr7[0];
        float f13 = (f12 * 400.0f) / (f12 + 27.13f);
        float f14 = fArr7[1];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[2];
        float[] fArr8 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
        float[] fArr9 = fArr6;
        k = new v68(Q2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, 0.69f, 1.0f, fArr9, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    public v68(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f = f2;
        this.a = f3;
        this.b = f4;
        this.c = f5;
        this.d = f6;
        this.e = f7;
        this.g = fArr;
        this.h = f8;
        this.i = f9;
        this.j = f10;
    }
}
