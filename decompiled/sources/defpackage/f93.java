package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: f93  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f93 implements ListenableFuture {
    public static final f93 x = new f93((Object) null);
    public static final Logger y = Logger.getLogger(f93.class.getName());
    public final Object w;

    public f93(Object obj) {
        this.w = obj;
    }

    public final void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 57);
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            y.log(level, sb.toString(), e);
        }
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.w;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.w);
        StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(obj).length() + 27);
        sb.append(obj);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }

    public final Object get() {
        return this.w;
    }
}
