package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfd3;", "Lpl4;", "Lhd3;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fd3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class fd3 extends pl4 {
    public final aa8 w;

    public fd3(aa8 aa8) {
        this.w = aa8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd3)) {
            return false;
        }
        return sg3.e(((fd3) obj).w, this.w);
    }

    public final ll4 g() {
        return new hd3(this.w);
    }

    public final void h(ll4 ll4) {
        hd3 hd3 = (hd3) ll4;
        aa8 aa8 = hd3.M;
        aa8 aa82 = this.w;
        if (!sg3.e(aa82, aa8)) {
            hd3.M = aa82;
            hd3.W0();
        }
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
