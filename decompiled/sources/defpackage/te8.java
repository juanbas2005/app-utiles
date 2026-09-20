package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lte8;", "Lpl4;", "Lue8;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: te8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class te8 extends pl4 {
    public final jv1 w;
    public final gs2 x;
    public final Object y;

    public te8(jv1 jv1, gs2 gs2, Object obj) {
        this.w = jv1;
        this.x = gs2;
        this.y = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || te8.class != obj.getClass()) {
            return false;
        }
        te8 te8 = (te8) obj;
        if (this.w == te8.w && sg3.e(this.y, te8.y)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, ue8] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        return ll4;
    }

    public final void h(ll4 ll4) {
        ue8 ue8 = (ue8) ll4;
        ue8.K = this.w;
        ue8.L = this.x;
    }

    public final int hashCode() {
        return this.y.hashCode() + hl6.i(this.w.hashCode() * 31, 31, false);
    }
}
