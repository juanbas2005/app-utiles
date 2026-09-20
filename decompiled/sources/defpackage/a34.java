package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La34;", "Lpl4;", "Ld34;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: a34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class a34 extends pl4 {
    public final sr2 w;
    public final x24 x;
    public final z75 y;
    public final boolean z;

    public a34(sr2 sr2, x24 x24, z75 z75, boolean z2) {
        this.w = sr2;
        this.x = x24;
        this.y = z75;
        this.z = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r4 = (defpackage.a34) r4;
     */
    public final boolean equals(Object obj) {
        a34 a34;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a34) && this.w == a34.w && sg3.e(this.x, a34.x) && this.y == a34.y && this.z == a34.z) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new d34(this.w, this.x, this.y, this.z);
    }

    public final void h(ll4 ll4) {
        d34 d34 = (d34) ll4;
        d34.K = this.w;
        d34.L = this.x;
        z75 z75 = d34.M;
        z75 z752 = this.y;
        if (z75 != z752) {
            d34.M = z752;
            g75.D(d34);
        }
        boolean z2 = d34.N;
        boolean z3 = this.z;
        if (z2 != z3) {
            d34.N = z3;
            d34.V0();
            g75.D(d34);
        }
    }

    public final int hashCode() {
        int hashCode = this.x.hashCode();
        return Boolean.hashCode(false) + hl6.i((this.y.hashCode() + ((hashCode + (this.w.hashCode() * 31)) * 31)) * 31, 31, this.z);
    }
}
