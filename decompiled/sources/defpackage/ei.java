package defpackage;

/* renamed from: ei  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ei implements gs2 {
    public final /* synthetic */ x35 A;
    public final /* synthetic */ g58 w;
    public final /* synthetic */ long x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ ml4 z;

    public /* synthetic */ ei(g58 g58, long j, boolean z2, ml4 ml4, x35 x35) {
        this.w = g58;
        this.x = j;
        this.y = z2;
        this.z = ml4;
        this.A = x35;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            t49.c(xy0.u.a(this.w), su0.J(1260045569, new gi(this.x, this.y, this.z, this.A), yt2), yt2, 56);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
