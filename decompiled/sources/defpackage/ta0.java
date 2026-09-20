package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lta0;", "Lpl4;", "Lsa0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ta0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ta0 extends pl4 {
    public final float w;
    public final ky6 x;
    public final pq6 y;

    public ta0(float f, ky6 ky6, pq6 pq6) {
        this.w = f;
        this.x = ky6;
        this.y = pq6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta0)) {
            return false;
        }
        ta0 ta0 = (ta0) obj;
        if (lx1.b(this.w, ta0.w) && this.x.equals(ta0.x) && sg3.e(this.y, ta0.y)) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new sa0(this.w, this.x, this.y);
    }

    public final void h(ll4 ll4) {
        sa0 sa0 = (sa0) ll4;
        float f = sa0.N;
        bh0 bh0 = sa0.Q;
        float f2 = this.w;
        if (!lx1.b(f, f2)) {
            sa0.N = f2;
            bh0.V0();
        }
        ky6 ky6 = sa0.O;
        ky6 ky62 = this.x;
        if (!sg3.e(ky6, ky62)) {
            sa0.O = ky62;
            bh0.V0();
        }
        pq6 pq6 = sa0.P;
        pq6 pq62 = this.y;
        if (!sg3.e(pq6, pq62)) {
            sa0.P = pq62;
            bh0.V0();
            g75.D(sa0);
        }
    }

    public final int hashCode() {
        int hashCode = this.x.hashCode();
        return this.y.hashCode() + ((hashCode + (Float.hashCode(this.w) * 31)) * 31);
    }

    public final String toString() {
        String c = lx1.c(this.w);
        return "BorderModifierNodeElement(width=" + c + ", brush=" + this.x + ", shape=" + this.y + ")";
    }
}
