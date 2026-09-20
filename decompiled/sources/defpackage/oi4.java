package defpackage;

/* renamed from: oi4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class oi4 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ pi4 x;
    public final /* synthetic */ ui7 y;

    public /* synthetic */ oi4(pi4 pi4, ui7 ui7, int i) {
        this.w = i;
        this.x = pi4;
        this.y = ui7;
    }

    public final void run() {
        int i = this.w;
        ui7 ui7 = this.y;
        pi4 pi4 = this.x;
        switch (i) {
            case b85.b:
                tg b = pi4.b(ui7);
                if (b != null) {
                    pi4.b.add(b);
                    return;
                }
                return;
            default:
                tg b2 = pi4.b(ui7);
                if (b2 != null) {
                    pi4.b.add(b2);
                    return;
                }
                return;
        }
    }
}
