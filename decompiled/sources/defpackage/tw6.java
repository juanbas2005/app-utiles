package defpackage;

/* renamed from: tw6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class tw6 implements gs2 {
    public final /* synthetic */ tg7 A;
    public final /* synthetic */ long B;
    public final /* synthetic */ long C;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ fw0 x;
    public final /* synthetic */ gs2 y;
    public final /* synthetic */ gs2 z;

    public /* synthetic */ tw6(fw0 fw0, gs2 gs2, gs2 gs22, tg7 tg7, long j, long j2, int i) {
        this.x = fw0;
        this.y = gs2;
        this.z = gs22;
        this.A = tg7;
        this.B = j;
        this.C = j2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(1 & intValue, z2)) {
                    yt2.e0(-168956728);
                    yt2.e0(-942207887);
                    yt2 yt22 = yt2;
                    i35.b(this.x, this.y, this.z, this.A, this.B, this.C, yt22, 0);
                    yt2 yt23 = yt22;
                    yt23.r(false);
                    yt23.r(false);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                ((Integer) obj2).getClass();
                i35.b(this.x, this.y, this.z, this.A, this.B, this.C, (yt2) obj, b85.v(1));
                return vs7;
        }
    }

    public /* synthetic */ tw6(gs2 gs2, fw0 fw0, gs2 gs22, tg7 tg7, long j, long j2) {
        this.y = gs2;
        this.x = fw0;
        this.z = gs22;
        this.A = tg7;
        this.B = j;
        this.C = j2;
    }
}
