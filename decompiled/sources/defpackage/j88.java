package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: j88  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class j88 {
    static {
        bc4.p("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context context) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        String concat = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (k88.a) {
            String str = (String) k88.b.put(newWakeLock, concat);
        }
        newWakeLock.getClass();
        return newWakeLock;
    }
}
