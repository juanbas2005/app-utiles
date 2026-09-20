package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lka7;", "Lpl4;", "Lla7;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ka7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class ka7 extends pl4 {
    public final vr2 w;

    public ka7(vr2 vr2) {
        this.w = vr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ka7) && this.w == ((ka7) obj).w) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [la7, ll4, hd3] */
    public final ll4 g() {
        ? hd3 = new hd3(gl0.u);
        hd3.N = this.w;
        return hd3;
    }

    public final void h(ll4 ll4) {
        la7 la7 = (la7) ll4;
        vr2 vr2 = la7.N;
        vr2 vr22 = this.w;
        if (vr2 != vr22) {
            la7.N = vr22;
            ib8 ib8 = la7.O;
            if (ib8 != null) {
                aa8 aa8 = (aa8) vr22.y(ib8);
                if (!sg3.e(aa8, la7.M)) {
                    la7.M = aa8;
                    la7.W0();
                }
            }
        }
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
