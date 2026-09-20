package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: op2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class op2 extends yj2 {
    public final ListenableFuture E;

    public op2(ListenableFuture listenableFuture) {
        this.E = listenableFuture;
    }

    public final void a(Runnable runnable, Executor executor) {
        this.E.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.E.cancel(z);
    }

    public final Object get() {
        return this.E.get();
    }

    public final boolean isCancelled() {
        return this.E.isCancelled();
    }

    public final boolean isDone() {
        return this.E.isDone();
    }

    public final String toString() {
        return this.E.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.E.get(j, timeUnit);
    }
}
