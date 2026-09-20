package defpackage;

/* renamed from: fq8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class fq8 implements hs2 {
    public final /* synthetic */ bs8 w;
    public final /* synthetic */ yx6 x;

    public /* synthetic */ fq8(bs8 bs8, yx6 yx6) {
        this.w = bs8;
        this.x = yx6;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        int intValue = ((Integer) obj3).intValue();
        yt2 yt2 = (yt2) obj2;
        bw8 bw8 = (bw8) obj;
        bw8.getClass();
        if ((intValue & 6) == 0) {
            if (true != yt2.g(bw8)) {
                i = 2;
            } else {
                i = 4;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(intValue & 1, z)) {
            int i2 = bw8.a;
            Object Q = yt2.Q();
            if (Q == ay0.a) {
                Q = new pq8(this.x, 0);
                yt2.o0(Q);
            }
            i35.r(i2, this.w, (sr2) Q, yt2, 384);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
