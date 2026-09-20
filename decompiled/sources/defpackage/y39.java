package defpackage;

import android.os.Bundle;

/* renamed from: y39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y39 implements Runnable {
    public final /* synthetic */ Bundle A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ v49 E;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ long y;
    public final /* synthetic */ long z;

    public y39(v49 v49, String str, String str2, long j, long j2, Bundle bundle, boolean z2, boolean z3, boolean z4) {
        this.w = str;
        this.x = str2;
        this.y = j;
        this.z = j2;
        this.A = bundle;
        this.B = z2;
        this.C = z3;
        this.D = z4;
        this.E = v49;
    }

    public final void run() {
        this.E.l1(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D);
    }
}
