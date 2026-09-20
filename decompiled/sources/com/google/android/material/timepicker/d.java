package com.google.android.material.timepicker;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ClockHandView a;

    public /* synthetic */ d(ClockHandView clockHandView) {
        this.a = clockHandView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = ClockHandView.J;
        this.a.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
