package defpackage;

import android.window.OnBackInvokedDispatcher;

/* renamed from: jv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class jv0 implements q54 {
    public final /* synthetic */ v45 w;
    public final /* synthetic */ rv0 x;

    public /* synthetic */ jv0(v45 v45, rv0 rv0) {
        this.w = v45;
        this.x = rv0;
    }

    public final void o(t54 t54, j54 j54) {
        if (j54 == j54.ON_CREATE) {
            OnBackInvokedDispatcher n = this.x.getOnBackInvokedDispatcher();
            n.getClass();
            this.w.c(n);
        }
    }
}
