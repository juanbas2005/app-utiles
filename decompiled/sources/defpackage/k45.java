package defpackage;

/* renamed from: k45  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k45 extends tt0 {
    public static final float[] d;
    public static final float[] e;
    public static final float[] f;
    public static final float[] g;

    static {
        float[] J = b96.J(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, b96.i((float[]) f96.A.x, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        d = J;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        e = fArr;
        f = b96.E(J);
        g = b96.E(fArr);
    }

    public final float a(int i) {
        if (i == 0) {
            return 1.0f;
        }
        return 0.5f;
    }

    public final float b(int i) {
        if (i == 0) {
            return 0.0f;
        }
        return -0.5f;
    }

    public final long d(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f5 = 0.5f;
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        if (f4 <= 0.5f) {
            f5 = f4;
        }
        float[] fArr = g;
        float f6 = (fArr[6] * f5) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f5) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f5) + (fArr[5] * f3) + (fArr[2] * f2);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float[] fArr2 = f;
        return (((long) Float.floatToRawIntBits((fArr2[6] * f11) + ((fArr2[3] * f10) + (fArr2[0] * f9)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr2[7] * f11) + (fArr2[4] * f10) + (fArr2[1] * f9))));
    }

    public final float e(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f5 = 0.5f;
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        if (f4 <= 0.5f) {
            f5 = f4;
        }
        float[] fArr = g;
        float f6 = (fArr[6] * f5) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f5) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f5) + (fArr[5] * f3) + (fArr[2] * f2);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float[] fArr2 = f;
        return (fArr2[8] * f11) + (fArr2[5] * f10) + (fArr2[2] * f9);
    }

    public final long f(float f2, float f3, float f4, float f5, tt0 tt0) {
        float[] fArr = d;
        float f6 = fArr[3] * f3;
        float f7 = fArr[6] * f4;
        float f8 = fArr[4] * f3;
        float f9 = fArr[7] * f4;
        float f10 = fArr[5] * f3;
        float f11 = fArr[8] * f4;
        float k = we.k(f7 + f6 + (fArr[0] * f2));
        float k2 = we.k(f9 + f8 + (fArr[1] * f2));
        float k3 = we.k(f11 + f10 + (fArr[2] * f2));
        float[] fArr2 = e;
        float f12 = (fArr2[6] * k3) + (fArr2[3] * k2) + (fArr2[0] * k);
        float f13 = (fArr2[4] * k2) + (fArr2[1] * k);
        float f14 = fArr2[5] * k2;
        return uq3.b(f12, (fArr2[7] * k3) + f13, (fArr2[8] * k3) + f14 + (fArr2[2] * k), f5, tt0);
    }
}
