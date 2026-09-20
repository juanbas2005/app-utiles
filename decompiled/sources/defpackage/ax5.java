package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ax5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ax5 implements Runnable {
    public final vi0 w;
    public volatile AtomicInteger x = new AtomicInteger(0);
    public final /* synthetic */ dx5 y;

    public ax5(dx5 dx5, vi0 vi0) {
        this.y = dx5;
        this.w = vi0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e A[Catch:{ all -> 0x0068, all -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e A[Catch:{ all -> 0x0068, all -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a A[SYNTHETIC, Splitter:B:29:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e A[Catch:{ all -> 0x0068, all -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008f A[Catch:{ all -> 0x0068, all -> 0x0040 }] */
    public final void run() {
        am6 am6;
        String concat = "OkHttp ".concat(((g73) this.y.x.x).g());
        dx5 dx5 = this.y;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            dx5.B.h();
            boolean z = false;
            try {
                try {
                    this.w.z(dx5, dx5.h());
                    am6 = dx5.w.a;
                } catch (IOException e) {
                    e = e;
                    z = true;
                    if (!z) {
                    }
                    am6 = dx5.w.a;
                    am6.getClass();
                    am6.P(am6, (ax5) null, (dx5) null, this, 3);
                    currentThread.setName(name);
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    dx5.d();
                    if (!z) {
                    }
                    if (!(th instanceof InterruptedException)) {
                    }
                }
            } catch (IOException e2) {
                e = e2;
                if (!z) {
                    ej5 ej5 = ej5.a;
                    ej5.a.i("Callback failure for ".concat(dx5.a(dx5)), 4, e);
                } else {
                    this.w.M(dx5, e);
                }
                am6 = dx5.w.a;
                am6.getClass();
                am6.P(am6, (ax5) null, (dx5) null, this, 3);
                currentThread.setName(name);
            } catch (Throwable th2) {
                th = th2;
                dx5.d();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    iOException.initCause(th);
                    this.w.M(dx5, iOException);
                }
                if (!(th instanceof InterruptedException)) {
                    Thread.currentThread().interrupt();
                    am6 = dx5.w.a;
                    am6.getClass();
                    am6.P(am6, (ax5) null, (dx5) null, this, 3);
                    currentThread.setName(name);
                }
                throw th;
            }
            am6.getClass();
            am6.P(am6, (ax5) null, (dx5) null, this, 3);
            currentThread.setName(name);
        } catch (Throwable th3) {
            currentThread.setName(name);
            throw th3;
        }
    }
}
