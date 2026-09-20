package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljh6;", "Lpl4;", "Lth6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jh6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class jh6 extends pl4 {
    public final ap4 A;
    public final uh6 w;
    public final z75 x;
    public final boolean y;
    public final boolean z;

    public jh6(uh6 uh6, z75 z75, boolean z2, boolean z3, ap4 ap4) {
        this.w = uh6;
        this.x = z75;
        this.y = z2;
        this.z = z3;
        this.A = ap4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh6)) {
            return false;
        }
        jh6 jh6 = (jh6) obj;
        if (sg3.e(this.w, jh6.w) && this.x == jh6.x && this.y == jh6.y && this.z == jh6.z && sg3.e(this.A, jh6.A)) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new th6((xf) null, (fc0) null, (eh2) null, this.A, this.x, this.w, this.y, this.z);
    }

    public final void h(ll4 ll4) {
        ((th6) ll4).q1((xf) null, (fc0) null, (eh2) null, this.A, this.x, this.w, this.y, this.z);
    }

    public final int hashCode() {
        int i;
        int i2 = hl6.i(hl6.i((this.x.hashCode() + (this.w.hashCode() * 31)) * 961, 31, this.y), 961, this.z);
        ap4 ap4 = this.A;
        if (ap4 != null) {
            i = ap4.hashCode();
        } else {
            i = 0;
        }
        return (i2 + i) * 31;
    }
}
