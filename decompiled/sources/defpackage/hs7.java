package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: hs7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum hs7 implements Executor {
    ;
    
    public static final Handler x = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, hs7] */
    static {
        x = new Handler(Looper.getMainLooper());
    }

    public final void execute(Runnable runnable) {
        x.post(runnable);
    }
}
