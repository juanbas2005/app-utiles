package defpackage;

/* renamed from: m49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class m49 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ sr2 x;

    public /* synthetic */ m49(int i, sr2 sr2) {
        this.w = i;
        this.x = sr2;
    }

    public final /* synthetic */ Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        jl4 jl4 = jl4.w;
        d63 d63 = ay0.a;
        sr2 sr2 = this.x;
        boolean z = true;
        switch (i) {
            case b85.b:
                int intValue = ((Integer) obj2).intValue();
                int i2 = intValue & 1;
                if ((intValue & 3) == 2) {
                    z = false;
                }
                yt2 yt2 = (yt2) obj;
                if (yt2.V(i2, z)) {
                    boolean g = yt2.g(sr2);
                    Object Q = yt2.Q();
                    if (g || Q == d63) {
                        Q = new mt1(2, sr2);
                        yt2.o0(Q);
                    }
                    hj8.e(bb0.h0((sr2) Q, yt2), ar7.W(jl4, "LicenseDetailNavigationIcon"), false, (a83) null, (pq6) null, cr8.a, yt2, 1572912, 60);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = intValue2 & 1;
                if ((intValue2 & 3) == 2) {
                    z = false;
                }
                yt2 yt22 = (yt2) obj;
                if (yt22.V(i3, z)) {
                    boolean g2 = yt22.g(sr2);
                    Object Q2 = yt22.Q();
                    if (g2 || Q2 == d63) {
                        Q2 = new mt1(3, sr2);
                        yt22.o0(Q2);
                    }
                    hj8.e(bb0.h0((sr2) Q2, yt22), ar7.W(jl4, "LicenseListNavigationIcon"), false, (a83) null, (pq6) null, fv8.a, yt22, 1572912, 60);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }
}
