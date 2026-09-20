package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: ol1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ol1 extends n72 implements Runnable {
    public static final ol1 H;
    public static final long I;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX WARNING: type inference failed for: r0v0, types: [h81, ol1, i72] */
    static {
        Long l;
        ? h81 = new h81();
        H = h81;
        h81.q0(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        I = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    public final void B0(long j, l72 l72) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void H0() {
        boolean z;
        int i = debugStatus;
        if (i == 2 || i == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            debugStatus = 3;
            D0();
            notifyAll();
        }
    }

    public final mw1 a(long j, si7 si7, e81 e81) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000000 * j;
            }
        }
        if (j2 >= 4611686018427387903L) {
            return f05.w;
        }
        long nanoTime = System.nanoTime();
        k72 k72 = new k72(j2 + nanoTime, si7);
        E0(nanoTime, k72);
        return k72;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        _thread = null;
        H0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (A0() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        z0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        r9 = Long.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        java.lang.Thread.interrupted();
        r11 = r0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r11 != Long.MAX_VALUE) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        r15 = java.lang.System.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r9 != Long.MAX_VALUE) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r9 = I + r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        r15 = r9 - r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        if (r15 > 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0056, code lost:
        _thread = null;
        H0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005f, code lost:
        if (A0() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0061, code lost:
        z0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0067, code lost:
        if (r11 <= r15) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0069, code lost:
        r11 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006b, code lost:
        r9 = Long.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006e, code lost:
        if (r11 <= 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r0 = debugStatus;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0072, code lost:
        if (r0 == 2) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0074, code lost:
        if (r0 != 3) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0077, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0079, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007a, code lost:
        if (r0 == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007c, code lost:
        _thread = null;
        H0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0085, code lost:
        if (A0() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0087, code lost:
        z0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    public final void run() {
        boolean z;
        ih7.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    debugStatus = 1;
                    notifyAll();
                }
            }
        } catch (Throwable th) {
            _thread = null;
            H0();
            if (!A0()) {
                z0();
            }
            throw th;
        }
    }

    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final String toString() {
        return "DefaultExecutor";
    }

    public final void v0(Runnable runnable) {
        if (debugStatus != 4) {
            super.v0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final Thread z0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(H.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }
}
