package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lma5;", "Lpl4;", "Lna5;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ma5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class ma5 extends pl4 {
    public final la5 w;

    public ma5(la5 la5) {
        this.w = la5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ma5)) {
            return false;
        }
        return sg3.e(((ma5) obj).w, this.w);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [dd3, na5, ll4] */
    public final ll4 g() {
        ? dd3 = new dd3();
        dd3.M = this.w;
        return dd3;
    }

    public final void h(ll4 ll4) {
        na5 na5 = (na5) ll4;
        la5 la5 = na5.M;
        la5 la52 = this.w;
        if (!sg3.e(la52, la5)) {
            na5.M = la52;
            na5.W0();
        }
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
