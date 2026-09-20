package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvh7;", "Lpl4;", "Lxh7;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class vh7 extends pl4 {
    public final ef3 w;
    public final boolean x;
    public final je2 y;

    public vh7(ef3 ef3, boolean z, je2 je2) {
        this.w = ef3;
        this.x = z;
        this.y = je2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh7)) {
            return false;
        }
        vh7 vh7 = (vh7) obj;
        if (sg3.e(this.w, vh7.w) && this.x == vh7.x && sg3.e(this.y, vh7.y)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, xh7] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        ll4.M = this.y;
        ll4.Q = Float.NaN;
        ll4.R = Float.NaN;
        return ll4;
    }

    public final void h(ll4 ll4) {
        xh7 xh7 = (xh7) ll4;
        xh7.K = this.w;
        boolean z = xh7.L;
        boolean z2 = this.x;
        if (z != z2) {
            su0.B(xh7);
        }
        xh7.L = z2;
        xh7.M = this.y;
        if (xh7.P == null && !Float.isNaN(xh7.R)) {
            xh7.P = ed1.a(xh7.R);
        }
        if (xh7.O == null && !Float.isNaN(xh7.Q)) {
            xh7.O = ed1.a(xh7.Q);
        }
    }

    public final int hashCode() {
        return this.y.hashCode() + hl6.i(this.w.hashCode() * 31, 31, this.x);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.w + ", checked=" + this.x + ", animationSpec=" + this.y + ")";
    }
}
