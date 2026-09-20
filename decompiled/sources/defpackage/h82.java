package defpackage;

import android.os.Process;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: h82  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h82 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ h82(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final void run() {
        Process.setThreadPriority(10);
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                ((Runnable) obj).run();
                return;
            default:
                ExecutorService executorService = (ExecutorService) obj;
                try {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Executing shutdown hook for awaitEvenIfOnMainThread task continuation executor", (Throwable) null);
                    }
                    executorService.shutdown();
                    if (!executorService.awaitTermination(2, TimeUnit.SECONDS)) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "awaitEvenIfOnMainThread task continuation executor did not shut down in the allocated time. Requesting immediate shutdown.", (Throwable) null);
                        }
                        executorService.shutdownNow();
                        return;
                    }
                    return;
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Interrupted while waiting for awaitEvenIfOnMainThread task continuation executor to shut down. Requesting immediate shutdown.", (Throwable) null);
                    }
                    executorService.shutdownNow();
                    return;
                }
        }
    }
}
