package defpackage;

/* renamed from: c34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class c34 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ d34 x;

    public /* synthetic */ c34(d34 d34, int i) {
        this.w = i;
        this.x = d34;
    }

    public final Object b() {
        int i = this.w;
        d34 d34 = this.x;
        switch (i) {
            case b85.b:
                return Float.valueOf(d34.L.b());
            case 1:
                return Float.valueOf(d34.L.d());
            default:
                return Float.valueOf((float) (d34.L.a() - d34.L.c()));
        }
    }
}
