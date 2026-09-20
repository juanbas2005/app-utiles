package defpackage;

/* renamed from: nf  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nf extends wx3 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ gs2 B;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf(Object obj, Object obj2, gs2 gs2, int i, int i2) {
        super(2);
        this.x = i2;
        this.z = obj;
        this.A = obj2;
        this.B = gs2;
        this.y = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.x;
        vs7 vs7 = vs7.a;
        int i2 = this.y;
        gs2 gs2 = this.B;
        Object obj3 = this.A;
        Object obj4 = this.z;
        yt2 yt2 = (yt2) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case b85.b:
                h03.c((sr2) obj4, (wu1) obj3, (fw0) gs2, yt2, b85.v(i2 | 1));
                return vs7;
            default:
                m67.b((p67) obj4, (ml4) obj3, gs2, yt2, b85.v(i2 | 1));
                return vs7;
        }
    }
}
