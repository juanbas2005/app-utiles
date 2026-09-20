package defpackage;

import android.view.Choreographer;

/* renamed from: fj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fj implements Choreographer.FrameCallback {
    public final /* synthetic */ kk0 w;
    public final /* synthetic */ vr2 x;

    public fj(kk0 kk0, gj gjVar, vr2 vr2) {
        this.w = kk0;
        this.x = vr2;
    }

    public final void doFrame(long j) {
        Object obj;
        try {
            obj = this.x.y(Long.valueOf(j));
        } catch (Throwable th) {
            obj = new m66(th);
        }
        this.w.f(obj);
    }
}
