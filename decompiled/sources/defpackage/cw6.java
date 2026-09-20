package defpackage;

/* renamed from: cw6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class cw6 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ sr2 x;

    public /* synthetic */ cw6(int i, sr2 sr2) {
        this.w = i;
        this.x = sr2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        boolean z = false;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (yt2.V(intValue & 1, z)) {
                    gw8.e(this.x, (ml4) null, false, (pq6) null, (xd0) null, (la5) null, gw8.g, yt2, 805306368, 510);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (yt22.V(intValue2 & 1, z)) {
                    gw8.e(this.x, (ml4) null, false, (pq6) null, (xd0) null, (la5) null, gw8.h, yt22, 805306368, 510);
                } else {
                    yt22.Y();
                }
                return vs7;
            default:
                yt2 yt23 = (yt2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                }
                if (yt23.V(intValue3 & 1, z)) {
                    gw8.e(this.x, (ml4) null, false, (pq6) null, (xd0) null, (la5) null, rc9.h, yt23, 805306368, 510);
                } else {
                    yt23.Y();
                }
                return vs7;
        }
    }
}
