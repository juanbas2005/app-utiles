package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Loa5;", "Lpl4;", "Lra5;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oa5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class oa5 extends pl4 {
    public final la5 w;

    public oa5(la5 la5) {
        this.w = la5;
    }

    public final boolean equals(Object obj) {
        oa5 oa5;
        if (obj instanceof oa5) {
            oa5 = (oa5) obj;
        } else {
            oa5 = null;
        }
        if (oa5 == null) {
            return false;
        }
        return sg3.e(this.w, oa5.w);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, ra5] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        return ll4;
    }

    public final void h(ll4 ll4) {
        ((ra5) ll4).K = this.w;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
