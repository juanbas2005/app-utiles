package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ly35;", "Lpl4;", "Lz35;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: y35  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class y35 extends pl4 {
    public final vr2 w;

    public y35(vr2 vr2) {
        this.w = vr2;
    }

    public final boolean equals(Object obj) {
        y35 y35;
        if (this == obj) {
            return true;
        }
        if (obj instanceof y35) {
            y35 = (y35) obj;
        } else {
            y35 = null;
        }
        if (y35 != null && this.w == y35.w) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, z35] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = true;
        return ll4;
    }

    public final void h(ll4 ll4) {
        z35 z35 = (z35) ll4;
        vr2 vr2 = z35.K;
        vr2 vr22 = this.w;
        if (!(vr2 == vr22 && z35.L)) {
            rc9.O0(z35).Y(false);
        }
        z35.K = vr22;
        z35.L = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.w.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.w + ", rtlAware=true)";
    }
}
