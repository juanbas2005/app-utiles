package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lid5;", "Lpl4;", "Lhd5;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: id5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class id5 extends pl4 {
    public final g5 w;

    public id5(g5 g5Var) {
        this.w = g5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof id5) && this.w == ((id5) obj).w) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, hd5] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        return ll4;
    }

    public final void h(ll4 ll4) {
        hd5 hd5 = (hd5) ll4;
        hd5.K = this.w;
        g75.D(hd5);
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
