package defpackage;

/* renamed from: qd4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class qd4 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ rd4 x;

    public /* synthetic */ qd4(rd4 rd4, int i) {
        this.w = i;
        this.x = rd4;
    }

    public final Object b() {
        long j;
        int i = this.w;
        rd4 rd4 = this.x;
        switch (i) {
            case b85.b:
                rd4.X0();
                return vs7.a;
            case 1:
                return new l35(rd4.S);
            default:
                dy3 dy3 = (dy3) rd4.Q.getValue();
                if (dy3 != null) {
                    j = dy3.R(0);
                } else {
                    j = 9205357640488583168L;
                }
                return new l35(j);
        }
    }
}
