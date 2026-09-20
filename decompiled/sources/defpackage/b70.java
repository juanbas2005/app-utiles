package defpackage;

import android.os.Build;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: b70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class b70 {
    public static final t37 a = new hu5(new o(10));
    public static Boolean b;

    public static final void a(vl vlVar, tg7 tg7, dl2 dl2, List list, boolean z, yt2 yt2) {
        yt2 yt22 = yt2;
        Executor executor = (Executor) yt22.k(a);
        if (executor == null || !b(vlVar.x.length())) {
            yt22.e0(317137883);
            yt22.r(false);
            return;
        }
        yt22.e0(315439796);
        try {
            executor.execute(new z60(tg7, (ey3) yt22.k(xy0.n), list, vlVar, (tp1) yt22.k(xy0.h), dl2, z));
        } catch (RejectedExecutionException unused) {
        }
        yt22.r(false);
    }

    public static final boolean b(int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            if (b == null) {
                if (Runtime.getRuntime().availableProcessors() >= 4) {
                    z = true;
                } else {
                    z = false;
                }
                b = Boolean.valueOf(z);
            }
            Boolean bool = b;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
