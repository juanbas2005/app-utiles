package defpackage;

/* renamed from: t85  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class t85 implements gs2 {
    public final /* synthetic */ yd7 A;
    public final /* synthetic */ pq6 B;
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ ap4 z;

    public /* synthetic */ t85(boolean z2, boolean z3, ap4 ap4, yd7 yd7, pq6 pq6, int i) {
        this.w = i;
        this.x = z2;
        this.y = z3;
        this.z = ap4;
        this.A = yd7;
        this.B = pq6;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        boolean z2 = false;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (yt2.V(intValue & 1, z2)) {
                    pe2.J.m(this.x, this.y, this.z, (ml4) null, this.A, this.B, 0.0f, 0.0f, yt2, 100663296, 200);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (yt22.V(intValue2 & 1, z2)) {
                    pe2.J.m(this.x, this.y, this.z, (ml4) null, this.A, this.B, 0.0f, 0.0f, yt22, 100663296, 200);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }
}
