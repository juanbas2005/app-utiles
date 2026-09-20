package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dg2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dg2 implements ViewTreeObserver.OnDrawListener {
    public final Handler w = new Handler(Looper.getMainLooper());
    public final AtomicReference x;
    public final tq y;

    public dg2(View view, tq tqVar) {
        this.x = new AtomicReference(view);
        this.y = tqVar;
    }

    public final void onDraw() {
        View view = (View) this.x.getAndSet((Object) null);
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new cg2(this, view));
            this.w.postAtFrontOfQueue(this.y);
        }
    }
}
