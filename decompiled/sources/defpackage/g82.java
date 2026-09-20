package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: g82  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g82 extends f82 implements so1 {
    public final Executor y;

    public g82(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        this.y = executor;
        Method method = fz0.a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null) {
                Method method2 = fz0.a;
                if (method2 != null) {
                    method2.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void D(e81 e81, Runnable runnable) {
        try {
            this.y.execute(runnable);
        } catch (RejectedExecutionException e) {
            r16.u(e81, rc9.b("The task was rejected", e));
            dn1 dn1 = aw1.a;
            cm1.y.D(e81, runnable);
        }
    }

    public final mw1 a(long j, si7 si7, e81 e81) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.y;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(si7, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                r16.u(e81, rc9.b("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            return new lw1(scheduledFuture);
        }
        return ol1.H.a(j, si7, e81);
    }

    public final void close() {
        ExecutorService executorService;
        Executor executor = this.y;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g82) || ((g82) obj).y != this.y) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.y);
    }

    public final void k(long j, kk0 kk0) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.y;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            nt2 nt2 = new nt2(10, (Object) this, (Object) kk0);
            e81 e81 = kk0.A;
            try {
                scheduledFuture = scheduledExecutorService.schedule(nt2, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                r16.u(e81, rc9.b("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            kk0.y(new fk0(0, scheduledFuture));
        } else {
            ol1.H.k(j, kk0);
        }
    }

    public final String toString() {
        return this.y.toString();
    }
}
