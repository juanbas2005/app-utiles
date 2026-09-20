package defpackage;

/* renamed from: bp1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class bp1 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ dp1 x;
    public final /* synthetic */ Runnable y;
    public final /* synthetic */ ji8 z;

    public /* synthetic */ bp1(dp1 dp1, Runnable runnable, ji8 ji8, int i) {
        this.w = i;
        this.x = dp1;
        this.y = runnable;
        this.z = ji8;
    }

    public final void run() {
        int i = this.w;
        ji8 ji8 = this.z;
        Runnable runnable = this.y;
        dp1 dp1 = this.x;
        switch (i) {
            case b85.b:
                dp1.w.execute(new zo1(runnable, ji8, 0));
                return;
            case 1:
                dp1.w.execute(new zo1(runnable, ji8, 2));
                return;
            default:
                dp1.w.execute(new zo1(runnable, ji8, 1));
                return;
        }
    }
}
