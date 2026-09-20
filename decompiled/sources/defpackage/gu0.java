package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgu0;", "Lpl4;", "Liu0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gu0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class gu0 extends pl4 {
    public final ap4 w;
    public final sr2 x;

    public gu0(sr2 sr2, ap4 ap4) {
        this.w = ap4;
        this.x = sr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gu0.class != obj.getClass()) {
            return false;
        }
        gu0 gu0 = (gu0) obj;
        if (sg3.e(this.w, gu0.w) && this.x == gu0.x) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new iu0(this.x, this.w);
    }

    public final void h(ll4 ll4) {
        boolean z;
        iu0 iu0 = (iu0) ll4;
        iu0.getClass();
        if (!iu0.R) {
            z = true;
        } else {
            z = false;
        }
        iu0.l1(this.w, (oa3) null, false, true, (String) null, (s86) null, this.x);
        if (z) {
            iu0.m1(false);
            iu0.m1(true);
        }
    }

    public final int hashCode() {
        int i;
        ap4 ap4 = this.w;
        if (ap4 != null) {
            i = ap4.hashCode();
        } else {
            i = 0;
        }
        return Boolean.hashCode(true) + ((this.x.hashCode() + hl6.i(hl6.i(i * 961, 31, false), 29791, true)) * 923521);
    }
}
