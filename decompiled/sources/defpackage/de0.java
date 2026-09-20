package defpackage;

/* renamed from: de0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class de0 implements gs2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ hs2 C;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ sr2 x;
    public final /* synthetic */ ml4 y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ de0(sr2 sr2, fw0 fw0, ml4 ml4, boolean z2, int i, int i2) {
        this.x = sr2;
        this.C = fw0;
        this.y = ml4;
        this.z = z2;
        this.A = i;
        this.B = i2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        int i2 = this.A;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                int v = b85.v(i2 | 1);
                pv8.i(this.x, this.y, this.z, this.C, (yt2) obj, v, this.B);
                return vs7;
            default:
                ((Integer) obj2).getClass();
                int v2 = b85.v(i2 | 1);
                pv8.d(this.x, (fw0) this.C, this.y, this.z, (yt2) obj, v2, this.B);
                return vs7;
        }
    }

    public /* synthetic */ de0(sr2 sr2, ml4 ml4, boolean z2, hs2 hs2, int i, int i2) {
        this.x = sr2;
        this.y = ml4;
        this.z = z2;
        this.C = hs2;
        this.A = i;
        this.B = i2;
    }
}
