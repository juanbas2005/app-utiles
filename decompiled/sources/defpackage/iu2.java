package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: iu2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iu2 {
    public final Runtime a = Runtime.getRuntime();
    public final ActivityManager b;
    public final ActivityManager.MemoryInfo c;

    static {
        rg.d();
    }

    public iu2(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
