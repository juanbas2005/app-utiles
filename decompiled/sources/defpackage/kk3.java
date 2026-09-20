package defpackage;

/* renamed from: kk3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class kk3 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ lk7 x;

    public /* synthetic */ kk3(lk7 lk7, int i) {
        this.w = i;
        this.x = lk7;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        jl4 jl4 = jl4.w;
        vs7 vs7 = vs7.a;
        boolean z = false;
        lk7 lk7 = this.x;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (yt2.V(intValue & 1, z)) {
                    d83.a(lk7.x, (String) null, yu6.l(jl4, 18.0f), 0, yt2, 432, 8);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (yt22.V(intValue2 & 1, z)) {
                    d83.a(lk7.w, (String) null, yu6.l(jl4, 18.0f), 0, yt22, 432, 8);
                } else {
                    yt22.Y();
                }
                return vs7;
            default:
                yt2 yt23 = (yt2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                }
                if (yt23.V(intValue3 & 1, z)) {
                    yf7.b(l55.u(lk7.y, yt23), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, ((zg4) yt23.k(ch4.b)).b.o, yt23, 0, 0, 131070);
                } else {
                    yt23.Y();
                }
                return vs7;
        }
    }
}
