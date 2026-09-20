package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls57;", "Lpl4;", "Ly57;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: s57  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s57 extends pl4 {
    public final cq4 w;
    public final p57 x;

    public s57(cq4 cq4, p57 p57) {
        this.w = cq4;
        this.x = p57;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s57)) {
            return false;
        }
        s57 s57 = (s57) obj;
        if (!sg3.e(s57.x, this.x) || !sg3.e(s57.w, this.w)) {
            return false;
        }
        return true;
    }

    public final ll4 g() {
        return new y57(this.w, this.x);
    }

    public final void h(ll4 ll4) {
        y57 y57 = (y57) ll4;
        y57.N = this.x;
        y57.b1(false);
        cq4 cq4 = this.w;
        if (cq4 == null) {
            cq4 = new cq4((ef3) null);
        }
        if (!sg3.e(y57.U, cq4)) {
            y57.U = cq4;
            y57.b1(false);
            v57 v57 = y57.M;
            if (v57 != null) {
                su0.A(v57);
            } else {
                h.s("StyleOuterNode with no corresponding StyleInnerNode");
            }
        }
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return "StyleElement(styleState=" + this.w + ", style=" + this.x + ")";
    }
}
