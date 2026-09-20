package defpackage;

/* renamed from: qh4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qh4 {
    public final qc1 a;
    public final float b;
    public float c;
    public float d;
    public final /* synthetic */ rh4 e;

    public qh4(rh4 rh4, qc1 qc1, float f, float f2) {
        qc1.getClass();
        this.e = rh4;
        this.a = qc1;
        if (f2 >= f) {
            this.b = rh4.w.c(qc1);
            this.c = f;
            this.d = f2;
            return;
        }
        h.q("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        throw null;
    }

    public final yb5 a(float f) {
        float o = z65.o(f, this.c, this.d);
        float f2 = this.d;
        float f3 = this.c;
        float f4 = (o - f3) / (f2 - f3);
        rh4 rh4 = this.e;
        pj pjVar = rh4.w;
        float f5 = f4 * this.b;
        pjVar.getClass();
        qc1 qc1 = this.a;
        qc1.getClass();
        float[] fArr = qc1.a;
        oj ojVar = new oj(qc1, pjVar, j18.a(fArr[0] - pjVar.w, fArr[1] - pjVar.x), f5);
        float f6 = 0.0f;
        float f7 = 1.0f;
        while (f7 - f6 > 1.0E-5f) {
            float f8 = ((2.0f * f6) + f7) / 3.0f;
            float f9 = ((2.0f * f7) + f6) / 3.0f;
            if (ojVar.a(f8) < ojVar.a(f9)) {
                f7 = f9;
            } else {
                f6 = f8;
            }
        }
        float f10 = (f6 + f7) / 2.0f;
        if (0.0f > f10 || f10 > 1.0f) {
            h.q("Cubic cut point is expected to be between 0 and 1");
            return null;
        }
        yb5 d2 = qc1.d(f10);
        return new yb5(new qh4(rh4, (qc1) d2.w, this.c, o), new qh4(rh4, (qc1) d2.x, o, this.d));
    }

    public final String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.c + " .. " + this.d + "], size=" + this.b + ", cubic=" + this.a + ')';
    }
}
