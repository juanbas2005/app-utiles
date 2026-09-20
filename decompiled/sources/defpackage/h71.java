package defpackage;

/* renamed from: h71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class h71 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ int z;

    public /* synthetic */ h71(lu6 lu6, boolean z2, sr2 sr2, pq6 pq6, ml4 ml4, boolean z3, vi6 vi6, ua0 ua0, la5 la5, gs2 gs2, fw0 fw0, int i) {
        this.A = lu6;
        this.x = z2;
        this.B = sr2;
        this.C = pq6;
        this.D = ml4;
        this.y = z3;
        this.E = vi6;
        this.F = ua0;
        this.G = la5;
        this.H = gs2;
        this.I = fw0;
        this.z = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0109, code lost:
        if (r6 != false) goto L_0x010d;
     */
    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        boolean z3 = true;
        Object obj3 = this.I;
        Object obj4 = this.H;
        Object obj5 = this.G;
        Object obj6 = this.F;
        Object obj7 = this.E;
        Object obj8 = this.D;
        Object obj9 = this.C;
        Object obj10 = this.B;
        Object obj11 = this.A;
        switch (i) {
            case b85.b:
                ze7 ze7 = (ze7) obj11;
                u44 u44 = (u44) obj10;
                w98 w98 = (w98) obj9;
                o81 o81 = (o81) obj8;
                vr2 vr2 = (vr2) obj7;
                hf7 hf7 = (hf7) obj6;
                v35 v35 = (v35) obj5;
                tp1 tp1 = (tp1) obj4;
                yb0 yb0 = (yb0) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    p71 p71 = new p71(u44, ze7, w98, o81, vr2, hf7, v35, tp1, yb0, this.z);
                    ze7 ze72 = ze7;
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E2 = gw8.E(yt2, jl4.w);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(tx0.f, yt2, p71);
                    g75.Q(tx0.e, yt2, m);
                    g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
                    g75.O(yt2, tx0.h);
                    g75.Q(tx0.d, yt2, E2);
                    yt2.r(true);
                    ey2 a = u44.a();
                    ey2 ey2 = ey2.w;
                    boolean z4 = this.x;
                    if (!(a == ey2 || u44.c() == null)) {
                        dy3 c = u44.c();
                        c.getClass();
                        if (c.n()) {
                        }
                    }
                    z3 = false;
                    pv8.j(ze72, z3, yt2, 0);
                    if (u44.a() != ey2.y || this.y || !z4) {
                        yt2.e0(-713663782);
                        yt2.r(false);
                    } else {
                        yt2.e0(-713740662);
                        pv8.k(ze72, yt2, 0);
                        yt2.r(false);
                    }
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                ((Integer) obj2).getClass();
                t35.a((lu6) obj11, this.x, (sr2) obj10, (pq6) obj9, (ml4) obj8, this.y, (vi6) obj7, (ua0) obj6, (la5) obj5, (gs2) obj4, (fw0) obj3, (yt2) obj, b85.v(this.z | 1));
                return vs7;
        }
    }

    public /* synthetic */ h71(ze7 ze7, u44 u44, boolean z2, boolean z3, w98 w98, o81 o81, vr2 vr2, hf7 hf7, v35 v35, tp1 tp1, yb0 yb0, int i) {
        this.A = ze7;
        this.B = u44;
        this.x = z2;
        this.y = z3;
        this.C = w98;
        this.D = o81;
        this.E = vr2;
        this.F = hf7;
        this.G = v35;
        this.H = tp1;
        this.I = yb0;
        this.z = i;
    }
}
