package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau7;", "Lpl4;", "Lbu7;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: au7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class au7 extends pl4 {
    public final float w;
    public final float x;

    public au7(float f, float f2) {
        this.w = f;
        this.x = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof au7)) {
            return false;
        }
        au7 au7 = (au7) obj;
        if (!lx1.b(this.w, au7.w) || !lx1.b(this.x, au7.x)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, bu7] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        return ll4;
    }

    public final void h(ll4 ll4) {
        bu7 bu7 = (bu7) ll4;
        bu7.K = this.w;
        bu7.L = this.x;
    }

    public final int hashCode() {
        return Float.hashCode(this.x) + (Float.hashCode(this.w) * 31);
    }
}
