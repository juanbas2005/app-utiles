package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llr0;", "Lpl4;", "Lor0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lr0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class lr0 extends pl4 {
    public final String A;
    public final s86 B;
    public final sr2 C;
    public final ap4 w;
    public final oa3 x;
    public final boolean y;
    public final boolean z;

    public lr0(ap4 ap4, oa3 oa3, boolean z2, boolean z3, String str, s86 s86, sr2 sr2) {
        this.w = ap4;
        this.x = oa3;
        this.y = z2;
        this.z = z3;
        this.A = str;
        this.B = s86;
        this.C = sr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lr0.class != obj.getClass()) {
            return false;
        }
        lr0 lr0 = (lr0) obj;
        if (sg3.e(this.w, lr0.w) && sg3.e(this.x, lr0.x) && this.y == lr0.y && this.z == lr0.z && sg3.e(this.A, lr0.A) && sg3.e(this.B, lr0.B) && this.C == lr0.C) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new v0(this.w, this.x, this.y, this.z, this.A, this.B, this.C);
    }

    public final void h(ll4 ll4) {
        ((or0) ll4).l1(this.w, this.x, this.y, this.z, this.A, this.B, this.C);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        ap4 ap4 = this.w;
        if (ap4 != null) {
            i = ap4.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        oa3 oa3 = this.x;
        if (oa3 != null) {
            i2 = oa3.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = hl6.i(hl6.i((i5 + i2) * 31, 31, this.y), 31, this.z);
        String str = this.A;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        s86 s86 = this.B;
        if (s86 != null) {
            i4 = Integer.hashCode(s86.a);
        }
        return this.C.hashCode() + ((i7 + i4) * 31);
    }
}
