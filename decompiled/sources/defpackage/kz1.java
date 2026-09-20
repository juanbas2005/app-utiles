package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkz1;", "Lpl4;", "Lbh0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kz1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class kz1 extends pl4 {
    public final vr2 w;

    public kz1(vr2 vr2) {
        this.w = vr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kz1) && this.w == ((kz1) obj).w) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new bh0(new ch0(), this.w);
    }

    public final void h(ll4 ll4) {
        bh0 bh0 = (bh0) ll4;
        bh0.M = this.w;
        bh0.V0();
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
