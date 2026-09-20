package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lsd2;", "Lpl4;", "Ltd2;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sd2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class sd2 extends pl4 {
    public final jv1 w;

    public sd2(jv1 jv1) {
        this.w = jv1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof sd2) && this.w == ((sd2) obj).w) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [td2, ll4] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = 1.0f;
        return ll4;
    }

    public final void h(ll4 ll4) {
        td2 td2 = (td2) ll4;
        td2.K = this.w;
        td2.L = 1.0f;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.w.hashCode() * 31);
    }
}
