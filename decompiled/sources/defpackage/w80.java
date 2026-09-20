package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: w80  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w80 implements Executor {
    public final /* synthetic */ int w;
    public final Handler x;

    public w80(int i) {
        this.w = i;
        switch (i) {
            case 1:
                this.x = new Handler(Looper.getMainLooper());
                return;
            default:
                this.x = new Handler(Looper.getMainLooper());
                return;
        }
    }

    public final void execute(Runnable runnable) {
        int i = this.w;
        Handler handler = this.x;
        switch (i) {
            case b85.b:
                handler.post(runnable);
                return;
            case 1:
                handler.post(runnable);
                return;
            case 2:
                runnable.getClass();
                if (!handler.post(runnable)) {
                    throw new RejectedExecutionException(handler + " is shutting down");
                }
                return;
            case 3:
                runnable.getClass();
                if (!handler.post(runnable)) {
                    throw new RejectedExecutionException(handler + " is shutting down");
                }
                return;
            default:
                handler.post(runnable);
                return;
        }
    }

    public /* synthetic */ w80(Handler handler, int i) {
        this.w = i;
        this.x = handler;
    }
}
