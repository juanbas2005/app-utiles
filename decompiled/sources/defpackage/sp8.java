package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sp8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class sp8 {
    public static final boolean a = true;
    public static final AtomicReference b = new AtomicReference(lt8.H);
    public static final jx8 c = new jx8(4);
    public static final WeakHashMap d = new WeakHashMap();
    public static final cj e = new cj(5);

    static {
        os8.z(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        new ArrayDeque();
        new ArrayDeque();
    }

    public static void a(vq8 vq8, cq8 cq8, int i) {
        cq8 cq82;
        cq8 cq83;
        cq8 cq84;
        boolean z;
        cq8 cq85 = vq8.b;
        if (cq85 != cq8 || (i != 2 && i != 4 && cq85 != null)) {
            if (cq85 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    z = Trace.isEnabled();
                } else {
                    xi8.a.getClass();
                    c.getClass();
                    String str = "false";
                    try {
                        str = (String) cl8.a.invoke((Object) null, new Object[]{"tiktok_systrace", str});
                    } catch (Exception e2) {
                        Log.e("SystemProperties", "get error", e2);
                    }
                    z = str.equals("true");
                }
                vq8.a = z;
            }
            uy5 uy5 = vq8.d;
            if (vq8.a) {
                if (uy5 != null) {
                    int i2 = i - 1;
                    if (i2 == 0) {
                        cq83 = cq8;
                        cq84 = null;
                    } else if (i2 != 2) {
                        cq83 = cq8;
                        cq84 = cq85;
                    } else {
                        cq84 = cq85;
                        cq83 = null;
                    }
                    if (cq84 != null) {
                        Trace.endSection();
                        Trace.endSection();
                    }
                    if (cq83 != null) {
                        Trace.beginSection(cq83.w);
                        Trace.beginSection("<missing root>");
                    }
                } else {
                    if (cq85 != null) {
                        if (cq8 != null) {
                            cq82 = cq8;
                        } else {
                            cq82 = null;
                        }
                        Thread.currentThread();
                        Trace.endSection();
                        Trace.endSection();
                    } else {
                        cq82 = cq8;
                    }
                    if (cq82 != null) {
                        Thread.currentThread();
                        Trace.beginSection(cq82.w);
                        Trace.beginSection("<missing root>");
                    }
                }
            }
            if (cq85 != cq8) {
                if (cq8 == null) {
                    cq8 = null;
                }
                vq8.b = cq8;
                if (i != 2) {
                    return;
                }
                if (uy5 != null) {
                    uy5.x = cq8;
                } else {
                    ku4.j("Coroutine is executing but trace storage is not being set.");
                }
            }
        }
    }
}
