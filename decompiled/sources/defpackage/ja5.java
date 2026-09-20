package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lja5;", "Lpl4;", "Lka5;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ja5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class ja5 extends pl4 {
    public final float w;
    public final float x;
    public final float y;
    public final float z;

    public ja5(float f, float f2, float f3, float f4) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.w = f;
        this.x = f2;
        this.y = f3;
        this.z = f4;
        boolean z5 = true;
        if (f >= 0.0f || Float.isNaN(f)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (f2 >= 0.0f || Float.isNaN(f2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z2 & z3;
        if (f3 >= 0.0f || Float.isNaN(f3)) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z7 = z6 & z4;
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z5 = false;
        }
        if (!z7 || !z5) {
            wb3.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        ja5 ja5;
        if (obj instanceof ja5) {
            ja5 = (ja5) obj;
        } else {
            ja5 = null;
        }
        if (ja5 != null && lx1.b(this.w, ja5.w) && lx1.b(this.x, ja5.x) && lx1.b(this.y, ja5.y) && lx1.b(this.z, ja5.z)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, ka5] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        ll4.M = this.y;
        ll4.N = this.z;
        ll4.O = true;
        return ll4;
    }

    public final void h(ll4 ll4) {
        ka5 ka5 = (ka5) ll4;
        ka5.K = this.w;
        ka5.L = this.x;
        ka5.M = this.y;
        ka5.N = this.z;
        ka5.O = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + f21.d(this.z, f21.d(this.y, f21.d(this.x, Float.hashCode(this.w) * 31, 31), 31), 31);
    }
}
