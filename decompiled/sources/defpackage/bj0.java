package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: bj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bj0 implements ListenableFuture {
    public final WeakReference w;
    public final aj0 x = new aj0(this);

    public bj0(yi0 yi0) {
        this.w = new WeakReference(yi0);
    }

    public final void a(Runnable runnable, Executor executor) {
        this.x.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        yi0 yi0 = (yi0) this.w.get();
        boolean cancel = this.x.cancel(z);
        if (cancel && yi0 != null) {
            yi0.a = null;
            yi0.b = null;
            yi0.c.j((Object) null);
        }
        return cancel;
    }

    public final Object get() {
        return this.x.get();
    }

    public final boolean isCancelled() {
        return this.x.w instanceof t2;
    }

    public final boolean isDone() {
        return this.x.isDone();
    }

    public final String toString() {
        return this.x.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.x.get(j, timeUnit);
    }
}
