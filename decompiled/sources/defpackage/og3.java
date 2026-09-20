package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Log3;", "Lpl4;", "Lqg3;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: og3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class og3 extends pl4 {
    public final mg3 w;

    public og3(mg3 mg3) {
        this.w = mg3;
    }

    public final boolean equals(Object obj) {
        og3 og3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof og3) {
            og3 = (og3) obj;
        } else {
            og3 = null;
        }
        if (og3 != null && this.w == og3.w) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, ng3, qg3] */
    public final ll4 g() {
        ? ng3 = new ng3(0);
        ng3.L = this.w;
        ng3.M = true;
        return ng3;
    }

    public final void h(ll4 ll4) {
        qg3 qg3 = (qg3) ll4;
        qg3.L = this.w;
        qg3.M = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.w.hashCode() * 31);
    }
}
