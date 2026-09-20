package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: fp1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fp1 extends z2 implements ScheduledFuture {
    public final ScheduledFuture D;

    public fp1(ep1 ep1) {
        this.D = ep1.a(new ji8(18, (Object) this));
    }

    public final void c() {
        boolean z;
        ScheduledFuture scheduledFuture = this.D;
        Object obj = this.w;
        if (!(obj instanceof t2) || !((t2) obj).a) {
            z = false;
        } else {
            z = true;
        }
        scheduledFuture.cancel(z);
    }

    public final int compareTo(Object obj) {
        return this.D.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.D.getDelay(timeUnit);
    }
}
