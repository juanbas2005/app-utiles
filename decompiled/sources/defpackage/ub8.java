package defpackage;

import android.os.Build;

/* renamed from: ub8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ub8 implements tb8 {
    public final up1 b;

    public ub8() {
        up1 up1;
        if (Build.VERSION.SDK_INT >= 34) {
            up1 = vp1.w;
        } else {
            up1 = g22.z;
        }
        this.b = up1;
        sg3.f(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
