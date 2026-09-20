package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: fm1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fm1 extends AnimatorListenerAdapter {
    public final /* synthetic */ lz5 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ jm1 f;

    public fm1(jm1 jm1, lz5 lz5, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = jm1;
        this.a = lz5;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.b;
        View view = this.c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.e.setListener((Animator.AnimatorListener) null);
        jm1 jm1 = this.f;
        lz5 lz5 = this.a;
        jm1.c(lz5);
        jm1.p.remove(lz5);
        jm1.i();
    }

    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
