package defpackage;

/* renamed from: bh4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class bh4 implements gs2 {
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ qt0 x;
    public final /* synthetic */ br7 y;
    public final /* synthetic */ fw0 z;

    public /* synthetic */ bh4(qt0 qt0, br7 br7, fw0 fw0) {
        this.x = qt0;
        this.y = br7;
        this.z = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        br7 br7 = this.y;
        qt0 qt0 = this.x;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    if (qt0 == null) {
                        t37 t37 = st0.a;
                        qt0 = st0.f(0, 0, 0, ac5.G, 0, 0, 0, 0, ac5.N, 0, 0, 0, ac5.U, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ac5.d, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -33558793, 65535);
                    }
                    qt0 qt02 = qt0;
                    sm4 sm4 = sm4.a;
                    gr6 gr6 = new gr6();
                    if (br7 == null) {
                        br7 = new br7();
                    }
                    ch4.b(qt02, sm4, gr6, br7, this.z, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                ((Integer) obj2).getClass();
                ch4.a(qt0, br7, this.z, (yt2) obj, b85.v(1));
                return vs7;
        }
    }

    public /* synthetic */ bh4(qt0 qt0, br7 br7, fw0 fw0, int i) {
        this.x = qt0;
        this.y = br7;
        this.z = fw0;
    }
}
