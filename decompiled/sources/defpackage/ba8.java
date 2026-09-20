package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* renamed from: ba8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ba8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ha8 a;
    public final /* synthetic */ db8 b;
    public final /* synthetic */ db8 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public ba8(ha8 ha8, db8 db8, db8 db82, int i, View view) {
        this.a = ha8;
        this.b = db8;
        this.c = db82;
        this.d = i;
        this.e = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        qa8 qa8;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ha8 ha8 = this.a;
        ga8 ga8 = ha8.a;
        ga8.d(animatedFraction);
        float b2 = ga8.b();
        PathInterpolator pathInterpolator = da8.e;
        int i = Build.VERSION.SDK_INT;
        db8 db8 = this.b;
        if (i >= 36) {
            qa8 = new pa8(db8);
        } else if (i >= 35) {
            qa8 = new oa8(db8);
        } else if (i >= 34) {
            qa8 = new na8(db8);
        } else if (i >= 31) {
            qa8 = new ma8(db8);
        } else if (i >= 30) {
            qa8 = new la8(db8);
        } else if (i >= 29) {
            qa8 = new ka8(db8);
        } else {
            qa8 = new ia8(db8);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            za8 za8 = db8.a;
            if (i3 == 0) {
                qa8.d(i2, za8.h(i2));
            } else {
                ad3 h = za8.h(i2);
                ad3 h2 = this.c.a.h(i2);
                float f = 1.0f - b2;
                qa8.d(i2, db8.e(h, (int) (((double) (((float) (h.a - h2.a)) * f)) + 0.5d), (int) (((double) (((float) (h.b - h2.b)) * f)) + 0.5d), (int) (((double) (((float) (h.c - h2.c)) * f)) + 0.5d), (int) (((double) (((float) (h.d - h2.d)) * f)) + 0.5d)));
            }
        }
        da8.g(this.e, qa8.b(), Collections.singletonList(ha8));
    }
}
