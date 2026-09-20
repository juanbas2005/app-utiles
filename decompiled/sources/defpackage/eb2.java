package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;
import cu.lestebang.utiletecsa.R;

/* renamed from: eb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eb2 extends AnimatorListenerAdapter implements jm7 {
    public final View a;
    public boolean b = false;

    public eb2(View view) {
        this.a = view;
    }

    public final void b() {
        float f;
        View view = this.a;
        if (view.getVisibility() == 0) {
            f = n68.a.s(view);
        } else {
            f = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f));
    }

    public final void e() {
        this.a.setTag(R.id.transition_pause_alpha, (Object) null);
    }

    public final void onAnimationCancel(Animator animator) {
        n68.a.C(this.a, 1.0f);
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, (Paint) null);
        }
        if (!z) {
            t68 t68 = n68.a;
            t68.C(view, 1.0f);
            t68.getClass();
        }
    }

    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, (Paint) null);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    public final void a(km7 km7) {
    }

    public final void c(km7 km7) {
    }

    public final void d(km7 km7) {
    }

    public final void f(km7 km7) {
    }
}
