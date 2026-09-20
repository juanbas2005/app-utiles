package defpackage;

/* renamed from: zi6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class zi6 implements gs2 {
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ gs2 x;
    public final /* synthetic */ fw0 y;
    public final /* synthetic */ la5 z;

    public /* synthetic */ zi6(gs2 gs2, fw0 fw0, la5 la5) {
        this.x = gs2;
        this.y = fw0;
        this.z = la5;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        la5 la5 = this.z;
        fw0 fw0 = this.y;
        gs2 gs2 = this.x;
        yt2 yt2 = (yt2) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case b85.b:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    t35.b(gs2, fw0, la5, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                num.getClass();
                t35.b(gs2, fw0, la5, yt2, b85.v(1));
                return vs7;
        }
    }

    public /* synthetic */ zi6(gs2 gs2, fw0 fw0, la5 la5, int i) {
        this.x = gs2;
        this.y = fw0;
        this.z = la5;
    }
}
