package defpackage;

/* renamed from: gc0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gc0 implements fc0 {
    public final float a(float f, float f2, float f3) {
        boolean z;
        float abs = Math.abs((f2 + f) - f);
        if (abs <= f3) {
            z = true;
        } else {
            z = false;
        }
        float f4 = (0.3f * f3) - (0.0f * abs);
        float f5 = f3 - f4;
        if (z && f5 < abs) {
            f4 = f3 - abs;
        }
        return f - f4;
    }
}
