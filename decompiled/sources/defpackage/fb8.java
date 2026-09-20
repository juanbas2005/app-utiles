package defpackage;

import android.view.View;
import android.view.Window;

/* renamed from: fb8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fb8 extends eb8 {
    public final void R(boolean z) {
        if (z) {
            Window window = this.d;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            return;
        }
        e0(16);
    }
}
