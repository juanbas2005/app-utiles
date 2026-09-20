package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lq9;", "Lpl4;", "Lr9;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: q9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class q9 extends pl4 {
    public final dx4 w;

    public q9(dx4 dx4) {
        this.w = dx4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q9) && this.w == ((q9) obj).w) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, r9, wo1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [ll4, p9, vo1] */
    public final ll4 g() {
        ? wo1 = new wo1();
        wo1.M = this.w;
        gg0 gg0 = new gg0(4, (Object) wo1);
        ? ll4 = new ll4();
        ll4.K = gg0;
        wo1.V0(ll4);
        return wo1;
    }

    public final void h(ll4 ll4) {
        ((r9) ll4).M = this.w;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
