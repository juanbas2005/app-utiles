package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: q55  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q55 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View w;
    public ViewTreeObserver x;
    public final Runnable y;

    public q55(View view, Runnable runnable) {
        this.w = view;
        this.x = view.getViewTreeObserver();
        this.y = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            q55 q55 = new q55(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(q55);
            view.addOnAttachStateChangeListener(q55);
            return;
        }
        ku4.j("view == null");
    }

    public final boolean onPreDraw() {
        boolean isAlive = this.x.isAlive();
        View view = this.w;
        if (isAlive) {
            this.x.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.y.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.x = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.x.isAlive();
        View view2 = this.w;
        if (isAlive) {
            this.x.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
