package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: h78  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h78 extends AnimatorListenerAdapter implements jm7 {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public final boolean d;
    public boolean e;
    public boolean f = false;

    public h78(View view, int i) {
        this.a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        this.d = true;
        g(true);
    }

    public final void a(km7 km7) {
        km7.z(this);
    }

    public final void b() {
        g(false);
        if (!this.f) {
            n68.b(this.a, this.b);
        }
    }

    public final void e() {
        g(true);
        if (!this.f) {
            n68.b(this.a, 0);
        }
    }

    public final void g(boolean z) {
        ViewGroup viewGroup;
        if (this.d && this.e != z && (viewGroup = this.c) != null) {
            this.e = z;
            b85.s(viewGroup, z);
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            if (!this.f) {
                n68.b(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }
    }

    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            n68.b(this.a, 0);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f) {
            n68.b(this.a, this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    public final void c(km7 km7) {
    }

    public final void f(km7 km7) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }
}
