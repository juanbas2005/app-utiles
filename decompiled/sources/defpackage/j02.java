package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: j02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class j02 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ j02(n02 n02) {
        this.b = n02;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                ((n02) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((View) ((u98) ((rg4) obj).x).d.getParent()).invalidate();
                return;
        }
    }

    public /* synthetic */ j02(rg4 rg4, View view) {
        this.b = rg4;
    }
}
