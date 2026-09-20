package defpackage;

/* renamed from: v17  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v17 {
    public double a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public final pj j;

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, pj] */
    public v17() {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new Object();
    }

    public final void a(float f2) {
        if (f2 >= 0.0f) {
            this.b = (double) f2;
            this.c = false;
            return;
        }
        h.q("Damping ratio must be non-negative");
    }

    public final void b(float f2) {
        if (f2 > 0.0f) {
            this.a = Math.sqrt((double) f2);
            this.c = false;
            return;
        }
        h.q("Spring stiffness constant must be positive.");
    }

    public final pj c(double d2, double d3, long j2) {
        double d4;
        double d5;
        if (!this.c) {
            if (this.i != Double.MAX_VALUE) {
                double d6 = this.b;
                if (d6 > 1.0d) {
                    double d7 = this.a;
                    this.f = (Math.sqrt((d6 * d6) - 1.0d) * d7) + ((-d6) * d7);
                    double d8 = this.b;
                    double d9 = this.a;
                    this.g = ((-d8) * d9) - (Math.sqrt((d8 * d8) - 1.0d) * d9);
                } else if (d6 >= 0.0d && d6 < 1.0d) {
                    this.h = Math.sqrt(1.0d - (d6 * d6)) * this.a;
                }
                this.c = true;
            } else {
                h.s("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
        }
        double d10 = ((double) j2) / 1000.0d;
        double d11 = d2 - this.i;
        double d12 = this.b;
        int i2 = (d12 > 1.0d ? 1 : (d12 == 1.0d ? 0 : -1));
        if (i2 > 0) {
            double d13 = this.g;
            double d14 = ((d13 * d11) - d3) / (d13 - this.f);
            double d15 = d11 - d14;
            d4 = (Math.pow(2.718281828459045d, this.f * d10) * d14) + (Math.pow(2.718281828459045d, d13 * d10) * d15);
            double d16 = this.g;
            double pow = Math.pow(2.718281828459045d, d16 * d10) * d15 * d16;
            double d17 = this.f;
            d5 = (Math.pow(2.718281828459045d, d17 * d10) * d14 * d17) + pow;
        } else if (i2 == 0) {
            double d18 = this.a;
            double d19 = (d18 * d11) + d3;
            double d20 = (d19 * d10) + d11;
            double pow2 = Math.pow(2.718281828459045d, (-d18) * d10) * d20;
            double pow3 = Math.pow(2.718281828459045d, (-this.a) * d10) * d20;
            double d21 = -this.a;
            d5 = (Math.pow(2.718281828459045d, d21 * d10) * d19) + (pow3 * d21);
            d4 = pow2;
        } else {
            double d22 = 1.0d / this.h;
            double d23 = this.a;
            double d24 = ((d12 * d23 * d11) + d3) * d22;
            d4 = ((Math.sin(this.h * d10) * d24) + (Math.cos(this.h * d10) * d11)) * Math.pow(2.718281828459045d, (-d12) * d23 * d10);
            double d25 = this.a;
            double d26 = this.b;
            double d27 = (-d25) * d4 * d26;
            double pow4 = Math.pow(2.718281828459045d, (-d26) * d25 * d10);
            double d28 = this.h;
            double d29 = pow4;
            double sin = Math.sin(d28 * d10) * (-d28) * d11;
            double d30 = this.h;
            d5 = (((Math.cos(d30 * d10) * d24 * d30) + sin) * d29) + d27;
        }
        pj pjVar = this.j;
        pjVar.w = (float) (d4 + this.i);
        pjVar.x = (float) d5;
        return pjVar;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, pj] */
    public v17(float f2) {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.j = new Object();
        this.i = (double) f2;
    }
}
