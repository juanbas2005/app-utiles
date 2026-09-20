package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkb0;", "Lpl4;", "Llb0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kb0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class kb0 extends pl4 {
    public final i80 w;
    public final boolean x;

    public kb0(i80 i80, boolean z) {
        this.w = i80;
        this.x = z;
    }

    public final boolean equals(Object obj) {
        kb0 kb0;
        if (this == obj) {
            return true;
        }
        if (obj instanceof kb0) {
            kb0 = (kb0) obj;
        } else {
            kb0 = null;
        }
        if (kb0 != null && this.w.equals(kb0.w) && this.x == kb0.x) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, lb0] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        return ll4;
    }

    public final void h(ll4 ll4) {
        lb0 lb0 = (lb0) ll4;
        lb0.K = this.w;
        lb0.L = this.x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + (this.w.hashCode() * 31);
    }
}
