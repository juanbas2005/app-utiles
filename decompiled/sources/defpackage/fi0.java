package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;

/* renamed from: fi0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fi0 {
    public static final fi0 a = new Object();
    public static final Handler b = new Handler(Looper.getMainLooper());
    public static final Object c = new Object();
    public static final d37 d = e37.a(Boolean.TRUE);
    public static WindowManager e;
    public static vx0 f;
    public static ci0 g;

    public static void a() {
        b.removeCallbacksAndMessages(c);
        vx0 vx0 = f;
        if (vx0 != null) {
            try {
                WindowManager windowManager = e;
                if (windowManager != null) {
                    windowManager.removeView(vx0);
                }
            } catch (Throwable unused) {
            }
        }
        f = null;
        ci0 ci0 = g;
        if (ci0 != null) {
            w54 w54 = ci0.x;
            w54.f1(j54.ON_PAUSE);
            w54.f1(j54.ON_STOP);
            w54.f1(j54.ON_DESTROY);
        }
        g = null;
        e = null;
    }
}
