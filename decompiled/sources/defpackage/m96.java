package defpackage;

/* renamed from: m96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m96 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g = 0.0f;
    public final float h;
    public long i;

    public m96(long j, long j2, long j3, y71 y71) {
        float f2;
        this.a = j;
        this.b = j2;
        this.c = j3;
        long m = jb5.m(jb5.A(j, j2));
        this.d = m;
        long m2 = jb5.m(jb5.A(j3, j2));
        this.e = m2;
        float f3 = y71.a;
        this.f = f3;
        float h2 = jb5.h(m, m2);
        float f4 = j18.b;
        float sqrt = (float) Math.sqrt((double) (1.0f - (h2 * h2)));
        if (((double) sqrt) > 0.001d) {
            f2 = ((h2 + 1.0f) * f3) / sqrt;
        } else {
            f2 = 0.0f;
        }
        this.h = f2;
        this.i = mh2.a(0.0f, 0.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x00be  */
    public static qc1 b(float f2, float f3, long j, long j2, long j3, long j4, long j5, float f4) {
        mh2 mh2;
        long j6;
        float f5 = f3;
        long j7 = j;
        long j8 = j2;
        long j9 = j5;
        long m = jb5.m(jb5.A(j8, j7));
        long D = jb5.D(j7, jb5.H(1.0f + f5, jb5.H(f2, m)));
        long g2 = jb5.g(2.0f, jb5.D(j3, j4));
        long a2 = mh2.a(j18.c(jb5.r(j3), jb5.r(g2), f5), j18.c(jb5.s(j3), jb5.s(g2), f5));
        long D2 = jb5.D(j9, jb5.H(f4, j18.b(jb5.r(a2) - jb5.r(j9), jb5.s(a2) - jb5.s(j9))));
        long A = jb5.A(D2, j9);
        long a3 = mh2.a(-jb5.s(A), jb5.r(A));
        long a4 = mh2.a(-jb5.s(a3), jb5.r(a3));
        float h2 = jb5.h(m, a4);
        if (Math.abs(h2) >= 1.0E-4f) {
            float h3 = jb5.h(jb5.A(D2, j8), a4);
            if (Math.abs(h2) >= Math.abs(h3) * 1.0E-4f) {
                mh2 = new mh2(jb5.D(j8, jb5.H(h3 / h2, m)));
                if (mh2 == null) {
                    j6 = mh2.a;
                } else {
                    j6 = j3;
                }
                long g3 = jb5.g(3.0f, jb5.D(D, jb5.H(2.0f, j6)));
                return new qc1(new float[]{jb5.r(D), jb5.s(D), jb5.r(g3), jb5.s(g3), jb5.r(j6), jb5.s(j6), jb5.r(D2), jb5.s(D2)});
            }
        }
        mh2 = null;
        if (mh2 == null) {
        }
        long g32 = jb5.g(3.0f, jb5.D(D, jb5.H(2.0f, j6)));
        return new qc1(new float[]{jb5.r(D), jb5.s(D), jb5.r(g32), jb5.s(g32), jb5.r(j6), jb5.s(j6), jb5.r(D2), jb5.s(D2)});
    }

    public final float a(float f2) {
        int i2 = (f2 > c() ? 1 : (f2 == c() ? 0 : -1));
        float f3 = this.g;
        if (i2 > 0) {
            return f3;
        }
        float f4 = this.h;
        if (f2 > f4) {
            return ((f2 - f4) * f3) / (c() - f4);
        }
        return 0.0f;
    }

    public final float c() {
        return (1.0f + this.g) * this.h;
    }
}
