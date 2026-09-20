package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: z12  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z12 extends f22 {
    public void b(ca7 ca7, ca7 ca72, Window window, View view, boolean z, boolean z2) {
        int i;
        g75 g75;
        ca7.getClass();
        ca72.getClass();
        window.getClass();
        view.getClass();
        o55.s(window, false);
        if (z) {
            i = ca7.b;
        } else {
            i = ca7.a;
        }
        window.setStatusBarColor(i);
        window.setNavigationBarColor(ca72.b);
        ay4 ay4 = new ay4(view);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            g75 = new gb8(window, ay4);
        } else if (i2 >= 30) {
            g75 = new gb8(window, ay4);
        } else if (i2 >= 26) {
            g75 = new eb8(window, ay4);
        } else {
            g75 = new eb8(window, ay4);
        }
        g75.S(!z);
    }
}
