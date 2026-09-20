package defpackage;

/* renamed from: ol5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ol5 extends wx3 implements sr2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ g06 x;
    public final /* synthetic */ pl5 y;
    public final /* synthetic */ se3 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ol5(g06 g06, pl5 pl5, se3 se3, long j, long j2) {
        super(0);
        this.x = g06;
        this.y = pl5;
        this.z = se3;
        this.A = j;
        this.B = j2;
    }

    public final Object b() {
        pl5 pl5 = this.y;
        this.x.w = pl5.getPositionProvider().y(this.z, this.A, pl5.getParentLayoutDirection(), this.B);
        return vs7.a;
    }
}
