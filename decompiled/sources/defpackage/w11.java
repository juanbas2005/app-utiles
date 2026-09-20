package defpackage;

/* renamed from: w11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w11 extends x11 {
    public final t76 e;
    public final t76 f;
    public final float[] g;

    public w11(t76 t76, t76 t762) {
        super(t762, t76, t762, (float[]) null);
        float[] fArr;
        this.e = t76;
        this.f = t762;
        float[] fArr2 = (float[]) f96.A.x;
        t88 t88 = t76.d;
        float[] fArr3 = t76.i;
        t88 t882 = t762.d;
        float[] fArr4 = t762.j;
        if (b96.k(t88, t882)) {
            fArr = b96.J(fArr4, fArr3);
        } else {
            float[] a = t88.a();
            float[] a2 = t882.a();
            t88 t883 = kl8.i;
            fArr = b96.J(!b96.k(t882, t883) ? b96.E(b96.J(b96.i(fArr2, a2, new float[]{0.964212f, 1.0f, 0.825188f}), t762.i)) : fArr4, !b96.k(t88, t883) ? b96.J(b96.i(fArr2, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr3) : fArr3);
        }
        this.g = fArr;
    }

    public final long a(long j) {
        float h = jt0.h(j);
        float g2 = jt0.g(j);
        float e2 = jt0.e(j);
        float d = jt0.d(j);
        p76 p76 = this.e.p;
        float b = (float) p76.b((double) h);
        float b2 = (float) p76.b((double) g2);
        float b3 = (float) p76.b((double) e2);
        float[] fArr = this.g;
        float f2 = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
        float f3 = (fArr[7] * b3) + (fArr[4] * b2) + (fArr[1] * b);
        float f4 = fArr[2] * b;
        float f5 = (fArr[8] * b3) + (fArr[5] * b2) + f4;
        t76 t76 = this.f;
        p76 p762 = t76.m;
        return uq3.b((float) t76.m.b((double) f2), (float) p762.b((double) f3), (float) p762.b((double) f5), d, t76);
    }
}
