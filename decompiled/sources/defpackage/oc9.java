package defpackage;

import android.os.SystemClock;

/* renamed from: oc9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class oc9 {
    public static final a35 a;

    static {
        nc9 nc9;
        try {
            SystemClock.elapsedRealtimeNanos();
            nc9 = new nc9(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            nc9 = new nc9(1);
        }
        a = nc9;
    }
}
