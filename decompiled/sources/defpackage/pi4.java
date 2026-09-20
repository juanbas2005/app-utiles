package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: pi4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pi4 {
    public static final rg f = rg.d();
    public final ScheduledExecutorService a;
    public final ConcurrentLinkedQueue b;
    public final Runtime c;
    public ScheduledFuture d = null;
    public long e = -1;

    public pi4() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.a = newSingleThreadScheduledExecutor;
        this.b = new ConcurrentLinkedQueue();
        this.c = runtime;
    }

    public final synchronized void a(long j, ui7 ui7) {
        try {
            this.e = j;
            this.d = this.a.scheduleAtFixedRate(new oi4(this, ui7, 0), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            RejectedExecutionException rejectedExecutionException = e2;
            rg rgVar = f;
            rgVar.f("Unable to start collecting Memory Metrics: " + rejectedExecutionException.getMessage());
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final tg b(ui7 ui7) {
        if (ui7 == null) {
            return null;
        }
        long b2 = ui7.b() + ui7.w;
        sg u = tg.u();
        u.h();
        tg.s((tg) u.x, b2);
        Runtime runtime = this.c;
        int G = jb5.G((hl6.d(5) * (runtime.totalMemory() - runtime.freeMemory())) / 1024);
        u.h();
        tg.t((tg) u.x, G);
        return (tg) u.g();
    }
}
