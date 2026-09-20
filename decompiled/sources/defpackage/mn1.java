package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: mn1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mn1 implements Animation.AnimationListener {
    public final /* synthetic */ gz6 a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ nn1 d;

    public mn1(gz6 gz6, ViewGroup viewGroup, View view, nn1 nn1) {
        this.a = gz6;
        this.b = viewGroup;
        this.c = view;
        this.d = nn1;
    }

    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.b;
        viewGroup.post(new ti(viewGroup, this.c, this.d, 4));
        if (rq2.L(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (rq2.L(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }
}
