package defpackage;

import android.os.Process;

/* renamed from: ee6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ee6 implements Runnable {
    public final /* synthetic */ int w;
    public final Runnable x;

    public /* synthetic */ ee6(Runnable runnable, int i) {
        this.w = i;
        this.x = runnable;
    }

    public final void run() {
        int i = this.w;
        Runnable runnable = this.x;
        switch (i) {
            case b85.b:
                try {
                    runnable.run();
                    return;
                } catch (Exception e) {
                    dh4.l("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                runnable.run();
                return;
            case 2:
                runnable.run();
                return;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                return;
        }
    }

    public String toString() {
        int i = this.w;
        Runnable runnable = this.x;
        switch (i) {
            case 1:
                return runnable.toString();
            case 2:
                return runnable.toString();
            default:
                return super.toString();
        }
    }
}
