package defpackage;

/* renamed from: h92  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class h92 implements gs2 {
    public final /* synthetic */ p92 A;
    public final /* synthetic */ gh6 B;
    public final /* synthetic */ pq6 C;
    public final /* synthetic */ long D;
    public final /* synthetic */ float E;
    public final /* synthetic */ fw0 F;
    public final /* synthetic */ o92 w;
    public final /* synthetic */ ml4 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ dq4 z;

    public /* synthetic */ h92(o92 o92, ml4 ml4, boolean z2, dq4 dq4, p92 p92, gh6 gh6, pq6 pq6, long j, float f, fw0 fw0) {
        this.w = o92;
        this.x = ml4;
        this.y = z2;
        this.z = dq4;
        this.A = p92;
        this.B = gh6;
        this.C = pq6;
        this.D = j;
        this.E = f;
        this.F = fw0;
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
            o92 o92 = this.w;
            ml4 D2 = we.D(this.x, new n92(this.y, o92.j, o92.k));
            p92 p92 = this.A;
            boolean g = yt2.g(p92);
            Object Q = yt2.Q();
            if (g || Q == ay0.a) {
                Q = new zh(13, (Object) p92);
                yt2.o0(Q);
            }
            fj4.a(D2, this.z, (sr2) Q, this.B, this.C, this.D, this.E, this.F, yt2, 0);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
