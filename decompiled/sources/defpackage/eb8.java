package defpackage;

import android.view.View;
import android.view.Window;

/* renamed from: eb8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class eb8 extends g75 {
    public final Window d;

    public eb8(Window window, ay4 ay4) {
        this.d = window;
    }

    public final void S(boolean z) {
        if (z) {
            Window window = this.d;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            return;
        }
        e0(8192);
    }

    public final void e0(int i) {
        View decorView = this.d.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
