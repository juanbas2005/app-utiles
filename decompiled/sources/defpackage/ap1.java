package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ap1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ap1 implements ep1 {
    public final /* synthetic */ long A;
    public final /* synthetic */ TimeUnit B;
    public final /* synthetic */ int w;
    public final /* synthetic */ dp1 x;
    public final /* synthetic */ Runnable y;
    public final /* synthetic */ long z;

    public /* synthetic */ ap1(dp1 dp1, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.w = i;
        this.x = dp1;
        this.y = runnable;
        this.z = j;
        this.A = j2;
        this.B = timeUnit;
    }

    public final ScheduledFuture a(ji8 ji8) {
        int i = this.w;
        Runnable runnable = this.y;
        dp1 dp1 = this.x;
        switch (i) {
            case b85.b /*0*/:
                return dp1.x.scheduleAtFixedRate(new bp1(dp1, runnable, ji8, 0), this.z, this.A, this.B);
            default:
                return dp1.x.scheduleWithFixedDelay(new bp1(dp1, runnable, ji8, 2), this.z, this.A, this.B);
        }
    }
}
