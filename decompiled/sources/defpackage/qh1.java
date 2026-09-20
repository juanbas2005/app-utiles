package defpackage;

/* renamed from: qh1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class qh1 implements gs2 {
    public final /* synthetic */ kg1 A;
    public final /* synthetic */ vh0 B;
    public final /* synthetic */ re3 C;
    public final /* synthetic */ ig1 D;
    public final /* synthetic */ ok2 E;
    public final /* synthetic */ sr2 F;
    public final /* synthetic */ sr2 G;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ ml4 x;
    public final /* synthetic */ long y;
    public final /* synthetic */ vr2 z;

    public /* synthetic */ qh1(vh0 vh0, long j, re3 re3, ml4 ml4, ig1 ig1, sr2 sr2, sr2 sr22, ok2 ok2, vr2 vr2, kg1 kg1) {
        this.B = vh0;
        this.y = j;
        this.C = re3;
        this.x = ml4;
        this.D = ig1;
        this.F = sr2;
        this.G = sr22;
        this.E = ok2;
        this.z = vr2;
        this.A = kg1;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
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
                    vh0 vh0 = this.B;
                    int i2 = vh0.g(vh0.h()).a;
                    int i3 = vh0.f(this.y).a;
                    re3 re3 = this.C;
                    n04 a = q04.a(Math.max(0, (i3 - re3.w) - 3), 2, yt2);
                    ox2 ox2 = new ox2(3);
                    ig1 ig1 = this.D;
                    ml4 h = b96.h(this.x, ig1.a, gr8.h);
                    ur urVar = new ur(gi1.d, true, new h(2));
                    sr2 sr2 = this.F;
                    sr2 sr22 = this.G;
                    ok2 ok2 = this.E;
                    boolean i4 = yt2.i(re3) | yt2.i(vh0) | yt2.g(sr2) | yt2.g(sr22) | yt2.e(i3) | yt2.g(ok2) | yt2.e(i2);
                    vr2 vr2 = this.z;
                    kg1 kg1 = this.A;
                    boolean g = i4 | yt2.g(vr2) | yt2.g(kg1) | yt2.g(ig1);
                    Object Q = yt2.Q();
                    if (g || Q == ay0.a) {
                        Q = new th1(re3, vh0, sr2, sr22, i3, ok2, i2, vr2, kg1, ig1);
                        yt2.o0(Q);
                    }
                    ox2 ox22 = ox2;
                    ed1.d(ox22, h, a, (la5) null, urVar, wr.f, (eh2) null, false, (xf) null, (vr2) Q, yt2, 1769472, 920);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                ((Integer) obj2).getClass();
                gi1.n(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (yt2) obj, b85.v(7));
                return vs7;
        }
    }

    public /* synthetic */ qh1(ml4 ml4, long j, vr2 vr2, kg1 kg1, vh0 vh0, re3 re3, ig1 ig1, ok2 ok2, sr2 sr2, sr2 sr22, int i) {
        this.x = ml4;
        this.y = j;
        this.z = vr2;
        this.A = kg1;
        this.B = vh0;
        this.C = re3;
        this.D = ig1;
        this.E = ok2;
        this.F = sr2;
        this.G = sr22;
    }
}
