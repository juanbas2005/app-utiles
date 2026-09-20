package defpackage;

/* renamed from: lw6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class lw6 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ nw6 x;

    public /* synthetic */ lw6(nw6 nw6, int i) {
        this.w = i;
        this.x = nw6;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        int i = this.w;
        vs7 vs7 = vs7.a;
        boolean z2 = false;
        nw6 nw6 = this.x;
        switch (i) {
            case b85.b:
                fw0 fw0 = h49.y;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(1 & intValue, z)) {
                    nw6.getClass();
                    fw0.u(nw6, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (yt22.V(intValue2 & 1, z2)) {
                    yf7.b(nw6.a.a, (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 0, 0, 262142);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }
}
