package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: r92  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r92 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public boolean w;
    public final /* synthetic */ View x;
    public final /* synthetic */ sr2 y;

    public r92(View view, sr2 sr2) {
        this.x = view;
        this.y = sr2;
        view.addOnAttachStateChangeListener(this);
        if (!this.w && view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.w = true;
        }
    }

    public final void onGlobalLayout() {
        this.y.b();
    }

    public final void onViewAttachedToWindow(View view) {
        if (!this.w) {
            View view2 = this.x;
            if (view2.isAttachedToWindow()) {
                view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.w = true;
            }
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.w) {
            this.x.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.w = false;
        }
    }
}
