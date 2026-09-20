package defpackage;

import android.view.ActionProvider;

/* renamed from: zi4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zi4 implements ActionProvider.VisibilityListener {
    public wv2 a;
    public final ActionProvider b;

    public zi4(cj4 cj4, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        wv2 wv2 = this.a;
        if (wv2 != null) {
            ti4 ti4 = ((yi4) wv2.x).n;
            ti4.h = true;
            ti4.p(true);
        }
    }
}
