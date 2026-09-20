package defpackage;

import android.app.Dialog;
import android.view.View;

/* renamed from: nu1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nu1 extends mp7 {
    public final /* synthetic */ zp2 L;
    public final /* synthetic */ ou1 M;

    public nu1(ou1 ou1, zp2 zp2) {
        this.M = ou1;
        this.L = zp2;
    }

    public final View g0(int i) {
        zp2 zp2 = this.L;
        if (zp2.h0()) {
            return zp2.g0(i);
        }
        Dialog dialog = this.M.E0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public final boolean h0() {
        if (this.L.h0() || this.M.I0) {
            return true;
        }
        return false;
    }
}
