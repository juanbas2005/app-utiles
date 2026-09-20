package defpackage;

/* renamed from: k67  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k67 implements hs2 {
    public final /* synthetic */ j51 A;
    public final /* synthetic */ av6 w;
    public final /* synthetic */ fw0 x;
    public final /* synthetic */ qt y;
    public final /* synthetic */ jb z;

    public k67(av6 av6, fw0 fw0, qt qtVar, jb jbVar, j51 j51) {
        this.w = av6;
        this.x = fw0;
        this.y = qtVar;
        this.z = jbVar;
        this.A = j51;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i;
        sb0 sb0 = (sb0) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 14) == 0) {
            if (yt2.g(sb0)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 91) != 18 || !yt2.F()) {
            long j = sb0.b;
            d37 d37 = ((o31) this.w).w;
            k31 k31 = new k31(j);
            d37.getClass();
            d37.l((Object) null, k31);
            this.x.u(new tx5(sb0, this.y, this.z, this.A), yt2, 0);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
