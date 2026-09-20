package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: jm4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jm4 extends AbstractExecutorService implements ScheduledExecutorService, ExecutorService, AutoCloseable {
    public final ScheduledExecutorService w;
    public final ScheduledExecutorService x;

    public jm4(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.w = scheduledExecutorService;
        this.x = scheduledExecutorService;
    }

    public final ListenableFuture a(c49 c49) {
        return (ListenableFuture) super.submit(c49);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.w.awaitTermination(j, timeUnit);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r6.w;
     */
    public final void close() {
        ScheduledExecutorService scheduledExecutorService;
        boolean isTerminated;
        if (this != ForkJoinPool.commonPool() && !(isTerminated = scheduledExecutorService.isTerminated())) {
            shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = scheduledExecutorService.awaitTermination(1, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void execute(Runnable runnable) {
        this.w.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.w.isShutdown();
    }

    public final boolean isTerminated() {
        return this.w.isTerminated();
    }

    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new ho7(Executors.callable(runnable, obj));
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ho7 ho7 = new ho7(Executors.callable(runnable, (Object) null));
        return new hm4(ho7, this.x.schedule(ho7, j, timeUnit));
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        im4 im4 = new im4(runnable);
        return new hm4(im4, this.x.scheduleAtFixedRate(im4, j, j2, timeUnit));
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        im4 im4 = new im4(runnable);
        return new hm4(im4, this.x.scheduleWithFixedDelay(im4, j, j2, timeUnit));
    }

    public final void shutdown() {
        this.w.shutdown();
    }

    public final List shutdownNow() {
        return this.w.shutdownNow();
    }

    public final Future submit(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.w);
        StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(obj).length() + 2);
        sb.append(obj);
        sb.append("[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final Future submit(Runnable runnable, Object obj) {
        return (ListenableFuture) super.submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return (ListenableFuture) super.submit(callable);
    }

    public final RunnableFuture newTaskFor(Callable callable) {
        return new ho7(callable);
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        ho7 ho7 = new ho7(callable);
        return new hm4(ho7, this.x.schedule(ho7, j, timeUnit));
    }
}
