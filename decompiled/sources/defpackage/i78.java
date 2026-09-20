package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import cu.lestebang.utiletecsa.R;

/* renamed from: i78  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i78 extends AnimatorListenerAdapter implements jm7 {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ fb2 e;

    public i78(fb2 fb2, ViewGroup viewGroup, View view, View view2) {
        this.e = fb2;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    public final void a(km7 km7) {
        km7.z(this);
    }

    public final void f(km7 km7) {
        if (this.d) {
            g();
        }
    }

    public final void g() {
        this.c.setTag(R.id.save_overlay_view, (Object) null);
        this.a.getOverlay().remove(this.b);
        this.d = false;
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            g();
        }
    }

    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.e.c();
        }
    }

    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            View view2 = this.b;
            view.setTag(R.id.save_overlay_view, view2);
            this.a.getOverlay().add(view2);
            this.d = true;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        g();
    }

    public final void b() {
    }

    public final void e() {
    }

    public final void c(km7 km7) {
    }
}
