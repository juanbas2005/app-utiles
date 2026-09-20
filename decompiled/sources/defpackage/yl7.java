package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: yl7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yl7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public yl7(ha8 ha8, View view) {
        this.b = ha8;
        this.c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case b85.b:
                ((js) obj2).remove(animator);
                ((km7) obj).J.remove(animator);
                return;
            default:
                ha8 ha8 = (ha8) obj2;
                ha8.a.d(1.0f);
                da8.e(ha8, (View) obj);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case b85.b:
                ((km7) this.c).J.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public yl7(km7 km7, js jsVar) {
        this.c = km7;
        this.b = jsVar;
    }
}
