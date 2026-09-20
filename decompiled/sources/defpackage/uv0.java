package defpackage;

/* renamed from: uv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class uv0 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ vv0 x;

    public /* synthetic */ uv0(vv0 vv0, int i) {
        this.w = i;
        this.x = vv0;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [zv4, java.lang.Object] */
    public final Object b() {
        int i = this.w;
        vv0 vv0 = this.x;
        switch (i) {
            case b85.b:
                ? obj = new Object();
                vv0.getNavigationEventDispatcher().b(obj);
                return obj;
            default:
                return new v45(new y0(11, vv0));
        }
    }
}
