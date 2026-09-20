package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: pn1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pn1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ gz6 d;
    public final /* synthetic */ qn1 e;

    public pn1(ViewGroup viewGroup, View view, boolean z, gz6 gz6, qn1 qn1) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = gz6;
        this.e = qn1;
    }

    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        gz6 gz6 = this.d;
        if (z || gz6.a == 3) {
            int i = gz6.a;
            view.getClass();
            hl6.a(i, view, viewGroup);
        }
        qn1 qn1 = this.e;
        ((gz6) qn1.c.w).c(qn1);
        if (rq2.L(2)) {
            Log.v("FragmentManager", "Animator from operation " + gz6 + " has ended.");
        }
    }
}
