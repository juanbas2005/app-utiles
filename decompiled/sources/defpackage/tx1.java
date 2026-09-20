package defpackage;

/* renamed from: tx1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tx1 extends wx3 implements vr2 {
    public final /* synthetic */ int x = 1;
    public final /* synthetic */ d06 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tx1(f96 f96, ux1 ux1, d06 d06) {
        super(1);
        this.y = d06;
    }

    public final Object y(Object obj) {
        int i = this.x;
        kn7 kn7 = kn7.w;
        d06 d06 = this.y;
        switch (i) {
            case b85.b:
                ux1 ux1 = (ux1) obj;
                if (!ux1.J) {
                    return kn7.x;
                }
                if (ux1.L != null) {
                    yb3.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                ux1.L = null;
                d06.w = d06.w;
                return kn7;
            default:
                if (!((q23) obj).M) {
                    return kn7;
                }
                d06.w = false;
                return kn7.y;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tx1(d06 d06) {
        super(1);
        this.y = d06;
    }
}
