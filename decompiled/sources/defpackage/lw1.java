package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: lw1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lw1 implements mw1 {
    public final ScheduledFuture w;

    public lw1(ScheduledFuture scheduledFuture) {
        this.w = scheduledFuture;
    }

    public final void b() {
        this.w.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.w + ']';
    }
}
