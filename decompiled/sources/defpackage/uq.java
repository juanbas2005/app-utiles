package defpackage;

import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace;

/* renamed from: uq  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uq implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ AppStartTrace w;

    public uq(AppStartTrace appStartTrace) {
        this.w = appStartTrace;
    }

    public final void onDraw() {
        this.w.P++;
    }
}
