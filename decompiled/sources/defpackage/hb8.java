package defpackage;

import android.view.WindowInsetsController;

/* renamed from: hb8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hb8 extends gb8 {
    public final void R(boolean z) {
        int i;
        WindowInsetsController windowInsetsController = this.d;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        windowInsetsController.setSystemBarsAppearance(i, 16);
    }

    public final void S(boolean z) {
        int i;
        WindowInsetsController windowInsetsController = this.d;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        windowInsetsController.setSystemBarsAppearance(i, 8);
    }
}
