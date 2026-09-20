package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lej6;", "Lpl4;", "Lgj6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ej6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class ej6 extends pl4 {
    public final boolean A;
    public final s86 B;
    public final sr2 C;
    public final boolean w;
    public final ap4 x;
    public final oa3 y;
    public final boolean z;

    public ej6(boolean z2, ap4 ap4, oa3 oa3, boolean z3, boolean z4, s86 s86, sr2 sr2) {
        this.w = z2;
        this.x = ap4;
        this.y = oa3;
        this.z = z3;
        this.A = z4;
        this.B = s86;
        this.C = sr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ej6.class != obj.getClass()) {
            return false;
        }
        ej6 ej6 = (ej6) obj;
        if (this.w == ej6.w && sg3.e(this.x, ej6.x) && sg3.e(this.y, ej6.y) && this.z == ej6.z && this.A == ej6.A && sg3.e(this.B, ej6.B) && this.C == ej6.C) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [gj6, ll4, v0] */
    public final ll4 g() {
        ? v0Var = new v0(this.x, this.y, this.z, this.A, (String) null, this.B, this.C);
        v0Var.i0 = this.w;
        return v0Var;
    }

    public final void h(ll4 ll4) {
        gj6 gj6 = (gj6) ll4;
        boolean z2 = gj6.i0;
        boolean z3 = this.w;
        if (z2 != z3) {
            gj6.i0 = z3;
            g75.D(gj6);
        }
        gj6.l1(this.x, this.y, this.z, this.A, (String) null, this.B, this.C);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = Boolean.hashCode(this.w) * 31;
        int i3 = 0;
        ap4 ap4 = this.x;
        if (ap4 != null) {
            i = ap4.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        oa3 oa3 = this.y;
        if (oa3 != null) {
            i2 = oa3.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = hl6.i(hl6.i((i4 + i2) * 31, 31, this.z), 31, this.A);
        s86 s86 = this.B;
        if (s86 != null) {
            i3 = Integer.hashCode(s86.a);
        }
        return this.C.hashCode() + ((i5 + i3) * 31);
    }
}
