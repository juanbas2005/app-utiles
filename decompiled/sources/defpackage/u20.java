package defpackage;

/* renamed from: u20  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class u20 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;
    public final /* synthetic */ sr2 y;

    public /* synthetic */ u20(sr2 sr2, String str) {
        this.w = 2;
        this.y = sr2;
        this.x = str;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        int i = this.w;
        sr2 sr2 = this.y;
        vs7 vs7 = vs7.a;
        String str = this.x;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                b30.i(str, sr2, (yt2) obj, b85.v(49));
                return vs7;
            case 1:
                ((Integer) obj2).getClass();
                d36.g(str, sr2, (yt2) obj, b85.v(1));
                return vs7;
            default:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    hj8.e(this.y, (ml4) null, false, (a83) null, (pq6) null, su0.J(-2029051556, new q20(str, 18), yt2), yt2, 1572864, 62);
                } else {
                    yt2.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ u20(String str, sr2 sr2, int i, int i2) {
        this.w = i2;
        this.x = str;
        this.y = sr2;
    }
}
