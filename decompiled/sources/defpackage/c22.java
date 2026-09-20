package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: c22  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class c22 extends b22 {
    public void b(ca7 ca7, ca7 ca72, Window window, View view, boolean z, boolean z2) {
        g75 g75;
        ca7.getClass();
        ca72.getClass();
        window.getClass();
        view.getClass();
        o55.s(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        ay4 ay4 = new ay4(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            g75 = new gb8(window, ay4);
        } else if (i >= 30) {
            g75 = new gb8(window, ay4);
        } else if (i >= 26) {
            g75 = new eb8(window, ay4);
        } else {
            g75 = new eb8(window, ay4);
        }
        g75.S(!z);
        g75.R(!z2);
    }
}
