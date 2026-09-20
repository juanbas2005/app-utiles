package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: rp  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rp implements PopupWindow.OnDismissListener {
    public final /* synthetic */ mp w;
    public final /* synthetic */ sp x;

    public rp(sp spVar, mp mpVar) {
        this.x = spVar;
        this.w = mpVar;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.x.c0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.w);
        }
    }
}
