package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lt31;", "Lpl4;", "Lu31;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: t31  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class t31 extends pl4 {
    public final vr2 w;

    public t31(vr2 vr2) {
        this.w = vr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t31) && ((t31) obj).w == this.w) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [dd3, u31, ll4] */
    public final ll4 g() {
        ? dd3 = new dd3();
        dd3.M = this.w;
        return dd3;
    }

    public final void h(ll4 ll4) {
        u31 u31 = (u31) ll4;
        vr2 vr2 = u31.M;
        vr2 vr22 = this.w;
        if (vr22 != vr2) {
            u31.M = vr22;
            u31.W0();
        }
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
