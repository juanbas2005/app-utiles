package defpackage;

/* renamed from: dd6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dd6 {
    public final float a;
    public final float b;
    public float c = 0.0f;
    public float d = 0.0f;
    public boolean e = false;

    public dd6(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        double sqrt = Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
        if (sqrt != 0.0d) {
            this.c = (float) (((double) f3) / sqrt);
            this.d = (float) (((double) f4) / sqrt);
        }
    }

    public final void a(float f, float f2) {
        float f3 = f - this.a;
        float f4 = f2 - this.b;
        double sqrt = Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
        if (sqrt != 0.0d) {
            f3 = (float) (((double) f3) / sqrt);
            f4 = (float) (((double) f4) / sqrt);
        }
        float f5 = this.c;
        if (f3 == (-f5) && f4 == (-this.d)) {
            this.e = true;
            this.c = -f4;
            this.d = f3;
            return;
        }
        this.c = f5 + f3;
        this.d += f4;
    }

    public final void b(dd6 dd6) {
        float f = dd6.c;
        float f2 = this.c;
        if (f == (-f2)) {
            float f3 = dd6.d;
            if (f3 == (-this.d)) {
                this.e = true;
                this.c = -f3;
                this.d = dd6.c;
                return;
            }
        }
        this.c = f2 + f;
        this.d += dd6.d;
    }

    public final String toString() {
        return "(" + this.a + "," + this.b + " " + this.c + "," + this.d + ")";
    }
}
