package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: y46  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class y46 implements jn7 {
    public final /* synthetic */ a56 w;
    public final /* synthetic */ xb7 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ dz z;

    public /* synthetic */ y46(a56 a56, xb7 xb7, boolean z2, dz dzVar) {
        this.w = a56;
        this.x = xb7;
        this.y = z2;
        this.z = dzVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    public final void b(Exception exc) {
        xb7 xb7 = this.x;
        if (exc != null) {
            xb7.c(exc);
            return;
        }
        if (this.y) {
            boolean z2 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new ga(28, (Object) this.w, (Object) countDownLatch)).start();
            ExecutorService executorService = h18.a;
            boolean z3 = false;
            try {
                long j = 2000000000;
                long nanoTime = System.nanoTime() + 2000000000;
                while (true) {
                    countDownLatch.await(j, TimeUnit.NANOSECONDS);
                    try {
                        j = nanoTime - System.nanoTime();
                        z3 = true;
                    } catch (Throwable th) {
                        th = th;
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z2 = false;
                if (z2) {
                }
                throw th;
            }
        }
        xb7.d(this.z);
    }
}
