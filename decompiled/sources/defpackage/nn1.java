package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: nn1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nn1 extends fz6 {
    public final on1 c;

    public nn1(on1 on1) {
        this.c = on1;
    }

    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        gz6 gz6 = (gz6) this.c.w;
        View view = gz6.c.c0;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        gz6.c(this);
        if (rq2.L(2)) {
            Log.v("FragmentManager", "Animation from operation " + gz6 + " has been cancelled.");
        }
    }

    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        on1 on1 = this.c;
        gz6 gz6 = (gz6) on1.w;
        if (on1.K0()) {
            gz6.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = gz6.c.c0;
        context.getClass();
        jz0 d1 = on1.d1(context);
        if (d1 != null) {
            Animation animation = (Animation) d1.x;
            if (animation == null) {
                h.s("Required value was null.");
            } else if (gz6.a != 1) {
                view.startAnimation(animation);
                gz6.c(this);
            } else {
                viewGroup.startViewTransition(view);
                fq2 fq2 = new fq2(animation, viewGroup, view);
                fq2.setAnimationListener(new mn1(gz6, viewGroup, view, this));
                view.startAnimation(fq2);
                if (rq2.L(2)) {
                    Log.v("FragmentManager", "Animation from operation " + gz6 + " has started.");
                }
            }
        } else {
            h.s("Required value was null.");
        }
    }
}
