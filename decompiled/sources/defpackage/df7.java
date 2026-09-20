package defpackage;

/* renamed from: df7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class df7 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ze7 x;

    public /* synthetic */ df7(ze7 ze7, int i) {
        this.w = i;
        this.x = ze7;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        ze7 ze7 = this.x;
        switch (i) {
            case b85.b:
                return Boolean.valueOf(!ze7.B);
            case 1:
                hf7 e = ze7.e(ze7.n().a, i95.a(0, ze7.n().a.x.length()));
                ze7.c.y(e);
                long j = e.b;
                ze7.w = new lg7(j);
                ze7.u = hf7.a(ze7.u, (vl) null, j, 5);
                ze7.h(true);
                return vs7;
            default:
                sr2 sr2 = ze7.g;
                if (sr2 != null) {
                    sr2.b();
                }
                return vs7;
        }
    }
}
