package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: t7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t7 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ ActionBarOverlayLayout x;

    public /* synthetic */ t7(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.w = i;
        this.x = actionBarOverlayLayout;
    }

    public final void run() {
        int i = this.w;
        ActionBarOverlayLayout actionBarOverlayLayout = this.x;
        switch (i) {
            case b85.b:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.S = actionBarOverlayLayout.z.animate().translationY(0.0f).setListener(actionBarOverlayLayout.T);
                return;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.S = actionBarOverlayLayout.z.animate().translationY((float) (-actionBarOverlayLayout.z.getHeight())).setListener(actionBarOverlayLayout.T);
                return;
        }
    }
}
