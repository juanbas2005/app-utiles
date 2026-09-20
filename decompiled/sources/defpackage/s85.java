package defpackage;

/* renamed from: s85  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class s85 implements hs2 {
    public final /* synthetic */ ap4 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ gs2 C;
    public final /* synthetic */ gs2 D;
    public final /* synthetic */ gs2 E;
    public final /* synthetic */ gs2 F;
    public final /* synthetic */ gs2 G;
    public final /* synthetic */ yd7 H;
    public final /* synthetic */ pq6 I;
    public final /* synthetic */ String w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ m78 z;

    public /* synthetic */ s85(String str, boolean z2, boolean z3, m78 m78, ap4 ap4, boolean z4, gs2 gs2, gs2 gs22, gs2 gs23, gs2 gs24, gs2 gs25, yd7 yd7, pq6 pq6) {
        this.w = str;
        this.x = z2;
        this.y = z3;
        this.z = m78;
        this.A = ap4;
        this.B = z4;
        this.C = gs2;
        this.D = gs22;
        this.E = gs23;
        this.F = gs24;
        this.G = gs25;
        this.H = yd7;
        this.I = pq6;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z2;
        int i;
        gs2 gs2 = (gs2) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (yt2.i(gs2)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            pe2 pe2 = pe2.J;
            boolean z3 = this.x;
            boolean z4 = this.B;
            ap4 ap4 = this.A;
            yd7 yd7 = this.H;
            fw0 J = su0.J(-656940872, new t85(z3, z4, ap4, yd7, this.I, 0), yt2);
            int i2 = (intValue << 3) & 112;
            yt2 yt22 = yt2;
            pe2 pe22 = pe2;
            pe2 pe23 = pe22;
            boolean z5 = z3;
            pe2 pe24 = pe23;
            pe2 pe25 = pe24;
            pe2 pe26 = pe25;
            pe2 pe27 = pe26;
            pe27.n(this.w, gs2, z5, this.y, this.z, ap4, z4, this.C, this.D, this.E, this.F, this.G, yd7, (la5) null, J, yt22, i2);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
