package defpackage;

/* renamed from: pc4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class pc4 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ wd7 x;

    public /* synthetic */ pc4(wd7 wd7, int i) {
        this.w = i;
        this.x = wd7;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        wd7 wd7 = this.x;
        switch (i) {
            case b85.b:
                wd7.b();
                return vs7;
            default:
                wd7.onCancel();
                return vs7;
        }
    }
}
