package defpackage;

/* renamed from: np0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class np0 implements gs2 {
    public final /* synthetic */ tg7 A;
    public final /* synthetic */ gs2 B;
    public final /* synthetic */ float C;
    public final /* synthetic */ tr D;
    public final /* synthetic */ la5 E;
    public final /* synthetic */ cj6 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ fw0 z;

    public /* synthetic */ np0(cj6 cj6, boolean z2, boolean z3, fw0 fw0, tg7 tg7, gs2 gs2, float f, tr trVar, la5 la5) {
        this.w = cj6;
        this.x = z2;
        this.y = z3;
        this.z = fw0;
        this.A = tg7;
        this.B = gs2;
        this.C = f;
        this.D = trVar;
        this.E = la5;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        long j;
        long j2;
        long j3;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            cj6 cj6 = this.w;
            boolean z3 = this.x;
            boolean z4 = this.y;
            if (!z3) {
                j = cj6.f;
            } else if (!z4) {
                j = cj6.b;
            } else {
                j = cj6.k;
            }
            if (!z3) {
                j2 = cj6.g;
            } else if (!z4) {
                j2 = cj6.c;
            } else {
                j2 = cj6.l;
            }
            if (!z3) {
                j3 = cj6.h;
            } else if (!z4) {
                j3 = cj6.d;
            } else {
                j3 = cj6.m;
            }
            je2 H = hj8.H(vm4.A, yt2);
            je2 H2 = hj8.H(vm4.z, yt2);
            je2 H3 = hj8.H(vm4.x, yt2);
            je2 H4 = hj8.H(vm4.y, yt2);
            fw0 fw0 = this.z;
            yt2 yt22 = yt2;
            fw0 fw02 = fw0;
            fw0 fw03 = fw02;
            fw0 fw04 = fw03;
            fw0 fw05 = fw04;
            sp0.a(fw05, this.A, j, this.B, j2, j3, this.C, this.D, this.E, H, H2, H3, H4, yt22, 0);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
