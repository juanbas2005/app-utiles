package defpackage;

/* renamed from: w17  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w17 {
    public float a;
    public double b;
    public float c;

    public final long a(float f, float f2, long j) {
        double d;
        double d2;
        double exp;
        double exp2;
        float f3 = f2;
        float f4 = f - this.a;
        double d3 = ((double) j) / 1000.0d;
        float f5 = this.c;
        double d4 = ((double) f5) * ((double) f5);
        double d5 = this.b;
        double d6 = ((double) (-f5)) * d5;
        if (f5 > 1.0f) {
            double sqrt = Math.sqrt(d4 - 1.0d) * d5;
            double d7 = d6 + sqrt;
            double d8 = d6 - sqrt;
            double d9 = (double) f4;
            double d10 = ((d8 * d9) - ((double) f3)) / (d8 - d7);
            double d11 = d9 - d10;
            double d12 = d8 * d3;
            double d13 = d3 * d7;
            d = (Math.exp(d13) * d10) + (Math.exp(d12) * d11);
            exp = Math.exp(d12) * d11 * d8;
            exp2 = Math.exp(d13) * d10 * d7;
        } else if (f5 == 1.0f) {
            double d14 = (double) f3;
            double d15 = (double) f4;
            double d16 = (d5 * d15) + d14;
            double d17 = (-d5) * d3;
            double d18 = (d3 * d16) + d15;
            d = Math.exp(d17) * d18;
            exp = Math.exp(d17) * d18 * (-this.b);
            exp2 = Math.exp(d17) * d16;
        } else {
            double sqrt2 = Math.sqrt(1.0d - d4) * d5;
            double d19 = (double) f4;
            double d20 = (((-d6) * d19) + ((double) f3)) * (1.0d / sqrt2);
            double d21 = sqrt2 * d3;
            double d22 = d3 * d6;
            d = ((Math.sin(d21) * d20) + (Math.cos(d21) * d19)) * Math.exp(d22);
            double cos = Math.cos(d21) * sqrt2 * d20;
            d2 = ((cos + (Math.sin(d21) * (-sqrt2) * d19)) * Math.exp(d22)) + (d6 * d);
            long floatToRawIntBits = (long) Float.floatToRawIntBits((float) (d + ((double) this.a)));
            return (((long) Float.floatToRawIntBits((float) d2)) & 4294967295L) | (floatToRawIntBits << 32);
        }
        d2 = exp2 + exp;
        long floatToRawIntBits2 = (long) Float.floatToRawIntBits((float) (d + ((double) this.a)));
        return (((long) Float.floatToRawIntBits((float) d2)) & 4294967295L) | (floatToRawIntBits2 << 32);
    }
}
