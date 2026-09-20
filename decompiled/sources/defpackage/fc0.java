package defpackage;

/* renamed from: fc0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface fc0 {
    public static final ec0 a = ec0.a;

    float a(float f, float f2, float f3) {
        a.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        if (Math.abs(f) < Math.abs(f5)) {
            return f;
        }
        return f5;
    }
}
