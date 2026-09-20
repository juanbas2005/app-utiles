package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: y02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum y02 {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    
    public final TimeUnit w;

    /* access modifiers changed from: public */
    y02(TimeUnit timeUnit) {
        this.w = timeUnit;
    }
}
