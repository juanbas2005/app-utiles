package defpackage;

/* renamed from: x11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class x11 {
    public final tt0 a;
    public final tt0 b;
    public final tt0 c;
    public final float[] d;

    /* JADX WARNING: Illegal instructions before constructor call */
    public x11(tt0 tt0, tt0 tt02, int i) {
        this(tt02, r0, r1, r4);
        tt0 tt03;
        tt0 tt04;
        float[] fArr;
        float[] fArr2;
        if (dh4.m(tt0.b, 12884901888L)) {
            tt03 = b96.f(tt0);
        } else {
            tt03 = tt0;
        }
        if (dh4.m(tt02.b, 12884901888L)) {
            tt04 = b96.f(tt02);
        } else {
            tt04 = tt02;
        }
        float[] fArr3 = kl8.l;
        if (i == 3) {
            boolean m = dh4.m(tt0.b, 12884901888L);
            boolean m2 = dh4.m(tt02.b, 12884901888L);
            if ((!m || !m2) && (m || m2)) {
                t88 t88 = ((t76) (!m ? tt02 : tt0)).d;
                if (m) {
                    fArr2 = t88.a();
                } else {
                    fArr2 = fArr3;
                }
                fArr3 = m2 ? t88.a() : fArr3;
                fArr = new float[]{fArr2[0] / fArr3[0], fArr2[1] / fArr3[1], fArr2[2] / fArr3[2]};
            }
        }
        fArr = null;
    }

    public long a(long j) {
        float h = jt0.h(j);
        float g = jt0.g(j);
        float e = jt0.e(j);
        float d2 = jt0.d(j);
        tt0 tt0 = this.b;
        long d3 = tt0.d(h, g, e);
        float intBitsToFloat = Float.intBitsToFloat((int) (d3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d3 & 4294967295L));
        float e2 = tt0.e(h, g, e);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.c.f(f, f2, e2, d2, this.a);
    }

    public x11(tt0 tt0, tt0 tt02, tt0 tt03, float[] fArr) {
        this.a = tt0;
        this.b = tt02;
        this.c = tt03;
        this.d = fArr;
    }
}
