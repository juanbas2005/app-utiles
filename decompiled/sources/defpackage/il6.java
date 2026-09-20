package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: il6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class il6 implements Executor {
    public static final Logger B = Logger.getLogger(il6.class.getName());
    public final nt2 A = new nt2((Executor) this, 11);
    public final Executor w;
    public final ArrayDeque x = new ArrayDeque();
    public int y = 1;
    public long z = 0;

    public il6(Executor executor) {
        z65.k(executor);
        this.w = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r7.w.execute(r7.A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r7.y == 2) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r0 = r7.x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r7.z != r3) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r7.y != 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        r7.y = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0047, code lost:
        monitor-enter(r7.x);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r3 = r7.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004a, code lost:
        if (r3 == 1) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0057, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005a, code lost:
        if ((r0 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0060, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0062, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0064, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public final void execute(Runnable runnable) {
        z65.k(runnable);
        synchronized (this.x) {
            int i = this.y;
            if (i != 4) {
                if (i != 3) {
                    long j = this.z;
                    boolean z2 = true;
                    ee6 ee6 = new ee6(runnable, 1);
                    this.x.add(ee6);
                    this.y = 2;
                }
            }
            this.x.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.w + "}";
    }
}
