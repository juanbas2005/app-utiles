package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llz3;", "Lpl4;", "Lmz3;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lz3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lz3 extends pl4 {
    public final float w;
    public final boolean x;

    public lz3(float f, boolean z) {
        this.w = f;
        this.x = z;
    }

    public final boolean equals(Object obj) {
        lz3 lz3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof lz3) {
            lz3 = (lz3) obj;
        } else {
            lz3 = null;
        }
        if (lz3 != null && this.w == lz3.w && this.x == lz3.x) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, mz3] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        return ll4;
    }

    public final void h(ll4 ll4) {
        mz3 mz3 = (mz3) ll4;
        mz3.K = this.w;
        mz3.L = this.x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + (Float.hashCode(this.w) * 31);
    }
}
