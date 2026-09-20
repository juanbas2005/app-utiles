package defpackage;

import android.view.ViewGroup;

/* renamed from: lo  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lo implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ wo x;

    public /* synthetic */ lo(wo woVar, int i) {
        this.w = i;
        this.x = woVar;
    }

    public final void run() {
        ViewGroup viewGroup;
        int i = this.w;
        wo woVar = this.x;
        switch (i) {
            case b85.b:
                if ((woVar.v0 & 1) != 0) {
                    woVar.x(0);
                }
                if ((woVar.v0 & 4096) != 0) {
                    woVar.x(108);
                }
                woVar.u0 = false;
                woVar.v0 = 0;
                return;
            default:
                woVar.R.showAtLocation(woVar.Q, 55, 0, 0);
                c68 c68 = woVar.T;
                if (c68 != null) {
                    c68.b();
                }
                if (!woVar.V || (viewGroup = woVar.W) == null || !viewGroup.isLaidOut()) {
                    woVar.Q.setAlpha(1.0f);
                    woVar.Q.setVisibility(0);
                    return;
                }
                woVar.Q.setAlpha(0.0f);
                c68 a = e58.a(woVar.Q);
                a.a(1.0f);
                woVar.T = a;
                a.d(new mo(0, this));
                return;
        }
    }
}
