package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: gm1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gm1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ hm1 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ jm1 e;

    public /* synthetic */ gm1(jm1 jm1, hm1 hm1, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = jm1;
        this.b = hm1;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        hm1 hm1 = this.b;
        jm1 jm1 = this.e;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        switch (i) {
            case b85.b:
                viewPropertyAnimator.setListener((Animator.AnimatorListener) null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                jm1.c(hm1.a);
                jm1.r.remove(hm1.a);
                jm1.i();
                return;
            default:
                viewPropertyAnimator.setListener((Animator.AnimatorListener) null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                jm1.c(hm1.b);
                jm1.r.remove(hm1.b);
                jm1.i();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case b85.b:
                this.e.getClass();
                return;
            default:
                this.e.getClass();
                return;
        }
    }
}
