package defpackage;

/* renamed from: gw4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gw4 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ fw0 y;

    public /* synthetic */ gw4(long j, fw0 fw0, int i) {
        this.w = i;
        this.x = j;
        this.y = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        boolean z = false;
        fw0 fw0 = this.y;
        long j = this.x;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case b85.b:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (yt2.V(intValue & 1, z)) {
                    t49.c(b81.g(j, j41.a), fw0, yt2, 8);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (yt2.V(intValue & 1, z)) {
                    t49.c(b81.g(j, j41.a), fw0, yt2, 8);
                } else {
                    yt2.Y();
                }
                return vs7;
        }
    }
}
