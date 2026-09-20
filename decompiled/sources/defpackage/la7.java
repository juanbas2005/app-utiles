package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: la7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class la7 extends hd3 {
    public vr2 N;
    public ib8 O;

    public final void N0() {
        View K = su0.K(this);
        WeakHashMap weakHashMap = ib8.w;
        ib8 j = n63.j(K);
        j.a(K);
        aa8 aa8 = (aa8) this.N.y(j);
        if (!sg3.e(aa8, this.M)) {
            this.M = aa8;
            W0();
        }
        this.O = j;
        super.N0();
    }

    public final void O0() {
        View K = su0.K(this);
        ib8 ib8 = this.O;
        if (ib8 != null) {
            int i = ib8.u - 1;
            ib8.u = i;
            if (i == 0) {
                WeakHashMap weakHashMap = e58.a;
                w48.c(K, (l45) null);
                e58.o(K, (us0) null);
                K.removeOnAttachStateChangeListener(ib8.v);
            }
        }
        super.O0();
    }
}
