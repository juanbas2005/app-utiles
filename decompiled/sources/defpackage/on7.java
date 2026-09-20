package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lon7;", "Lpl4;", "Lpn7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: on7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class on7 extends pl4 {
    public final s86 A;
    public final sr2 B;
    public final ij7 w;
    public final ap4 x;
    public final oa3 y;
    public final boolean z;

    public on7(ij7 ij7, ap4 ap4, oa3 oa3, boolean z2, s86 s86, sr2 sr2) {
        this.w = ij7;
        this.x = ap4;
        this.y = oa3;
        this.z = z2;
        this.A = s86;
        this.B = sr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || on7.class != obj.getClass()) {
            return false;
        }
        on7 on7 = (on7) obj;
        if (this.w == on7.w && sg3.e(this.x, on7.x) && sg3.e(this.y, on7.y) && this.z == on7.z && this.A.equals(on7.A) && this.B == on7.B) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, pn7, v0] */
    public final ll4 g() {
        ? v0Var = new v0(this.x, this.y, false, this.z, (String) null, this.A, this.B);
        v0Var.i0 = this.w;
        return v0Var;
    }

    public final void h(ll4 ll4) {
        pn7 pn7 = (pn7) ll4;
        ij7 ij7 = pn7.i0;
        ij7 ij72 = this.w;
        if (ij7 != ij72) {
            pn7.i0 = ij72;
            g75.D(pn7);
        }
        pn7.l1(this.x, this.y, false, this.z, (String) null, this.A, this.B);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.w.hashCode() * 31;
        ap4 ap4 = this.x;
        if (ap4 != null) {
            i = ap4.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        oa3 oa3 = this.y;
        if (oa3 != null) {
            i2 = oa3.hashCode();
        } else {
            i2 = 0;
        }
        return this.B.hashCode() + f21.e(this.A.a, hl6.i(hl6.i((i3 + i2) * 31, 31, false), 31, this.z), 31);
    }
}
