package defpackage;

/* renamed from: o91  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class o91 implements Runnable {
    public final /* synthetic */ p91 w;
    public final /* synthetic */ long x;
    public final /* synthetic */ String y;

    public /* synthetic */ o91(p91 p91, long j, String str) {
        this.w = p91;
        this.x = j;
        this.y = str;
    }

    public final void run() {
        k91 k91 = this.w.g;
        xa1 xa1 = k91.n;
        if (xa1 == null || !xa1.e.get()) {
            ((zc2) k91.i.y).g(this.x, this.y);
        }
    }
}
