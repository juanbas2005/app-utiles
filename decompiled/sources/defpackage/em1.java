package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: em1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class em1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ lz5 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ jm1 e;

    public em1(jm1 jm1, lz5 lz5, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = jm1;
        this.b = lz5;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        lz5 lz5 = this.b;
        jm1 jm1 = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (i) {
            case b85.b:
                viewPropertyAnimator.setListener((Animator.AnimatorListener) null);
                this.c.setAlpha(1.0f);
                jm1.c(lz5);
                jm1.q.remove(lz5);
                jm1.i();
                return;
            default:
                viewPropertyAnimator.setListener((Animator.AnimatorListener) null);
                jm1.c(lz5);
                jm1.o.remove(lz5);
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

    public em1(jm1 jm1, lz5 lz5, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = jm1;
        this.b = lz5;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
