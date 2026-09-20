package defpackage;

import android.os.Process;

/* renamed from: h56  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h56 extends Thread {
    public final int w = 10;

    public h56(Runnable runnable) {
        super(runnable, "fonts-androidx");
    }

    public final void run() {
        Process.setThreadPriority(this.w);
        super.run();
    }
}
