package defpackage;

import android.view.View;
import android.view.Window;

/* renamed from: kv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class kv0 implements q54 {
    public final /* synthetic */ int w;
    public final /* synthetic */ rv0 x;

    public /* synthetic */ kv0(rv0 rv0, int i) {
        this.w = i;
        this.x = rv0;
    }

    public final void o(t54 t54, j54 j54) {
        Window window;
        View peekDecorView;
        int i = this.w;
        rv0 rv0 = this.x;
        switch (i) {
            case b85.b:
                if (j54 == j54.ON_STOP && (window = rv0.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    return;
                }
                return;
            default:
                if (j54 == j54.ON_DESTROY) {
                    rv0.x.b = null;
                    if (!rv0.isChangingConfigurations()) {
                        rv0.g().a();
                    }
                    ov0 ov0 = rv0.B;
                    rv0 rv02 = ov0.z;
                    rv02.getWindow().getDecorView().removeCallbacks(ov0);
                    rv02.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(ov0);
                    return;
                }
                return;
        }
    }
}
