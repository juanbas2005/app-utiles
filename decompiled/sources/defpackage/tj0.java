package defpackage;

import android.graphics.Color;

/* renamed from: tj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tj0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public /* synthetic */ tj0(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.f = f7;
    }

    public static tj0 a(int i) {
        float f2;
        v68 v68 = v68.k;
        float L = pv8.L(Color.red(i));
        float L2 = pv8.L(Color.green(i));
        float L3 = pv8.L(Color.blue(i));
        float[][] fArr = pv8.d;
        float[] fArr2 = fArr[0];
        float f3 = fArr2[1] * L2;
        float f4 = (fArr2[2] * L3) + f3 + (fArr2[0] * L);
        float[] fArr3 = fArr[1];
        float f5 = fArr3[1] * L2;
        float f6 = (fArr3[2] * L3) + f5 + (fArr3[0] * L);
        float[] fArr4 = fArr[2];
        float f7 = (L3 * fArr4[2]) + (L2 * fArr4[1]) + (L * fArr4[0]);
        float[][] fArr5 = pv8.a;
        float[] fArr6 = fArr5[0];
        float f8 = fArr6[1] * f6;
        float f9 = (fArr6[2] * f7) + f8 + (fArr6[0] * f4);
        float[] fArr7 = fArr5[1];
        float f10 = fArr7[1] * f6;
        float f11 = fArr7[2] * f7;
        float[] fArr8 = fArr5[2];
        float f12 = f4 * fArr8[0];
        float f13 = (f7 * fArr8[2]) + (f6 * fArr8[1]) + f12;
        float[] fArr9 = v68.g;
        float f14 = v68.i;
        float f15 = v68.d;
        float f16 = v68.a;
        float f17 = fArr9[0] * f9;
        float f18 = fArr9[1] * (f11 + f10 + (fArr7[0] * f4));
        float f19 = fArr9[2] * f13;
        float f20 = v68.h;
        float pow = (float) Math.pow(((double) (Math.abs(f17) * f20)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f18) * f20)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f19) * f20)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f17) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f18) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f19) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = (double) signum3;
        float f21 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d2)) / 11.0f;
        float f22 = ((float) (((double) (signum + signum2)) - (d2 * 2.0d))) / 9.0f;
        float f23 = signum2 * 20.0f;
        float f24 = ((21.0f * signum3) + ((signum * 20.0f) + f23)) / 20.0f;
        float f25 = (((signum * 40.0f) + f23) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f22, (double) f21)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f26 = (3.1415927f * atan2) / 180.0f;
        float f27 = f22;
        float pow4 = ((float) Math.pow((double) ((f25 * v68.b) / f16), (double) (v68.j * f15))) * 100.0f;
        Math.sqrt((double) (pow4 / 100.0f));
        float f28 = f16 + 4.0f;
        if (((double) atan2) < 20.14d) {
            f2 = 360.0f + atan2;
        } else {
            f2 = atan2;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) v68.f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) f2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * v68.e) * v68.c) * ((float) Math.sqrt((double) ((f27 * f27) + (f21 * f21))))) / (f24 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        Math.sqrt((double) ((pow5 * f15) / f28));
        float f29 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((f14 * sqrt * 0.0228f) + 1.0f))) * 43.85965f;
        double d3 = (double) f26;
        return new tj0(atan2, sqrt, pow4, f29, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public static tj0 b(float f2, float f3, float f4) {
        v68 v68 = v68.k;
        float f5 = v68.d;
        double d2 = ((double) f2) / 100.0d;
        Math.sqrt(d2);
        Math.sqrt((double) (((f3 / ((float) Math.sqrt(d2))) * v68.d) / (v68.a + 4.0f)));
        float f6 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((((double) (v68.i * f3)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (double) ((3.1415927f * f4) / 180.0f);
        return new tj0(f4, f3, f2, f6, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public int c(cr2 cr2) {
        float f2;
        float f3 = this.b;
        int i = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        float f4 = this.c;
        if (i == 0 || f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = f3 / ((float) Math.sqrt((double) (f4 / 100.0f)));
        }
        float f5 = cr2.a;
        float f6 = cr2.h;
        float pow = f2 / ((float) Math.pow((double) (1.64f - ((float) Math.pow((double) ((float) Math.pow(0.28999999165534973d, (double) f5)), 0.7300000190734863d))), 1.1111111640930176d));
        float f7 = (this.a * 3.1415927f) / 180.0f;
        float pow2 = cr2.b * ((float) Math.pow((double) (f4 / 100.0f), (double) ((1.0f / cr2.e) / cr2.j)));
        float cos = (((float) Math.cos((double) (2.0f + f7))) + 3.8f) * 0.25f * 3846.1538f * cr2.f * cr2.d;
        float f8 = pow2 / cr2.c;
        double d2 = (double) f7;
        float sin = (float) Math.sin(d2);
        float cos2 = (float) Math.cos(d2);
        float f9 = (((0.305f + f8) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
        float f10 = cos2 * f9;
        float f11 = f9 * sin;
        float f12 = f8 * 460.0f;
        float f13 = ((288.0f * f11) + ((451.0f * f10) + f12)) / 1403.0f;
        float f14 = ((f12 - (891.0f * f10)) - (261.0f * f11)) / 1403.0f;
        float f15 = ((f12 - (f10 * 220.0f)) - (f11 * 6300.0f)) / 1403.0f;
        float f16 = 100.0f / f6;
        float signum = Math.signum(f13) * f16 * ((float) Math.pow((double) Math.max(0.0f, (Math.abs(f13) * 27.13f) / (400.0f - Math.abs(f13))), 2.3809523582458496d));
        float signum2 = Math.signum(f14) * f16 * ((float) Math.pow((double) Math.max(0.0f, (Math.abs(f14) * 27.13f) / (400.0f - Math.abs(f14))), 2.3809523582458496d));
        float signum3 = Math.signum(f15) * f16 * ((float) Math.pow((double) Math.max(0.0f, (Math.abs(f15) * 27.13f) / (400.0f - Math.abs(f15))), 2.3809523582458496d));
        float[] fArr = cr2.g;
        float f17 = signum / fArr[0];
        float f18 = signum2 / fArr[1];
        float f19 = signum3 / fArr[2];
        float[][] fArr2 = gw8.c;
        float[] fArr3 = fArr2[0];
        float f20 = (fArr3[2] * f19) + (fArr3[1] * f18) + (fArr3[0] * f17);
        float[] fArr4 = fArr2[1];
        float f21 = fArr4[1] * f18;
        float f22 = fArr4[2] * f19;
        float[] fArr5 = fArr2[2];
        return yt0.a((double) f20, (double) (f22 + f21 + (fArr4[0] * f17)), (double) ((f19 * fArr5[2]) + (f18 * fArr5[1]) + (f17 * fArr5[0])));
    }

    public int d(v68 v68) {
        float f2;
        v68 v682 = v68;
        float f3 = this.b;
        int i = (((double) f3) > 0.0d ? 1 : (((double) f3) == 0.0d ? 0 : -1));
        float f4 = this.c;
        if (i != 0) {
            double d2 = (double) f4;
            if (d2 != 0.0d) {
                f2 = f3 / ((float) Math.sqrt(d2 / 100.0d));
                float f5 = v682.f;
                float f6 = v682.h;
                float pow = (float) Math.pow(((double) f2) / Math.pow(1.64d - Math.pow(0.29d, (double) f5), 0.73d), 1.1111111111111112d);
                double d3 = (double) ((this.a * 3.1415927f) / 180.0f);
                float pow2 = v682.a * ((float) Math.pow(((double) f4) / 100.0d, (1.0d / ((double) v682.d)) / ((double) v682.j)));
                float cos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f * 3846.1538f * v682.e * v682.c;
                float f7 = pow2 / v682.b;
                float sin = (float) Math.sin(d3);
                float cos2 = (float) Math.cos(d3);
                float f8 = 11.0f * pow * cos2;
                float f9 = (((0.305f + f7) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f8 + (cos * 23.0f)));
                float f10 = cos2 * f9;
                float f11 = f9 * sin;
                float f12 = f7 * 460.0f;
                float f13 = ((288.0f * f11) + ((451.0f * f10) + f12)) / 1403.0f;
                float f14 = ((f12 - (891.0f * f10)) - (261.0f * f11)) / 1403.0f;
                float f15 = ((f12 - (f10 * 220.0f)) - (f11 * 6300.0f)) / 1403.0f;
                float f16 = 100.0f / f6;
                float signum = Math.signum(f13) * f16 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13))))), 2.380952380952381d));
                float signum2 = Math.signum(f14) * f16 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f14)) * 27.13d) / (400.0d - ((double) Math.abs(f14))))), 2.380952380952381d));
                float signum3 = Math.signum(f15) * f16 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15))))), 2.380952380952381d));
                float[] fArr = v682.g;
                float f17 = signum / fArr[0];
                float f18 = signum2 / fArr[1];
                float f19 = signum3 / fArr[2];
                float[][] fArr2 = pv8.b;
                float[] fArr3 = fArr2[0];
                float f20 = fArr3[1] * f18;
                float f21 = (fArr3[2] * f19) + f20 + (fArr3[0] * f17);
                float[] fArr4 = fArr2[1];
                float f22 = fArr4[1] * f18;
                float f23 = fArr4[2] * f19;
                float[] fArr5 = fArr2[2];
                float f24 = f17 * fArr5[0];
                return yt0.a((double) f21, (double) (f23 + f22 + (fArr4[0] * f17)), (double) ((f19 * fArr5[2]) + (f18 * fArr5[1]) + f24));
            }
        }
        f2 = 0.0f;
        float f52 = v682.f;
        float f62 = v682.h;
        float pow3 = (float) Math.pow(((double) f2) / Math.pow(1.64d - Math.pow(0.29d, (double) f52), 0.73d), 1.1111111111111112d);
        double d32 = (double) ((this.a * 3.1415927f) / 180.0f);
        float pow22 = v682.a * ((float) Math.pow(((double) f4) / 100.0d, (1.0d / ((double) v682.d)) / ((double) v682.j)));
        float cos3 = ((float) (Math.cos(2.0d + d32) + 3.8d)) * 0.25f * 3846.1538f * v682.e * v682.c;
        float f72 = pow22 / v682.b;
        float sin2 = (float) Math.sin(d32);
        float cos22 = (float) Math.cos(d32);
        float f82 = 11.0f * pow3 * cos22;
        float f92 = (((0.305f + f72) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (f82 + (cos3 * 23.0f)));
        float f102 = cos22 * f92;
        float f112 = f92 * sin2;
        float f122 = f72 * 460.0f;
        float f132 = ((288.0f * f112) + ((451.0f * f102) + f122)) / 1403.0f;
        float f142 = ((f122 - (891.0f * f102)) - (261.0f * f112)) / 1403.0f;
        float f152 = ((f122 - (f102 * 220.0f)) - (f112 * 6300.0f)) / 1403.0f;
        float f162 = 100.0f / f62;
        float signum4 = Math.signum(f132) * f162 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f132)) * 27.13d) / (400.0d - ((double) Math.abs(f132))))), 2.380952380952381d));
        float signum22 = Math.signum(f142) * f162 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f142)) * 27.13d) / (400.0d - ((double) Math.abs(f142))))), 2.380952380952381d));
        float signum32 = Math.signum(f152) * f162 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f152)) * 27.13d) / (400.0d - ((double) Math.abs(f152))))), 2.380952380952381d));
        float[] fArr6 = v682.g;
        float f172 = signum4 / fArr6[0];
        float f182 = signum22 / fArr6[1];
        float f192 = signum32 / fArr6[2];
        float[][] fArr22 = pv8.b;
        float[] fArr32 = fArr22[0];
        float f202 = fArr32[1] * f182;
        float f212 = (fArr32[2] * f192) + f202 + (fArr32[0] * f172);
        float[] fArr42 = fArr22[1];
        float f222 = fArr42[1] * f182;
        float f232 = fArr42[2] * f192;
        float[] fArr52 = fArr22[2];
        float f242 = f172 * fArr52[0];
        return yt0.a((double) f212, (double) (f232 + f222 + (fArr42[0] * f172)), (double) ((f192 * fArr52[2]) + (f182 * fArr52[1]) + f242));
    }
}
