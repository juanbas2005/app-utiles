package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: gb8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class gb8 extends g75 {
    public final WindowInsetsController d;
    public final Window e;

    public gb8(Window window, ay4 ay4) {
        this.d = window.getInsetsController();
        this.e = window;
    }

    public void R(boolean z) {
        e0(16, 16, z);
    }

    public void S(boolean z) {
        e0(8192, 8, z);
    }

    public final void e0(int i, int i2, boolean z) {
        Window window = this.e;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.d;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
            }
        } else if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
