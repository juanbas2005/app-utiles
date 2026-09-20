package defpackage;

/* renamed from: i17  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class i17 implements gs2 {
    public final /* synthetic */ aq4 A;
    public final /* synthetic */ aq4 B;
    public final /* synthetic */ aq4 C;
    public final /* synthetic */ aq4 D;
    public final /* synthetic */ aq4 E;
    public final /* synthetic */ vr2 w;
    public final /* synthetic */ aq4 x;
    public final /* synthetic */ aq4 y;
    public final /* synthetic */ aq4 z;

    public /* synthetic */ i17(vr2 vr2, aq4 aq4, aq4 aq42, aq4 aq43, aq4 aq44, aq4 aq45, aq4 aq46, aq4 aq47, aq4 aq48) {
        this.w = vr2;
        this.x = aq4;
        this.y = aq42;
        this.z = aq43;
        this.A = aq44;
        this.B = aq45;
        this.C = aq46;
        this.D = aq47;
        this.E = aq48;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            vr2 vr2 = this.w;
            boolean g = yt2.g(vr2);
            Object Q = yt2.Q();
            aq4 aq4 = this.x;
            aq4 aq42 = this.A;
            if (g || Q == ay0.a) {
                k17 k17 = new k17(vr2, aq4, this.y, this.z, aq42, this.B, this.C, this.D, this.E);
                yt2.o0(k17);
                Q = k17;
            }
            sr2 sr2 = (sr2) Q;
            if (d57.I0((String) aq4.getValue()) || d57.I0((String) aq42.getValue())) {
                z3 = false;
            } else {
                z3 = true;
            }
            gw8.e(sr2, (ml4) null, z3, (pq6) null, (xd0) null, (la5) null, rc9.g, yt2, 805306368, 506);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
