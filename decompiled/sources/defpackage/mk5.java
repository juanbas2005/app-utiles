package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmk5;", "Lpl4;", "Lnk5;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mk5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mk5 extends pl4 {
    public final nh w;

    public mk5(nh nhVar) {
        this.w = nhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mk5) && this.w.equals(((mk5) obj).w)) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new q23(this.w, (qx1) null);
    }

    public final void h(ll4 ll4) {
        nk5 nk5 = (nk5) ll4;
        nh nhVar = nk5.L;
        nh nhVar2 = this.w;
        if (!sg3.e(nhVar, nhVar2)) {
            nk5.L = nhVar2;
            if (nk5.M) {
                nk5.X0();
            }
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.w.b * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.w + ", overrideDescendants=false)";
    }
}
