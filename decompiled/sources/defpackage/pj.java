package defpackage;

/* renamed from: pj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pj implements lh2 {
    public float w;
    public float x;

    public pj(int i) {
        switch (i) {
            case 4:
                return;
            default:
                this.w = Math.max(1.0E-7f, Math.abs(0.1f));
                this.x = Math.max(1.0E-4f, 1.0f) * -4.2f;
                return;
        }
    }

    public float N(float f, long j) {
        return f * ((float) Math.exp((double) ((((float) (j / 1000000)) / 1000.0f) * this.x)));
    }

    public float Q(float f, float f2, long j) {
        float f3 = this.x;
        return ((f2 / f3) * ((float) Math.exp((double) ((f3 * ((float) (j / 1000000))) / 1000.0f)))) + (f - (f2 / f3));
    }

    public fh2 a(float f) {
        double b = b(f);
        double d = (double) gh2.a;
        double d2 = d - 1.0d;
        return new fh2(f, (float) (Math.exp((d / d2) * b) * ((double) (this.w * this.x))), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = cg.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.w * this.x)));
    }

    public float c(qc1 qc1) {
        qc1.getClass();
        float a = qc1.a();
        float f = this.w;
        float b = qc1.b();
        float f2 = this.x;
        float a2 = j18.a(a - f, b - f2);
        float[] fArr = qc1.a;
        float a3 = a2 - j18.a(fArr[0] - f, fArr[1] - f2);
        float f3 = j18.c;
        float d = j18.d(a3, f3);
        if (d > f3 - 1.0E-4f) {
            return 0.0f;
        }
        return d;
    }

    public long f0(float f) {
        return ((long) ((((float) Math.log((double) (this.w / Math.abs(f)))) * 1000.0f) / this.x)) * 1000000;
    }

    public float k0(float f, float f2) {
        float abs = Math.abs(f2);
        float f3 = this.w;
        if (abs <= f3) {
            return f;
        }
        double log = Math.log((double) Math.abs(f3 / f2));
        float f4 = this.x;
        return ((f2 / f4) * ((float) Math.exp((((double) f4) * ((log / ((double) f4)) * 1000.0d)) / 1000.0d))) + (f - (f2 / f4));
    }

    public float z() {
        return this.w;
    }

    public pj(float f, float f2) {
        this.w = f;
        this.x = f2;
    }
}
