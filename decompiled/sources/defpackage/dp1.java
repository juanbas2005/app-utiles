package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: dp1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dp1 implements ScheduledExecutorService, AutoCloseable {
    public final ExecutorService w;
    public final ScheduledExecutorService x;

    public dp1(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.w = executorService;
        this.x = scheduledExecutorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.w.awaitTermination(j, timeUnit);
    }

    public final /* synthetic */ void close() {
        if (this != ForkJoinPool.commonPool() && !isTerminated()) {
            shutdown();
            throw null;
        }
    }

    public final void execute(Runnable runnable) {
        this.w.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.w.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.w.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.w.isShutdown();
    }

    public final boolean isTerminated() {
        return this.w.isTerminated();
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return new fp1(new yo1(this, runnable, j, timeUnit, 0));
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new fp1(new ap1(this, runnable, j, j2, timeUnit, 0));
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new fp1(new ap1(this, runnable, j, j2, timeUnit, 1));
    }

    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final Future submit(Callable callable) {
        return this.w.submit(callable);
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.w.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.w.invokeAny(collection, j, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.w.submit(runnable, obj);
    }

    public final Future submit(Runnable runnable) {
        return this.w.submit(runnable);
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return new fp1(new yo1(this, callable, j, timeUnit, 1));
    }
}
