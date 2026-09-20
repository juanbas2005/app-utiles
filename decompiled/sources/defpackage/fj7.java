package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfj7;", "Lpl4;", "Lhj7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fj7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class fj7 extends pl4 {
    public final vr2 A;
    public final boolean w;
    public final ap4 x;
    public final boolean y;
    public final s86 z;

    public fj7(boolean z2, ap4 ap4, boolean z3, s86 s86, vr2 vr2) {
        this.w = z2;
        this.x = ap4;
        this.y = z3;
        this.z = s86;
        this.A = vr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fj7.class != obj.getClass()) {
            return false;
        }
        fj7 fj7 = (fj7) obj;
        if (this.w == fj7.w && sg3.e(this.x, fj7.x) && this.y == fj7.y && this.z.equals(fj7.z) && this.A == fj7.A) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new hj7(this.w, this.x, this.y, this.z, this.A);
    }

    public final void h(ll4 ll4) {
        hj7 hj7 = (hj7) ll4;
        boolean z2 = hj7.i0;
        boolean z3 = this.w;
        if (z2 != z3) {
            hj7.i0 = z3;
            g75.D(hj7);
        }
        hj7.j0 = this.A;
        hj7.l1(this.x, (oa3) null, false, this.y, (String) null, this.z, hj7.k0);
    }

    public final int hashCode() {
        int i;
        int hashCode = Boolean.hashCode(this.w) * 31;
        ap4 ap4 = this.x;
        if (ap4 != null) {
            i = ap4.hashCode();
        } else {
            i = 0;
        }
        return this.A.hashCode() + f21.e(this.z.a, hl6.i(hl6.i((hashCode + i) * 961, 31, false), 31, this.y), 31);
    }
}
