package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: ya1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ya1 implements Executor {
    public final ExecutorService w;
    public final Object x = new Object();
    public yb9 y = b35.l((Object) null);

    public ya1(ExecutorService executorService) {
        this.w = executorService;
    }

    public final yb9 a(Runnable runnable) {
        yb9 g;
        synchronized (this.x) {
            g = this.y.g(this.w, new c9(6, runnable));
            this.y = g;
        }
        return g;
    }

    public final yb9 b(Callable callable) {
        yb9 g;
        synchronized (this.x) {
            g = this.y.g(this.w, new c9(5, callable));
            this.y = g;
        }
        return g;
    }

    public final void execute(Runnable runnable) {
        this.w.execute(runnable);
    }
}
