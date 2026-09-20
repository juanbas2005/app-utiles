package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwx4;", "Lpl4;", "Lzx4;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wx4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class wx4 extends pl4 {
    public final tx4 w;

    public wx4(tx4 tx4) {
        this.w = tx4;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof wx4) && sg3.e(((wx4) obj).w, this.w)) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new zx4(this.w, (am6) null);
    }

    public final void h(ll4 ll4) {
        zx4 zx4 = (zx4) ll4;
        zx4.K = this.w;
        am6 am6 = zx4.L;
        if (((zx4) am6.x) == zx4) {
            am6.x = null;
        }
        am6 am62 = new am6(18);
        zx4.L = am62;
        if (zx4.J) {
            am62.x = zx4;
            am62.y = null;
            zx4.M = null;
            am62.z = new kh(12, zx4);
            am62.A = zx4.J0();
        }
    }

    public final int hashCode() {
        return this.w.hashCode() * 31;
    }
}
