package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: ha8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ha8 {
    public ga8 a;

    public ha8(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new fa8(bn6.j(i, interpolator, j));
        } else {
            this.a = new ga8(i, interpolator, j);
        }
    }
}
