package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: vb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vb2 extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ wb2 b;

    public vb2(wb2 wb2) {
        this.b = wb2;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        wb2 wb2 = this.b;
        if (((Float) wb2.z.getAnimatedValue()).floatValue() == 0.0f) {
            wb2.A = 0;
            wb2.f(0);
            return;
        }
        wb2.A = 2;
        wb2.s.invalidate();
    }
}
