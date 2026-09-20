package defpackage;

/* renamed from: c41  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class c41 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ru4 x;

    public /* synthetic */ c41(ru4 ru4, int i) {
        this.w = i;
        this.x = ru4;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        boolean z = false;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (yt2.V(intValue & 1, z)) {
                    fw0 fw0 = gl0.g;
                    fw0 J = su0.J(945448712, new c41(this.x, 1), yt2);
                    pa5 pa5 = gk7.a;
                    long j = x08.a;
                    long j2 = jt0.g;
                    fk7 a = gk7.a(((zg4) yt2.k(ch4.b)).a);
                    vn.a(fw0, (ml4) null, J, (hs2) null, 0.0f, (aa8) null, a.a(j, j2, j2, j2, j2, a.f), (la5) null, yt2, 390, 442);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (yt22.V(intValue2 & 1, z)) {
                    hj8.e(this.x, (ml4) null, false, (a83) null, (pq6) null, gl0.h, yt22, 1572864, 62);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }
}
