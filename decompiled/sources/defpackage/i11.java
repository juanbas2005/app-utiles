package defpackage;

/* renamed from: i11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class i11 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ qc3 x;
    public final /* synthetic */ String y;

    public /* synthetic */ i11(qc3 qc3, String str, int i) {
        this.w = i;
        this.x = qc3;
        this.y = str;
    }

    public final Object b() {
        int i = this.w;
        String str = this.y;
        qc3 qc3 = this.x;
        switch (i) {
            case b85.b:
                ua6 n = qc3.n(str);
                l55.m(n, "PRAGMA query_only = 1");
                return n;
            default:
                return qc3.n(str);
        }
    }
}
