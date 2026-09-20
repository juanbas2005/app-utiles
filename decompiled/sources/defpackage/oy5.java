package defpackage;

import android.view.animation.Interpolator;

/* renamed from: oy5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oy5 implements Interpolator {
    public final /* synthetic */ int a;

    public /* synthetic */ oy5(int i) {
        this.a = i;
    }

    public final float getInterpolation(float f) {
        switch (this.a) {
        }
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
