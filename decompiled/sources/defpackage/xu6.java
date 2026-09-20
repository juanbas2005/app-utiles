package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxu6;", "Lpl4;", "Lzu6;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xu6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class xu6 extends pl4 {
    public final boolean A;
    public final float w;
    public final float x;
    public final float y;
    public final float z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xu6(float f, float f2, float f3, float f4, boolean z2, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu6)) {
            return false;
        }
        xu6 xu6 = (xu6) obj;
        if (lx1.b(this.w, xu6.w) && lx1.b(this.x, xu6.x) && lx1.b(this.y, xu6.y) && lx1.b(this.z, xu6.z) && this.A == xu6.A) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, zu6] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        ll4.M = this.y;
        ll4.N = this.z;
        ll4.O = this.A;
        return ll4;
    }

    public final void h(ll4 ll4) {
        zu6 zu6 = (zu6) ll4;
        zu6.K = this.w;
        zu6.L = this.x;
        zu6.M = this.y;
        zu6.N = this.z;
        zu6.O = this.A;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.A) + f21.d(this.z, f21.d(this.y, f21.d(this.x, Float.hashCode(this.w) * 31, 31), 31), 31);
    }

    public xu6(float f, float f2, float f3, float f4, boolean z2) {
        this.w = f;
        this.x = f2;
        this.y = f3;
        this.z = f4;
        this.A = z2;
    }
}
