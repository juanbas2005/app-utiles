package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: cc7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class cc7 {
    public static final String a;
    public static final long b = ya5.t("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);
    public static final int c;
    public static final int d = ya5.u(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
    public static final long e = TimeUnit.SECONDS.toNanos(ya5.t("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));
    public static final kw5 f = kw5.G;

    static {
        String str;
        int i = pa7.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        int i2 = pa7.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = ya5.u(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
    }
}
