package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: cg2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class cg2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ dg2 w;
    public final /* synthetic */ View x;

    public /* synthetic */ cg2(dg2 dg2, View view) {
        this.w = dg2;
        this.x = view;
    }

    public final void onGlobalLayout() {
        this.x.getViewTreeObserver().removeOnDrawListener(this.w);
    }
}
