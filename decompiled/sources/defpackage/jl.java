package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: jl  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class jl {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final sb2 b = new sb2(sb2.d);
    public static final sb2 c = new sb2();
    public static final sb2 d = new sb2(sb2.e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f, float f2, float f3) {
        return b81.d(f2, f, f3, f);
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        if (f5 >= f4) {
            return f2;
        }
        return a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(float f, int i, int i2) {
        return Math.round(f * ((float) (i2 - i))) + i;
    }
}
