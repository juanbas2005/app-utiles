package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhh6;", "Lpl4;", "Lih6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hh6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class hh6 extends pl4 {
    public final ap4 A;
    public final fc0 B;
    public final boolean C;
    public final xf D;
    public final uh6 w;
    public final z75 x;
    public final boolean y;
    public final eh2 z;

    public hh6(xf xfVar, fc0 fc0, eh2 eh2, ap4 ap4, z75 z75, uh6 uh6, boolean z2, boolean z3) {
        this.w = uh6;
        this.x = z75;
        this.y = z2;
        this.z = eh2;
        this.A = ap4;
        this.B = fc0;
        this.C = z3;
        this.D = xfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hh6.class != obj.getClass()) {
            return false;
        }
        hh6 hh6 = (hh6) obj;
        if (sg3.e(this.w, hh6.w) && this.x == hh6.x && this.y == hh6.y && sg3.e(this.z, hh6.z) && sg3.e(this.A, hh6.A) && sg3.e(this.B, hh6.B) && this.C == hh6.C && sg3.e(this.D, hh6.D)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, ih6, wo1] */
    public final ll4 g() {
        ? wo1 = new wo1();
        wo1.M = this.w;
        wo1.N = this.x;
        wo1.O = this.y;
        wo1.P = this.z;
        wo1.Q = this.A;
        wo1.R = this.B;
        wo1.S = this.C;
        wo1.T = this.D;
        return wo1;
    }

    public final void h(ll4 ll4) {
        ap4 ap4 = this.A;
        ((ih6) ll4).a1(this.D, this.B, this.z, ap4, this.x, this.w, this.C, this.y);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = hl6.i(hl6.i((this.x.hashCode() + (this.w.hashCode() * 31)) * 31, 31, this.y), 31, false);
        eh2 eh2 = this.z;
        if (eh2 != null) {
            i = eh2.hashCode();
        } else {
            i = 0;
        }
        int i6 = (i5 + i) * 31;
        ap4 ap4 = this.A;
        if (ap4 != null) {
            i2 = ap4.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        fc0 fc0 = this.B;
        if (fc0 != null) {
            i3 = fc0.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = hl6.i((i7 + i3) * 31, 31, this.C);
        xf xfVar = this.D;
        if (xfVar != null) {
            i4 = xfVar.hashCode();
        }
        return i8 + i4;
    }
}
