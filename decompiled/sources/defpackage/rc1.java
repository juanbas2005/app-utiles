package defpackage;

/* renamed from: rc1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rc1 implements i12 {
    public final float A;
    public final float B;
    public final float w;
    public final float x;
    public final float y;
    public final float z;

    public rc1(float f, float f2, float f3, float f4) {
        boolean z2;
        int i;
        float f5 = f;
        float f6 = f2;
        float f7 = f3;
        float f8 = f4;
        this.w = f5;
        this.x = f6;
        this.y = f7;
        this.z = f8;
        if (Float.isNaN(f5) || Float.isNaN(f6) || Float.isNaN(f7) || Float.isNaN(f8)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            StringBuilder n = f21.n("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", f5, ", ", f6, ", ");
            n.append(f7);
            n.append(", ");
            n.append(f8);
            n.append(".");
            xm5.a(n.toString());
        }
        float[] fArr = new float[5];
        float f9 = (f6 - 0.0f) * 3.0f;
        float f10 = (f8 - f6) * 3.0f;
        float f11 = (1.0f - f8) * 3.0f;
        double d = (double) f9;
        double d2 = (double) f10;
        float f12 = f10;
        double d3 = (double) f11;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 != 0.0d) {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int D0 = bb0.D0((float) ((-(d6 + d7)) / d5), fArr, 0);
            int D02 = bb0.D0((float) ((d6 - d7) / d5), fArr, D0) + D0;
            if (D02 > 1) {
                float f13 = fArr[0];
                float f14 = fArr[1];
                if (f13 > f14) {
                    fArr[0] = f14;
                    fArr[1] = f13;
                } else if (f13 == f14) {
                    i = D02 - 1;
                }
            }
            i = D02;
        } else if (d2 == d3) {
            i = 0;
        } else {
            i = bb0.D0((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        }
        float f15 = (f12 - f9) * 2.0f;
        int D03 = bb0.D0((-f15) / (((f11 - f12) * 2.0f) - f15), fArr, i) + i;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i2 = 0; i2 < D03; i2++) {
            float f16 = fArr[i2];
            float f17 = (((((((((f6 - f8) * 3.0f) + 1.0f) - 0.0f) * f16) + (((f8 - (f6 * 2.0f)) + 0.0f) * 3.0f)) * f16) + f9) * f16) + 0.0f;
            min = Math.min(min, f17);
            max = Math.max(max, f17);
        }
        long a = mh2.a(min, max);
        this.A = Float.intBitsToFloat((int) (a >> 32));
        this.B = Float.intBitsToFloat((int) (a & 4294967295L));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0206, code lost:
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0236, code lost:
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01bb, code lost:
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L_0x0238;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0261  */
    public final float b(float f) {
        boolean isNaN;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11 = f;
        if (f11 <= 0.0f || f11 >= 1.0f) {
            return f11;
        }
        float max = Math.max(f11, 1.1920929E-7f);
        float f12 = 0.0f - max;
        float f13 = this.w;
        float f14 = f13 - max;
        float f15 = this.y;
        float f16 = f15 - max;
        double d = (double) f12;
        float f17 = 0.0f;
        double d2 = ((double) (f14 - f12)) * 3.0d;
        double d3 = ((d - (((double) f14) * 2.0d)) + ((double) f16)) * 3.0d;
        double d4 = (((double) (f14 - f16)) * 3.0d) + ((double) (-f12)) + ((double) (1.0f - max));
        float f18 = Float.NaN;
        if (Math.abs(d4 - 0.0d) >= 1.0E-7d) {
            double d5 = d3 / d4;
            double d6 = d2 / d4;
            double d7 = d / d4;
            double d8 = ((d6 * 3.0d) - (d5 * d5)) / 9.0d;
            double d9 = ((d7 * 27.0d) + ((((2.0d * d5) * d5) * d5) - ((9.0d * d5) * d6))) / 54.0d;
            double d10 = d8 * d8 * d8;
            double d11 = (d9 * d9) + d10;
            double d12 = d5 / 3.0d;
            int i = (d11 > 0.0d ? 1 : (d11 == 0.0d ? 0 : -1));
            if (i < 0) {
                double sqrt = Math.sqrt(-d10);
                double d13 = (-d9) / sqrt;
                if (d13 < -1.0d) {
                    d13 = -1.0d;
                }
                if (d13 > 1.0d) {
                    d13 = 1.0d;
                }
                double acos = Math.acos(d13);
                double k = (double) (we.k((float) sqrt) * 2.0f);
                float cos = (float) ((Math.cos(acos / 3.0d) * k) - d12);
                if (cos < 0.0f) {
                    f6 = 0.0f;
                } else {
                    f6 = cos;
                }
                if (f6 > 1.0f) {
                    f6 = 1.0f;
                }
                if (Math.abs(f6 - cos) > 1.05E-6f) {
                    f6 = Float.NaN;
                }
                if (Float.isNaN(f6)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * k) - d12);
                    if (cos2 < 0.0f) {
                        f7 = 0.0f;
                    } else {
                        f7 = cos2;
                    }
                    if (f7 > 1.0f) {
                        f7 = 1.0f;
                    }
                    if (Math.abs(f7 - cos2) > 1.05E-6f) {
                        f7 = Float.NaN;
                    }
                    if (Float.isNaN(f6)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * k) - d12);
                        if (cos3 >= 0.0f) {
                            f17 = cos3;
                        }
                        if (f17 > 1.0f) {
                            f8 = 1.0f;
                        } else {
                            f8 = f17;
                        }
                    }
                }
                f18 = f6;
                isNaN = Float.isNaN(f18);
                float f19 = this.z;
                float f20 = this.x;
                if (!isNaN) {
                }
            } else if (i == 0) {
                float f21 = -we.k((float) d9);
                float f22 = (float) d12;
                float f23 = (f21 * 2.0f) - f22;
                if (f23 < 0.0f) {
                    f4 = 0.0f;
                } else {
                    f4 = f23;
                }
                if (f4 > 1.0f) {
                    f4 = 1.0f;
                }
                if (Math.abs(f4 - f23) > 1.05E-6f) {
                    f4 = Float.NaN;
                }
                if (!Float.isNaN(f4)) {
                    f18 = f4;
                } else {
                    float f24 = (-f21) - f22;
                    if (f24 >= 0.0f) {
                        f17 = f24;
                    }
                    if (f17 > 1.0f) {
                        f5 = 1.0f;
                    } else {
                        f5 = f17;
                    }
                }
                isNaN = Float.isNaN(f18);
                float f192 = this.z;
                float f202 = this.x;
                if (!isNaN) {
                }
            } else {
                double sqrt2 = Math.sqrt(d11);
                float k2 = (float) (((double) (we.k((float) ((-d9) + sqrt2)) - we.k((float) (d9 + sqrt2)))) - d12);
                if (k2 >= 0.0f) {
                    f17 = k2;
                }
                if (f17 > 1.0f) {
                    f3 = 1.0f;
                } else {
                    f3 = f17;
                }
            }
        } else if (Math.abs(d3 - 0.0d) < 1.0E-7d) {
            if (Math.abs(d2 - 0.0d) >= 1.0E-7d) {
                float f25 = (float) ((-d) / d2);
                if (f25 >= 0.0f) {
                    f17 = f25;
                }
                if (f17 > 1.0f) {
                    f2 = 1.0f;
                } else {
                    f2 = f17;
                }
            }
            isNaN = Float.isNaN(f18);
            float f1922 = this.z;
            float f2022 = this.x;
            if (!isNaN) {
                float f26 = ((((((f2022 - f1922) + 0.33333334f) * f18) + (f1922 - (2.0f * f2022))) * f18) + f2022) * 3.0f * f18;
                float f27 = this.A;
                if (f26 < f27) {
                    f26 = f27;
                }
                float f28 = this.B;
                if (f26 > f28) {
                    return f28;
                }
                return f26;
            }
            StringBuilder n = f21.n("The cubic curve with parameters (", f13, ", ", f2022, ", ");
            n.append(f15);
            n.append(", ");
            n.append(f1922);
            n.append(") has no solution at ");
            n.append(f11);
            throw new IllegalArgumentException(n.toString());
        } else {
            double sqrt3 = Math.sqrt((d2 * d2) - ((4.0d * d3) * d));
            double d14 = d3 * 2.0d;
            float f29 = (float) ((sqrt3 - d2) / d14);
            if (f29 < 0.0f) {
                f9 = 0.0f;
            } else {
                f9 = f29;
            }
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            if (Math.abs(f9 - f29) > 1.05E-6f) {
                f9 = Float.NaN;
            }
            if (!Float.isNaN(f9)) {
                f18 = f9;
            } else {
                float f30 = (float) (((-d2) - sqrt3) / d14);
                if (f30 >= 0.0f) {
                    f17 = f30;
                }
                if (f17 > 1.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = f17;
                }
            }
            isNaN = Float.isNaN(f18);
            float f19222 = this.z;
            float f20222 = this.x;
            if (!isNaN) {
            }
        }
        f18 = f2;
        isNaN = Float.isNaN(f18);
        float f192222 = this.z;
        float f202222 = this.x;
        if (!isNaN) {
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rc1)) {
            return false;
        }
        rc1 rc1 = (rc1) obj;
        if (this.w == rc1.w && this.x == rc1.x && this.y == rc1.y && this.z == rc1.z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.z) + f21.d(this.y, f21.d(this.x, Float.hashCode(this.w) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder n = f21.n("CubicBezierEasing(a=", this.w, ", b=", this.x, ", c=");
        n.append(this.y);
        n.append(", d=");
        n.append(this.z);
        n.append(")");
        return n.toString();
    }
}
