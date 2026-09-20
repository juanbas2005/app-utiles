package defpackage;

/* renamed from: th  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class th extends wx3 implements gs2 {
    public final /* synthetic */ fw0 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ sl5 x;
    public final /* synthetic */ sr2 y;
    public final /* synthetic */ tl5 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public th(sl5 sl5, sr2 sr2, tl5 tl5, fw0 fw0, int i, int i2) {
        super(2);
        this.x = sl5;
        this.y = sr2;
        this.z = tl5;
        this.A = fw0;
        this.B = i;
        this.C = i2;
    }

    public final Object H(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int v = b85.v(this.B | 1);
        int i = this.C;
        vh.a(this.x, this.y, this.z, this.A, (yt2) obj, v, i);
        return vs7.a;
    }
}
