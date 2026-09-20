package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lma3;", "Lpl4;", "Lna3;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ma3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class ma3 extends pl4 {
    public final ef3 w;
    public final oa3 x;

    public ma3(ef3 ef3, oa3 oa3) {
        this.w = ef3;
        this.x = oa3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma3)) {
            return false;
        }
        ma3 ma3 = (ma3) obj;
        if (sg3.e(this.w, ma3.w) && sg3.e(this.x, ma3.x)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [na3, ll4, wo1] */
    public final ll4 g() {
        vo1 a = this.x.a(this.w);
        ? wo1 = new wo1();
        wo1.M = a;
        wo1.V0(a);
        return wo1;
    }

    public final void h(ll4 ll4) {
        na3 na3 = (na3) ll4;
        vo1 a = this.x.a(this.w);
        na3.W0(na3.M);
        na3.M = a;
        na3.V0(a);
    }

    public final int hashCode() {
        return this.x.hashCode() + (this.w.hashCode() * 31);
    }
}
