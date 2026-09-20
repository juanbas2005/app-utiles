package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: qn1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qn1 extends fz6 {
    public final on1 c;
    public AnimatorSet d;

    public qn1(on1 on1) {
        this.c = on1;
    }

    public final void a(ViewGroup viewGroup) {
        String str;
        viewGroup.getClass();
        AnimatorSet animatorSet = this.d;
        gz6 gz6 = (gz6) this.c.w;
        if (animatorSet == null) {
            gz6.c(this);
            return;
        }
        if (!gz6.g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            sn1.a.a(animatorSet);
        }
        if (rq2.L(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(gz6);
            sb.append(" has been canceled");
            if (gz6.g) {
                str = " with seeking.";
            } else {
                str = ".";
            }
            sb.append(str);
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        gz6 gz6 = (gz6) this.c.w;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            gz6.c(this);
            return;
        }
        animatorSet.start();
        if (rq2.L(2)) {
            Log.v("FragmentManager", "Animator from operation " + gz6 + " has started.");
        }
    }

    public final void c(e30 e30, ViewGroup viewGroup) {
        viewGroup.getClass();
        gz6 gz6 = (gz6) this.c.w;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            gz6.c(this);
        } else if (Build.VERSION.SDK_INT >= 34 && gz6.c.I) {
            if (rq2.L(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + gz6);
            }
            long a = rn1.a.a(animatorSet);
            long j = (long) (e30.c * ((float) a));
            if (j == 0) {
                j = 1;
            }
            if (j == a) {
                j = a - 1;
            }
            if (rq2.L(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + gz6);
            }
            sn1.a.b(animatorSet, j);
        }
    }

    public final void d(ViewGroup viewGroup) {
        AnimatorSet animatorSet;
        boolean z;
        qn1 qn1;
        viewGroup.getClass();
        on1 on1 = this.c;
        if (!on1.K0()) {
            Context context = viewGroup.getContext();
            context.getClass();
            jz0 d1 = on1.d1(context);
            if (d1 != null) {
                animatorSet = (AnimatorSet) d1.y;
            } else {
                animatorSet = null;
            }
            this.d = animatorSet;
            gz6 gz6 = (gz6) on1.w;
            bq2 bq2 = gz6.c;
            if (gz6.a == 3) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            View view = bq2.c0;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet2 = this.d;
            if (animatorSet2 != null) {
                qn1 = this;
                animatorSet2.addListener(new pn1(viewGroup, view, z2, gz6, qn1));
            } else {
                qn1 = this;
            }
            AnimatorSet animatorSet3 = qn1.d;
            if (animatorSet3 != null) {
                animatorSet3.setTarget(view);
            }
        }
    }
}
