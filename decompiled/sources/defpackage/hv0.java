package defpackage;

/* renamed from: hv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class hv0 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ rv0 x;

    public /* synthetic */ hv0(rv0 rv0, int i) {
        this.w = i;
        this.x = rv0;
    }

    public final void run() {
        int i = this.w;
        rv0 rv0 = this.x;
        switch (i) {
            case b85.b:
                rv0.l(rv0);
                return;
            default:
                rv0.invalidateOptionsMenu();
                return;
        }
    }
}
