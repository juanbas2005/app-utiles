package defpackage;

import android.view.View;

/* renamed from: zp2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zp2 extends mp7 {
    public final /* synthetic */ bq2 L;

    public zp2(bq2 bq2) {
        this.L = bq2;
    }

    public final View g0(int i) {
        bq2 bq2 = this.L;
        View view = bq2.c0;
        if (view != null) {
            return view.findViewById(i);
        }
        rf2.h(bq2, " does not have a view", "Fragment ");
        return null;
    }

    public final boolean h0() {
        if (this.L.c0 != null) {
            return true;
        }
        return false;
    }
}
