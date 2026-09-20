package defpackage;

/* renamed from: kw4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class kw4 implements gs2 {
    public final /* synthetic */ gs2 A;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ tg7 y;
    public final /* synthetic */ fw4 z;

    public /* synthetic */ kw4(boolean z2, tg7 tg7, fw4 fw4, gs2 gs2) {
        this.x = z2;
        this.y = tg7;
        this.z = fw4;
        this.A = gs2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                hj8.l(this.x, this.y, this.z, this.A, (yt2) obj, b85.v(1));
                return vs7;
            default:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    hj8.l(this.x, this.y, this.z, this.A, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ kw4(boolean z2, tg7 tg7, fw4 fw4, gs2 gs2, int i) {
        this.x = z2;
        this.y = tg7;
        this.z = fw4;
        this.A = gs2;
    }
}
