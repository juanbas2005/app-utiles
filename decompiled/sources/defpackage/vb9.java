package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzvr;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vb9 {
    public static final AtomicReference a = new AtomicReference(o36.F);
    public static final dx8 b = new dx8(4);
    public static final WeakHashMap c = new WeakHashMap();
    public static final cj d = new cj(7);

    static {
        s93.s(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        new ArrayDeque();
        new ArrayDeque();
    }

    public static jc9 a() {
        ic9 c2 = c();
        jc9 jc9 = c2.b;
        if (jc9 != null && jc9 != bc9.C) {
            return jc9;
        }
        zzvr zzvr = zb9.C;
        UUID b2 = wb9.c.b();
        String a2 = qb9.a(b2);
        s93 s93 = (s93) a.get();
        if (!s93.isEmpty()) {
            s93.forEach(new zp8(1));
        }
        return new zb9(b2, a2, zb9.C, c2);
    }

    public static jc9 b(ic9 ic9, jc9 jc9) {
        boolean z;
        ic9.getClass();
        jc9 jc92 = ic9.b;
        if (jc92 != jc9) {
            if (jc92 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    z = Trace.isEnabled();
                } else {
                    ea9.a.getClass();
                    b.getClass();
                    String str = "false";
                    try {
                        str = (String) fa9.a.invoke((Object) null, new Object[]{"tiktok_systrace", str});
                    } catch (Exception e) {
                        Log.e("SystemProperties", "get error", e);
                    }
                    z = str.equals("true");
                }
                ic9.a = z;
            }
            if (ic9.a) {
                if (jc92 != null) {
                    if (jc9 != null) {
                        if (((qb9) jc92).w == jc9 && !g75.a0(jc92)) {
                            Trace.endSection();
                        } else if (jc92 == ((qb9) jc9).w && !g75.a0(jc9)) {
                            g75.c0(jc9);
                        }
                    }
                    g75.Z(jc92);
                }
                if (jc9 != null) {
                    g75.Y(jc9);
                }
            }
            if (jc92 != jc9) {
                ic9.b = jc9;
                return jc92;
            }
        }
        return jc9;
    }

    public static ic9 c() {
        return (ic9) d.get();
    }
}
