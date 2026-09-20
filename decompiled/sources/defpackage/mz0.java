package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: mz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mz0 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ nz0 y;

    public mz0(nz0 nz0, int i, long j) {
        this.y = nz0;
        this.w = i;
        this.x = j;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        nz0 nz0 = this.y;
        int i = this.w;
        long j = this.x;
        synchronized (nz0) {
            int i2 = i - 1;
            try {
                yb9 c = ((wz0) nz0.d).c(3 - i2);
                yb9 b = ((qz0) nz0.e).b();
                b35.B(c, b).g((ScheduledExecutorService) nz0.g, new lz0(nz0, c, b, j, i2));
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
