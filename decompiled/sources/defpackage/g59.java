package defpackage;

import android.os.Bundle;

/* renamed from: g59  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g59 implements Runnable {
    public final /* synthetic */ l59 A;
    public final /* synthetic */ f59 w;
    public final /* synthetic */ f59 x;
    public final /* synthetic */ long y;
    public final /* synthetic */ boolean z;

    public g59(l59 l59, f59 f59, f59 f592, long j, boolean z2) {
        this.w = f59;
        this.x = f592;
        this.y = j;
        this.z = z2;
        this.A = l59;
    }

    public final void run() {
        this.A.i1(this.w, this.x, this.y, this.z, (Bundle) null);
    }
}
