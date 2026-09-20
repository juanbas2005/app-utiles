package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* renamed from: gw2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gw2 extends EdgeEffect {
    public final float a;
    public float b;

    public gw2(Context context) {
        super(context);
        this.a = rj1.f(context).w * 1.0f;
    }

    public final void onAbsorb(int i) {
        this.b = 0.0f;
        super.onAbsorb(i);
    }

    public final void onPull(float f, float f2) {
        this.b = 0.0f;
        super.onPull(f, f2);
    }

    public final void onRelease() {
        this.b = 0.0f;
        super.onRelease();
    }

    public final void onPull(float f) {
        this.b = 0.0f;
        super.onPull(f);
    }
}
