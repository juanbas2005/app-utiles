package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ly14;", "Lpl4;", "Lb24;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: y14  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class y14 extends pl4 {
    public final c24 w;
    public final ji8 x;
    public final z75 y;

    public y14(c24 c24, ji8 ji8, z75 z75) {
        this.w = c24;
        this.x = ji8;
        this.y = z75;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y14)) {
            return false;
        }
        y14 y14 = (y14) obj;
        if (sg3.e(this.w, y14.w) && sg3.e(this.x, y14.x) && this.y == y14.y) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, b24] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        ll4.M = this.y;
        return ll4;
    }

    public final void h(ll4 ll4) {
        b24 b24 = (b24) ll4;
        b24.K = this.w;
        b24.L = this.x;
        b24.M = this.y;
    }

    public final int hashCode() {
        return this.y.hashCode() + hl6.i((this.x.hashCode() + (this.w.hashCode() * 31)) * 31, 31, false);
    }
}
