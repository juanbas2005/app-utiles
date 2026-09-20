package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwb0;", "Lpl4;", "Lzb0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wb0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class wb0 extends pl4 {
    public final yb0 w;

    public wb0(yb0 yb0) {
        this.w = yb0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb0)) {
            return false;
        }
        if (sg3.e(this.w, ((wb0) obj).w)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, zb0] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        return ll4;
    }

    public final void h(ll4 ll4) {
        zb0 zb0 = (zb0) ll4;
        yb0 yb0 = zb0.K;
        if (yb0 != null) {
            yb0.a.k(zb0);
        }
        yb0 yb02 = this.w;
        if (yb02 != null) {
            yb02.a.b(zb0);
        }
        zb0.K = yb02;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
