package defpackage;

import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: uv8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uv8 extends f76 {
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static final AtomicReference e = new AtomicReference();
    public static final ConcurrentLinkedQueue f = new ConcurrentLinkedQueue();

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
        b = z;
        String str2 = Build.HARDWARE;
        if ("goldfish".equals(str2) || "ranchu".equals(str2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        c = z2;
        String str3 = Build.TYPE;
        if ("eng".equals(str3) || "userdebug".equals(str3)) {
            z3 = true;
        }
        d = z3;
        new AtomicLong();
    }
}
