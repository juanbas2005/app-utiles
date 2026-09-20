package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfy3;", "Lpl4;", "Lly3;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fy3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class fy3 extends pl4 {
    public final hs2 w;

    public fy3(hs2 hs2) {
        this.w = hs2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fy3) && this.w == ((fy3) obj).w) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, ly3] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        return ll4;
    }

    public final void h(ll4 ll4) {
        ((ly3) ll4).K = this.w;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
