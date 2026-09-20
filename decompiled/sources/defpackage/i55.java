package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Li55;", "Lpl4;", "Lj55;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: i55  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class i55 extends pl4 {
    public final vr2 w;

    public i55(vr2 vr2) {
        this.w = vr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i55) && this.w == ((i55) obj).w) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, j55] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = -9223372034707292160L;
        return ll4;
    }

    public final void h(ll4 ll4) {
        j55 j55 = (j55) ll4;
        j55.K = this.w;
        j55.L = -9223372034707292160L;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
