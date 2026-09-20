package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb52;", "Lpl4;", "Lm52;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: b52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class b52 extends pl4 {
    public final n52 A;
    public final x82 B;
    public final tr6 C;
    public final sr2 D;
    public final c52 E;
    public final mm7 w;
    public final bm7 x;
    public final bm7 y;
    public final bm7 z;

    public b52(mm7 mm7, bm7 bm7, bm7 bm72, bm7 bm73, n52 n52, x82 x82, tr6 tr6, sr2 sr2, c52 c52) {
        this.w = mm7;
        this.x = bm7;
        this.y = bm72;
        this.z = bm73;
        this.A = n52;
        this.B = x82;
        this.C = tr6;
        this.D = sr2;
        this.E = c52;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b52)) {
            return false;
        }
        b52 b52 = (b52) obj;
        if (!b52.w.equals(this.w) || !sg3.e(b52.x, this.x) || !sg3.e(b52.y, this.y) || !sg3.e(b52.z, this.z) || !b52.A.equals(this.A) || !sg3.e(b52.B, this.B) || b52.C != this.C || b52.D != this.D || !sg3.e(b52.E, this.E)) {
            return false;
        }
        return true;
    }

    public final ll4 g() {
        return new m52(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final void h(ll4 ll4) {
        m52 m52 = (m52) ll4;
        m52.L = this.w;
        m52.M = this.x;
        m52.N = this.y;
        m52.O = this.z;
        m52.P = this.A;
        m52.Q = this.B;
        m52.R = this.C;
        m52.S = this.D;
        m52.T = this.E;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.w.hashCode() * 31;
        int i3 = 0;
        bm7 bm7 = this.x;
        if (bm7 != null) {
            i = bm7.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        bm7 bm72 = this.y;
        if (bm72 != null) {
            i2 = bm72.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        bm7 bm73 = this.z;
        if (bm73 != null) {
            i3 = bm73.hashCode();
        }
        int hashCode2 = this.A.a.hashCode();
        int hashCode3 = this.B.a.hashCode();
        int hashCode4 = this.D.hashCode();
        return this.C.hashCode() + (this.E.hashCode() * 31) + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((i5 + i3) * 31)) * 31)) * 31)) * 31);
    }
}
