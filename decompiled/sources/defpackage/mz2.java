package defpackage;

/* renamed from: mz2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class mz2 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ nz2 x;

    public /* synthetic */ mz2(nz2 nz2, int i) {
        this.w = i;
        this.x = nz2;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        nz2 nz2 = this.x;
        switch (i) {
            case b85.b:
                if (nz2.R != null) {
                    return vs7;
                }
                throw f21.p("Font resolution state is not set.");
            default:
                if (nz2.R != null) {
                    return vs7;
                }
                throw f21.p("Font resolution state is not set.");
        }
    }
}
