package defpackage;

/* renamed from: qh2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qh2 implements ih2 {
    public final float a;
    public final w17 b;

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, w17] */
    public qh2(float f, float f2, float f3) {
        this.a = f3;
        ? obj = new Object();
        obj.a = 1.0f;
        obj.b = Math.sqrt(50.0d);
        obj.c = 1.0f;
        if (f < 0.0f) {
            xm5.a("Damping ratio must be non-negative");
        }
        obj.c = f;
        double d = obj.b;
        if (((float) (d * d)) <= 0.0f) {
            xm5.a("Spring stiffness constant must be positive.");
        }
        obj.b = Math.sqrt((double) f2);
        this.b = obj;
    }

    public final float b(long j, float f, float f2, float f3) {
        w17 w17 = this.b;
        w17.a = f2;
        return Float.intBitsToFloat((int) (w17.a(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0132  */
    public final long c(float f, float f2, float f3) {
        long j;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        w17 w17 = this.b;
        double d7 = w17.b;
        float f4 = (float) (d7 * d7);
        float f5 = w17.c;
        float f6 = this.a;
        float f7 = (f - f2) / f6;
        float f8 = f3 / f6;
        if (f5 == 0.0f) {
            j = 9223372036854L;
        } else {
            double d8 = (double) f4;
            double d9 = (double) f5;
            double d10 = (double) f8;
            double d11 = (double) f7;
            double sqrt = Math.sqrt(d8) * d9 * 2.0d;
            double d12 = (sqrt * sqrt) - (d8 * 4.0d);
            int i = (d12 > 0.0d ? 1 : (d12 == 0.0d ? 0 : -1));
            if (i < 0) {
                d = 0.0d;
            } else {
                d = Math.sqrt(d12);
            }
            if (i < 0) {
                d2 = Math.sqrt(Math.abs(d12));
            } else {
                d2 = 0.0d;
            }
            double d13 = -sqrt;
            double d14 = (d13 + d) * 0.5d;
            double d15 = d2 * 0.5d;
            double d16 = (d13 - d) * 0.5d;
            int i2 = (d11 > 0.0d ? 1 : (d11 == 0.0d ? 0 : -1));
            if (i2 == 0 && d10 == 0.0d) {
                j = 0;
            } else {
                if (i2 < 0) {
                    d10 = -d10;
                }
                double abs = Math.abs(d11);
                double d17 = 1.0d;
                double d18 = -1.0d;
                double d19 = Double.MAX_VALUE;
                if (d9 > 1.0d) {
                    double d20 = (d14 * abs) - d10;
                    double d21 = d14 - d16;
                    double d22 = d20 / d21;
                    double d23 = abs - d22;
                    d3 = Math.log(Math.abs(1.0d / d23)) / d14;
                    double log = Math.log(Math.abs(1.0d / d22)) / d16;
                    if ((Double.doubleToRawLongBits(d3) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        d3 = log;
                    } else if ((Double.doubleToRawLongBits(log) & Long.MAX_VALUE) < 9218868437227405312L) {
                        d3 = Math.max(d3, log);
                    }
                    double d24 = d23 * d14;
                    double log2 = Math.log(d24 / ((-d22) * d16)) / (d16 - d14);
                    if (!Double.isNaN(log2) && log2 > 0.0d) {
                        if (log2 > 0.0d) {
                            if ((-((Math.exp(log2 * d16) * d22) + (Math.exp(d14 * log2) * d23))) < 1.0d) {
                                if (d22 <= 0.0d || d23 >= 0.0d) {
                                    d6 = d3;
                                } else {
                                    d6 = 0.0d;
                                }
                                d3 = d6;
                            }
                        }
                        d3 = Math.log((-((d22 * d16) * d16)) / (d24 * d14)) / d21;
                        d5 = d22 * d16;
                        if (Math.abs((Math.exp(d16 * d3) * d5) + (Math.exp(d14 * d3) * d24)) >= 1.0E-4d) {
                            int i3 = 0;
                            while (d19 > 0.001d && i3 < 100) {
                                i3++;
                                double d25 = d14 * d3;
                                double d26 = d16 * d3;
                                double exp = d3 - ((((Math.exp(d26) * d22) + (Math.exp(d25) * d23)) + d17) / ((Math.exp(d26) * d5) + (Math.exp(d25) * d24)));
                                d19 = Math.abs(d3 - exp);
                                d3 = exp;
                            }
                        }
                    }
                    d17 = -1.0d;
                    d5 = d22 * d16;
                    if (Math.abs((Math.exp(d16 * d3) * d5) + (Math.exp(d14 * d3) * d24)) >= 1.0E-4d) {
                    }
                } else if (d9 < 1.0d) {
                    double d27 = (d10 - (d14 * abs)) / d15;
                    d3 = Math.log(1.0d / Math.sqrt((d27 * d27) + (abs * abs))) / d14;
                } else {
                    double d28 = d14 * abs;
                    double d29 = d10 - d28;
                    double log3 = Math.log(Math.abs(1.0d / abs)) / d14;
                    double log4 = Math.log(Math.abs(1.0d / d29));
                    double d30 = log4;
                    for (int i4 = 0; i4 < 6; i4++) {
                        d30 = log4 - Math.log(Math.abs(d30 / d14));
                    }
                    double d31 = d30 / d14;
                    if ((Double.doubleToRawLongBits(log3) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        log3 = d31;
                    } else if ((Double.doubleToRawLongBits(d31) & Long.MAX_VALUE) < 9218868437227405312L) {
                        log3 = Math.max(log3, d31);
                    }
                    double d32 = (-(d28 + d29)) / (d14 * d29);
                    double d33 = d14 * d32;
                    double exp2 = (Math.exp(d33) * d29 * d32) + (Math.exp(d33) * abs);
                    if (!Double.isNaN(d32) && d32 > 0.0d) {
                        if (d32 <= 0.0d || (-exp2) >= 1.0d) {
                            log3 = (-(2.0d / d14)) - (abs / d29);
                            d18 = 1.0d;
                        } else {
                            if (d29 >= 0.0d || abs <= 0.0d) {
                                d4 = log3;
                            } else {
                                d4 = 0.0d;
                            }
                            log3 = d4;
                        }
                    }
                    double d34 = log3;
                    int i5 = 0;
                    while (d19 > 0.001d && i5 < 100) {
                        i5++;
                        double d35 = d14 * d3;
                        double exp3 = d3 - (((Math.exp(d35) * ((d29 * d3) + abs)) + d18) / (Math.exp(d35) * (((d35 + 1.0d) * d29) + d28)));
                        d19 = Math.abs(d3 - exp3);
                        d34 = exp3;
                    }
                }
                j = (long) (d3 * 1000.0d);
            }
        }
        return j * 1000000;
    }

    public final float d(float f, float f2, float f3) {
        return 0.0f;
    }

    public final float e(long j, float f, float f2, float f3) {
        w17 w17 = this.b;
        w17.a = f2;
        return Float.intBitsToFloat((int) (w17.a(f, f3, j / 1000000) >> 32));
    }
}
