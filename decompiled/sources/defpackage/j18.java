package defpackage;

/* renamed from: j18  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class j18 {
    public static final long a = mh2.a(0.0f, 0.0f);
    public static final float b = 3.1415927f;
    public static final float c = 6.2831855f;

    public static final float a(float f, float f2) {
        float f3 = c;
        return (((float) Math.atan2((double) f2, (double) f)) + f3) % f3;
    }

    public static final long b(float f, float f2) {
        float sqrt = (float) Math.sqrt((double) ((f2 * f2) + (f * f)));
        if (sqrt > 0.0f) {
            return mh2.a(f / sqrt, f2 / sqrt);
        }
        h.q("Required distance greater than zero");
        return 0;
    }

    public static final float c(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final float d(float f, float f2) {
        return ((f % f2) + f2) % f2;
    }

    public static long e(float f, float f2) {
        double d = (double) f2;
        return jb5.D(jb5.H(f, mh2.a((float) Math.cos(d), (float) Math.sin(d))), a);
    }
}
