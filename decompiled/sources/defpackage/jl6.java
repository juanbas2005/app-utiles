package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: jl6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jl6 implements Executor {
    public static final Logger B = Logger.getLogger(jl6.class.getName());
    public final nt2 A = new nt2((Executor) this, 12);
    public final Executor w;
    public final ArrayDeque x = new ArrayDeque();
    public int y = 1;
    public long z = 0;

    public jl6(Executor executor) {
        executor.getClass();
        this.w = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r6.w.execute(r6.A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r6.y == 2) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r7 = r6.x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r6.z != r3) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r6.y != 2) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        r6.y = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0046, code lost:
        monitor-enter(r6.x);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r0 = r6.y;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004a, code lost:
        if (r0 == 1) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0057, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005a, code lost:
        if ((r7 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0060, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0062, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0064, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.x) {
            int i = this.y;
            if (i != 4) {
                if (i != 3) {
                    long j = this.z;
                    ee6 ee6 = new ee6(runnable, 2);
                    this.x.add(ee6);
                    this.y = 2;
                }
            }
            this.x.add(runnable);
        }
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        String valueOf = String.valueOf(this.w);
        StringBuilder sb = new StringBuilder(valueOf.length() + 32);
        sb.append("SequentialExecutor@");
        sb.append(identityHashCode);
        sb.append("{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
