package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lu38;", "Lpl4;", "Lw38;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: u38  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class u38 extends pl4 {
    public final tr6 A;
    public final mm7 w;
    public final bm7 x;
    public final n52 y;
    public final x82 z;

    public u38(mm7 mm7, bm7 bm7, n52 n52, x82 x82, tr6 tr6) {
        this.w = mm7;
        this.x = bm7;
        this.y = n52;
        this.z = x82;
        this.A = tr6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u38) {
            u38 u38 = (u38) obj;
            if (this.w.equals(u38.w) && sg3.e(this.x, u38.x) && this.y.equals(u38.y) && sg3.e(this.z, u38.z) && this.A == u38.A) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, w38] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.x;
        ll4.L = this.y;
        ll4.M = this.z;
        ll4.N = this.A;
        return ll4;
    }

    public final void h(ll4 ll4) {
        w38 w38 = (w38) ll4;
        w38.getClass();
        w38.K = this.x;
        w38.L = this.y;
        w38.M = this.z;
        w38.N = this.A;
    }

    public final int hashCode() {
        int hashCode = this.x.hashCode();
        int hashCode2 = this.y.a.hashCode();
        int hashCode3 = this.z.a.hashCode();
        return this.A.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.w.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.w + ", veilAnimation=" + this.x + ", enter=" + this.y + ", exit=" + this.z + ", mutableTransformState=" + this.A + ")";
    }
}
