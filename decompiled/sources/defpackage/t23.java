package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lt23;", "Lpl4;", "Lx23;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: t23  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class t23 extends pl4 {
    public final ap4 w;

    public t23(ap4 ap4) {
        this.w = ap4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t23) && sg3.e(((t23) obj).w, this.w)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, x23] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        return ll4;
    }

    public final void h(ll4 ll4) {
        x23 x23 = (x23) ll4;
        ap4 ap4 = x23.K;
        ap4 ap42 = this.w;
        if (!sg3.e(ap4, ap42)) {
            x23.X0();
            x23.K = ap42;
        }
    }

    public final int hashCode() {
        return this.w.hashCode() * 31;
    }
}
