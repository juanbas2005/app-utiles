package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: a71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a71 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout w;

    public a71(CoordinatorLayout coordinatorLayout) {
        this.w = coordinatorLayout;
    }

    public final boolean onPreDraw() {
        this.w.p(0);
        return true;
    }
}
