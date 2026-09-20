package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: mj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mj8 extends f76 {
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;
    public static final AtomicReference f = new AtomicReference();
    public static final AtomicLong g = new AtomicLong();
    public static final ConcurrentLinkedQueue h = new ConcurrentLinkedQueue();
    public volatile f76 b;

    static {
        boolean z;
        boolean z2;
        String str = Build.FINGERPRINT;
        boolean z3 = false;
        if (str == null || "robolectric".equals(str)) {
            z = true;
        } else {
            z = false;
        }
        c = z;
        String str2 = Build.HARDWARE;
        if ("goldfish".equals(str2) || "ranchu".equals(str2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        d = z2;
        String str3 = Build.TYPE;
        if ("eng".equals(str3) || "userdebug".equals(str3)) {
            z3 = true;
        }
        e = z3;
    }

    public static void d() {
        while (true) {
            lj8 lj8 = (lj8) h.poll();
            if (lj8 != null) {
                g.getAndDecrement();
                mj8 mj8 = lj8.a;
                uc9 uc9 = lj8.b;
                yc9 yc9 = uc9.c;
                if ((yc9 != null && Boolean.TRUE.equals(yc9.A(xc9.g))) || mj8.a(uc9.a)) {
                    mj8.b(uc9);
                }
            } else {
                return;
            }
        }
    }

    public final boolean a(Level level) {
        if (this.b == null || this.b.a(level)) {
            return true;
        }
        return false;
    }

    public final void b(uc9 uc9) {
        if (this.b != null) {
            this.b.b(uc9);
            return;
        }
        if (g.incrementAndGet() > 20) {
            h.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        h.offer(new lj8(this, uc9));
        if (this.b != null) {
            d();
        }
    }

    public final void c(RuntimeException runtimeException, uc9 uc9) {
        if (this.b != null) {
            this.b.c(runtimeException, uc9);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
