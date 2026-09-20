package defpackage;

/* renamed from: va  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class va implements gs2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ fw0 E;
    public final /* synthetic */ gs2 F;
    public final /* synthetic */ gs2 w;
    public final /* synthetic */ gs2 x;
    public final /* synthetic */ gs2 y;
    public final /* synthetic */ pq6 z;

    public /* synthetic */ va(gs2 gs2, gs2 gs22, gs2 gs23, pq6 pq6, long j, long j2, long j3, long j4, fw0 fw0, gs2 gs24) {
        this.w = gs2;
        this.x = gs22;
        this.y = gs23;
        this.z = pq6;
        this.A = j;
        this.B = j2;
        this.C = j3;
        this.D = j4;
        this.E = fw0;
        this.F = gs24;
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
            fw0 J = su0.J(1367541877, new xa(this.E, this.F, 0, (byte) 0), yt2);
            fw0 fw0 = J;
            eb.a(fw0, (ml4) null, this.w, this.x, this.y, this.z, this.A, st0.e(ar7.f0, yt2), this.B, this.C, this.D, yt2, 6);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
