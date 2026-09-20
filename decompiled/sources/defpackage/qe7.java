package defpackage;

/* renamed from: qe7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class qe7 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ se7 x;

    public /* synthetic */ qe7(se7 se7, int i) {
        this.w = i;
        this.x = se7;
    }

    public final Object b() {
        int i = this.w;
        boolean z = false;
        se7 se7 = this.x;
        switch (i) {
            case b85.b:
                if (se7.a.d() < se7.b.d()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (se7.a.d() > 0.0f) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
