package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf67;", "Lpl4;", "Lg67;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: f67  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f67 extends pl4 {
    public final qx1 w;

    public f67(qx1 qx1) {
        this.w = qx1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f67)) {
            return false;
        }
        f67 f67 = (f67) obj;
        nh nhVar = pv8.s;
        if (nhVar.equals(nhVar) && sg3.e(this.w, f67.w)) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new q23(pv8.s, this.w);
    }

    public final void h(ll4 ll4) {
        g67 g67 = (g67) ll4;
        nh nhVar = pv8.s;
        if (!sg3.e(g67.L, nhVar)) {
            g67.L = nhVar;
            if (g67.M) {
                g67.X0();
            }
        }
        g67.K = this.w;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = hl6.i(1022 * 31, 31, false);
        qx1 qx1 = this.w;
        if (qx1 != null) {
            i = qx1.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        nh nhVar = pv8.s;
        return "StylusHoverIconModifierElement(icon=" + nhVar + ", overrideDescendants=false, touchBoundsExpansion=" + this.w + ")";
    }
}
