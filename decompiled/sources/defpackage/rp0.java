package defpackage;

/* renamed from: rp0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class rp0 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ gs2 y;

    public /* synthetic */ rp0(long j, gs2 gs2, int i) {
        this.w = 3;
        this.x = j;
        this.y = gs2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.w;
        boolean z3 = false;
        vs7 vs7 = vs7.a;
        gs2 gs2 = this.y;
        long j = this.x;
        yt2 yt2 = (yt2) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case b85.b:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                if (yt2.V(intValue & 1, z3)) {
                    t49.c(b81.g(j, j41.a), gs2, yt2, 8);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                int intValue2 = num.intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue2 & 1, z)) {
                    g75.e(j, gs2, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 2:
                int intValue3 = num.intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue3 & 1, z2)) {
                    g75.e(j, gs2, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                num.getClass();
                g75.e(j, gs2, yt2, b85.v(1));
                return vs7;
        }
    }

    public /* synthetic */ rp0(long j, gs2 gs2, int i, byte b) {
        this.w = i;
        this.x = j;
        this.y = gs2;
    }
}
