package defpackage;

import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: fa8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fa8 extends ga8 {
    public final WindowInsetsAnimation e;

    public fa8(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, (Interpolator) null, 0);
        this.e = windowInsetsAnimation;
    }

    public final long a() {
        return this.e.getDurationMillis();
    }

    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    public final int c() {
        return this.e.getTypeMask();
    }

    public final void d(float f) {
        this.e.setFraction(f);
    }
}
