package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llz2;", "Lpl4;", "Lnz2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lz2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class lz2 extends pl4 {
    public final tg7 w;
    public final int x;
    public final int y;

    public lz2(tg7 tg7, int i, int i2) {
        this.w = tg7;
        this.x = i;
        this.y = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz2)) {
            return false;
        }
        lz2 lz2 = (lz2) obj;
        if (sg3.e(this.w, lz2.w) && this.x == lz2.x && this.y == lz2.y) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, nz2] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        ll4.M = this.y;
        ll4.O = -1;
        ll4.P = -1;
        return ll4;
    }

    public final void h(ll4 ll4) {
        nz2 nz2 = (nz2) ll4;
        tg7 tg7 = nz2.K;
        tg7 tg72 = this.w;
        boolean e = sg3.e(tg7, tg72);
        int i = this.x;
        int i2 = this.y;
        if (!e || nz2.L != i || nz2.M != i2) {
            nz2.K = tg72;
            nz2.L = i;
            nz2.M = i2;
            nz2.Q = aa5.k(tg72, rc9.O0(nz2).U);
            nz2.N = true;
            su0.B(nz2);
        }
    }

    public final int hashCode() {
        return (((this.w.hashCode() * 31) + this.x) * 31) + this.y;
    }
}
