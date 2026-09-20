package defpackage;

/* renamed from: fe0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class fe0 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ fw0 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int w;
    public final /* synthetic */ sr2 x;
    public final /* synthetic */ ml4 y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ fe0(sr2 sr2, fw0 fw0, ml4 ml4, boolean z2, gs2 gs2, int i, int i2) {
        this.w = 2;
        this.x = sr2;
        this.B = fw0;
        this.y = ml4;
        this.z = z2;
        this.A = gs2;
        this.C = i;
        this.D = i2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        int i2 = this.C;
        Object obj3 = this.A;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                int v = b85.v(i2 | 1);
                pv8.h(this.x, this.y, this.z, (la5) obj3, this.B, (yt2) obj, v, this.D);
                return vs7;
            case 1:
                ((Integer) obj2).getClass();
                int v2 = b85.v(i2 | 1);
                pv8.e(this.x, this.y, this.z, (la5) obj3, this.B, (yt2) obj, v2, this.D);
                return vs7;
            default:
                ((Integer) obj2).getClass();
                int v3 = b85.v(i2 | 1);
                pv8.g(this.x, this.B, this.y, this.z, (gs2) obj3, (yt2) obj, v3, this.D);
                return vs7;
        }
    }

    public /* synthetic */ fe0(sr2 sr2, ml4 ml4, boolean z2, la5 la5, fw0 fw0, int i, int i2, int i3) {
        this.w = i3;
        this.x = sr2;
        this.y = ml4;
        this.z = z2;
        this.A = la5;
        this.B = fw0;
        this.C = i;
        this.D = i2;
    }
}
