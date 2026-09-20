package defpackage;

import java.util.Arrays;

/* renamed from: eh4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eh4 {
    public final float[] a;

    public /* synthetic */ eh4(float[] fArr) {
        this.a = fArr;
    }

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long b(long j, float[] fArr) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1.0f / (((f6 * intBitsToFloat2) + (f3 * intBitsToFloat)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits((((f4 * intBitsToFloat2) + (f * intBitsToFloat)) + f7) * f10)) << 32) | (((long) Float.floatToRawIntBits(((f5 * intBitsToFloat2) + (f2 * intBitsToFloat) + f8) * f10)) & 4294967295L);
    }

    public static final void c(float[] fArr, sp4 sp4) {
        float[] fArr2 = fArr;
        sp4 sp42 = sp4;
        if (fArr2.length >= 16) {
            float f = fArr2[0];
            float f2 = fArr2[1];
            float f3 = fArr2[3];
            float f4 = fArr2[4];
            float f5 = fArr2[5];
            float f6 = fArr2[7];
            float f7 = fArr2[12];
            float f8 = fArr2[13];
            float f9 = fArr2[15];
            float f10 = sp42.b;
            float f11 = sp42.c;
            float f12 = sp42.d;
            float f13 = sp42.e;
            float f14 = f3 * f10;
            float f15 = f6 * f11;
            float f16 = 1.0f / ((f14 + f15) + f9);
            float f17 = f9;
            float f18 = 0.0f;
            float f19 = f;
            if ((Float.floatToRawIntBits(f16) & Integer.MAX_VALUE) >= 2139095040) {
                f16 = 0.0f;
            }
            float f20 = f19 * f10;
            float f21 = f4 * f11;
            float f22 = (f20 + f21 + f7) * f16;
            float f23 = f10 * f2;
            float f24 = f11 * f5;
            float f25 = f20;
            float f26 = (f23 + f24 + f8) * f16;
            float f27 = f6 * f13;
            float f28 = 1.0f / ((f14 + f27) + f17);
            float f29 = f2;
            float f30 = f3;
            if ((Float.floatToRawIntBits(f28) & Integer.MAX_VALUE) >= 2139095040) {
                f28 = 0.0f;
            }
            float f31 = f4 * f13;
            float f32 = (f25 + f31 + f7) * f28;
            float f33 = f5 * f13;
            float f34 = (f23 + f33 + f8) * f28;
            float f35 = f30 * f12;
            float f36 = 1.0f / ((f15 + f35) + f17);
            if ((Float.floatToRawIntBits(f36) & Integer.MAX_VALUE) >= 2139095040) {
                f36 = 0.0f;
            }
            float f37 = f19 * f12;
            float f38 = (f37 + f21 + f7) * f36;
            float f39 = f12 * f29;
            float f40 = (f24 + f39 + f8) * f36;
            float f41 = 1.0f / ((f35 + f27) + f17);
            if ((Float.floatToRawIntBits(f41) & Integer.MAX_VALUE) < 2139095040) {
                f18 = f41;
            }
            float f42 = (f37 + f31 + f7) * f18;
            float f43 = (f39 + f33 + f8) * f18;
            sp42.b = Math.min(f22, Math.min(f32, Math.min(f38, f42)));
            sp42.c = Math.min(f26, Math.min(f34, Math.min(f40, f43)));
            sp42.d = Math.max(f22, Math.max(f32, Math.max(f38, f42)));
            sp42.e = Math.max(f26, Math.max(f34, Math.max(f40, f43)));
        }
    }

    public static final void d(float[] fArr) {
        if (fArr.length >= 16) {
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 1.0f;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 1.0f;
            fArr[11] = 0.0f;
            fArr[12] = 0.0f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 1.0f;
        }
    }

    public static final void e(float[] fArr, float f) {
        float[] fArr2 = fArr;
        if (fArr2.length >= 16) {
            double d = ((double) f) * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f2 = fArr2[0];
            float f3 = fArr2[4];
            float f4 = (sin * f3) + (cos * f2);
            float f5 = -sin;
            float f6 = f3 * cos;
            float f7 = fArr2[1];
            float f8 = fArr2[5];
            float f9 = (sin * f8) + (cos * f7);
            float f10 = f8 * cos;
            float f11 = fArr2[2];
            float f12 = fArr2[6];
            float f13 = (sin * f12) + (cos * f11);
            float f14 = f12 * cos;
            float f15 = fArr2[3];
            float f16 = fArr2[7];
            fArr2[0] = f4;
            fArr2[1] = f9;
            fArr2[2] = f13;
            fArr2[3] = (sin * f16) + (cos * f15);
            fArr2[4] = f6 + (f2 * f5);
            fArr2[5] = f10 + (f7 * f5);
            fArr2[6] = f14 + (f11 * f5);
            fArr2[7] = (cos * f16) + (f5 * f15);
        }
    }

    public static final void f(float[] fArr, float f, float f2) {
        if (fArr.length >= 16) {
            fArr[0] = fArr[0] * f;
            fArr[1] = fArr[1] * f;
            fArr[2] = fArr[2] * f;
            fArr[3] = fArr[3] * f;
            fArr[4] = fArr[4] * f2;
            fArr[5] = fArr[5] * f2;
            fArr[6] = fArr[6] * f2;
            fArr[7] = fArr[7] * f2;
            fArr[8] = fArr[8] * 1.0f;
            fArr[9] = fArr[9] * 1.0f;
            fArr[10] = fArr[10] * 1.0f;
            fArr[11] = fArr[11] * 1.0f;
        }
    }

    public static final void g(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        if (fArr3.length >= 16 && fArr4.length >= 16) {
            float f = fArr3[0];
            float f2 = fArr4[0];
            float f3 = fArr3[1];
            float f4 = fArr4[4];
            float f5 = fArr3[2];
            float f6 = fArr4[8];
            float f7 = f5 * f6;
            float f8 = fArr3[3];
            float f9 = fArr4[12];
            float f10 = f8 * f9;
            float f11 = f10 + f7 + (f3 * f4) + (f * f2);
            float f12 = fArr4[1];
            float f13 = fArr4[5];
            float f14 = fArr4[9];
            float f15 = f5 * f14;
            float f16 = fArr4[13];
            float f17 = f8 * f16;
            float f18 = f17 + f15 + (f3 * f13) + (f * f12);
            float f19 = fArr4[2];
            float f20 = fArr4[6];
            float f21 = fArr4[10];
            float f22 = f5 * f21;
            float f23 = fArr4[14];
            float f24 = f8 * f23;
            float f25 = f24 + f22 + (f3 * f20) + (f * f19);
            float f26 = fArr4[3];
            float f27 = fArr4[7];
            float f28 = fArr4[11];
            float f29 = f5 * f28;
            float f30 = fArr4[15];
            float f31 = f8 * f30;
            float f32 = f31 + f29 + (f3 * f27) + (f * f26);
            float f33 = fArr3[4];
            float f34 = fArr3[5];
            float f35 = fArr3[6];
            float f36 = (f35 * f6) + (f34 * f4) + (f33 * f2);
            float f37 = fArr3[7];
            float f38 = (f37 * f9) + f36;
            float f39 = (f37 * f16) + (f35 * f14) + (f34 * f13) + (f33 * f12);
            float f40 = (f37 * f23) + (f35 * f21) + (f34 * f20) + (f33 * f19);
            float f41 = f35 * f28;
            float f42 = f37 * f30;
            float f43 = f42 + f41 + (f34 * f27) + (f33 * f26);
            float f44 = fArr3[8];
            float f45 = fArr3[9];
            float f46 = fArr3[10];
            float f47 = (f46 * f6) + (f45 * f4) + (f44 * f2);
            float f48 = fArr3[11];
            float f49 = (f48 * f9) + f47;
            float f50 = (f48 * f16) + (f46 * f14) + (f45 * f13) + (f44 * f12);
            float f51 = (f46 * f21) + (f45 * f20) + (f44 * f19);
            float f52 = f46 * f28;
            float f53 = f48 * f30;
            float f54 = f53 + f52 + (f45 * f27) + (f44 * f26);
            float f55 = fArr3[12];
            float f56 = fArr3[13];
            float f57 = (f4 * f56) + (f2 * f55);
            float f58 = fArr3[14];
            float f59 = (f6 * f58) + f57;
            float f60 = fArr3[15];
            float f61 = f13 * f56;
            float f62 = f14 * f58;
            float f63 = f16 * f60;
            float f64 = f20 * f56;
            float f65 = f21 * f58;
            float f66 = f23 * f60;
            float f67 = f58 * f28;
            float f68 = f60 * f30;
            fArr3[0] = f11;
            fArr3[1] = f18;
            fArr3[2] = f25;
            fArr3[3] = f32;
            fArr3[4] = f38;
            fArr3[5] = f39;
            fArr3[6] = f40;
            fArr3[7] = f43;
            fArr3[8] = f49;
            fArr3[9] = f50;
            fArr3[10] = (f48 * f23) + f51;
            fArr3[11] = f54;
            fArr3[12] = (f9 * f60) + f59;
            fArr3[13] = f63 + f62 + f61 + (f12 * f55);
            fArr3[14] = f66 + f65 + f64 + (f19 * f55);
            fArr3[15] = f68 + f67 + (f56 * f27) + (f55 * f26);
        }
    }

    public static final void h(float[] fArr, float f, float f2) {
        if (fArr.length >= 16) {
            float f3 = (fArr[8] * 0.0f) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
            float f4 = (fArr[9] * 0.0f) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
            float f5 = (fArr[10] * 0.0f) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
            float f6 = fArr[3] * f;
            float f7 = fArr[11] * 0.0f;
            fArr[12] = f3;
            fArr[13] = f4;
            fArr[14] = f5;
            fArr[15] = f7 + (fArr[7] * f2) + f6 + fArr[15];
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eh4)) {
            return false;
        }
        if (!sg3.e(this.a, ((eh4) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        float[] fArr = this.a;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        StringBuilder n = f21.n("\n            |", f, " ", f2, " ");
        n.append(f3);
        n.append(" ");
        n.append(f4);
        n.append("|\n            |");
        n.append(f5);
        n.append(" ");
        n.append(f6);
        n.append(" ");
        n.append(f7);
        n.append(" ");
        n.append(f8);
        n.append("|\n            |");
        n.append(f9);
        n.append(" ");
        n.append(f10);
        n.append(" ");
        n.append(f11);
        n.append(" ");
        n.append(f12);
        n.append("|\n            |");
        n.append(f13);
        n.append(" ");
        n.append(f14);
        n.append(" ");
        n.append(f15);
        n.append(" ");
        n.append(f16);
        n.append("|\n        ");
        return e57.f0(n.toString());
    }
}
