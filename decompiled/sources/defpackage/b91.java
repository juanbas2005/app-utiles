package defpackage;

/* renamed from: b91  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class b91 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ c91 x;
    public final /* synthetic */ ui7 y;

    public /* synthetic */ b91(c91 c91, ui7 ui7, int i) {
        this.w = i;
        this.x = c91;
        this.y = ui7;
    }

    public final void run() {
        int i = this.w;
        ui7 ui7 = this.y;
        c91 c91 = this.x;
        switch (i) {
            case b85.b:
                e91 b = c91.b(ui7);
                if (b != null) {
                    c91.a.add(b);
                    return;
                }
                return;
            default:
                e91 b2 = c91.b(ui7);
                if (b2 != null) {
                    c91.a.add(b2);
                    return;
                }
                return;
        }
    }
}
