package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: hm4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hm4 implements ScheduledFuture, ListenableFuture, Future {
    public final x1 w;
    public final ScheduledFuture x;

    public hm4(x1 x1Var, ScheduledFuture scheduledFuture) {
        this.w = x1Var;
        this.x = scheduledFuture;
    }

    public final void a(Runnable runnable, Executor executor) {
        this.w.a(runnable, executor);
    }

    public final boolean b(boolean z) {
        return this.w.cancel(z);
    }

    public final boolean cancel(boolean z) {
        boolean b = b(z);
        if (b) {
            this.x.cancel(z);
        }
        return b;
    }

    public final int compareTo(Object obj) {
        return this.x.compareTo((Delayed) obj);
    }

    public final Object get() {
        return this.w.get();
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.x.getDelay(timeUnit);
    }

    public final boolean isCancelled() {
        return this.w.isCancelled();
    }

    public final boolean isDone() {
        return this.w.isDone();
    }

    public final String toString() {
        return this.w.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.w.get(j, timeUnit);
    }
}
