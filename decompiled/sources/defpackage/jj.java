package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* renamed from: jj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jj implements g58 {
    public final ViewConfiguration a;

    public jj(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    public final long a() {
        return (long) ViewConfiguration.getDoubleTapTimeout();
    }

    public final long b() {
        return (long) ViewConfiguration.getLongPressTimeout();
    }

    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return (float) this.a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    public final float e() {
        return (float) this.a.getScaledMaximumFlingVelocity();
    }

    public final float f() {
        return (float) this.a.getScaledTouchSlop();
    }

    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return (float) this.a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
