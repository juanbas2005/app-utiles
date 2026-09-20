package defpackage;

import android.animation.ValueAnimator;

/* renamed from: bl  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class bl implements ValueAnimator.DurationScaleChangeListener {
    public final /* synthetic */ qc3 a;

    public /* synthetic */ bl(qc3 qc3) {
        this.a = qc3;
    }

    public final void onChanged(float f) {
        ((dl) this.a.y).g = f;
    }
}
