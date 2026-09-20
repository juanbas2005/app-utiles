package defpackage;

/* renamed from: ah4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ah4 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ br7 x;
    public final /* synthetic */ fw0 y;

    public /* synthetic */ ah4(br7 br7, fw0 fw0, int i) {
        this.w = i;
        this.x = br7;
        this.y = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        int i = this.w;
        vs7 vs7 = vs7.a;
        boolean z2 = false;
        fw0 fw0 = this.y;
        br7 br7 = this.x;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case b85.b /*0*/:
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (yt2.V(intValue & 1, z2)) {
                    sm5.a(su0.J(-241536773, new ah4(br7, fw0, 1), yt2), yt2, 6);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    yf7.a(br7.j, fw0, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
        }
    }
}
