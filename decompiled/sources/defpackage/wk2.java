package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwk2;", "Lpl4;", "Lxk2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wk2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class wk2 extends pl4 {
    public final ap4 w;

    public wk2(ap4 ap4) {
        this.w = ap4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk2)) {
            return false;
        }
        if (!sg3.e(this.w, ((wk2) obj).w)) {
            return false;
        }
        return true;
    }

    public final ll4 g() {
        return new xk2(this.w, 1, (o0) null);
    }

    public final void h(ll4 ll4) {
        ((xk2) ll4).Z0(this.w);
    }

    public final int hashCode() {
        ap4 ap4 = this.w;
        if (ap4 != null) {
            return ap4.hashCode();
        }
        return 0;
    }
}
