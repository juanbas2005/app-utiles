package defpackage;

/* renamed from: di  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class di implements vr2 {
    public final /* synthetic */ x35 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;

    public /* synthetic */ di(x35 x35, boolean z, boolean z2) {
        this.w = x35;
        this.x = z;
        this.y = z2;
    }

    public final Object y(Object obj) {
        cy2 cy2;
        tj6 tj6;
        boolean z;
        ok6 ok6 = (ok6) obj;
        long a = this.w.a();
        nk6 nk6 = vj6.a;
        if (this.x) {
            cy2 = cy2.x;
        } else {
            cy2 = cy2.y;
        }
        if (this.y) {
            tj6 = tj6.w;
        } else {
            tj6 = tj6.y;
        }
        tj6 tj62 = tj6;
        if ((9223372034707292159L & a) != 9205357640488583168L) {
            z = true;
        } else {
            z = false;
        }
        ok6.f(nk6, new uj6(cy2, a, tj62, z));
        return vs7.a;
    }
}
